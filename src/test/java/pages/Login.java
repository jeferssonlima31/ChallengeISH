package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
    static WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
    }
    public  Login(){}
    public void fillOutForm(){

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("jeff@test.com");

        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("Test123345T");

        WebElement buttonLogin = driver.findElement(By.id("SubmitLogin"));
        buttonLogin.click();

    }

}
