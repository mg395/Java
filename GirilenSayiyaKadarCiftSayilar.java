package baslangicJavaProjeleri;

import java.util.Scanner;

public class GirilenSayiyaKadarCiftSayilar 
{
	public static void main(String[] args) 
	{
		Scanner oku = new Scanner(System.in);
		System.out.print("Sayi Giriniz : ");
		int girilenSayi = oku.nextInt();
		int say = 0;
		while (say<=girilenSayi) 
		{
			if (say%2==0) 
			{
				System.out.print(say+ " ");
			}
			say++;
		}
	}
}
