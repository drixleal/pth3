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
		System.out.println("Insira o nº da porcentagem: ");
		x = keyboard.nextDouble();
		System.out.println("Insira o nº para calcular: ");
		y = keyboard.nextDouble();
		//-----------------------------------------------------------
		resultado = (x / 100) * y;
		//-----------------------------------------------------------
		System.out.println("Resultado");
		System.out.println(formatador.format(x) + "% de " + formatador.format(y) + " = " + formatador.format(resultado));
		//-----------------------------------------------------------
		keyboard.close();
		System.out.println("\n--------Powered by--------");
		System.out.println("####    #####  #  #     #\n#   #   #   #  #   #   #\n#    #  # #    #    ###\n#   #   #  #   #   #   #\n####    #   #  #  #     #");
	}
	
} 