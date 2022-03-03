/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Date;

/**
 *
 * @author Lozkillers
 */
public class Cliente {
    
    private String idCliente;
    private int idTipo;
    private String Nome;
    private String Telefone;
    private int idCidade;
    private String Endereco;
    private Date Nascimento;
   
    public Cliente(String idCliente, int idTipo, String Nome, String Telefone, int idCidade, String Endereco, Date Nascimento) {
        this.idCliente = idCliente;
        this.idTipo = idTipo;
        this.Nome = Nome;
        this.Telefone = Telefone;
        this.idCidade = idCidade;
        this.Endereco = Endereco;
        this.Nascimento = Nascimento;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public Date getNascimento() {
        return Nascimento;
    }

    public void setNascimento(Date Nascimento) {
        this.Nascimento = Nascimento;
    }

   
              @Override
    public String toString(){
    
    return idCliente + "|"
            + idTipo +"|"
            +Nome+"|"+
            Telefone+"|"+
            idCidade+"|"+
            Endereco+"|"+
            Utilidades.formatDate(Nascimento)+"|";  
    }
    
}
