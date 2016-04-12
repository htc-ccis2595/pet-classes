package edu.htc.pets;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by volkg_000 on 3/7/2016.
 */

public class CatTest {

    @Test
    public void getHumanAge_catISONE() {
        Cat cat = new Cat("Bart");
        cat.setAge(1);
        double result = cat.getHumanAge();
        assertEquals(15, result, 0.01); //expected result, var name, leway for floating point nums
        assertEquals("Bart", cat.getName());
    }
    @Test
    public void getHumanAge_catISTWO() {
        Cat cat = new Cat("Bart");
        cat.setAge(2);
        double result = cat.getHumanAge();
        assertEquals(25, result, 0.01); //expected result, var name, leway for floating point nums
        assertEquals("Bart", cat.getName());
    }
    @Test
    public void getHumanAge_catISTHREE() {
        Cat cat = new Cat("Bart");
        cat.setAge(3);
        double result = cat.getHumanAge();
        assertEquals(29, result, 0.01); //expected result, var name, leway for floating point nums
        assertEquals("Bart", cat.getName());
    }
}
