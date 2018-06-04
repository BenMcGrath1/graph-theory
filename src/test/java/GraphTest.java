import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void make_a_vertex() {
        Vertex city = new Vertex("Chicago");
        String expectedCityName = "Chicago";
        assertEquals(expectedCityName, city.getCityName());
    }

    @Test
    public void make_an_edge() {
        Vertex city = new Vertex("Chicago");
        Vertex city2 = new Vertex("New York");
        Edge route = new Edge(city, city2);

        String expectedDestination = "New York";
        assertEquals(expectedDestination, route.getEnd().getCityName());
    }
    @Test
    public void make_a_graph() {
        ArrayList<Vertex> cities = new ArrayList<>();
        ArrayList<Edge> routes = new ArrayList<>();
        Vertex city = new Vertex("Chicago");
        Vertex city2 = new Vertex("New York");
        Vertex city3 = new Vertex("Providence");
        cities.add(city);
        cities.add(city2);
        cities.add(city3);
        Edge route = new Edge(city, city2);
        Edge route2 = new Edge(city2, city3);
        Edge route3 = new Edge(city, city2);
        routes.add(route);
        routes.add(route2);
        routes.add(route3);

        Graph graph = new Graph(cities, routes);

        String expectedResult = "Providence";
        assertEquals(expectedResult, graph.getEdges().get(1).getEnd().getCityName());
    }
    @Test
    public void make_the_real_graph() {
        ArrayList<Vertex> cities = new ArrayList<>();
        Vertex sea = new Vertex("Seattle");
        Vertex den = new Vertex("Denver");
        Vertex chi = new Vertex("Chicago");
        Vertex sd = new Vertex("San Diego");
        Vertex det = new Vertex("Detroit");
        Vertex minn = new Vertex("Minneapolis");
        Vertex bos = new Vertex("Boston");
        Vertex atl = new Vertex("Atlanta");
        cities.add(sea); cities.add(den); cities.add(chi); cities.add(sd); cities.add(det); cities.add(minn); cities.add(bos); cities.add(atl);

        ArrayList<Edge> routes = new ArrayList<>();
        Edge one = new Edge(chi, den);
        Edge two = new Edge(sea, den);
        Edge three = new Edge(chi, det);
        Edge four = new Edge(chi, atl);
        Edge five = new Edge(det, minn);
        Edge six = new Edge(det, bos);
        Edge seven = new Edge(bos, atl);
        routes.add(one); routes.add(two); routes.add(three); routes.add(four); routes.add(five); routes.add(six); routes.add(seven);
        Graph cityGraph = new Graph(cities, routes);

        System.out.println(cityGraph.getNumberOfVertices());
    }
}
