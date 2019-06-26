package baslangicJavaProjeleri;

import java.util.Scanner;
public class DaireninCevresiniVeAlaniniHesaplama 
{
	public static void main(String[] args) 
	{
		Scanner oku = new Scanner(System.in);
		double pi = 3.1415;
		System.out.print("Dairenin r (Yarý çapý) Giriniz : ");
		double r = oku.nextDouble();
		System.out.print("Dairenini Çevresi : "+(2*pi*r));
		System.out.println("");
		System.out.print("Dairenini Alaný   : "+(pi*r*r));
	}
}
