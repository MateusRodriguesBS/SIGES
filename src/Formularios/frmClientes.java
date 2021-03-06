/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Classes.Cliente;
import Classes.Dados;
import Classes.Produto;
import Classes.Usuarios;
import Classes.Utilidades;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lozkillers
 */
public class frmClientes extends javax.swing.JInternalFrame {

   private Dados clsdados;
   private int cliAtual = 0;
   private boolean cmdNovo =false;
   private DefaultTableModel mTabela;
   
    public void setDados(Dados clsdados){
        this.clsdados = clsdados;
    }
    public frmClientes() {
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

        jLabel1 = new javax.swing.JLabel();
        txtIDCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbIdentificacao = new javax.swing.JComboBox<>();
        cmdprimeiro = new javax.swing.JButton();
        cmdanterior = new javax.swing.JButton();
        cmdproximo = new javax.swing.JButton();
        cmdultimo = new javax.swing.JButton();
        cmdnovo = new javax.swing.JButton();
        cmdeditar = new javax.swing.JButton();
        cmdsalvar = new javax.swing.JButton();
        cmdpesquisar = new javax.swing.JButton();
        cmddeletar = new javax.swing.JButton();
        cmdcancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbCidade = new javax.swing.JComboBox<>();
        DNascimento = new com.toedter.calendar.JDateChooser();
        DData = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastrar Clientes");
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

        jLabel1.setText("ID Cliente:");

        txtIDCliente.setEnabled(false);

        jLabel2.setText("Nome:");

        txtNome.setEnabled(false);

        jLabel3.setText("Endere??o:");

        jLabel4.setText("Telefone:");

        jLabel5.setText("Indentifica????o:");

        cmbIdentificacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma Identifica????o", "Carteira de Motorista", "Identidade", "Passaporte" }));
        cmbIdentificacao.setEnabled(false);

        cmdprimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/resultset_first.png"))); // NOI18N
        cmdprimeiro.setToolTipText("Primeiro Cadastro");
        cmdprimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdprimeiroActionPerformed(evt);
            }
        });

        cmdanterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/resultset_previous.png"))); // NOI18N
        cmdanterior.setToolTipText("Cadastro Anterior");
        cmdanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdanteriorActionPerformed(evt);
            }
        });

        cmdproximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/resultset_next.png"))); // NOI18N
        cmdproximo.setToolTipText("Pr??ximo Cadastro");
        cmdproximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdproximoActionPerformed(evt);
            }
        });

        cmdultimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/resultset_last.png"))); // NOI18N
        cmdultimo.setToolTipText("??ltimo Cadastro");
        cmdultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdultimoActionPerformed(evt);
            }
        });

        cmdnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/page_go.png"))); // NOI18N
        cmdnovo.setToolTipText("Novo Cadastro");
        cmdnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdnovoActionPerformed(evt);
            }
        });

        cmdeditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/page_edit.png"))); // NOI18N
        cmdeditar.setToolTipText("Editar Cadastro");
        cmdeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdeditarActionPerformed(evt);
            }
        });

        cmdsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/page_save.png"))); // NOI18N
        cmdsalvar.setToolTipText("Salvar Cadastro");
        cmdsalvar.setEnabled(false);
        cmdsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsalvarActionPerformed(evt);
            }
        });

        cmdpesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/page_link.png"))); // NOI18N
        cmdpesquisar.setToolTipText("Pesquisar Cadastro");
        cmdpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdpesquisarActionPerformed(evt);
            }
        });

        cmddeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/page_delete.png"))); // NOI18N
        cmddeletar.setToolTipText("Deletar Cadastro");
        cmddeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmddeletarActionPerformed(evt);
            }
        });

        cmdcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel.png"))); // NOI18N
        cmdcancelar.setToolTipText("Cancelar Cadastro");
        cmdcancelar.setEnabled(false);
        cmdcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcancelarActionPerformed(evt);
            }
        });

        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblTabela);

        txtEndereco.setEnabled(false);

        txtTelefone.setEnabled(false);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usersgroup_99737 (1).png"))); // NOI18N

        jLabel7.setText("Cidade:");

        jLabel8.setText("DT Nasc:");

        jLabel9.setText("Data At:");

        cmbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma Identifica????o", "Fortaleza", "S??o Paulo", "Rio de Janeiro" }));
        cmbCidade.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel8))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 282, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(30, 30, 30)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel6)
                        .addGap(151, 151, 151))))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(cmdprimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdanterior, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdproximo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmddeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addComponent(DNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(DData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdprimeiro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmdanterior, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmdproximo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmdultimo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmdnovo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmdeditar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmdsalvar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmddeletar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmdcancelar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmdpesquisar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdnovoActionPerformed
        // TODO add your handling code here:
        cmdprimeiro.setEnabled(false);
        cmdanterior.setEnabled(false);
        cmdproximo.setEnabled(false);
        cmdultimo.setEnabled(false);
        cmdnovo.setEnabled(false);
        cmdeditar.setEnabled(false);
        cmdsalvar.setEnabled(true);
        cmddeletar.setEnabled(false);
        cmdpesquisar.setEnabled(false);
        cmdcancelar.setEnabled(true);
        
        txtIDCliente.setEnabled(true);
        cmbIdentificacao.setEnabled(true);
        txtNome.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtTelefone.setEnabled(true);
        cmbCidade.setEnabled(true);
        DNascimento.setEnabled(true);
        
        txtIDCliente.setText("");
        cmbIdentificacao.setSelectedIndex(0);
        txtNome.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        cmbCidade.setSelectedIndex(0);
        DNascimento.setDate(new Date());
        DData.setDate(new Date());
        
        cmdNovo = true;

        txtIDCliente.requestFocusInWindow();
                        
        
    }//GEN-LAST:event_cmdnovoActionPerformed

    private void cmdsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsalvarActionPerformed
        // TODO add your handling code here:
        
        if(txtIDCliente.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Por favor, digitar uma ID do Cliente!");
            txtIDCliente.requestFocusInWindow();
            return;
        }
        if(cmbIdentificacao.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "Por favor, selecionar uma identifica????o!");
            cmbIdentificacao.requestFocusInWindow();
            return;
    
        }
        if(txtNome.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Por favor, Digitar um nome v??lido");
            txtNome.requestFocusInWindow();
            return;      
        }
        if(cmbCidade.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "Por favor, selecionar uma Cidade!");
            cmbCidade.requestFocusInWindow();
            return;
        }
        if(txtEndereco.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Por favor, digitar o endere??o!");
            txtEndereco.requestFocusInWindow();
            return; 
        }
        
        if(DNascimento.getDate().after(new Date())){
            JOptionPane.showMessageDialog(rootPane, "Por favor, digitar data de nascimento!");
            DNascimento.requestFocusInWindow();
            return; 
        }
        
        int poslinha = clsdados.posicaoCliente(txtIDCliente.getText());
        if(cmdNovo){
            if (poslinha != -1){
                JOptionPane.showMessageDialog(rootPane, "Este cliente j?? est?? cadastrado");
                txtIDCliente.requestFocusInWindow();
                return;
            }
        }else{
            if(poslinha == -1){
                JOptionPane.showMessageDialog(rootPane, "Esta cliente n??o est?? cadastrado");
                txtIDCliente.requestFocusInWindow();
                return;
            }
        }
        
       Cliente mCliente = new Cliente (txtIDCliente.getText(),
              cmbIdentificacao.getSelectedIndex(),
              txtNome.getText(), 
              txtTelefone.getText(), 
              cmbCidade.getSelectedIndex(),
              txtEndereco.getText(),
              DNascimento.getDate());
       
       String msg;
       if(cmdNovo){
         msg = clsdados.adicionarCliente(mCliente);
       }else{ 
       msg = clsdados.editarCliente(mCliente, poslinha);
       }
       JOptionPane.showMessageDialog(rootPane, msg);
        
        
        cmdprimeiro.setEnabled(true);
        cmdanterior.setEnabled(true);
        cmdproximo.setEnabled(true);
        cmdultimo.setEnabled(true);
        cmdnovo.setEnabled(true);
        cmdeditar.setEnabled(true);
        cmdsalvar.setEnabled(false);
        cmddeletar.setEnabled(true);
        cmdpesquisar.setEnabled(true);
        cmdcancelar.setEnabled(false);
        
        txtIDCliente.setEnabled(false);
        cmbIdentificacao.setEnabled(false);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        cmbCidade.setEnabled(false);
        DNascimento.setEnabled(false);
        DData.setEnabled(false);
        
        
        
        preencherTabela();
    }//GEN-LAST:event_cmdsalvarActionPerformed

    private void cmddeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmddeletarActionPerformed
        // TODO add your handling code here:
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente deletar esse cliente?");
        if(resposta !=0){
            return;
        }
          String msg;
          msg = clsdados.deletarCliente(cliAtual);
          JOptionPane.showMessageDialog(rootPane, msg);
          cliAtual= 0;
          mostrarRegistro();
          preencherTabela();
    }//GEN-LAST:event_cmddeletarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        mostrarRegistro();
        preencherTabela();
    
    }//GEN-LAST:event_formInternalFrameOpened
