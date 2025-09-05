public class Conta 
{
	//atributos
	protected String cliente;
	protected double saldo;
	//construtor
	public Conta()
	{
		System.out.println("Ag 1279");
	}
	//métodos
	protected void exibirSaldo()
	{
		System.out.println("Saldo: R$ " + saldo);
	}

}