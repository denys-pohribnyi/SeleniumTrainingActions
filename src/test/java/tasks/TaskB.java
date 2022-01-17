package tasks;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TaskBDemoQAPage;

public class TaskB extends BaseTest {
    TaskBDemoQAPage taskBDemoQAPage;

    @BeforeMethod
    public void setUp() {
        taskBDemoQAPage = new TaskBDemoQAPage(getDriver());
    }

    @Test
    public void backForwardCommandsTest() {
        openURL("https://demoqa.com/");
        taskBDemoQAPage
                .openRegistration()
                .backCommand()
                .forwardCommand()
                .navigateTo()
                .refreshPage();
    }
}
//B.
//1. Launch new Browser
//2. Open DemoQA.com website
//3. Click on Registration link using
//4. Come back to Home page (Use ‘Back’ command)
//5. Again go back to Registration page (This time use ‘Forward’ command)
//6. Again come back to Home page (This time use ‘To’ command) 7.
//Refresh the Browser (Use ‘Refresh’ command)
//8. Close the Browser