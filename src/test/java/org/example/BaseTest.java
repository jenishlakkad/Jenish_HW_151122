package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils
{
    //BaseTest class extends Utils class by concept of inheritance
    DriverManager driverManager=new DriverManager();
    // calling method of 'driver manager' form Drivermanager class
    @BeforeMethod public void open()
    {
        //BeforeMethod to run code before executing every Test cases
        driverManager.openBrowser();
        //Using function of open browser to open browser
    }
    @AfterMethod public void close()
    {
        //AfterMethod to run code after executing every Test cases
        driverManager.closeBrowser();
        // Using function of close browser to close browser
    }
}
