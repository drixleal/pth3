public class Conta 

{
	@SuppressWarnings({"override", "unused"})
    //atributos
	String cliente;
	double saldo;
	//construtor
	public Conta()
	{
		System.out.println("Ag 1279");
	}
	//métodos
        @SuppressWarnings("unused")
	void exibirSaldo()
	{
		System.out.println("Saldo: R$ " + saldo);
	}

}