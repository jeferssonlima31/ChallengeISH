package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class UserRegistration{
   WebDriver driver;

    public UserRegistration(WebDriver driver) {
        this.driver = driver;
    }

    public void fillOutForm() {

        WebElement emailCreate = driver.findElement(By.id("email_create"));
        emailCreate.sendKeys("jlf@cesar.school");

        WebElement createAccountButton = driver.findElement(By.xpath("//*[@id='SubmitCreate']"));
        createAccountButton.click();

        WebElement gender = driver.findElement(By.cssSelector("#id_gender1"));
            gender.click();

        WebElement firstName = driver.findElement(By.id("customer_firstname"));
        firstName.sendKeys("Jonny");

        WebElement lastName = driver.findElement(By.id("customer_lastname"));
        lastName.sendKeys("12345@abcd");



    }



}