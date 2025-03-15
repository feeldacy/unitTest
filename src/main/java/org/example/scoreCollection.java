package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class scoreCollection {

    ArrayList<Integer> scores;

    public scoreCollection(){
        this.scores = new ArrayList<Integer>();
    }

    public void addScore(Integer score){
        this.scores.add(score);
    }

    public double averageScore(){
        double total = 0;

        for (int i=0; i<this.scores.size(); i++){
            total += this.scores.get(i);
        }

        return total/this.scores.size();
    }
}
