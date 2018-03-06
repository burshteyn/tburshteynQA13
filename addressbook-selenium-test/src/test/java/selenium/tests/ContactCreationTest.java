package selenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.model.ContactData;

public class ContactCreationTest extends TestBase{

    @Test
    public void TestContactCreate(){
        int before = app.getContactHelper().getContactCount();

        app.getNavigationHelper().clickAddNewButton();
        app.getContactHelper().fillContactData(new ContactData()
                .withFirstName("FirstSunny")
                .withLastName("LastSunny"));
        app.getContactHelper().submitContactCreaction();

        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before+1);

        app.getNavigationHelper().goToHomePage();

    }


}
