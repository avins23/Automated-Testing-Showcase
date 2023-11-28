package Testcases;
import org.testng.Assert;

import static Controller.baseFunction.*;
import static Pages.IndexPage.*;
import static Pages.LoginPage.*;
import static Testdata.mainData.*;

public class LoginAndLogout {
    public static void main(String[] args) {
        initBrowser(url);
        inputUsername("name", username);
        inputPassword("name", password);
        clickLogin();
        waitUntilProfilePictureAvailable();
        clickUserOnHeader();
        clickLogout();
        waitUntilTextboxUsernameAvailable();
        Assert.assertTrue(verifyUrl(url));
        quitBrowser();
    }
}
