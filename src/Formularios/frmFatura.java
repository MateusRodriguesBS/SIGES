
package Formularios;

import Classes.Dados;
import Classes.Opcoes;
import Classes.Utilidades;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class frmFatura extends javax.swing.JInternalFrame {

    private Dados clsdados;
    private DefaultTableModel mTabela;
    
    public void setDados(Dados clsdados){
        this.clsdados = clsdados;
    }
    
    public frmFatura() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        cmbCliente = new javax.swing.JComboBox<>();
        cmbProduto = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalhe = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnAdiciona = new javax.swing.JToggleButton();
        btnDeletar = new javax.swing.JToggleButton();
        btnDeletarTodos = new javax.swing.JToggleButton();
        btnSalvar = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btnPesquisarCliente = new javax.swing.JToggleButton();
        btnPesquisarProduto = new javax.swing.JToggleButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Movimento");
        setToolTipText("");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setText("Data:");

        jLabel2.setText("Nome do Paciente:");

        jLabel3.setText("Serviços:");

        jLabel4.setText("Quantidade:");

        txtData.setEditable(false);

        txtQuantidade.setEnabled(false);

        cmbCliente.setEditable(true);

        cmbProduto.setEditable(true);

        tblDetalhe.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblDetalhe);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/test.png"))); // NOI18N

        btnAdiciona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/page.png"))); // NOI18N
        btnAdiciona.setToolTipText("Adicionar");
        btnAdiciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionaActionPerformed(evt);
            }
        });

        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel.png"))); // NOI18N
        btnDeletar.setToolTipText("Limpar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnDeletarTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/page_delete.png"))); // NOI18N
        btnDeletarTodos.setToolTipText("Deletar");
        btnDeletarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarTodosActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/page_save.png"))); // NOI18N
        btnSalvar.setToolTipText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel6.setText("Total:");

        txtValor.setEnabled(false);

        btnPesquisarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoom.png"))); // NOI18N
        btnPesquisarCliente.setToolTipText("Pesquisar Cliente");
        btnPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarClienteActionPerformed(evt);
            }
        });

        btnPesquisarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoom.png"))); // NOI18N
        btnPesquisarProduto.setToolTipText("Pesquisar Consulta");
        btnPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtQuantidade))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnPesquisarCliente)
                                .addComponent(btnPesquisarProduto))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addGap(80, 80, 80))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btnAdiciona)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeletarTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisarCliente))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisarProduto)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdiciona)
                    .addComponent(btnDeletar)
                    .addComponent(btnDeletarTodos)
                    .addComponent(btnSalvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        
        Opcoes op = new Opcoes("Nostalgico@gmail.com", "Selecione um Paciente!");
        cmbCliente.addItem(""+op);
        for(int i=0; i< clsdados.numeroClientes(); i++){
            op = new Opcoes(
            clsdados.getClientes()[i].getIdCliente(),
            clsdados.getClientes()[i].getNome()+"");
            cmbCliente.addItem(""+op);
            
        }
        
        op = new Opcoes("Nostalgico@gmail.com", "Selecione um Produto!");
        cmbProduto.addItem(""+op);
        for(int i=0; i< clsdados.numeroProdutos(); i++){
            op = new Opcoes(
            clsdados.getProdutos()[i].getDescricao(),
            clsdados.getProdutos()[i].getIdProduto()+"");
            cmbProduto.addItem(""+op);
    }  
        
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Date date = new Date();
	dateFormat.format(date);
        txtData.setText(""+ date);
        
        txtQuantidade.setText("1");
        txtValor.setText("0");
        preencherTabela();


    }//GEN-LAST:event_formInternalFrameOpened

    private void btnAdicionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionaActionPerformed
        // TODO add your handling code here:
        if(cmbProduto.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "Selecionar uma Especialidade");
            cmbProduto.requestFocusInWindow();
            return;
            
        }if(!Utilidades.isNumeric(txtQuantidade.getText())){
            JOptionPane.showMessageDialog(rootPane, "Por favor, digitar apenas números!");
            txtQuantidade.setText("");
            txtQuantidade.requestFocusInWindow();
            return; 
        }
      
        int pos = cmbProduto.getSelectedIndex()-1;

        String registro[] = new String[4];
        registro[0] = clsdados.getProdutos()[pos].getIdProduto();
        registro[1] = clsdados.getProdutos()[pos].getDescricao();
        registro[2] = ""+ clsdados.getProdutos()[pos].getPreco();
        registro[3] = clsdados.getProdutos()[pos].getAnotacao();
        

        mTabela.addRow(registro);
        
        cmbProduto.setSelectedIndex(0);
        cmbProduto.requestFocusInWindow();
        totais();
    }//GEN-LAST:event_btnAdicionaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        if(cmbCliente.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "Selecionar um Paciente");
                cmbCliente.requestFocusInWindow();
                return;
        }
        int totalquant = new Integer(txtValor.getText());
        if(totalquant == 0){
            JOptionPane.showMessageDialog(rootPane, "Inserer dados da consulta!");
            cmbProduto.requestFocusInWindow();
            return;
        }
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente concluir a consulta?");
        if(resposta !=0){
        return;
        }
        
        int numfatura = clsdados.getNumerofatura()+1;
        FileWriter fw = null;
        PrintWriter pw = null;
         try {
             fw = new FileWriter("Data/fatura1.txt",true);
             pw = new PrintWriter(fw);
             
          String aux = "1|"+ numfatura +"|"+(cmbCliente.getSelectedItem()+"|"+
                  cmbProduto.getSelectedItem());
                    pw.println(aux);
            
            int num = tblDetalhe.getRowCount();
                    for(int i=0; i<num;i++){
                        aux = "2|" 
                    +Utilidades.objectToString(tblDetalhe.getValueAt(i, 0))+"|"
                    +Utilidades.objectToString(tblDetalhe.getValueAt(i, 1))+"|"
                    +Utilidades.objectToString(tblDetalhe.getValueAt(i, 2))+"|"
                    +Utilidades.objectToString(tblDetalhe.getValueAt(i, 3))+"|";
                     pw.println(aux);
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
                    JOptionPane.showConfirmDialog(rootPane,"Consulta:"+numfatura+" realizado com sucesso!");
                    clsdados.setNumerofatura(numfatura);
                    
                     
                    cmbCliente.setSelectedIndex(0);
                    totais();
                    cmbCliente.requestFocusInWindow();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDeletarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarTodosActionPerformed
        // TODO add your handling code here:
        int resposta1 = JOptionPane.showConfirmDialog(rootPane, "Deseja deletar essa consulta?");
        if(resposta1 !=0){
            return;
        }
        Limpartabela();
    }//GEN-LAST:event_btnDeletarTodosActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:
        cmbCliente.setSelectedIndex(0);
        cmbCliente.setSelectedIndex(0);
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarClienteActionPerformed
        // TODO add your handling code here:
        frmPesquisarCliente mPesq = new frmPesquisarCliente(null,closable);
        mPesq.setDados(clsdados);
        mPesq.setLocationRelativeTo(null);
        mPesq.setVisible(true);
        String rta = mPesq.getReposta();
        if(rta.equals("")){
            return;
        }
        for(int i = 0; i<cmbCliente.getItemCount(); i++){
                cmbCliente.setSelectedIndex(Integer.parseInt(rta));
                return;
        }
    }//GEN-LAST:event_btnPesquisarClienteActionPerformed

    private void btnPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarProdutoActionPerformed
        // TODO add your handling code here:
        frmPesquisarProdutos mPesqpro = new frmPesquisarProdutos(null,closable);
        mPesqpro.setDados(clsdados);
        mPesqpro.setLocationRelativeTo(null);
        mPesqpro.setVisible(true);
        int rta = mPesqpro.getReposta();
        if(rta == 0){
            return;
        }
        for(int i = 0; i<cmbProduto.getItemCount(); i++){
                cmbProduto.setSelectedIndex(rta);
                return;
        }
    }//GEN-LAST:event_btnPesquisarProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAdiciona;
    private javax.swing.JToggleButton btnDeletar;
    private javax.swing.JToggleButton btnDeletarTodos;
    private javax.swing.JToggleButton btnPesquisarCliente;
    private javax.swing.JToggleButton btnPesquisarProduto;
    private javax.swing.JToggleButton btnSalvar;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JComboBox<String> cmbProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDetalhe;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

 private void preencherTabela(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Date date = new Date();
	dateFormat.format(date);
            String titulos[] = {"ID Consulta","Desc","Preço","Marcação"};
            String registro[] = new String[3];
            mTabela = new DefaultTableModel(null,titulos);
            tblDetalhe.setModel(mTabela);
            }
    private void totais(){
                int num = tblDetalhe.getRowCount();
                int somVal = 0;
                for(int i=0; i<num;i++){
                    somVal += Utilidades.objectToInt(tblDetalhe.getValueAt(i, 2));
                }
                txtValor.setText("" + somVal);
            }
    public void Limpartabela(){
            try {
            DefaultTableModel modelo = (DefaultTableModel)tblDetalhe.getModel();
            int linha = tblDetalhe.getRowCount();
            for(int i =0; linha>i;i++);
                modelo.removeRow(0);
                txtValor.setText("0");
            
        } catch (Exception e) {
            e.printStackTrace();
        }    
        }
}
