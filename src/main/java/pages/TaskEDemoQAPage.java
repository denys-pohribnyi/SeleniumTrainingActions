package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskEDemoQAPage extends BasePage {
    private final WebDriver driver;

    public TaskEDemoQAPage(WebDriver driver) {
        this.driver = driver;
    }

    public TaskEDemoQAPage switchingFirstFrame() {
        driver.switchTo().frame("frame1");

        String frame1Text = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(frame1Text);
        return this;
    }

    public TaskEDemoQAPage switchingDefaultContent() {
        driver.switchTo().defaultContent();
        return this;
    }

    public TaskEDemoQAPage switchingSecondFrame() {
        driver.switchTo().frame("frame2");
        String frame2Text = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(frame2Text);
        return this;
    }
}
//E.
//1. Open https://demoqa.com/frames
//2. Switch to first frame
//3. Get text from frame and print it
//4. Switch to default content
//5. Switch to second frame
//6. Get text from second frame and print it