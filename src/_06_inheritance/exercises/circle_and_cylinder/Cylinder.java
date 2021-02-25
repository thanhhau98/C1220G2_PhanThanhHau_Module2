package _06_inheritance.exercises.circle_and_cylinder;

public class Cylinder extends Circle {
 private double height =5;
 public Cylinder(){
 }
public Cylinder(double radius, double height,String color){
     super(radius,color);
     this.height = height;
}

public double getHeight(){
     return height;
}

public void setHeight(double height){
     this.height=height;
}

public double getVolume(){
     return super.getRadius() * super.getRadius() * Math.PI*height;
}

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                +" and is "
                + getColor()
                + ", which is a subclass of "
                + super.toString();
    }
}
