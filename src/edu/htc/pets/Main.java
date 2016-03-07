package edu.htc.pets;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Create the cats
        Cat[] myCats = new Cat[3];

        Cat cat = new Cat("Jennyanydots");
        cat.setAge(1);
        myCats[0] = cat;

        cat = new Cat("Rum Tum Tugger");
        cat.setAge(2);
        myCats[1] = cat;

        cat = new Cat("Deuteronomy");
        cat.setAge(20);
        myCats[2] = cat;

        // Print the cat info
        System.out.println("Showing the cat info...");

        for (int i=0; i<myCats.length; i++) {
            Cat current = myCats[i];
            System.out.println("Cat " + current.getName() + " is " + current.getAge() + " which is " + current.getHumanAge());
        }

        // Create the dogs
        Dog[] myDogs = new Dog[3];

        Dog dog = new Dog("Argos");
        dog.setAge(12);
        myDogs[0] = dog;

        dog = new Dog("Garm");
        dog.setAge(1);
        myDogs[1] = dog;

        dog = new Dog("Ein");
        dog.setTrickName("Fetch");
        dog.setAge(2);
        myDogs[2] = dog;


        // Print the dog info
        System.out.println();
        System.out.println("Showing the dog info...");

        for (Dog current : myDogs) {
            System.out.println("Dog " + current.getName() + " is " + current.getAge() + " which is " + current.getHumanAge());
        }


        //Create Turtles
        Turtle[] myTurtles = new Turtle[3];

        Turtle turtle = new Turtle("Lucy");
        turtle.setAge(1);
        myTurtles[0] = turtle;

        turtle = new Turtle("Leo");
        turtle.setAge(2);
        myTurtles[1] = turtle;

        turtle = new Turtle("Ninja");
        turtle.setAge(20);
        myTurtles[2] = turtle;

        // Print the turtle info
        System.out.println();
        System.out.println("Showing the turtle info...");

        for (int i=0; i<myTurtles.length; i++) {
            Turtle current = myTurtles[i];
            System.out.println("Turtle " + current.getName() + " is " + current.getAge() + " which is " + current.getHumanAge());
        }


        // New Stuff
        System.out.println();
        System.out.println("Printing all the pets and their sounds: ");
        Pet[] myPets = new Pet[9];
        myPets[0] = myCats[0];
        myPets[1] = myCats[1];
        myPets[2] = myCats[2];
        myPets[3] = myDogs[0];
        myPets[4] = myDogs[1];
        myPets[5] = myDogs[2];
        myPets[6] = myTurtles[0];
        myPets[7] = myTurtles[1];
        myPets[8] = myTurtles[2];

        for (Pet current : myPets) {
            System.out.println("Pet " + current.getName() + " is " + current.getAge() + " which is " + current.getHumanAge() + " human years.");

            //If I'm a dog, print my trick
            if (current instanceof Dog){
                Dog curDog = (Dog)current;
                curDog.getTrickName();
            }

            if (current instanceof Audible){
                Audible curPet = (Audible)current;
                curPet.makeSound();
            }

            //This causes an error when we hit our first Dog object - always check using instanceof before casting
            //Cat curCat = (Cat)current;

        }


        //Put the Pets into an ArrayList of Pets
        ArrayList<Pet> petList = new ArrayList<Pet>();
        for (Pet myPet : myPets){
            petList.add(myPet);
        }

        //Put the Pets into an ArrayList of Objects (not Pet)
        ArrayList list = new ArrayList();
        for (Pet myPet : myPets){
            list.add(myPet);
        }

        //Now what happens when we take things out?
        Pet anotherPet = petList.get(0);

        //Java won't let me do this, the object might not be a Pet
        //Pet yetAnotherPet = list.get(0);

        // But if I am sure that it is really a Pet I can cast it to a Pet object
        Pet yetAnotherPet = (Pet)list.get(0);


    }
}

