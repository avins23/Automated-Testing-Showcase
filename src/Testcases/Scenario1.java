//package Testcases;
//
//import Controller.baseFunction;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.locators.RelativeLocator;
//import org.testng.Assert;
//
//import java.util.List;
//
////import static Pages.Category_CellphonesAndAccessories.*;
////import static Pages.Index.*;
//
//public class Scenario1 extends baseFunction {
//
//    public static void main(String[] args) {
//
//        initBrowser("https://www.ebay.com");
//        clickById(index.shopByCategory);
//        clickByCss(Index.shopByCategory_Cellphone);
//        clickByCss(Index.categoryCellphonesAndAccessories.Sidenav_CellphonesAndSmartphones);
//        clickByCss(Index.categoryCellphonesAndAccessories.allFilter);
//
//        //apply filter condition
//        waitClickableById(categoryCellphonesAndAccessories.allFilter_Condition);
//        clickById(categoryCellphonesAndAccessories.allFilter_Condition);
//        waitPresenceById(categoryCellphonesAndAccessories.allFilter_Condition_New);
//        clickById(categoryCellphonesAndAccessories.allFilter_Condition_New);
//
//        //apply filter price
//        clickById(categoryCellphonesAndAccessories.allFilter_Price);
//        waitPresenceByCss(categoryCellphonesAndAccessories.allFilter_Price_Start);
//        inputTextByClass("300000", categoryCellphonesAndAccessories.allFilter_Price_Start);
//
//        //apply filter location
//        clickById(categoryCellphonesAndAccessories.allFilter_ItemLocation);
//        visibilityByCss(categoryCellphonesAndAccessories.allFilter_ItemLocation_Asia);
//        clickByCss(categoryCellphonesAndAccessories.allFilter_ItemLocation_Asia);
//        clickByClass(categoryCellphonesAndAccessories.allFilter_Apply);
//
//        //Verify all the conditions are correctly implied
//        clickByCss(categoryCellphonesAndAccessories.allFilter);
//
//        //Verify Condition Filter
//        waitClickableById(categoryCellphonesAndAccessories.allFilter_Condition);
//        clickById(categoryCellphonesAndAccessories.allFilter_Condition);
//        waitPresenceById(categoryCellphonesAndAccessories.allFilter_Condition_New);
//        driver.findElement(By.id(categoryCellphonesAndAccessories.allFilter_Condition_New)).isDisplayed();
//        Assert.assertNotNull(driver.findElement(By.id(categoryCellphonesAndAccessories.allFilter_Condition_New)).getAttribute("checked"));
//
//        //Verify Price Filter
//        clickById(categoryCellphonesAndAccessories.allFilter_Price);
//        waitPresenceByCss(categoryCellphonesAndAccessories.allFilter_Price_Start);
//        String priceStart = driver.findElement(By.cssSelector(categoryCellphonesAndAccessories.allFilter_Price_Start)).getAttribute("defaultValue").replace(",", "");
//        Assert.assertEquals(priceStart, "300000");
//
//        //Verify Location Filter
//        clickById(categoryCellphonesAndAccessories.allFilter_ItemLocation);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(categoryCellphonesAndAccessories.allFilter_ItemLocation_Asia)));
//        Assert.assertNotNull(driver.findElement(RelativeLocator
//                        .with(By.tagName("input"))
//                        .near(By.id("c3-subPanel-location_Asia")))
//                        .getAttribute("checked"));
//        /*
//           The idea behind checking the attribute "checked" is on this case, the selected radio button would
//           spawn the attribute "checked" whereas the unselected radio button did not have the attribute "checked"
//        */
//
//        //Close the filter panel
//        clickByClass(categoryCellphonesAndAccessories.allFilter_CloseButton);
//
//        //Verify the result of inquiry have prices more than idr Rp300,000
//        Assert.assertTrue(verifyAllPrices());
//
//        quitBrowser();
//
//    }
//    static boolean verifyAllPrices() {
//        List<WebElement> getAllPrice = driver.findElements(By.className(categoryCellphonesAndAccessories.productPrices));
//        for (int i = 0; i < getAllPrice.stream().count(); i++) {
//           if (getAllPrice.get(i).getText().length() == 2) {
//               continue;
//           }
//           String getPrice = getAllPrice.get(i).getText();
//           System.out.println(getPrice);
//           Long convertPrice = Long.parseLong(getPrice
//                   .substring(0, getPrice.indexOf("."))
//                   .replace("IDR", "")
//                   .replace(",", "")
//           );
//           if (convertPrice < 300000) {
//               return false;
//           }
//        }
//        return true;
//    }
//
//}
