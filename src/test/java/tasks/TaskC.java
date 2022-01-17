package tasks;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TaskCDemoQAPage;

public class TaskC extends BaseTest {
    TaskCDemoQAPage taskCDemoQAPage;

    @BeforeMethod
    public void setUp() {
        taskCDemoQAPage = new TaskCDemoQAPage(getDriver());
    }

    @Test
    public void waitersTest() {
        openURL("https://demoqa.com/progress-bar");
        taskCDemoQAPage
                .startProgressBar()
                .resetProgress()
                .waitForStart();
    }
}
//C.
//1. Launch new Browser
//2. Open https://demoqa.com/progress-bar
//3. Click Start
//4. Add WebDriverWait for waiting “Reset” button is displayed
//5. Click reset
//6. Add WebDriverWait for waiting “Start” button is displayed