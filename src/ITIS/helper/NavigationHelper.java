package ITIS.helper;

import ITIS.AppManager;

public class NavigationHelper extends HelperBase {
    private String baseURL;

    public NavigationHelper(AppManager manager, String baseURL) {
        super(manager);
        this.baseURL = baseURL;
    }

    public void getLoginPage() {
        driver.get("https://miped.ru/");
    }

    public void getProfilePage(){
        driver.get("https://miped.ru/f/chat/fullpage");
    }

    public void  getPrefsPage() {
        driver.get("https://miped.ru/f/account/preferences");
    }

    public void logout() {driver.get("https://miped.ru/index.php?action=logout");}
}
