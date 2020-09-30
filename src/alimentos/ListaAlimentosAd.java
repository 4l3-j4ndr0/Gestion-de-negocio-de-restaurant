/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alimentos;

import java.awt.Cursor;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import usuarios.*;
import ventas.CajaAd;
import ventas.OpcionesVen;

/**
 *
 * @author 4L3
 */
public class ListaAlimentosAd extends javax.swing.JInternalFrame {

    /**
     * Creates new form Usuarios
     */
    public ListaAlimentosAd() {
        initComponents();
        tablaAlimentos.getTableHeader().setDefaultRenderer(new principal.EstiloTablaHeader());
        tablaAlimentos.setDefaultRenderer(Object.class, new principal.EstiloTablaRenderer());
        this.tipoAl.setCursor(new Cursor(12));
        tablaAlimentos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.setFrameIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/icono.png")));
        OpcionesAl.listar3("");

        tipoAl.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent ie) {
                if (tipoAl.getSelectedIndex() == 0) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/tipoAlL.png")));
                    OpcionesAl.listar3("");
                }
                if (tipoAl.getSelectedIndex() == 1) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/bebida.png")));
                    OpcionesAl.listar3(tipoAl.getSelectedItem().toString());
                }
                if (tipoAl.getSelectedIndex() == 2) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/botana.png")));
                    OpcionesAl.listar3(tipoAl.getSelectedItem().toString());
                }
                if (tipoAl.getSelectedIndex() == 3) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/caldo.png")));
                    OpcionesAl.listar3(tipoAl.getSelectedItem().toString());
                }
                if (tipoAl.getSelectedIndex() == 4) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/camaron.png")));
                    OpcionesAl.listar3(tipoAl.getSelectedItem().toString());
                }
                if (tipoAl.getSelectedIndex() == 5) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/coctel.png")));
                    OpcionesAl.listar3(tipoAl.getSelectedItem().toString());
                }
                if (tipoAl.getSelectedIndex() == 6) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/desayuno.png")));
                    OpcionesAl.listar3(tipoAl.getSelectedItem().toString());
                }
                if (tipoAl.getSelectedIndex() == 7) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/filete.png")));
                    OpcionesAl.listar3(tipoAl.getSelectedItem().toString());
                }
                if (tipoAl.getSelectedIndex() == 8) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/langosta.png")));
                    OpcionesAl.listar3(tipoAl.getSelectedItem().toString());
                }
                if (tipoAl.getSelectedIndex() == 9) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/langostino.png")));
                    OpcionesAl.listar3(tipoAl.getSelectedItem().toString());
                }
                if (tipoAl.getSelectedIndex() == 10) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/pescado.png")));
                    OpcionesAl.listar3(tipoAl.getSelectedItem().toString());
                }
                if (tipoAl.getSelectedIndex() == 11) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/pulpo.png")));
                    OpcionesAl.listar3(tipoAl.getSelectedItem().toString());
                }
                if (tipoAl.getSelectedIndex() == 12) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/caja_cigarro.png")));
                    OpcionesAl.listar3(tipoAl.getSelectedItem().toString());
                }
                if (tipoAl.getSelectedIndex() == 13) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/cerdo.png")));
                    OpcionesAl.listar3(tipoAl.getSelectedItem().toString());
                }
                if (tipoAl.getSelectedIndex() == 14) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/cigarro_suelto.png")));
                    OpcionesAl.listar3(tipoAl.getSelectedItem().toString());
                }
                if (tipoAl.getSelectedIndex() == 15) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/comida.png")));
                    OpcionesAl.listar3(tipoAl.getSelectedItem().toString());
                }
                if (tipoAl.getSelectedIndex() == 16) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/confituras.png")));
                    OpcionesAl.listar3(tipoAl.getSelectedItem().toString());
                }
                if (tipoAl.getSelectedIndex() == 17) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/frutas.png")));
                    OpcionesAl.listar3(tipoAl.getSelectedItem().toString());
                }
                if (tipoAl.getSelectedIndex() == 18) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/helado.png")));
                    OpcionesAl.listar3(tipoAl.getSelectedItem().toString());
                }
                if (tipoAl.getSelectedIndex() == 19) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/otras_carnes.png")));
                    OpcionesAl.listar3(tipoAl.getSelectedItem().toString());
                }
                if (tipoAl.getSelectedIndex() == 20) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/pan.png")));
                    OpcionesAl.listar3(tipoAl.getSelectedItem().toString());
                }
                if (tipoAl.getSelectedIndex() == 21) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/pizza.png")));
                    OpcionesAl.listar3(tipoAl.getSelectedItem().toString());
                }
                if (tipoAl.getSelectedIndex() == 22) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/pollo.png")));
                    OpcionesAl.listar3(tipoAl.getSelectedItem().toString());
                }
                if (tipoAl.getSelectedIndex() == 23) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/postre.png")));
                    OpcionesAl.listar3(tipoAl.getSelectedItem().toString());
                }
                if (tipoAl.getSelectedIndex() == 24) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/spaguetty.png")));
                    OpcionesAl.listar3(tipoAl.getSelectedItem().toString());
                }
                if (tipoAl.getSelectedIndex() == 25) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/otros.png")));
                    OpcionesAl.listar3(tipoAl.getSelectedItem().toString());
                }
            }
        });
        Alimentos.resizeColumnWidth(tablaAlimentos);
    }
    int cant_alamacen=0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlimentos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        buscar = new app.bolivia.swing.JCTextField();
        codigoL1 = new javax.swing.JLabel();
        tipoAl = new org.bolivia.combo.SComboBoxBlue();
        tipoL = new javax.swing.JLabel();
        enviar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("LISTA DE ALIMENTOS");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tablaAlimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "TIPO ALIMENTO", "NOMBRE ALIMENTO", "CANTIDAD", "PRECIO $"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAlimentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tablaAlimentos);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "OPCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscar.setBackground(new java.awt.Color(34, 102, 145));
        buscar.setBorder(null);
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buscar.setOpaque(false);
        buscar.setPhColor(new java.awt.Color(255, 255, 255));
        buscar.setPlaceholder("CÓDIGO/NOMBRE");
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarKeyReleased(evt);
            }
        });
        jPanel4.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 180, -1));

        codigoL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        codigoL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios/buscarL.png"))); // NOI18N
        jPanel4.add(codigoL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 250, 52));

        tipoAl.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TIPO ALIMENTO", "BEBIDAS", "ENTRANTE", "CALDOS", "CAMARONES", "COCTELES", "DESAYUNOS", "FILETE", "LANGOSTA", "LANGOSTINO", "PESCADO", "PULPO", "CIGARRO CAJA", "CERDO", "CIGARRO SUELTO", "COMIDA", "CONFITURAS", "FRUTAS", "HELADO", "OTRAS CARNES", "PAN", "PIZZA", "POLLO", "POSTRE", "SPAGUETTI", "OTROS" }));
        tipoAl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel4.add(tipoAl, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 183, -1));

        tipoL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alimentos/tipoAlL.png"))); // NOI18N
        jPanel4.add(tipoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, 52));

        enviar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alimentos/regis1.png"))); // NOI18N
        enviar.setText("Enviar a Caja");
        enviar.setBorder(null);
        enviar.setBorderPainted(false);
        enviar.setContentAreaFilled(false);
        enviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        enviar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alimentos/regis2.png"))); // NOI18N
        enviar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        jPanel4.add(enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 90, 100));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

    private void buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyReleased
        buscar.setText(buscar.getText().toUpperCase());
        OpcionesAl.listar3(buscar.getText());
    }//GEN-LAST:event_buscarKeyReleased
    public void calcular() {
        String pre;
        String can;
        double total = 0;
        double precio;
        int cantidad;
        double imp = 0.0;

        for (int i = 0; i < ventas.CajaAd.tablaCaja.getRowCount(); i++) {
            pre = ventas.CajaAd.tablaCaja.getValueAt(i, 3).toString();
            can = ventas.CajaAd.tablaCaja.getValueAt(i, 4).toString();
            precio = Double.parseDouble(pre);
            cantidad = Integer.parseInt(can);
            imp = precio * cantidad;
            total = total + imp;
            ventas.CajaAd.tablaCaja.setValueAt(Math.rint(imp * 100) / 100, i, 5);

        }
        ventas.CajaAd.total.setText("" + Math.rint(total * 100) / 100);

    }
    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        if (tablaAlimentos.getRowCount() > 0) {
            try {
                String cant = null;
                DefaultTableModel tabladet = (DefaultTableModel) ventas.CajaAd.tablaCaja.getModel();

                String[] dato = new String[6];

                int fila = tablaAlimentos.getSelectedRow();

                if (fila == -1) {
                    JOptionPane.showMessageDialog(this, "Seleccione un registro.", "Alimentos", 0,
                            new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
                } else {
                    String cod = tablaAlimentos.getValueAt(fila, 0).toString();
                    String tipo = tablaAlimentos.getValueAt(fila, 1).toString();
                    String nom = tablaAlimentos.getValueAt(fila, 2).toString();
                    String precio = tablaAlimentos.getValueAt(fila, 4).toString();
                    int c = 0;
                    int j = 0;
                    cant = JOptionPane.showInputDialog(this, "Cantidad:", "Alimentos", JOptionPane.INFORMATION_MESSAGE);
                    while ((!OpcionesAl.isNumber(cant) && cant != null)||(tablaAlimentos.getValueAt(fila, 3)!=null&&(Integer.parseInt(tablaAlimentos.getValueAt(fila, 3).toString())<Integer.parseInt(cant)))) {
                        cant = JOptionPane.showInputDialog(this, "Debe ingresar valores numéricos y que sean mayor a 0.\nLa cantidad a ofertar no puede ser mayor que la cantidad del producto en el almacen:",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    if ((cant.equals("")) || (cant.equals("0"))) {
//                        JOptionPane.showMessageDialog(this, "Debe ingresar algun valor mayor que 0");
                    } else {
                        if(tablaAlimentos.getValueAt(fila, 3)!=null){
                            cant_alamacen=Integer.parseInt(tablaAlimentos.getValueAt(fila, 3).toString());
                        }
                            
                            if(buscar_venta(cod, j, cant, cant_alamacen)==true){
                                for (int i = 0; i < ventas.CajaAd.tablaCaja.getRowCount(); i++) {
                            Object com = ventas.CajaAd.tablaCaja.getValueAt(i, 0);
                            Object cant1 = ventas.CajaAd.tablaCaja.getValueAt(i, 4);
                            if (cod.equals(com)) {
                                j = i;
                                int cantT = Integer.parseInt(cant) + Integer.parseInt((String) cant1);
                                ventas.CajaAd.tablaCaja.setValueAt(String.valueOf(cantT), i, 4);
                                c++;
                                calcular();
                                CajaAd.recibi.setText("");
                                CajaAd.cambio.setText("");
                        }
                                }
                        if (c == 0) {

                            dato[0] = cod;
                            dato[1] = tipo;
                            dato[2] = nom;
                            dato[3] = precio;
                            dato[4] = cant;

                            tabladet.addRow(dato);

                            ventas.CajaAd.tablaCaja.setModel(tabladet);
                            calcular();

                            CajaAd.recibi.setText("");
                            CajaAd.cambio.setText("");
                        }
                        cant_alamacen=0;
                            }else{
                                JOptionPane.showMessageDialog(this,"La cantidad a ofertar del producto seleccionado no puede\nexceder a la cantidad de este producto en el almacen","Error",JOptionPane.ERROR_MESSAGE);
                            }
                    }
                
            }
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay registros.", "Alimentos", 0,
                    new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
        }
        OpcionesAl.listar3("");
        Alimentos.resizeColumnWidth(ventas.CajaAd.tablaCaja);
        buscar.setText("");
    }//GEN-LAST:event_enviarActionPerformed

    public boolean buscar_venta(String cod, int j, String cant, int cant_almacen){
        boolean pasa=true;
        for (int i = 0; i < ventas.CajaAd.tablaCaja.getRowCount(); i++) {
                            Object com = ventas.CajaAd.tablaCaja.getValueAt(i, 0);
                            Object cant1 = ventas.CajaAd.tablaCaja.getValueAt(i, 4);
                            if (cod.equals(com)) {
                                j = i;
                                int cantT = Integer.parseInt(cant) + Integer.parseInt((String) cant1);
                                if(cant_almacen!=0){
                                if(cantT>cant_almacen){
                                    pasa=false;
                                }
                                }
                        }
                                }
        return pasa;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.bolivia.swing.JCTextField buscar;
    private javax.swing.JLabel codigoL1;
    private javax.swing.JButton enviar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablaAlimentos;
    private org.bolivia.combo.SComboBoxBlue tipoAl;
    private javax.swing.JLabel tipoL;
    // End of variables declaration//GEN-END:variables
}
