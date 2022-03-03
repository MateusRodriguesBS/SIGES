/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Lozkillers
 */
public class Usuarios{
    private String codusuario;
    private String nome;
    private String senha;
    private int perfil;

    public Usuarios(String codusuario, String nome, String senha, int perfil) {
        this.codusuario = codusuario;
        this.nome = nome;
        this.senha = senha;
        this.perfil = perfil;
    }

    public String getCodusuario() {
        return codusuario;
    }

    public void setCodusuario(String codusuario) {
        this.codusuario = codusuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString(){
    
    return codusuario + "|"
            + nome +"|"
            +senha+"|"+
            perfil;
  
    }
    
}
