package baslangicJavaProjeleri;

import java.util.Scanner;

public class Girilen3SayininEnBuyugu 
{
	public static void main(String[] args) 
	{
		Scanner oku = new Scanner(System.in);
		System.out.print("1. Sayi :");
		int sayi1 = oku.nextInt();
		System.out.print("2. Sayi :");
		int sayi2 = oku.nextInt();
		System.out.print("3. Sayi :");
		int sayi3 = oku.nextInt();
		if(sayi1>=sayi2 && sayi1>=sayi3)
		{
			System.out.print("En Büyük Sayi : "+sayi1);
		}
		else if(sayi2>=sayi1 && sayi2>=sayi3)
		{
			System.out.print("En Büyük Sayi : "+sayi2);
		}
		else if(sayi3>=sayi1 && sayi3>=sayi2)
		{
			System.out.print("En Büyük Sayi : "+sayi3);
		}
	}
}
