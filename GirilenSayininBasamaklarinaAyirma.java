package baslangicJavaProjeleri;

import java.util.Scanner;

public class GirilenSayininBasamaklarinaAyirma 
{
	public static void main(String[] args) 
	{
		Scanner oku = new Scanner(System.in);
		System.out.print("Sayi Giriniz : ");
		int sayi = oku.nextInt();
		int sayiC = sayi;
		int basamak = 0;
		while(sayiC>=1)
		{
			sayiC/=10;
			basamak++;
		}
		System.out.println("Basamak Sayýsý : "+basamak);
		for (int i = 0; i < basamak; i++)	//basamak bulma iþleminde de yapabilirdik ama her zaman doðru çalýþmayabilir.
		{
			System.out.println(sayi%10);	//girilmiþ olan sayýyý tersten yazdýrmýþ oluruz.
			sayi/=10;
		}
	}
}
