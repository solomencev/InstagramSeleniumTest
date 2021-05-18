import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SignUpPage {
    private WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }
    By nameField = By.xpath("//*[@name='emailOrPhone']");
    By fullNameField = By.xpath("//*[@name='fullName']");
    By userNameField = By.xpath("//*[@name='username']");
    By passwordField = By.xpath("//*[@name='password']");
    By submitButton = By.xpath("//*[text()='Регистрация']");

}
