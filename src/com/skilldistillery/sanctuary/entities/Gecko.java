package com.skilldistillery.sanctuary.entities;

public class Gecko extends Animal {
	private static String noise = "Chirp!";
	
	public Gecko() {
	}

	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	
	@Override
	public void eat(int amount) {
		int food = 0;
		System.out.println(noise + " I love eating these " + food + " crickets.");
	}
	@Override
	public String toString() {
		return "I'm " + this.getName() + " the Gecko";
	
	}

}
