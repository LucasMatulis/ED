import javax.swing.*;
import java.util.Arrays;

public class TesteAlunos {
    public static void main(String[] args) throws Exception{
        int n=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos"));
        double notas[]=new double[n];
        Alunos alunos= new Alunos(n);

        for (int i=0;i<n;i++) {

            try {
                alunos.adiciona(JOptionPane.showInputDialog("Digite o nome "+(1+i)+"° aluno(a)"));


            } catch (Exception e) {
                e.printStackTrace();

            }
            do {

                notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do " + (i + 1) + "° aluno(a)"));

            }while (notas[i]<0);
        }

        System.out.println(alunos.tamanho());
        System.out.println(alunos.toString());

        for (int i=0;i<n;i++){

            System.out.print("|"+notas[i]+"|\t");


        }

        System.out.println("\nOs alunos reprovados são: ");

        for (int i=0;i<n;i++){

            if(notas[i]<6)

            System.out.print(alunos.busca(i)+"\n");


        }

        System.out.println("\nOs alunos aprovados são: ");

        for (int i=0;i<n;i++){

            if(notas[i]>=6)

                System.out.print(alunos.busca(i)+"\n");


        }

    }
}

