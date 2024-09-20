package Testcases;

import Pages.Day5Page;
import org.testng.Assert;
import org.testng.annotations.Test;

public class day5test extends Base.basetest {

    @Test
    public void verifyregisteration(){
        driver.navigate().to("http://live.techpanda.org/");
        Day5Page.accounticon(driver).click();

        // 3a. Click Create an Account link
        Day5Page.createaccount(driver).click();

        // 3b. and fill New User information
        Day5Page.firstname(driver).sendKeys("mostafa");
        Day5Page.lasttname(driver).sendKeys("ramadan");
        Day5Page.emailaddress(driver).sendKeys("mol34234@gmail.com");
        Day5Page.password(driver).sendKeys("123456");
        Day5Page.confirmpassword(driver).sendKeys("123456");
        // 4. Click Register
        Day5Page.registerbutton(driver).click();

        // 5. Verify Registration is done. Expected account registration done.
        String vWelcome ="Thank you for registering with Main Website Store.";
        String tWelcome = Day5Page.messageafterregistration(driver).getText();


        try {
            Assert.assertEquals(vWelcome,tWelcome);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 6. Go to TV menu
     Day5Page.Tvicon(driver).click();

        // 7. Add product in your wish list - use product - LG LCD
        Day5Page.addtowishlist(driver).click();
        // 8. Click SHARE WISHLIST
       Day5Page.sharewishlist(driver).click();

        // 9. In next page enter Email and a message and click SHARE WISHLIST
        Day5Page.emailtextfield(driver).clear();
        Day5Page.emailtextfield(driver).sendKeys("support@guru99.com");
        Day5Page.messagetextfield(driver).sendKeys("Hey Mary!! this LCD TV looks ok, check it out !!.. cheers .. Berry");
        Day5Page.sharewishlist(driver).click();

        // 10. Check wishlist is shared. Expected wishlist shared successfully.
        String vWishList = "Your Wishlist has been shared.";
        String wishList = Day5Page.wishlistmessage(driver).getText();
        Assert.assertEquals(vWishList,wishList);




}
}