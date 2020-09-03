package odev22;

import java.util.Random;
import java.util.Scanner;

public class dortBasamakliSayiTahminOyunu
{

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
	public static void bilgisayarSayiUret(int[] PC)
	{	
		int sayi=0;
		Random r = new Random();
		do
		{
			sayi=r.nextInt((9876-1023))+1023;
			rakamlar(PC,sayi);
		}
		while(!SayilerFarklimi(PC));
	}
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
	public static void DiziYazdir(int[] dizi)
	{
		for (int j = 0; j < dizi.length; j++) 
		{
			System.out.print(dizi[j]);
		}
	}
	public static int Karsilastirma(int[] PC, int[] SEn)
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
		System.out.println(ayni+" "+farkli);
		return ayni;
	}
	public static void main(String[] args) 
	{
		System.out.print("- - - - \n");
		int[] PC=new int[4];
		int[] SEN=new int[4];
		bilgisayarSayiUret(PC);
		do 
		{
			System.out.print("Sayý Giriniz : ");
			Scanner oku = new Scanner(System.in);
			int sayi = oku.nextInt();
			rakamlar(SEN, sayi);
		} 
		while (Karsilastirma(PC, SEN)!=4);
		DiziYazdir(PC);
		
	}

}
