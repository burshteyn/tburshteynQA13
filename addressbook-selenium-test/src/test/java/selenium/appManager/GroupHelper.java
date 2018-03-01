package selenium.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import selenium.model.GroupData;

public class GroupHelper extends HelperBase{


    public GroupHelper(FirefoxDriver wd) {

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

}














