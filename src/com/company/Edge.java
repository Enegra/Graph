package com.company;

/**
 * Created by agnie on 6/9/2016.
 */
public class Edge {

    private Vertex start;
    private Vertex end;
    private int weight;

    public Edge(Vertex start, Vertex end){
        this.start=start;
        this.end=end;
        weight = 1;
    }

    public Edge(Vertex start, Vertex end, int weight){
        this.start=start;
        this.end=end;
        this.weight=weight;
    }

    public int getWeight(){
        return weight;
    }

    public Vertex getStart(){
        return start;
    }

    public Vertex getEnd(){
        return end;
    }

    @Override
    public String toString(){
        return "START: " + start + "END: " + end + "WEIGHT: " + weight;
    }

    public boolean contains(Vertex vertex){
        return (vertex==start || vertex==end);
    }

}
