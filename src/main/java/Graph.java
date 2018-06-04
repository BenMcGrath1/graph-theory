
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


class Vertex {
    private String cityName;

    public Vertex(String name) {
        this.cityName = name;
    }
    public String getCityName() {
        return cityName;
    }
}

class Edge {
    private Vertex start;
    private Vertex end;

    public Edge(Vertex start, Vertex end) {
        this.start = start;
        this.end = end;
    }

    public Vertex getEnd() {
        return end;
    }

    public Vertex getStart() {
        return start;
    }
}

public class Graph {

    private List<Vertex> vertices;
    private List<Edge> edges;
    private int numberOfVertices;
    private LinkedList<Integer> adjListArray[];

    public Graph(List<Vertex> vertices, List<Edge> edges) {
        this.vertices = vertices;
        this.edges = edges;
        this.numberOfVertices = vertices.size();
        adjListArray = new LinkedList[numberOfVertices];

        for(int i = 0; i < numberOfVertices; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }

    public static void addEdge(Graph graph, int origin, int destination) {
            graph.adjListArray[origin].addFirst(destination);
            graph.adjListArray[destination].addFirst(origin);
    }



    public int getNumberOfVertices() {
        return numberOfVertices;
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public List<Edge> getEdges() {
        return edges;
    }


//    public static void main(String args[]) {
//        Graph graph = new Graph();
//    }

}
