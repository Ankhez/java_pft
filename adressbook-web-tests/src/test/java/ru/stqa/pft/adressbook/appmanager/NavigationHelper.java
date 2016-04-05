package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.adressbook.model.GroupData;
import ru.stqa.pft.adressbook.model.NewAddDate;

/**
 * Created by vity on 03.04.2016.
 */
public class NavigationHelper extends HelperBase{


  public NavigationHelper(FirefoxDriver wd) {
    super(wd);

  }

  public void gotoGroupPage() {
   click(By.linkText("groups"));
  }

  public void editNewAdd() {click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));



  }

  public void clickUpdate() {
    click(By.xpath("//div[@id='content']/form[1]/input[2]"));

  }
  public void fillNewAddForm(NewAddDate newAddDate) {
    type(By.name("firstname"), newAddDate.getName());
    type(By.name("middlename"), newAddDate.getHeader());
    type(By.name("lastname"), newAddDate.getFooter());
  }

  public void clickEndUpdate() {
    click(By.xpath("//div[@id='content']/form[1]/input[1]"));


  }
}
