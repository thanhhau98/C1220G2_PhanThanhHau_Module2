package _10_dsa_list.exercises.array_list;


import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Double> listDouble = new MyList<Double>();

        listDouble.add(5.5);
        listDouble.add(6.95);
        listDouble.add(5.32);
        listDouble.add(7.5);
        listDouble.add(8.5);
        listDouble.add(20.5);
        System.out.println(listDouble);
        System.out.println(listDouble.contains(7.5));
        System.out.println(listDouble.indexOf(7.5));
        listDouble.remove(3);
        System.out.println("New array after remove index of 3 "+listDouble);
    }
}
