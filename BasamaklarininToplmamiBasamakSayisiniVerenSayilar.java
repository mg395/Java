package baslangicJavaProjeleri;

public class BasamaklarininToplmamiBasamakSayisiniVerenSayilar 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 10000; i++) 
		{
			int sayi = i;
			int top=0;
			int basamak=0;
			while(sayi>0)
			{
				top+=sayi%10;
				sayi/=10;
				basamak++;
			}
			if(basamak==top)
			{
				System.out.println(i+" ");
			}
		}
	}
}
