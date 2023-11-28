package Testcases;

import org.testng.Assert;

import static Controller.baseFunction.initBrowser;
import static Pages.IndexPage.clickSidebarMyInfo;
import static Pages.IndexPage.waitUntilProfilePictureAvailable;
import static Pages.LoginPage.*;
import static Pages.MyInfoPage.*;
import static Testdata.mainData.*;

public class UpdatePersonalDetails {
    public static void main(String[] args) {
        initBrowser(url);
        inputUsername("name", username);
        inputPassword("name", password);
        clickLogin();
        waitUntilProfilePictureAvailable();
        clickSidebarMyInfo();
        inputFirstname();
        clickButtonSave();
        Assert.assertTrue(verifyFirstname());
    }
}
