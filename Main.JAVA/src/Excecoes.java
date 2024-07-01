import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Excecoes {


    public static void main(String[] args) {

        /*
//        try {
//            //Código que pode lançar uma exceção
//            int[] numeros = {1, 2, 3};
//            System.out.println("O número na posição 4 é: " + numeros[3]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            //Tratamento da exceção
//            System.out.println("Erro: Tentativa de acessar um índice fora dos limites do array.");
//        }
//        try {
//            int resultado = 10 / 0;
//        } catch (ArithmeticException e) {
//            System.out.println("Erro: Tentativa de divisão por zero.");
//        }
//        System.out.println("O programa continua executando normalmente após o tratamento da exceção.");
*/

        Connection connection = null; //Variável que armazenará a conexão com o banco de dados
        Statement statement = null;

        try {
            //Parâmetros para conexão com o banco de dados
            String url = "jdbc:postgresql://localhost:5432/boracodar";
            String user = "postgres";
            String password = "sua_senha";

            //Estabelecendo conexão com o banco de dados

            connection = DriverManager.getConnection(url, user, password);

            System.out.println("Conexão estabelecida com Sucesso!");

            //Criando uma declaração
            statement = connection.createStatement();

            String sql = "SELECT * FROM sua_tabela";
            statement.executeQuery(sql);
            System.out.println("Consulta executada com Sucesso!");
        } catch (SQLException e) {
            //Tratamento da exceção
            System.out.println("Erro: ao se conectar ou executar a consulta." + e.getMessage());
        } finally {
            //Fechando conexão com o banco de dados
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Conexão fechada com Sucesso!");
                }
                if (statement != null) {
                    connection.close();
                    System.out.println("Statement fechada com Sucesso!");
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão com o banco de dados.");
            }
        }

    }
}
