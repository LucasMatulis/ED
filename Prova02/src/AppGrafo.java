import javax.swing.*;

public class AppGrafo {
    public static void main(String[] args) {

        String partida,chegada;

        GPS<String> grafo= new GPS<>();
        grafo.adicionarVertice("A");
        grafo.adicionarVertice("B");
        grafo.adicionarVertice("C");
        grafo.adicionarVertice("D");
        grafo.adicionarVertice("E");

        grafo.adicionarAresta(2.0,"A","B");
        grafo.adicionarAresta(2.0,"B","A");


        grafo.adicionarAresta(1.0,"C","D");
        grafo.adicionarAresta(1.0,"D","C");


        while(JOptionPane.showConfirmDialog(null,"Deseja ver uma rota?")!=1){
            partida=JOptionPane.showInputDialog("Digite o ponto de partida");
            chegada=JOptionPane.showInputDialog("Digite o ponto de chegada");

            System.out.println(grafo.encontrarCaminho(partida,chegada));
        }


    }
}