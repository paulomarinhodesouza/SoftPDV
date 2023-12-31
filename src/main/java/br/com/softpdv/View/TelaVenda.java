/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.br.softpdv.View;

import com.br.softpdv.Data.ListaProdutos;
import com.br.softpdv.Data.ListaRelatorios;
import com.br.softpdv.Data.ListaVendas;
import com.br.softpdv.Data.Opcoes;
import com.br.softpdv.Data.PrinterService;
import com.br.softpdv.Data.Produtos;
import com.br.softpdv.Data.Relatorios;
import com.br.softpdv.Data.Vendas;
import java.awt.Dimension;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import static java.awt.image.ImageObserver.HEIGHT;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Paulo
 */
public class TelaVenda extends javax.swing.JFrame {
    
    private double vlPagamento = 0;
    private int idProduto = 0;
    private int quantidade = 0;
    private int quantidadeTotal = 0;
    private double valorRecebido = 0;
    private double vlTotal = 0;
    private double vlTotalCusto = 0;
    private double vlDinheiro;
    private double vlDebito;
    private double vlCredito;
    private double vlPix;
    private double troco = 0;
    private String formaPagamento;
    private String pagamentoVenda = "";
    private String produtos;
    private String valorRecebidoStr;
    private static String vlTrocoStr = "0";
    private static double valorAReceber = 0;
            
