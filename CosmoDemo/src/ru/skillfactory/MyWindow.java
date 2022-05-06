package ru.skillfactory;

import java.util.Scanner;

import javax.swing.JFrame;

public class MyWindow  {
	
	Essence essence;
	
	public MyWindow(Essence essence) {
		this.essence = essence;
		//setBounds(300, 300, 500, 500);
	}

	public static String calculateTribe(int i) {
		int j = i % 7; // tribe
		switch (j) { 
			case 0: return "Sunday";
			
			case 1: return "Monday";
			
			case (2) : return "Tuesday";
			
			case (3) : return "Wednesday";
			
			case (4) : return "Thursday";
			
			case (5) : return "Friday";
			
			case (6) : return "Saturday";
			
			default: return "invalid data";
			
		}
	}
					
		
	public static String calculateAscensionTribe(int i) {
		int rankNumber = i / 7;
		int rankNumberSupport = i % 7;
		int ascension = rankNumber + 1;
		if (rankNumberSupport == 0) {
			ascension = rankNumber;
		}
		int ascensiontribe = ascension % 7;
		
		switch (ascensiontribe) {
		case (0) : return "Sunday";
		
		case (1) : return "Monday";
		
		case (2) : return "Tuesday";
		
		case (3) : return "Wednesday";
		
		case (4) : return "Thursday";
		
		case (5) : return "Friday";
		
		case (6) : return "Saturday";
		
		default: return "invalid data";
		
	}
		
	}
}



