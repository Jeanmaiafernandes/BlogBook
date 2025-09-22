<%@page import="model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    // Pega o objeto 'usuarioLogado' que foi salvo na sessão pelo LoginServlet
    Usuario usuario = (Usuario) session.getAttribute("usuarioLogado");

    // Se não houver usuário na sessão (ex: tentou acessar a URL direto), redireciona para o login
    if (usuario == null) {
        response.sendRedirect("login.jsp");
        return; // Impede o resto da página de ser carregada
    }
%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Perfil de <%= usuario.getNomeCompleto() %></title>
    <link rel="stylesheet" href="css/estilo-geral.css">
    <style>
        .perfil-info { 
            line-height: 1.8; 
            text-align: left;
        }
        .perfil-info strong { 
            color: #2c3e50; 
            min-width: 150px;
            display: inline-block;
        }
        .logout-link { 
            position: absolute; 
            top: 50%; 
            right: 40px; 
            transform: translateY(-50%); 
            color: white; 
            border: 1px solid white; 
            padding: 8px 15px; 
            border-radius: 5px; 
            text-decoration: none; 
        }
        .logout-link:hover { 
            background-color: white; 
            color: #2c3e50; 
        }
    </style>
</head>
<body>
    <header>
        <h1>Universo Paralelo</h1>
        <a href="LogoutServlet" class="logout-link">Logout</a>
    </header>

    <main class="container">
        <h2>Perfil do Leitor</h2>
        <div class="perfil-info">
            <p><strong>Nome Completo:</strong> <%= usuario.getNomeCompleto() %></p>
            <p><strong>Nome de Usuário:</strong> <%= usuario.getNomeUsuario() %></p>
            <p><strong>Temas Favoritos:</strong> <%= usuario.getTemaFavorito() %></p>
            <p><strong>Idade:</strong> <%= usuario.getIdade() != null ? usuario.getIdade() : "Não informado" %></p>
            <p><strong>Local:</strong> <%= usuario.getLocal() != null && !usuario.getLocal().isEmpty() ? usuario.getLocal() : "Não informado" %></p>
        </div>
    </main>

    <footer>
        &copy; 2025 Universo Paralelo
    </footer>
</body>
</html>