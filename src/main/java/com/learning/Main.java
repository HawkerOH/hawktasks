package com.learning;

import com.learning.model.Animal;
import org.junit.Assert;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Animal> animals;

    public static void main(String[] args) {
        generateListOfAnimals();
        sortAnimalsByWeight();
        validateSortedAnimalsByWeight();
    }

    private static void sortAnimalsByWeight() {
        // TODO write implementation in this method
    }

    private static void generateListOfAnimals() {
        animals = new ArrayList<>();
        animals.add(new Animal("Dog", 15));
        animals.add(new Animal("Hamster", 1));
        animals.add(new Animal("Whale", 5000));
        animals.add(new Animal("Bird", 3));
        animals.add(new Animal("Snake", 5));
    }

    private static void validateSortedAnimalsByWeight() {
        Assert.assertEquals("Hamster", animals.get(0).getName());
        Assert.assertEquals("Bird", animals.get(1).getName());
        Assert.assertEquals("Snake", animals.get(2).getName());
        Assert.assertEquals("Dog", animals.get(3).getName());
        Assert.assertEquals("Whale", animals.get(4).getName());
    }
}
