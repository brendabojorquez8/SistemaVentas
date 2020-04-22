package vistas;

import control.ControlProveedor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import entidades.Proveedor;

public class FrmProveedor extends javax.swing.JFrame {

    private ControlProveedor controlProveedor;

    public FrmProveedor() {
        initComponents();
        this.controlProveedor = new ControlProveedor();
        cargarProveedores();
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


    private void cargarProveedores() {
        List<Proveedor> proveedores = this.controlProveedor.consultarProveedores(txtBusqueda.getText());
        if (proveedores != null) {
            DefaultTableModel modelo = (DefaultTableModel) tblProveedores.getModel();
            modelo.setRowCount(0);
            for (Proveedor proveedor : proveedores) {
                modelo.addRow(proveedor.toArray());
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelDatos = new javax.swing.JPanel();
        lbID = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lbRFC = new javax.swing.JLabel();
        txtRfc = new javax.swing.JTextField();
        lbNombre = new javax.swing.JLabel();
        lbDireccion = new javax.swing.JLabel();
        lbTelefono = new javax.swing.JLabel();
        lbPaginaWeb = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtPaginaWeb = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        panProveedores = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();
        txtBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lbProveedores = new javax.swing.JLabel();
        mbProveedores = new javax.swing.JMenuBar();
        jmMenu1 = new javax.swing.JMenu();
        jmPrincipal = new javax.swing.JMenuItem();
        jmProductos = new javax.swing.JMenuItem();
        jmCategorias = new javax.swing.JMenuItem();
        jmClientes = new javax.swing.JMenuItem();
        jmBusquedaVentas = new javax.swing.JMenuItem();
        jmRegistroVentas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmSalir = new javax.swing.JMenuItem();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proveedores");
        setIconImage(getIconImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(187, 209, 234));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Proveedor"));

        lbID.setText("ID");

        txtId.setEditable(false);
        txtId.setText("0");

        lbRFC.setText("RFC");

        txtRfc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRfcKeyTyped(evt);
            }
        });

        lbNombre.setText("Nombre");

        lbDireccion.setText("Dirección");

        lbTelefono.setText("Teléfono");

        lbPaginaWeb.setText("Página Web");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtPaginaWeb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaginaWebKeyTyped(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnGuardar.png"))); // NOI18N
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnCancelar.png"))); // NOI18N
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbID)
                    .addComponent(lbRFC)
                    .addComponent(lbNombre)
                    .addComponent(lbDireccion)
                    .addComponent(lbTelefono)
                    .addComponent(lbPaginaWeb))
                .addGap(29, 29, 29)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRfc)
                    .addComponent(txtNombre)
                    .addComponent(txtDireccion)
                    .addComponent(txtTelefono)
                    .addComponent(txtPaginaWeb, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbID)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbRFC)
                            .addComponent(txtRfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lbNombre))
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPaginaWeb)
                    .addComponent(txtPaginaWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jPanel2.add(panelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 121, 320, 390));

        panProveedores.setBackground(new java.awt.Color(255, 255, 255));
        panProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla Proveedores"));

        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Cliente", "RFC", "Nombre", "Direccion", "Telefono", "Pagina_Web"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        panProveedores.setViewportView(tblProveedores);

        jPanel2.add(panProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 121, 510, 392));
        jPanel2.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 81, 323, 29));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnBuscar.png"))); // NOI18N
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 80, -1));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnActualizar.png"))); // NOI18N
        btnActualizar.setBorderPainted(false);
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, 70, 40));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnEliminar.png"))); // NOI18N
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 511, 90, 40));

        lbProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proveedores.jpg"))); // NOI18N
        jPanel2.add(lbProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

        jmBusquedaVentas.setText("Busqueda ventas");
        jmBusquedaVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmBusquedaVentasActionPerformed(evt);
            }
        });
        jmMenu1.add(jmBusquedaVentas);

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

        mbProveedores.add(jmMenu1);

        setJMenuBar(mbProveedores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmSalirActionPerformed

    private void txtRfcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRfcKeyTyped
        if (txtRfc.getText().length() >= 15) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRfcKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char a = evt.getKeyChar();
        if (txtNombre.getText().length() >= 100 || (!Character.isLetter(a)&& a != ' ') ) {//que sean solo letras
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        if (txtDireccion.getText().length() >= 100) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char a = evt.getKeyChar();
        if (txtTelefono.getText().length() >= 15 || (!Character.isDigit(a))) {//que sean solo números
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtPaginaWebKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaginaWebKeyTyped
        if (txtPaginaWeb.getText().length() >= 500) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPaginaWebKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (this.txtId.getText().equals("0")) {
            if (validacion()) {
                this.guardarProveedor();
                this.limpiarFormulario();
            } else {
                JOptionPane.showMessageDialog(this, "Deben llenarse todos los datos", "Alerta", JOptionPane.WARNING_MESSAGE);
            }

        } else {
            if(validacion()){
                this.actualizarProveedor();
                this.limpiarFormulario();
            }else {
                JOptionPane.showMessageDialog(this, "Deben llenarse todos los datos", "Alerta", JOptionPane.WARNING_MESSAGE);
            }
        }

        this.cargarProveedores();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limpiarFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        cargarProveedor();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarProveedor();
        this.cargarProveedores();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        cargarProveedores();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jmPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPrincipalActionPerformed
        this.setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_jmPrincipalActionPerformed

    private void jmClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmClientesActionPerformed
        this.setVisible(false);
        FrmCliente cliente = new FrmCliente();
        cliente.setVisible(true);
    }//GEN-LAST:event_jmClientesActionPerformed

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

    private void jmBusquedaVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmBusquedaVentasActionPerformed
        this.setVisible(false);
        FrmBusquedaVentas busqueda = new FrmBusquedaVentas();
        busqueda.setVisible(true);
    }//GEN-LAST:event_jmBusquedaVentasActionPerformed

    private void jmRegistroVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRegistroVentasActionPerformed
        this.setVisible(false);
        FrmRegistroVentas registro = new FrmRegistroVentas();
        registro.setVisible(true);
    }//GEN-LAST:event_jmRegistroVentasActionPerformed

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
            java.util.logging.Logger.getLogger(FrmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProveedor().setVisible(true);
            }
        });
    }

    private void guardarProveedor() {
        Proveedor proveedor = new Proveedor();
        proveedor.setRfc(txtRfc.getText());
        proveedor.setNombre(txtNombre.getText());
        proveedor.setDireccion(txtDireccion.getText());
        proveedor.setTelefono(txtTelefono.getText());
        proveedor.setPaginaWeb(txtPaginaWeb.getText());
        if (this.controlProveedor.guardarProveedor(proveedor)) {
            JOptionPane.showMessageDialog(this, "Proveedor agregado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo agregar al Proveedor", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    private void actualizarProveedor() {
        Proveedor proveedor = new Proveedor();
        proveedor.setId(Integer.parseInt(txtId.getText()));
        proveedor.setRfc(txtRfc.getText());
        proveedor.setNombre(txtNombre.getText());
        proveedor.setDireccion(txtDireccion.getText());
        proveedor.setTelefono(txtTelefono.getText());
        proveedor.setPaginaWeb(txtPaginaWeb.getText());
        if (this.controlProveedor.actualizarProveedor(proveedor)) {
            JOptionPane.showMessageDialog(this, "Proveedor actualizado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo actualizar al Proveedor", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    private void cargarProveedor() {

        int fila = this.tblProveedores.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un proveedor", "información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tblProveedores.getModel();
            Integer idProveedor = (Integer) modelo.getValueAt(fila, 0);
            Proveedor proveedor = this.controlProveedor.consultarPorIdProveedor(idProveedor);
            if (proveedor != null) {
                txtId.setText(proveedor.getId().toString());
                txtRfc.setText(proveedor.getRfc());
                txtNombre.setText(proveedor.getNombre());
                txtDireccion.setText(proveedor.getDireccion());
                txtTelefono.setText(proveedor.getTelefono());
                txtPaginaWeb.setText(proveedor.getPaginaWeb());
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el proveedor", "Alerta", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    private void eliminarProveedor() {
        int fila = this.tblProveedores.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un proveedor", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tblProveedores.getModel();
            Integer idProveedor = (Integer) modelo.getValueAt(fila, 0);
            boolean eliminacionExitosa = this.controlProveedor.eliminarProveedor(controlProveedor.consultarPorIdProveedor(idProveedor));
            if (eliminacionExitosa) {
                JOptionPane.showMessageDialog(this, "Proveedor eliminado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar al Proveedor", "Error", JOptionPane.ERROR_MESSAGE);

            }
        }
    }

    private void limpiarFormulario() {
        txtId.setText("0");
        txtRfc.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtPaginaWeb.setText("");
    }

    private boolean validacion() {
        return !txtRfc.getText().isEmpty() && !txtNombre.getText().isEmpty() && !txtDireccion.getText().isEmpty();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem jmBusquedaVentas;
    private javax.swing.JMenuItem jmCategorias;
    private javax.swing.JMenuItem jmClientes;
    private javax.swing.JMenu jmMenu1;
    private javax.swing.JMenuItem jmPrincipal;
    private javax.swing.JMenuItem jmProductos;
    private javax.swing.JMenuItem jmRegistroVentas;
    private javax.swing.JMenuItem jmSalir;
    private javax.swing.JLabel lbDireccion;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPaginaWeb;
    private javax.swing.JLabel lbProveedores;
    private javax.swing.JLabel lbRFC;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JMenuBar mbProveedores;
    private javax.swing.JScrollPane panProveedores;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JTable tblProveedores;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPaginaWeb;
    private javax.swing.JTextField txtRfc;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
