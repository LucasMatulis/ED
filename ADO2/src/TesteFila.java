import javax.swing.*;

public class TesteFila {
    public static void main(String[] args) {

        boolean atendimento=true;
        int preferencial=0;
        int idoso=0;
        Fila<Integer> fila= new Fila<Integer>();

        do{
            int escolha=Integer.parseInt(JOptionPane.showInputDialog("[1]Pegar comanda\n[2]atender comanda\n[3]terminar serviço"));
            switch (escolha) {

                case 1:
                    preferencial = JOptionPane.showConfirmDialog(null,"Você é preferencial?");
                    if (preferencial == 0) {
                        fila.preferencia(idoso, Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da comanda")));
                        idoso++;
                    } else
                        fila.enfileira(Integer.parseInt(JOptionPane.showInputDialog("Crie o numero da comanda")));
                    break;
                case 2:
                    fila.desenfileira();
                    if(idoso>0)
                        idoso--;
                    break;
                case 3:
                    atendimento = false;
                    break;
                default:
                    System.out.println("Comando incorreto");
                    break;
            }
            System.out.println(fila.toString());
        }while (atendimento);


    }
}
