package _06_inheritance.exercises.point_and_moveable_point;

public class MoveablePoint extends Point {

    private float xSpeed ;
    private float ySpeed ;

    public MoveablePoint(){

    }
    public MoveablePoint(float x, float y,float xSpeed , float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float getxSpeed(){
        return this.xSpeed;
    }

    public void setxSpeed (float xSpeed){
        this.xSpeed = xSpeed ;
    }

    public float getySpeed (){
        return this.ySpeed;
    }

    public void setySpeed (float ySpeed){
        this.ySpeed = ySpeed ;
    }

    public void setSpeed (float xSpeed ,float ySpeed){
        this.xSpeed = xSpeed ;
        this.ySpeed = ySpeed ;
    }

    public float[] getSpeed (){
        float[] Speed = {this.xSpeed , this.ySpeed};
        return Speed;
    }

    public MoveablePoint move(){
       float x = super.getX();
       float y = super.getY();
       x += this.xSpeed;
       y += this.ySpeed;
       setX(x);
       setY(y);
       return this;
    }
}
