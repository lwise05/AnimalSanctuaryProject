package com.skilldistillery.sanctuary.entities;

public class DesertRainFrog extends Animal {
	private static String noise;
	

	@Override
	public void makeNoise() {
		System.out.println("Squeak!");
	}
	
	@Override
	public void eat(int amount) {
		int food = 0;
		System.out.println("I love eating these " + food + " moths.");
	}

}
