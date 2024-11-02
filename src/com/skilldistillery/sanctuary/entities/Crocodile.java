package com.skilldistillery.sanctuary.entities;

public class Crocodile extends Animal{
	private static String noise;

	@Override
	public void makeNoise() {
		System.out.println("Growl!");
	}
	
	@Override
	public void eat(int amount) {
		int food = 0;
		System.out.println("Growl! I love eating these" + food + " birds.");
	}


}
