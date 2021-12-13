package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Task1ShopDemoQAPage extends BasePage{
    private final WebDriver driver;

    public Task1ShopDemoQAPage(WebDriver driver){
        this.driver = driver;
    }

    public Task1ShopDemoQAPage getAndPrintTitle (){
        String title = driver.getTitle();
        int length = title.length();
        System.out.println("Title of this page is: " + title);
        System.out.println("Length of title is: "+ length);
        return this;
    }
    public Task1ShopDemoQAPage getPrintVerifyURL (String url) {
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL of this page is: " + currentURL);
        Assert.assertEquals(currentURL, url);
        return this;
    }

    public Task1ShopDemoQAPage getLengthOfPageSource(){
        String pageSource = driver.getPageSource();
        int pageSourceLength = pageSource.length();
        System.out.println("Page source length is: "+ pageSourceLength);
        return this;
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