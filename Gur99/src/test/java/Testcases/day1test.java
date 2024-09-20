package Testcases;

import Base.basetest;
import Pages.Day1Page;
import org.testng.annotations.Test;



public class day1test extends basetest {
    Day1Page Loc=new Day1Page();


@Test(priority = 1)
    public void loginwithvaliddata(){
    driver.navigate().to("https://www.demo.guru99.com/V4/");
    Loc.userid(driver).sendKeys("mngr590421");
    Loc.password(driver).sendKeys("duquhAp");
    Loc.loginbutton(driver).click();
}


}
