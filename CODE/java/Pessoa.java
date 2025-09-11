
import java.util.Random;
    //Classe
    @SuppressWarnings("FieldMayBeFinal")
    public class Pessoa 
    {  
       
    //Atributos
    private String nome;
    
    private int codigo_identificador;
    
    private Random aleatorio;   

    //Métodos
    public Pessoa (String nome)
    {
         aleatorio = new Random();
         this.setNome(nome);
         this.codigo_identificador = aleatorio.nextInt(90000) + 10000;
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
        Pessoa p2 = new Pessoa("Teste B");
        System.out.println("[Pessoa 1] nome: "+p1.getNome()+", Codigo Identificador: "+p1.getCodigoIdentificador());
        System.out.println("[Pessoa 2] nome: "+p2.getNome()+", Codigo Identificador: "+p2.getCodigoIdentificador());
    }

}