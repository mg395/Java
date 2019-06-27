package baslangicJavaProjeleri;


public class ArmstrongSayi 
{
	public static void main(String[] args) 
	{
		System.out.println("Armstrong Sayilar");
		for (int i = 1; i < 1000; i++) 
		{
			Armstrong(i);
		}
	}
	
	private static void Armstrong(int sayi) 
	{
		int toplam=0;
		String top="";
		int sayiC=sayi;
		while (sayi>=1) 
		{
			int kup=(sayi%10)*(sayi%10)*(sayi%10);
			toplam+=kup;
			sayi/=10;
		}
		if (toplam==sayiC) 
		{
			System.out.println(sayiC);
		} 
	}
}
