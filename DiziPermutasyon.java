package baslangicJavaProjeleri;
public class DiziPermutasyon 
{
	private static long fak(int sayi) 
	{
		long sonuc=1;
		for (int i = 1; i <= sayi; i++) 
		{
			sonuc=sonuc*i;
		}
		return sonuc;
	}
	public static void main(String[] args) 
	{
		String[] dizi = {"A","B","C","D"};
		for (String de : dizi) 
		{
			System.out.print(de);
		}
		System.out.println(" ; dizisi "+fak(dizi.length)+" farklý þekilde sýralanabilir.");
		for (int i = 0; i < dizi.length; i++)
		{
			System.out.print(dizi[i]);
			for (int j = i+1; j < dizi.length; j++) 
			{
				System.out.print(dizi[j]);
			}
			System.out.println("");
		}
	}
	

}
