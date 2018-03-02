package selenium.tests;

import org.junit.Assert;
import org.testng.annotations.Test;
import selenium.model.GroupData;

public class GroupModificationTest extends TestBase{

    @Test
    public void modifyGroupTest(){
        app.getNavigationHelper().goToGroupsPage();

        int before = app.getGroupHelper().getGroupCount();

        app.getGroupHelper().returnToGroupsPage();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData()
                .withGroupName("rename")
                .withGroupHeader("rename")
                .withGroupFooter("reName"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupsPage();

        int after= app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before);

    }
}
