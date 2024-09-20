package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day2Page {



    public static WebElement mobileicon(WebDriver driver){

        return driver.findElement(By.linkText("MOBILE"));
    }

    public static WebElement priceofsony(WebDriver driver){

        return driver.findElement(By.id("product-price-1"));
    }
    public static WebElement sonyimage(WebDriver driver){

        return driver.findElement(By.id("product-collection-image-1"));
    }

}
