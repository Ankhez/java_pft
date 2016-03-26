package ru.stqa.pft.sandbox;

public class Test {
	public static void main(String[] args)
	{
/*hello("world");
		hello("user");
		hello("Aleksei");
		Square s=new Square(5);
		System.out.println(s.area());
		Rectangle r=new Rectangle(4,5);*/
		Point  p1=new Point(4,5);
		Point  p2=new Point(7,3);
		//System.out.println(distance(p1,p2));
		System.out.println(p2.distance(p1));

		p1.getC();
		p1.getD();
		System.out.println();




		//System.out.println("Площадь прямоугольника со сторонами"+" "+r.a+" "+"и"+" "+r.b+"="+r.area());

	}
/*	public static double distance(Point p1, Point p2)
	{
		return Math.sqrt(Math.pow((p2.c-p1.c),2)+ Math.pow((p2.d-p1.d),2));
	}*/
	public static void hello(String somebody)
	{
		System.out.println("Hello,"+somebody);
	}


}