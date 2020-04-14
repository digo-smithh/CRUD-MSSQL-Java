package interfaces;

import javax.swing.ImageIcon;

public class HomeUI extends javax.swing.JFrame 
{
    public HomeUI() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagens/house2.png")).getImage());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
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

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 270));

        jMenuBar3.setFocusable(false);
        jMenuBar3.setName("menuOpcoes"); // NOI18N

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user.png"))); // NOI18N
        jMenu10.setLabel("Designers");
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
        jMenu10.getAccessibleContext().setAccessibleName("Designers");

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/page_white_magnify.png"))); // NOI18N
        jMenu9.setLabel("Contratos");
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

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/color_wheel.png"))); // NOI18N
        jMenu8.setLabel("Websites");
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

    private void jMenu12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu12MouseEntered
        jMenu12.doClick();
    }//GEN-LAST:event_jMenu12MouseEntered

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jMenu12.doClick();
    }//GEN-LAST:event_formWindowOpened

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked

    }//GEN-LAST:event_jMenu8MouseClicked

    private void jMenu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MouseClicked

    }//GEN-LAST:event_jMenu9MouseClicked

    private void jMenu10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu10MouseClicked
        DesignersUI desingers = new DesignersUI(this, true);
        desingers.setVisible(true);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    // End of variables declaration//GEN-END:variables
}

