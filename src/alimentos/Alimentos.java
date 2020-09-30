/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alimentos;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author 4L3
 */
public class Alimentos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Usuarios
     */
    int cantAlmacen=0;
    String tempCant="";
    public Alimentos() {
        initComponents();
        tablaAlimentos.getTableHeader().setDefaultRenderer(new principal.EstiloTablaHeader());
        tablaAlimentos.setDefaultRenderer(Object.class, new principal.EstiloTablaRenderer());
        this.tipoAl.setCursor(new Cursor(12));
        this.setFrameIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/icono.png")));
        limpiaCampos();
        check_suma.setVisible(false);
        tablaAlimentos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        tipoAl.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent ie) {
                if (tipoAl.getSelectedIndex() == 0) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/tipoAlL.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/nombreL.png")));
                    cantidadL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/nombreL.png")));
                }
                if (tipoAl.getSelectedIndex() == 1) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/bebida.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/bebida1.png")));
                    cantidadL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/bebida1.png")));
                }
                if (tipoAl.getSelectedIndex() == 2) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/botana.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/botana1.png")));
                    cantidadL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/botana1.png")));
                }
                if (tipoAl.getSelectedIndex() == 3) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/caldo.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/caldo1.png")));
                    cantidadL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/caldo1.png")));
                }
                if (tipoAl.getSelectedIndex() == 4) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/camaron.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/camaron1.png")));
                    cantidadL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/camaron1.png")));
                }
                if (tipoAl.getSelectedIndex() == 5) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/coctel.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/coctel1.png")));
                    cantidadL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/coctel1.png")));
                }
                if (tipoAl.getSelectedIndex() == 6) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/desayuno.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/desayuno1.png")));
                    cantidadL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/desayuno1.png")));
                }
                if (tipoAl.getSelectedIndex() == 7) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/filete.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/filete1.png")));
                    cantidadL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/filete1.png")));
                }
                if (tipoAl.getSelectedIndex() == 8) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/langosta.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/langosta1.png")));
                    cantidadL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/langosta1.png")));
                }
                if (tipoAl.getSelectedIndex() == 9) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/langostino.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/langostino1.png")));
                    cantidadL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/langostino1.png")));
                }
                if (tipoAl.getSelectedIndex() == 10) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/pescado.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/pescado1.png")));
                    cantidadL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/pescado1.png")));
                }
                if (tipoAl.getSelectedIndex() == 11) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/pulpo.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/pulpo1.png")));
                    cantidadL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/pulpo1.png")));
                }
                if (tipoAl.getSelectedIndex() == 12) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/caja_cigarro.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/caja_cigarro1.png")));
                    cantidadL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/caja_cigarro1.png")));
                }
                if (tipoAl.getSelectedIndex() == 13) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/cerdo.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/cerdo1.png")));
                    cantidadL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/cerdo1.png")));
                }
                if (tipoAl.getSelectedIndex() == 14) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/cigarro_suelto.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/cigarro_suelto1.png")));
                    cantidadL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/cigarro_suelto1.png")));
                }
                if (tipoAl.getSelectedIndex() == 15) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/comida.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/comida1.png")));
                    cantidadL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/comida1.png")));
                }
                if (tipoAl.getSelectedIndex() == 16) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/confituras.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/confituras1.png")));
                    cantidadL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/confituras1.png")));
                }
                if (tipoAl.getSelectedIndex() == 17) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/frutas.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/frutas1.png")));
                    cantidadL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/frutas1.png")));
                }
                if (tipoAl.getSelectedIndex() == 18) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/helado.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/helado1.png")));
                    cantidadL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/helado1.png")));
                }
                if (tipoAl.getSelectedIndex() == 19) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/otras_carnes.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/otras_carnes1.png")));
                    cantidadL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/otras_carnes1.png")));
                }
                if (tipoAl.getSelectedIndex() == 20) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/pan.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/pan1.png")));
                    cantidadL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/pan1.png")));
                }
                if (tipoAl.getSelectedIndex() == 21) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/pizza.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/pizza1.png")));
                    cantidadL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/pizza1.png")));
                }
                if (tipoAl.getSelectedIndex() == 22) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/pollo.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/pollo1.png")));
                    cantidadL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/pollo1.png")));
                }
                if (tipoAl.getSelectedIndex() == 23) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/postre.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/postre1.png")));
                    cantidadL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/postre1.png")));
                }
                if (tipoAl.getSelectedIndex() == 24) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/spaguetty.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/spaguetty1.png")));
                    cantidadL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/spaguetty1.png")));
                }
                if (tipoAl.getSelectedIndex() == 25) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/otros.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/otros1.png")));
                    cantidadL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/otros1.png")));
                }
            }
        });

        tablaAlimentos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                if (tablaAlimentos.getSelectedRow() != -1) {
                    cambiaDatos();
                    selecionRegistro = true;
                }
            }
        });
        resizeColumnWidth(tablaAlimentos);
    }

    //###################### auto ajustar ancho de columnas ####################
    public static void resizeColumnWidth(JTable table) {
        final TableColumnModel columnModel = table.getColumnModel();
        for (int column = 0; column < table.getColumnCount(); column++) {
            int width = 15; // Min width
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width + 1, width);
            }
            if (width > 300) {
                width = 300;
            }
            columnModel.getColumn(column).setPreferredWidth(width);
        }
    }
    //##########################################################################

    
    
    
    
    
    void cambiaDatos() {
        int fila = tablaAlimentos.getSelectedRow();
        codigo.setText(tablaAlimentos.getValueAt(fila, 0).toString());
        tipoAl.setSelectedItem(tablaAlimentos.getValueAt(fila, 1).toString());
        nombre.setText(tablaAlimentos.getValueAt(fila, 2).toString());
        if (tablaAlimentos.getValueAt(fila, 3) != null) {
            cantidad.setText(tablaAlimentos.getValueAt(fila, 3).toString());
            tempCant=tablaAlimentos.getValueAt(fila, 3).toString();
            check_suma.setVisible(true);
                        cantAlmacen=Integer.parseInt(cantidad.getText());
        } else {
            check_suma.setVisible(false);
            cantidad.setText("");
        }
        precio.setText(tablaAlimentos.getValueAt(fila, 4).toString());
    }
    boolean selecionRegistro = false;

    void limpiaCampos() {
        if (tablaAlimentos.getSelectedRow() > -1) {
            tablaAlimentos.removeRowSelectionInterval(tablaAlimentos.getSelectedRow(), tablaAlimentos.getSelectedRow());
        }
        codigo.setText("");
        nombre.setText("");
        cantidad.setText("");
        tipoAl.setSelectedItem("TIPO ALIMENTO");
        precio.setText("");
        buscar.setText("");
        selecionRegistro = false;
        OpcionesAl.listar("");
        OpcionesAl.extraerID();
    }

    void selecionaFila(String id) {
        for (int i = 0; i < tablaAlimentos.getRowCount(); i++) {
            if (id.equals(tablaAlimentos.getValueAt(i, 0))) {
                tablaAlimentos.setRowSelectionInterval(i, i);
                break;
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        codigo = new app.bolivia.swing.JCTextField();
        codigoL = new javax.swing.JLabel();
        nombre = new app.bolivia.swing.JCTextField();
        nombreL = new javax.swing.JLabel();
        tipoAl = new org.bolivia.combo.SComboBoxBlue();
        tipoL = new javax.swing.JLabel();
        precio = new app.bolivia.swing.JCTextField();
        nombreL1 = new javax.swing.JLabel();
        cantidad = new app.bolivia.swing.JCTextField();
        cantidadL = new javax.swing.JLabel();
        check_suma = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlimentos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        registrar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        eliminarT = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        buscar = new app.bolivia.swing.JCTextField();
        codigoL1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("ALIMENTOS");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "REGISTRO", 0, 0, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codigo.setEditable(false);
        codigo.setBackground(new java.awt.Color(34, 102, 145));
        codigo.setBorder(null);
        codigo.setForeground(new java.awt.Color(255, 255, 255));
        codigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        codigo.setOpaque(false);
        codigo.setPhColor(new java.awt.Color(255, 255, 255));
        codigo.setPlaceholder("CÓDIGO");
        jPanel2.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 180, -1));

        codigoL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alimentos/codigoL.png"))); // NOI18N
        jPanel2.add(codigoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 52));

        nombre.setBackground(new java.awt.Color(34, 102, 145));
        nombre.setBorder(null);
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombre.setOpaque(false);
        nombre.setPhColor(new java.awt.Color(255, 255, 255));
        nombre.setPlaceholder("NOMBRE ALIMENTO");
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 180, -1));

        nombreL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alimentos/nombreL.png"))); // NOI18N
        jPanel2.add(nombreL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 52));

        tipoAl.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TIPO ALIMENTO", "BEBIDAS", "ENTRANTE", "CALDOS", "CAMARONES", "COCTELES", "DESAYUNOS", "FILETE", "LANGOSTA", "LANGOSTINO", "PESCADO", "PULPO", "CIGARRO CAJA", "CERDO", "CIGARRO SUELTO", "COMIDA", "CONFITURAS", "FRUTAS", "HELADO", "OTRAS CARNES", "PAN", "PIZZA", "POLLO", "POSTRE", "SPAGUETTI", "OTROS" }));
        tipoAl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tipoAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoAlActionPerformed(evt);
            }
        });
        jPanel2.add(tipoAl, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 183, -1));

        tipoL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alimentos/tipoAlL.png"))); // NOI18N
        jPanel2.add(tipoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, -1, 52));

        precio.setBackground(new java.awt.Color(34, 102, 145));
        precio.setBorder(null);
        precio.setForeground(new java.awt.Color(255, 255, 255));
        precio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        precio.setOpaque(false);
        precio.setPhColor(new java.awt.Color(255, 255, 255));
        precio.setPlaceholder("PRECIO");
        precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioKeyTyped(evt);
            }
        });
        jPanel2.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 180, -1));

        nombreL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alimentos/precioL.png"))); // NOI18N
        jPanel2.add(nombreL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, -1, 52));

        cantidad.setBackground(new java.awt.Color(34, 102, 145));
        cantidad.setBorder(null);
        cantidad.setForeground(new java.awt.Color(255, 255, 255));
        cantidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cantidad.setOpaque(false);
        cantidad.setPhColor(new java.awt.Color(255, 255, 255));
        cantidad.setPlaceholder("CANTIDAD ");
        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadKeyTyped(evt);
            }
        });
        jPanel2.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 120, -1));

        cantidadL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cantidadL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alimentos/nombreL.png"))); // NOI18N
        jPanel2.add(cantidadL, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 250, 52));

        check_suma.setBackground(new java.awt.Color(255, 255, 255));
        check_suma.setForeground(new java.awt.Color(42, 102, 142));
        check_suma.setToolTipText("Sumar la cantidad con la del almacen");
        check_suma.setBorder(null);
        check_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_sumaActionPerformed(evt);
            }
        });
        jPanel2.add(check_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 105, -1, -1));

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "OPCIONES", 0, 0, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        registrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alimentos/regis1.png"))); // NOI18N
        registrar.setText("Registrar");
        registrar.setBorder(null);
        registrar.setBorderPainted(false);
        registrar.setContentAreaFilled(false);
        registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alimentos/regis2.png"))); // NOI18N
        registrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        actualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios/actualizar.png"))); // NOI18N
        actualizar.setText("Actualizar");
        actualizar.setBorder(null);
        actualizar.setBorderPainted(false);
        actualizar.setContentAreaFilled(false);
        actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        actualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        actualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios/actualizar1.png"))); // NOI18N
        actualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios/borrar1.png"))); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.setBorder(null);
        eliminar.setBorderPainted(false);
        eliminar.setContentAreaFilled(false);
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios/borrar2.png"))); // NOI18N
        eliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        eliminarT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        eliminarT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios/borrarT1.png"))); // NOI18N
        eliminarT.setText("Eliminar Todo");
        eliminarT.setBorder(null);
        eliminarT.setBorderPainted(false);
        eliminarT.setContentAreaFilled(false);
        eliminarT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eliminarT.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios/borrarT2.png"))); // NOI18N
        eliminarT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        eliminarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarTActionPerformed(evt);
            }
        });

        limpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios/limpiar1.png"))); // NOI18N
        limpiar.setText("Limpiar Campos");
        limpiar.setBorder(null);
        limpiar.setBorderPainted(false);
        limpiar.setContentAreaFilled(false);
        limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        limpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios/limpiar2.png"))); // NOI18N
        limpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(actualizar)
                .addGap(10, 10, 10)
                .addComponent(eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eliminarT)
                .addGap(18, 18, 18)
                .addComponent(limpiar)
                .addGap(4, 4, 4))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {actualizar, eliminar, eliminarT, limpiar});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registrar)
            .addComponent(actualizar)
            .addComponent(eliminar)
            .addComponent(eliminarT)
            .addComponent(limpiar)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "BUSQUEDA", 0, 0, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscar.setBackground(new java.awt.Color(34, 102, 145));
        buscar.setBorder(null);
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buscar.setOpaque(false);
        buscar.setPhColor(new java.awt.Color(255, 255, 255));
        buscar.setPlaceholder("CÓDIGO/NOMBRE");
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
        });
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarKeyReleased(evt);
            }
        });
        jPanel4.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 180, -1));

        codigoL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        codigoL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios/buscarL.png"))); // NOI18N
        jPanel4.add(codigoL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 250, 52));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        if (selecionRegistro) {
            JOptionPane.showMessageDialog(this, "El CODIGO: " + this.codigo.getText() + "\nya existe en un registro.", "Alimentos", 0,
                    new ImageIcon(getClass().getResource("/imagenes/usuarios/impo.png")));
        } else if (codigo.getText().equals("") || nombre.getText().equals("") || tipoAl.getSelectedItem().equals("TIPO ALIMENTOS")
                || precio.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos los campos\nson obligatorios.", "Alimentos", 0,
                    new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
        } else {
            if (cantidad.getText().equals("")) {
                alimentos.AlimentosCod us = new AlimentosCod();
                us.setPrimaryKey(codigo.getText());
                us.setNombre(nombre.getText());
                us.setTipoal(tipoAl.getSelectedItem().toString());
                us.setPrecio(precio.getText());
                int opcion = OpcionesAl.registrar2(us);
                if (opcion != 0) {
                    String id = codigo.getText();
                    limpiaCampos();
                    selecionaFila(id);
                    codigo.setText("");
                    nombre.setText("");
                    cantidad.setText("");
                    tipoAl.setSelectedItem("TIPO ALIMENTO");
                    precio.setText("");
                    buscar.setText("");
                     OpcionesAl.extraerID();
                     selecionRegistro = false;
                    JOptionPane.showMessageDialog(this, "Registro éxitoso.", "Alimentos", 0,
                            new ImageIcon(getClass().getResource("/imagenes/alimentos/registrado.png")));
                }
            } else {
                alimentos.AlimentosCod us = new AlimentosCod();
                us.setPrimaryKey(codigo.getText());
                us.setNombre(nombre.getText());
                us.setCantidad(cantidad.getText());
                us.setTipoal(tipoAl.getSelectedItem().toString());
                us.setPrecio(precio.getText());
                int opcion = OpcionesAl.registrar(us);
                if (opcion != 0) {
                    String id = codigo.getText();
                    limpiaCampos();
                    selecionaFila(id);
                    codigo.setText("");
                    nombre.setText("");
                    cantidad.setText("");
                    tipoAl.setSelectedItem("TIPO ALIMENTO");
                    precio.setText("");
                    buscar.setText("");
                     OpcionesAl.extraerID();
                     selecionRegistro = false;
                    JOptionPane.showMessageDialog(this, "Registro éxitoso.", "Alimentos", 0,
                            new ImageIcon(getClass().getResource("/imagenes/alimentos/registrado.png")));
                }
            }

        }
    }//GEN-LAST:event_registrarActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        if (tablaAlimentos.getRowCount() > 0) {
            if (tablaAlimentos.getSelectedRowCount() > 0) {
                if (codigo.getText().equals("") || nombre.getText().equals("") || tipoAl.getSelectedItem().equals("TIPO ALIMENTOS")
                        || precio.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Es necesario completar\nlos campos a actualizar.", "Alimentos", 0,
                            new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
                } else if (JOptionPane.showConfirmDialog(this, "Esta a punto de actualizar\nun registro.\n¿Desea continuar?", "Alimentos", JOptionPane.YES_NO_OPTION, 0,
                        new ImageIcon(getClass().getResource("/imagenes/usuarios/seguro.png"))) == JOptionPane.YES_OPTION) {
                    if (!cantidad.getText().equals("")) {
                        if (check_suma.isSelected()) {
                            alimentos.AlimentosCod us = new AlimentosCod();
                            us.setPrimaryKey(codigo.getText());
                            us.setNombre(nombre.getText());
                            us.setCantidad(String.valueOf(Integer.parseInt(cantidad.getText())+cantAlmacen));
                            us.setTipoal(tipoAl.getSelectedItem().toString());
                            us.setPrecio(precio.getText());
                            int opcion = OpcionesAl.actualizar(us);
                            if (opcion != 0) {
                                String id = codigo.getText();
                                limpiaCampos();
                                selecionaFila(id);
                                JOptionPane.showMessageDialog(this, "Registro actualizado.", "Alimentos", 0,
                                        new ImageIcon(getClass().getResource("/imagenes/alimentos/actualizado.png")));
                            }
                        } else {
                            alimentos.AlimentosCod us = new AlimentosCod();
                            us.setPrimaryKey(codigo.getText());
                            us.setNombre(nombre.getText());
                            us.setCantidad(cantidad.getText());
                            us.setTipoal(tipoAl.getSelectedItem().toString());
                            us.setPrecio(precio.getText());
                            int opcion = OpcionesAl.actualizar(us);
                            if (opcion != 0) {
                                String id = codigo.getText();
                                limpiaCampos();
                                selecionaFila(id);
                                JOptionPane.showMessageDialog(this, "Registro actualizado.", "Alimentos", 0,
                                        new ImageIcon(getClass().getResource("/imagenes/alimentos/actualizado.png")));
                            }
                        }
                    } else {
                        alimentos.AlimentosCod us = new AlimentosCod();
                        us.setPrimaryKey(codigo.getText());
                        us.setNombre(nombre.getText());
                        us.setTipoal(tipoAl.getSelectedItem().toString());
                        us.setPrecio(precio.getText());
                        int opcion = OpcionesAl.actualizar(us);
                        if (opcion != 0) {
                            String id = codigo.getText();
                            limpiaCampos();
                            selecionaFila(id);
                            JOptionPane.showMessageDialog(this, "Registro actualizado.", "Alimentos", 0,
                                    new ImageIcon(getClass().getResource("/imagenes/alimentos/actualizado.png")));
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un registro.", "Alimentos", 0,
                        new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
            }

        } else {
            JOptionPane.showMessageDialog(this, "No hay registros\npara actualizar.", "Alimentos", 0,
                    new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
        }
        check_suma.setSelected(false);
        check_suma.setVisible(false);
    }//GEN-LAST:event_actualizarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if (tablaAlimentos.getRowCount() > 0) {
            if (tablaAlimentos.getSelectedRowCount() > 0) {
                if (JOptionPane.showConfirmDialog(this, "Esta a punto de eliminar\nun registro.\n¿Desea continuar?", "Alimentos", JOptionPane.YES_NO_OPTION, 0,
                        new ImageIcon(getClass().getResource("/imagenes/usuarios/seguro.png"))) == JOptionPane.YES_OPTION) {
                    int fila = tablaAlimentos.getSelectedRow();
                    String id = tablaAlimentos.getValueAt(fila, 0).toString();
                    int elimina = OpcionesAl.eliminar(id);
                    if (elimina != 0) {
                        limpiaCampos();
                        JOptionPane.showMessageDialog(this, "Registro eliminado.", "Alimentos", 0,
                                new ImageIcon(getClass().getResource("/imagenes/alimentos/borrado1.png")));
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un registro.", "Alimentos", 0,
                        new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
            }

        } else {
            JOptionPane.showMessageDialog(this, "No hay registros\npara eliminar.", "Alimentos", 0,
                    new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void eliminarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarTActionPerformed
        if (tablaAlimentos.getRowCount() > 0) {
            if (JOptionPane.showConfirmDialog(this, "Esta a punto de elimnar\ntodos los registros.\n¿Desea continuar?", "Alimentos", JOptionPane.YES_NO_OPTION, 0,
                    new ImageIcon(getClass().getResource("/imagenes/usuarios/seguro.png"))) == JOptionPane.YES_OPTION) {
                int eliminaT = OpcionesAl.eliminaTodos();
                if (eliminaT != 0) {
                    limpiaCampos();
                    JOptionPane.showMessageDialog(this, "Registros eliminados.", "Alimentos", 0,
                            new ImageIcon(getClass().getResource("/imagenes/alimentos/borrado.png")));
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay registros\npara eliminar.", "Alimentos", 0,
                    new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
        }
    }//GEN-LAST:event_eliminarTActionPerformed

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        char letras = evt.getKeyChar();
        if ((letras < 'a' || letras > 'z') && (letras < 'A' | letras > 'Z')) {
            if ((letras != 'ñ') && (letras != 'Ñ') && (letras != 'á') && (letras != 'Á') && (letras != 'é') && (letras != 'É') && (letras != 'í')
                    && (letras != 'Í') && (letras != 'ó') && (letras != 'Ó') && (letras != 'ú') && (letras != 'Ú') && (letras != ' ')) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_nombreKeyTyped

    private void precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioKeyTyped
        char num = evt.getKeyChar();
        if ((num < '0' || num > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_precioKeyTyped

    private void nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyReleased
        nombre.setText(nombre.getText().toUpperCase());
    }//GEN-LAST:event_nombreKeyReleased

    private void buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyReleased
        buscar.setText(buscar.getText().toUpperCase());
        OpcionesAl.listar(buscar.getText());
    }//GEN-LAST:event_buscarKeyReleased

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
        limpiaCampos();
    }//GEN-LAST:event_buscarMouseClicked

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        limpiaCampos();
        check_suma.setVisible(false);
    }//GEN-LAST:event_limpiarActionPerformed

    private void cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyTyped
        // TODO add your handling code here:
        char num = evt.getKeyChar();
        if ((num < '0' || num > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_cantidadKeyTyped

    private void tipoAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoAlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoAlActionPerformed

    private void check_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_sumaActionPerformed
        // TODO add your handling code here:
        if(check_suma.isSelected()){
            cantidad.setText("");
        }else{
            cantidad.setText(tempCant);
        }
    }//GEN-LAST:event_check_sumaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private app.bolivia.swing.JCTextField buscar;
    private app.bolivia.swing.JCTextField cantidad;
    private javax.swing.JLabel cantidadL;
    private javax.swing.JCheckBox check_suma;
    public static app.bolivia.swing.JCTextField codigo;
    private javax.swing.JLabel codigoL;
    private javax.swing.JLabel codigoL1;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton eliminarT;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar;
    private app.bolivia.swing.JCTextField nombre;
    private javax.swing.JLabel nombreL;
    private javax.swing.JLabel nombreL1;
    private app.bolivia.swing.JCTextField precio;
    private javax.swing.JButton registrar;
    public static javax.swing.JTable tablaAlimentos;
    private org.bolivia.combo.SComboBoxBlue tipoAl;
    private javax.swing.JLabel tipoL;
    // End of variables declaration//GEN-END:variables
}
