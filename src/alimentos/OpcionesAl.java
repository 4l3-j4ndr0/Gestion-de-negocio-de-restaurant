/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alimentos;

import usuarios.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import principal.GenerarCodigos;
import principal.conectar;

/**
 *
 * @author 4L3
 */
public class OpcionesAl {

    static conectar cc = new conectar();
    static Connection cn = cc.conexion();
    static PreparedStatement ps;

    public static int registrar(AlimentosCod uc) {
        int rsu = 0;
        String sql = AlimentosCod.REGISTRAR;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, uc.getPrimaryKey());
            ps.setString(2, uc.getTipoal());
            ps.setString(3, uc.getNombre());
            ps.setString(4, uc.getCantidad());
            ps.setString(5, uc.getPrecio());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return rsu;
    }
    
    public static int registrar2(AlimentosCod uc) {
        int rsu = 0;
        String sql = AlimentosCod.REGISTRAR2;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, uc.getPrimaryKey());
            ps.setString(2, uc.getTipoal());
            ps.setString(3, uc.getNombre());
            ps.setString(4, uc.getPrecio());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return rsu;
    }
    
    public static int actualizar_almacen(int cantidad, String codigo) {
        int rsu = 0;
        String sql = "UPDATE alimentos SET cantidad_al=? WHERE codigo_al=?";
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, cantidad);
            ps.setString(2, codigo);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
        }
        System.out.println(sql);
        return rsu;
    }

    public static int actualizar(AlimentosCod uc) {
        int rsu = 0;
        String sql = AlimentosCod.ACTUALIZAR;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, uc.getTipoal());
            ps.setString(2, uc.getNombre());
            ps.setString(3, uc.getCantidad());
            ps.setString(4, uc.getPrecio());
            ps.setString(5, uc.getPrimaryKey());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
        }
        System.out.println(sql);
        return rsu;
    }

    public static int eliminar(String id) {
        int rsu = 0;
        String sql = AlimentosCod.ELIMINAR;

        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, id);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return rsu;
    }

    public static int eliminaTodos() {
        int rsu = 0;
        String sql = AlimentosCod.ELIMINAR_TODO;
        try {
            ps = cn.prepareStatement(sql);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return rsu;
    }

    public static void extraerID() {
        int j;
        int cont = 1;
        String num = "";
        String c = "";
        String SQL = "SELECT MAX(codigo_al) FROM alimentos";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(1);
            }

            if (c == null) {
                alimentos.Alimentos.codigo.setText("AL0001");
            } else {
                char r1 = c.charAt(2);
                char r2 = c.charAt(3);
                char r3 = c.charAt(4);
                char r4 = c.charAt(5);
                String r = "";
                r = "" + r1 + r2 + r3 + r4;
                j = Integer.parseInt(r);
                GenerarCodigos gen = new GenerarCodigos();
                gen.generar(j);
                alimentos.Alimentos.codigo.setText("AL" + gen.serie());

            }

        } catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static int extraer_cant_almacen(String codigo) {
        int j;
        int cant = 1;
        String num = "";
        String c = "";
        String SQL = "SELECT cantidad_al FROM alimentos where codigo_al='"+codigo+"'";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                cant = rs.getInt(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cant;
    }

    public static void listar(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) alimentos.Alimentos.tablaAlimentos.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = AlimentosCod.LISTAR;
        } else {
            sql = "SELECT * FROM alimentos WHERE (codigo_al like'" + busca + "%' or nombre_al like'" + busca + "%') "
                    + " ORDER BY nombre_al";
        }
        String datos[] = new String[5];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("codigo_al");
                datos[1] = rs.getString("tipo_al");
                datos[2] = rs.getString("nombre_al");
                datos[3] = rs.getString("cantidad_al");
                datos[4] = rs.getString("precio_al");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void listar1(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) alimentos.ListaAlimentosANor.tablaAlimentos.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = AlimentosCod.LISTAR;
        } else {
            sql = "SELECT * FROM alimentos WHERE (codigo_al like'" + busca + "%' or nombre_al like'" + busca + "%') "
                    + "or tipo_al='" + busca + "' ORDER BY nombre_al";
        }
        String datos[] = new String[5];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("codigo_al");
                datos[1] = rs.getString("tipo_al");
                datos[2] = rs.getString("nombre_al");
                datos[3] = rs.getString("cantidad_al");
                datos[4] = rs.getString("precio_al");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void listar2(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) alimentos.ListaAlimentosAd.tablaAlimentos.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = AlimentosCod.LISTAR;
        } else {
            sql = "SELECT * FROM alimentos WHERE (codigo_al like'" + busca + "%' or nombre_al like'" + busca + "%') "
                    + "or tipo_al='" + busca + "' ORDER BY nombre_al";
        }
        String datos[] = new String[5];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("codigo_al");
                datos[1] = rs.getString("tipo_al");
                datos[2] = rs.getString("nombre_al");
                datos[3] = rs.getString("cantidad_al");
                datos[4] = rs.getString("precio_al");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   public static void listar3(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) alimentos.ListaAlimentosAd.tablaAlimentos.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        String sql2 = "";
        if (busca.equals("")) {
            sql = "SELECT * FROM alimentos WHERE cantidad_al <> 0 or cantidad_al is null";
        } else {
            sql = "SELECT * FROM alimentos WHERE (cantidad_al <> 0 or cantidad_al is null) and (codigo_al like'" + busca + "%' or nombre_al like'" + busca + "%') "
                    + "or tipo_al='" + busca + "' ORDER BY nombre_al ";
//            sql2 = "SELECT * FROM alimentos WHERE cantidad_al is null and (codigo_al like'" + busca + "%' or nombre_al like'" + busca + "%') "
//                    + "or tipo_al='" + busca + "' ORDER BY nombre_al ";
        }
        String datos[] = new String[5];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            /*Statement st2 = cn.createStatement();
            ResultSet rs2 = st2.executeQuery(sql2);*/
            while (rs.next()) {
                datos[0] = rs.getString("codigo_al");
                datos[1] = rs.getString("tipo_al");
                datos[2] = rs.getString("nombre_al");
                datos[3] = rs.getString("cantidad_al");
                datos[4] = rs.getString("precio_al");
                modelo.addRow(datos);
            }
           /* while (rs2.next()) {
                datos[0] = rs.getString("codigo_al");
                datos[1] = rs.getString("tipo_al");
                datos[2] = rs.getString("nombre_al");
                datos[3] = rs.getString("cantidad_al");
                datos[4] = rs.getString("precio_al");
                modelo.addRow(datos);
            }*/
        } catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
   public static void listar4(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) alimentos.ListaAlimentosANor.tablaAlimentos.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        String sql2 = "";
        if (busca.equals("")) {
            sql = "SELECT * FROM alimentos WHERE cantidad_al <> 0 or cantidad_al is null";
        } else {
            sql = "SELECT * FROM alimentos WHERE (cantidad_al <> 0 or cantidad_al is null) and (codigo_al like'" + busca + "%' or nombre_al like'" + busca + "%') "
                    + "or tipo_al='" + busca + "' ORDER BY nombre_al ";
//            sql2 = "SELECT * FROM alimentos WHERE cantidad_al is null and (codigo_al like'" + busca + "%' or nombre_al like'" + busca + "%') "
//                    + "or tipo_al='" + busca + "' ORDER BY nombre_al ";
        }
        String datos[] = new String[5];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            /*Statement st2 = cn.createStatement();
            ResultSet rs2 = st2.executeQuery(sql2);*/
            while (rs.next()) {
                datos[0] = rs.getString("codigo_al");
                datos[1] = rs.getString("tipo_al");
                datos[2] = rs.getString("nombre_al");
                datos[3] = rs.getString("cantidad_al");
                datos[4] = rs.getString("precio_al");
                modelo.addRow(datos);
            }
           /* while (rs2.next()) {
                datos[0] = rs.getString("codigo_al");
                datos[1] = rs.getString("tipo_al");
                datos[2] = rs.getString("nombre_al");
                datos[3] = rs.getString("cantidad_al");
                datos[4] = rs.getString("precio_al");
                modelo.addRow(datos);
            }*/
        } catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean isNumber(String n) {
        try {
            if (Integer.parseInt(n) > 0) {
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
