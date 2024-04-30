package test;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginTest extends BaseTest {

    @Test
    public void login_authenticateWithValidUser_loggedIn() {
        homePage.proceedToLogin();
        loginPage.setUsername("customer@practicesoftwaretesting.com")
                .setPassword("welcome01")
                .submit();
        final String headline = accountPage.getPageHeadline();
        assertThat(headline).isEqualTo("My account");
    }
}