package edu.htc.pets;

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



        // Code question 1.  Nameless cat works fine
        Cat nameless = new Cat();
        System.out.println();
        System.out.println("Nameless Cat's name: " + nameless.getName());


        // Create the dogs
        Dog[] myDogs = new Dog[3];

        Dog dog = new Dog("Argos");
        dog.setAge(12);
        myDogs[0] = dog;

        dog = new Dog("Garm");
        dog.setAge(1);
        myDogs[1] = dog;

        dog = new Dog("Ein");
        dog.setAge(2);
        myDogs[2] = dog;

        // Code question 2.  Nameless dog is a compile error - name needed for constructor
        //Dog namelessDog = new Dog();


        // Print the dog info
        System.out.println();
        System.out.println("Showing the dog info...");

        for (Dog current : myDogs) //FOR EACH LOOP
        {
            System.out.println("Dog " + current.getName() + " is " + current.getAge() + " which is " + current.getHumanAge());
        }


        //Code Question 3 - Put a dog in the Cat[] - compile error, incompatible types
        //myCats[0] = dog;

        //Code Question 4 - Print a cat & dog
        System.out.println();
        System.out.println("Printing a cat, which has a toString function to print pretty: " + cat);
        System.out.println("Printing a dog, which does not have a toString function: " + dog);
        System.out.println();


        //New array of 6 pets
        System.out.println("Printing Pets:");
        Pet[] myPets = new Pet[6];
        myPets[0] = myCats[0];
        myPets[1] = myCats[1];
        myPets[2] = myCats[2];

        myPets[3] = myDogs[0];
        myPets[4] = myDogs[1];
        myPets[5] = myDogs[2];

        for (Pet current : myPets) //FOR EACH LOOP
        {
            System.out.println("Pet:  " + current.getName() + " is " + current.getAge()
                    + " which is " + current.getHumanAge() + " human years.");
        }

        //Generic Pet
        //Pet pet1 = new Pet("Pet1");
        //System.out.println(pet1);
        //Cannot make an instance of abstract class
    }
}
