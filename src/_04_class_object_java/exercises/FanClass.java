package _04_class_object_java.exercises;
public class FanClass {
    static final int SLOW=1;
    static final int MEDIUM=2;
    static final int FAST=3;
    private int speed=SLOW ;
    boolean on=false;
    private double radius=5;
    private String color = "blue";
    public FanClass(double radius,String color,int speed,boolean on){
        this.color=color;
        this.radius=radius;
        this.speed=speed;
        this.on = on;
    }
    public String toString(){
        if (this.on){
            return "Speed: "+this.speed+"\n"+
                    "Color: "+this.color+"\n"+
                    "Radius: "+this.radius+"\n"+
                    "fan is on";
        }else {
            return
                    "Color: "+this.color+"\n"+
                    "Radius: "+this.radius+"\n"+
                    "fan is off";
        }
    }
    public static void main(String[] args) {
        FanClass fan1 = new FanClass(10,"yellow",FAST,true);
        FanClass fan2 = new FanClass(5,"blue",MEDIUM,false);
        System.out.println("Information Fan1 :");
        System.out.println(fan1.toString());
        System.out.println("Information Fan2 :");
        System.out.println(fan2.toString());
    }
}
