import java.util.Scanner;


public class Newproyect 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		for(int i=0;i<5;i ++)
		{
			System.out.println("Ingrese un numero: ");
			
			Scanner mi_scanner=new Scanner(System.in);
			int x=mi_scanner.nextInt();
			if (x == 10)
			{
				System.out.print("es igual a 10");
			} else
			{
			
				System.out.println("es diferente a 10");
			}
		}

	}
}

