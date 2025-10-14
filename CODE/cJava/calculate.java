//Created by @drixleal
@SuppressWarnings("UnusedAssignment")
public class calculate 

{

	public static void main(String[] args) 
	
	{
//-------------------------VARIABLES PART-------------------------------
		
		//Display your name in console
		String name = "Drix Leal"; 
		
		// Print the preset age value to the console
		int age = 30;
		
		// Print the sex-character value to the console
		char sex = 'M';
		
		// Print the temperature-character value to the console
		String carac = "ºc";
		
		// Print the preset temperature value to the console
		double temperature = 29.5;
		
		// Print the boolean value to the console
		boolean airC = false;
		
		//Inserts the number to calculate
		double i = 10;
		double o = 8;
		
		//Select the option
		int opt = 1;
		
		//While repeat
		short cont = 1;
		char newGame;
		
		

		
		
		
//Start of the Code---------------------------------------------
		System.out.println("\n__________Powered by Drix___________\n");
		
		// Console output {Text Part}
		System.out.println("Name: " + name + ("\n"));
		System.out.println("Age: " + age + ("\n"));
		System.out.println("Sex: " + sex + ("\n"));
		System.out.println("Temp: " + temperature + carac + ("\n"));
		System.out.println("AC: " + airC + ("\n"));
		System.out.println("____________________________________\n");
		
		// Console output {Arithmetic Operators Part}
		System.out.println("Arithmetic Operators and Assignments");
		System.out.println("\nExamples:\n");
		System.out.println("i = " + i );
		System.out.println("o = " + o );
		System.out.println("\n---------------------------------\n");
		System.out.println("i = " + i + " + 5 | i = " + (i + 5));
		System.out.println("i = " + i + " - 5 | i = " + (i - 5));
		System.out.println("i = " + i + " * 5 | i = " + (i * 5));
		System.out.println("i = " + i + " / 5 | i = " + (i / 5));
		System.out.println("i = " + i + " % 5 | i = " + (i % 5));
		System.out.println("\n---------------------------------\n");
		System.out.println("i += 5  |  i = " + (i += 5));
		System.out.println("i -= 5  |  i = " + (i -= 5));
		System.out.println("i *= 5  |  i = " + (i *= 5));
		System.out.println("i /= 5  |  i = " + (i /= 5));
		System.out.println("\n---------------------------------\n");
		
//--------------------------------------------------------------
		
		
		//Add one more number to calculate
				o++;
		System.out.println("o++  | o = " + o);
				
		//Remove one more number to calculate above
				o--;
		System.out.println("o--  | o = " + o);
		System.out.println("\n---------------------------------\n");
		
//--------------------------------------------------------------

		System.out.println("\n--------CONTROL-STRUCTURES-------\n");
		System.out.println("\nConditional Control of Structures\n");
//--------------------------------------------------------------
		System.out.println("\n____________________________________\n");
		System.out.println("\nFirst Example - The 'if' use\n");
		if (sex == 'M')
		{
			System.out.println("\nMandatory Enlistment\n" + sex);
		}
//--------------------------------------------------------------
		System.out.println("\n____________________________________\n");
		System.out.println("\nSecond Example - The 'if - else' use\n");
		if (age < 18)
		{
			System.out.println("\nUnder Age\n");
		}
		
		else
		{
			System.out.println("\nOf Legal Age\n");
		}
//--------------------------------------------------------------
		System.out.println("\n____________________________________\n");
		System.out.println("\nThird Example - The 'if - else if- else' use\n");
		if (age < 16)
		{
			System.out.println("\nDon't Vote\n");
		}
		
		else if (age >= 18 && age <= 70)
		{
			System.out.println("\nMandatory Vote\n");
		}
		
		else
		{
			System.out.println("\nOptional Vote\n");
		}
		
//--------------------------------------------------------------
		System.out.println("\n____________________________________\n");
		System.out.println("\nFourth Example - The Switch Case use\n");
		System.out.println("1. Customer Registration");
		System.out.println("2. User Registration");
		System.out.println("3. Reports\n");
		
		switch (opt)
		{
		case 1 -> System.out.println("Customers");
		case 2 -> System.out.println("User");
		case 3 -> System.out.println("Reports");
		default -> System.out.println("Invalid Option");
		}
		
//--------------------------------------------------------------
		System.out.println("\n____________________________________\n");
		System.out.println("\nFifth Example - The 'For' use\n");
		
		for (byte j = 3; j > -3; j--)
		{
			System.out.println("Check: " + j);
		}

		
		
		
//--------------------------------------------------------------
		System.out.println("\n____________________________________\n");
		System.out.println("\nSixth Example - The 'For' use\n");
		System.out.println("\nMultiplication Table\n");
				
		for (byte tabu = 1; tabu <= 10; tabu++)
		{
			System.out.println("\n---------------------------------\n");
			System.out.println("Result: \n");
			for (byte valor = 1; valor <= 10; valor++)
			{
				System.out.println(valor + " + " + tabu + " = " + (valor + tabu));
			}			
		}				
		

//--------------------------------------------------------------
		System.out.println("\n____________________________________\n");
		System.out.println("\nSepth Example - The 'While' use\n");
		
		
		while (cont <= 10)
		{
			System.out.println(cont);
			cont++;
		}


//--------------------------------------------------------------
		System.out.println("\n____________________________________\n");
		System.out.println("\nOcth Example - The 'Do-While' use\n");
		
		do
		{
			System.out.println("\nWould you like restart? (y/n)\n");
			newGame = 'n';
		}
		while (newGame == 's');
		System.out.println("Game Over!");
		
		
		
		
//End of the Code-----------------------------------------------
		
		System.out.println("\n____________________________________");
		System.out.println("__________Powered by Drix___________\n");
		
	}
}