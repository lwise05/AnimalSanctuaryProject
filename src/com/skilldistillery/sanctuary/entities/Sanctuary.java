package com.skilldistillery.sanctuary.entities;

public class Sanctuary {
	
	private Attendant attendant = new Attendant();
	private Animal[] animals = new Animal[5];

	{
		animals[0] = new DesertRainFrog();
		animals[0].setName("Rudy");
		animals[1] = new Gecko();
		animals[1].setName("Vinny");
		animals[2] = new Crocodile();
		animals[2].setName("Boogie");
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
			} 
			else {
				System.out.println(i + ": " + animals[i]);
			}
		}
	}
	
	public void addAnimal(Animal animal) {
		for (int i = 0; i < animals.length; i++) {
			if (isFull()) {
//				System.out.println("All the enclosures are full! Unable to add more animals to the sanctuary.");
				break;
			}
			if (animals[i] == null) {
				animals[i] = animal;	
				break;
			}
	}
	}
	
	public boolean isFull() {
		  for(int i = 0; i < animals.length; i++){
		    if(animals[i] == null) {
		        return false;
		    }
		  }
		  return true;
		}
	
//	public void checkAnimal() { trying to figure out how to return sysout stating array is full
//		
//	}

	public void startAttendantRounds() {
		this.attendant.makeRounds(animals);
	}
}
