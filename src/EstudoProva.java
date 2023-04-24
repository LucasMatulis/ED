import javax.swing.*;

public class EstudoProva {
    public static void main(String[] args) {

        String vetor[]= new String[5];

        vetor[0]="L";
        vetor[1]="U";
        vetor[2]="C";
        vetor[3]="A";
        vetor[4]="S";



        int n= Integer.parseInt(JOptionPane.showInputDialog("Digite a posição q quer retirar"));

        for (int i=n;i<vetor.length-1;i++){
            vetor[i]=vetor[i+1];
        }

        for (int i=0;i<vetor.length;i++){
           if(vetor[i]!=null)
                System.out.println(vetor[i]);
        }




    }
}
