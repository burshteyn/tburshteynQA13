package selenium.tests;

import org.testng.annotations.Test;
import selenium.model.ContactData;

public class ChangeContactTest extends TestBase{
    @Test

    public void ContactChangeTest(){
        app.clickOnEditButton();
        app.fillContactData(new ContactData("FirstSunnyChanged", "LastSunnyChanged"));
        app.submitContactChange();

    }


}
