package com.skilldistillery.sanctuary.app;

import java.util.Scanner;

import com.skilldistillery.sanctuary.entities.Animal;
import com.skilldistillery.sanctuary.entities.Crocodile;
import com.skilldistillery.sanctuary.entities.DesertRainFrog;
import com.skilldistillery.sanctuary.entities.Gecko;
import com.skilldistillery.sanctuary.entities.Sanctuary;

public class AnimalSanctuaryApp {

	Sanctuary sanc;
	Scanner sc;

	public static void main(String[] args) {
		AnimalSanctuaryApp app = new AnimalSanctuaryApp();
		app.sanc = new Sanctuary();
		app.sc = new Scanner(System.in);
		
		app.launchApp();
		app.sc.close();
	}

	private void launchApp() {

		System.out.println("Welcome to the Animal Sanctuary!");

		int userChoice;
		do {
			System.out.println("");
			System.out.println("Please choose from the following menu choices: ");
			System.out.println("");
			printMenu();
			userChoice = this.sc.nextInt();

			switch (userChoice) {
				case 1:
					sanc.listAnimals();
					break;
				case 2:
					System.out.println("Please choose what kind of animal you'd like to add to the sancturacy: ");
					animalMenu(); // print animal menu
					int animalChoice = this.sc.nextInt();
					Animal newAnimal;
					String name;
					switch(animalChoice) {
						case 1:
							Animal frog = new DesertRainFrog();
							System.out.println("What would you like to name the desert rain frog?");
							name = sc.next();
							frog.setName(name);
							sanc.addAnimal(frog);
							break;
						case 2: 
							Animal gecko = new Gecko();
							System.out.println("What would you like to name the gecko?");
							name = sc.next();
							gecko.setName(name);
							sanc.addAnimal(gecko);
							break;
						case 3:
							Animal croc = new Crocodile();
							System.out.println("What would you like to name the crocodile?");
							name = sc.next();
							croc.setName(name);
							sanc.addAnimal(croc);
							break;
						default:
								System.out.println("Oops! You entered an invalid entry. Returning back to the main menu.");
								break;
					}
					break;
				case 3:
					sanc.startAttendantRounds();
					break;
				case 4:
					System.out.println("Thank you for visiting the Animal Sancturay! Bye!");
					sc.close();
					break;
				default:
					System.out.println("Oops! You entered an invalid choice. Please choose 1 - 4. ");
				}
		} while (userChoice != 4);

	}

	private void printMenu() {
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("*\t\t\t\t Would you like to...                   *");
		System.out.println("*                                                                       *");
		System.out.println("*\t 1. See what all animals are currently in the sanctuary.        *");
		System.out.println("*\t 2. Add an animal to the sanctuary.                             *");
		System.out.println("*\t 3. Have the sanctuary attendant feed all the animals.          *");
		System.out.println("*\t 4. Exit the game.                                              *");
		System.out.println("-------------------------------------------------------------------------");
	}

	public void animalMenu() {
		System.out.println("1. Desert Rain Frog");
		System.out.println("2. Gecko");
		System.out.println("3. Crocodile");
	}
}

