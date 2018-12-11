package ITIS.test;

import ITIS.AuthBase;
import ITIS.Data;
import ITIS.Model.Message;
import ITIS.Model.User;
import ITIS.TestBase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AboutMeTest extends AuthBase {

    private List<String> message;
    private SignUpTest signUpTest;
    private ChangePrefsTest changePrefsTest;

    @Test
    public void testUntitledTestCase() throws Exception {
       // manager.getNavigation().getLoginPage();
        //manager.getAuth().login(new User("flex112","QWE123QWE"));
        message = Data.getMessage();
        manager.getAboutMeHelper().entryToProfile();
        for (int i = 0; i < message.size(); i++) {
            manager.getAboutMeHelper().changeAboutMe(message.get(i));
            TimeUnit.SECONDS.sleep(6);

            //System.out.println(manager.getAboutMeHelper().getStatus());
        }

        //Assert.assertEquals(message.getMessage(), manager.getAboutMeHelper().getStatus());

    }


}
