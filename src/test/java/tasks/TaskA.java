package tasks;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Task1ShopDemoQAPage;

public class TaskA extends BaseTest {
    private Task1ShopDemoQAPage task1ShopDemoQAPage;

    @BeforeMethod
    public void setUp() {
        task1ShopDemoQAPage = new Task1ShopDemoQAPage(getDriver());
    }

    @Test
    public void titleTest() {
        openURL("https://shop.demoqa.com/");
        task1ShopDemoQAPage
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