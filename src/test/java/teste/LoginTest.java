package teste;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Login;

import static helpers.Constants.*;

public class LoginTest {

    static WebDriver driver;
    static Login login;


    @BeforeAll
    public static void setUp() throws Exception{
        System.setProperty("webdriver.chrome.driver",basicPath);
        driver = new ChromeDriver();
        driver.get(loginURL);
        login = new Login(driver);
        driver.manage().window().maximize();
        Thread.sleep(3000);


    }

    @Test
    public void loginTest(){

        login.fillOutForm();
    }

    @AfterAll
   public  static void closeAfterToExecute() throws Exception{
        Thread.sleep(3000);
        System.out.println("Sucess");
       driver.quit();

    }
}
