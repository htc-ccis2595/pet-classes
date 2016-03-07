package edu.htc.pets;
import edu.htc.pets.*;

/**
 * Created by Student on 2/22/2016.
 */
public abstract class  Pet {

    private int age;
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: " + getName();
    }

    public abstract double getHumanAge();


    public static void main(String[] blah){
        Pet pet = new Pet("Name") {

            public double getHumanAge(){
                return 0;
            }

        };

        String name = pet.getName();
        if ( ! name.equals("Name")){
            System.out.println("Something went wrong in my constructor");
        }

    }
}
