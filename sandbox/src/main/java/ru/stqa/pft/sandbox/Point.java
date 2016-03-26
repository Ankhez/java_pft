package ru.stqa.pft.sandbox;

/**
 * Created by vity on 26.03.2016.
 */
public class Point {
  public double getC() {
    return c;
  }

  public double getD() {
    return d;
  }

  public double c,d;


  public Point(double c,double d){
    this.c=c;
    this.d=d;

  }



  public double distance(Point p1)
  {

    return Math.sqrt(Math.pow((this.c-p1.c),2)+ Math.pow((this.d-p1.d),2));

  }

  }