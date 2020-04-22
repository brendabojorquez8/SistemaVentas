package vistas;

import control.ControlCategoria;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import entidades.Categoria;

public class FrmCategoria extends javax.swing.JFrame {

    private ControlCategoria controlCategoria;

    public FrmCategoria() {
        initComponents();
        this.controlCategoria = new ControlCategoria();
        cargarCategorias();
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
        lbID = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lbNombre = new javax.swing.JLabel();
        lbDescripcion = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        panCategorias = new javax.swing.JScrollPane();
        tblCategorias = new javax.swing.JTable();
        txtBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lbCategorias = new javax.swing.JLabel();
        mbCategorias = new javax.swing.JMenuBar();
        jmMenu1 = new javax.swing.JMenu();
        jmPrincipal = new javax.swing.JMenuItem();
        jmProductos = new javax.swing.JMenuItem();
        jmProveedores = new javax.swing.JMenuItem();
        jmClientes = new javax.swing.JMenuItem();
        jmBusquedaVentas = new javax.swing.JMenuItem();
        jmRegistroVentas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Categorias");
        setIconImage(getIconImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(187, 209, 234));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la Categoría"));
        panelDatos.setToolTipText("");

        lbID.setText("ID");

        txtId.setEditable(false);
        txtId.setText("0");

        lbNombre.setText("Nombre");

        lbDescripcion.setText("Descripción");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
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
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbID)
                            .addComponent(lbNombre)
                            .addComponent(lbDescripcion))
                        .addGap(32, 32, 32)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(63, 63, 63))))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbID)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDescripcion))
                .addGap(34, 34, 34)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap(174, Short.MAX_VALUE))
        );

        jPanel2.add(panelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 115, -1, 395));

        panCategorias.setBackground(new java.awt.Color(255, 255, 255));
        panCategorias.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla Categorías"));

        tblCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Categoria", "Nombre", "Descripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        panCategorias.setViewportView(tblCategorias);

        jPanel2.add(panCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 115, 488, 395));
        jPanel2.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 323, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnBuscar.png"))); // NOI18N
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 70, 20));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnActualizar.png"))); // NOI18N
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, 80, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnEliminar.png"))); // NOI18N
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 520, -1, -1));

        lbCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Categoría.jpg"))); // NOI18N
        jPanel2.add(lbCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        mbCategorias.add(jmMenu1);

        setJMenuBar(mbCategorias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char a = evt.getKeyChar();
        if (txtNombre.getText().length() >= 100 || (!Character.isLetter(a)&& a != ' ') ) {//que sean solo letras
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        if (txtDescripcion.getText().length() >= 100) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
                if (this.txtId.getText().equals("0")) {
                    if (validacion()) {
                        this.guardarCategoria();
                        this.limpiarFormulario();
                    } else {
                        JOptionPane.showMessageDialog(this, "Deben llenarse todos los datos", "Alerta", JOptionPane.WARNING_MESSAGE);
                    }
        
                } else {
                    if(validacion()){
                        this.actualizarCategoria();
                        this.limpiarFormulario();
                    }else {
                        JOptionPane.showMessageDialog(this, "Deben llenarse todos los datos", "Alerta", JOptionPane.WARNING_MESSAGE);
                    }
                }
        
                this.cargarCategorias();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
                this.limpiarFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
                cargarCategoria();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
                eliminarCategoria();
                this.cargarCategorias();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       cargarCategorias();
    }//GEN-LAST:event_btnBuscarActionPerformed

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

    private void jmClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmClientesActionPerformed
        this.setVisible(false);
        FrmCliente cliente = new FrmCliente();
        cliente.setVisible(true);
    }//GEN-LAST:event_jmClientesActionPerformed

    private void jmPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPrincipalActionPerformed
        this.setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_jmPrincipalActionPerformed

    private void jmRegistroVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRegistroVentasActionPerformed
        this.setVisible(false);
        FrmRegistroVentas registro = new FrmRegistroVentas();
        registro.setVisible(true);
    }//GEN-LAST:event_jmRegistroVentasActionPerformed

    private void jmBusquedaVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmBusquedaVentasActionPerformed
        this.setVisible(false);
        FrmBusquedaVentas busqueda = new FrmBusquedaVentas();
        busqueda.setVisible(true);
    }//GEN-LAST:event_jmBusquedaVentasActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCategoria().setVisible(true);
            }
        });
    }

    private void cargarCategorias() {
        List<Categoria> categorias = this.controlCategoria.consultarCategorias(txtBusqueda.getText());
        if (categorias != null) {
            DefaultTableModel modelo = (DefaultTableModel) tblCategorias.getModel();
            //borra los registros
            modelo.setRowCount(0);
            for (Categoria categoria : categorias) {
                modelo.addRow(categoria.toArray());
            }
        }
    }

    private void guardarCategoria() {
        Categoria categoria = new Categoria();
        categoria.setNombre(txtNombre.getText());
        categoria.setDescripcion(txtDescripcion.getText());
        //producto.setVentas(ventas);
        if (this.controlCategoria.guardarCategoria(categoria)) {
            JOptionPane.showMessageDialog(this, "Categoria agregada correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo agregar la categoria", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    private void actualizarCategoria() {
        Categoria categoria = new Categoria();
        categoria.setId(Integer.parseInt(txtId.getText()));
        categoria.setNombre(txtNombre.getText());
        categoria.setDescripcion(txtDescripcion.getText());
        if (this.controlCategoria.actualizarCategoria(categoria)) {
            JOptionPane.showMessageDialog(this, "Categoria actualizada correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo actualizar la categoria", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }
    
    private void cargarCategoria() {

        int fila = this.tblCategorias.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar una categoria", "información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tblCategorias.getModel();
            Integer idCategoria = (Integer) modelo.getValueAt(fila, 0);
            Categoria categoria = this.controlCategoria.consultarPorIdCategoria(idCategoria);
            if (categoria != null) {
                txtId.setText(categoria.getId().toString());
                txtNombre.setText(categoria.getNombre());
                txtDescripcion.setText(categoria.getDescripcion());
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró la categoria", "Alerta", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
     private void eliminarCategoria() {
        int fila = this.tblCategorias.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar una categoria", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tblCategorias.getModel();
            Integer idCategoria = (Integer) modelo.getValueAt(fila, 0);
            boolean eliminacionExitosa = this.controlCategoria.eliminarCategoria(controlCategoria.consultarPorIdCategoria(idCategoria));
            if (eliminacionExitosa) {
                JOptionPane.showMessageDialog(this, "Categoria eliminada correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar la Categoria", "Error", JOptionPane.ERROR_MESSAGE);

            }
        }
    }
     
      private void limpiarFormulario() {
        txtId.setText("0");
        txtNombre.setText("");
        txtDescripcion.setText("");
    }
      
      private boolean validacion() {
        return  !txtNombre.getText().isEmpty()&& !txtDescripcion.getText().isEmpty();
    }

     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem jmBusquedaVentas;
    private javax.swing.JMenuItem jmClientes;
    private javax.swing.JMenu jmMenu1;
    private javax.swing.JMenuItem jmPrincipal;
    private javax.swing.JMenuItem jmProductos;
    private javax.swing.JMenuItem jmProveedores;
    private javax.swing.JMenuItem jmRegistroVentas;
    private javax.swing.JMenuItem jmSalir;
    private javax.swing.JLabel lbCategorias;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JMenuBar mbCategorias;
    private javax.swing.JScrollPane panCategorias;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JTable tblCategorias;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
