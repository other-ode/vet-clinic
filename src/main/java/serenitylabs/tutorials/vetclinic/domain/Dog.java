package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class Dog {
    private final String name;
    private final String breed;
    private final LocalDateTime dateOfBirth;
    private final String favFood;
    private final String toy;

    public Dog(String name, String breed, LocalDateTime dateOfBirth, String favFood, String toy) {
        this.name = name;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
        this.favFood = favFood;
        this.toy = toy;
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

    public String getToy() {
        return toy;
    }

    // New Dog Builder Class
    public static WithBreed called(String name){
        return new DogBuilder(name);
    }

    interface WithBreed {
        DogBuilder ofBreed(String breed);
    }

    public static class DogBuilder implements WithBreed {

        private String name;
        private String breed;
        private LocalDateTime dateOfBirth;
        private LocalDateTime birthday;
        private String favFood;
        private String toy;

        public DogBuilder(String name) {
            this.name = name;
        }

        public DogBuilder ofBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public DogBuilder withOptionalFavFood(String favFood) {
            this.favFood = favFood;
            return this;
        }
        public Dog withDateOfBirth(LocalDateTime dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return new Dog(name,breed,dateOfBirth,favFood,toy);
        }

        public DogBuilder withOptionalFavToy(String toy) {
            this.toy = toy;
            return this;
        }
    }
}
