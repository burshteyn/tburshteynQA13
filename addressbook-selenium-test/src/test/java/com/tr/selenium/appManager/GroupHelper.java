package com.tr.selenium.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.tr.selenium.model.GroupData;

public class GroupHelper extends HelperBase{


    public GroupHelper(WebDriver wd) {

        super(wd);
    }

    public void returnToGroupsPage() {

        click(By.linkText("group page"));
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }


    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getGroupName());
        type(By.name("group_header"), groupData.getGroupHeader());
        type(By.name("group_footer"), groupData.getGroupFooter());
    }


    public void initGroupCreation() {

        click(By.name("new"));
    }

    public void selectGroup() {

        click(By.name("selected[]"));
    }

    public void initGroupDeletion() {

        click(By.name("delete"));
    }

    public int getGroupCount() {

        return wd.findElements(By.name("selected[]")).size();
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void submitGroupModification() {
        click(By.xpath("//*[@value='Update']"));
    }

    public void createGroup() {
        initGroupCreation();
        fillGroupForm(new GroupData()
                .withGroupName("test1")
                .withGroupHeader("Test1Header")
                .withGroupFooter("Test1Footer"));
        submitGroupCreation();
        returnToGroupsPage();
    }

    public boolean isGroupExist() {
       return isElementPresent((By.name("selected[]")));
    }
}














