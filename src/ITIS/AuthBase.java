package ITIS;

import ITIS.Model.User;
import org.junit.Before;


public class AuthBase extends TestBase {

    private User user;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver","/home/tony/Загрузки/geckodriver");
        manager = AppManager.GetInstance();
        manager.getNavigation().getLoginPage();
        manager.getAuth().login(new User(Settings.getLogin(), Settings.getPassword()));
    }
}
