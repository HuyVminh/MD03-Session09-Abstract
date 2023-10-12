package Demo;

import Demo.ra.model.Animal;
import Demo.ra.model.impl.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeNoise();
        Animal doggo=new Dog();
        dog.makeNoise();
    }
}