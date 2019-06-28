package baslangicJavaProjeleri;

public class UcgenOlabilenKenarlar 
{

	public static void main(String[] args) 
	{
		for (int i = 1; i <= 10; i++) 
		{
			for (int j = 1; j <= 10; j++) 
			{
				for (int k = 1; k <=10; k++) 
				{
					OlmaDurumu(i, j, k);
				}
			}
		}
	}
	private static void OlmaDurumu(int k1, int k2, int k3) 
	{
		if(k1+k2>k3)
			if(k1+k3>k2)
				if(k2+k3>k1)
				{
					System.out.println(k1 +" - "+k2+" - "+k3);
				}
	}

}
