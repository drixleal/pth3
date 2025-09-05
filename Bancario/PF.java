public class PF 
{

	public static void main(String[] args) 
	{
		Conta cc1 = new Conta();
		cc1.cliente = "Adriano Leal";
		cc1.saldo = 30000;
		System.out.println("Cliente: " + cc1.cliente);
		cc1.exibirSaldo();

	}

}