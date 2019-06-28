package baslangicJavaProjeleri;

import java.util.Scanner;

public class UcgenOlabilmeDurumunuKontrolEtme 
{
	public static void main(String[] args)
	{
		Scanner oku = new Scanner(System.in);
		System.out.println("Üçgen Olma Durumunu Kontrol Etme");
		System.out.print("Kenar Uzunluğu :");
		int kenar1 = oku.nextInt();
		System.out.print("Kenar Uzunluğu :");
		int kenar2 = oku.nextInt();
		System.out.print("Kenar Uzunluğu :");
		int kenar3 = oku.nextInt();
		if(OlmaDurumu(kenar1,kenar2,kenar3))
		{
			if((kenar1*kenar1)+(kenar2*kenar2)==kenar3*kenar3 || (kenar1*kenar1)+(kenar3*kenar3)==kenar2*kenar2 || (kenar3*kenar3)+(kenar2*kenar2)==kenar1*kenar1)
			{
				System.out.println("Dik Kenar Üçgendir.");
			}
			if(kenar1==kenar2 || kenar1==kenar3 || kenar2==kenar3)
			{
				System.out.println("ikiz Kenar Üçgendir.");
			}
			else if(kenar1==kenar2 && kenar1==kenar3)
			{
				System.out.println("Eş Kenar Üçgendir.");
			}
			else
			{
				System.out.println("Çeşit Kenar Üçgendir.");
			}
		}
		else
		{
			System.out.println("Verilen Kenar Uzunluklarıyla Bir Üçgen Cizilemez...");
		}
	}
	private static boolean OlmaDurumu(int k1, int k2, int k3) 
	{
		if(k1+k2>k3)
			if(k1+k3>k2)
				if(k2+k3>k1)
					return true;
		return false;
	}
}
