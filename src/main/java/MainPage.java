import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage {
    private WebDriver driver;
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    By usernameField = By.xpath("//*[@name='username']");
    By passwordField = By.xpath("//*[@name='password']");
    By submitButton = By.xpath("//*[@type='submit']");
    By forgetPasswordLink = By.xpath("//*[@href='/accounts/password/reset/']");
    By signUpLink = By.xpath("//*[text()='Зарегистрироваться']");
    By appStoreLink = By.xpath("//*[@alt='Доступно в Магазине приложений']");
    By googleStoreLink = By.xpath("//*[@alt='Доступно в Google Play']");
    By errorAlertPassword = By.xpath("//*[@id='slfErrorAlert']");
    By form = By.xpath("//*[@class='gr27e  ']");

    public MainPage form() {
        driver.findElement(form).isDisplayed();
        return this;
    }

    public MainPage typeUserName(String username) {
        driver.findElement(usernameField).sendKeys(username);
        return this;
    }

    public MainPage typeUserPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public Object clickSubmit() {
        driver.findElement(submitButton).click();
        return new UserPage(driver);
    }



    public String ErrorAlert() {
        return driver.findElement(errorAlertPassword).getText();
    }

    public String loginWrongCredential(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(submitButton).click();
        String message = driver.findElement(errorAlertPassword).getText();
        return message;
    }


}