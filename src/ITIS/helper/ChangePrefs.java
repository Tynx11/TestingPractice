package ITIS.helper;

import ITIS.AppManager;
import org.openqa.selenium.By;

public class ChangePrefs extends HelperBase {
    public ChangePrefs(AppManager manager) {
        super(manager);
    }

    public void entryToPrefs() {
        manager.getNavigation().getPrefsPage();
    }

    public void changeTheme() {
        driver.findElement(By.id("ctrl_style_id")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Стиль:'])[1]/following::option[3]")).click();
        driver.findElement(By.name("save")).click();
    }

    public String getThemeValue() {
        return driver.findElement(By.id("ctrl_style_id")).getAttribute("value");
    }
}
