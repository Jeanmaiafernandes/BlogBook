package model;

/**
 *
 * @author jeanm
 */
public class Usuario {
    private Integer id;
    private String nomeCompleto;
    private String nomeUsuario;
    private String senha;
    private String temasFavorito;
    private Integer idade;
    private String local;

    public Usuario() {} // construtor vazio
    
    // construtor com parâmetros
    public Usuario(String nomeCompleto, String nomeUsuario, String senha, String temasFavorito, Integer idade, String local) {
        this.nomeCompleto = nomeCompleto;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.temasFavorito = temasFavorito;
        this.idade = idade;
        this.local = local;
    }    
    public Integer getId() {
        return id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public String getTemaFavorito() {
        return temasFavorito;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getLocal() {
        return local;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTemaFavorito(String temaFavorito) {
        this.temasFavorito = temaFavorito;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
    

}
