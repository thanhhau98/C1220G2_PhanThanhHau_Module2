package _04_class_object_java.exercises;
public class FanClass {
    static final int SLOW=1;
    static final int MEDIUM=2;
    static final int FAST=3;
    static final String COLOR_BLUE="blue";
    public static final int SPEED_DEFAULT = SLOW;
    public static final double RADIUS_DEFAULT=5;
    public static final boolean ON_DEFAULT=false;
    private  int speed;
    boolean on;
    private  double radius;
    private  String color;

    public FanClass() {
        this.color = COLOR_BLUE;
        this.speed = SPEED_DEFAULT;
        this.radius= RADIUS_DEFAULT;
        this.on=ON_DEFAULT;
    }

    public FanClass(double radius, String color, int speed, boolean on){
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
