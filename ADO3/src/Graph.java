import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {
    private List<Vertex> vertices;
    private List<Edge> edges;

    public Graph() {
        vertices = new ArrayList<>();
        edges = new ArrayList<>();
    }

    public void addVertex(Vertex vertex) {
        vertices.add(vertex);
    }

    public void addEdge(Vertex from, Vertex to, int weight) {
        from.addEdge(to, weight);
        edges.add(new Edge(from, to, weight));
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void breadthFirstSearch(Vertex start) {
        Queue<Vertex> queue = new LinkedList<>();
        start.setVisited(true);
        queue.add(start);

        while (!queue.isEmpty()) {
            Vertex current = queue.remove();
            System.out.print(current.getName() + " ");

            for (Edge edge : current.getEdges()) {
                Vertex adjacent = edge.getTo();
                if (!adjacent.isVisited()) {
                    adjacent.setVisited(true);
                    queue.add(adjacent);
                }
            }
        }

        for (Vertex vertex : vertices) {
            vertex.setVisited(false);
        }
    }
}