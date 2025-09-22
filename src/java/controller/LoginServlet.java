package controller;

import dao.UsuarioDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Usuario;

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet { 

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        System.out.println("\n--- DEBUG: LoginServlet foi chamado! ---");

        String nomeUsuario = request.getParameter("nomeUsuario");
        String senha = request.getParameter("senha");

        System.out.println("Recebido do formulário - Usuário: [" + nomeUsuario + "]");
        System.out.println("Recebido do formulário - Senha: [" + senha + "]");

        UsuarioDAO dao = new UsuarioDAO();
        Usuario usuario = dao.buscarPorLogin(nomeUsuario, senha);

        if (usuario != null) {
            System.out.println("DAO encontrou o usuário: " + usuario.getNomeCompleto());
            HttpSession session = request.getSession();
            session.setAttribute("usuarioLogado", usuario);
            response.sendRedirect("bemvindo.jsp");
        } else {
            System.out.println("DAO retornou null. Usuário não encontrado ou senha incorreta.");
            response.sendRedirect("erroLogin.jsp");
        }
        System.out.println("--- DEBUG: Fim do LoginServlet ---");
    }

} 