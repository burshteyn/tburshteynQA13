package selenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteContactTest extends TestBase{

    @Test
    public void TestDeleteContact(){
        int before = app.getContactHelper().getContactCount();

        app.getContactHelper().clickOnEditButton();
        app.getContactHelper().clickOnDeleteButton();

        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before-1);
    }
}
