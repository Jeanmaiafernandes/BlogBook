package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe responsável por criar e gerenciar a conexão com o banco de dados.
 */
public class ConnectionFactory {
    // URL de conexão com o banco de dados MySQL
    private static final String URL = "jdbc:mysql://localhost:3306/MySQL";
    // Usuário do banco de dados (padrão do XAMPP)
    private static final String USER = "root";
    // Senha do banco de dados (padrão do XAMPP é vazia)
    private static final String PASSWORD = "";

    /**
     * Tenta obter uma conexão com o banco de dados.
     * @return um objeto Connection se a conexão for bem-sucedida.
     * @throws SQLException se o driver JDBC não for encontrado ou a conexão falhar.
     */
    public static Connection getConnection() throws SQLException {
        try {
            // Carrega a classe do driver JDBC do MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // Lança uma exceção se o driver .jar não estiver no projeto
            throw new SQLException("Driver JDBC não encontrado", e);
        }
        // Retorna a conexão estabelecida com o banco de dados
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}