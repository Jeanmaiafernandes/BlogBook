<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Cadastro - Universo Paralelo</title>
<%-- Assumindo que o estilo do seu formulário está em popup.css --%>
<link rel="stylesheet" href="css/popup.css"> 
</head>
<body>
<header>
    <h1>Cadastro de Leitor</h1>
</header>

<main>
    <%-- Form agora aponta para o Servlet de Cadastro --%>
    <form class="cadastro" action="CadastroUsuarioServlet" method="post">
        <label>Nome completo *</label>
        <input type="text" name="nomeCompleto" required>

        <label>Nome de usuário *</label>
        <input type="text" name="nomeUsuario" required>
            
        <label> Senha *</label>
        <input type="password" name="senha" required>
        
        <label> Confirmação de Senha *</label>
        <%-- O backend não valida este campo ainda, mas o mantemos na interface --%>
        <input type="password" name="confirmacaoSenha" required>

        <label>Temas favoritos *</label>
        <textarea name="temaFavorito" required></textarea>

        <label>Idade (opcional)</label>
        <input type="number" name="idade" min="0">

        <label>Local (opcional)</label>
        <input type="text" name="local">

        <button type="submit">Cadastrar</button>
    </form>
</main>

<footer>&copy; 2025 Universo Paralelo</footer>
</body>
</html>