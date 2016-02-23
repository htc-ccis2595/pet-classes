/**
 * Created by cheey on 2/22/2016.
 */
package edu.htc.pets;
public abstract class Pet //ABSTRACT CLASS
{

    private String name;
    private int age;

    public Pet(String name)
    {
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

    public String toString() {
        return "Name: " + getName();
    }

    public abstract double getHumanAge();
}
