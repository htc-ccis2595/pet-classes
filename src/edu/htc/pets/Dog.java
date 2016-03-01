package edu.htc.pets;

/**
 * Created by marymosman on 2/1/16.
 */
public class Dog extends Pet {

    private String trickName;

    public Dog(String name){
        super(name);
    }

    public String getTrickName() {
        return trickName;
    }

    public void setTrickName(String trickName) {
        this.trickName = trickName;
    }

    public double getHumanAge() {
        double humanAge = 0;

        if (getAge() <= 2){
            humanAge = getAge() * 10.5;
        } else {
            // first two years, gets you 21 human years
            humanAge = 21;

            // every other year after is 4 human years
            humanAge += 4 * (getAge()-2);
        }

        return humanAge;
    }
}
