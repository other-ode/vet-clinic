package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class Dog {
    private final String name;
    private final String breed;
    private final LocalDateTime dateOfBirth;
    private final String favFood;

    public Dog(String name, String breed, LocalDateTime dateOfBirth) {
        this.name = name;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
        this.favFood = null;
    }
    public Dog(String name, String breed, LocalDateTime dateOfBirth, String favFood) {
        this.name = name;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
        this.favFood = favFood;
    }
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFavFood() {
        return favFood;
    }
}
