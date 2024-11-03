package com.skilldistillery.sanctuary.entities;

public class Crocodile extends Animal{
	private static String noise = "Roar!";
	
	public Crocodile() {
	}

	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	
	@Override
	public void eat(int amount) {
		int food = 0;
		System.out.println(noise + " I love eating these" + food + " birds.");
	}

	@Override
	public String toString() {
		return "I'm " + this.getName() + " the Crocodile";
		
	}


}
