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
        grafo.adicionarVertice("F");
        grafo.adicionarVertice("G");
        grafo.adicionarVertice("H");
        grafo.adicionarVertice("J");
        grafo.adicionarVertice("K");


        grafo.adicionarAresta(300.0,"A","B");
        grafo.adicionarAresta(300.0,"B","A");

        grafo.adicionarAresta(47.0,"B","C");
        grafo.adicionarAresta(47.0,"C","B");

        grafo.adicionarAresta(62.0,"C","D");
        grafo.adicionarAresta(62.0,"D","C");

        grafo.adicionarAresta(8.0,"D","E");
        grafo.adicionarAresta(8.0,"E","D");

        grafo.adicionarAresta(13.0,"E","F");
        grafo.adicionarAresta(13.0,"F","E");

        grafo.adicionarAresta(230.0,"E","G");
        grafo.adicionarAresta(230.0,"G","E");

        grafo.adicionarAresta(141.0,"C","H");
        grafo.adicionarAresta(141.0,"H","C");

        


        while(JOptionPane.showConfirmDialog(null,"Deseja ver uma rota?")!=1){
            partida=JOptionPane.showInputDialog("Digite o ponto de partida");
            chegada=JOptionPane.showInputDialog("Digite o ponto de chegada");

            System.out.println(grafo.encontrarCaminho(partida,chegada));
        }


    }
}