package com.skilldistillery.sanctuary.entities;

public class Gecko extends Animal {
	private static String noise;

	@Override
	public void makeNoise() {
		System.out.println("Chirp!");
	}
	
	@Override
	public void eat(int amount) {
		int food = 0;
		System.out.println("Chirps! I love eating these " + food + " crickets.");
	}

}
