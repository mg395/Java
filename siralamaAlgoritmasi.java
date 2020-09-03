package baslangicJavaProjeleri;

public class siralamaAlgoritmasi 
{
	 private static int array[];
	 private static int uzunluk;
	 static int ilkWhileDeger=0;
	 static int ikinciWhileDeger=0;
	 static int ucuncuWhileDeger=0;
	 static int quiksortgelmesay=0;
	 static int numaradegissay=0;
	 static int jenerasyon=1;
	public  static void main(String[] args)
	{
        int[] deger = {58,25,67,57,92,17,39,96,20,60,54,32,65,12,84,75,15,32,95,48,45,20,80,96,43,56,89,25};//sýralanmamýþ dizideki sayýlarýmýz
        ekranaYaz(deger);
        kisa(deger);
        ekranaYaz(deger);
        System.out.println("\ntoplam yapýlan iþlem sayýsý : "+(ilkWhileDeger+ikinciWhileDeger+ucuncuWhileDeger+quiksortgelmesay+numaradegissay));
	}
	public static void ekranaYaz(int[] gelendeger)
	{
		System.out.println("\n"+jenerasyon+". jenerasyon");
		for(int i:gelendeger)
        {
            System.out.print(i);
            System.out.print(" ");
        }
	}
	public static void kisa(int[] dizi) 
    {
        if (dizi == null || dizi.length == 0) 
        {
            return;
        }
        array = dizi;
        uzunluk = dizi.length;
        quickSort(0, uzunluk - 1);
    }
	
	private static void quickSort(int kucukindex, int buyukindex) 
    {
        int i = kucukindex;
        int j = buyukindex;
        int ortanca = array[kucukindex+(buyukindex-kucukindex)/2];
        while (i <= j) 
        {
            while (array[i] < ortanca) 
            {
                i++;
                ikinciWhileDeger++;
                //System.out.println("2. while : "+ikinciWhileDeger);
            }
            while (array[j] > ortanca) 
            {
                j--;
                ucuncuWhileDeger++;
                //System.out.println("3. while : "+ucuncuWhileDeger);
            }
            if (i <= j) 
            {
                numaraDegis(i, j);
                i++;
                j--;
            }
            ilkWhileDeger++;
            //System.out.println("1. while : "+ilkWhileDeger);
        }
        if (kucukindex < j)
        {
        	quickSort(kucukindex, j);
        }   
        if (i < buyukindex)
        {
        	quickSort(i, buyukindex);
        }
        quiksortgelmesay++;
        //System.out.println("quik sort gelme sayýsý : "+quiksortgelmesay);
        jenerasyon++;
        ekranaYaz(array);
    }
	
	private static void numaraDegis(int i, int j) 
    {
        int gecici = array[i];
        array[i] = array[j];
        array[j] = gecici;
        numaradegissay++;
        //System.out.println("numara degistirme sayýsý  : "+numaradegissay);
    }
}
