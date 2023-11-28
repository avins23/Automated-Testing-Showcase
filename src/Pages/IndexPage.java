package Pages;

import Controller.baseFunction;

public class IndexPage extends baseFunction {
    static final String img_profilepicture  =   "oxd-userdropdown-img"; //class name
    static final String logout              =   "//a[contains(text(),'Logout')]"; //xpath
    static final String sidebar_leave       =   "//span[text()='Leave']"; //xpath
    static final String sidebar_MyInfo      =   "//span[text() = 'My Info']"; //xpath

    public static void clickUserOnHeader() {
        clickElement("class", img_profilepicture);
    }
    public static void clickLogout() {
        waitUntilLogoutButtonAvailable();
        clickElement("xpath", logout);
    }
    public static void waitUntilLogoutButtonAvailable() {
        waitUntilElementClickable("xpath", logout);
    }
    public static void waitUntilProfilePictureAvailable() {
        waitUntilElementClickable("class", img_profilepicture);
    }
    public static void clickSidebarLeave() {
        clickElement("xpath", sidebar_leave);
    }
    public static void clickSidebarMyInfo() {
        clickElement("xpath", sidebar_MyInfo);
    }
}
