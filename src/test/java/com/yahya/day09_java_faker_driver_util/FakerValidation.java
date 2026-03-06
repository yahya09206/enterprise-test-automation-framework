package com.yahya.day09_java_faker_driver_util;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class FakerValidation {

    @Test
    public void fakerOne(){

        // Create Java Faker object
        Faker faker = new Faker();

        System.out.println("faker.name().firstName() = " + faker.name().firstName());

        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));

        System.out.println("faker.gameOfThrones().quote() = " + faker.gameOfThrones().quote());
    }
}
