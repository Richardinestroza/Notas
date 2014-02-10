import java.util.Scanner;


public class notas 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner mi_scanner=new Scanner(System.in);
		for(int i=0; i<3; i ++);
		{
			System.out.print("Ingrese un nota: ");
			int nota=mi_scanner.nextInt();
			if(nota>=90)
			{
				System.out.print("Excelente");
			}else if(nota>=80)
			{
				System.out.print("Sobresaliente");
			}
			if(nota>=80)
			{
				System.out.print("Aprobado");
			}else if(nota>=60)
			{System.out.print("Reprobado");
		}
	}

	}
}
