package com.proxyify.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.proxyify.pages.LoginPage;
import com.proxyify.utils.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    private void testAdminLogin() {
        driver.get("https://proxify.gg/login");
        LoginPage login = new LoginPage(driver);
        login.login("admin@gmail.com", "7ERssaf51Z39n");

        assertTrue(driver.getCurrentUrl().toLowerCase().contains("dashboard"));
    }
}
