package ITIS.test;

import ITIS.AuthBase;
import ITIS.Model.User;
import ITIS.TestBase;
import org.junit.Test;

public class ChangePrefsTest extends AuthBase {

    @Test
    public void testUntitledTestCase() throws Exception {
        manager.getChangePrefs().entryToPrefs();
        manager.getChangePrefs().changeTheme();
        System.out.println("Id темы: " + manager.getChangePrefs().getThemeValue());

    }
}
