package baslangicJavaProjeleri;

import java.util.Iterator;
import java.util.Scanner;

public class KelimeUretme 
{

	public static void main(String[] args) 
	{
		Scanner oku = new Scanner(System.in);
		System.out.print("Harfler :");
		String harf = oku.nextLine();
		harf=harf.toUpperCase();
		char[] harfdizi = new char[harf.length()] ;
		for (int i = 0; i < harfdizi.length; i++) 
		{
			harfdizi[i]=harf.charAt(i);
		}
		long basamak =1;
		for (int i = 0; i < harfdizi.length; i++) 
		{
			basamak*=10;
		}
		System.out.println(basamak);
		
	}

}
