package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day5Page {

    public static WebElement accounticon(WebDriver driver){

        return driver.findElement(By.linkText("MY ACCOUNT"));
    }
    public static WebElement createaccount(WebDriver driver){

        return driver.findElement(By.linkText("CREATE AN ACCOUNT"));
    }

    public static WebElement firstname(WebDriver driver){

        return driver.findElement(By.id("firstname"));
    }

    public static WebElement lasttname(WebDriver driver){

        return driver.findElement(By.id("lastname"));
    }
    public static WebElement emailaddress(WebDriver driver){

        return driver.findElement(By.id("email_address"));
    }
    public static WebElement password(WebDriver driver){

        return driver.findElement(By.id("password"));
    }
    public static WebElement confirmpassword(WebDriver driver){

        return driver.findElement(By.id("confirmation"));
    }
    public static WebElement registerbutton(WebDriver driver){

        return driver.findElement(By.xpath("//button[@title='Register']"));
    }
    public static WebElement messageafterregistration(WebDriver driver){

        return driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div/ul/li/ul/li/span"));
    }
    public static WebElement Tvicon(WebDriver driver){

        return driver.findElement(By.xpath(".//*[@id='nav']/ol/li[2]/a"));
    }
    public static WebElement addtowishlist(WebDriver driver){

        return driver.findElement(By.xpath("//li/a[@class='link-wishlist']"));
    }
    public static WebElement sharewishlist(WebDriver driver){

        return driver.findElement(By.xpath("//button[@title='Share Wishlist']"));
    }
    public static WebElement emailtextfield(WebDriver driver){

        return driver.findElement(By.id("email_address"));
    }
    public static WebElement messagetextfield(WebDriver driver){

        return driver.findElement(By.id("message"));
    }
    public static WebElement wishlistmessage(WebDriver driver){

        return driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div/div[1]/ul/li/ul/li/span"));
    }

}
