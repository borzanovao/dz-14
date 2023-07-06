package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.ButtonsPage;
import pageobjects.ElementsPage;

public class ClickMeTests extends BaseTest{

    @Test
    public  void testClickMeButton(){
        ElementsPage elementsPage = new ElementsPage(driver);
        ButtonsPage buttonsPage = elementsPage.clickButtonsButton();
        buttonsPage.clickClickMeButton();
        String message = buttonsPage.getMessage();
        Assert.assertEquals(message,"You have done a dynamic click", "The message is incorrect");
    }

}
