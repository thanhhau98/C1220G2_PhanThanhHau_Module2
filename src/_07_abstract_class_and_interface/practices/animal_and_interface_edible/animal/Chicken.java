package _07_abstract_class_and_interface.practices.animal_and_interface_edible.animal;


import _07_abstract_class_and_interface.practices.animal_and_interface_edible.animal.Animal;

public class Chicken extends Animal {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
}
