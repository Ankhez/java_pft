package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by vity on 27.03.2016.
 */
public class SquareTests {
@org.testng.annotations.Test
  public void TestArea(){
    Square s=new Square(5);
  Assert.assertEquals(s.area(),25.0);
  }



}


