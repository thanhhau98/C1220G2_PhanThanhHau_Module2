package _12_java_collection_framework.exercises.product_arraylist_linkedlist.linkedlist;


import _12_java_collection_framework.exercises.product_arraylist_linkedlist.araylist.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductManager extends _12_java_collection_framework.exercises.product_arraylist_linkedlist.araylist.Product {

    public void add(String product, List<String> arrayList) {
        arrayList.add(product);
    }

    public void remove(String product, List<String> arrayList) {
        arrayList.remove(product);
    }

    public void chance(int index, String product, List<String> arrayList) {
        arrayList.set(index, product);
    }

    public void display(List<String> arrayList) {
        System.out.println(arrayList);
    }

    public void sort(double price, List<String> arrayList) {
        arrayList.sort(String::compareTo);
    }


    public ProductManager(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public static void main(String[] args) {
        _12_java_collection_framework.exercises.product_arraylist_linkedlist.araylist.Product product1 = new ProductManager(1, "Meat", 5.5);
        _12_java_collection_framework.exercises.product_arraylist_linkedlist.araylist.Product product2 = new ProductManager(2, "Pen", 1.5);
        List<_12_java_collection_framework.exercises.product_arraylist_linkedlist.araylist.Product> arrayList = new ArrayList<>();
        arrayList.add(product1);
        arrayList.add(product2);
        for (_12_java_collection_framework.exercises.product_arraylist_linkedlist.araylist.Product product : arrayList) {
            System.out.println(product);
        }
        arrayList.remove("Meat");
        for (Product product : arrayList) {
            System.out.println(product);
        }
    }
}

