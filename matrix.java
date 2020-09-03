package odev22;

public class matrix 
{

	public static void yazdir(int a,int b,int[][] dizi)
	{
		
		System.out.println("Matrix");
        for (int i = 0; i < dizi.length; i++) 
        {
            System.out.println("");
            for (int j = 0; j < b; j++) 
            {
                System.out.print(dizi[i][j] + " ");

            }
        }
	}
	
	public static void main(String[] args) 
	{
		int a=10;
		int b=4;
		int[][] dizi = new int[a][b];
        for (int i = 0; i < a; i++) 
        {
            for (int j = 0; j < b; j++) 
            {
                if (j==0) 
                {
					dizi[i][j]=i;
				}

            }

        }
        yazdir(a, b, dizi);
        a=12;
        dizi=new int[a][b];
        yazdir(a, b, dizi);
	}

}
