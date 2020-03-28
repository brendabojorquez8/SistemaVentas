package vistas;

import control.ControlProducto;
import control.ControlCliente;
import control.ControlVenta;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objetosNegocio.Producto;
import objetosNegocio.RelacionProductoVenta;
import objetosNegocio.Venta;

/**
 *
 * @author ProyectoBD_02_204722_204360
 */
public class FrmRegistroVentas extends javax.swing.JFrame {

    ControlProducto controlProducto;
    ControlCliente controlCliente;
    ControlVenta controlVenta;

    /**
     * Creates new form FrmRegistroVentas
     */
    public FrmRegistroVentas() {
        initComponents();
        this.controlProducto = new ControlProducto();
        this.controlCliente = new ControlCliente();
        this.controlVenta = new ControlVenta();
        btnRegistrar.setEnabled(false);
        cargarProductos();
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelDatos = new javax.swing.JPanel();
        lbSubtotal = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        lbDescuento = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        panelBuscadorProductos = new javax.swing.JPanel();
        txtBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        panProductos = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        panProductosSeleccionados = new javax.swing.JScrollPane();
        tblProductosSeleccionados = new javax.swing.JTable();
        lbRegistroVentas = new javax.swing.JLabel();
        mbRegistroVentas = new javax.swing.JMenuBar();
        jmMenu1 = new javax.swing.JMenu();
        jmPrincipal = new javax.swing.JMenuItem();
        jmProductos = new javax.swing.JMenuItem();
        jmProveedores = new javax.swing.JMenuItem();
        jmCategorias = new javax.swing.JMenuItem();
        jmClientes = new javax.swing.JMenuItem();
        jmBusquedaVentas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Ventas");
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(187, 209, 234));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles de Ventas"));

        lbSubtotal.setText("Subtotal");

        txtSubtotal.setEditable(false);
        txtSubtotal.setText("0");

        lbDescuento.setText("Descuento");

        lbTotal.setText("Total");

