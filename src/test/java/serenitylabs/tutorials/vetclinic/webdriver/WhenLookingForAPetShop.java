package serenitylabs.tutorials.vetclinic.webdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class WhenLookingForAPetShop {
    @Test
    public void find_pet_shop_using_search(){

        System.setProperty("webdriver.chrome.driver", "C:/Users/dev-research/Documents/Serenity-Dojo/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.navigate().to("https://duckduckgo.com/");
        //driver.get("https://duckduckgo.com/");

        WebElement search_box = driver.findElement(By.id("search_form_input_homepage"));
        search_box.sendKeys("pet shops");

        WebElement search_btn = driver.findElement(By.id("search_button_homepage"));
        search_btn.click();

        assertThat(driver.getTitle(), equalTo("pet shops at DuckDuckGo"));

        driver.quit();

    }
}
