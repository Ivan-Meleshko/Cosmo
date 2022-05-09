package ru.skillfactory;

import java.util.Scanner;

public class Essence {

	MyWindow mywindow;
	Boolean isOn = true;
	char x;
	

	public Essence() {
		
		while (isOn) {
		System.out.println("Find out the Day tribe and the Ascension tribe of the number. Enter the number.");
		
		Scanner scan = new Scanner(System.in);
		boolean hasInt = scan.hasNextInt();
		
		if (hasInt) {
		int k = scan.nextInt();
		if (k <= 0) {
			System.out.println("The number must be positive!");		
		} else {
			System.out.printf("Number %d: Day tribe number is %s. Ascension tribe is %s.", k,
					MyWindow.calculateTribe(k), MyWindow.calculateAscensionTribe(k));
			System.out.println();
		System.out.println("Press 'x' to exit, any key for another run.");
		x = scan.next().charAt(0); 
		if (x == 'x') {
			System.out.println("Goodbye.");
			isOn = false;
			System.exit(0);
			scan.close();
		}
		}
		} else if (!hasInt) {
			String b = scan.next(); // заглушка
			System.out.println("Error! Not a number...");
		}
			
		}
			
	}
			
		
		
				
		
		
	
}
