package ITIS.test;

import ITIS.Model.User;
import ITIS.TestBase;
import org.junit.*;

import org.openqa.selenium.*;

public class SignUpTest extends TestBase {

    User user = new User("flex112","QWE123QWE");
    @Test
    public void testUntitledTestCase() throws Exception {
        manager.getNavigation().logout();
        manager.getNavigation().getLoginPage();
        manager.getAuth().login(user);
        manager.getDriver().quit();
         }

}
