package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class WhenCreatingANewCat {
    @Test
    public void a_cat_has_a_name() throws Exception{
        Cat jj = new Cat();

        LocalDateTime birthday = LocalDateTime.now();

        jj.setName("JJ");
        jj.setBreed("Just Don't Know");
        jj.setDateOfBirth(birthday);

        Assert.assertEquals("JJ", jj.getName());
        Assert.assertEquals("Just Don't Know", jj.getBreed());
        Assert.assertEquals(birthday,jj.getDateOfBirth());

    }
}
