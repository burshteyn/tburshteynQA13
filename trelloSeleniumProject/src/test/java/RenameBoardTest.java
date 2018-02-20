import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RenameBoardTest extends TestBase {
    @BeforeClass
    public void precondition(){
        login("elena.telran@yahoo.com", "12345.com");

    }

    @Test
    public void testRenameBoard(){
        selectBoard();
        clickOnTheBoardTitle();
        fillNewBoardTitle();
        clickRenameBoardButton();
        returnToHomePage();
    }

}
