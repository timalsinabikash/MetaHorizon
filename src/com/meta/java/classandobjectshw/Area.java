package com.meta.java.classandobjectshw;

public class Area {

    int length;
    int breadth;



    public void setDim(int length, int breadth){
        this.length= length;
        this.breadth= breadth;

    }

    public int  getArea(){
        int area= breadth*length;
        return area;

    }
}
