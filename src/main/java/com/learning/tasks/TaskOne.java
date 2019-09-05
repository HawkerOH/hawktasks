package com.learning.tasks;

import com.learning.model.Animal;
import org.junit.Assert;

import java.util.ArrayList;

public class TaskOne {

    private static ArrayList<Animal> animals;

    public TaskOne() {
        generateListOfAnimals();
        sortAnimalsByWeight();
        validateSortedAnimalsByWeight();
    }

    private void sortAnimalsByWeight() {
        // TODO write implementation in this method
    }

    private void generateListOfAnimals() {
        animals = new ArrayList<>();
        animals.add(new Animal("Dog", 15));
        animals.add(new Animal("Hamster", 1));
        animals.add(new Animal("Whale", 5000));
        animals.add(new Animal("Bird", 3));
        animals.add(new Animal("Snake", 5));
    }

    private void validateSortedAnimalsByWeight() {
        Assert.assertEquals("Hamster", animals.get(0).getName());
        Assert.assertEquals("Bird", animals.get(1).getName());
        Assert.assertEquals("Snake", animals.get(2).getName());
        Assert.assertEquals("Dog", animals.get(3).getName());
        Assert.assertEquals("Whale", animals.get(4).getName());

        System.out.println("Animals are successfully sorted, well done!");
    }

}
