package ru.stqa.pft.adressbook.tests;
import ru.stqa.pft.adressbook.model.NewAddDate;

import org.testng.annotations.Test;

/**
 * Created by vity on 05.04.2016.
 */
public class NewContactModificationTest extends TestBase {
  @Test
  public void testNewContactModificationTest(){
    app.getNavigationHelper().editNewAdd();
    app.getNavigationHelper().fillNewAddForm(new NewAddDate("1233", "3212", "222","test1"),false);
    app.getNavigationHelper().clickEndUpdate();

  }

}
