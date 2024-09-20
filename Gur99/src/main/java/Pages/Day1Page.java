package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day1Page {


    public WebElement userid(WebDriver driver){

        return driver.findElement(By.name("uid"));
    }

    public WebElement password(WebDriver driver){

        return driver.findElement(By.name("password"));
    }
    public WebElement loginbutton(WebDriver driver){

        return driver.findElement(By.name("btnLogin"));

    }
}



