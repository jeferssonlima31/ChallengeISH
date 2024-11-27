package teste;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Login;

import java.time.Duration;

import static helpers.Constants.*;

public class LoginTest {

    private static WebDriver driver;
    private static Login login;

    @BeforeAll
    public static void setUp() {
     
        System.setProperty("webdriver.chrome.driver", basicPathChrome);
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        
        driver.get(loginURL);

        login = new Login(driver);
    }

    @Test
    public void testLogin() {
       
        login.fillOutForm();
    }

    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            
            driver.quit();
        }
    }
}
