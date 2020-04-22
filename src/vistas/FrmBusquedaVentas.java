package vistas;

import control.ControlCliente;
import control.ControlProducto;
import control.ControlVenta;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import entidades.Cliente;
import entidades.RelacionProductoVenta;
import entidades.Venta;

public class FrmBusquedaVentas extends javax.swing.JFrame {

    SimpleDateFormat sf = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
    ControlProducto controlProducto;
    ControlVenta controlVenta;
    ControlCliente controlCliente;
    GregorianCalendar calendario = new GregorianCalendar();

    /**
     * Creates new form FrmBusquedaVentas
     */
    public FrmBusquedaVentas() {
        initComponents();
        controlProducto = new ControlProducto();
        controlVenta = new ControlVenta();
        controlCliente = new ControlCliente();
        cargarVentas();
        txtFechaDesde.setText(sf.format(calendario.getTime()));
        txtFechaHasta.setText(sf.format(calendario.getTime()));
        cargarCmbEmpleados();
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

    public void limpiarFormulario() {
        this.txtFechaDesde.setText("");
        this.txtFechaHasta.setText("");
        this.txtDescuento.setText("");
        this.txtTotal.setText("");
        this.txtSubtotal.setText("");
    }

    private void cargarVentas() {
        List<Venta> ventas = this.controlVenta.consultarVentas(txtFechaDesde.getText());
        DefaultTableModel modelo = (DefaultTableModel) tblVentas.getModel();
        if (ventas != null) {
            modelo.setRowCount(0);
        }
        if (cmbClientes.getSelectedIndex() != 0) {
            for (Venta venta : ventas) {
                if (venta.getCliente().toString().equals(cmbClientes.getSelectedItem()) || contiene(venta.getFecha())) {
                    modelo.addRow(venta.toArray());
                }
            }
        } else {
            for (Venta venta : ventas) {
                modelo.addRow(venta.toArray());
            }
        }

    }

    public void cargarProductosVentaSeleccionada() {
        DefaultTableModel modeloProductos = (DefaultTableModel) this.tblProductos.getModel();
        limpiarVenta(modeloProductos);
        int opc = JOptionPane.showConfirmDialog(this, "¿Seguro de  cargar esta venta?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (opc == 0) {
            int fila = this.tblVentas.getSelectedRow();
            DefaultTableModel modelo = (DefaultTableModel) this.tblVentas.getModel();
            Integer idVenta = (Integer) modelo.getValueAt(fila, 0);
            Venta venta = this.controlVenta.consultarPorIdVenta(idVenta);

            txtId.setText(String.valueOf(venta.getId()));
            txtDescuento.setText(String.valueOf(venta.getDescuento()));
            txtSubtotal.setText(String.valueOf(((venta.getDescuento() / 100) + 1) * venta.getMontofinal()));
            txtTotal.setText(String.valueOf(venta.getMontofinal()));
            for (RelacionProductoVenta producto : venta.getProductos()) {
                modeloProductos.addRow(producto.toArrayProducto());
            }

        }
    }

    public void limpiarVenta(DefaultTableModel modeloProductos) {

        this.txtDescuento.setText("");
        this.txtTotal.setText("");
        this.txtSubtotal.setText("");
        modeloProductos.setRowCount(0);

    }

    private void cargarCmbEmpleados() {
        Cliente seleccione = new Cliente();
        seleccione.setNombre("Todos");
        cmbClientes.addItem(seleccione.toString());
        List<Cliente> clientes = this.controlCliente.consultarClientes("");
        if (clientes != null) {
            for (Cliente cliente : clientes) {
                cmbClientes.addItem(cliente.toString());
            }
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelDatos = new javax.swing.JPanel();
        lbFecha = new javax.swing.JLabel();
        txtFechaDesde = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtFechaHasta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        panVentas = new javax.swing.JScrollPane();
        tblVentas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cmbClientes = new javax.swing.JComboBox<>();
        panelDatosVenta = new javax.swing.JPanel();
        lbSubtotal = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        lbDescuento = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        lbId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        panProductos = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        lbBusquedaVentas = new javax.swing.JLabel();
        mbRegistroVentas = new javax.swing.JMenuBar();
        jmMenu1 = new javax.swing.JMenu();
        jmPrincipal = new javax.swing.JMenuItem();
        jmProductos = new javax.swing.JMenuItem();
        jmProveedores = new javax.swing.JMenuItem();
        jmCategorias = new javax.swing.JMenuItem();
        jmClientes = new javax.swing.JMenuItem();
        jmRegistroVentas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Búsqueda de Ventas");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(187, 209, 234));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscador de Ventas"));

        lbFecha.setText("Fecha(dd-MMM-yyyy)");

        txtFechaDesde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaDesdeKeyTyped(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnBuscar.png"))); // NOI18N
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtFechaHasta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaHastaKeyTyped(evt);
            }
        });

        panVentas.setBackground(new java.awt.Color(255, 255, 255));
        panVentas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Venta", "Cliente", "Fecha", "Subtotal", "Descuento", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVentasMouseClicked(evt);
            }
        });
        panVentas.setViewportView(tblVentas);

        jScrollPane1.setViewportView(panVentas);

        jLabel1.setText("Empleado");

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbFecha)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFechaDesde, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(cmbClientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(txtFechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 108, Short.MAX_VALUE))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFecha)
                    .addComponent(txtFechaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel2.add(panelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 420));

        panelDatosVenta.setBackground(new java.awt.Color(255, 255, 255));
        panelDatosVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles de Ventas"));

        lbSubtotal.setText("Subtotal");

        txtSubtotal.setEditable(false);
        txtSubtotal.setEnabled(false);

        lbDescuento.setText("Descuento");

        lbTotal.setText("Total");

        txtDescuento.setEditable(false);
        txtDescuento.setEnabled(false);

        txtTotal.setEditable(false);
        txtTotal.setToolTipText("");
        txtTotal.setEnabled(false);

        lbId.setText("ID");

        txtId.setEditable(false);
        txtId.setEnabled(false);

        panProductos.setBackground(new java.awt.Color(255, 255, 255));
        panProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Productos"));

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Producto", "Nombre", "Precio_Actual", "Cantidad", "Monto_Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        panProductos.setViewportView(tblProductos);

        javax.swing.GroupLayout panelDatosVentaLayout = new javax.swing.GroupLayout(panelDatosVenta);
        panelDatosVenta.setLayout(panelDatosVentaLayout);
        panelDatosVentaLayout.setHorizontalGroup(
            panelDatosVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosVentaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelDatosVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDatosVentaLayout.createSequentialGroup()
                        .addComponent(lbTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosVentaLayout.createSequentialGroup()
                        .addComponent(lbId)
                        .addGap(60, 60, 60)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(lbSubtotal)
                        .addGap(31, 31, 31)
                        .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(lbDescuento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosVentaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelDatosVentaLayout.setVerticalGroup(
            panelDatosVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosVentaLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panelDatosVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDatosVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbSubtotal)
                        .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbDescuento)
                        .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbId))
                .addGap(18, 18, 18)
                .addGroup(panelDatosVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.add(panelDatosVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, -1, 420));

        lbBusquedaVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Busqueda.jpg"))); // NOI18N
        jPanel2.add(lbBusquedaVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jmMenu1.setText("Menú");

        jmPrincipal.setText("Principal");
        jmPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPrincipalActionPerformed(evt);
            }
        });
        jmMenu1.add(jmPrincipal);

        jmProductos.setText("Productos");
        jmProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProductosActionPerformed(evt);
            }
        });
        jmMenu1.add(jmProductos);

        jmProveedores.setText("Proveedores");
        jmProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProveedoresActionPerformed(evt);
            }
        });
        jmMenu1.add(jmProveedores);

        jmCategorias.setText("Cateorias");
        jmCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCategoriasActionPerformed(evt);
            }
        });
        jmMenu1.add(jmCategorias);

        jmClientes.setText("Clientes");
        jmClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmClientesActionPerformed(evt);
            }
        });
        jmMenu1.add(jmClientes);

        jmRegistroVentas.setText("Registro ventas");
        jmRegistroVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRegistroVentasActionPerformed(evt);
            }
        });
        jmMenu1.add(jmRegistroVentas);
        jmMenu1.add(jSeparator1);

        jmSalir.setText("Salir");
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        jmMenu1.add(jmSalir);

        mbRegistroVentas.add(jmMenu1);

        setJMenuBar(mbRegistroVentas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaHastaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaHastaKeyTyped
        char a = evt.getKeyChar();
        if ((!Character.isDigit(a) && a != '-' && a != ':')) {//que sean solo números
            evt.consume();
        }
    }//GEN-LAST:event_txtFechaHastaKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        cargarVentas();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtFechaDesdeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaDesdeKeyTyped
        char a = evt.getKeyChar();
        if ((!Character.isDigit(a) && a != '-' && a != ':')) {//que sean solo números
            evt.consume();
        }
    }//GEN-LAST:event_txtFechaDesdeKeyTyped

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmSalirActionPerformed

    private void jmPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPrincipalActionPerformed
        this.setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_jmPrincipalActionPerformed

    private void jmProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProductosActionPerformed
        this.setVisible(false);
        FrmProducto producto = new FrmProducto();
        producto.setVisible(true);
    }//GEN-LAST:event_jmProductosActionPerformed

    private void jmCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCategoriasActionPerformed
        this.setVisible(false);
        FrmCategoria categoria = new FrmCategoria();
        categoria.setVisible(true);
    }//GEN-LAST:event_jmCategoriasActionPerformed

    private void jmClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmClientesActionPerformed
        this.setVisible(false);
        FrmCliente cliente = new FrmCliente();
        cliente.setVisible(true);
    }//GEN-LAST:event_jmClientesActionPerformed

    private void jmRegistroVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRegistroVentasActionPerformed
        this.setVisible(false);
        FrmRegistroVentas registro = new FrmRegistroVentas();
        registro.setVisible(true);
    }//GEN-LAST:event_jmRegistroVentasActionPerformed

    private void jmProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProveedoresActionPerformed
        this.setVisible(false);
        FrmProveedor proveedor = new FrmProveedor();
        proveedor.setVisible(true);
    }//GEN-LAST:event_jmProveedoresActionPerformed

    private void tblVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVentasMouseClicked
        cargarProductosVentaSeleccionada();
    }//GEN-LAST:event_tblVentasMouseClicked

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
            java.util.logging.Logger.getLogger(FrmBusquedaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBusquedaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBusquedaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBusquedaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBusquedaVentas().setVisible(true);
            }
        });
    }

    public boolean contiene(GregorianCalendar fecha) {
        try {

            if ((fecha.after(sf.parse(txtFechaDesde.getText())) || fecha.equals(sf.parse(txtFechaDesde.getText()))) && (fecha.before(sf.parse(txtFechaHasta.getText())) || fecha.equals(sf.parse(txtFechaHasta.getText())))) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cmbClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem jmCategorias;
    private javax.swing.JMenuItem jmClientes;
    private javax.swing.JMenu jmMenu1;
    private javax.swing.JMenuItem jmPrincipal;
    private javax.swing.JMenuItem jmProductos;
    private javax.swing.JMenuItem jmProveedores;
    private javax.swing.JMenuItem jmRegistroVentas;
    private javax.swing.JMenuItem jmSalir;
    private javax.swing.JLabel lbBusquedaVentas;
    private javax.swing.JLabel lbDescuento;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbSubtotal;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JMenuBar mbRegistroVentas;
    private javax.swing.JScrollPane panProductos;
    private javax.swing.JScrollPane panVentas;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelDatosVenta;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTable tblVentas;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtFechaDesde;
    private javax.swing.JTextField txtFechaHasta;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
