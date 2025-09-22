package controller;

import dao.UsuarioDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;

@WebServlet(urlPatterns = {"/CadastroUsuarioServlet"})
public class CadastroUsuarioServlet extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("\n--- DEBUG: CadastroUsuarioServlet INICIADO ---");

        try {
            // 1. Recebendo os dados do formulário
            String nomeCompleto = request.getParameter("nomeCompleto");
            String nomeUsuario = request.getParameter("nomeUsuario");
            String senha = request.getParameter("senha");
            String temaFavorito = request.getParameter("temaFavorito");
            String idadeStr = request.getParameter("idade");
            String local = request.getParameter("local");

            // 2. Imprimindo os dados recebidos para verificação
            System.out.println("Recebido: nomeCompleto = [" + nomeCompleto + "]");
            System.out.println("Recebido: nomeUsuario = [" + nomeUsuario + "]");
            System.out.println("Recebido: senha = [" + senha + "]");
            System.out.println("Recebido: temaFavorito = [" + temaFavorito + "]");
            System.out.println("Recebido: idadeStr = [" + idadeStr + "]");
            System.out.println("Recebido: local = [" + local + "]");

            // 3. Preparando e criando o objeto Usuario
            Integer idade = (idadeStr != null && !idadeStr.isEmpty()) ? Integer.parseInt(idadeStr) : null;
            Usuario usuario = new Usuario(nomeCompleto, nomeUsuario, senha, temaFavorito, idade, local);
            System.out.println("Objeto Usuario criado com sucesso.");

            // 4. Chamando o DAO para inserir no banco
            UsuarioDAO dao = new UsuarioDAO();
            System.out.println("Tentando chamar dao.inserir()...");
            dao.inserir(usuario);
            System.out.println("dao.inserir() executado SEM ERROS.");

            // 5. Redirecionando para a página de sucesso
            response.sendRedirect("sucesso.jsp");
            System.out.println("Redirecionado para sucesso.jsp");

        } catch (Exception e) {
            // Se qualquer erro acontecer, ele será impresso aqui!!!
            System.out.println("!!! OCORREU UM ERRO NO SERVLET DE CADASTRO !!!");
            e.printStackTrace();
        }

        System.out.println("--- DEBUG: CadastroUsuarioServlet FINALIZADO ---\n");
    }

} 