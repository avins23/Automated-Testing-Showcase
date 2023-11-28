package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static Controller.baseFunction.*;
import static Testdata.mainData.*;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class MyInfoPage {
    public static final String textbox_Middlename   =   "middleName"; //name
    public static final String button_Save          =   "orangehrm-left-space"; //classname
    public static final String contactDetails       =   "//a[text() = 'Contact Details']";
    public static final String label_Workmail       =   "//label[text() = 'Work Email']"; //xpath
    public static final String textbox_Workmail     =   "input"; //tag
    public static final String job                  =   "//a[text() = 'Job']"; //xpath

    public static void inputFirstname() {
        waitUntilElementClickable("name", textbox_Middlename);
        implicitWait3Seconds();
        inputText("name", textbox_Middlename,newEmployeeName);
    }

    public static void clickButtonSave() {
        waitUntilElementClickable("class", button_Save);
        clickElement("class", button_Save);
    }

    public static boolean verifyFirstname() {
        waitUntilElementClickable("name", textbox_Middlename);
        return getText("name", textbox_Middlename).equals(newEmployeeName);
    }
    public static void clickContactDetails() {
        waitUntilElementClickable("xpath", contactDetails);
        clickElement("xpath", contactDetails);
    }
    public static void inputWorkmail() {
        implicitWait3Seconds();
        driver.findElement(with(By.tagName(textbox_Workmail))
                .below(By.xpath(label_Workmail))).sendKeys(Keys.CONTROL, "A");
        driver.findElement(with(By.tagName(textbox_Workmail))
                .below(By.xpath(label_Workmail))).sendKeys(Keys.BACK_SPACE);
        driver.findElement(with(By.tagName(textbox_Workmail))
                .below(By.xpath(label_Workmail))).sendKeys(workmail);
    }
    public static boolean verifyWorkmail() {
        return driver.findElement(with(By.tagName(textbox_Workmail))
                .below(By.xpath(label_Workmail))).getAttribute("value").equals(workmail);
    }

}
