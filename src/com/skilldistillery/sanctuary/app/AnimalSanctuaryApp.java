package com.skilldistillery.sanctuary.app;

import java.util.Scanner;

import com.skilldistillery.sanctuary.entities.Animal;
import com.skilldistillery.sanctuary.entities.Crocodile;
import com.skilldistillery.sanctuary.entities.DesertRainFrog;
import com.skilldistillery.sanctuary.entities.Gecko;
import com.skilldistillery.sanctuary.entities.Sanctuary;

public class AnimalSanctuaryApp {

	Sanctuary sanc = new Sanctuary();
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		AnimalSanctuaryApp app = new AnimalSanctuaryApp();
		app.launchApp();
	}

	private void launchApp() {

		System.out.println("Welcome to the Animal Sanctuary!");

		int userChoice;
		do {
			System.out.println("");
			System.out.println("Please choose from the following menu choices: ");
			System.out.println("");
			printMenu();
			userChoice = sc.nextInt();

			switch (userChoice) {

			case 1:
				sanc.listAnimals();
				break;
				
			case 2:
				System.out.println("Please choose what kind of animal you'd like to add to the sancturacy: ");
				animalMenu(); // print animal menu
				Animal newAnimal = returnAnimal(); // returnAnimal allows user to 
				sanc.addAnimal(newAnimal); // still trying to figure out how to add animalchoice() input into addAnimal
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
//		System.out.println("4. Return to Menu");

		
		// get useranimalchoice method
	}

	public Animal returnAnimal() { 
		boolean keepGoing = true;
		Animal userAnimalChoice = new Animal(); //initializes new animal variable
		while (keepGoing) {
			int animalChoice = sc.nextInt();
			String name; // initializes name variable 
			
			switch (animalChoice) {
			case 1:
				System.out.println("Nice! Let's add your desert rain frog to an enclosure.");
				userAnimalChoice = new DesertRainFrog(); // create new frog
				System.out.println("What would you like to name the desert rain frog?");
				name = sc.next();
				userAnimalChoice.setName(name); //calls setName method then adds user's new name to animal
				keepGoing = false; // once false, stops switch
				break;
			case 2:
				System.out.println("Great choice! Let's add your gecko to an enclosure.");
				userAnimalChoice = new Gecko();
				System.out.println("What would you like to name the gecko?");
				name = sc.next();
				userAnimalChoice.setName(name);
				keepGoing = false;
				break;
			case 3:
				System.out.println("I like it! Let's add your crocodile to an enclosure.");
				userAnimalChoice = new Crocodile();
				System.out.println("What would you like to name the crocodile?");
				name = sc.next();
				userAnimalChoice.setName(name);
				keepGoing = false;
				break;
//			case 4:
//				keepGoing = false;
//				break;
			default:
				System.out.println("Oops! You entered an invalid choice. Choose from 1-4.");
			}
		}
		return userAnimalChoice;
	}
	

}
