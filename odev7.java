package odev22;

import sun.audio.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

import javax.sound.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class odev7 
{
	static Scanner oku = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Sayi Giriniz : ");
		int sayi = oku.nextInt();
		int basamakSay = basamakHesaplama(sayi);
		System.out.println("Basamak Sayýsý : "+basamakSay);
		String okunus = Harflendirme(sayi, basamakSay);
		System.out.println("Okunuþu : "+okunus);
		Seslendirme("ses.wav");
	}
	static int[] Dsayi=new int[4];
	public static int basamakHesaplama(int sayi)
	{
		int say=0;
		while (sayi>=1) 
		{
			Dsayi[say]=sayi%10;
			sayi/=10;
			say++;
		}
		return say;
	}
	
	public static void Seslendirme(String sesYolu)
	{
		
		try 
		{
			File yol = new File(sesYolu);
			AudioInputStream sesGiris = AudioSystem.getAudioInputStream(yol);
			Clip c = AudioSystem.getClip();
			c.open(sesGiris);
			c.start();
			
			JOptionPane.showMessageDialog(null, "ses");
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
	}
	public static String Harflendirme(int sayi)
	{
		String okunus = null;
		String[] birler = {
				"",
				"bir",
				"iki",
				"üç",
				"dört",
				"beþ",
				"altý",
				"yedi",
				"sekiz",
				"dokuz",
		};
		String[] onlar = {
				"",
				"on ",
				"yirmi ",
				"otuz ",
				"kýrk ",
				"elli ",
				"altmýþ ",
				"yetmiþ ",
				"seksen ",
				"doksan ",
		};
		if (Dsayi[2]==0) 
		{
			
			if (Dsayi[3]==0) 
			{
				okunus=birler[Dsayi[3]]+birler[Dsayi[2]]+onlar[Dsayi[1]]+birler[Dsayi[0]];
			}
			else
			{
				okunus=birler[Dsayi[3]]+" bin "+birler[Dsayi[2]]+onlar[Dsayi[1]]+birler[Dsayi[0]];
			}
		}
		else 
		{
			if (Dsayi[3]==0) 
			{
				okunus=birler[Dsayi[3]]+birler[Dsayi[2]]+" yüz "+onlar[Dsayi[1]]+birler[Dsayi[0]];
			}
			else
			{
				okunus=birler[Dsayi[3]]+" bin "+birler[Dsayi[2]]+" yüz "+onlar[Dsayi[1]]+birler[Dsayi[0]];
			}
			
		}
		return okunus;
	}

}
