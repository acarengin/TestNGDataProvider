package org.testng.arrays;

import org.testng.annotations.Test;

public class MultiDimenrionalArray {

	@Test
	public void AnimalsArray() {
		String[][] animals = new String[4][2];
		animals[0][0] = "Cat";
		animals[0][1] = "Myaww";
		animals[1][0] = "Dog";
		animals[1][1] = "Woof";
		animals[2][0] = "Cow";
		animals[2][1] = "Moo";
		animals[3][0] = "Sheep";
		animals[3][1] = "Baa";

		// System.out.println("Neighbor's" + animals[1][0] + " is saying" +
		// animals[1][1]);
		// System.out.println(animals[0][0] + " do not " + animals[3][1]);

		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i][0] + " is " + animals[i][1] + " ing ");
		}
	}

	@Test
	public void objectArray() {
		/**
		 * Due to Polymorphism. We can have a variable with a reference type of parent
		 * class and actual object of any child classes Animal animal=new Cat(); Object
		 * > all other classes. public class AnyClass extends Object
		 **/
		Object[][] employees = new Object[3][2];
		employees[0][0] = "Mike";
		employees[0][1] = "mike@gmail.com";
		employees[1][0] = "Steven";
		employees[1][1] = "steven@gmail.com";
		employees[2][0] = "Sarah";
		employees[2][1] = "sarah@gmail.com";

		// print last element of last array
		System.out.println(employees[employees.length - 1][employees[employees.length - 1].length - 1]);

		printEmpInfo(employees);
	}

	public void printEmpInfo(Object[][] multiDArray) {
		for (int i = 0; i < multiDArray.length; i++) {
			System.out.println(multiDArray[i][0] + "," + multiDArray[i][1]);
		}
	}
}
