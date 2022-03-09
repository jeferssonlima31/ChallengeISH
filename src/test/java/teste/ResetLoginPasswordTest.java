package teste;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ResetLoginPassword;

import static helpers.Constants.*;


public class ResetLoginPasswordTest {

        static WebDriver driver;
        static ResetLoginPassword resetLoginPassword;

        @BeforeAll
        public static void setUp() throws Exception{
            System.setProperty("webdriver.chrome.driver",basicPath);
            driver = new ChromeDriver();
            driver.get(restLoginPasswordURL);
            resetLoginPassword = new ResetLoginPassword(driver);
            driver.manage().window().maximize();
            Thread.sleep(3000);
        }

        @Test
        public void forgotPassword(){

             resetLoginPassword.resetPassword();
        }

        @AfterAll
        public  static void closeAfterToExecute() throws Exception{
            Thread.sleep(3000);
            driver.quit();
        }
    }


