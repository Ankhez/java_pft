package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by vity on 27.03.2016.
 */
public class PointsTests {
@org.testng.annotations.Test
  public void TestDistance(){
    Point  p1=new Point(4,5);
    Point  p2=new Point(7,3);
    Assert.assertEquals(p2.distance(p1),Math.sqrt(13));

  }

}
