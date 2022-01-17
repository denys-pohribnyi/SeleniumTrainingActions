package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TaskFDemoQAPage extends BasePage {
    private final WebDriver driver;

    public TaskFDemoQAPage(WebDriver driver) {
        this.driver = driver;
    }


    private final By fieldFirstName = By.xpath("//*[@id=\"firstName\"]");
    private final By fieldLastName = By.xpath("//*[@id=\"lastName\"]");
    private final By fieldEmail = By.xpath("//*[@id=\"userEmail\"]");
    private final By genderRadioBtn = By.xpath("//label[@for='gender-radio-1']");
    private final By fieldPhone = By.xpath("//*[@id=\"userNumber\"]");
    private final By fieldBirthDate = By.xpath("//*[@id=\"dateOfBirthInput\"]");
    private final By calendar = By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[4]");
    private final By checkboxSports = By.xpath("//label[@for='hobbies-checkbox-1']");
    private final By checkboxReading = By.xpath("//label[@for='hobbies-checkbox-2']");
    private final By checkboxMusic = By.xpath("//label[@for='hobbies-checkbox-3']");
    private final By fieldAddress = By.xpath("//*[@id=\"currentAddress\"]");
    private final By stateDropDown = By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]");
    private final By stateDropDownOption = By.xpath("//*[text()='NCR']");
    private final By cityDropDown = By.xpath("//*[@id=\"city\"]/div/div[1]/div[1]");
    private final By cityDropDownOption = By.xpath("//*[text()='Delhi']");
    private final By submitBtn = By.xpath("//*[@id=\"submit\"]");
    private final By resultOfSubmitting = By.xpath("//*[@id=\"example-modal-sizes-title-lg\"]");

    public TaskFDemoQAPage firstAndLastName(String firstName, String lastName) {
        driver.findElement(fieldFirstName).sendKeys(firstName);
        driver.findElement(fieldLastName).sendKeys(lastName);
        return this;
    }

    public TaskFDemoQAPage fillingEmail(String email) {
        driver.findElement(fieldEmail).sendKeys(email);
        return this;
    }

    public TaskFDemoQAPage fillingPhoneNumber(String phone) {
        driver.findElement(fieldPhone).sendKeys(phone);
        return this;
    }

    public TaskFDemoQAPage genderRadioBtn() {
        driver.findElement(genderRadioBtn).click();
        driver.findElement(genderRadioBtn).click();
        return this;
    }

    public TaskFDemoQAPage birthDate() {
        driver.findElement(fieldBirthDate).click();
        driver.findElement(calendar).click();
        return this;
    }

    public TaskFDemoQAPage checkboxes() {
        driver.findElement(checkboxSports).click();
        driver.findElement(checkboxReading).click();
        driver.findElement(checkboxMusic).click();
        return this;
    }

    public TaskFDemoQAPage currentAddress(String address) {
        driver.findElement(fieldAddress).sendKeys(address);
        return this;
    }

    public TaskFDemoQAPage selectState() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement element = driver.findElement(stateDropDown);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(stateDropDown).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(stateDropDownOption))).click();
        return this;
    }

    public TaskFDemoQAPage selectCity() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.findElement(cityDropDown).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(cityDropDownOption))).click();
        return this;
    }

    public TaskFDemoQAPage submit() {
        driver.findElement(submitBtn).click();
        return this;
    }

    public TaskFDemoQAPage submittingResult(String expected) {
        String result = driver.findElement(resultOfSubmitting).getText();
        System.out.println(result);
        Assert.assertEquals(result, expected);
        return this;
    }
}
//F.
//1.Open https://demoqa.com/automation-practice-form
//2. Fill the form (please skip steps upload file and subjects)
//3. Submit


//Thanks for submitting the form