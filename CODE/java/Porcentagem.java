//package exec;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Porcentagem 
{

	public static void main(String[] args) 
	{
		double x, y, resultado;
		
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		//-----------------------------------------------------------
		System.out.println("Porcentagem (R. 3)");
		System.out.println("\n--------------------------\n");
		//-----------------------------------------------------------
		System.out.print("Insira o nº da porcentagem: ");
		x = keyboard.nextDouble();
		System.out.print("Insira o nº para calcular: ");
		y = keyboard.nextDouble();
		//-----------------------------------------------------------
		resultado = (x * y) / 100;  
		//-----------------------------------------------------------
		System.out.println("Resultado");
		System.out.println(x + "% de " + y + " = " + formatador.format(resultado));
		//-----------------------------------------------------------
		keyboard.close();
		System.out.println("\n--------Powered by--------");
		System.out.println("####    #####  #  #     #\n#   #   #   #  #   #   #\n#    #  # #    #    ###\n#   #   #  #   #   #   #\n####    #   #  #  #     #");
	}
	
} 