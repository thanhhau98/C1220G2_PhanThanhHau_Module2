package _06_inheritance.exercises.point_and_moveable_point;

import java.util.Arrays;

public class Point {
    private float x ;
    private float y ;


    public Point(){

    }
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX (){
        return this.x;
    }

    public void setX (float x){
        this.x = x ;
    }

    public float getY (){
        return this.y;
    }

    public void setY (float y){
        this.y = y ;
    }

    public void setXY (float x , float y){
        this.x = x ;
        this.y = y ;
    }

    public float[] getXY (){
        float[] ArrayXY = {this.x , this.y};
        return ArrayXY;
    }

    @Override
    public String toString() {
        return Arrays.toString(getXY());
    }

}
