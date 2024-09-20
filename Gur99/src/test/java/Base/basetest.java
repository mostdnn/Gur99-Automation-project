package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class basetest {
    public static WebDriver driver;

    @BeforeTest
    public void setup() throws IOException {
        System.setProperty("webdriver.chrome.driver", "src\\test\\chromedriver.exe");
        driver = new ChromeDriver();
        FileReader Read=new FileReader("src\\test\\ConfigFiles\\config.properties");
        Properties prop=new Properties();
        prop.load(Read);
        driver.manage().window().maximize(); // Set full-screen mode

    }

    @BeforeMethod
    public void beformethod() throws IOException {
        System.setProperty("webdriver.chrome.driver", "src\\test\\chromedriver.exe");
        driver = new ChromeDriver();
        FileReader Read=new FileReader("src\\test\\ConfigFiles\\config.properties");
        Properties prop=new Properties();
        prop.load(Read);
        driver.manage().window().maximize(); // Set full-screen mode

    }







}

