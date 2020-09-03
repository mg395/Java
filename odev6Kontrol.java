package odev22;
import java.util.Scanner;
import java.util.ArrayList;

public class odev6Kontrol
{
	public static boolean SayilerFarklimi(int[] dizi)
	{
		for (int i = 0; i < dizi.length; i++) 
		{
			for (int j = i+1; j < dizi.length; j++) 
			{
				if (dizi[i]==dizi[j]) 
				{
					return false;
				}
				
			}
			
		}
		return true;
	}
	public static void rakamlar(int[] dizi, int sayi)
	{
		int say=3;
		while(sayi>=1)
		{
			int kalan=sayi%10;
			dizi[say]=kalan;
			sayi/=10;
			say--;
		}
	}
	public static int Karsilastirma(int[] SEn,int[] PC)
	{
		int ayni=0;
		int farkli=0;
		for (int i = 0; i < SEn.length; i++) 
		{
			for (int j = 0; j < PC.length; j++) 
			{
				if (SEn[i]==PC[j]) 
				{
					if(i==j)
					{
						ayni++;
					}
					else
					{
						farkli++;
					}
				}
			}
		}
		return 10*ayni+farkli;
	}
	public static int Kontrol(ArrayList<Integer> diziArray,ArrayList<Integer> degerArray)
	{
		int sayi = 0;
		boolean d=true;
		for (int i = 1023; i <= 9876; i++) 
		{
			sayi=i;
			d=true;
			if (!SayilerFarklimi(arrayIntCevirme(i))) 
			{
				continue;
			}
			for (int j = 0; j < diziArray.size(); j++) 
			{
				if (Karsilastirma(arrayIntCevirme(i), arrayIntCevirme(diziArray.get(j))) != degerArray.get(j)) 
				{
					d=false;
				}
			}
			if (d==false) 
			{
				continue;
			}
			else 
			{
				return sayi;
			}
			
		}
		return sayi;
	}
	public static int sayiGir()
	{
		int sayi;
		boolean deger=true;
		do 
		{
			deger=true;
			System.out.print("Sayý Giriniz : ");
			oku = new Scanner(System.in);
			sayi = oku.nextInt();
			if (sayi<1000||sayi>9999) 
			{
				System.out.println("Dört Basamlý Deðer giriniz...");
				deger=false;
			}
		} while (deger==true && !SayilerFarklimi(arrayIntCevirme(sayi)));
		
		return sayi;
	}
	public static int[] arrayIntCevirme(int sayi)
	{
		int[] PcDizi = new int[4];
		PcDizi[0]=sayi/1000;
		PcDizi[1]=(sayi/100)%10;
		PcDizi[2]=(sayi/10)%10;
		PcDizi[3]=sayi%10;
		return PcDizi;
	}
	static int[] SenDizi = new int[4];
	static int[] PcDizi = new int[4];
	private static Scanner oku;
	public static void main(String[] args) 
	{
		ArrayList<Integer> ArraySayi= new ArrayList<Integer>();
		ArrayList<Integer> ArrayDeger= new ArrayList<Integer>();
		ArrayList<String> Degerler= new ArrayList<String>();
		for (int i = 1023; i < 9877; i++) 
		{
			if (!SayilerFarklimi(arrayIntCevirme(i))) 
			{
				continue;
			}
			int say=0;
			int sayi = i;
			int FarkKontrol=0;
			int cikti;
			rakamlar(SenDizi,sayi);
			while (true) 
			{
				say++;
				int tahmin = Kontrol(ArraySayi, ArrayDeger);
				ArraySayi.add(tahmin);
				PcDizi=arrayIntCevirme(tahmin);
				FarkKontrol = Karsilastirma(SenDizi, PcDizi);
				ArrayDeger.add(FarkKontrol);
				cikti = ArrayDeger.get(ArrayDeger.size()-1);
				if (cikti==40) 
				{
					Degerler.add(sayi+" sayýsý "+say+". çözümlemede bulundu.");
					ArraySayi.clear();
					ArrayDeger.clear();
					break;
				}
			}
		}
		for (String item : Degerler) 
		{
			System.out.print(item+"      ");
		}
	}

}
