package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserRegistration{
   WebDriver driver;

    public UserRegistration(WebDriver driver) {
        this.driver = driver;
    }

    public void fillOutForm() {

        WebElement emailCreate = driver.findElement(By.id("email_create"));
        emailCreate.sendKeys("elonmusk@gmail.com");

        WebElement createAccountButton = driver.findElement(By.xpath("//*[@id='SubmitCreate']"));
        createAccountButton.click();

        WebElement gender = driver.findElement(By.cssSelector("#id_gender1"));
        gender.click();

        WebElement firstNameCustomer = driver.findElement(By.id("customer_firstname"));
        firstNameCustomer.sendKeys("Elon");

        WebElement lastNameCustomer = driver.findElement(By.id("customer_lastname"));
        lastNameCustomer.sendKeys("Musk");

        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("SpaceX12345S");

        WebElement dayOfBirth = driver.findElement(By.id("days"));
        WebElement chooseDayOfBirth = driver.findElement(By.xpath("//*[@id=\"days\"]/option[32]"));
        chooseDayOfBirth.click();

        WebElement monthOfBirth = driver.findElement(By.id("months"));
        WebElement chooseMonthOfBirth = driver.findElement(By.xpath("//*[@id=\'months\']/option[9]"));
        chooseMonthOfBirth.click();

        WebElement yearOfBirth = driver.findElement(By.id("years"));
        WebElement chooseYearOfBirth = driver.findElement(By.xpath("//*[@id=\'years\']/option[30]"));
        chooseYearOfBirth.click();

        WebElement checkBoxNewsLetter = driver.findElement(By.xpath("//*[@id=\'newsletter\']"));
        checkBoxNewsLetter.click();

        WebElement checkReceiveOffers = driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[8]/label"));
        checkReceiveOffers.click();

        WebElement firstNameAddress = driver.findElement(By.xpath("//*[@id=\'firstname\']"));
        firstNameAddress.sendKeys("Elon");

        WebElement lastNameAddress = driver.findElement(By.xpath("//*[@id=\'lastname\']"));
        lastNameAddress.sendKeys("Musk");

        WebElement companyName = driver.findElement(By.xpath("//*[@id=\'company\']"));
        companyName.sendKeys("SpaceX");

        WebElement Addres1st = driver.findElement(By.xpath("//*[@id=\'address1\']"));
        Addres1st.sendKeys("Palo Auto Street");

        WebElement Addres2nd = driver.findElement(By.xpath("//*[@id=\'address2\']"));
        Addres2nd.sendKeys("Texas");

        WebElement cityname = driver.findElement(By.id("city"));
        cityname.sendKeys("Califonia");

        WebElement stateName =driver.findElement(By.id("id_state"));
        WebElement stateChooseName =driver.findElement(By.xpath("//*[@id=\'id_state\']/option[18]"));
        stateChooseName.click();

        WebElement postalCode = driver.findElement(By.cssSelector("#postcode"));
        postalCode.sendKeys("10008");

        WebElement chooseACountry= driver.findElement(By.id("id_country"));
        WebElement chooseACountryName =driver.findElement(By.xpath("//*[@id='id_country']/option[2]"));
        chooseACountryName.click();

        WebElement AddiInfo = driver.findElement(By.cssSelector("#other"));
        AddiInfo.sendKeys("Mars ain't the kind of place to raise your kids In fact,\n" +
                "it's cold as hell And there's no one there to raise them");

        WebElement housePhone = driver.findElement(By.cssSelector("#phone"));
        housePhone.sendKeys("33971103");

        WebElement mobilePhone = driver.findElement(By.cssSelector("#phone_mobile"));
        mobilePhone.sendKeys("848988845");

        WebElement referenceAddress = driver.findElement(By.cssSelector("#alias"));

        referenceAddress.sendKeys(" is Hawthorne");

        WebElement buttonRegister = driver.findElement(By.xpath("//*[@id=\'submitAccount\']/span"));
        buttonRegister.click();

    }

}