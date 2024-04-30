package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(className = "btnSubmit")
    private WebElement loginButton;

    public LoginPage setUsername(String username) {
        this.emailInput.sendKeys(username);
        return this;
    }

    public LoginPage setPassword(String password) {
        this.passwordInput.sendKeys(password);
        return this;
    }
    public void submit() {
        loginButton.click();
    }


}
