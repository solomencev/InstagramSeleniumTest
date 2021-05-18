import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainPageTest {

    private WebDriver driver;
    private MainPage mainPage;
    private UserPage userPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
        mainPage = new MainPage(driver);
        userPage = new UserPage(driver);
    }

    @Test
    public void MainPageLoginUser() {
        mainPage.typeUserName("test");
        mainPage.typeUserPassword("testing");
        mainPage.clickSubmit();

        System.out.println("fdg");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