private void mostrarRegistro(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Date date = new Date();
	dateFormat.format(date);
        txtIDCliente.setText(clsdados.getClientes()[cliAtual].getIdCliente());
        cmbIdentificacao.setSelectedIndex(clsdados.getClientes()[cliAtual].getIdTipo());
        txtNome.setText(clsdados.getClientes()[cliAtual].getNome());
        txtTelefone.setText(clsdados.getClientes()[cliAtual].getTelefone());
        cmbCidade.setSelectedIndex(clsdados.getClientes()[cliAtual].getIdCidade());
        txtEndereco.setText(clsdados.getClientes()[cliAtual].getEndereco());
        DNascimento.setDate(clsdados.getClientes()[cliAtual].getNascimento());
        DData.setDate(date);
}
        private void preencherTabela(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Date date = new Date();
	dateFormat.format(date);
            String titulos[] = {"ID Cli","Tipo ID","Nome","Tel","Cidade","Endere??o","D_Nasc","Data"};
            String registro[] = new String[8];
            mTabela = new DefaultTableModel(null,titulos);
            for(int i=0; i<clsdados.numeroClientes();i++){
                registro[0] = clsdados.getClientes()[i].getIdCliente();
                registro[1] = TipoId(clsdados.getClientes()[i].getIdTipo());
                registro[2] = clsdados.getClientes()[i].getNome();
                registro[3] = clsdados.getClientes()[i].getTelefone();
                registro[4] = cidade(clsdados.getClientes()[i].getIdCidade());
                registro[5] = clsdados.getClientes()[i].getEndereco();
                registro[6] ="" + clsdados.getClientes()[i].getNascimento();
                registro[7] = "" + date;
                mTabela.addRow(registro);
                
            }
            tblTabela.setModel(mTabela);
        } 
        private String TipoId(int id){
            switch(id){
                case 1: return"Carteira Motorista";
                case 2: return"Identidade";
                case 3: return"Passaporte";
                default: return"N??o definido";
            }
        } private String cidade(int id){
            switch(id){
                case 1: return"Fortaleza";
                case 2: return"S??o Paulo";
                case 3: return"Rio de Janeiro";
                default: return"N??o definido";
            }
        }
    private void cmdeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdeditarActionPerformed
        // TODO add your handling code here:
        
        cmdprimeiro.setEnabled(false);
        cmdanterior.setEnabled(false);
        cmdproximo.setEnabled(false);
        cmdultimo.setEnabled(false);
        cmdnovo.setEnabled(false);
        cmdeditar.setEnabled(false);
        cmdsalvar.setEnabled(true);
        cmddeletar.setEnabled(false);
        cmdpesquisar.setEnabled(false);
        cmdcancelar.setEnabled(true);
        
        txtIDCliente.setEnabled(true);
        cmbIdentificacao.setEnabled(true);
        txtNome.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtTelefone.setEnabled(true);
        cmbCidade.setEnabled(true);
        DNascimento.setEnabled(true);
        
        cmdNovo = false;

    }//GEN-LAST:event_cmdeditarActionPerformed

    private void cmdprimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdprimeiroActionPerformed
        // TODO add your handling code here:
        cliAtual = 0;
        mostrarRegistro();
    }//GEN-LAST:event_cmdprimeiroActionPerformed

    private void cmdultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdultimoActionPerformed
        // TODO add your handling code here:
        cliAtual = clsdados.numeroClientes()-1;
        mostrarRegistro();
        
    }//GEN-LAST:event_cmdultimoActionPerformed

    private void cmdproximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdproximoActionPerformed
        // TODO add your handling code here:
        cliAtual++;
        if(cliAtual == clsdados.numeroClientes()){
            cliAtual = 0;
        }
        mostrarRegistro();
    }//GEN-LAST:event_cmdproximoActionPerformed

    private void cmdanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdanteriorActionPerformed
        // TODO add your handling code here:
        cliAtual--;
        if(cliAtual == -1){
            cliAtual = clsdados.numeroClientes()-1;
        }
        mostrarRegistro();
    }//GEN-LAST:event_cmdanteriorActionPerformed

    private void cmdcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcancelarActionPerformed
        // TODO add your handling code here:
        cmdprimeiro.setEnabled(true);
        cmdanterior.setEnabled(true);
        cmdproximo.setEnabled(true);
        cmdultimo.setEnabled(true);
        cmdnovo.setEnabled(true);
        cmdeditar.setEnabled(true);
        cmdsalvar.setEnabled(false);
        cmddeletar.setEnabled(true);
        cmdpesquisar.setEnabled(true);
        cmdcancelar.setEnabled(false);
        
        txtIDCliente.setEnabled(false);
        cmbIdentificacao.setEnabled(false);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        cmbCidade.setEnabled(false);
        DNascimento.setEnabled(false);
        
        txtIDCliente.setText("");
        txtNome.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        cmbIdentificacao.setSelectedIndex(0);
        cmbCidade.setSelectedIndex(0);
        
         mostrarRegistro();
        
    }//GEN-LAST:event_cmdcancelarActionPerformed

    private void cmdpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdpesquisarActionPerformed
        // TODO add your handling code here:
        String cliente = JOptionPane.showInputDialog("Favor, inserir o c??digo do cliente!");
        if(cliente.equals("")){
            return;
        }
        int pos = clsdados.posicaoCliente(cliente);
        if(pos == -1){
            JOptionPane.showMessageDialog(rootPane,"Este cliente n??o existe");
           return;
        }
           cliAtual = pos;
            mostrarRegistro();
        
    }//GEN-LAST:event_cmdpesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DData;
    private com.toedter.calendar.JDateChooser DNascimento;
    private javax.swing.JComboBox<String> cmbCidade;
    private javax.swing.JComboBox<String> cmbIdentificacao;
    private javax.swing.JButton cmdanterior;
    private javax.swing.JButton cmdcancelar;
    private javax.swing.JButton cmddeletar;
    private javax.swing.JButton cmdeditar;
    private javax.swing.JButton cmdnovo;
    private javax.swing.JButton cmdpesquisar;
    private javax.swing.JButton cmdprimeiro;
    private javax.swing.JButton cmdproximo;
    private javax.swing.JButton cmdsalvar;
    private javax.swing.JButton cmdultimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
