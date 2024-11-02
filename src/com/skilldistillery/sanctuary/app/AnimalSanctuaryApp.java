package com.skilldistillery.sanctuary.app;

import java.util.Scanner;

import com.skilldistillery.sanctuary.entities.Attendant;
import com.skilldistillery.sanctuary.entities.Sanctuary;

public class AnimalSanctuaryApp {

	Sanctuary sanc = new Sanctuary();
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		AnimalSanctuaryApp sanctuary = new AnimalSanctuaryApp();
		sanctuary.launchApp();

	}

	private void launchApp() {

		System.out.println("Welcome to the Animal Sanctuary!");

		int userChoice;
		do {
			System.out.println("Please choose from the following menu choices: ");
			printMenu();
			userChoice = sc.nextInt();

			switch (userChoice) {

			case 1:
				sanc.listAnimals();
				break;
			case 2:
				System.out.println("Please choose what kind of animal you'd like to add to the sancturacy: ");
				animalChoices();

//				sanc.addAnimal(animal); // still trying to figure out how to add animalchoice() input into addAnimal

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
		System.out.println("\t Would you like to... \t");
		System.out.println("1. Meet the animals. See what all animals are currently in the sanctuary.");
		System.out.println("2. Add an animal to the sanctuary.");
		System.out.println("3. Have the sanctuary attendant feed all the animals.");
		System.out.println("4. Exit the game.");
	}

	public void animalChoices() {
		int animalChoice = sc.nextInt();

		System.out.println("1. Desert Rain Frog");
		System.out.println("2. Gecko");
		System.out.println("3. Crocodile");
		System.out.println("4. Return to Menu");

		do {

			switch (animalChoice) {
			case 1:
				System.out.println("Nice! Let's add your desert rain frog to an enclosure.");
//				sanc.addAnimal();
				break;
			case 2:
				System.out.println("Great choice! Let's add your gecko to an enclosure.");
				break;
			case 3:
				System.out.println("I like it! Let's add your crocodile to an enclosure.");
				break;
			case 4:
				System.out.println("Return to menu.");
				break;
			default:
				System.out.println("Oops! You ");

			}
		} while (animalChoice != 4);

	}
}
