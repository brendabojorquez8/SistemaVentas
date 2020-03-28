package vistas;

import control.ControlCategoria;
import control.ControlProducto;
import control.ControlProveedor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objetosNegocio.Categoria;
import objetosNegocio.Producto;
import objetosNegocio.Proveedor;

/**
 *
 * @author ProyectoBD_02_204722_204360
 */
public class FrmProducto extends javax.swing.JFrame {

    private ControlProducto controlProducto;
    private ControlCategoria controlCategoria;
    private ControlProveedor controlProveedor;

    public FrmProducto() {
        initComponents();
        this.controlProducto = new ControlProducto();
        this.controlCategoria = new ControlCategoria();
        this.controlProveedor = new ControlProveedor();
        cargarProductos();
        this.cargarCmbCategoria();
        this.cargarCmbProveedor();
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


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        panelDatosProducto = new javax.swing.JPanel();
        lbID1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lbRFC1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lbNombre1 = new javax.swing.JLabel();
        lbDireccion1 = new javax.swing.JLabel();
        lbTelefono1 = new javax.swing.JLabel();
        lbTelefono2 = new javax.swing.JLabel();
        txtPrecioActual = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cmbProveedor = new javax.swing.JComboBox<>();
        cmbCategoria = new javax.swing.JComboBox<>();
        panProductos = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        txtBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lbProductos = new javax.swing.JLabel();
        mbClientes = new javax.swing.JMenuBar();
        jmMenu1 = new javax.swing.JMenu();
        jmPrincipal = new javax.swing.JMenuItem();
        jmProveedores = new javax.swing.JMenuItem();
        jmCategorias = new javax.swing.JMenuItem();
        jmClientes = new javax.swing.JMenuItem();
        jmBusquedaVentas = new javax.swing.JMenuItem();
        jmRegistroVentas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Productos");
        setIconImage(getIconImage());
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(187, 209, 234));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDatosProducto.setBackground(new java.awt.Color(255, 255, 255));
        panelDatosProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Producto"));

        lbID1.setText("ID");

        txtId.setEditable(false);
        txtId.setText("0");

        lbRFC1.setText("Nombre");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        lbNombre1.setText("Precio actual");

        lbDireccion1.setText("Stock");

        lbTelefono1.setText("Proveedor");

        lbTelefono2.setText("Categoría");

        txtPrecioActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioActualKeyTyped(evt);
            }
        });

        txtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockKeyTyped(evt);
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

        cmbCategoria.setToolTipText("");

        javax.swing.GroupLayout panelDatosProductoLayout = new javax.swing.GroupLayout(panelDatosProducto);
        panelDatosProducto.setLayout(panelDatosProductoLayout);
        panelDatosProductoLayout.setHorizontalGroup(
            panelDatosProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbID1)
                    .addComponent(lbRFC1)
                    .addComponent(lbNombre1)
                    .addComponent(lbDireccion1)
                    .addComponent(lbTelefono1)
                    .addComponent(lbTelefono2))
                .addGap(29, 29, 29)
                .addGroup(panelDatosProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(txtPrecioActual)
                    .addComponent(txtStock)
                    .addComponent(cmbProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelDatosProductoLayout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panelDatosProductoLayout.setVerticalGroup(
            panelDatosProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosProductoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panelDatosProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDatosProductoLayout.createSequentialGroup()
                        .addGroup(panelDatosProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbID1)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelDatosProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbRFC1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lbNombre1))
                    .addComponent(txtPrecioActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDireccion1)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefono1)
                    .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefono2)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jPanel4.add(panelDatosProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        panProductos.setBackground(new java.awt.Color(255, 255, 255));
        panProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla Productos"));

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Producto", "Nombre", "Precio Actual", "Stock", "Proveedor", "Categoría"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        panProductos.setViewportView(tblProductos);

        jPanel4.add(panProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 488, 395));
        jPanel4.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 323, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnBuscar.png"))); // NOI18N
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel4.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 80, 40));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnActualizar.png"))); // NOI18N
        btnActualizar.setBorderPainted(false);
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel4.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 500, -1, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnEliminar.png"))); // NOI18N
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, 90, -1));

        lbProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Productos.jpg"))); // NOI18N
        jPanel4.add(lbProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        mbClientes.add(jmMenu1);

        setJMenuBar(mbClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmSalirActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char a = evt.getKeyChar();
        if (txtNombre.getText().length() >= 100 || (!Character.isLetter(a)&& a != ' ') ) {//que sean solo letras
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtPrecioActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioActualKeyTyped
        char a = evt.getKeyChar();
        if (txtPrecioActual.getText().length() >= 15 || (!Character.isDigit(a) && a != '.')) {//que sean solo números
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioActualKeyTyped

    private void txtStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyTyped
        char a = evt.getKeyChar();
        if (txtPrecioActual.getText().length() >= 15 || !Character.isDigit(a)) {//que sean solo números
            evt.consume();
        }
    }//GEN-LAST:event_txtStockKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (this.txtId.getText().equals("0")) {
            if (validacion()) {
                this.guardarProducto();
                this.limpiarFormulario();
            } else {
                JOptionPane.showMessageDialog(this, "Deben llenarse todos los datos", "Alerta", JOptionPane.WARNING_MESSAGE);
            }

        } else {
            if (validacion()) {
                this.actualizarProducto();
                this.limpiarFormulario();
            } else {
                JOptionPane.showMessageDialog(this, "Deben llenarse todos los datos", "Alerta", JOptionPane.WARNING_MESSAGE);
            }
        }

        this.cargarProductos();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limpiarFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.cargarProductos();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        cargarProducto();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarProducto();
        this.cargarProductos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jmPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPrincipalActionPerformed
        this.setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_jmPrincipalActionPerformed

    private void jmProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProveedoresActionPerformed
        this.setVisible(false);
        FrmProveedor proveedor = new FrmProveedor();
        proveedor.setVisible(true);
    }//GEN-LAST:event_jmProveedoresActionPerformed

    private void jmClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmClientesActionPerformed
        this.setVisible(false);
        FrmCliente cliente = new FrmCliente();
        cliente.setVisible(true);
    }//GEN-LAST:event_jmClientesActionPerformed

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

    private void cargarProductos() {
        List<Producto> productos = this.controlProducto.consultarProductos(txtBusqueda.getText());
        if (productos != null) {
            DefaultTableModel modelo = (DefaultTableModel) tblProductos.getModel();
            //borra los registros
            modelo.setRowCount(0);
            for (Producto producto : productos) {
                modelo.addRow(producto.toArray());
            }
        }
    }

    private void guardarProducto() {
        Producto producto = new Producto();
        producto.setNombre(txtNombre.getText());
        producto.setPrecioActual(Float.parseFloat(txtPrecioActual.getText()));
        producto.setStock(Integer.parseInt(txtStock.getText()));
        producto.setCategoria((Categoria) cmbCategoria.getSelectedItem());
        producto.setProveedor((Proveedor) cmbProveedor.getSelectedItem());
        //producto.setVentas(ventas);
        if (this.controlProducto.guardarProducto(producto)) {
            JOptionPane.showMessageDialog(this, "Prodructo agregado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo agregar el producto", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    private void cargarCmbCategoria() {
        Categoria seleccione = new Categoria();
        seleccione.setNombre("Seleccione");
        cmbCategoria.addItem(seleccione);
        List<Categoria> categorias = this.controlCategoria.consultarCategorias(txtBusqueda.getText());
        if (categorias != null) {
            for (Categoria categoria : categorias) {
                cmbCategoria.addItem(categoria);
            }
        }
    }

    private void cargarCmbProveedor() {
        Proveedor seleccione = new Proveedor();
        seleccione.setNombre("Seleccione");
        cmbProveedor.addItem(seleccione);
        List<Proveedor> proveedores = this.controlProveedor.consultarProveedores(txtBusqueda.getText());
        if (proveedores != null) {
            for (Proveedor proveedor : proveedores) {
                cmbProveedor.addItem(proveedor);
            }
        }
    }

    private void actualizarProducto() {
        Producto producto = new Producto();
        producto.setIdProducto(Integer.parseInt(txtId.getText()));
        producto.setNombre(txtNombre.getText());
        producto.setPrecioActual(Float.parseFloat(txtPrecioActual.getText()));
        producto.setStock(Integer.parseInt(txtStock.getText()));
        producto.setCategoria((Categoria) cmbCategoria.getSelectedItem());
        producto.setProveedor((Proveedor) cmbProveedor.getSelectedItem());

        if (this.controlProducto.actualizarProducto(producto)) {
            JOptionPane.showMessageDialog(this, "Producto actualizado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo actualizar al producto", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    private void cargarProducto() {

        int fila = this.tblProductos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un producto", "información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tblProductos.getModel();
            Integer idProducto = (Integer) modelo.getValueAt(fila, 0);
            Producto producto = this.controlProducto.consultarPorIdProducto(idProducto);
            if (producto != null) {
                txtId.setText(producto.getIdProducto().toString());
                txtNombre.setText(producto.getNombre());
                txtStock.setText(String.valueOf(producto.getStock()));
                txtPrecioActual.setText(String.valueOf(producto.getPrecioActual()));
                cmbCategoria.setSelectedItem(producto.getCategoria());
                cmbProveedor.setSelectedItem(producto.getProveedor());
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró al producto", "Alerta", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    private void eliminarProducto() {
        int fila = this.tblProductos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un productor", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tblProductos.getModel();
            Integer idProveedor = (Integer) modelo.getValueAt(fila, 0);
            boolean eliminacionExitosa = this.controlProducto.eliminarProducto(controlProducto.consultarPorIdProducto(idProveedor));
            if (eliminacionExitosa) {
                JOptionPane.showMessageDialog(this, "Producto eliminado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar al Producto", "Error", JOptionPane.ERROR_MESSAGE);

            }
        }
    }

    private void limpiarFormulario() {
        txtId.setText("0");
        txtNombre.setText("");
        txtPrecioActual.setText("");
        txtStock.setText("");
        cmbCategoria.setSelectedIndex(0);
        cmbProveedor.setSelectedIndex(0);
    }

    private boolean validacion() {
        return !txtPrecioActual.getText().isEmpty() && !txtNombre.getText().isEmpty()
                && !txtStock.getText().isEmpty() && cmbCategoria.getSelectedIndex() != 0
                && cmbProveedor.getSelectedIndex() != 0;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<Object> cmbCategoria;
    private javax.swing.JComboBox<Object> cmbProveedor;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem jmBusquedaVentas;
    private javax.swing.JMenuItem jmCategorias;
    private javax.swing.JMenuItem jmClientes;
    private javax.swing.JMenu jmMenu1;
    private javax.swing.JMenuItem jmPrincipal;
    private javax.swing.JMenuItem jmProveedores;
    private javax.swing.JMenuItem jmRegistroVentas;
    private javax.swing.JMenuItem jmSalir;
    private javax.swing.JLabel lbDireccion1;
    private javax.swing.JLabel lbID1;
    private javax.swing.JLabel lbNombre1;
    private javax.swing.JLabel lbProductos;
    private javax.swing.JLabel lbRFC1;
    private javax.swing.JLabel lbTelefono1;
    private javax.swing.JLabel lbTelefono2;
    private javax.swing.JMenuBar mbClientes;
    private javax.swing.JScrollPane panProductos;
    private javax.swing.JPanel panelDatosProducto;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioActual;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
