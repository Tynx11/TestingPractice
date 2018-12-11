package ITIS;

import ITIS.helper.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class AppManager {

    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    private NavigationHelper navigation;
    private LoginHelper auth;
    private ChangePrefs changePrefs;

    private AboutMeHelper aboutMeHelper;

    private static ThreadLocal<AppManager> app = new ThreadLocal<>();

    public static AppManager GetInstance()
    {
        if (app.get() == null)
        {
            AppManager newInstance = new AppManager();
            newInstance.navigation.getLoginPage();
            app.set(newInstance);
        }
        return app.get();
    }

    private AppManager() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        baseUrl = "https://www.katalon.com/";
        verificationErrors = new StringBuffer();
        navigation = new NavigationHelper(this, baseUrl);
        auth = new LoginHelper(this);
        aboutMeHelper = new AboutMeHelper(this);
        changePrefs = new ChangePrefs(this);
//        issueHelper = new NewIssueHelper(this);
    }





    public WebDriver getDriver() {
        return driver;
    }

    public NavigationHelper getNavigation() {
        return navigation;
    }

    public LoginHelper getAuth() {
        return auth;
    }

    public StringBuffer getVerificationErrors() {
        return verificationErrors;
    }

    public AboutMeHelper getAboutMeHelper() {
        return aboutMeHelper;
    }

    public ChangePrefs getChangePrefs() {
        return changePrefs;
    }
}