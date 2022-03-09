package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ResetLoginPassword {

    static WebDriver driver;

    public ResetLoginPassword(WebDriver driver) {
        this.driver = driver;
    }

    public void resetPassword(){

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys(" jef@test.com ");

        WebElement buttonResetPassword = driver.findElement(By.xpath("//*[@id=\'form_forgotpassword\']/fieldset/p/button"));
        buttonResetPassword.click();
    }

}
