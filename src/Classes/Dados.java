/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Lozkillers
 */
public class Dados {
    
    private int maxusuarios = 50;
    private int maxpro = 100;
    private int maxcli = 100;
    
    private Usuarios Musuarios[] = new Usuarios[maxusuarios];
    private Produto msProdutos[] = new Produto[maxpro];
    private Cliente msclientes[] = new Cliente [maxcli];
    

       private int contusuarios = 0;
       private int conpro = 0;
       private int conCli = 0;
       private int numfatura = 0;
    
        public Dados(){
            
          preencherUsuarios();
           
          preencherProdutos();
           
          preencherClientes();
          
          preencherConfiguracao();
          
          salvarConfiguracao();
          
        }
        public Dados(int numfatura){
            this.numfatura = numfatura;
        }
    
        public int getNumerofatura(){
            return numfatura;
           }
        
        public void setNumerofatura(int numfatura){
            this.numfatura = numfatura;
            
           }
        
        public int numeroUsuarios(){
            return contusuarios;
        }
        public int numeroProdutos(){
            return conpro;
        }
        public int numeroClientes(){
            return conCli;
        }
    
    
    public Usuarios[] getUsuarios(){
     return Musuarios;
    }
    
    public Produto[] getProdutos(){
     return msProdutos;
    }
    public Cliente[] getClientes(){
     return msclientes;
    }
    
    public boolean validarUsuarios (String usuario,String senha){
        boolean x = false;
        for(int l=0; l<contusuarios;l++){
        if(Musuarios[l].getCodusuario().equals(usuario)&& Musuarios[l].getSenha().equals(senha)){
    return true;            
        }
       }
        return false;
    }
    public int getPerfil(String usuario){
        for(int l=0; l<contusuarios;l++){
        if(Musuarios[l].getCodusuario().equals(usuario)){
                return Musuarios[l].getPerfil();            
            }
         }
        return -1;
    }
    
    public void trocarSenha(String usuario, String senha){
        for(int l=0; l<contusuarios;l++){
        if(Musuarios[l].getCodusuario().equals(usuario)){
                Musuarios[l].setSenha(senha);
                return;
            }
         }
    }
    
    public int LinhaUsuario (String usuario){
        for(int l=0; l<contusuarios;l++){
        if(Musuarios[l].getCodusuario().equals(usuario)){
        return l;            
        }
       }
        return -1;
    }
     public int posicaoProduto (String produto){
        for(int l=0; l<conpro;l++){
        if(msProdutos[l].getIdProduto().equals(produto)){
        return l;            
        }
       }
        return -1;
    }
     public int posicaoCliente (String cliente){
        for(int l=0; l<conCli;l++){
        if(msclientes[l].getIdCliente().equals(cliente)){
        return l;            
        }
       }
        return -1;
    }
    public String CadUsuarios(Usuarios Musuario){
        if(contusuarios == maxusuarios){
            return "Voçe não tem mais espaço no seu banco de dados para fazer ou relizar esse cadastrado";
        }
        Musuarios[contusuarios] = Musuario;
        contusuarios ++;
        return "Usuários cadastrado com sucesso";

    }
    
    public String adicionarProduto(Produto mProduto){
        if(conpro == maxpro){
            return "Voçe não tem mais espaço no seu banco de dados para fazer ou relizar esse cadastrado";
        }
        msProdutos[conpro] = mProduto;
        conpro ++;
        return "Consulta cadastrada com sucesso";
    }
    public String adicionarCliente(Cliente mCliente){
        if(conCli== maxcli){
            return "Voçe não tem mais espaço no seu banco de dados para fazer ou relizar esse cadastrado";
        }
        msclientes[conCli] = mCliente;
        conCli ++;
        return "Cliente cadastrado com sucesso";
    }
    public String editar(Usuarios Musuario, int poslinha){
        Musuarios[poslinha].setNome(Musuario.getNome());
        Musuarios[poslinha].setSenha(Musuario.getSenha());
        Musuarios[poslinha].setPerfil(Musuario.getPerfil());
        
        return"Usuário editado com sucesso";
    }
    
