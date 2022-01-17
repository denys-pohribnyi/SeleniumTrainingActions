package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaskBDemoQAPage extends BasePage {
    private final WebDriver driver;

    public TaskBDemoQAPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By forms = By.xpath("//div[@class='home-body']//div[2]//div[1]//div[2]//*[name()='svg']");
    private final By practiceForm = By.xpath("//span[normalize-space()='Practice Form']");
    private final By formVisibility = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/h5");

    public TaskBDemoQAPage openRegistration() {
        WebDriverWait wait = new WebDriverWait(driver, 5);

        driver.findElement(forms).click();
        driver.findElement(practiceForm).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(formVisibility));
        //
        String x = driver.findElement(formVisibility).getText();
        System.out.println(x);
        //
        return this;
    }

    public TaskBDemoQAPage backCommand() {
        driver.navigate().back();
        driver.navigate().back();
        return this;
    }

    public TaskBDemoQAPage forwardCommand() {
        driver.navigate().forward();
        driver.navigate().forward();
        String z = driver.findElement(formVisibility).getText();
        System.out.println(z);
        return this;
    }

    public TaskBDemoQAPage navigateTo() {
        driver.navigate().to("https://demoqa.com/");
        return this;
    }

    public TaskBDemoQAPage refreshPage() {
        driver.navigate().refresh();
        return this;
    }
}
//B.
//1. Launch new Browser
//2. Open DemoQA.com website
// https://demoqa.com/
//3. Click on Registration link using
//4. Come back to Home page (Use ‘Back’ command)
//5. Again go back to Registration page (This time use ‘Forward’ command)
//6. Again come back to Home page (This time use ‘To’ command) 7.
//Refresh the Browser (Use ‘Refresh’ command)
//8. Close the Browser