package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by vity on 03.04.2016.
 */
public class SessionHelper extends HelperBase{

  public SessionHelper(FirefoxDriver wd) {
    super(wd);
  }
  public void login(String username, String password) {
    type(By.name("user"),username);
    type(By.name("pass"),password);
    wd.findElement(By.cssSelector("html")).click();
    click(By.xpath("//form[@id='LoginForm']/input[3]"));

  }
}
