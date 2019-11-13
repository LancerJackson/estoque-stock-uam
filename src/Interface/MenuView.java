/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.BorderLayout;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

public class MenuView extends javax.swing.JFrame {

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
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }
    
    FrmCadastrar frmCadastrar;
    FrmRemoverProduto frmRemoverP;
    FrmListarTudo frmListar;
    FrmBuscarPorCodigo frmBusCodigo;
    FrmBuscarPorEletronicos frmBusEletronicos;
    FrmBuscarPorMoveis frmBusMoveis;
    FrmBuscarPorPereciveis frmBusPereciveis;
    FrmBuscarPorEstoque frmBusEstoque;
    FrmBuscarPorFabricante frmBusFabricante;
    FrmBuscarPorValidade frmBusValidade;
    FrmMovimentacaoCompra frmMovCompra;
    FrmMovimentacaoVenda frmMovVenda;
    
    public MenuView() {
        initComponents();
        this.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTela = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuMovimentacao = new javax.swing.JMenu();
        menuComprar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuVender = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        menuProdutos = new javax.swing.JMenu();
        menuCadastrar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuRemover = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuBuscas = new javax.swing.JMenu();
        menuListar = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menuBuscarPorCodigo = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        menuBuscarEletronicos = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        menuBuscarPorMoveis = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        menuBuscarPorPereciveis = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        menuBuscarPorEstoque = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        menuBuscarPorFabricante = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        menuBuscarPorValidade = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONTROLE DE ESTOQUE - UAM");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        pnTela.setToolTipText("");
        pnTela.setPreferredSize(new java.awt.Dimension(768, 600));

        javax.swing.GroupLayout pnTelaLayout = new javax.swing.GroupLayout(pnTela);
        pnTela.setLayout(pnTelaLayout);
        pnTelaLayout.setHorizontalGroup(
            pnTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );
        pnTelaLayout.setVerticalGroup(
            pnTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );

        getContentPane().add(pnTela, java.awt.BorderLayout.CENTER);

        menuMovimentacao.setText("Movimentação");

        menuComprar.setText("Comprar");
        menuComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuComprarActionPerformed(evt);
            }
        });
        menuMovimentacao.add(menuComprar);
        menuMovimentacao.add(jSeparator1);

        menuVender.setText("Vender");
        menuVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVenderActionPerformed(evt);
            }
        });
        menuMovimentacao.add(menuVender);
        menuMovimentacao.add(jSeparator12);

        jMenuBar1.add(menuMovimentacao);

        menuProdutos.setText("Gerenciar Produtos");

        menuCadastrar.setText("Cadastrar");
        menuCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarActionPerformed(evt);
            }
        });
        menuProdutos.add(menuCadastrar);
        menuProdutos.add(jSeparator2);

        menuRemover.setText("Remover");
        menuRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRemoverActionPerformed(evt);
            }
        });
        menuProdutos.add(menuRemover);
        menuProdutos.add(jSeparator3);

        jMenuBar1.add(menuProdutos);

        menuBuscas.setText("Buscar Produto");
        menuBuscas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscasActionPerformed(evt);
            }
        });

        menuListar.setText("Listar Todos");
        menuListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarActionPerformed(evt);
            }
        });
        menuBuscas.add(menuListar);
        menuBuscas.add(jSeparator4);

        menuBuscarPorCodigo.setText("Buscar por Código");
        menuBuscarPorCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarPorCodigoActionPerformed(evt);
            }
        });
        menuBuscas.add(menuBuscarPorCodigo);
        menuBuscas.add(jSeparator5);

        menuBuscarEletronicos.setText("Buscar Eletronicos");
        menuBuscarEletronicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarEletronicosActionPerformed(evt);
            }
        });
        menuBuscas.add(menuBuscarEletronicos);
        menuBuscas.add(jSeparator6);

        menuBuscarPorMoveis.setText("Buscar Moveis");
        menuBuscarPorMoveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarPorMoveisActionPerformed(evt);
            }
        });
        menuBuscas.add(menuBuscarPorMoveis);
        menuBuscas.add(jSeparator7);

        menuBuscarPorPereciveis.setText("Buscar Pereciveis");
        menuBuscarPorPereciveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarPorPereciveisActionPerformed(evt);
            }
        });
        menuBuscas.add(menuBuscarPorPereciveis);
        menuBuscas.add(jSeparator8);

        menuBuscarPorEstoque.setText("Buscar por Estoque");
        menuBuscarPorEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarPorEstoqueActionPerformed(evt);
            }
        });
        menuBuscas.add(menuBuscarPorEstoque);
        menuBuscas.add(jSeparator9);

        menuBuscarPorFabricante.setText("Buscar por Fabricante");
        menuBuscarPorFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarPorFabricanteActionPerformed(evt);
            }
        });
        menuBuscas.add(menuBuscarPorFabricante);
        menuBuscas.add(jSeparator10);

        menuBuscarPorValidade.setText("Buscar por Validade");
        menuBuscarPorValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarPorValidadeActionPerformed(evt);
            }
        });
        menuBuscas.add(menuBuscarPorValidade);
        menuBuscas.add(jSeparator11);

        jMenuBar1.add(menuBuscas);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void menuBuscasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuBuscasActionPerformed

    private void menuBuscarPorCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarPorCodigoActionPerformed
        // TODO add your handling code here:
        for (JInternalFrame frmChild : pnTela.getAllFrames()) {
            frmChild.dispose();
        }
        
        if(frmBusCodigo == null || frmBusCodigo .isClosed()){
            frmBusCodigo = new FrmBuscarPorCodigo();
            pnTela.add(frmBusCodigo);
            frmBusCodigo.setLocation(this.getWidth()/2 - frmBusCodigo.getWidth()/2, this.getHeight()/2 - frmBusCodigo.getHeight()/2);
            frmBusCodigo.setVisible(true);
        }else{
            frmBusCodigo.setVisible(true);
        }
    }//GEN-LAST:event_menuBuscarPorCodigoActionPerformed

    private void menuListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarActionPerformed
        for (JInternalFrame frmChild : pnTela.getAllFrames()) {
            frmChild.dispose();
        }

        if(frmListar == null || frmListar .isClosed()){
            frmListar = new FrmListarTudo();
            pnTela.add(frmListar);
            frmListar.setLocation(this.getWidth()/2 - frmListar.getWidth()/2, this.getHeight()/2 - frmListar.getHeight()/2);
            frmListar.setVisible(true);
        }else{
            frmListar.setVisible(true);
        }
    }//GEN-LAST:event_menuListarActionPerformed

    private void menuCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarActionPerformed
        for (JInternalFrame frmChild : pnTela.getAllFrames()) {
            frmChild.dispose();
        }

        if(frmCadastrar == null || frmCadastrar .isClosed()){
            frmCadastrar = new FrmCadastrar();
            frmCadastrar.addInternalFrameListener(new InternalFrameListener(){
                @Override
                public void internalFrameOpened(InternalFrameEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void internalFrameClosing(InternalFrameEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void internalFrameClosed(InternalFrameEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void internalFrameIconified(InternalFrameEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void internalFrameDeiconified(InternalFrameEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void internalFrameActivated(InternalFrameEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void internalFrameDeactivated(InternalFrameEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

            });
            pnTela.add(frmCadastrar);
            frmCadastrar.setLocation(this.getWidth()/2 - frmCadastrar.getWidth()/2, this.getHeight()/2 - frmCadastrar.getHeight()/2);
            frmCadastrar.setVisible(true);
        }else{
            frmCadastrar.setVisible(true);
        }
    }//GEN-LAST:event_menuCadastrarActionPerformed

    private void menuBuscarEletronicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarEletronicosActionPerformed
        // TODO add your handling code here:frmBusEletronicos
        for (JInternalFrame frmChild : pnTela.getAllFrames()) {
            frmChild.dispose();
        }
        
        if(frmBusEletronicos == null || frmBusEletronicos .isClosed()){
            frmBusEletronicos = new FrmBuscarPorEletronicos();
            pnTela.add(frmBusEletronicos);
            frmBusEletronicos.setLocation(this.getWidth()/2 - frmBusEletronicos.getWidth()/2, this.getHeight()/2 - frmBusEletronicos.getHeight()/2);
            frmBusEletronicos.setVisible(true);
        }else{
            frmBusEletronicos.setVisible(true);
        }
    }//GEN-LAST:event_menuBuscarEletronicosActionPerformed

    private void menuBuscarPorMoveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarPorMoveisActionPerformed
        // TODO add your handling code here:;
        for (JInternalFrame frmChild : pnTela.getAllFrames()) {
            frmChild.dispose();
        }
        
        if(frmBusMoveis == null || frmBusMoveis .isClosed()){
            frmBusMoveis = new FrmBuscarPorMoveis();
            pnTela.add(frmBusMoveis);
            frmBusMoveis.setLocation(this.getWidth()/2 - frmBusMoveis.getWidth()/2, this.getHeight()/2 - frmBusMoveis.getHeight()/2);
            frmBusMoveis.setVisible(true);
        }else{
            frmBusMoveis.setVisible(true);
        }
    }//GEN-LAST:event_menuBuscarPorMoveisActionPerformed

    private void menuBuscarPorPereciveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarPorPereciveisActionPerformed
        // TODO add your handling code here:frmBusPereciveis
        for (JInternalFrame frmChild : pnTela.getAllFrames()) {
            frmChild.dispose();
        }
        
        if(frmBusPereciveis == null || frmBusPereciveis .isClosed()){
            frmBusPereciveis = new FrmBuscarPorPereciveis();
            pnTela.add(frmBusPereciveis);
            frmBusPereciveis.setLocation(this.getWidth()/2 - frmBusPereciveis.getWidth()/2, this.getHeight()/2 - frmBusPereciveis.getHeight()/2);
            frmBusPereciveis.setVisible(true);
        }else{
            frmBusPereciveis.setVisible(true);
        }
    }//GEN-LAST:event_menuBuscarPorPereciveisActionPerformed

    private void menuBuscarPorEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarPorEstoqueActionPerformed
        // TODO add your handling code here:frmBusEstoque;
        for (JInternalFrame frmChild : pnTela.getAllFrames()) {
            frmChild.dispose();
        }
        
        if(frmBusEstoque == null || frmBusEstoque .isClosed()){
            frmBusEstoque = new FrmBuscarPorEstoque();
            pnTela.add(frmBusEstoque);
            frmBusEstoque.setLocation(this.getWidth()/2 - frmBusEstoque.getWidth()/2, this.getHeight()/2 - frmBusEstoque.getHeight()/2);
            frmBusEstoque.setVisible(true);
        }else{
            frmBusEstoque.setVisible(true);
        }
    }//GEN-LAST:event_menuBuscarPorEstoqueActionPerformed

    private void menuBuscarPorFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarPorFabricanteActionPerformed
        // TODO add your handling code here:frmBusFabricante
        for (JInternalFrame frmChild : pnTela.getAllFrames()) {
            frmChild.dispose();
        }
        
        if(frmBusFabricante == null || frmBusFabricante .isClosed()){
            frmBusFabricante = new FrmBuscarPorFabricante();
            pnTela.add(frmBusFabricante);
            frmBusFabricante.setLocation(this.getWidth()/2 - frmBusFabricante.getWidth()/2, this.getHeight()/2 - frmBusFabricante.getHeight()/2);
            frmBusFabricante.setVisible(true);
        }else{
            frmBusFabricante.setVisible(true);
        }
    }//GEN-LAST:event_menuBuscarPorFabricanteActionPerformed

    private void menuBuscarPorValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarPorValidadeActionPerformed
        // TODO add your handling code here:frmBusValidade
        for (JInternalFrame frmChild : pnTela.getAllFrames()) {
            frmChild.dispose();
        }
        
        if(frmBusValidade == null || frmBusValidade .isClosed()){
            frmBusValidade = new FrmBuscarPorValidade();
            pnTela.add(frmBusValidade);
            frmBusValidade.setLocation(this.getWidth()/2 - frmBusValidade.getWidth()/2, this.getHeight()/2 - frmBusValidade.getHeight()/2);
            frmBusValidade.setVisible(true);
        }else{
            frmBusValidade.setVisible(true);
        }
    }//GEN-LAST:event_menuBuscarPorValidadeActionPerformed

    private void menuRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRemoverActionPerformed
        // TODO add your handling code here:
        for (JInternalFrame frmChild : pnTela.getAllFrames()) {
            frmChild.dispose();
        }
        
        if(frmRemoverP == null || frmRemoverP .isClosed()){
            frmRemoverP = new FrmRemoverProduto();
            pnTela.add(frmRemoverP);
            frmRemoverP.setLocation(this.getWidth()/2 - frmRemoverP.getWidth()/2, this.getHeight()/2 - frmRemoverP.getHeight()/2);
            frmRemoverP.setVisible(true);
        }else{
            frmRemoverP.setVisible(true);
        }
    }//GEN-LAST:event_menuRemoverActionPerformed

    private void menuComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuComprarActionPerformed
        // TODO add your handling code here:frmMovCompra;
        for (JInternalFrame frmChild : pnTela.getAllFrames()) {
            frmChild.dispose();
        }
        
        if(frmMovCompra == null || frmMovCompra .isClosed()){
            frmMovCompra = new FrmMovimentacaoCompra();
            pnTela.add(frmMovCompra);
            frmMovCompra.setLocation(this.getWidth()/2 - frmMovCompra.getWidth()/2, this.getHeight()/2 - frmMovCompra.getHeight()/2);
            frmMovCompra.setVisible(true);
        }else{
            frmMovCompra.setVisible(true);
        }
    }//GEN-LAST:event_menuComprarActionPerformed

    private void menuVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVenderActionPerformed
        // TODO add your handling code here:frmMovVenda
        for (JInternalFrame frmChild : pnTela.getAllFrames()) {
            frmChild.dispose();
        }
        
        if(frmMovVenda == null || frmMovVenda .isClosed()){
            frmMovVenda = new FrmMovimentacaoVenda();
            pnTela.add(frmMovVenda);
            frmMovVenda.setLocation(this.getWidth()/2 - frmMovVenda.getWidth()/2, this.getHeight()/2 - frmMovVenda.getHeight()/2);
            frmMovVenda.setVisible(true);
        }else{
            frmMovVenda.setVisible(true);
        }
    }//GEN-LAST:event_menuVenderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenuItem menuBuscarEletronicos;
    private javax.swing.JMenuItem menuBuscarPorCodigo;
    private javax.swing.JMenuItem menuBuscarPorEstoque;
    private javax.swing.JMenuItem menuBuscarPorFabricante;
    private javax.swing.JMenuItem menuBuscarPorMoveis;
    private javax.swing.JMenuItem menuBuscarPorPereciveis;
    private javax.swing.JMenuItem menuBuscarPorValidade;
    private javax.swing.JMenu menuBuscas;
    private javax.swing.JMenuItem menuCadastrar;
    private javax.swing.JMenuItem menuComprar;
    private javax.swing.JMenuItem menuListar;
    private javax.swing.JMenu menuMovimentacao;
    private javax.swing.JMenu menuProdutos;
    private javax.swing.JMenuItem menuRemover;
    private javax.swing.JMenuItem menuVender;
    private javax.swing.JDesktopPane pnTela;
    // End of variables declaration//GEN-END:variables
}
