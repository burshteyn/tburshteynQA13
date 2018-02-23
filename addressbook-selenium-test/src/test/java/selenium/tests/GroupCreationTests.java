package selenium.tests;


import org.testng.annotations.Test;
import selenium.model.GroupData;

public class GroupCreationTests extends TestBase {

    @Test
    public void GroupCreationTests() {
        app.goToGroupsPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("test1", "Test1Header", "Test1Footer"));
        app.submitGroupCreation();
        app.returnToGroupsPage();
    }

}
