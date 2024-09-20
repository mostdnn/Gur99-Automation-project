package Testcases;

import Pages.Day2Page;
import org.testng.Assert;
import org.testng.annotations.Test;

public class day2test extends Base.basetest{




    @Test(priority = 1)
    public void verifyprice(){
        driver.navigate().to("http://live.techpanda.org/");
        Day2Page.mobileicon(driver).click();
        String productpageprice=Day2Page.priceofsony(driver).getText();
        Day2Page.sonyimage(driver).click();
        String detailpageprice=Day2Page.priceofsony(driver).getText();
        Assert.assertEquals(detailpageprice,productpageprice);

    }
}
