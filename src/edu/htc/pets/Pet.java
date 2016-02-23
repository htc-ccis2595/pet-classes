package edu.htc.pets;

/**
 * Created by KenN on 2/22/16.
 */
public abstract class Pet {
    private String name;
    private int age;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract double getHumanAge();


    public static void main(String[] args) {
        Pet pet = new Pet("Name") {
            public double getHumanAge() {

                return 0;
            }
        };
                String name = pet.getName();
        if (!name.equals("Name")){
            System.out.println("Somthing wrong is constructor");
        }
    }
}
