public class Cessna 
{

	public static void main(String[] args) 
	{
		Aviao cessna = new Aviao();
		cessna.ano = 2030;
		cessna.cor = "Preto";
		cessna.envergadura = 11;
		System.out.println("Aviao: Cessna");
		System.out.println("Ano: " + cessna.ano);
		System.out.println("Cor: " + cessna.cor);
		System.out.println("Envergadura: " + cessna.envergadura + "m");
		cessna.ligar();
		cessna.acelerar();
		cessna.aterrizar();
		cessna.desligar();

	}

}