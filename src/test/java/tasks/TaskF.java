package tasks;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TaskFDemoQAPage;

public class TaskF extends BaseTest {
    TaskFDemoQAPage taskFDemoQAPage;

    @BeforeMethod
    public void setUp() {
        taskFDemoQAPage = new TaskFDemoQAPage(getDriver());
    }

    @Test
    public void formFilling() {
        openURL("https://demoqa.com/automation-practice-form");
        taskFDemoQAPage
                .firstAndLastName("Denys", "LastName")
                .fillingPhoneNumber("9949934722")
                .fillingEmail("asdad@gmail.com")
                .checkboxes()
                .birthDate()
                .genderRadioBtn()
                .currentAddress("Cherkasy")
                .selectState()
                .selectCity()
                .submit()
                .submittingResult("Thanks for submitting the form");
    }
}
//F.
//1.Open https://demoqa.com/automation-practice-form
//2. Fill the form (please skip steps upload file and subjects)
//3. Submit