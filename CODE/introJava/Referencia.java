@SuppressWarnings("unused")
class Aluno 
{
@SuppressWarnings("unused")
    private String nome;
@SuppressWarnings("unused")
    private int idade;
    public Aluno ( String nome , int idade ) 
    {
         this.nome = nome;
         this.idade = idade;
    }
    public void definirNome ( String nome ) 
    {
         this.nome = nome;
    }  
    public void definirIdade ( int idade ) 
    {
         this.idade = idade;
    }
    public String recuperarNome () 
    {
         return this.nome;
    }     
}
@SuppressWarnings("unused")
public class Referencia  
{
     @SuppressWarnings("FieldMayBeFinal")
       private Aluno a1 , a2;
     @SuppressWarnings("OverridableMethodCallInConstructor")
       public Referencia() 
       {
        a1 = new Aluno ( "Carlos" , 20);
        a2 = new Aluno ( "Ana" , 23 );
        System.out.println("O nome do aluno a1 eh " + a1.recuperarNome());
        System.out.println("O nome do aluno a2 eh " + a2.recuperarNome());
        a1 = a2;
        a2.definirNome("Flavia");
        System.out.println("O nome do aluno a1 eh " + a1.recuperarNome());
        manipulaAluno ( a1 );
        System.out.println("O nome do aluno a1 eh " + a1.recuperarNome());
       }
       @SuppressWarnings("unused")
       public void manipulaAluno ( Aluno aluno ) 
       {
        aluno.definirNome("Marcia");
       }
       public static void main(String args[]) {
           @SuppressWarnings("unused")
           Referencia r = new Referencia ();
           System.out.println("Fim da Execucao ");
    }
}