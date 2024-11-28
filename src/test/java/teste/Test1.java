package teste;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Login;

import java.time.Duration;

import static helpers.Constants.basicPathChrome;
import static helpers.Constants.loginURL;

public class LoginTest {

    private static WebDriver driver;
    private static Login loginPage;

    @BeforeAll
    public static void setUp() {
        // Configura o caminho do driver do Chrome
        System.setProperty("webdriver.chrome.driver", basicPathChrome);
        
        // Inicializa o WebDriver e configura o navegador
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Acessa a URL de login
        driver.get(loginURL);

        // Inicializa a página de login
        loginPage = new Login(driver);
    }

    @Test
    public void testLogin() {
        // Exemplo de um teste de login (preencher de acordo com o cenário)
        loginPage.performLogin("usuario", "senha");
        // Validação de exemplo (substitua conforme o cenário)
        // assertEquals("Esperado", loginPage.getMensagemSucesso());
    }

    @AfterAll
    public static void tearDown() {
        // Fecha o navegador após os testes
        if (driver != null) {
            driver.quit();
        }
    }
}
