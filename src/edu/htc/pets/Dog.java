package edu.htc.pets;


/**
 * Created by mary mosman on 2/1/16.
 *
 * Simple Cat class.
 *
 * Cats have a name and age.
 * There is also a function to calculate their human age.
 */
public class Cat extends Pet {

    public Cat(String name){
        super(name);
    }

    public double getHumanAge() {
        double humanAge = 0;

        if (getAge() == 1) {
            humanAge = 15;
        } else if (getAge() == 2) {
            humanAge = 25;
        } else {
            // first two years, gets you 25 human years
            humanAge = 25;

            // every other year after is 4 human years
            humanAge += 4 * (getAge()-2);
        }

        return humanAge;
    }


}
