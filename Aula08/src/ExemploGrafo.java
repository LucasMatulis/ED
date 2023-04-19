public class ExemploGrafo {
    public static void main(String[] args) {
        Grafo<String> grafo= new Grafo<String>();

        grafo.adicionarVertice("Paulo");
        grafo.adicionarVertice("Lorenzo");
        grafo.adicionarVertice("Cleuza");
        grafo.adicionarVertice("Kleber");
        grafo.adicionarVertice("Claudio");

        grafo.adicionarAresta(2.0,"Paulo","Lorenzo");
        grafo.adicionarAresta(3.0,"Lorenzo","Cleuza");
        grafo.adicionarAresta(1.0,"Cleuza","Kleber");
        grafo.adicionarAresta(1.0,"Cleuza","Claudio");
        grafo.adicionarAresta(2.0,"Claudio","Lorenzo");

        grafo.BuscaEmLargura();
    }
}
