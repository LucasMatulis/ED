import javax.swing.*;

public class temperatura {
    public static void main(String[] args) {
        double []temperatura= new double[7];
        double tempTotal=0;
        int diaMenor=0;
        int diaMaior=0;

        for (int i=0;i<temperatura.length;i++){

            temperatura[i]= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da temperatura "+(i+1)));
            tempTotal+=temperatura[i];
        }

        tempTotal=tempTotal/temperatura.length;

        for (int i=0;i<temperatura.length;i++){

            if(temperatura[i]<=tempTotal){
                diaMenor++;
            } else if (temperatura[i]>=tempTotal) {
                diaMaior++;
            }


        }

        System.out.println("A media da temperatura é: "+tempTotal+"\nOs dias onde a temperatura foi menor que a media foram: "+diaMenor+"\nOs dias onde a temperatura foi maior que a media foram: "+diaMaior);


    }
}
