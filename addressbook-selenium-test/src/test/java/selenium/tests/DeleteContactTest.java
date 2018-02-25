package selenium.tests;

import org.testng.annotations.Test;

public class DeleteContactTest extends TestBase{

    @Test
    public void TestDeleteContact(){
        app.clickOnEditButton();
        app.clickOnDeleteButton();


    }
}
