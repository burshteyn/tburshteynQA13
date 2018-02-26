package selenium.tests;

import org.testng.annotations.Test;
import selenium.model.ContactData;

public class CreateContactTest extends TestBase{

    @Test
    public void TestContactCreate(){
        app.clickAddNewButton();
        app.fillContactData(new ContactData("FirstSunny", "LastSunny"));
        app.submitContactCreaction();

    }


}
