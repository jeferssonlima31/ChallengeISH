package teste;

import helpers.Constants;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.UserRegistration;

import java.util.concurrent.TimeUnit;

import static helpers.Constants.*;

public class UserRegistrationTest  {

    static Constants constants;
    static WebDriver driver;
    static UserRegistration userRegistration;


    @BeforeAll
    public  static void setUp() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver",basicPath);
        driver = new ChromeDriver();
        userRegistration = new UserRegistration(driver);
        driver.get(userRegistrationURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void CreteUserTest(){

        userRegistration.fillOutForm();

    }

    @AfterAll
    public static void closeAfterToExecute() throws Exception{
        Thread.sleep(5000);
        driver.quit();
    }

}
