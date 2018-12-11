package ITIS.test;

import ITIS.Model.User;
import ITIS.TestBase;
import org.junit.Test;

public class LoginTest extends TestBase {

    @Test
    public void loginWithValidData() throws Exception {
        manager.getNavigation().logout();
        manager.getNavigation().getLoginPage();
        manager.getAuth().login(new User("flex112","QWE123QWE"));

    }

    @Test
    public void loginWithInValidData() throws Exception {
        manager.getNavigation().logout();
        manager.getNavigation().getLoginPage();
        manager.getAuth().login(new User("flex112","QWE123QWE1"));

    }


}
