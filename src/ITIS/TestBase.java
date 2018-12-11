package ITIS;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.fail;

public class TestBase {
    protected AppManager manager;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver","/home/tony/Загрузки/geckodriver");
        manager = AppManager.GetInstance();
        manager.getNavigation().getLoginPage();
    }

}
