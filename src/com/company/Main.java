package com.company;

public class Main {

    public static void presentGraph() {
        Graph<Integer> graph = new Graph<Integer>();
        graph.addVertex(3);
        graph.addVertex(5);
        graph.printVertices();
    }

    public static void main(String[] args) {
        presentGraph();
    }
}
