/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bar;
import Forms.loginAd;

/**
 *
 * @author ferri
 */
public class MenuAd extends javax.swing.JFrame {

    /**
     * Creates new form Menú
     */
    public MenuAd() {
        initComponents();
    }
    
    public void Facturacion(boolean a) {
        
    }
    
    public void Proveedores(boolean b) {
        
    }
    
    public void Inventario(boolean c){
        
    }
    
    public void Ventas(boolean d) {
        
    }
    
    public void Volver(boolean e) {
        loginAd regresar = new loginAd();
        regresar.setVisible(true);
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        invW = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        suppW = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        factW = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        salesW = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        exitW = new javax.swing.JPanel();
        cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BAR.jpeg"))); // NOI18N

        javax.swing.GroupLayout invWLayout = new javax.swing.GroupLayout(invW);
        invW.setLayout(invWLayout);
        invWLayout.setHorizontalGroup(
            invWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invWLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        invWLayout.setVerticalGroup(
            invWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Inventario", invW);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BAR.jpeg"))); // NOI18N

        javax.swing.GroupLayout suppWLayout = new javax.swing.GroupLayout(suppW);
        suppW.setLayout(suppWLayout);
        suppWLayout.setHorizontalGroup(
            suppWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suppWLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        suppWLayout.setVerticalGroup(
            suppWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Proveedores", suppW);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BAR.jpeg"))); // NOI18N

        javax.swing.GroupLayout factWLayout = new javax.swing.GroupLayout(factW);
        factW.setLayout(factWLayout);
        factWLayout.setHorizontalGroup(
            factWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(factWLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        factWLayout.setVerticalGroup(
            factWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Facturación", factW);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BAR.jpeg"))); // NOI18N

        javax.swing.GroupLayout salesWLayout = new javax.swing.GroupLayout(salesW);
        salesW.setLayout(salesWLayout);
        salesWLayout.setHorizontalGroup(
            salesWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesWLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        salesWLayout.setVerticalGroup(
            salesWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Ventas", salesW);

        exitW.setBackground(new java.awt.Color(49, 50, 91));

        cerrar.setBackground(new java.awt.Color(255, 255, 255));
        cerrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cerrar.setForeground(new java.awt.Color(0, 0, 0));
        cerrar.setText("X");
        cerrar.setBorder(null);
        cerrar.setBorderPainted(false);
        cerrar.setContentAreaFilled(false);
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.setMaximumSize(new java.awt.Dimension(5, 5));
        cerrar.setMinimumSize(new java.awt.Dimension(512, 512));
        cerrar.setPreferredSize(new java.awt.Dimension(512, 512));
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout exitWLayout = new javax.swing.GroupLayout(exitW);
        exitW.setLayout(exitWLayout);
        exitWLayout.setHorizontalGroup(
            exitWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(exitWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exitWLayout.createSequentialGroup()
                    .addGap(236, 236, 236)
                    .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(237, Short.MAX_VALUE)))
        );
        exitWLayout.setVerticalGroup(
            exitWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(exitWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exitWLayout.createSequentialGroup()
                    .addGap(236, 236, 236)
                    .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(237, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Salir", exitW);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        // TODO add your handling code here:
        boolean close = true;
        System.out.println("Vuelva pronto");
        Volver(close);
    }//GEN-LAST:event_cerrarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrar;
    private javax.swing.JPanel exitW;
    private javax.swing.JPanel factW;
    private javax.swing.JPanel invW;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel salesW;
    private javax.swing.JPanel suppW;
    // End of variables declaration//GEN-END:variables
}
