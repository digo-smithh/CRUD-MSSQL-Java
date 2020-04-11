package interfaces;

import javax.swing.ImageIcon;

public class HomeUI extends javax.swing.JFrame 
{
    public HomeUI() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(385, 349);  
        this.setIconImage(new ImageIcon(getClass().getResource("/imagens/house2.png")).getImage());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();

        jMenu6.setText("File");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar2.add(jMenu7);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home ");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 179, 255));
        setMaximumSize(new java.awt.Dimension(690, 430));
        setName("frmPrincipal"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 179, 255));
        jPanel1.setName("pnlSuperior"); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 73));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 380, 250));

        jMenuBar3.setFocusable(false);
        jMenuBar3.setName("menuOpcoes"); // NOI18N

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/basket.png"))); // NOI18N
        jMenu8.setText("Produtos");
        jMenu8.setName(""); // NOI18N
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenu8MouseExited(evt);
            }
        });
        jMenuBar3.add(jMenu8);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user.png"))); // NOI18N
        jMenu9.setText("Clientes");
        jMenu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenu9MouseExited(evt);
            }
        });
        jMenuBar3.add(jMenu9);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/money.png"))); // NOI18N
        jMenu10.setText("Vendas");
        jMenu10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenu10MouseExited(evt);
            }
        });
        jMenuBar3.add(jMenu10);

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/phone.png"))); // NOI18N
        jMenu11.setText("Mensagens");
        jMenu11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenu11MouseExited(evt);
            }
        });
        jMenuBar3.add(jMenu11);

        jMenu12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/door_out.png"))); // NOI18N
        jMenu12.setText("Sair");
        jMenu12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenu12MouseExited(evt);
            }
        });
        jMenuBar3.add(jMenu12);

        setJMenuBar(jMenuBar3);
        jMenuBar3.getAccessibleContext().setAccessibleName("menuOpcoes");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu12MouseClicked
        dispose();
    }//GEN-LAST:event_jMenu12MouseClicked
    
    private void jMenu8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseExited
        jMenu8.doClick();
    }//GEN-LAST:event_jMenu8MouseExited

    private void jMenu9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MouseExited
        jMenu9.doClick();
    }//GEN-LAST:event_jMenu9MouseExited

    private void jMenu10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu10MouseExited
        jMenu10.doClick();
    }//GEN-LAST:event_jMenu10MouseExited

    private void jMenu11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu11MouseExited
        jMenu11.doClick();
    }//GEN-LAST:event_jMenu11MouseExited

    private void jMenu12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu12MouseExited
        jMenu12.doClick();
    }//GEN-LAST:event_jMenu12MouseExited

    private void jMenu8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseEntered
        jMenu8.doClick();
    }//GEN-LAST:event_jMenu8MouseEntered

    private void jMenu9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MouseEntered
        jMenu9.doClick();
    }//GEN-LAST:event_jMenu9MouseEntered

    private void jMenu10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu10MouseEntered
        jMenu10.doClick();
    }//GEN-LAST:event_jMenu10MouseEntered

    private void jMenu11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu11MouseEntered
        jMenu11.doClick();
    }//GEN-LAST:event_jMenu11MouseEntered

    private void jMenu12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu12MouseEntered
        jMenu12.doClick();
    }//GEN-LAST:event_jMenu12MouseEntered

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jMenu12.doClick();
    }//GEN-LAST:event_formWindowOpened

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        ProdutosUI produtos = new ProdutosUI(this, true);
        produtos.setVisible(true);
    }//GEN-LAST:event_jMenu8MouseClicked

    private void jMenu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MouseClicked
        ClientesUI clientes = new ClientesUI(this, true);
        clientes.setVisible(true);
    }//GEN-LAST:event_jMenu9MouseClicked

    private void jMenu11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu11MouseClicked
        MensagensUI mensagens = new MensagensUI(this, true);
        mensagens.setVisible(true);
    }//GEN-LAST:event_jMenu11MouseClicked

    private void jMenu10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu10MouseClicked
        VendasUI vendas = new VendasUI(this, true);
        vendas.setVisible(true);
    }//GEN-LAST:event_jMenu10MouseClicked
       
    public static void main(String args[]) 
    {
        try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
            {
                if ("Nimbus".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        catch (ClassNotFoundException ex) 
        {
            java.util.logging.Logger.getLogger(HomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (InstantiationException ex) 
        {
            java.util.logging.Logger.getLogger(HomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (IllegalAccessException ex) 
        {
            java.util.logging.Logger.getLogger(HomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (javax.swing.UnsupportedLookAndFeelException ex) 
        {
            java.util.logging.Logger.getLogger(HomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater (new Runnable() 
        {
            public void run() 
            {
                HomeUI home = new HomeUI();
                home.setVisible(true);          
            }
        });      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

