import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserPage {

    public WebDriver driver;
    public UserPage userPage;
    public MainPage mainPage;

    public UserPage(WebDriver driver) {
        this.driver = driver;
    }

    By directButton = By.xpath("//*[@aria-label='Messenger']");
}
