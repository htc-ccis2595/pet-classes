package edu.htc.pets;

/**
 * Created by cheey on 2/29/2016.
 */
public class Turtle extends Pet implements Audible{

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
            humanAge = 25;
            humanAge += 4 * (getAge() - 2);
        }

        return humanAge;
    }

    public void makeSound(){
        System.out.println("Bloop, bloop.");
    }


}
