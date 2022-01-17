package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaskDDemoQAPage extends BasePage {
    private final WebDriver driver;

    public TaskDDemoQAPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By visibility5sec = By.xpath("//*[@id=\"visibleAfter\"]");

    public TaskDDemoQAPage waitingForVisibility() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(visibility5sec)));
        return this;

    }
}
//D.
//1. Launch new Browser
//2. Open “https://demoqa.com/dynamic-properties
//3. Add WebDriverWait for waiting to button “Visible After 5 Seconds” to be
//displayed