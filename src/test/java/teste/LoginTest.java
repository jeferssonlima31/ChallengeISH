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
        // Configura o driver do Chrome
        System.setProperty("webdriver.chrome.driver", basicPathChrome);
        driver = new ChromeDriver();

        // Configurações do navegador
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navega até a URL de login
        driver.get(loginURL);

        // Inicializa a página de login
        login = new Login(driver);
    }

    @Test
    public void testLogin() {
        // Realiza o preenchimento do formulário de login
        login.fillOutForm();
    }

    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            
            driver.quit();
        }
    }
}
