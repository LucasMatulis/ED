public class AppGrafo {
    public static void main(String[] args) {

        GPS<String> grafo= new GPS<>();
        grafo.adicionarVertice("A");
        grafo.adicionarVertice("B");
        grafo.adicionarVertice("C");
        grafo.adicionarVertice("D");
        grafo.adicionarVertice("E");

        grafo.adicionarAresta(2.0,"A","B");
        grafo.adicionarAresta(3.0,"A","C");
        grafo.adicionarAresta(1.0,"C","D");
        grafo.adicionarAresta(1.0,"B","D");




        System.out.println(grafo.encontrarCaminho("A","D"));
        System.out.println(grafo.encontrarOutroCaminho("A","D"));
    }
}