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
}