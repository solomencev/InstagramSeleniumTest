import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserPage {

    public WebDriver driver;
    public UserPage userPage;
    public MainPage mainPage;

    public UserPage(WebDriver driver) {
        this.driver = driver;
    }

    By searchField = By.xpath("//*[text()='Поиск']");
    By form = By.xpath("//*[@class='gr27e  ']");

    public Boolean successLogin(){
        return !driver.findElement(form).isDisplayed();


    }
}
