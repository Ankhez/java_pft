package ru.stqa.pft.adressbook;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class NewContact {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        login(new LoginPar("admin", "secret"));
    }

    private void login(LoginPar loginPar) {
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).sendKeys(loginPar.getUsername());
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).sendKeys(loginPar.getPassword());
        wd.findElement(By.cssSelector("html")).click();
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
        wd.findElement(By.cssSelector("html")).click();
    }

    @Test
    public void NewContact() {


        gotoNewContactCreation();
        fillNewForm(new FillForm("Biba", "Bibochevskay", "Homuncul"));
        buttonClickinContactCreation();
    }

    private void buttonClickinContactCreation() {
        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }

    private void fillNewForm(FillForm fillForm) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(fillForm.getName());
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(fillForm.getLastname());
        wd.findElement(By.name("nickname")).click();
        wd.findElement(By.name("nickname")).clear();
        wd.findElement(By.name("nickname")).sendKeys(fillForm.getLogin());
    }

    private void gotoNewContactCreation() {
        wd.findElement(By.linkText("add new")).click();
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
