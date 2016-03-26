package ru.stqa.pft.sandbox;

public class Test {
	public static void main(String[] args)
	{
hello("world");
		hello("user");
		hello("Aleksei");
		System.out.println(area(3.0));
		double a=4;
		double b=5;
		System.out.println("Площадь прямоугольника со сторонами"+" "+a+" "+"и"+" "+b+"="+area(a,b));

	}
	public static void hello(String somebody)
	{
		System.out.println("Hello,"+somebody);
	}
	public static double area(double l)
	{
		return l*l;
	}
	public static double area(double a,double b)
	{
		return a*b;
	}
}