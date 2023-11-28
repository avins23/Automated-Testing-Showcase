package Testcases;

import org.testng.Assert;

import static Controller.baseFunction.initBrowser;
import static Pages.IndexPage.clickSidebarLeave;
import static Pages.IndexPage.waitUntilProfilePictureAvailable;
import static Pages.LeavePage.*;
import static Pages.LoginPage.*;
import static Pages.MyLeavePage.verifyLeaveAreListed;
import static Pages.MyLeavePage.waitLeaveListAvailable;
import static Testdata.mainData.*;

public class ApplyLeave {
    public static void main(String[] args) {
        initBrowser(url);
        inputUsername("name", username);
        inputPassword("name", password);
        clickLogin();
        waitUntilProfilePictureAvailable();
        clickSidebarLeave();
        waitAssignLeaveAvailable();
        clickAssignLeave();
        inputEmployeeName();
        clickLeaveType();
        selectLeavePersonal();
        inputFromDate();
        inputToDate();
        clickButtonAssign();
        waitButtonOkAvailable();
        clickButtonOk();
        clickMyLeave();
        waitLeaveListAvailable();
        Assert.assertTrue(verifyLeaveAreListed());
    }
}
