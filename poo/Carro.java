//package poo;

import java.util.Random;

public class Carro //Tipo/modelo do objeto a ser criado/construído. 
{
	//Variáveis
	int ano;
	String cor;
	//---------
	
	public Carro() //Construtor
	{
		Random gerador = new Random();
		int chassi = gerador.nextInt(1000);
		System.out.println("Chassi: " + chassi);
	}
	
	public Carro(int ano, String cor) //Construtor
	{
		this.ano = ano;
		this.cor = cor;
		System.out.println("\n####    #####  #  #     #\n#   #   #   #  #   #   #\n#    #  # #    #    ###\n#   #   #  #   #   #   #\n####    #   #  #  #     #");
	} 
	
	//Métodos/ações
	void ligar() 
	{
		System.out.println("turn-ON");
	}
	
	void desligar()
	{
		System.out.println("turn-OFF");
	}
	
	void acelerar()
	{
		System.out.println("speed");
	}
	//-------------(void é o método que simplesmente é executado)



}