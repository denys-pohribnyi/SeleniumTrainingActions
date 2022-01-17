package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaskCDemoQAPage extends BasePage {
    private final WebDriver driver;

    public TaskCDemoQAPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By startButton = By.xpath("//*[@id=\"startStopButton\"]");
    private final By resetButton = By.xpath("//*[@id=\"resetButton\"]");
    private final By progressBar100 = By.xpath("//div[@role='progressbar']");

    public TaskCDemoQAPage startProgressBar() {
        driver.findElement(startButton).click();
        return this;
    }

    public TaskCDemoQAPage resetProgress() {
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(resetButton)));
        driver.findElement(resetButton).click();
        return this;
    }

    public TaskCDemoQAPage waitForStart(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(startButton)));
        return this;
    }

}
//C.
//1. Launch new Browser
//2. Open https://demoqa.com/progress-bar
//3. Click Start
//4. Add WebDriverWait for waiting “Reset” button is displayed
//5. Click reset
//6. Add WebDriverWait for waiting “Start” button is displayed