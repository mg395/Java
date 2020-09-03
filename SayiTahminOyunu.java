import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu 
{

	public static int sayiUret(int b, int k)
	{
		int sayi;
		Random r = new Random();
		do
		{
			sayi=r.nextInt((b-k))+k;
		}while(sayi==0);
		return sayi;
	}
	

	
	public static void main(String[] args) 
	{
		Scanner oku = new Scanner(System.in);
		int tahminsayisi=0;
		int buyuk=1000,kucuk=0;
		System.out.print("1 - "+buyuk+" arasý sayi tutunuz !!");
		oku.nextLine();
		
		while(true)
		{
			int sayi=sayiUret(buyuk,kucuk);
			System.out.print("tutuðunuz sayi "+sayi+" den buyuk mü (e / h) :");
			String deger=oku.nextLine();
			tahminsayisi++;
			if(deger.equals("q"))
			{
				break;
			}
			
			if(deger.equals("e"))
			{
				kucuk=sayi+1;
			}
			else if(deger.equals("h"))
			{
				buyuk=sayi;
			}
			else
			{
				System.out.println("Yanlýþ deðer girdiniz...");
			}
			if(buyuk-kucuk<=1)
			{
				System.out.println(tahminsayisi+" tahminden sonra Tutugunuz sayi : "+buyuk);
				break;
			}
		}
	}

}
