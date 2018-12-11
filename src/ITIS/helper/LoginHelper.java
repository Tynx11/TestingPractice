package ITIS.helper;

import ITIS.AppManager;
import ITIS.Model.User;
import org.openqa.selenium.By;

public class LoginHelper extends HelperBase {


    public LoginHelper(AppManager manager) {
        super(manager);
    }

    public void login(User user) {
        if (IsLoggedIn()) {
            driver.findElement(By.linkText("Войти")).click();
            driver.findElement(By.name("login_name")).click();
            driver.findElement(By.name("login_name")).clear();
            driver.findElement(By.name("login_name")).sendKeys(user.getUser());
            driver.findElement(By.name("login_password")).clear();
            driver.findElement(By.name("login_password")).sendKeys(user.getPassword());
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Напомнить пароль ?'])[1]/following::button[1]")).click();
        } else return;
    }

    public boolean IsLoggedIn() {
        if (driver.findElement(By.linkText("Войти")).isDisplayed()) {
            return true;
        } else
            return false;
    }

}
