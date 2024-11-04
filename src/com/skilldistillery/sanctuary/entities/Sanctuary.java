package com.skilldistillery.sanctuary.entities;

public class Sanctuary {
	
	private Attendant attendant = new Attendant();
	private Animal[] animals = new Animal[5];

	{
		animals[0] = new DesertRainFrog();
		animals[0].setName("froggy");
		animals[1] = new Gecko();
		animals[1].setName("franny");
		animals[2] = new Crocodile();
		animals[2].setName("greg");
		animals[3] = null;
		animals[4] = null;

	}
	
	public Sanctuary(){

	} 
	
	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}

	public void listAnimals() {
		for (int i = 0; i < animals.length; i++) {

			if (animals[i] == null) {
				System.out.println(i + ": This enclosure is empty");
			} else {
				System.out.println(i + ": " + animals[i]);
			}
		}
	}
	
	public void addAnimal(Animal animal) {
//		boolean canAddAnimal = 
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] == null) {
				animals[i] = animal;	
				break;
			}
	}
	}
	
//	public void checkAnimal() { trying to figure out how to return sysout stating array is full
//		
//	}

	public void startAttendantRounds() {
		this.attendant.makeRounds(animals);
	}
}
