package Controller;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class baseFunction {
    public static WebDriver driver = new FirefoxDriver();
    public static Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public static void initBrowser(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }
    public static void quitBrowser() {
        driver.quit();
    }
    public static void clickElement(String by, String locator) {
        switch (by) {
            case "css":
                driver.findElement(By.cssSelector(locator)).click();
                break;
            case "id":
                driver.findElement(By.id(locator)).click();
                break;
            case "name":
                driver.findElement(By.name(locator)).click();
                break;
            case "xpath":
                driver.findElement(By.xpath(locator)).click();
                break;
            case "class":
                driver.findElement(By.className(locator)).click();
                break;
            case "partial_link":
                driver.findElement(By.partialLinkText(locator)).click();
                break;
            case "link":
                driver.findElement(By.linkText(locator)).click();
                break;
            default:
                System.out.println("BASE FUNCTION - CLICK ELEMENT PARAMETER ARE NOT RECOGNIZED BY PROGRAM");
                break;
        }
    }

    public static void inputText(String locatorType, String locator, String text) {
        switch (locatorType) {
            case "css":
                driver.findElement(By.cssSelector(locator)).sendKeys(text);
                break;
            case "id":
                driver.findElement(By.id(locator)).sendKeys(text);
                break;
            case "name":
                driver.findElement(By.name(locator)).sendKeys(text);
                break;
            case "xpath":
                driver.findElement(By.xpath(locator)).sendKeys(text);
                break;
            case "class":
                driver.findElement(By.className(locator)).sendKeys(text);
                break;
            case "partial_link":
                driver.findElement(By.partialLinkText(locator)).sendKeys(text);
                break;
            default:
                System.out.println("BASE FUNCTION - INPUT TEXT PARAMETER ARE NOT RECOGNIZED BY PROGRAM");
                break;
        }
    }

    public static void waitUntilElementClickable(String locatorType, String locator) {
        switch (locatorType) {
            case "css":
                wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locator)));
                break;
            case "id":
                wait.until(ExpectedConditions.elementToBeClickable(By.id(locator)));
                break;
            case "name":
                wait.until(ExpectedConditions.elementToBeClickable(By.name(locator)));
                break;
            case "xpath":
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
                break;
            case "class":
                wait.until(ExpectedConditions.elementToBeClickable(By.className(locator)));
                break;
            case "partial_link":
                wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(locator)));
                break;
            default:
                System.out.println("BASE FUNCTION - WAIT UNTIL ELEMENT CLICKABLE PARAMETER ARE NOT RECOGNIZED BY PROGRAM");
                break;
        }
    }

    public static boolean verifyUrl(String url) {
        wait.until(ExpectedConditions.urlToBe(url));
        return true;
    }
    public static String getText(String locatorType, String locator) {
        switch (locatorType) {
            case "css":
                return driver.findElement(By.cssSelector(locator)).getText();
            case "id":
                return driver.findElement(By.id(locator)).getText();
            case "name":
                return driver.findElement(By.name(locator)).getText();
            case "xpath":
                return driver.findElement(By.xpath(locator)).getText();
            case "class":
                return driver.findElement(By.className(locator)).getText();
            case "partial_link":
                return driver.findElement(By.partialLinkText(locator)).getText();
            default:
                return "BASE FUNCTION - Get TEXT PARAMETER ARE NOT RECOGNIZED BY PROGRAM";
        }
    }
    public static void implicitWait3Seconds() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}