    public String editarProduto(Produto mProduto, int poslinha){
        msProdutos[poslinha].setDescricao(mProduto.getDescricao());
        msProdutos[poslinha].setPreco(mProduto.getPreco());
        msProdutos[poslinha].setImposto(mProduto.getImposto());
        msProdutos[poslinha].setAnotacao(mProduto.getAnotacao());
        
        return"Consulta editada com sucesso";
    }
    public String editarCliente(Cliente mCliente, int poslinha){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Date date = new Date();
	dateFormat.format(date);
        msclientes[poslinha].setIdCliente(mCliente.getIdCliente());
        msclientes[poslinha].setIdTipo(mCliente.getIdTipo());
        msclientes[poslinha].setNome(mCliente.getNome());
        msclientes[poslinha].setEndereco(mCliente.getEndereco());
        msclientes[poslinha].setTelefone(mCliente.getTelefone());
        msclientes[poslinha].setIdCidade(mCliente.getIdCidade());
        msclientes[poslinha].setNascimento(mCliente.getNascimento());    
        return"Cliente editado com sucesso";
    }
    public String deletarUsuario(int poslinha){
        for(int i = poslinha; i<contusuarios -1; i++){
           Musuarios[i] = Musuarios[i+1];
        }
        contusuarios -- ;
        return"Usuário deletado com sucesso!";
    }
    
    public String deletarProduto(int poslinha){
        for(int i = poslinha; i<conpro -1; i++){
           msProdutos[i] = msProdutos[i+1];
        }
        conpro -- ;
        return"Consulta deletada com sucesso!";
    }
    public String deletarCliente(int poslinha){
        for(int i = poslinha; i<conCli -1; i++){
           msclientes[i] = msclientes[i+1];
        }
        conCli -- ;
        return"Cliente deletado com sucesso!";
    }
    public void salvarTodo(){
        salvarUsuario();
        salvarCliente();
        salvarProduto();
        
    }
     public void salvarUsuario(){
        FileWriter fw = null;
        PrintWriter pw = null;
         try {
             fw = new FileWriter("Data/Usuarios.txt");
             pw = new PrintWriter(fw);
             
             for(int i=0; i<contusuarios; i++){
                 pw.println(Musuarios[i].toString());
                 
             }
         } catch (Exception e1) {
             e1.printStackTrace();
         }finally{
             try {
                 if(fw != null){
                     fw.close();
                 }
             } catch (Exception e2) {
                 e2.printStackTrace();
             }
         }
        
    }
    
