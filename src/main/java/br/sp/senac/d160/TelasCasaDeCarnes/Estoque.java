/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.sp.senac.d160.TelasCasaDeCarnes;

import Classes.Produto;
import DAO.ProdutoDAO;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

   
public class Estoque extends javax.swing.JFrame {
    private Produtos objEstoque;
    
    public Estoque() {
        initComponents();
    }
    
    
     public Estoque(Produto pObj){
        
        initComponents();
        
        txtNomeAdcPrdt.setText(String.valueOf(pObj.getNomeProduto()));
        txtQntAdcPrdt.setText(String.valueOf(pObj.getQuantidade()));
        txtValorAdcPrdt.setText(String.valueOf(pObj.getValorProduto()));
        
        objEstoque = pObj;
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdicionarProduto = new javax.swing.JPanel();
        lblNomeAdcPrdt = new javax.swing.JLabel();
        lblQntAdcPrdt = new javax.swing.JLabel();
        txtNomeAdcPrdt = new javax.swing.JTextField();
        txtQntAdcPrdt = new javax.swing.JTextField();
        btnAdcEstoque = new javax.swing.JButton();
        lblValorAdcPrdt = new javax.swing.JLabel();
        txtValorAdcPrdt = new javax.swing.JTextField();
        lblInfo = new javax.swing.JLabel();
        ExcluirProduto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstoque = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AdicionarProduto.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        lblNomeAdcPrdt.setText("Nome:");

        lblQntAdcPrdt.setText("Quantidade:");

        txtNomeAdcPrdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeAdcPrdtActionPerformed(evt);
            }
        });
        txtNomeAdcPrdt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeAdcPrdtKeyTyped(evt);
            }
        });

        txtQntAdcPrdt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQntAdcPrdtKeyTyped(evt);
            }
        });

        btnAdcEstoque.setText("Adicionar");
        btnAdcEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdcEstoqueActionPerformed(evt);
            }
        });

        lblValorAdcPrdt.setText("Valor:");

        txtValorAdcPrdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorAdcPrdtActionPerformed(evt);
            }
        });
        txtValorAdcPrdt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorAdcPrdtKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout AdicionarProdutoLayout = new javax.swing.GroupLayout(AdicionarProduto);
        AdicionarProduto.setLayout(AdicionarProdutoLayout);
        AdicionarProdutoLayout.setHorizontalGroup(
            AdicionarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdicionarProdutoLayout.createSequentialGroup()
                .addComponent(lblNomeAdcPrdt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AdicionarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdicionarProdutoLayout.createSequentialGroup()
                        .addComponent(lblInfo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdicionarProdutoLayout.createSequentialGroup()
                        .addGroup(AdicionarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AdicionarProdutoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAdcEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AdicionarProdutoLayout.createSequentialGroup()
                                .addComponent(txtNomeAdcPrdt, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblQntAdcPrdt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQntAdcPrdt, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblValorAdcPrdt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorAdcPrdt, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52))))
        );
        AdicionarProdutoLayout.setVerticalGroup(
            AdicionarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdicionarProdutoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(AdicionarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeAdcPrdt)
                    .addComponent(txtNomeAdcPrdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQntAdcPrdt)
                    .addComponent(txtQntAdcPrdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorAdcPrdt)
                    .addComponent(txtValorAdcPrdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdcEstoque)
                .addGap(12, 12, 12)
                .addComponent(lblInfo)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        ExcluirProduto.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        tblEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Produto", "Quantidade", "Valor"
            }
        ));
        jScrollPane1.setViewportView(tblEstoque);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostra todos registros");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ExcluirProdutoLayout = new javax.swing.GroupLayout(ExcluirProduto);
        ExcluirProduto.setLayout(ExcluirProdutoLayout);
        ExcluirProdutoLayout.setHorizontalGroup(
            ExcluirProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExcluirProdutoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ExcluirProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(ExcluirProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMostrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ExcluirProdutoLayout.setVerticalGroup(
            ExcluirProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExcluirProdutoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar)
                .addGap(381, 381, 381))
            .addGroup(ExcluirProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMostrar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExcluirProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdicionarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(AdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorAdcPrdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorAdcPrdtActionPerformed
     
    }//GEN-LAST:event_txtValorAdcPrdtActionPerformed

    private void txtQntAdcPrdtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQntAdcPrdtKeyTyped
       /*    comentamos a validação por erro ao subir informações pro banco de dados
        
        char c = evt.getKeyChar();
        if (((c < '0') ||  (c > '9'))&& (c != KeyEvent.VK_BACK_SPACE) ) {
            evt.consume();
            this.lblInfo.setText("Somente Numeros Neste Campo!");
        } else {
            this.lblInfo.setText("");
        }
    */
     
    }//GEN-LAST:event_txtQntAdcPrdtKeyTyped

    private void txtValorAdcPrdtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorAdcPrdtKeyTyped
     /* comentamos a validação por erro ao subir informações pro banco de dados
        
        char c = evt.getKeyChar();
        if (((c < '0')  || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) ) {
            evt.consume();
            this.lblInfo.setText("Somente Numeros Neste Campo!");
        } else {
            this.lblInfo.setText("");
        }
    */
    }//GEN-LAST:event_txtValorAdcPrdtKeyTyped

    private void txtNomeAdcPrdtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeAdcPrdtKeyTyped
           char c = evt.getKeyChar();
        if ((((c < 'a') || (c > 'z')) && (c < 'A' || c> 'Z') && c >' ') && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            this.lblInfo.setText("Somente Letras Neste Campo");
        } else {
            this.lblInfo.setText("");
        }
    
    
    }//GEN-LAST:event_txtNomeAdcPrdtKeyTyped

    private void txtNomeAdcPrdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeAdcPrdtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeAdcPrdtActionPerformed

    private void btnAdcEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdcEstoqueActionPerformed
    
    
            
        String nomeProduto = (txtNomeAdcPrdt.getText());
        Float quantidade = Float.parseFloat(txtQntAdcPrdt.getText().toString());
        Float valorPorKg = Float.parseFloat(txtValorAdcPrdt.getText().toString());
      

        Produto objProduto = new Produto();
        objProduto.setNomeProduto(nomeProduto);
        objProduto.setQuantidade(quantidade);
        objProduto.setValorProduto(valorPorKg);
        
    

        boolean retorno = ProdutoDAO.adicionarEstoque(objProduto);
        
        if (retorno) {
            JOptionPane.showMessageDialog(this, "Nota gravada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Falha na gravação!");
        }
        
    }//GEN-LAST:event_btnAdcEstoqueActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
    int indiceLinha = tblEstoque.getSelectedRow();
        
        
        DefaultTableModel modelo = (DefaultTableModel)tblEstoque.getModel();
        int id = Integer.parseInt(modelo.getValueAt(indiceLinha, 0).toString());
        
        boolean retorno = ProdutoDAO.excluir(id);
        if(retorno){
            JOptionPane.showMessageDialog(rootPane, "Sucesso!");
        }else{
            JOptionPane.showMessageDialog(rootPane, "Falha!");
        }
            }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int indiceLinha = tblEstoque.getSelectedRow();
        
        DefaultTableModel modelo = (DefaultTableModel)tblEstoque.getModel();
        String nomeProd = (modelo.getValueAt(indiceLinha, 1).toString());
        float qntProd = Float.parseFloat(modelo.getValueAt(indiceLinha, 2).toString());
        float vlrProd = Float.parseFloat(modelo.getValueAt(indiceLinha, 3).toString());
    
        
        Produto obj = new Produto();
        obj.setNomeProduto(nomeProd);
        obj.setQuantidade(qntProd);
        obj.setValorProduto(vlrProd);
     
        obj = pObj;
       
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
     ArrayList<Produto> lista = ProdutoDAO.mostraTudo();

        DefaultTableModel modelo = (DefaultTableModel) tblEstoque.getModel();
        modelo.setRowCount(0);

        for (Produto item : lista) {

            modelo.addRow(new String[]{
                String.valueOf(item.getCodProduto()),
                String.valueOf(item.getNomeProduto()),
                String.valueOf(item.getQuantidade()),
                String.valueOf(item.getValorProduto())
              
            });

        }
    }//GEN-LAST:event_btnMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdicionarProduto;
    private javax.swing.JPanel ExcluirProduto;
    private javax.swing.JButton btnAdcEstoque;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblNomeAdcPrdt;
    private javax.swing.JLabel lblQntAdcPrdt;
    private javax.swing.JLabel lblValorAdcPrdt;
    private javax.swing.JTable tblEstoque;
    private javax.swing.JTextField txtNomeAdcPrdt;
    private javax.swing.JTextField txtQntAdcPrdt;
    private javax.swing.JTextField txtValorAdcPrdt;
    // End of variables declaration//GEN-END:variables
}
