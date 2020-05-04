package serenitylabs.tutorials.vetclinic.webdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class WhenAddingANewToDoItem {

    @Test
    public void should_add_new_item_to_list() {

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://todomvc.com/examples/angularjs/#/");

        WebElement inputField = driver.findElement(By.id("new-todo"));
        inputField.sendKeys("Buy some milk");
        inputField.sendKeys(Keys.RETURN);

        WebElement todoListContent = driver.findElement(By.id("todo-list"));
        assertThat(todoListContent.getText(), containsString("Buy some milk"));

        driver.quit();
    }

}
