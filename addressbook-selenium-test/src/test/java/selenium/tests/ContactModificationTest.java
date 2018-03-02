package selenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.model.ContactData;

public class ContactModificationTest extends TestBase{
    @Test

    public void ContactChangeTest(){
        int before = app.getContactHelper().getContactCount();

        app.getContactHelper().clickOnEditButton();
        app.getContactHelper().fillContactData(new ContactData()
                .withFirstName("FirstSunnyChanged")
                .withLastName("LastSunnyChanged"));
        app.getContactHelper().submitContactChange();

        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before );

    }


}
