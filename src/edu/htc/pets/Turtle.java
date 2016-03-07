package edu.htc.pets;
import edu.htc.pets.*;

/**
 * Created by Sam on 3/7/2016.
 */
public class Turtle extends Pet {
    public Turtle(String name) {
        super(name);
    }

    public double getHumanAge() {
        double humanAge = 0;

        if (getAge() <= 1) humanAge = getAge()*15;
        else if (getAge() >1 && getAge() <2) humanAge = getAge() * 25;
        else humanAge = (getAge()-2) * 4 + 25;
        return humanAge;
    }
}
