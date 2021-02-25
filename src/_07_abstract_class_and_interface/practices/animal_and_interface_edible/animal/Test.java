package _07_abstract_class_and_interface.practices.animal_and_interface_edible.animal;

import _07_abstract_class_and_interface.practices.animal_and_interface_edible.interface_edible.Edible;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            animal.makeSound();
            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
    public static class Chicken extends Animal implements Edible {
        @Override
        public String makeSound() {
            return "Chicken: cluck-cluck!";
        }

        @Override
        public String howToEat() {
            return "could be fried";
        }
    }
}