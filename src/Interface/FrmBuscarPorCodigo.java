/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import estoqueprod.GerenciarProdutos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jackson Souza
 */
public class FrmBuscarPorCodigo extends javax.swing.JInternalFrame {

    public FrmBuscarPorCodigo() {
        initComponents();
        pnEletronico.setVisible(false);
        pnMaterial.setVisible(false);
        pnPerecivel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnProcurar = new javax.swing.JButton();
        txtValor = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lNome = new javax.swing.JLabel();
        lFabricante = new javax.swing.JLabel();
        lQuantidade = new javax.swing.JLabel();
        lPreco = new javax.swing.JLabel();
        pnMaterial = new javax.swing.JPanel();
        lMaterial = new javax.swing.JLabel();
        pnEletronico = new javax.swing.JPanel();
        lVoltagem = new javax.swing.JLabel();
        lPotencia = new javax.swing.JLabel();
        lClassificacao = new javax.swing.JLabel();
        pnPerecivel = new javax.swing.JPanel();
        lValidade = new javax.swing.JLabel();
        lRefrigerado = new javax.swing.JLabel();
        lCodigo = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btCancelar = new javax.swing.JButton();

        setTitle("PROCURAR PRODUTO POR CODIGO");
        setPreferredSize(new java.awt.Dimension(1024, 537));

        btnProcurar.setText("PROCURAR PRODUTO");
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtValor, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcurar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lNome.setText("NOME DO PRODUTO");

        lFabricante.setText("FABRICANTE DO PRODUTO");

        lQuantidade.setText("QUANTIDADE EM ESTOQUE DO PRODUTO");

        lPreco.setText("PRECO DO PRODUTO");

        pnMaterial.setBorder(javax.swing.BorderFactory.createTitledBorder("Movel"));

        lMaterial.setText("MATERIAL DO PRODUTO");

        javax.swing.GroupLayout pnMaterialLayout = new javax.swing.GroupLayout(pnMaterial);
        pnMaterial.setLayout(pnMaterialLayout);
        pnMaterialLayout.setHorizontalGroup(
            pnMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMaterialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lMaterial)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnMaterialLayout.setVerticalGroup(
            pnMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMaterialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lMaterial)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnEletronico.setBorder(javax.swing.BorderFactory.createTitledBorder("Eletronico"));

        lVoltagem.setText("VOLTAGEM DO PRODUTO");

        lPotencia.setText("POTENCIA DO PRODUTO");

        lClassificacao.setText("CLASSIFICAÇÃO DE EFICIÊNCIA DO PRODUTO");

        javax.swing.GroupLayout pnEletronicoLayout = new javax.swing.GroupLayout(pnEletronico);
        pnEletronico.setLayout(pnEletronicoLayout);
        pnEletronicoLayout.setHorizontalGroup(
            pnEletronicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEletronicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnEletronicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lVoltagem)
                    .addComponent(lPotencia)
                    .addComponent(lClassificacao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnEletronicoLayout.setVerticalGroup(
            pnEletronicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEletronicoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lVoltagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lPotencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lClassificacao))
        );

        pnPerecivel.setBorder(javax.swing.BorderFactory.createTitledBorder("Perecivel"));

        lValidade.setText("VALIDADE DO PRODUTO");

        lRefrigerado.setText("PRODUTO É REFRIGERADO ?");

        javax.swing.GroupLayout pnPerecivelLayout = new javax.swing.GroupLayout(pnPerecivel);
        pnPerecivel.setLayout(pnPerecivelLayout);
        pnPerecivelLayout.setHorizontalGroup(
            pnPerecivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPerecivelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPerecivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lValidade)
                    .addComponent(lRefrigerado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnPerecivelLayout.setVerticalGroup(
            pnPerecivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPerecivelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lValidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lRefrigerado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lCodigo.setText("CODIGO DO PRODUTO");

        btCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btCancelar.setText("FECHAR ABA");
        btCancelar.setName("btAvancarCadastro"); // NOI18N
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lCodigo)
                    .addComponent(lNome)
                    .addComponent(lFabricante)
                    .addComponent(lQuantidade)
                    .addComponent(lPreco))
                .addContainerGap(775, Short.MAX_VALUE))
            .addComponent(pnMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnPerecivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnEletronico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lFabricante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lQuantidade)
                .addGap(10, 10, 10)
                .addComponent(lPreco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnEletronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnPerecivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String tipoProduto = "";
    
    
    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
        // TODO add your handling code here:
        GerenciarProdutos gr = new GerenciarProdutos();
        
        String teste = gr.buscarPorCodigo(Integer.parseInt(txtValor.getText())).imprimirTable();
        String[] dividirArray = teste.split(",");
        
        try {
            tipoProduto = dividirArray[11];

            String codigo = dividirArray[1];
            lCodigo.setText(codigo);
            String nome = dividirArray[1];
            lNome.setText(nome);
            String fabricante = dividirArray[2];
            lFabricante.setText(fabricante);
            String quantidade = dividirArray[3];
            lQuantidade.setText(quantidade);
            String preco = dividirArray[4];
            lPreco.setText(preco);
            String voltagem = dividirArray[5];
            if(tipoProduto.equals("1")){
                pnEletronico.setVisible(true);
                pnMaterial.setVisible(false);
                pnPerecivel.setVisible(false);

                lVoltagem.setText(voltagem);
                String potencia = dividirArray[6];
                lPotencia.setText(potencia);
                String classificacao = dividirArray[7];
                lClassificacao.setText(classificacao);
            }
            if(tipoProduto.equals("2")){
                pnEletronico.setVisible(false);
                pnMaterial.setVisible(true);
                pnPerecivel.setVisible(false);

                String material = dividirArray[10];
                lMaterial.setText(material);
            }
            if(tipoProduto.equals("3")){
                pnEletronico.setVisible(false);
                pnMaterial.setVisible(false);
                pnPerecivel.setVisible(true);

                String validade = dividirArray[8];
                lValidade.setText(validade);
                String refrigerado = dividirArray[9];
                lRefrigerado.setText(refrigerado);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Produto inexistente ou código incorreto.", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnProcurarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lClassificacao;
    private javax.swing.JLabel lCodigo;
    private javax.swing.JLabel lFabricante;
    private javax.swing.JLabel lMaterial;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lPotencia;
    private javax.swing.JLabel lPreco;
    private javax.swing.JLabel lQuantidade;
    private javax.swing.JLabel lRefrigerado;
    private javax.swing.JLabel lValidade;
    private javax.swing.JLabel lVoltagem;
    private javax.swing.JPanel pnEletronico;
    private javax.swing.JPanel pnMaterial;
    private javax.swing.JPanel pnPerecivel;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
