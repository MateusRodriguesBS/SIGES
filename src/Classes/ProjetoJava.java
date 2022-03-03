/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Formularios.frmLogin;

/**
 *
 * @author Lozkillers
 */
public class ProjetoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dados clsdados = new Dados();
        frmLogin login = new frmLogin();
        login.setDados(clsdados);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }
    
}
