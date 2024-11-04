package com.skilldistillery.sanctuary.entities;

public class DesertRainFrog extends Animal {
	private static String noise = "Squeak!";
	
	public DesertRainFrog() {	
	} 
	
	

	@Override
	public void makeNoise() {
		System.out.print(noise);
	}
	
	@Override
	public void eat(int amount) {
		int food = amount;
		makeNoise();
		System.out.println(" I love eating these " + food + " moths.");
		System.out.println();
	}
	@Override
	public String toString() {
		return this.getName() + " the Desert Rain Frog";
	}

}
