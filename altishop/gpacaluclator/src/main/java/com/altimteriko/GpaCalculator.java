package com.altimteriko;

public class GpaCalculator { //System Under Test
    public float calcuateGpa(int score){//Method Under Test
        if(score<=0){
            throw new InvalidScoreException();
        }
        return score/100*10;
    }
    public int add(int a,int b){
        return a+b;
    }
}
