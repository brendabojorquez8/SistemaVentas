package vistas;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;

        setLocationRelativeTo(null);
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("images/icono.png"));

        return retValue;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnCategoria = new javax.swing.JButton();
        BtnVentas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lbSocio = new javax.swing.JLabel();
        lbBarco = new javax.swing.JLabel();
        lbSalida = new javax.swing.JLabel();
        lbIcon = new javax.swing.JLabel();
        btnProducto = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        BtnBusquedaVenta = new javax.swing.JButton();
        lbBienvenido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú");
        setIconImage(getIconImage());
        setPreferredSize(new java.awt.Dimension(300, 390));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(270, 360));
        jPanel2.setPreferredSize(new java.awt.Dimension(270, 360));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCategoria.setBackground(new java.awt.Color(255, 255, 255));
        btnCategoria.setForeground(new java.awt.Color(255, 255, 255));
        btnCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnCategorias.png"))); // NOI18N
        btnCategoria.setToolTipText("");
        btnCategoria.setBorder(null);
        btnCategoria.setBorderPainted(false);
        btnCategoria.setContentAreaFilled(false);
        btnCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaActionPerformed(evt);
            }
        });
        jPanel2.add(btnCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        BtnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnVentas.png"))); // NOI18N
        BtnVentas.setBorderPainted(false);
        BtnVentas.setContentAreaFilled(false);
        BtnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVentasActionPerformed(evt);
            }
        });
        jPanel2.add(BtnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 110, 30));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnSalir.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 110, 30));
        jPanel2.add(lbSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 107, -1, -1));
        jPanel2.add(lbBarco, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 122, -1, -1));
        jPanel2.add(lbSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 191, -1, -1));
        jPanel2.add(lbIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 16, -1, -1));

        btnProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnProductos.png"))); // NOI18N
        btnProducto.setBorderPainted(false);
        btnProducto.setContentAreaFilled(false);
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });
        jPanel2.add(btnProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 110, 30));

        btnProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnProveedor.png"))); // NOI18N
        btnProveedor.setBorderPainted(false);
        btnProveedor.setContentAreaFilled(false);
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });
        jPanel2.add(btnProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 110, 30));

        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnClientes.png"))); // NOI18N
        btnCliente.setBorderPainted(false);
        btnCliente.setContentAreaFilled(false);
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 110, 30));

        BtnBusquedaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnBusqueda.png"))); // NOI18N
        BtnBusquedaVenta.setBorderPainted(false);
        BtnBusquedaVenta.setContentAreaFilled(false);
        BtnBusquedaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBusquedaVentaActionPerformed(evt);
            }
        });
        jPanel2.add(BtnBusquedaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 110, 30));

        lbBienvenido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbBienvenido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bienvenido.png"))); // NOI18N
        jPanel2.add(lbBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBusquedaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBusquedaVentaActionPerformed
        this.setVisible(false);
        FrmBusquedaVentas busqueda = new FrmBusquedaVentas();
        busqueda.setVisible(true);
    }//GEN-LAST:event_BtnBusquedaVentaActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        this.setVisible(false);
        FrmProveedor proveedor = new FrmProveedor();
        proveedor.setVisible(true);
    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        this.setVisible(false);
        FrmProducto producto = new FrmProducto();
        producto.setVisible(true);
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // dispose();
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void BtnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVentasActionPerformed
        this.setVisible(false);
        FrmRegistroVentas registro = new FrmRegistroVentas();
        registro.setVisible(true);
    }//GEN-LAST:event_BtnVentasActionPerformed

    private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaActionPerformed
        this.setVisible(false);
        FrmCategoria categoria = new FrmCategoria();
        categoria.setVisible(true);
    }//GEN-LAST:event_btnCategoriaActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        this.setVisible(false);
        FrmCliente cliente = new FrmCliente();
        cliente.setVisible(true);
    }//GEN-LAST:event_btnClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBusquedaVenta;
    private javax.swing.JButton BtnVentas;
    private javax.swing.JButton btnCategoria;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbBarco;
    private javax.swing.JLabel lbBienvenido;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbSalida;
    private javax.swing.JLabel lbSocio;
    // End of variables declaration//GEN-END:variables
}
