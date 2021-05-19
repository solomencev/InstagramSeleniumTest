import org.junit.After;
import org.junit.Assert;
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
    public void  MainPageLoginUserTest() {
        mainPage.typeUserName("divova8174@dvdoto.com");
        mainPage.typeUserPassword("Qwerty1!");
        mainPage.clickSubmit();
        Assert.assertEquals(false,  userPage.successLogin());

    }

    @Test
    public void MainPageWrongLoginPasswordTest() {
        mainPage.typeUserName("divov74@dvdoto.com");
        mainPage.typeUserPassword("Qwey1!");
        mainPage.clickSubmit();
        Assert.assertEquals("Введенное вами имя пользователя не принадлежит аккаунту. Проверьте свое имя пользователя и повторите попытку.", mainPage.ErrorAlert());

    }



    @After
    public void tearDown() {

        driver.quit();
    }
}
