package Testcases;

import Pages.Day2Page;
import Pages.Day3Page;
import org.testng.Assert;
import org.testng.annotations.Test;


public class day3test extends Base.basetest {

@Test
    public void verifyaddmoreproduct(){
        driver.navigate().to("http://live.techpanda.org/");
        Day2Page.mobileicon(driver).click();
        Day3Page.addtocart(driver).click();
        Day3Page.QTY(driver).sendKeys("1000");
        String exerrormessage="The maximum quantity allowed for purchase is 500.";
        String acterrormessage=Day3Page.errormessage(driver).getText();
        Assert.assertEquals(exerrormessage,acterrormessage);
        Day3Page.cartbutton(driver).click();
        String noItemsStg = ("You have no items in your shopping cart.");
        String actnoitmesg=Day3Page.noItemsMsg(driver).getText();
        Assert.assertEquals(noItemsStg,acterrormessage);
    }
}
