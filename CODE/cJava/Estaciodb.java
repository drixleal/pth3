// Importações necessárias do pacote java.sql
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Estaciodb {

    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        
        // --- DADOS DA CONEXÃO ---
        // A "Connection String" para o nosso banco de dados 'escola' no Derby
        String url = "jdbc:derby://localhost:1527/escola";
        String user = "drix"; // O usuário que você criou
        String password = "Xbox360@d"; // A senha que você criou

        // --- O BLOCO TRY-WITH-RESOURCES ---
        // A Connection é aberta aqui e será fechada AUTOMATICAMENTE no final.
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            
            System.out.println("Conexão com o banco de dados 'escola' estabelecida com sucesso!");

            // --- 1. CREATE (Inserir um novo aluno) ---
            System.out.println("\n--- 1. INSERINDO UM NOVO ALUNO ---");
            String sqlInsert = "INSERT INTO ALUNO (MATRICULA, NOME, ENTRADA) VALUES (?, ?, ?)";
            
            // Usando PreparedStatement para segurança
            try (PreparedStatement pst = con.prepareStatement(sqlInsert)) {
                pst.setString(1, "B2025.0001"); // Parâmetro 1 (MATRICULA)
                pst.setString(2, "Adriano Leal");   // Parâmetro 2 (NOME)
                pst.setInt(3, 2025);           // Parâmetro 3 (ENTRADA)
                
                int linhasAfetadas = pst.executeUpdate(); // Executa o INSERT
                System.out.println("Aluno inserido com sucesso! Linhas afetadas: " + linhasAfetadas);
            }

            // --- 2. READ (Ler e listar todos os alunos) ---
            System.out.println("\n--- 2. LISTANDO ALUNOS ---");
            String sqlSelect = "SELECT MATRICULA, NOME, ENTRADA FROM ALUNO";
            
            try (PreparedStatement pst = con.prepareStatement(sqlSelect);
                 ResultSet rs = pst.executeQuery()) { // ResultSet também é fechado automaticamente
                
                // O loop 'while (rs.next())' percorre cada linha retornada pela consulta
                while (rs.next()) {
                    String matricula = rs.getString("MATRICULA");
                    String nome = rs.getString("NOME");
                    int entrada = rs.getInt("ENTRADA");
                    System.out.println("  -> Matrícula: " + matricula + ", Nome: " + nome + ", Ano de Entrada: " + entrada);
                }
            }

            // --- 3. UPDATE (Atualizar o nome de um aluno) ---
            System.out.println("\n--- 3. ATUALIZANDO UM ALUNO ---");
            String sqlUpdate = "UPDATE ALUNO SET NOME = ? WHERE MATRICULA = ?";
            
            try (PreparedStatement pst = con.prepareStatement(sqlUpdate)) {
                pst.setString(1, "Adriano L. Cardoso"); // Novo NOME
                pst.setString(2, "B2025.0001");         // MATRICULA do aluno a ser atualizado
                
                int linhasAfetadas = pst.executeUpdate();
                System.out.println("Aluno atualizado com sucesso! Linhas afetadas: " + linhasAfetadas);
            }
            
            // --- 4. DELETE (Remover um aluno) ---
            System.out.println("\n--- 4. REMOVENDO UM ALUNO ---");
            String sqlDelete = "DELETE FROM ALUNO WHERE MATRICULA = ?";
            
            try (PreparedStatement pst = con.prepareStatement(sqlDelete)) {
                pst.setString(1, "B2025.0001"); // MATRICULA do aluno a ser removido
                
                int linhasAfetadas = pst.executeUpdate();
                System.out.println("Aluno removido com sucesso! Linhas afetadas: " + linhasAfetadas);
            }
            
        } catch (SQLException e) {
            // Se qualquer operação de banco de dados falhar, a exceção será capturada aqui.
            System.err.println("Ocorreu um erro ao interagir com o banco de dados.");
            e.printStackTrace(); // Imprime o "relatório do acidente" completo para depuração.
        }
    }
}