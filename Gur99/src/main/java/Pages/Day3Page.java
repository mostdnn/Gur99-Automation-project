package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day3Page {


    public static WebElement addtocart(WebDriver driver){

        return driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[3]/button"));
    }
    public static WebElement QTY(WebDriver driver){

        return driver.findElement(By.xpath(".//*[@id='shopping-cart-table']/tbody/tr/td[4]/input"));
    }
    public static WebElement errormessage(WebDriver driver){

        return driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[2]/p"));
    }

    public static WebElement cartbutton(WebDriver driver){

        return driver.findElement(By.xpath(".//*[@id='empty_cart_button']"));
    }
    public static WebElement noItemsMsg(WebDriver driver){

        return  driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div/div[2]/p[1]"));
    }

}
