//package Testcases;
//
//import Controller.baseFunction;
//import org.openqa.selenium.By;
//import org.testng.Assert;
//
//import static Pages.Index.*;
//
//public class Scenario2 extends baseFunction {
//    public static void main(String[] args) {
//        initBrowser("https://www.ebay.com");
//        inputTextById("asus rog", searchBar);
//        clickSearchButton();
//        Assert.assertTrue(verifyFirstResultMatch());
//        quitBrowser();
//    }
//
//    static boolean verifyFirstResultMatch() {
//        String getFirstResult = driver.findElements(By.cssSelector(productName)).get(1).getText();
//        if (!getFirstResult.toLowerCase().contains("asus rog")) {
//            return false;
//        }
//        return true;
//    }
//}
