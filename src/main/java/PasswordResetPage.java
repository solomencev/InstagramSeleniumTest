import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordResetPage {

    public WebDriver driver;
    public PasswordResetPage(WebDriver driver) {
        this.driver = driver;
    }

    By emailUserField = By.xpath("//*[@name='cppEmailOrUsername']");
    By submitButton = By.xpath("//*[text()='Получить ссылку для входа']");
}
