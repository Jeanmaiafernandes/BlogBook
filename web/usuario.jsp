<%-- 
    Document   : Controle de acesso - senha
    Created on : 18 de ago. de 2025, 20:08:49
    Author     : Nícolas & Jéssica
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Acesso</title>
    </head>
    <body>
        <h1>Entre com o Login!</h1>
        <%
            //Enter
            
            // uso = Parâmetro 1
            String usu = request.getParameter("usuario");
            // sen = Parâmetro 2
            String sen = request.getParameter("senha");
            
            if (usu.equals("EternoMadruguinha88") && sen.equals("FimEraL44")){
                out.println(usu + "<br>Senha correta! Acesso Liberado!");
            }else{
                out.println(usu + "<br>Acesso Negado! Vaza daqui gente ruim!");
            }

        %>
    </body>
</html>
