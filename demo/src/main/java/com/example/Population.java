package com.example;

import java.util.HashMap;
import java.util.Map;

public class Population {

    Map<String,Integer> maplist=new HashMap<>();
    
    public void add(String city, int population){

        maplist.put(city, population);
    }

    public int countPopulation(String city){

        if(maplist.isEmpty()){
            throw new NullPointerException("list is Empty");
        }
        if(!maplist.containsKey(city)){
            
            throw new NullPointerException("Inavalid Input");
        }

        return maplist.get(city);
    }
}
