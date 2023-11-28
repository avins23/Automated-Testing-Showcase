package Pages;

import org.openqa.selenium.By;

import static Controller.baseFunction.*;
import static Testdata.mainData.employeeName;

public class MyLeavePage {
    public static final String div_cell         =   "//div[@class='oxd-table-cell oxd-padding-cell']"; //xpath
    public static final String button_Cancel    =   "//button[text() = ' Cancel ']"; //xpath

    public static boolean verifyLeaveAreListed() {
        for (int i = 0; i < driver.findElements(By.xpath(div_cell)).size(); i++) {
            if (driver.findElements(By.xpath(div_cell)).get(i).getText().equals(employeeName)) {
                return true;
            }
        }
        return false;
    }

    public static void waitLeaveListAvailable() {
        waitUntilElementClickable("xpath", div_cell);
    }
    public static void clickButtonCancel() {
        clickElement("xpath", button_Cancel);
    }
}