        txtDescuento.setText("0");
        txtDescuento.setToolTipText("");
        txtDescuento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescuentoFocusLost(evt);
            }
        });
        txtDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescuentoKeyTyped(evt);
            }
        });

        txtTotal.setEditable(false);
        txtTotal.setText("0");
        txtTotal.setToolTipText("");

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnRegistrar.png"))); // NOI18N
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
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
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSubtotal)
                            .addComponent(lbDescuento)
                            .addComponent(lbTotal))
                        .addGap(35, 35, 35)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(txtDescuento)
                            .addComponent(txtTotal)))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSubtotal)
                            .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lbDescuento))
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTotal)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelar)
                    .addComponent(btnRegistrar))
                .addContainerGap(247, Short.MAX_VALUE))
        );

        jPanel2.add(panelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        panelBuscadorProductos.setBackground(new java.awt.Color(255, 255, 255));
        panelBuscadorProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscador de Productos"));
        panelBuscadorProductos.setForeground(new java.awt.Color(255, 255, 255));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnBuscar.png"))); // NOI18N
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        panProductos.setBackground(new java.awt.Color(255, 255, 255));
        panProductos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Producto", "Nombre", "Precio_Actual", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        panProductos.setViewportView(tblProductos);
        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(0).setResizable(false);
            tblProductos.getColumnModel().getColumn(1).setResizable(false);
            tblProductos.getColumnModel().getColumn(2).setResizable(false);
            tblProductos.getColumnModel().getColumn(3).setResizable(false);
        }

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnAgregar.png"))); // NOI18N
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBuscadorProductosLayout = new javax.swing.GroupLayout(panelBuscadorProductos);
        panelBuscadorProductos.setLayout(panelBuscadorProductosLayout);
        panelBuscadorProductosLayout.setHorizontalGroup(
            panelBuscadorProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscadorProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBuscadorProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                    .addGroup(panelBuscadorProductosLayout.createSequentialGroup()
                        .addComponent(txtBusqueda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBuscadorProductosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addContainerGap())
        );
        panelBuscadorProductosLayout.setVerticalGroup(
            panelBuscadorProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscadorProductosLayout.createSequentialGroup()
                .addGroup(panelBuscadorProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(panProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(panelBuscadorProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, 230));

        panProductosSeleccionados.setBackground(new java.awt.Color(255, 255, 255));
        panProductosSeleccionados.setBorder(javax.swing.BorderFactory.createTitledBorder("Productos Seleccionados"));

        tblProductosSeleccionados.setModel(new javax.swing.table.DefaultTableModel(
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
        tblProductosSeleccionados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosSeleccionadosMouseClicked(evt);
            }
        });
        panProductosSeleccionados.setViewportView(tblProductosSeleccionados);
        if (tblProductosSeleccionados.getColumnModel().getColumnCount() > 0) {
            tblProductosSeleccionados.getColumnModel().getColumn(0).setResizable(false);
            tblProductosSeleccionados.getColumnModel().getColumn(1).setResizable(false);
            tblProductosSeleccionados.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel2.add(panProductosSeleccionados, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 539, 239));

        lbRegistroVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Registro.jpg"))); // NOI18N
        jPanel2.add(lbRegistroVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        jmBusquedaVentas.setText("Busqueda ventas");
        jmBusquedaVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmBusquedaVentasActionPerformed(evt);
            }
        });
        jmMenu1.add(jmBusquedaVentas);
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

            registrarVenta();

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limpiarFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        seleccionarProducto();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        cargarProductos();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtDescuentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescuentoKeyTyped
//que solo reciba números
        char a = evt.getKeyChar();
        if ((!Character.isDigit(a) && txtDescuento.getText().length()>=2)) {
            evt.consume();
        }


    }//GEN-LAST:event_txtDescuentoKeyTyped

    private void jmBusquedaVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmBusquedaVentasActionPerformed
        this.setVisible(false);
        FrmBusquedaVentas busqueda = new FrmBusquedaVentas();
        busqueda.setVisible(true);
    }//GEN-LAST:event_jmBusquedaVentasActionPerformed

    private void jmProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProveedoresActionPerformed
        this.setVisible(false);
        FrmProveedor proveedor = new FrmProveedor();
        proveedor.setVisible(true);
    }//GEN-LAST:event_jmProveedoresActionPerformed

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

    private void jmPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPrincipalActionPerformed
        this.setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_jmPrincipalActionPerformed

    private void txtDescuentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescuentoFocusLost
        realizarCalculo();
    }//GEN-LAST:event_txtDescuentoFocusLost

    private void jmClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmClientesActionPerformed
        this.setVisible(false);
        FrmCliente cliente = new FrmCliente();
        cliente.setVisible(true);
    }//GEN-LAST:event_jmClientesActionPerformed

    private void tblProductosSeleccionadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosSeleccionadosMouseClicked
        eliminarProducto();
        realizarCalculo();
    }//GEN-LAST:event_tblProductosSeleccionadosMouseClicked

    private void cargarProductos() {
        List<Producto> productos = this.controlProducto.consultarProductos(txtBusqueda.getText());
        if (productos != null) {
            DefaultTableModel modelo = (DefaultTableModel) tblProductos.getModel();
            //borra los registros
            modelo.setRowCount(0);
            for (Producto producto : productos) {
                modelo.addRow(producto.toArray2());
            }
        }
    }

    private Integer contains(Integer id) {
        DefaultTableModel modelo = (DefaultTableModel) this.tblProductosSeleccionados.getModel();
        for (int i = 0; i < this.tblProductosSeleccionados.getRowCount(); i++) {
            int idProductoSeleccionado = (Integer) modelo.getValueAt(i, 0);
            if (idProductoSeleccionado == id) {
                return i;
            }
        }
        return -1;
    }

    private void seleccionarProducto() {
        DefaultTableModel modeloSeleccionados = (DefaultTableModel) tblProductosSeleccionados.getModel();
        int fila = this.tblProductos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un producto", "información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tblProductos.getModel();
            Integer idProducto = (Integer) modelo.getValueAt(fila, 0);
            Producto producto = this.controlProducto.consultarPorIdProducto(idProducto);
            if (producto != null) {
                int productoExistente = contains(idProducto);
                String cant = JOptionPane.showInputDialog(this, "Ingrese la cantidad");
                if (cant != null && !cant.isEmpty()) {
                    Integer cantidad = Integer.parseInt(cant);
                    if (cantidad <= producto.getStock() && producto.getStock() != 0) {
                        if (productoExistente == -1) {
                            modeloSeleccionados.addRow(toArrayProducto(producto, cantidad));
                            actualizarStock(producto, cantidad);
                            btnRegistrar.setEnabled(true);
                        } else {
                            actualizarStock(producto, cantidad);
                            cantidad += (Integer) modeloSeleccionados.getValueAt(productoExistente, 3);
                            modeloSeleccionados.setValueAt(cantidad, productoExistente, 3);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "No se cuenta con la cantidad requerida");
                    }
                    realizarCalculo();
                }

            }

        }
        cargarProductos();
    }

    private void realizarCalculo() {
        float subtotal = 0F;
        DefaultTableModel modelo = (DefaultTableModel) this.tblProductosSeleccionados.getModel();
        for (int i = 0; i < this.tblProductosSeleccionados.getRowCount(); i++) {
            float precio = (Float) modelo.getValueAt(i, 2);
            int cantidad = (Integer) modelo.getValueAt(i, 3);
            subtotal += (precio * cantidad);
        }
        Float descuento = 1 - (((txtDescuento.getText().isEmpty()) ? 0f : Float.parseFloat(txtDescuento.getText())) / 100);
        Float total = 0f;

        txtSubtotal.setText(String.valueOf(subtotal));
        txtTotal.setText(String.valueOf(subtotal * descuento));

    }

    private Object[] toArrayProducto(Producto producto, int cantidad) {

        return new Object[]{
            producto.getIdProducto(),
            producto.getNombre(),
            producto.getPrecioActual(),
            cantidad,
            producto.getPrecioActual() * cantidad
        };
    }

    private void limpiarFormulario() {
        txtSubtotal.setText("0");
        txtTotal.setText("0");
        txtDescuento.setText("");
        DefaultTableModel modelo = (DefaultTableModel) this.tblProductosSeleccionados.getModel();
        modelo.setRowCount(0);
        btnRegistrar.setEnabled(false);

    }

    private void actualizarStock(Producto producto, int cantidad) {
        producto.setStock(producto.getStock() - cantidad);
        this.controlProducto.actualizarProducto(producto);
    }

    private void eliminarProducto() {
        int opc = JOptionPane.showConfirmDialog(this, "¿Seguro de eliminar el producto seleccionado?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (opc == 0) {
            int fila = this.tblProductosSeleccionados.getSelectedRow();
            DefaultTableModel modelo = (DefaultTableModel) this.tblProductosSeleccionados.getModel();
            Integer regresarStock = (Integer) modelo.getValueAt(fila, 3);
            Producto producto = this.controlProducto.consultarPorIdProducto((Integer) modelo.getValueAt(fila, 0));
            producto.setStock(producto.getStock() + regresarStock);
            this.controlProducto.actualizarProducto(producto);
            modelo.removeRow(fila);
            if (modelo.getRowCount() == 0) {
                btnRegistrar.setEnabled(false);
            }
            limpiarFormulario();
        }
        cargarProductos();
    }

    private void obtenerLista(Venta venta) {
        DefaultTableModel modelo = (DefaultTableModel) this.tblProductosSeleccionados.getModel();

        for (int i = 0; i < modelo.getRowCount(); i++) {
            Integer id = (Integer) modelo.getValueAt(i, 0);
            Integer cantidad = (Integer) modelo.getValueAt(i, 3);
            Producto producto = this.controlProducto.consultarPorIdProducto(id);
            venta.addProducto(new RelacionProductoVenta(venta, producto, producto.getPrecioActual(), cantidad, venta.getMontofinal()));
        }

    }

    private void registrarVenta() {
        Venta venta = new Venta();
        venta.setDescuento((txtDescuento.getText().isEmpty()) ? 0F : Float.parseFloat(txtDescuento.getText()));
        venta.setMontofinal((txtTotal.getText().isEmpty()) ? 0F : Float.parseFloat(txtTotal.getText()));
        venta.setFecha(new GregorianCalendar());
         obtenerLista(venta);
        controlVenta.guardarVenta(venta);

        limpiarFormulario();
        
        


    }

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
            java.util.logging.Logger.getLogger(FrmRegistroVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistroVentas().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem jmBusquedaVentas;
    private javax.swing.JMenuItem jmCategorias;
    private javax.swing.JMenuItem jmClientes;
    private javax.swing.JMenu jmMenu1;
    private javax.swing.JMenuItem jmPrincipal;
    private javax.swing.JMenuItem jmProductos;
    private javax.swing.JMenuItem jmProveedores;
    private javax.swing.JMenuItem jmSalir;
    private javax.swing.JLabel lbDescuento;
    private javax.swing.JLabel lbRegistroVentas;
    private javax.swing.JLabel lbSubtotal;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JMenuBar mbRegistroVentas;
    private javax.swing.JScrollPane panProductos;
    private javax.swing.JScrollPane panProductosSeleccionados;
    private javax.swing.JPanel panelBuscadorProductos;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTable tblProductosSeleccionados;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

}