      public void salvarCliente(){
        FileWriter fw = null;
        PrintWriter pw = null;
         try {
             fw = new FileWriter("Data/Clientes.txt");
             pw = new PrintWriter(fw);
             
             for(int i=0; i<conCli; i++){
                 pw.println(msclientes[i].toString());
                 
             }
         } catch (Exception e1) {
             e1.printStackTrace();
         }finally{
             try {
                 if(fw != null){
                     fw.close();
                 }
             } catch (Exception e2) {
                 e2.printStackTrace();
             }
         }
        
        
    }
       public void salvarProduto(){
        FileWriter fw = null;
        PrintWriter pw = null;
         try {
             fw = new FileWriter("Data/Produtos.txt");
             pw = new PrintWriter(fw);
             
             for(int i=0; i<conpro; i++){
                 pw.println(msProdutos[i].toString());
                 
             }
         } catch (Exception e1) {
             e1.printStackTrace();
         }finally{
             try {
                 if(fw != null){
                     fw.close();
                 }
             } catch (Exception e2) {
                 e2.printStackTrace();
             }
         }        
    }
       public void salvarConfiguracao(){
        FileWriter fw = null;
        PrintWriter pw = null;
         try {
             fw = new FileWriter("Data/Configuracao.ini");
             pw = new PrintWriter(fw);
            
             pw.println("[Geral]");
             pw.println("FaturaAtual=" + numfatura);  
           
         } catch (Exception e1) {
             e1.printStackTrace();
         }finally{
             try {
                 if(fw != null){
                     fw.close();
                 }
             } catch (Exception e2) {
                 e2.printStackTrace();
             }
         }
        
    }
          public void preencherConfiguracao(){
        File arquivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            arquivo = new File("Data/Configuracao.ini");
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);
            
            
            String linha;
            
            
            while((linha = br.readLine()) != null){
                if(linha.startsWith("FaturaAtual=")){
                    numfatura = new Integer(linha.substring(12));
                    
                } 
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }finally{
            try {
                if(fr != null){
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    } 
    public void preencherUsuarios(){
        File arquivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            arquivo = new File("Data/Usuarios.txt");
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);
            
            int pos;
            String aux;
            String linha;
            String codusuario;
            String nome;
            String senha;
            int perfil;
            
            while((linha = br.readLine()) != null){
                pos = linha.indexOf('|');
                aux = linha.substring(0,pos);
                codusuario = aux;
                linha = linha.substring(pos +1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0,pos);
                nome = aux;
                linha = linha.substring(pos +1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0,pos);
                senha = aux;
                linha = linha.substring(pos +1);
                perfil = new Integer(linha);
                
                Usuarios Msusuario = new Usuarios(codusuario, 
                        nome, 
                        senha, 
                        perfil);
                
                Musuarios[contusuarios] = Msusuario;
                contusuarios++;

            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }finally{
            try {
                if(fr != null){
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    } 
     public void preencherProdutos(){
        File arquivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            arquivo = new File("Data/Produtos.txt");
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);
            
            int pos;
            String aux;
            String linha;
            String idProduto;
            String descricao;
            int preco;
            int imposto;
            String anotacao;
            
            while((linha = br.readLine()) != null){
                pos = linha.indexOf('|');
                aux = linha.substring(0,pos);
                idProduto = aux;
                linha = linha.substring(pos +1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0,pos);
                descricao = aux;
                linha = linha.substring(pos +1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0,pos);
                preco = new Integer(aux);
                linha = linha.substring(pos +1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0,pos);
                imposto = new Integer(aux);
                linha = linha.substring(pos +1);
                
                anotacao = linha;
                
                
                Produto mProdutos = new Produto(idProduto, 
                        descricao, 
                        preco,
                        imposto, 
                        anotacao);
                        
                
                msProdutos[conpro] = mProdutos;
                conpro++;

            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }finally{
            try {
                if(fr != null){
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    } 
     public void preencherClientes(){
        File arquivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            arquivo = new File("Data/Clientes.txt");
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);
            
            int pos;
            String aux;
            String linha;
            String idCliente;
            int idTipo;
            String Nome;
            String Telefone;
            int idCidade;
            String Endereco;
            Date Nascimento;
            
            while((linha = br.readLine()) != null){
                pos = linha.indexOf('|');
                aux = linha.substring(0,pos);
                idCliente = aux;
                linha = linha.substring(pos +1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0,pos);
                idTipo = new Integer(aux);
                linha = linha.substring(pos +1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0,pos);
                Nome = aux;
                linha = linha.substring(pos +1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0,pos);
                Telefone = aux;
                linha = linha.substring(pos +1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0,pos);
                idCidade = new Integer(aux);
                linha = linha.substring(pos +1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0,pos);
                Endereco = aux;
                linha = linha.substring(pos +1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0,pos);
                Nascimento = Utilidades.StringtoDate(aux);
                linha = linha.substring(pos+1);
                
                
                Cliente mCliente = new Cliente(idCliente, 
                        idTipo, 
                        Nome, 
                        Telefone, 
                        idCidade, 
                        Endereco, 
                        Nascimento);
                        
                msclientes[conCli] = mCliente;
                conCli++;

            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }finally{
            try {
                if(fr != null){
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    
    }
}
