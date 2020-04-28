package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class Cat {
    private String name;
    private String breed;
    private LocalDateTime dateOfBirth;

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
}
