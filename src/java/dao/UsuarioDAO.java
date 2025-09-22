package dao;

import model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Classe de Acesso a Dados (DAO) para a entidade Usuario.
 * Esta classe é responsável por toda a interação com a tabela 'usuarios' no banco de dados.
 */
public class UsuarioDAO {

    /**
     * Insere um novo objeto Usuario no banco de dados.
     */
    public void inserir(Usuario usuario) {
        // Define o comando SQL para a inserção. Os '?' são placeholders para os valores.
        String sql = "INSERT INTO usuarios (nome_completo, nome_usuario, senha, tema_favorito, idade, local) VALUES (?, ?, ?, ?, ?, ?)";

        // Bloco try-with-resources: garante que a conexão e o PreparedStatement serão fechados automaticamente.
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Define os parâmetros da query com os dados do objeto Usuario.
            // A ordem dos 'set' corresponde à ordem dos '?' no comando SQL.
            stmt.setString(1, usuario.getNomeCompleto());
            stmt.setString(2, usuario.getNomeUsuario());
            stmt.setString(3, usuario.getSenha());
            stmt.setString(4, usuario.getTemaFavorito());
            stmt.setInt(5, usuario.getIdade());
            stmt.setString(6, usuario.getLocal());

            // Executa o comando de inserção no banco de dados.
            stmt.executeUpdate();

        } catch (SQLException e) {
            // Em caso de erro de SQL (ex: conexão falhou, dados duplicados), imprime o erro no console.
            e.printStackTrace();
        }
    }

    /**
     * Busca um usuário no banco de dados pelo nome de usuário e senha para fins de login.
     * @param nomeUsuario O nome de usuário para a busca.
     * @param senha A senha para a verificação.
     * @return Um objeto Usuario preenchido se as credenciais estiverem corretas, caso contrário, retorna null.
     */
    public Usuario buscarPorLogin(String nomeUsuario, String senha) {
        // Define o comando SQL para a seleção (busca).
        String sql = "SELECT * FROM usuarios WHERE nome_usuario = ? AND senha = ?";
        // Inicializa o objeto de retorno como nulo. Ele só será preenchido se o usuário for encontrado.
        Usuario usuario = null;

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Define os parâmetros da cláusula WHERE para filtrar a busca.
            stmt.setString(1, nomeUsuario);
            stmt.setString(2, senha);

            // Executa a query de busca e armazena o resultado em um objeto ResultSet.
            ResultSet rs = stmt.executeQuery();

            // O método .next() move o cursor para a primeira linha de resultado.
            // Se ele retornar 'true', significa que a busca encontrou um usuário.
            if (rs.next()) {
                // Se encontrou, cria um novo objeto Usuario...
                usuario = new Usuario();
                // ...e o popula com os dados retornados do banco.
                usuario.setId(rs.getInt("id"));
                usuario.setNomeCompleto(rs.getString("nome_completo"));
                usuario.setNomeUsuario(rs.getString("nome_usuario"));
                usuario.setTemaFavorito(rs.getString("tema_favorito"));
                usuario.setIdade(rs.getInt("idade"));
                usuario.setLocal(rs.getString("local"));
            }

        } catch (SQLException e) {
            // Captura e imprime possíveis erros de SQL.
            e.printStackTrace();
        }
        
        // Retorna o objeto Usuario (se encontrado) ou null (se não foi encontrado ou em caso de erro).
        return usuario;
    }
}