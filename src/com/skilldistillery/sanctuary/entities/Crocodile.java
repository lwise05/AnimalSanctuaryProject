package com.skilldistillery.sanctuary.entities;

public class Crocodile extends Animal{ 
	private static String noise = "Roar!";
	
	public Crocodile() {
	}

	@Override
	public void makeNoise() {
		System.out.print(noise);
	}
	
	@Override
	public void eat(int amount) {
		int food = amount;
		makeNoise();
		System.out.println(" I love eating these " + food + " birds.");
		System.out.println();
	}

	@Override
	public String toString() {
		return this.getName() + " the Crocodile";
		
	}


}
