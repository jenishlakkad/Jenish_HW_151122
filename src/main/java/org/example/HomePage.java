package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{  //HomePage class extends Utils class by inheritance concept

    private By _registration=By.linkText("Register");
      //Making the private variable and storing the commanding of selenium to get linkText
     public void clickOnRegisterButton(){
         //Method to click on the Register Button
         clickOnElementFunction(_registration);
         //click on element function to click on " Register "
     }
}
