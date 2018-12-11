package ITIS.helper;

import ITIS.AppManager;
import ITIS.Model.Message;
import org.openqa.selenium.By;

import static junit.framework.TestCase.assertEquals;

public class AboutMeHelper extends HelperBase {

    public AboutMeHelper(AppManager manager) {
        super(manager);
    }

    public void changeAboutMe(String message) {
        driver.findElement(By.name("message")).click();
        driver.findElement(By.name("message")).clear();
        driver.findElement(By.name("message")).sendKeys(message);
        driver.findElement(By.id("siropuChatSubmit")).click();
    }

    public void entryToProfile() {
        manager.getNavigation().getProfilePage();
    }

    public String getStatus() {
       return driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='flex112'])[3]/following::span[1]")).getText();
    }
}
