package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static Testdata.mainData.*;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import static Controller.baseFunction.*;

public class LeavePage {
    static final String subHeader_AssignLeave       =   "//a[text()='Assign Leave']"; //xpath
    static final String subHeader_MyLeave           =   "//a[text()='My Leave']"; //xpath
    static final String label_EmployeeName          =   "//label[text()='Employee Name']"; //xpath
    static final String textbox_EmployeeName        =   "input"; //tagname
    static final String dropdown_LeaveType_Personal =   "//span[text() ='CAN - Personal']"; //xpath
    static final String dropdown_LeaveType          =   "//div[@class = 'oxd-select-text-input']"; //xpath
    static final String label_FromDate              =   "//label[text() = 'From Date']"; //xpath
    static final String textbox_FromDate            =   "input"; //tagname
    static final String label_ToDate                =   "//label[text() = 'To Date']"; //xpath
    static final String textbox_ToDate              =   "input"; //tagname
    static final String button_Assign               =   "//button[text() = ' Assign ']"; //xpath
    static final String button_Ok                   =   "//button[text() = ' Ok ']";

    public static void clickAssignLeave() {
        clickElement("xpath", subHeader_AssignLeave);
    }
    public static void waitAssignLeaveAvailable() {
        waitUntilElementClickable("xpath", subHeader_AssignLeave);
    }

    /*
        this function is so specific that its hard to find the reason to make a global function for
        it. aside of that, the usage are also really rare due to its specific root cause.
        Selenium 4 has brought new feature which let us query an object by using its near element
    */
    public static void inputEmployeeName() {
        waitUntilElementClickable("xpath", button_Assign);
        driver.findElement(with(By.tagName(textbox_EmployeeName))
                .below(By.xpath(label_EmployeeName))).sendKeys(employeeFrontname);
        implicitWait3Seconds(); //wait for dropdown to finish processing query
        driver.findElement(with(By.tagName(textbox_EmployeeName))
                .below(By.xpath(label_EmployeeName))).sendKeys(Keys.DOWN);
        driver.findElement(with(By.tagName(textbox_EmployeeName))
                .below(By.xpath(label_EmployeeName))).sendKeys(Keys.ENTER);
    }

    public static void clickLeaveType() {
        clickElement("xpath", dropdown_LeaveType);
    }
    public static void selectLeavePersonal() {
        clickElement("xpath", dropdown_LeaveType_Personal);
    }
    public static void inputFromDate() {
        driver.findElement(with(By.tagName(textbox_FromDate))
                .below(By.xpath(label_FromDate))).sendKeys(startLeaveDate);
    }
    public static void inputToDate() {
        driver.findElement(with(By.tagName(textbox_ToDate))
                .below(By.xpath(label_ToDate))).click();
    }
    public static void clickButtonAssign() {
        clickElement("xpath", button_Assign);
    }
    public static void waitButtonOkAvailable() {
        waitUntilElementClickable("xpath", button_Ok);
    }
    public static void clickButtonOk() {
        clickElement("xpath", button_Ok);
        implicitWait3Seconds();
    }
    public static void clickMyLeave() {
        clickElement("xpath", subHeader_MyLeave);
    }

}
