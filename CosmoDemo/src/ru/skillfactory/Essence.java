package ru.skillfactory;

import java.util.Scanner;

public class Essence {

	MyWindow mywindow;

	public Essence() {

		System.out.println("Find out the Day tribe and the Ascension tribe of the number. Enter the number...");

		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();

		if (k <= 0) {
			System.out.println("Please, enter the correct number!");
		} else {
			System.out.printf("Number %d: Day tribe number is %s. Ascension tribe is %s.", k,
					MyWindow.calculateTribe(k), MyWindow.calculateAscensionTribe(k));
		}
	}

}
