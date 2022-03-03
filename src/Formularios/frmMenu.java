/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Classes.Dados;

/**
 *
 * @author Lozkillers
 */
public class frmMenu extends javax.swing.JFrame {
    private int perfil;
    private String senha;
    private String usuario;
    private Dados clsdados;
    
    public void setDados(Dados clsdados){
        this.clsdados = clsdados;
    }
    

    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public void setPerfil(int perfil){
        this.perfil = perfil;
    }
    public frmMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Deskpainel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnarquivos = new javax.swing.JMenu();
        mnarquivoscliente = new javax.swing.JMenuItem();
        mnarquivosusuario = new javax.swing.JMenuItem();
        mnarquivosconsultas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnarquivosaltsenha = new javax.swing.JMenuItem();
        mnarquivossair = new javax.swing.JMenuItem();
        mnmovimentos = new javax.swing.JMenu();
        mnmovimentosconsultas = new javax.swing.JMenuItem();
        mnrelatorios = new javax.swing.JMenuItem();
        mnajuda = new javax.swing.JMenu();
        mnajudasobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout DeskpainelLayout = new javax.swing.GroupLayout(Deskpainel);
        Deskpainel.setLayout(DeskpainelLayout);
        DeskpainelLayout.setHorizontalGroup(
            DeskpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 681, Short.MAX_VALUE)
        );
        DeskpainelLayout.setVerticalGroup(
            DeskpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );

        mnarquivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/page.png"))); // NOI18N
        mnarquivos.setText("Arquivos");

        mnarquivoscliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/group.png"))); // NOI18N
        mnarquivoscliente.setText("Clientes");
        mnarquivoscliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnarquivosclienteActionPerformed(evt);
            }
        });
        mnarquivos.add(mnarquivoscliente);

        mnarquivosusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user.png"))); // NOI18N
        mnarquivosusuario.setText("Usuários");
        mnarquivosusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnarquivosusuarioActionPerformed(evt);
            }
        });
        mnarquivos.add(mnarquivosusuario);

        mnarquivosconsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/table.png"))); // NOI18N
        mnarquivosconsultas.setText("Consultas");
        mnarquivosconsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnarquivosconsultasActionPerformed(evt);
            }
        });
        mnarquivos.add(mnarquivosconsultas);
        mnarquivos.add(jSeparator1);

        mnarquivosaltsenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lock_edit.png"))); // NOI18N
        mnarquivosaltsenha.setText("Alterar Senha");
        mnarquivosaltsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnarquivosaltsenhaActionPerformed(evt);
            }
        });
        mnarquivos.add(mnarquivosaltsenha);

        mnarquivossair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/door_out.png"))); // NOI18N
        mnarquivossair.setText("Sair");
        mnarquivossair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnarquivossairActionPerformed(evt);
            }
        });
        mnarquivos.add(mnarquivossair);

        jMenuBar1.add(mnarquivos);

        mnmovimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book.png"))); // NOI18N
        mnmovimentos.setText("Movimentos");

        mnmovimentosconsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/page_white_paste.png"))); // NOI18N
        mnmovimentosconsultas.setText("Consultas");
        mnmovimentosconsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnmovimentosconsultasActionPerformed(evt);
            }
        });
        mnmovimentos.add(mnmovimentosconsultas);

        mnrelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/chart_bar.png"))); // NOI18N
        mnrelatorios.setText("Relatórios Consultas");
        mnrelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnrelatoriosActionPerformed(evt);
            }
        });
        mnmovimentos.add(mnrelatorios);

        jMenuBar1.add(mnmovimentos);

        mnajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/information.png"))); // NOI18N
        mnajuda.setText("Sobre/Ajuda");

        mnajudasobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flag_green.png"))); // NOI18N
        mnajudasobre.setText("Sobre/Ajudar");
        mnajudasobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnajudasobreActionPerformed(evt);
            }
        });
        mnajuda.add(mnajudasobre);

        jMenuBar1.add(mnajuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Deskpainel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Deskpainel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnarquivosusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnarquivosusuarioActionPerformed
        // TODO add your handling code here:
        frmusuarios fusuario = new frmusuarios();
        fusuario.setDados(clsdados);
        Deskpainel.add(fusuario);
        fusuario.show();
    }//GEN-LAST:event_mnarquivosusuarioActionPerformed

    private void mnarquivosconsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnarquivosconsultasActionPerformed
        // TODO add your handling code here:
        
        frmProdutos msProdutos = new frmProdutos();
        msProdutos.setDados(clsdados);
        Deskpainel.add(msProdutos);
        msProdutos.show();
        
    }//GEN-LAST:event_mnarquivosconsultasActionPerformed

    private void mnarquivosclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnarquivosclienteActionPerformed
        // TODO add your handling code here:
        frmClientes clientes = new frmClientes();
        clientes.setDados(clsdados);
        Deskpainel.add(clientes);
        clientes.show();
    }//GEN-LAST:event_mnarquivosclienteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        if(perfil==2){
            mnarquivosusuario.setEnabled(false);
            mnmovimentos.setEnabled(false);
            
        }
               
    }//GEN-LAST:event_formWindowOpened

    private void mnarquivossairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnarquivossairActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        frmLogin login = new frmLogin();
        login.setDados(clsdados);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        clsdados.salvarTodo();
        
    }//GEN-LAST:event_mnarquivossairActionPerformed

    private void mnarquivosaltsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnarquivosaltsenhaActionPerformed
        // TODO add your handling code here:
        frmTrocarSenha senha1 = new frmTrocarSenha(this, rootPaneCheckingEnabled);
        senha1.setLocationRelativeTo(null);
        senha1.setSenha(senha);
        senha1.setUsuario(usuario);
        senha1.setDados(clsdados);
        senha1.setVisible(rootPaneCheckingEnabled);
        
       
    }//GEN-LAST:event_mnarquivosaltsenhaActionPerformed

    private void mnajudasobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnajudasobreActionPerformed
        // TODO add your handling code here:
        frmSobre sobre = new frmSobre(this, rootPaneCheckingEnabled);
        sobre.setLocationRelativeTo(null);
        sobre.setVisible(rootPaneCheckingEnabled);
        
    }//GEN-LAST:event_mnajudasobreActionPerformed

    private void mnmovimentosconsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnmovimentosconsultasActionPerformed
        // TODO add your handling code here:
        frmFatura fatura = new frmFatura();
        fatura.setDados(clsdados);
        Deskpainel.add(fatura);
        fatura.show();
        
    }//GEN-LAST:event_mnmovimentosconsultasActionPerformed

    private void mnrelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnrelatoriosActionPerformed
        // TODO add your handling code here:
        frmRelata relata = new frmRelata(this, rootPaneCheckingEnabled);
        relata.setLocationRelativeTo(null);
        relata.setVisible(rootPaneCheckingEnabled);
        
       
        
    }//GEN-LAST:event_mnrelatoriosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Deskpainel;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mnajuda;
    private javax.swing.JMenuItem mnajudasobre;
    private javax.swing.JMenu mnarquivos;
    private javax.swing.JMenuItem mnarquivosaltsenha;
    private javax.swing.JMenuItem mnarquivoscliente;
    private javax.swing.JMenuItem mnarquivosconsultas;
    private javax.swing.JMenuItem mnarquivossair;
    private javax.swing.JMenuItem mnarquivosusuario;
    private javax.swing.JMenu mnmovimentos;
    private javax.swing.JMenuItem mnmovimentosconsultas;
    private javax.swing.JMenuItem mnrelatorios;
    // End of variables declaration//GEN-END:variables
}