    TelaPagamento telaPagamento;
    TelaPagamentoRecebido telaPagamentoRecebido;
    TelaTroco telaTroco;
    /**
     * Creates new form TelaVenda
     */
    public TelaVenda() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        txtCodigo.requestFocusInWindow();
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() {
            @Override
                public boolean dispatchKeyEvent(KeyEvent evt) {
                    if(evt.getKeyCode() == KeyEvent.VK_ESCAPE){
                        if(telaPagamento.isShowing()){
                            telaPagamento.dispose();
                        }else if(telaPagamentoRecebido.isShowing()){
                            telaPagamentoRecebido.dispose();
                        }else if(telaTroco.isShowing()){
                            telaTroco.dispose();
                        }else{
                        }
                        return true;
                    }else{
                        return false;
                    }  
                }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbProdutos = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        btnCancelarVenda = new javax.swing.JButton();
        btnQuantidade = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lbVlTotal = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnFinalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(151, 0, 222));
        jPanel1.setForeground(new java.awt.Color(255, 199, 0));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 199, 0));
        jLabel1.setText("SoftPDV");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 199, 0));
        jLabel2.setText("Venda");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(234, 158, 48));

        lbProdutos.setEditable(false);
        lbProdutos.setBackground(new java.awt.Color(234, 158, 48));
        lbProdutos.setColumns(20);
        lbProdutos.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lbProdutos.setForeground(new java.awt.Color(151, 0, 222));
        lbProdutos.setRows(5);
        lbProdutos.setBorder(null);
        lbProdutos.setFocusable(false);
        jScrollPane1.setViewportView(lbProdutos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(234, 158, 48));

        btnCancelarVenda.setBackground(new java.awt.Color(102, 0, 102));
        btnCancelarVenda.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnCancelarVenda.setForeground(new java.awt.Color(234, 158, 48));
        btnCancelarVenda.setText("Cancelar Venda");
        btnCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVendaActionPerformed(evt);
            }
        });

        btnQuantidade.setBackground(new java.awt.Color(102, 0, 102));
        btnQuantidade.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnQuantidade.setForeground(new java.awt.Color(234, 158, 48));
        btnQuantidade.setText("Quantidade");
        btnQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuantidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(234, 158, 48));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 38)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(151, 0, 222));
        jLabel5.setText("Total:");

        lbVlTotal.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        lbVlTotal.setForeground(new java.awt.Color(151, 0, 222));
        lbVlTotal.setText("0,00");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(lbVlTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVlTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(234, 158, 48));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(151, 0, 222));
        jLabel4.setText("Código de Barras:");

        txtCodigo.setBackground(new java.awt.Color(151, 0, 222));
        txtCodigo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(234, 158, 48));
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnFinalizar.setBackground(new java.awt.Color(234, 158, 48));
        btnFinalizar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(151, 0, 222));
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        btnFinalizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnFinalizarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(809, 809, 809)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVendaActionPerformed
        UIManager.put("OptionPane.yesButtonText", "Sim");
        UIManager.put("OptionPane.noButtonText", "Não");

        int cancelar = JOptionPane.showConfirmDialog(rootPane, "Deseja cancelar a venda?", "Cancelar Venda",
            JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE,
            null);
        if(cancelar == 0){
            dispose();
        }
    }//GEN-LAST:event_btnCancelarVendaActionPerformed

    private void btnQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuantidadeActionPerformed
        String quantidadeStr;
        quantidadeStr = JOptionPane.showInputDialog(rootPane, "Digite a quantidade", "Quantidade", HEIGHT);
        if(quantidadeStr != null){
            try{
                quantidade = Integer.parseInt(quantidadeStr);
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(rootPane, "Digite apenas números", "Erro", HEIGHT);
            }
        }
        txtCodigo.requestFocusInWindow();
    }//GEN-LAST:event_btnQuantidadeActionPerformed

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            cadastrarVenda();
        }
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        selecionarPagamento();        
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnFinalizarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnFinalizarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            selecionarPagamento();
        }
    }//GEN-LAST:event_btnFinalizarKeyPressed

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
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarVenda;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnQuantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea lbProdutos;
    private javax.swing.JLabel lbVlTotal;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables

    private void cadastrarVenda(){
        ListaProdutos listaProdutos = new ListaProdutos();
        String codigo = txtCodigo.getText();
        
        if(!codigo.isEmpty()){
            Produtos produtoAtual = listaProdutos.buscarProdutoCodigo(codigo, codigo);
            
            if(produtoAtual != null){
                idProduto ++;
                double vlVenda;
                double vlUnitario;
                vlUnitario = Double.parseDouble(produtoAtual.getVlVenda());
                
                if(quantidade > 1){
                    vlVenda = vlUnitario * quantidade; 
                } else {
                    quantidade = 1;
                    vlVenda = vlUnitario * quantidade; 
                }
                
                vlTotal += vlVenda;
                String vlTotalStr = String.format("%.2f",vlTotal);
                String vlUnitarioStr = String.format("%.2f", vlUnitario);
                String vlVendaStr = String.format("%.2f", vlVenda);
                lbVlTotal.setText(vlTotalStr);
                
                produtos = idProduto + " - " + produtoAtual.getCodigo() + " - " + produtoAtual.getDescricao() + " - R$" 
                        + vlUnitarioStr + "\n          x" + quantidade + " - " + vlVendaStr + "\n\n";
                
                quantidadeTotal += quantidade;
                vlTotalCusto += Double.parseDouble(produtoAtual.getVlCusto()) * quantidade;
                
                quantidade = 0;
                lbProdutos.append(produtos);
                txtCodigo.setText("");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Produto não encontrado", "Erro", HEIGHT);
                txtCodigo.setText("");
            }
        } else {
            btnFinalizar.requestFocus();
            txtCodigo.setText("");
        }
    }
    
    
   
    
    private void selecionarPagamento(){               
        ListaRelatorios listaRelatorio = new ListaRelatorios();
        int indexPagamento = 1, indexPagamentoRecebido = 1, indexTroco = 1;
        valorRecebido = 0;
        
        if(!lbProdutos.getText().isEmpty()){
            do{
                valorAReceber = vlTotal - valorRecebido;                     
                                
                telaPagamento = new TelaPagamento(this, true);
                telaPagamento.setVisible(true);                
                formaPagamento = telaPagamento.getFormaPagamento();
                indexPagamento = telaPagamento.getIndex();
                
                if(formaPagamento == null || indexPagamento == 1){
                    break;
                }
                
                telaPagamentoRecebido = new TelaPagamentoRecebido(this, true);
                telaPagamentoRecebido.setVisible(true);
                valorRecebidoStr = telaPagamentoRecebido.getValor();
                indexPagamentoRecebido = telaPagamentoRecebido.getIndex();
                               
                                
                if(valorRecebidoStr != null && indexPagamentoRecebido == 0){
                    valorRecebido += Double.parseDouble(valorRecebidoStr);
                }else{
                    break;
                }
                                
                
                switch (formaPagamento) {
                    case "Dinheiro" -> {
                        if(!listaRelatorio.listar().isEmpty()){
                            vlPagamento = listaRelatorio.buscarProdutoCodigo(listaRelatorio.listar().size()).getTotalDinheiro();
                        }
                        vlPagamento += Double.parseDouble(valorRecebidoStr);
                        vlDinheiro = vlPagamento;
                        pagamentoVenda += "\n"+formaPagamento+": R$ " + valorRecebidoStr;
                        break;
                    }
                    case "Débito" -> {
                        if(!listaRelatorio.listar().isEmpty()){
                            vlPagamento = listaRelatorio.buscarProdutoCodigo(listaRelatorio.listar().size()).getTotalDebito();
                        }
                        vlPagamento += Double.parseDouble(valorRecebidoStr);
                        vlDebito = vlPagamento;
                        pagamentoVenda += "\n"+formaPagamento+": R$ " + valorRecebidoStr;
                        break;
                    }
                    case "Crédito" -> {
                        if(!listaRelatorio.listar().isEmpty()){
                            vlPagamento = listaRelatorio.buscarProdutoCodigo(listaRelatorio.listar().size()).getTotalCredito();
                        }
                        vlPagamento += Double.parseDouble(valorRecebidoStr);
                        vlCredito = vlPagamento;
                        pagamentoVenda += "\n"+formaPagamento+": R$ " + valorRecebidoStr;
                        break;
                    }
                    case "Pix" -> {
                        if(!listaRelatorio.listar().isEmpty()){
                            vlPagamento = listaRelatorio.buscarProdutoCodigo(listaRelatorio.listar().size()).getTotalPix();
                        }
                        vlPagamento += Double.parseDouble(valorRecebidoStr);
                        vlPix = vlPagamento;
                        pagamentoVenda += "\n"+formaPagamento+": R$ " + valorRecebidoStr;
                        break;
                    }    
                }
                
            }while(valorRecebido < vlTotal || valorRecebido <= 0);
            
            troco = valorRecebido - vlTotal;
            vlTrocoStr = String.format("%.2f", troco);
            
            if(valorRecebido > vlTotal && indexPagamento == 0 && indexPagamentoRecebido == 0){
                telaTroco = new TelaTroco(this, true);
                telaTroco.setVisible(true);
                indexTroco = telaTroco.getIndex();
            }
            if(formaPagamento != null && valorRecebidoStr != null && indexPagamento == 0 && indexPagamentoRecebido == 0 && indexTroco == 0){
                finalizarVenda();
                TelaVenda telaVenda = new TelaVenda();
                int imprimir = JOptionPane.showConfirmDialog(rootPane, "Deseja Imprimir o relatório?", "Relatório", JOptionPane.YES_NO_OPTION);
                if(imprimir == 0){
                    imprimirRelatorio();
                }
                telaVenda.setVisible(true);
            }
                
        }else{
            JOptionPane.showMessageDialog(rootPane, "Nenhum produto cadastrado", "Erro", HEIGHT);
        }    
    }
    
    
    
    private void finalizarVenda(){
        ListaRelatorios listaRelatorio = new ListaRelatorios();
        Relatorios relatorio = new Relatorios();
        ListaVendas listaVendas = new ListaVendas();
        String horaAtual = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"))
                                .format(DateTimeFormatter.ofPattern("dd/MM/yyy, HH:mm:ss"));
        
        
        if(vlDinheiro > 0){
            relatorio.setTotalDinheiro(vlDinheiro);
        }else {
            if(!listaRelatorio.listar().isEmpty()){
                vlPagamento = listaRelatorio.buscarProdutoCodigo(listaRelatorio.listar().size()).getTotalDinheiro();
            }
            vlDinheiro = vlPagamento;
            relatorio.setTotalDinheiro(vlDinheiro);
        }        
        
        if(vlDebito > 0){
            relatorio.setTotalDebito(vlDebito);
        }else{
            if(!listaRelatorio.listar().isEmpty()){
                vlPagamento = listaRelatorio.buscarProdutoCodigo(listaRelatorio.listar().size()).getTotalDebito();
            }
            vlDebito = vlPagamento;
            relatorio.setTotalDebito(vlDebito);
        }
        
        if(vlCredito > 0){
            relatorio.setTotalCredito(vlCredito);
        }else{
            if(!listaRelatorio.listar().isEmpty()){
                vlPagamento = listaRelatorio.buscarProdutoCodigo(listaRelatorio.listar().size()).getTotalCredito();
            }
            vlCredito = vlPagamento;
            relatorio.setTotalCredito(vlCredito);
        }
        
        if(vlPix > 0){
            relatorio.setTotalPix(vlPix);
        }else{
            if(!listaRelatorio.listar().isEmpty()){
                vlPagamento = listaRelatorio.buscarProdutoCodigo(listaRelatorio.listar().size()).getTotalPix();
            }
            vlPix = vlPagamento;
            relatorio.setTotalPix(vlPix);
        }
        
        
        int idRelatorios;
        if(!listaRelatorio.listar().isEmpty()){
            idRelatorios = listaRelatorio.listar().size();
            idRelatorios++;
        }else{
            idRelatorios = 1;
        }
        
        
        double vlTotalGeral = 0;
        double lucroLiquido;
        double margemLucro;
        if(!listaRelatorio.listar().isEmpty()){
            vlTotalGeral = listaRelatorio.buscarProdutoCodigo(listaRelatorio.listar().size()).getVlTotalGeral();
        }
        vlTotalGeral += vlTotal;
        String vlTotalStr = String.format("%.2f", vlTotal);
        vlTotal = Double.parseDouble(vlTotalStr.replace(",","."));
                
        lucroLiquido = vlTotalGeral - vlTotalCusto;
        margemLucro = (lucroLiquido/vlTotalGeral) *100;
        
        relatorio.setIdRelarios(idRelatorios);
        relatorio.setVlTotalGeral(vlTotalGeral);
        relatorio.setVlCusto(vlTotalCusto);
        relatorio.setLucroLiquido(lucroLiquido);
        relatorio.setMargemLucro(margemLucro);
        listaRelatorio.adicionar(relatorio);
        
        Vendas venda = new Vendas();
        venda.setFormaPagamento(pagamentoVenda);
        venda.setDataVenda(horaAtual);
        venda.setProdutos(lbProdutos.getText());
        venda.setVlTotal(vlTotal);
        venda.setTroco(troco);
        venda.setQuantidade(quantidadeTotal);
        listaVendas.adicionar(venda);
                        
        JOptionPane.showMessageDialog(rootPane, "Venda cadastrada com sucesso", "Sucesso", JOptionPane.PLAIN_MESSAGE);
        dispose();
    }
    
    
    
    private void imprimirRelatorio(){
        String horaAtual = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"))
                                .format(DateTimeFormatter.ofPattern("dd/MM/yyy, HH:mm:ss"));
        String relatorio = "----------------SoftPDV----------------\n"
                + "-----Rua Kaliska N° 15 - 05274-030------\n"
                + "----------------------------------------\n"
                + "   Data e Hora: " + horaAtual + "\n"
                + "------------CUPOM NAO FISCAL------------\n"
                + "----------------------------------------\n"
                + lbProdutos.getText()
                + "----------------------------------------\n"
                + "Forma de pagamento: " + pagamentoVenda + "\n"
                + "----------------------------------------\n"
                + "         Valor total: R$ " + vlTotal
                + "\n----------------------------------------"
                + "\n----------------------------------------\n\n" + (char) 27 + "w";
        
        PrinterService printerService = new PrinterService();
        
        printerService.printString(Opcoes.getImpressoras(), relatorio);
    }

    public double getValorAReceber() {
        return valorAReceber;
    }

    public String getVlTrocoStr() {
        return vlTrocoStr;
    }
    
}
