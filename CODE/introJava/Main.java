
import java.util.ArrayList;
@SuppressWarnings("UnusedAssignment")
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
       @SuppressWarnings("UnusedAssignment")
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
    @SuppressWarnings("UnusedAssignment")
     String[] cars = new String[5];
        cars[0] = "BMW";
        cars[1] = "Audi";
        cars[2] = "Volvo";
        cars[3] = "Mazda";

     //------------------------------------------------------   
     @SuppressWarnings("UnusedAssignment")
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



/*
 package alunoEstacio;

import java.util.Random;

//Classe
	public class Pessoa 
	{    

		//Atributos
		private String nome;
		private double codigo_identificador;
		private Random aleatorio;  
		
		//Métodos
			public Pessoa (String nome)
			{
				aleatorio = new Random();
				this.setNome(nome);
				this.codigo_identificador = aleatorio.nextDouble();
			}
			
			private void setNome (String nome) 
			{
				this.nome = nome;
			}  
			
			public String getNome () 
			{
				return this.nome;
			}
			
			public double getCodigoIdentificador ()
			{
				return this.codigo_identificador;
			}
			
			public static void main(String args[])
			{
				Pessoa p1 = new Pessoa("Teste A");
				System.out.println("Pessoa 1: "+p1.getNome());
			}
			
	}
 */
//----------------------------------------------------------------------------
 /*
  package alunoEstacio;

// PRECISAMOS IMPORTAR AS FERRAMENTAS PARA CRIAR LISTAS!
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pessoa {

    // A classe Pessoa continua exatamente a mesma. Nenhuma alteração aqui.
    // --- Atributos ---
    private String nome;
    private int codigo_identificador;
    private Random aleatorio;

    // --- Construtor ---
    public Pessoa(String nome) {
        aleatorio = new Random();
        this.setNome(nome);
        this.codigo_identificador = aleatorio.nextInt(90000) + 10000;
    }

    // --- Métodos ---
    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public int getCodigoIdentificador() {
        return this.codigo_identificador;
    }

    // --- Método Principal ---
    // A MÁGICA ACONTECE AQUI!
    public static void main(String args[]) {

        // 1. Criamos uma lista vazia que vai guardar objetos do tipo Pessoa.
        List<Pessoa> listaDePessoas = new ArrayList<>();

        // 2. Adicionamos nossas pessoas à lista.
        // Podemos adicionar quantas quisermos!
        listaDePessoas.add(new Pessoa("Teste A"));
        listaDePessoas.add(new Pessoa("Teste B"));
        listaDePessoas.add(new Pessoa("Teste C")); // Adicionei um extra pra mostrar a vantagem!

        // 3. Criamos o laço de repetição (loop "for").
        // Ele vai executar o bloco de código para cada item da lista.
        // O 'i' é um contador que começa em 0 e vai até o tamanho da lista.
        for (int i = 0; i < listaDePessoas.size(); i++) {
            
            // Pegamos a pessoa da lista na posição atual do contador 'i'.
            Pessoa pessoaAtual = listaDePessoas.get(i);
            
            // Montamos a string de saída.
            // Usamos '(i + 1)' para que a contagem comece em "Pessoa 1" em vez de "Pessoa 0".
            System.out.println("[Pessoa " + (i + 1) + "]nome: " + pessoaAtual.getNome() + ", Código Identificador: " + pessoaAtual.getCodigoIdentificador());
        }
    }
}
  */