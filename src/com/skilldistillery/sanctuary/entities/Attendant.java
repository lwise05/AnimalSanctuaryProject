package com.skilldistillery.sanctuary.entities;

public class Attendant { 
		
	public Attendant() {

	}

	public void makeRounds(Animal[] animals) {
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] == null) {
				System.out.println("This enclosure is empty. Let's check the next enclosure.");
				System.out.println();
			} else {
				System.out.println("Time to feed " + animals[i]);
				animals[i].eat((int)(Math.random() *10 )+1 );
			}
		}
		System.out.println("They're all fed, now it's time for a break!");
	}
	
}
