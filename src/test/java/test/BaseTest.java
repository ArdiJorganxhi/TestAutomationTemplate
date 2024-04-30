package test;

import factory.PageObjectFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.AccountPage;
import page.HomePage;
import page.LoginPage;

import java.time.Duration;

public class BaseTest {

    private static final String BASE_URL = "https://practicesoftwaretesting.com";
    private WebDriver webDriver;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected AccountPage accountPage;


    @BeforeEach
    public void setUp() {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(BASE_URL);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        PageObjectFactory pageObjectFactory = new PageObjectFactory(webDriver);
        homePage = pageObjectFactory.getHomePage();
        loginPage = pageObjectFactory.getLoginPage();
        accountPage = pageObjectFactory.getAccountPage();
    }

    @AfterEach
    public void tearDown() {
        webDriver.quit();
    }
}
