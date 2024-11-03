package com.skilldistillery.sanctuary.entities;

public class DesertRainFrog extends Animal {
	private static String noise = "Squeak!";
	
	public DesertRainFrog() {	
	}
	
	

	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	
	@Override
	public void eat(int amount) {
		int food = 0;
		System.out.println(noise + " I love eating these " + food + " moths.");
	}
	@Override
	public String toString() {
		return "I'm " + this.getName() + " the Desert Rain Frog";
	}

}
