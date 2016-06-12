package com.company;

import java.util.List;

/**
 * Created by agnie on 6/9/2016.
 */
public class Vertex<T> {

    private T data;

    public Vertex(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }

    @Override
    public String toString(){
        return "VERTEX: " + data.toString();
    }

}
