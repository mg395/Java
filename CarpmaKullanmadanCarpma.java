package baslangicJavaProjeleri;

import java.util.Scanner;
public class CarpmaKullanmadanCarpma 
{
	public static void main(String[] args) 
	{
		Scanner oku = new Scanner(System.in);
		System.out.print("1. Sayi :");
		int sayi1=oku.nextInt();
		System.out.print("2. Sayi :");
		int sayi2=oku.nextInt();
		int sonuc=0;
		for (int i = 0; i < sayi2; i++) 
		{
			sonuc+=sayi1;
		}
		System.out.println("Sonuc : "+sonuc);
	}
}
