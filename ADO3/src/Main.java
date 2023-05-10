public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");

        graph.addVertex(a);
        graph.addVertex(b);
        graph.addVertex(c);
        graph.addVertex(d);
        graph.addVertex(e);

        graph.addEdge(a, b, 2);
        graph.addEdge(a, e, 1);
        graph.addEdge(b, e, 2);
        graph.addEdge(b, c, 1);
        graph.addEdge(c, b, 2);
        graph.addEdge(c, d, 1);
        graph.addEdge(d, e, 2);
        graph.addEdge(d, c, 1);



        graph.breadthFirstSearch(a);
    }
}