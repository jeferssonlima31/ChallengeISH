package teste;

import helpers.Constants;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.UserRegistration;

import static helpers.Constants.*;

public class UserRegistrationTest  {

    static Constants constants;
    static WebDriver driver;
    static UserRegistration userRegistration;


    @BeforeAll
    public  static void setUpBeforeClasse() throws Exception{
        System.setProperty("webdriver.chrome.driver",basicPath);
        driver = new ChromeDriver();
        driver.get(userRegistrationTest);
        userRegistration = new UserRegistration(driver);
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Test
    public void test(){

        userRegistration.fillOutForm();

    }

    @AfterAll
    public static void closeAfterToExecute() throws Exception{
        Thread.sleep(3000);
        driver.quit();
    }

}
