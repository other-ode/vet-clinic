package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class WhenCreatingANewDog {
    @Test
    public void it_should_have_a_name() throws Exception{

        LocalDateTime birthday = LocalDateTime.now();
        Dog devii = Dog.called("Devii")
                        .ofBreed("Labrador")
                        .withDateOfBirth(birthday);

        Assert.assertEquals("Devii",devii.getName());
        Assert.assertEquals("Labrador",devii.getBreed());
        Assert.assertEquals(birthday,devii.getDateOfBirth());
    }

    @Test
    public void it_should_have_an_optional_fav_food() throws Exception{
        LocalDateTime birthday = LocalDateTime.now();
        Dog devii = Dog.called("Devii")
                .ofBreed("Labrador")
                .withOptionalFavFood("pizza")
                .withDateOfBirth(birthday);

        Assert.assertEquals("pizza",devii.getFavFood());
    }

    @Test
    public void a_dog_can_have_an_optional_favourite_toy(){
        LocalDateTime birthday = LocalDateTime.now();
        Dog devii = Dog.called("Devii")
                .ofBreed("Labrador")
                .withOptionalFavToy("Bonex")
                .withDateOfBirth(birthday);

        Assert.assertEquals("Bonex",devii.getToy());

    }
}
