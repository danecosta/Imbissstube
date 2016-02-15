package trabalholanchonete;

import Entidades.Mesa;
import Entidades.Item;
import DAO.ItemDAO;
import java.awt.Color;
import java.awt.Font;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import Persistencia.Serializacao;
import Persistencia.Textualizacao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dane
 */
public class JanelaLanchonete extends javax.swing.JFrame {
    
    JanelaRelatorioIndividual relatorioIndv = new JanelaRelatorioIndividual();
    JanelaRelatorio relatorio = new JanelaRelatorio();

    /**
     * Creates new form JanelaLanchonete
     */
    public JanelaLanchonete() {
        initComponents();
        
        ButtonGroup bgMesas = new ButtonGroup();
        bgMesas.add(rbMesa1);
        bgMesas.add(rbMesa2);
        bgMesas.add(rbMesa3);
        bgMesas.add(rbMesa4);
        bgMesas.add(rbMesa5);
        bgMesas.add(rbMesa6);
        bgMesas.add(rbMesa7);
        bgMesas.add(rbMesa8);
        bgMesas.add(rbMesa9);

        //Preenche Cardápio
        preencheItens();
        
        verificaMesasOcupadas();
        
        travaCampos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomeLanchonete = new javax.swing.JLabel();
        rbMesa1 = new javax.swing.JRadioButton();
        rbMesa3 = new javax.swing.JRadioButton();
        rbMesa2 = new javax.swing.JRadioButton();
        rbMesa5 = new javax.swing.JRadioButton();
        rbMesa6 = new javax.swing.JRadioButton();
        rbMesa4 = new javax.swing.JRadioButton();
        rbMesa7 = new javax.swing.JRadioButton();
        rbMesa9 = new javax.swing.JRadioButton();
        rbMesa8 = new javax.swing.JRadioButton();
        lblPedido = new javax.swing.JLabel();
        lblItem = new javax.swing.JLabel();
        lblQtd = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblMesaSelecionada = new javax.swing.JLabel();
        btnFecharPedido = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        cbItens = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstTela = new javax.swing.JList<>();
        btnCancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblHora = new javax.swing.JLabel();
        cbPersistenciaIn = new javax.swing.JComboBox<>();
        cbPersistenciaOut = new javax.swing.JComboBox<>();
        lblEntrada = new javax.swing.JLabel();
        lblSaida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNomeLanchonete.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        lblNomeLanchonete.setForeground(new java.awt.Color(153, 0, 102));
        lblNomeLanchonete.setText("Imbissstube");

        rbMesa1.setText("Mesa 01");
        rbMesa1.setToolTipText("");
        rbMesa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalholanchonete/resource/table-icon.png"))); // NOI18N
        rbMesa1.setIconTextGap(10);
        rbMesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMesa1ActionPerformed(evt);
            }
        });

        rbMesa3.setText("Mesa 03");
        rbMesa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalholanchonete/resource/table-icon.png"))); // NOI18N
        rbMesa3.setIconTextGap(10);
        rbMesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMesa3ActionPerformed(evt);
            }
        });

        rbMesa2.setText("Mesa 02");
        rbMesa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalholanchonete/resource/table-icon.png"))); // NOI18N
        rbMesa2.setIconTextGap(10);
        rbMesa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMesa2ActionPerformed(evt);
            }
        });

        rbMesa5.setText("Mesa 05");
        rbMesa5.setToolTipText("");
        rbMesa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalholanchonete/resource/table-icon.png"))); // NOI18N
        rbMesa5.setIconTextGap(10);
        rbMesa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMesa5ActionPerformed(evt);
            }
        });

        rbMesa6.setSelected(true);
        rbMesa6.setText("Mesa 06");
        rbMesa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalholanchonete/resource/table-icon.png"))); // NOI18N
        rbMesa6.setIconTextGap(10);
        rbMesa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMesa6ActionPerformed(evt);
            }
        });

        rbMesa4.setText("Mesa 04");
        rbMesa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalholanchonete/resource/table-icon.png"))); // NOI18N
        rbMesa4.setIconTextGap(10);
        rbMesa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMesa4ActionPerformed(evt);
            }
        });

        rbMesa7.setText("Mesa 07");
        rbMesa7.setToolTipText("");
        rbMesa7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalholanchonete/resource/table-icon.png"))); // NOI18N
        rbMesa7.setIconTextGap(10);
        rbMesa7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMesa7ActionPerformed(evt);
            }
        });

        rbMesa9.setText("Mesa 09");
        rbMesa9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalholanchonete/resource/table-icon.png"))); // NOI18N
        rbMesa9.setIconTextGap(10);
        rbMesa9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMesa9ActionPerformed(evt);
            }
        });

        rbMesa8.setText("Mesa 08");
        rbMesa8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalholanchonete/resource/table-icon.png"))); // NOI18N
        rbMesa8.setIconTextGap(10);
        rbMesa8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMesa8ActionPerformed(evt);
            }
        });

        lblPedido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPedido.setText("Pedido:");
        lblPedido.setToolTipText("");

        lblItem.setText("Item");

        lblQtd.setText("Quantidade");

        btnAdicionar.setForeground(new java.awt.Color(0, 102, 0));
        btnAdicionar.setText("Salvar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lblMesaSelecionada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnFecharPedido.setForeground(new java.awt.Color(255, 0, 0));
        btnFecharPedido.setText("Fechar Pedido");
        btnFecharPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharPedidoActionPerformed(evt);
            }
        });

        btnRelatorio.setForeground(new java.awt.Color(0, 51, 153));
        btnRelatorio.setText("Relatório");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        lstTela.setModel(new DefaultListModel<Entidades.Item>());
        jScrollPane1.setViewportView(lstTela);

        btnCancelar.setForeground(new java.awt.Color(204, 0, 0));
        btnCancelar.setText("x");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblHora.setText("     ");

        cbPersistenciaIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Arquivo Texto", "Arquivo Serializado", "Banco de Dados" }));
        cbPersistenciaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPersistenciaInActionPerformed(evt);
            }
        });

        cbPersistenciaOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Arquivo Texto", "Arquivo Serializado", "Banco de Dados" }));
        cbPersistenciaOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPersistenciaOutActionPerformed(evt);
            }
        });

        lblEntrada.setText("Entrada:");

        lblSaida.setText("Saída:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNomeLanchonete)
                                .addGap(78, 78, 78)))
                        .addGap(40, 40, 40)
                        .addComponent(btnExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPedido)
                            .addComponent(lblItem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMesaSelecionada)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbItens, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblQtd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblHora)
                                .addGap(218, 218, 218))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnAdicionar)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(btnFecharPedido))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cbPersistenciaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbPersistenciaOut, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnRelatorio)
                                    .addComponent(lblEntrada)
                                    .addComponent(lblSaida))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbMesa4)
                                    .addComponent(rbMesa1)
                                    .addComponent(rbMesa7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbMesa5)
                                    .addComponent(rbMesa2)
                                    .addComponent(rbMesa8))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rbMesa9)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rbMesa6)
                                        .addComponent(rbMesa3))))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNomeLanchonete)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEntrada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbMesa1)
                            .addComponent(cbPersistenciaIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(lblSaida)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbMesa4)
                            .addComponent(cbPersistenciaOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbMesa7)
                            .addComponent(btnRelatorio)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbMesa3)
                        .addGap(18, 18, 18)
                        .addComponent(rbMesa6)
                        .addGap(18, 18, 18)
                        .addComponent(rbMesa9))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbMesa2)
                        .addGap(18, 18, 18)
                        .addComponent(rbMesa5)
                        .addGap(18, 18, 18)
                        .addComponent(rbMesa8)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPedido)
                                    .addComponent(lblMesaSelecionada)
                                    .addComponent(lblHora))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblItem)
                                    .addComponent(lblQtd)
                                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAdicionar)
                                    .addComponent(cbItens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(139, 139, 139)
                                .addComponent(btnExcluir))))
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addComponent(btnFecharPedido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbMesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMesa3ActionPerformed
        alteraFontELabelMesaSelecionada(rbMesa3, 3);
        instanciaMesa();
    }//GEN-LAST:event_rbMesa3ActionPerformed

    private void rbMesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMesa2ActionPerformed
        alteraFontELabelMesaSelecionada(rbMesa2, 2);
        instanciaMesa();
    }//GEN-LAST:event_rbMesa2ActionPerformed

    private void rbMesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMesa1ActionPerformed
        alteraFontELabelMesaSelecionada(rbMesa1, 1);
        instanciaMesa();
    }//GEN-LAST:event_rbMesa1ActionPerformed

    private void rbMesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMesa4ActionPerformed
        alteraFontELabelMesaSelecionada(rbMesa4, 4);
        instanciaMesa();
    }//GEN-LAST:event_rbMesa4ActionPerformed

    private void rbMesa7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMesa7ActionPerformed
        alteraFontELabelMesaSelecionada(rbMesa7, 7);
        instanciaMesa();
    }//GEN-LAST:event_rbMesa7ActionPerformed

    private void rbMesa9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMesa9ActionPerformed
        alteraFontELabelMesaSelecionada(rbMesa9, 9);
        instanciaMesa();
    }//GEN-LAST:event_rbMesa9ActionPerformed

    private void rbMesa8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMesa8ActionPerformed
        alteraFontELabelMesaSelecionada(rbMesa8, 8);
        instanciaMesa();
    }//GEN-LAST:event_rbMesa8ActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        DefaultListModel<Item> modelSelecionado = (DefaultListModel<Item>) retornaMesaPorNumero(guardaMesaSelecionada).getLstMesa().getModel();
        
        boolean verificaCampos = validaCampos(txtQtd.getText(), cbItens.getSelectedIndex());
        
        if (verificaCampos) {
            Item p = new Item();

            //Mesa nova
            if (modelSelecionado.getSize() == 0) {
                retornaMesaPorNumero(guardaMesaSelecionada).setHoraAbertura(setaHoraMesa());
                lblHora.setText(retornaMesaPorNumero(guardaMesaSelecionada).getHoraAbertura());
            }
            
            p.setDescricaoItem(cbItens.getSelectedItem().toString());
            p.setQuantidadeItem(Integer.parseInt(txtQtd.getText()));
            p.setRefNumMesa(guardaMesaSelecionada);
            modelSelecionado.addElement(p);
            
            lstTela.setModel(modelSelecionado);
            
            txtQtd.setText("");
            cbItens.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnFecharPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharPedidoActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja fechar o pedido dessa mesa?");
        
        if (resposta == JOptionPane.YES_OPTION) {
            retornaMesaPorNumero(guardaMesaSelecionada).setHoraFechamento(setaHoraMesa());

            //Mostra detalhamento do pedido do cliente
            JanelaRelatorioIndividual rltIndividual = new JanelaRelatorioIndividual();
            rltIndividual.txtAreaRelatorioIndv.setText(retornaRelatorioPorMesa(guardaMesaSelecionada));
            rltIndividual.setVisible(true);
            rltIndividual.setLocationRelativeTo(null);
            rltIndividual.txtAreaRelatorioIndv.setEditable(false);
            
            travaCampos();
            retornaMesaPorNumero(guardaMesaSelecionada).getLstMesa().setModel(new DefaultListModel<>());
            lstTela.setModel(new DefaultListModel<>());
            lblHora.setText("");
            verificaMesasOcupadas();
        }

    }//GEN-LAST:event_btnFecharPedidoActionPerformed

    private void rbMesa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMesa5ActionPerformed
        alteraFontELabelMesaSelecionada(rbMesa5, 5);
        instanciaMesa();
    }//GEN-LAST:event_rbMesa5ActionPerformed

    private void rbMesa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMesa6ActionPerformed
        alteraFontELabelMesaSelecionada(rbMesa6, 6);
        instanciaMesa();
    }//GEN-LAST:event_rbMesa6ActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        DefaultListModel<Item> model = (DefaultListModel<Item>) lstTela.getModel();
        
        model.removeElement(lstTela.getSelectedValue());
        retornaMesaPorNumero(guardaMesaSelecionada).getLstMesa().setModel(model);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        relatorio.txtAreaRelatorio.setText("");
        
        String[] lstPedidos = {
            retornaRelatorioPorMesa(1),
            retornaRelatorioPorMesa(2),
            retornaRelatorioPorMesa(3),
            retornaRelatorioPorMesa(4),
            retornaRelatorioPorMesa(5),
            retornaRelatorioPorMesa(6),
            retornaRelatorioPorMesa(7),
            retornaRelatorioPorMesa(8),
            retornaRelatorioPorMesa(9)};
        
        for (String mesa : lstPedidos) {
            relatorio.txtAreaRelatorio.append(mesa + "\n");
        }
        
        relatorio.setVisible(true);
        relatorio.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        travaCampos();
        lblHora.setText("");
    }//GEN-LAST:event_btnCancelarActionPerformed

    //Opções de Persistência de Entrada
    private void cbPersistenciaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPersistenciaInActionPerformed
        String opcao = cbPersistenciaIn.getModel().getSelectedItem().toString();
        
        switch (opcao) {
            case "Arquivo Texto":
                try {
                    Textualizacao text = new Textualizacao();
                    
                    for (int numeroMesa = 1; numeroMesa < 10; numeroMesa++) {
                        List<Item> arquivoMesa = text.LeArquivoTexto("Mesa" + numeroMesa + ".TXT");
                        guardaMesaSelecionada = numeroMesa;
                        
                        DefaultListModel<Item> model = (DefaultListModel<Item>) retornaMesaPorNumero(guardaMesaSelecionada).getLstMesa().getModel();
                        
                        for (Item i : arquivoMesa) {
                            model.addElement(i);
                        }
                    }
                    
                    verificaMesasOcupadas();
                    
                    JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Dados recuperados com sucesso!");
                    cbPersistenciaIn.setSelectedIndex(0);
                } catch (Exception ex) {
                    Logger.getLogger(JanelaLanchonete.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            
            case "Arquivo Serializado":
                try {
                    Serializacao serializa = new Serializacao();
                    
                    for (int numeroMesa = 1; numeroMesa < 10; numeroMesa++) {
                        Object arquivoMesa = serializa.LerArquivoSerializado("ArqConvMesa" + numeroMesa);
                        guardaMesaSelecionada = numeroMesa;
                        retornaMesaPorNumero(guardaMesaSelecionada).getLstMesa().setModel((DefaultListModel<Item>) arquivoMesa);
                    }
                    
                    verificaMesasOcupadas();
                    
                    JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Dados recuperados com sucesso!");
                    cbPersistenciaIn.setSelectedIndex(0);
                } catch (Exception ex) {
                    Logger.getLogger(JanelaLanchonete.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            
            case "Banco de Dados":
                try {
                    ItemDAO dao = new ItemDAO();
                    
                    for (int numeroMesa = 1; numeroMesa < 10; numeroMesa++) {
                        List<Item> arquivoMesa = dao.buscarItensPorMesa(numeroMesa);
                        guardaMesaSelecionada = numeroMesa;
                        
                        DefaultListModel<Item> model = (DefaultListModel<Item>) retornaMesaPorNumero(guardaMesaSelecionada).getLstMesa().getModel();
                        
                        for (Item i : arquivoMesa) {
                            model.addElement(i);
                        }
                    }                    
                    
                    verificaMesasOcupadas();
                    
                    JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Dados recuperados com sucesso!");
                    cbPersistenciaIn.setSelectedIndex(0);
                } catch (Exception ex) {
                    Logger.getLogger(JanelaLanchonete.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            
            default:
                break;
        }
    }//GEN-LAST:event_cbPersistenciaInActionPerformed

    //Opções de Persistência de Saída
    private void cbPersistenciaOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPersistenciaOutActionPerformed
        String opcao = cbPersistenciaOut.getModel().getSelectedItem().toString();
        
        DefaultListModel<DefaultListModel<Item>> modelSelecionado = new DefaultListModel<>();
        modelSelecionado = PreencheModelTodasMesas(modelSelecionado);
        
        switch (opcao) {
            case "Arquivo Texto":
                try {
                    Textualizacao pTexto = new Textualizacao();
                    
                    for (int i = 0; i < modelSelecionado.size(); i++) {
                        //Pega mesa
                        DefaultListModel<Item> modelDaMesa = modelSelecionado.getElementAt(i);
                        int numItensMesa = modelDaMesa.size();
                        List<Item> listaDeItens = new ArrayList<>();
                        //Percorre itens da mesa
                        for (int k = 0; k < numItensMesa; k++) {
                            Item item = modelDaMesa.getElementAt(k);
                            item.setRefNumMesa(k+1);
                            listaDeItens.add(item);
                        }
                        pTexto.GeraArquivoTexto(listaDeItens, (i + 1));
                    }
                    
                    JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Arquivos Texto criados com sucesso!");
                    cbPersistenciaOut.setSelectedIndex(0);
                } catch (Exception ex) {
                    Logger.getLogger(JanelaLanchonete.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            
            case "Arquivo Serializado":
                try {
                    Serializacao serializa = new Serializacao();
                    
                    for (int i = 0; i < modelSelecionado.size(); i++) {
                        serializa.GerarArquivoSerializado("ArqConvMesa" + (i + 1), modelSelecionado.getElementAt(i));
                    }
                    
                    JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Arquivos Serializados criados com sucesso!");
                    cbPersistenciaOut.setSelectedIndex(0);
                } catch (Exception ex) {
                    Logger.getLogger(JanelaLanchonete.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            
            case "Banco de Dados":
                try {
                    ItemDAO itemDAO = new ItemDAO();
                    Item item = new Item();
                    
                    for (int i = 0; i < modelSelecionado.getSize(); i++) {
                        for (int j = 0; j < modelSelecionado.get(i).size(); j++) {
                            item.setDescricaoItem(modelSelecionado.get(i).getElementAt(j).getDescricaoItem());
                            item.setQuantidadeItem(modelSelecionado.get(i).getElementAt(j).getQuantidadeItem());
                            item.setRefNumMesa(i + 1);
                            itemDAO.inserir(item);
                        }
                    }
                    
                    JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Arquivos salvos no Banco de Dados com sucesso!");
                    cbPersistenciaOut.setSelectedIndex(0);
                } catch (Exception ex) {
                    Logger.getLogger(JanelaLanchonete.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            
            default:
                break;
        }
    }//GEN-LAST:event_cbPersistenciaOutActionPerformed
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaLanchonete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            JanelaLanchonete j = new JanelaLanchonete();
            j.setVisible(true);
            j.setLocationRelativeTo(null);
            j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFecharPedido;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JComboBox<String> cbItens;
    private javax.swing.JComboBox<String> cbPersistenciaIn;
    private javax.swing.JComboBox<String> cbPersistenciaOut;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEntrada;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblItem;
    private javax.swing.JLabel lblMesaSelecionada;
    private javax.swing.JLabel lblNomeLanchonete;
    private javax.swing.JLabel lblPedido;
    private javax.swing.JLabel lblQtd;
    private javax.swing.JLabel lblSaida;
    private javax.swing.JList<Entidades.Item> lstTela;
    private javax.swing.JRadioButton rbMesa1;
    private javax.swing.JRadioButton rbMesa2;
    private javax.swing.JRadioButton rbMesa3;
    private javax.swing.JRadioButton rbMesa4;
    private javax.swing.JRadioButton rbMesa5;
    private javax.swing.JRadioButton rbMesa6;
    private javax.swing.JRadioButton rbMesa7;
    private javax.swing.JRadioButton rbMesa8;
    private javax.swing.JRadioButton rbMesa9;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables

    Mesa mesa1 = new Mesa(1, new JList<>(new DefaultListModel<>()), "", "");
    Mesa mesa2 = new Mesa(2, new JList<>(new DefaultListModel<>()), "", "");
    Mesa mesa3 = new Mesa(3, new JList<>(new DefaultListModel<>()), "", "");
    Mesa mesa4 = new Mesa(4, new JList<>(new DefaultListModel<>()), "", "");
    Mesa mesa5 = new Mesa(5, new JList<>(new DefaultListModel<>()), "", "");
    Mesa mesa6 = new Mesa(6, new JList<>(new DefaultListModel<>()), "", "");
    Mesa mesa7 = new Mesa(7, new JList<>(new DefaultListModel<>()), "", "");
    Mesa mesa8 = new Mesa(8, new JList<>(new DefaultListModel<>()), "", "");
    Mesa mesa9 = new Mesa(9, new JList<>(new DefaultListModel<>()), "", "");
    
    private int guardaMesaSelecionada;

    //Se a mesa estiver ocupada (com pedido na lista), label de cor vermelha.
    private void verificaMesasOcupadas() {
        //Padroniza fontes
        rbMesa1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        rbMesa2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        rbMesa3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        rbMesa4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        rbMesa5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        rbMesa6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        rbMesa7.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        rbMesa8.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        rbMesa9.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));

        //Verifica disponibilidade
        if (mesa1.getLstMesa().getModel().getSize() > 0) {
            rbMesa1.setForeground(Color.RED);
        } else {
            rbMesa1.setForeground(Color.BLUE);
        }
        
        if (mesa2.getLstMesa().getModel().getSize() > 0) {
            rbMesa2.setForeground(Color.RED);
        } else {
            rbMesa2.setForeground(Color.BLUE);
        }
        
        if (mesa3.getLstMesa().getModel().getSize() > 0) {
            rbMesa3.setForeground(Color.RED);
        } else {
            rbMesa3.setForeground(Color.BLUE);
        }
        
        if (mesa4.getLstMesa().getModel().getSize() > 0) {
            rbMesa4.setForeground(Color.RED);
        } else {
            rbMesa4.setForeground(Color.BLUE);
        }
        
        if (mesa5.getLstMesa().getModel().getSize() > 0) {
            rbMesa5.setForeground(Color.RED);
        } else {
            rbMesa5.setForeground(Color.BLUE);
        }
        
        if (mesa6.getLstMesa().getModel().getSize() > 0) {
            rbMesa6.setForeground(Color.RED);
        } else {
            rbMesa6.setForeground(Color.BLUE);
        }
        
        if (mesa7.getLstMesa().getModel().getSize() > 0) {
            rbMesa7.setForeground(Color.RED);
        } else {
            rbMesa7.setForeground(Color.BLUE);
        }
        
        if (mesa8.getLstMesa().getModel().getSize() > 0) {
            rbMesa8.setForeground(Color.RED);
        } else {
            rbMesa8.setForeground(Color.BLUE);
        }
        
        if (mesa9.getLstMesa().getModel().getSize() > 0) {
            rbMesa9.setForeground(Color.RED);
        } else {
            rbMesa9.setForeground(Color.BLUE);
        }
    }

    //Marca mesa selecionada no momento
    private void alteraFontELabelMesaSelecionada(JRadioButton mesa, int numero) {
        verificaMesasOcupadas();
        guardaMesaSelecionada = numero;
        lblMesaSelecionada.setText("Mesa 0" + numero);
        mesa.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 12));
        mesa.setForeground(Color.DARK_GRAY);
    }
    
    private Mesa retornaMesaPorNumero(int numero) {
        switch (numero) {
            case 1:
                return mesa1;
            case 2:
                return mesa2;
            case 3:
                return mesa3;
            case 4:
                return mesa4;
            case 5:
                return mesa5;
            case 6:
                return mesa6;
            case 7:
                return mesa7;
            case 8:
                return mesa8;
            case 9:
                return mesa9;
        }
        
        return null;
    }

    //Preenche cardápio
    private void preencheItens() {
        cbItens.addItem("Selecione");

        //Itens do cardápio
        cbItens.addItem("Porção de Fritas");
        cbItens.addItem("Porção de Filé");
        cbItens.addItem("Porção Trio Mineiro");
        cbItens.addItem("Porção de Camarão Frito");
        cbItens.addItem("Porção de Bolinho de Bacalhau");
        cbItens.addItem("Refrigerante Lata");
        cbItens.addItem("Água Mineral");
        cbItens.addItem("Suco Natural");
        cbItens.addItem("Cerveja Lata");
        cbItens.addItem("Cerveja Artesanal");
        cbItens.addItem("Taças de Vinho");
    }
    
    private void destravaCampos() {
        btnAdicionar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnFecharPedido.setEnabled(true);
        btnRelatorio.setEnabled(false);
        cbPersistenciaOut.setEnabled(false);
        cbPersistenciaIn.setEnabled(false);
        btnCancelar.setEnabled(true);
        
        txtQtd.setEnabled(true);
        cbItens.setEnabled(true);
        lblHora.setText(retornaMesaPorNumero(guardaMesaSelecionada).getHoraAbertura());
        lstTela.setModel((DefaultListModel<Item>) retornaMesaPorNumero(guardaMesaSelecionada).getLstMesa().getModel());
    }
    
    private void travaCampos() {
        btnAdicionar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnFecharPedido.setEnabled(false);
        btnRelatorio.setEnabled(true);
        cbPersistenciaOut.setEnabled(true);
        cbPersistenciaIn.setEnabled(true);
        btnCancelar.setEnabled(false);
        
        txtQtd.setEnabled(false);
        cbItens.setEnabled(false);
        
        lblMesaSelecionada.setText("");
        lstTela.setModel(new DefaultListModel<>());
        
        cbItens.setSelectedIndex(0);
        txtQtd.setText("");
        
        verificaMesasOcupadas();
    }
    
    private String setaHoraMesa() {
        
        GregorianCalendar gc = new GregorianCalendar();
        
        int hora = gc.get(gc.HOUR_OF_DAY);
        int minutos = gc.get(gc.MINUTE);
        int dia = gc.get(gc.DATE);
        
        return (String.valueOf(dia) + "/02/2016 às "
                + String.valueOf(hora) + ":"
                + String.valueOf(minutos));
    }
    
    private void instanciaMesa() {
        DefaultListModel<Item> modelSelecionado = (DefaultListModel<Item>) retornaMesaPorNumero(guardaMesaSelecionada).getLstMesa().getModel();
        
        cbItens.setSelectedIndex(0);
        txtQtd.setText("");

        //Mesa nova
        if (modelSelecionado.getSize() == 0) {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja abrir um pedido nessa mesa?");
            if (resposta == JOptionPane.YES_OPTION) {
                destravaCampos();
            } else {
                travaCampos();
            }
        } else {
            destravaCampos();
        }
    }
    
    private boolean validaCampos(String qtd, int index) {
        boolean podeAdicionar = true;
        if (qtd.length() == 0 || index == 0) {
            JOptionPane.showMessageDialog(null, "Favor preencher todos os campos!");
            podeAdicionar = false;
        }
        return podeAdicionar;
    }
    
    private String retornaRelatorioPorMesa(int numero) {
        String retorno;
        
        if (retornaMesaPorNumero(numero).getLstMesa().getModel().getSize() > 0) {
            retorno = "Mesa " + numero + " \n"
                    + "Itens: " + retornaMesaPorNumero(numero).getLstMesa().getModel().toString()
                    + "\nAbertura: " + retornaMesaPorNumero(numero).getHoraAbertura()
                    + "\nFechamento: " + retornaMesaPorNumero(numero).getHoraFechamento() + "\n";
        } else {
            retorno = "Mesa " + numero + " vazia. \n";
        }
        
        return retorno;
    }
    
    private DefaultListModel<DefaultListModel<Item>> PreencheModelTodasMesas(DefaultListModel<DefaultListModel<Item>> modelSelecionado) {
        
        for (int i = 0; i < 9; i++) {
            modelSelecionado.add(i, (DefaultListModel<Item>) retornaMesaPorNumero(i + 1).getLstMesa().getModel());
        }
        
        return modelSelecionado;
    }
}
