
import java.util.ArrayList;

public class Main

{
    public static void main(String[] args)
    
    {
                
        /**
         
         
        int myAge = 30;
        String myName = "Drix";
        var myLastName = "Leal";

        myAge = 31;
        myLastName = "Leal's";

        //--------------------------------------
        byte => 8 bits => -128 to 127
        short => 16 bits => -32.768 to 32.767
        int => 32 bits => -2.147.483.648 to 2.147.483.647
        long => 64 bits => -9.223.372.036.854.775.808 to 9.223.372.036.854.775.807

        float => 32 bits => simple precision => 1.4E-45 to 3.4028235E38
        double => 64 bits => double precision => 4.9E-324 to 1.7976931348623157E308

        String => sequence of characters => "text"
        
        char => 16 bits => '\u0000' to '\uffff'

        boolean => 1 bit => true or false
        // -------------------------------------
        */
       
     //------------------------------------------------------
       //Declare Variables
       byte b = 127;
       short s = 32767;
       int i = 95;
       long l = 9223372036854775807L;
       float f = 3.4028235E38F;
       double d = 1.7976931348623157E308;
       char c = 'A';
       boolean bool = false;
       String str = "Adrian";
     //------------------------------------------------------
     /** 
     //Vectors Collections
        int[] integralNumb = {10, 20, 30, 40, 50};


     //Insert Conditional
        if(b == 127)
        {
            System.out.println("It's ok");
        } 
        else if(b == 128)
        {
            System.out.println("Test ok");
        } 
        else 
        {
            System.out.println("It's not ok");
        }


     //Print Vector
     System.out.println(integralNumb[4]);
     
     */
    //------------------------------------------------------
     String[] cars = new String[5];
        cars[0] = "BMW";
        cars[1] = "Audi";
        cars[2] = "Volvo";
        cars[3] = "Mazda";

     //------------------------------------------------------   
     ArrayList<String> names = new ArrayList<String>();
        names.add("Adrian");
        names.add("Drix");
        names.add("Leal");
        names.add("Java");

     //------------------------------------------------------
     /*System.out.println(names.get(0));

     names.remove(0);{"BMW", "Audi", "Volvo", "Mazda"}
     names.remove("Drix");

     System.out.println(names.get(0));*/
     //------------------------------------------------------

       /* for (int j = 0; j < names.size(); j++) 
        {
            System.out.println(names.get(j));
        }

        for (int k = 0; k < cars.length; k++) 
        {
            System.out.println(cars[k]);
        }
        */

        int contable = 0;
        while (contable < 5) 
        {
            System.out.println("Contable: " + contable);
            contable++;
        }
        //--------------------CASTING---------------------
        /*
        double result = 0.0;
        int resultnumb = (int) result; // Explicit casting: double to int

        int myInt = 10;
        double myDouble = myInt; // Implicit casting: int to double

        String myString = "10";
        int myInt2 = Integer.parseInt(myString); // Convert String to int

        String mineString = String.valueOf(myInt2); // Convert int to String
        */




    }
}