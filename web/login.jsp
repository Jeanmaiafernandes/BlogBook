<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login - Universo Paralelo</title>
<%-- Usando o mesmo arquivo de estilo para manter a aparência --%>
<link rel="stylesheet" href="css/popup.css">
</head>
<body>
<header>
    <h1>Login de Leitor</h1>
</header>

<main>
    <%-- Form agora aponta para o Servlet de Login --%>
    <form class="cadastro" action="LoginServlet" method="post">
        
        <label>Nome de usuário *</label>
        <input type="text" name="nomeUsuario" required>
            
        <label> Senha *</label>
        <input type="password" name="senha" required>

        <button type="submit">Entrar</button>
    </form>
    
    <div style="text-align: center; margin-top: 20px;">
        <a href="usuario.jsp">Ainda não tem conta? Cadastre-se</a>
    </div>
</main>

<footer>&copy; 2025 Universo Paralelo</footer>
</body>
</html>