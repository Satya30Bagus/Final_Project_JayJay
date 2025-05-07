package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class login_page {

    static WebDriver driver;

    By usernameInputText = By.xpath("//*[@id=\"loginusername\"]");
    By passInputText = By.xpath("//*[@id=\"loginpassword\"]");
    By loginButton = By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");
    By loginButtononNavigation = By.xpath("//*[@id=\"login2\"]");

    public login_page(WebDriver driver) {
        this.driver = driver;
    }

//    public static void goToLoginPage() {
//        driver.get("https://www.demoblaze.com/");
//    }

    public static void goToLoginpage() {
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().fullscreen();
    }

    public void inputUsername(String username) {
        driver.findElement(usernameInputText).sendKeys(username);
    }

    public void inputPassword(String password) {
        driver.findElement(passInputText).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void clickloginButtononNavigation(){
        driver.findElement(loginButtononNavigation).click();
    }

    public void validateErrorAppear(String errorMessage) {

        assertFalse(driver.getPageSource().contains(errorMessage));
    }

    public void validateWelcomeMessage (String WelcomeMessage){
        assertFalse(driver.getPageSource().contains(WelcomeMessage));
    }


}
