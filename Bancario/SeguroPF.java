//import contas.Conta;

public class SeguroPF extends Conta
{

	public static void main(String[] args) 
	{
		SeguroPF cc3 = new SeguroPF();
		cc3.cliente = "Felipe Leal";
		cc3.saldo = 50000;
		System.out.println("Cliente: " + cc3.cliente);
		cc3.exibirSaldo();

	}

}