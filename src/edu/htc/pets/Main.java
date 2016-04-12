package edu.htc.pets;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<Pet>();

        //ask the user to enter information for a pet
        System.out.println("Do you want to add a cat or a dog?");
        String petType = scanner.next();
        while (!petType.equalsIgnoreCase("cat") && !petType.equalsIgnoreCase("Dog")) {

            System.out.println("Sorry, you must enter either cat or dog.");
            System.out.println("Do you want to add a cat or dog?");
            petType = scanner.next();
        }
        //get the pets name
        System.out.println("What should the pet's name be?");
        String name = scanner.next();

        int age = 0;
        while (age < 1) {
            System.out.println("What should the pet's age be?");
            try {
                age = Integer.parseInt(scanner.next());
            } catch (NumberFormatException exc) {
                System.out.println("Enter a number you dingus!!");
            }

        }
        if (petType.equalsIgnoreCase("Cat")) {
            Cat cat = new Cat(name);
            pets.add(cat);
        } else if(petType.equalsIgnoreCase("Dog")) {
            Dog dog = new Dog(name);
            pets.add(dog);
        }


        }
    }


