package Pages;

import Controller.baseFunction;

public class LoginPage extends baseFunction {
    static final String textbox_username    =   "username";
    static final String textbox_password    =   "password";
    static final String button_login        =   "orangehrm-login-button";

    public static void inputUsername(String locatorType, String text) {
        waitUntilTextboxUsernameAvailable();
        inputText(locatorType, textbox_username, text);
    }
    public static void inputPassword(String locatorType, String text) {
        inputText(locatorType, textbox_password, text);
    }
    public static void clickLogin() {
        clickElement("class", button_login);
    }
    public static void waitUntilTextboxUsernameAvailable() {
        waitUntilElementClickable("name", textbox_username);
    }
}
