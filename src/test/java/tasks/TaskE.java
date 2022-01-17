package tasks;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TaskEDemoQAPage;

public class TaskE extends BaseTest {
    TaskEDemoQAPage taskEDemoQAPage;

    @BeforeMethod
    public void setUp() {
        taskEDemoQAPage = new TaskEDemoQAPage(getDriver());
    }

    @Test
    public void framesTest() {
        openURL("https://demoqa.com/frames");
        taskEDemoQAPage
                .switchingFirstFrame()
                .switchingDefaultContent()
                .switchingSecondFrame();
    }
}
//E.
//1. Open https://demoqa.com/frames
//2. Switch to first frame
//3. Get text from frame and print it
//4. Switch to default content
//5. Switch to second frame
//6. Get text from second frame and print it