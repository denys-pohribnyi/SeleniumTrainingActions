package tasks;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TaskDDemoQAPage;

public class TaskD extends BaseTest {
    TaskDDemoQAPage taskDDemoQAPage;

    @BeforeMethod
    public void setUp() {
        taskDDemoQAPage = new TaskDDemoQAPage(getDriver());
    }

    @Test
    public void waitingForVisibilityTest() {
        openURL("https://demoqa.com/dynamic-properties");
        taskDDemoQAPage.waitingForVisibility();
    }
}
//D.
//1. Launch new Browser
//2. Open “https://demoqa.com/dynamic-properties
//3. Add WebDriverWait for waiting to button “Visible After 5 Seconds” to be
//displayed