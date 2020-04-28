package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class WhenCreatingANewDog {
    @Test
    public void it_should_have_a_name() throws Exception{
        Dog devii = new Dog();
        LocalDateTime birthday = LocalDateTime.now();

        devii.setName("Devii");
        devii.setBreed("Staffie");
        devii.setDateOfBirth(birthday);

        Assert.assertEquals("Devii",devii.getName());
        Assert.assertEquals("Staffie",devii.getBreed());
        Assert.assertEquals(birthday,devii.getDateOfBirth());
    }
}
