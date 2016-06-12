package com.company;

import java.util.List;

/**
 * Created by agnie on 6/9/2016.
 */
public class Graph<T> {

    private List<Vertex> vertices;
    private List<Edge> edges;

    public Graph() {
        vertices = null;
        edges = null;
    }

    public Graph(List<Vertex> vertices) {
        this.vertices = vertices;
    }

    public int getSize() {
        return vertices.size();
    }

    public void addVertex(T data) {
        Vertex newVertex = new Vertex(data);
        vertices.add(newVertex);
    }

    public void removeVertex(int index) {
        //todo
    }

    public void removeVertex(T data) {
        //todo
    }

    public void addEdge(int start, int end, int weight) {
        if (start > -1 && start < vertices.size() && end > start && end < vertices.size()) {
            Vertex startVertex = vertices.get(start);
            Vertex endVertex = vertices.get(end);
            addEdge(startVertex, endVertex, weight);
        } else {
            System.out.println("Invalid data");
        }
    }

    public void addEdge(int start, int end) {
        addEdge(start, end, 1);
    }

    public void addEdge(Vertex start, Vertex end, int weight) {
        Edge edge = new Edge(start, end, weight);
        edges.add(edge);
    }

    public void addEdge(Vertex start, Vertex end) {
        addEdge(start, end, 1);
    }

    public void printEdges() {
        for (Edge edge : edges) {
            System.out.println(edge);
        }
    }

    public void printVertices() {
        for (Vertex vertex : vertices) {
            System.out.println(vertex);
        }
    }

    public boolean contains(T data) {
        for (Vertex vertex : vertices) {
            if (vertex.getData() == data) {
                return true;
            }
        }
        return false;
    }


}
