package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day4Page {
    public static WebElement addtocompare1(WebDriver driver){

        return driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[3]/ul/li[2]/a"));
    }

    public static WebElement addtocompare2(WebDriver driver){

        return driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a"));
    }
    public static WebElement comparebutton(WebDriver driver){

        return driver.findElement(By.xpath("//button[@title='Compare']"));
    }

    public static WebElement closepopup(WebDriver driver){

        return driver.findElement(By.xpath("//button[@title='Close Window']"));
    }
}
