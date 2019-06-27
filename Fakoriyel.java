package baslangicJavaProjeleri;

import java.util.Scanner;

public class Fakoriyel 
{
	public static void main(String[] args) 
	{
		Scanner oku = new Scanner(System.in);
		System.out.print("Sayi Giriniz :");
		System.out.print(fak(oku.nextInt()));
	}
	private static int fak(int sayi) 
	{
		int fak=1;;
		for (int i = 1; i <= sayi; i++) 
		{
			fak*=i;
		}
		return fak;
	}
}
