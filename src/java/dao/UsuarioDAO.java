package dao;

import model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    public void inserir(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nome_completo, nome_usuario, senha, tema_favorito, idade, local) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNomeCompleto());
            stmt.setString(2, usuario.getNomeUsuario());
            stmt.setString(3, usuario.getSenha());
            stmt.setString(4, usuario.getTemaFavorito());
            stmt.setInt(5, usuario.getIdade());
            stmt.setString(6, usuario.getLocal());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
