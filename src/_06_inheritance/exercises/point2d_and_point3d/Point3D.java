package _06_inheritance.exercises.point2d_and_point3d;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z ;

    public Point3D(){

    }
    public Point3D( float x, float y, float z ){
        super(x , y);
        this.z = z;
    }

    public float getZ(){
        return this.z;
    }

    public void setZ (float z){
        this.z = z ;
    }
    public void setXYZ (float x , float y,float z){
        this.z = z ;
        super.setX(x);
        super.setY(y);
    }

    public float[] getXYZ (){
        float[] ArrayXYZ = {super.getX(),super.getY(), this.z};
        return ArrayXYZ;
    }

    @Override
    public String toString() {
        return Arrays.toString(getXYZ());
    }
}
