package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaskGDemoQAPage extends BasePage {
    private final WebDriver driver;

    public TaskGDemoQAPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By fullNameField = By.xpath("//*[@id=\"userName\"]");
    private final By emailField = By.xpath("//*[@id=\"userEmail\"]");
    private final By currentAddressField = By.xpath("//*[@id=\"currentAddress\"]");
    private final By permanentAddressField = By.xpath("//*[@id=\"permanentAddress\"]");
    private final By submitButton = By.xpath("//*[@id=\"submit\"]");


    public TaskGDemoQAPage fillingFormName(String fullName) {
        driver.findElement(fullNameField).sendKeys(fullName);
        return this;
    }

    public TaskGDemoQAPage fillingEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public TaskGDemoQAPage fillingCurrentAddress(String currentAddress) {
        driver.findElement(currentAddressField).sendKeys(currentAddress);
        return this;
    }

    public TaskGDemoQAPage fillingPermanentAddress(String permanentAddress) {
        driver.findElement(permanentAddressField).sendKeys(permanentAddress);
        return this;
    }

    public TaskGDemoQAPage submit() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement element = driver.findElement(submitButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(submitButton).click();
        return this;
    }
}


//G.
//1. Open https://demoqa.com/text-box
//2. Fill text form
//3. Submit
