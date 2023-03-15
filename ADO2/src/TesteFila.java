import javax.swing.*;

public class TesteFila {
    public static void main(String[] args) {

        boolean atendimento=true;
        int idade=0;
        Fila<Integer> fila= new Fila<Integer>();

        do{
            int escolha=Integer.parseInt(JOptionPane.showInputDialog("[1]Pegar comanda\n[2]atender comanda\n[3]terminar serviço"));
            switch (escolha){

                case 1:
                    idade=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do doador"));
                    fila.enfileira(Integer.parseInt(JOptionPane.showInputDialog("Crie o numero da comanda")));
                    break;
                case 2:
                    fila.desenfileira();
                    break;
                case 3:
                    atendimento=false;
                    break;
                default:
                    System.out.println("Comando incorreto");
                    break;
            }
            fila.toString();
        }while (atendimento);

    }
}
