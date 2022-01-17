package tasks;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TaskADemoQAPage;

public class TaskA extends BaseTest {
    private TaskADemoQAPage taskADemoQAPage;

    @BeforeMethod
    public void setUp() {
        taskADemoQAPage = new TaskADemoQAPage(getDriver());
    }

    @Test
    public void titleTest() {
        openURL("https://shop.demoqa.com/");
        taskADemoQAPage
                .getAndPrintTitle()
                .getPrintVerifyURL("https://shop.demoqa.com/")
                .getLengthOfPageSource();
    }
}
//А.  https://shop.demoqa.com/
//1. Launch a new Chrome browser.
//2. Open Shop.DemoQA.com
//3. Get Page Title name and Title length
//4. Print Page Title and Title length on the Eclipse Console.
//5. Get Page URL and verify if it is a correct page opened
//6. Get Page Source (HTML Source code) and Page Source length
//7. Print Page Length.
//8. Close the Browser.