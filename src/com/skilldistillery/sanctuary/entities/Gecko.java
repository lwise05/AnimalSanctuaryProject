package com.skilldistillery.sanctuary.entities;

public class Gecko extends Animal {
	private static String noise = "Chirp!";
	
	public Gecko() {
	} 

	@Override
	public void makeNoise() {
		System.out.print(noise);
	}
	
	@Override
	public void eat(int amount) {
		int food = amount;
		makeNoise();
		System.out.println(" I love eating these " + food + " crickets.");
		System.out.println();
	}
	@Override
	public String toString() {
		return this.getName() + " the Gecko";
	
	}

}
