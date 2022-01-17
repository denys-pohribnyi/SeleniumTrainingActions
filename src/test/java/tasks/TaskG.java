package tasks;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TaskGDemoQAPage;

public class TaskG extends BaseTest {
    private TaskGDemoQAPage taskGDemoQAPage;

    @BeforeMethod
    public void setUp() {
        taskGDemoQAPage = new TaskGDemoQAPage(getDriver());
    }

    @Test
    public void formFilling() {
        openURL("https://demoqa.com/text-box");
        taskGDemoQAPage
                .fillingFormName("Denys DENYS")
                .fillingEmail("asdasdasd@gmail.com")
                .fillingCurrentAddress("Galala st.10")
                .fillingPermanentAddress("Balala st.11")
                .submit();
    }
}
//G.
//1. Open https://demoqa.com/text-box
//2. Fill text form
//3. Submit