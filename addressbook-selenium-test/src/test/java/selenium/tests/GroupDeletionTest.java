package selenium.tests;

import org.junit.Assert;
import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {

    @Test

    public void testGroupDeletion(){
        app.getNavigationHelper().goToGroupsPage();

        int before = app.getGroupHelper().getGroupCount();

        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupDeletion();
        app.getGroupHelper().returnToGroupsPage();

        int after= app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before-1);

    }
}
