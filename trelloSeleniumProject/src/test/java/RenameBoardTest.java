import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RenameBoardTest extends TestBase {
    @BeforeClass
    public void precondition(){
        login("elena.telran@yahoo.com", "12345");

    }

    @Test
    public void testRenameBoard(){
        selectBoard();

    }

    public void selectBoard() {
        wd.findElement();
    }
}
