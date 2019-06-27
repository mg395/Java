package baslangicJavaProjeleri;

import java.util.Scanner;

public class SicaklikDonusturme 
{
	public static void main(String[] args) 
	{
		Scanner oku = new Scanner(System.in);
		System.out.println("a ) Celsius --> Fahrenheit");
		System.out.println("b ) Fahrenheit --> Celsius");
		System.out.println("****************************");
		System.out.print("Yapacaginiz islemi Seciniz :");
		String secim = oku.next();
		double f,c;
		if (secim.equalsIgnoreCase("a")) 
		{
			System.out.print("a ) Celsius --> Fahrenheit\nC : ");
			c = oku.nextDouble();
			System.out.println("F : "+(c*1.8000)+32);
		}
		else if(secim.equalsIgnoreCase("b") )
		{
			System.out.print("b ) Fahrenheit --> Celsius\nF : ");
			f = oku.nextDouble();
			System.out.println("C : "+(f-32)/1.8000);
		}
		else
		{
			System.out.println("Hatali secim islemi...");
		}
	}
}
