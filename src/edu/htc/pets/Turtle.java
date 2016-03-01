package edu.htc.pets;

/**
 * Created by Prince Roka on 2/29/2016.
 */
public class Turtle extends Pet {

    public Turtle(String name){
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
