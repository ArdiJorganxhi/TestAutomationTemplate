package factory;

import org.openqa.selenium.WebDriver;
import page.AccountPage;
import page.HomePage;
import page.LoginPage;

import java.util.Optional;

public class PageObjectFactory {

    private final WebDriver driver;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected AccountPage accountPage;

    public PageObjectFactory(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return Optional.ofNullable(homePage).orElse(new HomePage(driver));
    }

    public LoginPage getLoginPage() {
        return Optional.ofNullable(loginPage).orElse(new LoginPage(driver));
    }

    public AccountPage getAccountPage() {
        return Optional.ofNullable(accountPage).orElse(new AccountPage(driver));
    }
}