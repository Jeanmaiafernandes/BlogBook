# Projeto BlogBook 📖

![Status](https://img.shields.io/badge/status-concluído-green)

Projeto acadêmico de um sistema web simples para um blog, desenvolvido como requisito para a matéria de Análise e Implementação de Software na Universidade de Mogi das Cruzes. A aplicação permite o cadastro e login de leitores.

## 🚀 Funcionalidades

O sistema possui as seguintes funcionalidades implementadas:
* **Cadastro de Novos Leitores:** Um formulário completo para o registro de novos usuários no sistema.
* **Login de Usuários:** Autenticação para verificar se as credenciais do usuário existem no banco de dados.
* **Perfil de Usuário:** Após o login, o usuário é direcionado para uma página de perfil que exibe suas informações cadastradas.
* **Logout:** Encerramento da sessão do usuário de forma segura.

## 🛠️ Tecnologias Utilizadas

Este projeto foi construído com as seguintes tecnologias:

* **Backend:** Java, Servlets, JSP
* **Banco de Dados:** MySQL
* **Servidor de Aplicação:** Apache Tomcat
* **Frontend:** HTML5, CSS3
* **IDE:** Apache NetBeans

## ⚙️ Como Executar o Projeto Localmente

Para rodar este projeto em seu ambiente local, siga os passos abaixo:

1.  **Clone o Repositório**
    ```sh
    git clone [https://github.com/Jeanmaiafernandes/BlogBook.git](https://github.com/Jeanmaiafernandes/BlogBook.git)
    ```
2.  **Banco de Dados**
    * Certifique-se de ter um servidor MySQL rodando (via XAMPP, por exemplo).
    * Execute o script `database/schema.sql` no seu gerenciador de banco de dados (como o phpMyAdmin) para criar o banco `MySQL` e a tabela `usuarios`.

3.  **Configuração no NetBeans**
    * Abra o projeto na IDE Apache NetBeans.
    * Adicione o driver **MySQL Connector/J** às bibliotecas do projeto.
    * Verifique se as credenciais do banco no arquivo `src/java/dao/ConnectionFactory.java` correspondem à sua configuração local (usuário `root` e senha em branco para o XAMPP padrão).

4.  **Executar**
    * Faça o "Clean and Build" do projeto.
    * Execute o projeto ("Run"). O NetBeans fará o deploy no servidor Tomcat e abrirá a aplicação no seu navegador.


## 👥 Equipe

Este projeto foi desenvolvido por:

* Jéssica Letícia Barbosa de Souza
* Jean Carlos Maia Fernandes
* Nícolas Birche Ferri Barbosa
* Victor Guimarães Felipe
