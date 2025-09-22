<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset="UTF-8">
    <title>Erro de Login</title>
    
    <style>
        body {
            margin: 0;
            font-family: system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
            background-color: #f0f2f5;
            color: #333;
        }
        header, footer {
            background-color: #2c3e50;
            color: white;
            text-align: center;
            padding: 20px;
        }
        header h1 {
            color: white;
            font-size: 24px;
            margin: 0;
        }
        .container {
            max-width: 600px;
            margin: 60px auto;
            padding: 40px;
            background-color: white;
            text-align: center;
            border-radius: 8px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
        }
        .container h1 {
            color: #dc3545; 
            font-size: 28px;
        }
        p {
            font-size: 18px;
            color: #555;
        }
        .botoes a {
            display: inline-block;
            margin-top: 30px;
            text-decoration: none;
            color: white;
            background-color: #007bff;
            padding: 12px 25px;
            border-radius: 5px;
            margin: 10px;
            font-weight: bold;
            transition: background-color 0.3s;
        }
        .botoes a:hover {
            background-color: #0056b3;
        }
    </style>

</head>
<body>
    <header>
        <h1>Universo Paralelo</h1>
    </header>

    <main class="container">
        <h1>Usuário ou senha inválidos!</h1>
        <p>Por favor, verifique os dados digitados e tente novamente.</p>
        <div class="botoes">
            <a href="login.jsp">Tentar Novamente</a>
            <a href="index.html">Voltar para a Página Inicial</a>
        </div>
    </main>

    <footer>
        &copy; 2025 Universo Paralelo
    </footer>
</body>
</html>