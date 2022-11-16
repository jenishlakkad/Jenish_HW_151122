package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;

public class Utils extends BaseFile
{  //Utils Class extends BaseFile class by inheritance concept
    public String getTimeStamp()
    {
        //Method for time stamp for ddhhmmss
        return new SimpleDateFormat("ddHHmmss").format(new java.util.Date());
    }
    public String getTextFromElement(By by)
    {
        //Method "getText" to get text from website. By passing one parameter 'by'
        String regMsg=driver.findElement(by).getText();
        System.out.println(regMsg);
        // To print message
        return regMsg;
        //return method
    }
    public void clickOnElementFunction(By by)
    {
        //Method to click on button,image,text,field, etc. By passing one parameter 'by'
        driver.findElement(by).click();
    }
    public void sendText(By by,String name)
    {
        //Method "sendText" to write any text on website, by passing two parameter 'By' and 'String'
        driver.findElement(by).sendKeys(name);
    }

    public void waitForElementToClickAble(By by,int timeInSeconds)
    {
        //Method to wait for element to click able by passing two parameter 'By' and 'int'
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        //commanding to driver to wait
    }
    public static void waitForElementToBeVisible(By by,int duration)
    {
        //Method to wait for element to Visible by passing two parameter 'By' and 'int'
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(duration));
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        //commanding to drover to wait
    }
    public void waitForUrlToBe(String url,int timeInSeconds)
    {
        //Method to wait for 'URL' by passing two parameter 'By' and 'int'
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.urlToBe(url));
        //commanding to driver to wait
    }

    public void hover()
    {
        //Method to hover actions
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Obj to call an inbuild class(JavascriptExecutor) :- for hovering mouse

        js.executeScript("window.scrollBy(0,370)", "");
    }
    public void selectFromDropdownByVisibleText(By by,String a)
    {
        //Method to Dropdown by locator 'Visible Text'
//    driver.findElement(by);
        Select select=new Select(driver.findElement(by));
        select.selectByVisibleText(a);
        //commanding to driver to drop down
    }
    public void selectFromDropdownByValue(By by,String a)
    {
        //Method to Dropdown by locator 'Value'
//    driver.findElement(by);
        Select select=new Select(driver.findElement(by));
        select.selectByValue(a);
        //commanding to driver to drop down
    }
    public void selectFromDropdownByIndex(By by,int a)
    {
        //Method to Dropdown by locator 'Index'
//    driver.findElement(by);
        Select select=new Select(driver.findElement(by));
        select.selectByIndex(a);
        //commanding to driver to drop down
    }
}
