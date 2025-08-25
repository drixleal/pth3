//Created by @drixleal

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
		int o = 8;
		
		
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
		System.out.println("\n---------------------------------\n");
		System.out.println("i = " + i + " + 5 | i = " + (i + 5));
		System.out.println("i = " + i + " - 5 | i = " + (i - 5));
		System.out.println("i = " + i + " * 5 | i = " + (i * 5));
		System.out.println("i = " + i + " / 5 | i = " + (i / 5));
		System.out.println("i = " + i + " % 5 | i = " + (i % 5));
		System.out.println("\n---------------------------------\n");
		System.out.println("i += 5  |  i =" + (i += 5));
		System.out.println("i -= 5  |  i =" + (i -= 5));
		System.out.println("i *= 5  |  i =" + (i *= 5));
		System.out.println("i /= 5  |  i =" + (i /= 5));
		System.out.println("\n---------------------------------\n");
		
//--------------------------------------------------------------
		
		
		//Add one more number to calculate
				o++;
		System.out.println("i++  | i = " + o);
				
		//Remove one more number to calculate above
				o--;
		System.out.println("i--  | i = " + o);
		System.out.println("\n---------------------------------\n");
		

//End of the Code-----------------------------------------------
		System.out.println("__________Powered by Drix___________\n");
		
	}
}