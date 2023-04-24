import java.util.*;

public class Vertex {
    private String name;
    private List<Edge> edges;
    private boolean visited;

    public Vertex(String name) {
        this.name = name;
        edges = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addEdge(Vertex to, int weight) {
        edges.add(new Edge(this, to, weight));
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}