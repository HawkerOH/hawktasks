package com.learning;

import com.learning.model.Animal;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	private static ArrayList<Animal> animals;

	public static void main(String[] args) {
		generateListOfAnimals();
		sortAnimalsByWeight();
		validateSortedAnimalsByWeight();
	}

	private static void sortAnimalsByWeight() {
		// TODO write implementation in this method

		System.out.println("Before Sorting...");
		animals.forEach((e) -> System.out.println(e));

		System.out.println("After Sorting");
		Comparator<Animal> byWeight = (e1, e2) -> Integer.compare(e1.getWeight(), e2.getWeight());
		animals.stream().sorted(byWeight).forEach(e -> System.out.println(e));

		//Sort by Name
//    	System.out.println("Before Sorting...");
//       animals.forEach((e) -> System.out.println(e));
//    	
//    	Comparator <Animal> byName = (e1, e2) -> e1.getName().compareTo(e2.getName());
//    	System.out.println("After sorting");
//        animals.stream().sorted(byName).forEach(e -> System.out.println(e));

	}

	private static ArrayList<Animal> generateListOfAnimals() {
		animals = new ArrayList<>();

		animals.add(new Animal("Dog", 15));
		animals.add(new Animal("Hamster", 1));
		animals.add(new Animal("Whale", 5000));
		animals.add(new Animal("Bird", 3));
		animals.add(new Animal("Snake", 5));

		return animals;

	}

	private static void validateSortedAnimalsByWeight() {

		Assert.assertEquals("Hamster", animals.get(0).getName());
		Assert.assertEquals("Bird", animals.get(1).getName());
		Assert.assertEquals("Snake", animals.get(2).getName());
		Assert.assertEquals("Dog", animals.get(3).getName());
		Assert.assertEquals("Whale", animals.get(4).getName());

		System.out.println("Animals are successfully sorted, well done!");

		// Collections.sort(animals, Collections.reverseOrder());

	}
}
