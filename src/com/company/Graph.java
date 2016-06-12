package com.company;

import java.util.ArrayList;

/**
 * Created by agnie on 6/9/2016.
 */
public class Graph<T> {

    private ArrayList<Vertex> vertices;
    private ArrayList<Edge> edges;

    public Graph() {
        vertices = new ArrayList<Vertex>();
        edges = new ArrayList<Edge>();
    }

    public Graph(ArrayList<Vertex> vertices) {
        this.vertices = vertices;
    }

    public int getSize() {
        return vertices.size();
    }

    public void addVertex(T data) {
        if (!contains(data)) {
            Vertex newVertex = new Vertex(data);
            vertices.add(newVertex);
        } else {
            System.out.println("The graph already contains such vertex");
        }
    }

    public void removeVertex(int index) {
        if (index > -1 && index < vertices.size()) {
            Vertex vertex = vertices.get(index);
            vertices.remove(index);
            //mopping up the orphaned edges
            removeEdges(vertex);
        } else {
            System.out.println("Invalid index");
        }
    }

    public void removeVertex(T data) {
        Vertex vertex = search(data);
        if (vertex != null) {
            vertices.remove(vertex);
            //mopping up the orphaned edges
            removeEdges(vertex);
        } else {
            System.out.println("Such element doesn't exist in the graph");
        }
    }

    public void addEdge(int start, int end, int weight) {
        if (isValidEdge(start, end)) {
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

    public void removeEdge(Vertex start, Vertex end) {
        Edge edge = search(start, end);
        if (edge != null) {
            edges.remove(edge);
        } else {
            System.out.println("No such edges");
        }
    }

    public void removeEdge(int start, int end) {
        if (isValidEdge(start, end)) {
            Vertex startVertex = vertices.get(start);
            Vertex endVertex = vertices.get(end);
            removeEdge(start, end);
        } else {
            System.out.println("Invalid data");
        }
    }

    private void removeEdges(Vertex vertex) {
        for (Edge edge : edges) {
            if (edge.contains(vertex)) {
                edges.remove(edge);
            }
        }
    }

    public void printEdges() {
        if (edges != null) {
            for (Edge edge : edges) {
                System.out.println(edge);
            }
        } else {
            System.out.println("Graph has no edges");
        }
    }

    public void printVertices() {
        if (vertices != null) {
            for (Vertex vertex : vertices) {
                System.out.println(vertex);
            }
        } else {
            System.out.println("Graph is empty");
        }
    }

    public boolean contains(T data) {
        if (vertices != null) {
            for (Vertex vertex : vertices) {
                if (vertex.getData() == data) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean contains(Vertex start, Vertex end) {
        if (edges != null) {
            for (Edge edge : edges) {
                if (edge.contains(start) && edge.contains(end)) {
                    return true;
                }
            }
        }
        return false;
    }

    private Vertex search(T data) {
        if (vertices != null) {
            for (Vertex vertex : vertices) {
                if (vertex.getData() == data) {
                    return vertex;
                }
            }
        }
        return null;
    }

    private Edge search(Vertex start, Vertex end) {
        if (edges != null) {
            for (Edge edge : edges) {
                if (edge.contains(start) && edge.contains(end)) {
                    return edge;
                }
            }
        }
        return null;
    }

    private boolean isValidEdge(int start, int end) {
        if (start > -1 && start < edges.size()) {
            if (end > -1 && end < edges.size()) {
                if (end != start) {
                    return true;
                }
            }
        }
        return false;
    }

}
