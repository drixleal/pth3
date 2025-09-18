
import java.util.Random;

public class Estacio1
{

    
    //Atributos
    private String nome;
    @SuppressWarnings("FieldMayBeFinal")
    private double codigo_identificador;
    @SuppressWarnings("FieldMayBeFinal")
    private Random aleatorio;   
    //Métodos
    public Estacio1 (String nome){
         aleatorio = new Random();
         this.setNome(nome);
         this.codigo_identificador = aleatorio.nextDouble();
    }
    private void setNome (String nome) {
         this.nome = nome;
    }  
    public String getNome () {
         return this.nome;
    }
    public double getCodigoIdentificador (){
         return this.codigo_identificador;
    }   
    public static void main(String args[]){
        Estacio1 p1 = new Estacio1("Teste A");
        System.out.println("Pessoa 1: "+p1.getNome());
        Estacio1 p2 = new Estacio1("Teste B");
        System.out.println("[Pessoa 1] nome: "+p1.getNome()+", Codigo Identificador: "+p1.getCodigoIdentificador());
        System.out.println("[Pessoa 2] nome: "+p2.getNome()+", Codigo Identificador: "+p2.getCodigoIdentificador());
    }
}
