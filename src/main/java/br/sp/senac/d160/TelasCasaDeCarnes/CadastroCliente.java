package br.sp.senac.d160.TelasCasaDeCarnes;

import br.sp.senac.d160.TelasCasaDeCarnes.CRUD_Cliente;
import Classes.Cliente;
import DAO.ClienteDAO;
import br.sp.senac.d160.TelasCasaDeCarnes.Estoque;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Filri
 */
public class CadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form TelaCliente
     */
    public CadastroCliente() {
        initComponents();
        setLocationRelativeTo(null);
    }
    boolean sexo;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblEmaill = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        btnCadastro = new javax.swing.JButton();
        fmtCPF = new javax.swing.JFormattedTextField();
        lblInfo = new javax.swing.JLabel();
        lblEndereco1 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblEndereco2 = new javax.swing.JLabel();
        fmtCEP = new javax.swing.JFormattedTextField();
        btnMasc = new javax.swing.JRadioButton();
        btnFem = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        lblNomeInfo = new javax.swing.JLabel();
        lblCPFInfo = new javax.swing.JLabel();
        lblEnderecoInfo = new javax.swing.JLabel();
        lblEmailInfo = new javax.swing.JLabel();
        lblCEPInfo = new javax.swing.JLabel();
        lblSexoInfo = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jPanel1ComponentRemoved(evt);
            }
        });

        lblNome.setText("Nome:");

        lblCPF.setText("CPF:");

        lblEmaill.setText("E-mail:");

        lblEndereco.setText("Endereço:");

        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeFocusLost(evt);
            }
        });
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeKeyTyped(evt);
            }
        });

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtEndereco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEnderecoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEnderecoFocusLost(evt);
            }
        });
        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        btnCadastro.setText("Cadastrar");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        try {
            fmtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fmtCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fmtCPFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fmtCPFFocusLost(evt);
            }
        });
        fmtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmtCPFActionPerformed(evt);
            }
        });

        lblInfo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblInfoKeyTyped(evt);
            }
        });

        lblEndereco1.setText("Nº");

        txtNumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumeroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumeroFocusLost(evt);
            }
        });
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumeroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });

        lblEndereco2.setText("CEP:");

        try {
            fmtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fmtCEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fmtCEPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fmtCEPFocusLost(evt);
            }
        });
        fmtCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmtCEPActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnMasc);
        btnMasc.setText("Masculino");
        btnMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMascActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnFem);
        btnFem.setText("Feminino");
        btnFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFemActionPerformed(evt);
            }
        });

        jLabel1.setText("Sexo:");

        jLabel2.setText("Complemento:");

        lblNomeInfo.setForeground(new java.awt.Color(255, 51, 51));
        lblNomeInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblNomeInfoMousePressed(evt);
            }
        });
        lblNomeInfo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblNomeInfoKeyPressed(evt);
            }
        });

        lblCPFInfo.setForeground(new java.awt.Color(255, 0, 51));

        lblEnderecoInfo.setForeground(new java.awt.Color(204, 0, 51));

        lblEmailInfo.setForeground(new java.awt.Color(255, 0, 51));

        lblCEPInfo.setForeground(new java.awt.Color(255, 0, 51));

        btnExcluir.setText("Propiedades do Cliente");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtComplemento))
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEndereco2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fmtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEndereco1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCEPInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCadastro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEmaill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblEnderecoInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnMasc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnFem)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSexoInfo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblNomeInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblEmailInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(fmtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblCPFInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fmtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCPFInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFem)
                    .addComponent(btnMasc)
                    .addComponent(jLabel1)
                    .addComponent(lblSexoInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmailInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmaill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEnderecoInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCEPInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEndereco1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEndereco2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fmtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastro)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel1ComponentRemoved

    }//GEN-LAST:event_jPanel1ComponentRemoved

    private void lblNomeInfoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblNomeInfoKeyPressed

    }//GEN-LAST:event_lblNomeInfoKeyPressed

    private void lblNomeInfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNomeInfoMousePressed

    }//GEN-LAST:event_lblNomeInfoMousePressed

    private void btnFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFemActionPerformed
        //txtEmail.setText( btnFem.getText());
    }//GEN-LAST:event_btnFemActionPerformed

    private void btnMascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMascActionPerformed
        //txtEmail.setText( btnMasc.getText());
    }//GEN-LAST:event_btnMascActionPerformed

    private void fmtCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmtCEPActionPerformed
        /**
         * Mais uma alteracao para teste
         */

        if (fmtCEP.getText().length() > 0) {
            lblCEPInfo.setVisible(false);
        } else {
            lblCEPInfo.setVisible(true);
        }

    }//GEN-LAST:event_fmtCEPActionPerformed

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        /**
         * Validacao das teclas que sao permitidas no campo txtNumero
         *
         *
         */

        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            this.lblInfo.setText("Somente Numeros no ID!");
        } else {
            this.lblInfo.setText("");
        }
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        if (txtNumero.getText().length() > 0) {
            lblCEPInfo.setVisible(false);
        } else {
            lblCEPInfo.setVisible(true);
        }

    }//GEN-LAST:event_txtNumeroActionPerformed

    private void lblInfoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblInfoKeyTyped

    }//GEN-LAST:event_lblInfoKeyTyped

    private void fmtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmtCPFActionPerformed

    }//GEN-LAST:event_fmtCPFActionPerformed

    private void fmtCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fmtCPFFocusLost
        /**
         * Validacao do campo CPF como Obrigatorio
         */

        if (fmtCPF.getValue() == null || fmtCPF.getValue().toString().trim().isEmpty()) {
            this.lblCPFInfo.setText("* Campo Obrigatório");
            lblCPFInfo.setVisible(true);
        } else {
            lblCPFInfo.setVisible(false);
        }
    }//GEN-LAST:event_fmtCPFFocusLost

    private void fmtCPFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fmtCPFFocusGained
        lblCPFInfo.setVisible(false);
    }//GEN-LAST:event_fmtCPFFocusGained

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed


    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed

    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
        char c = evt.getKeyChar();
        if (((c < 'a') || (c > 'z')) && (c < 'A' || c > 'Z') && c > ' ' && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            this.lblInfo.setText("Somente Letra Nesse Campo!");
        } else {
            this.lblInfo.setText("");
        }
    }//GEN-LAST:event_txtNomeKeyTyped

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed

    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        this.lblNomeInfo.setText("* Campo Obrigatório");
        if (txtNome.getText().length() > 0) {
            lblNomeInfo.setVisible(false);

        } else {
            lblNomeInfo.setVisible(true);
        }

    }//GEN-LAST:event_txtNomeFocusLost

    private void txtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusGained
        lblNomeInfo.setVisible(false);
    }//GEN-LAST:event_txtNomeFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        this.lblEmailInfo.setText("* Campo Obrigatório");
        if (txtEmail.getText().length() > 0) {
            lblEmailInfo.setVisible(false);

        } else {
            lblEmailInfo.setVisible(true);
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        lblEmailInfo.setVisible(false);
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEnderecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEnderecoFocusLost
        this.lblEnderecoInfo.setText("* Campo Obrigatório");
        if (txtEndereco.getText().length() > 0) {
            lblEnderecoInfo.setVisible(false);

        } else {
            lblEnderecoInfo.setVisible(true);
        }
    }//GEN-LAST:event_txtEnderecoFocusLost

    private void txtEnderecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEnderecoFocusGained
        lblEnderecoInfo.setVisible(false);
    }//GEN-LAST:event_txtEnderecoFocusGained

    private void txtNumeroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroFocusGained
        lblCEPInfo.setVisible(false);
    }//GEN-LAST:event_txtNumeroFocusGained

    private void txtNumeroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyReleased

    }//GEN-LAST:event_txtNumeroKeyReleased

    private void txtNumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroFocusLost
        this.lblCEPInfo.setText("* Campo Obrigatório");
        if (txtNumero.getText().length() > 0) {
            lblCEPInfo.setVisible(false);

        } else {
            lblCEPInfo.setVisible(true);
        }
    }//GEN-LAST:event_txtNumeroFocusLost

    private void fmtCEPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fmtCEPFocusGained

        lblCEPInfo.setVisible(false);
    }//GEN-LAST:event_fmtCEPFocusGained

    private void fmtCEPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fmtCEPFocusLost
        if (fmtCEP.getValue() == null || fmtCEP.getValue().toString().trim().isEmpty()) {
            this.lblCEPInfo.setText("* Campo Obrigatório");
            lblCEPInfo.setVisible(true);
        } else {
            lblCEPInfo.setVisible(false);
        }
    }//GEN-LAST:event_fmtCEPFocusLost

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        CRUD_Cliente cliente = new CRUD_Cliente();
        cliente.setVisible(true);
        cliente.setDefaultCloseOperation(Estoque.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        String sexo = null;
        
        
        String nome = (txtNome.getText());
        String endereco = (txtEndereco.getText());
        String email = (txtEmail.getText());
        String cpf = (fmtCPF.getText());
        String cep = (fmtCEP.getText());
        String numEndereco = (txtNumero.getText());
        if(btnMasc.isSelected()) {
            sexo = "Masculino";
        } else if (btnFem.isSelected()) {
            sexo = "Feminino";
        }
        
        String complemente = (txtComplemento.getText());

        Cliente objCliente = new Cliente();
        objCliente.setNome(nome);
        objCliente.setEndereco(endereco);
        objCliente.setCpf(cpf);
        objCliente.setCep(cep);
        objCliente.setEmail(email);
        objCliente.setNumEndereco(numEndereco);
        objCliente.setSexo(sexo);
        objCliente.setComplemento(complemente);

        boolean retorno = ClienteDAO.cadastrar(objCliente);

        if (retorno) {
            JOptionPane.showMessageDialog(this, "Nota gravada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Falha na gravação!");
        }

    }//GEN-LAST:event_btnCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JRadioButton btnFem;
    private javax.swing.JRadioButton btnMasc;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField fmtCEP;
    private javax.swing.JFormattedTextField fmtCPF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCEPInfo;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCPFInfo;
    private javax.swing.JLabel lblEmailInfo;
    private javax.swing.JLabel lblEmaill;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEndereco1;
    private javax.swing.JLabel lblEndereco2;
    private javax.swing.JLabel lblEnderecoInfo;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeInfo;
    private javax.swing.JLabel lblSexoInfo;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
