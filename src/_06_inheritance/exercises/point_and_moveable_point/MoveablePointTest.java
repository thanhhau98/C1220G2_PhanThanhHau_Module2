package _06_inheritance.exercises.point_and_moveable_point;

import _06_inheritance.exercises.point2d_and_point3d.Point2D;

public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        moveablePoint.move();
        System.out.println(moveablePoint);

         moveablePoint = new MoveablePoint(5, 3);
         moveablePoint.move();
        System.out.println(moveablePoint);

    }
}
