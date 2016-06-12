package com.company;

public class Main {

    public static void presentGraph() {
        Graph<Integer> graph = new Graph<Integer>();
        System.out.println("Adding vertex: 3");
        graph.addVertex(3);
        graph.printGraph();
        System.out.println();
        System.out.println("Adding vertex: 5");
        graph.addVertex(5);
        graph.printGraph();
        System.out.println();
        System.out.println("Adding edge between first and second vertex");
        graph.addEdge(0, 1);
        graph.printGraph();
        System.out.println();
        System.out.println("Adding vertex: 2");
        graph.addVertex(2);
        graph.printGraph();
        System.out.println();
        System.out.println("Adding vertex: 1");
        graph.addVertex(1);
        graph.printGraph();
        System.out.println();
        System.out.println("Adding edge between first and third vertex with weight 4");
        graph.addEdge(0, 2, 4);
        graph.printGraph();
        System.out.println();
        System.out.println("Adding edge between second and fourth vertex with weight 3");
        graph.addEdge(1, 3, 3);
        graph.printGraph();
        System.out.println();
        System.out.println("Removing vertex :3");
        graph.removeVertex(0);
        graph.printGraph();
        System.out.println();
        System.out.println("Adding vertex: 8");
        graph.addVertex(8);
        graph.printGraph();
        System.out.println();
        System.out.println("Adding edge between first and fourth vertex with weight 2");
        graph.addEdge(0, 3, 2);
        graph.printGraph();
        System.out.println();
        System.out.println("Adding edge between second and third vertex");
        graph.addEdge(1, 2);
        graph.printGraph();
        System.out.println();
        System.out.println("Removing edge between first and fourth vertex");
        graph.removeEdge(0,3);
        graph.printGraph();
    }

    public static void main(String[] args) {
        presentGraph();
    }
}
