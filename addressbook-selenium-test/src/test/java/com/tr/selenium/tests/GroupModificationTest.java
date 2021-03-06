package com.tr.selenium.tests;

import org.junit.Assert;
import org.testng.annotations.Test;
import com.tr.selenium.model.GroupData;

public class GroupModificationTest extends TestBase{

    @Test
    public void modifyGroupTest(){
        app.getNavigationHelper().goToGroupsPage();

        if(!app.getGroupHelper().isGroupExist()){
            app.getGroupHelper().createGroup();
        }

        int before = app.getGroupHelper().getGroupCount();

        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData()
                .withGroupName("1")
                .withGroupHeader("rename")
                .withGroupFooter("rename"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupsPage();

        int after= app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before);

        app.getNavigationHelper().goToHomePage();

    }
}
