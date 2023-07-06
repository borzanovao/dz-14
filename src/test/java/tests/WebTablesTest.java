package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.ElementsPage;
import pageobjects.WebTablesPage;

public class WebTablesTest extends BaseTest{


    @Test
    public void testWebTablesPagePositive(){
        ElementsPage elementsPage = new ElementsPage(driver);
        WebTablesPage webTablesPage = elementsPage.clickWebTablesButton();
        webTablesPage.openRegistrationForm();
        webTablesPage.fillForm("Olha", "Borzanova", "olha.@gmail.com", "25","5000", "QA");

        Assert.assertTrue(webTablesPage.checkRowExists("olha.@gmail.com"));

        webTablesPage.openEditForm();
        webTablesPage.fillForm("Anna", "Moschenok", "anna.@gmail.com", "20","6000", "QAManager");

        Assert.assertTrue(webTablesPage.checkRowExists("anna.@gmail.com"));


    }

}
