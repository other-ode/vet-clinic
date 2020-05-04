package serenitylabs.tutorials.vetclinic;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class WhenLookingForAPetShop {
    @Test
    public void find_pet_shop_using_search(){

        WebDriver firefox = new FirefoxDriver();

        firefox.get("https://duckduckgo.com/");

        firefox.findElement(By.id("search_form_input_homepage")).sendKeys("pet shops");
        firefox.findElement(By.id("search_button_homepage")).click();

        assertThat(firefox.getTitle(), equalTo("pet shops at DuckDuckGo"));

        firefox.close();

    }
}
