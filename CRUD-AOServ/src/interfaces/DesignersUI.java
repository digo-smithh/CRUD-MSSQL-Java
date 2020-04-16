package interfaces;

import bd.daos.Designers;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class DesignersUI extends javax.swing.JDialog 
{
    Object[][] matrizVendas = null;
    int indice = 0;
    int proximoIndice = 0;
    boolean terminou = false;
    boolean comecou = false;
    
    public DesignersUI(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagens/user.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField13 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jFormattedTextField6 = new javax.swing.JFormattedTextField();
        jLabel23 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" Designers");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(219, 219, 225));
        jPanel2.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 11)); // NOI18N
        jPanel2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel2ComponentShown(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 11)); // NOI18N
        jTextField1.setName("txtCodigo"); // NOI18N
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 110, 40));

        jButton1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoom.png"))); // NOI18N
        jButton1.setText(" Consultar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 110, 40));

        jLabel2.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel2.setText("Código do cliente:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel4.setText("Data venda:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 11)); // NOI18N
        jTextField5.setMinimumSize(new java.awt.Dimension(6, 22));
        jTextField5.setName("txtCodigo"); // NOI18N
        jTextField5.setPreferredSize(new java.awt.Dimension(6, 22));
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 450, 30));

        jLabel6.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel6.setText("Total:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 40, -1));

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 11)); // NOI18N
        jTextField6.setMinimumSize(new java.awt.Dimension(6, 22));
        jTextField6.setName("txtCodigo"); // NOI18N
        jTextField6.setPreferredSize(new java.awt.Dimension(6, 22));
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 80, 30));

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 11)); // NOI18N
        jTextField7.setName("txtCodigo"); // NOI18N
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 80, 30));

        jLabel10.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel10.setText("Endereço:");
        jLabel10.setToolTipText("");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 610, 10));

        jLabel12.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel12.setText("Complemento:");
        jLabel12.setToolTipText("");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 11)); // NOI18N
        jTextField8.setMinimumSize(new java.awt.Dimension(6, 22));
        jTextField8.setName("txtCodigo"); // NOI18N
        jTextField8.setPreferredSize(new java.awt.Dimension(6, 22));
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 200, 30));

        jLabel13.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel13.setText("Bairro:");
        jLabel13.setToolTipText("");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 11)); // NOI18N
        jTextField9.setMinimumSize(new java.awt.Dimension(6, 22));
        jTextField9.setName("txtCodigo"); // NOI18N
        jTextField9.setPreferredSize(new java.awt.Dimension(6, 22));
        jPanel2.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 110, 30));

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 11)); // NOI18N
        jTextField10.setMinimumSize(new java.awt.Dimension(6, 22));
        jTextField10.setName("txtCodigo"); // NOI18N
        jTextField10.setPreferredSize(new java.awt.Dimension(6, 22));
        jPanel2.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 120, 30));

        jLabel14.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel14.setText("Cidade:");
        jLabel14.setToolTipText("");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        jLabel16.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel16.setText("Estado:");
        jLabel16.setToolTipText("");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 11)); // NOI18N
        jTextField12.setMinimumSize(new java.awt.Dimension(6, 22));
        jTextField12.setName("txtCodigo"); // NOI18N
        jTextField12.setPreferredSize(new java.awt.Dimension(6, 22));
        jPanel2.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 170, 30));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 11)); // NOI18N
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 80, 30));

        jLabel7.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel7.setText("CEP:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel15.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel15.setText("Pagamento:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 60, -1));

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 11)); // NOI18N
        jTextField11.setMinimumSize(new java.awt.Dimension(6, 22));
        jTextField11.setName("txtCodigo"); // NOI18N
        jTextField11.setPreferredSize(new java.awt.Dimension(6, 22));
        jPanel2.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 110, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Actions-go-previous-icon.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 50, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Actions-go-next-icon.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 50, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 250, 110));

        jTabbedPane1.addTab("Consultar/ Editar / Excluir  ", new javax.swing.ImageIcon(getClass().getResource("/imagens/zoom.png")), jPanel2); // NOI18N

        jPanel4.setBackground(new java.awt.Color(219, 219, 225));
        jPanel4.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 11)); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel3.setText("Código");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel5.setText("Especialidade");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, 20));

        jLabel8.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel8.setText("Nome");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel9.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel9.setText("Telefone");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jTextField14.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 11)); // NOI18N
        jTextField14.setName("txtCodigo"); // NOI18N
        jPanel4.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 130, 30));

        jLabel11.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel11.setText("Email");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        jLabel17.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel17.setText("CEP");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 11)); // NOI18N
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 170, 30));

        jTextField13.setEditable(false);
        jTextField13.setBackground(new java.awt.Color(210, 210, 210));
        jTextField13.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 11)); // NOI18N
        jTextField13.setName("txtCodigo"); // NOI18N
        jPanel4.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 330, 30));

        jLabel18.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel18.setText("Endereço");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        jTextField17.setEditable(false);
        jTextField17.setBackground(new java.awt.Color(210, 210, 210));
        jTextField17.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 11)); // NOI18N
        jTextField17.setName("txtCodigo"); // NOI18N
        jPanel4.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 40, 30));

        jLabel19.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel19.setText("UF");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 260, -1, -1));

        jTextField18.setEditable(false);
        jTextField18.setBackground(new java.awt.Color(210, 210, 210));
        jTextField18.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 11)); // NOI18N
        jTextField18.setName("txtCodigo"); // NOI18N
        jPanel4.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 130, 30));

        jLabel20.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel20.setText("Cidade");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel21.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel21.setText("Número");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        jLabel22.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel22.setText("Complemento");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel4.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 130, 30));

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel4.add(jFormattedTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 280, 30));

        try {
            jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextField3FocusLost(evt);
            }
        });
        jPanel4.add(jFormattedTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 100, 30));

        try {
            jFormattedTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel4.add(jFormattedTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 60, 30));

        try {
            jFormattedTextField5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel4.add(jFormattedTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 190, 30));

        try {
            jFormattedTextField6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel4.add(jFormattedTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 330, 30));

        jLabel23.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 11)); // NOI18N
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/information.png"))); // NOI18N
        jLabel23.setText("Não é permitido códigos repetidos.");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 45, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/accept.png"))); // NOI18N
        jButton4.setText(" Confirmar");
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 23, 130, 40));

        jTabbedPane1.addTab("Cadastrar  ", new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png")), jPanel4); // NOI18N

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 610, 370));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       indice--;  
        
        if (proximoIndice == indice && indice != matrizVendas.length - 1)
        {
            while(indice >= proximoIndice)
                indice--;
        }
        
        if(indice < 0)
            return;
        
        contoladorDeIndice();
        
        float total = calculaIndiceEPrecoAoVoltar(); 
        total = Math.round(total);
        if (total == -1)
        {
            total = (float)matrizVendas[indice][10];
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Produto");
            model.addColumn("Qtd");
            model.addColumn("Total");
            model.addRow(new Object[]{matrizVendas[indice][0], matrizVendas[indice][1],matrizVendas[indice][10]});
            jTable1.setModel(model);
            formatarColunasDaTabela();  
        }
        
        String data = matrizVendas[indice][2].toString().substring(0, 10);
        jTextField5.setText(matrizVendas[indice][4] + ", " + matrizVendas[0][5]);
        jTextField9.setText(matrizVendas[indice][7].toString());
        jTextField10.setText(matrizVendas[indice][8].toString());
        jTextField12.setText(matrizVendas[indice][9].toString());
        jTextField8.setText(matrizVendas[indice][6].toString());
        jTextField2.setText(matrizVendas[indice][3].toString());
        jTextField6.setText(total + "");
        jTextField7.setText(data);
        jTextField11.setText(matrizVendas[indice][11].toString());  
        
        if (indice == 0)
        {
            float aux = calculaIndiceEPrecoAoAvancar();
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        indice++;  
        
        if (proximoIndice == indice && indice != 0)
        {       
            while(indice <= proximoIndice)
                indice++;
        }
        
        if(indice > matrizVendas.length - 1 || proximoIndice + 1 == matrizVendas.length - 1)
            return; 
        
        contoladorDeIndice();
                 
        float total = calculaIndiceEPrecoAoAvancar();    
              
        if (total == -1)
        {
            total = (float)matrizVendas[indice][10];
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Produto");
            model.addColumn("Qtd");
            model.addColumn("Total");
            model.addRow(new Object[]{matrizVendas[indice][0], matrizVendas[indice][1],matrizVendas[indice][10]});
            jTable1.setModel(model);
            formatarColunasDaTabela();  
        }
        
        String data = matrizVendas[indice][2].toString().substring(0, 10);
        jTextField5.setText(matrizVendas[indice][4] + ", " + matrizVendas[0][5]);
        jTextField9.setText(matrizVendas[indice][7].toString());
        jTextField10.setText(matrizVendas[indice][8].toString());
        jTextField12.setText(matrizVendas[indice][9].toString());
        jTextField8.setText(matrizVendas[indice][6].toString());
        jTextField2.setText(matrizVendas[indice][3].toString());
        jTextField6.setText(total + "");
        jTextField7.setText(data);
        jTextField11.setText(matrizVendas[indice][11].toString());    
        
        if (indice == matrizVendas.length - 1)
        {
            float aux = calculaIndiceEPrecoAoVoltar();
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jPanel2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel2ComponentShown
        
    }//GEN-LAST:event_jPanel2ComponentShown

    private void jFormattedTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField3FocusLost
        try
        {
            if (Designers.existeDesigner(Integer.parseInt(jFormattedTextField3.getText())))
            {
                JOptionPane.showMessageDialog(null,"Código já existente! Tente outro número."," Erro", JOptionPane.ERROR_MESSAGE);
                jFormattedTextField3.setText("");
            }
        }
        catch (Exception e)
        {} //não dará erro
    }//GEN-LAST:event_jFormattedTextField3FocusLost

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                DesignersUI dialog = new DesignersUI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() 
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) 
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JFormattedTextField jFormattedTextField6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    private void limparTela()
    {
        jTextField1.setText("");
        jTextField5.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField12.setText("");
        jTextField8.setText("");
        jTextField8.setText("");
        jTextField2.setText("");
        jTextField7.setText("");
        jTextField6.setText("");
        jTextField11.setText("");
    }
    
    private void formatarColunasDaTabela() 
    {
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(20);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(20);
        
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();

        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);

        jTable1.getColumnModel().getColumn(0).setCellRenderer(direita);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(centralizado);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(centralizado);
    }
    
    private static int indexOf(int[][] matriz, int element)
    {
        
        int index = -1;
        
        if(matriz == null)
            return index;
        
        for(int i=0; i < matriz.length; i++){
            if(matriz[i][12] == element){
                index = i;
                break;
            }
        }
                
        return index;        
    }
    
    private void contoladorDeIndice()
    {
        if(indice >= matrizVendas.length - 1)
        {
            indice = matrizVendas.length - 1;
        }
        
        if(indice <= 0)
        {
            indice = 0;
        }
    }
    
    private float calculaIndiceEPrecoAoVoltar()
    {      
        boolean passou = false;
        boolean ePrimeiraVez = true;
        float total = 0;
        
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Produto");
        model.addColumn("Qtd");
        model.addColumn("Total");
        
        for (int i2 = matrizVendas.length - 1; i2 >= 0; i2--)
        {                                                     
            if (i2 != 0)
            {
                if (matrizVendas[i2][2].equals(matrizVendas[i2 - 1][2]) && matrizVendas[i2][2].equals(matrizVendas[indice][2]))
                {
                    if (ePrimeiraVez)
                    {
                        total = 0;
                        ePrimeiraVez = false;
                    }
                    
                    total += (float)matrizVendas[i2][10] + (float)matrizVendas[i2 - 1][10];                   
                    proximoIndice = i2 - 1;     
                    passou = true;
                    
                    model.addRow(new Object[]{matrizVendas[i2][0], matrizVendas[i2][1], matrizVendas[i2][10]});
                    model.addRow(new Object[]{matrizVendas[i2 - 1][0], matrizVendas[i2 - 1][1], matrizVendas[i2 - 1][10]});                 
                }             
            }
        } 
        
        if (!passou)
            return -1;
        else
        {
            jTable1.setModel(model);
            formatarColunasDaTabela();  
            return total;
        }
    }
    
    private float calculaIndiceEPrecoAoAvancar()
    {
        boolean passou = false;
        boolean ePrimeiraVez = true;
        float total = 0;
        
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Produto");
        model.addColumn("Qtd");
        model.addColumn("Total");
        
        for (int i2 = 0; i2 < matrizVendas.length- 1; i2++)
        {                           
            if (i2 != 0)
            {
                if (matrizVendas[i2][2].equals(matrizVendas[i2 - 1][2]) && matrizVendas[i2][2].equals(matrizVendas[indice][2]))
                {
                    if (ePrimeiraVez)
                    {
                        total = 0;
                        ePrimeiraVez = false;
                    }
                    
                    total += (float)matrizVendas[i2][10] + (float)matrizVendas[i2 - 1][10];                   
                    proximoIndice = i2;     
                    passou = true;
                    
                    model.addRow(new Object[]{matrizVendas[i2][0], matrizVendas[i2][1], matrizVendas[i2][10]});
                    model.addRow(new Object[]{matrizVendas[i2 - 1][0], matrizVendas[i2 - 1][1], matrizVendas[i2 - 1][10]});                 
                }             
            }
        } 
        
        if (!passou)
           return -1;
        else
        {
            jTable1.setModel(model);
            formatarColunasDaTabela();  
            return total;
        }      
    }    
}
