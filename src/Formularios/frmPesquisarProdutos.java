
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Classes.Dados;
import Classes.Utilidades;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lozkillers
 */
public class frmPesquisarProdutos extends javax.swing.JDialog {

    private Dados clsdados;
    private DefaultTableModel mTabela;
    private int resposta =0;
    
    public void setDados(Dados clsdados){
        this.clsdados = clsdados;
    }
    public int getReposta(){
        return resposta;
    }
      private void preencherTabela(){
            String titulos[] = {"ID Consul","Descrição"};
            String registro[] = new String[2];
            mTabela = new DefaultTableModel(null,titulos);
            if(txtpesqcli.getText().equals("")){ 
            for(int i=0; i<clsdados.numeroProdutos();i++){
                registro[0] = clsdados.getProdutos()[i].getIdProduto();
                registro[1] = clsdados.getProdutos()[i].getDescricao();
                mTabela.addRow(registro);
            }
                tbltabela.setModel(mTabela);
                return;
            }
                  if(radioid.isSelected()){
                  for(int i=0; i<clsdados.numeroProdutos();i++){
                  if(clsdados.getProdutos()[i].getIdProduto().startsWith(txtpesqcli.getText())){
                  registro[0] = clsdados.getProdutos()[i].getIdProduto();
                  registro[1] = clsdados.getProdutos()[i].getDescricao();
                  mTabela.addRow(registro);
                    }
                }
                tbltabela.setModel(mTabela);
               
            }  
          
    }
            
    public frmPesquisarProdutos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
       
        bgtipopesq.add(radioid);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgtipopesq = new javax.swing.ButtonGroup();
        radioid = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbltabela = new javax.swing.JTable();
        txtpesqcli = new javax.swing.JTextField();
        btnpesqsair = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar Cliente");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        radioid.setSelected(true);
        radioid.setText("IdConsul");
        radioid.setToolTipText("idCliente");

        tbltabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbltabela);

        txtpesqcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpesqcliActionPerformed(evt);
            }
        });

        btnpesqsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel.png"))); // NOI18N
        btnpesqsair.setToolTipText("Sair");
        btnpesqsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesqsairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(radioid)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtpesqcli, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(btnpesqsair, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(radioid)
                .addGap(18, 18, 18)
                .addComponent(txtpesqcli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnpesqsair)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        preencherTabela();
        txtpesqcli.requestFocusInWindow();
    }//GEN-LAST:event_formWindowOpened

    private void txtpesqcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpesqcliActionPerformed
        // TODO add your handling code here:
        preencherTabela();
        
    }//GEN-LAST:event_txtpesqcliActionPerformed

    private void btnpesqsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesqsairActionPerformed
        // TODO add your handling code here:
        resposta = 0;
        dispose();
    }//GEN-LAST:event_btnpesqsairActionPerformed

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
            java.util.logging.Logger.getLogger(frmPesquisarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPesquisarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPesquisarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPesquisarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmPesquisarProdutos dialog = new frmPesquisarProdutos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgtipopesq;
    private javax.swing.JToggleButton btnpesqsair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioid;
    private javax.swing.JTable tbltabela;
    private javax.swing.JTextField txtpesqcli;
    // End of variables declaration//GEN-END:variables
}
