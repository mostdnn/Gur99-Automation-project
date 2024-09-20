package Testcases;

import Pages.Day2Page;
import Pages.Day4Page;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class day4test extends Base.basetest {
    @Test
    public void comparebetweenproducts(){
        driver.navigate().to("http://live.techpanda.org/");
        Day2Page.mobileicon(driver).click();
        Day4Page.addtocompare1(driver).click();
        Day4Page.addtocompare2(driver).click();
        Day4Page.comparebutton(driver).click();
        // switching to new window
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        // 6. Close the Popup Windows
       Day4Page.closepopup(driver).click();


    }
}
