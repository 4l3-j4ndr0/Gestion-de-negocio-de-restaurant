/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import alimentos.AlimentosCod;
import alimentos.OpcionesAl;
import static java.awt.image.ImageObserver.ERROR;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 4L3
 */
public class Correr {

    static conectar cc = new conectar();
    static Connection con = cc.conexion();

    public static int Guardar_dia_vacio(String fechaDia, String fechaMes, String fechaAno) {
//        Date fecha = fechaDato;
//        DateFormat f = new SimpleDateFormat("dd-MM-yyyy");
//        String fecha2 = f.format(fecha);
        int resultado = 0;
        Connection con = null;

        String SSQL = "INSERT INTO dias (dia,mes,año) VALUES (?,?,?)";

        try {
            con = cc.conexion();
            PreparedStatement psql = con.prepareStatement(SSQL);
            psql.setString(1, fechaDia);
            psql.setString(2, fechaMes);
            psql.setString(3, fechaAno);
            resultado = psql.executeUpdate();
            psql.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al intentar almacenar la información:\n"
                    + e, "Error en la operación", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {

                if (con != null) {

                    con.close();

                }

            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, "Error al intentar cerrar la conexión:\n"
                        + ex, "Error en la operación", JOptionPane.ERROR_MESSAGE);

            }
        }
        return resultado;
    }

    public static void actualizar_dia(Date fechaDato) {

    }

    public static boolean hay_dia() {
        boolean vacio = false;
        String sql = "select * from dias";
        String datos = null;
        try {
            PreparedStatement cn = con.prepareStatement(sql);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos = rs.getString("dia");
            }
        } catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (datos != null) {
            vacio = true;
        }
        return vacio;
    }

    public static int periodo_prueba_id() {
        int vacio = 0;
        String sql = "select id from dias order by id desc limit 1 ";
        String datos = null;
        try {
            PreparedStatement cn = con.prepareStatement(sql);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos = rs.getString("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
        vacio = Integer.parseInt(datos);
        return vacio;
    }

    public static int periodo_prueba_dia() {
        int vacio = 0;
        String sql = "select dia from dias order by id desc limit 1";
        String datos = null;
        try {
            PreparedStatement cn = con.prepareStatement(sql);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos = rs.getString("dia");
            }
        } catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
        vacio = Integer.parseInt(datos);
        return vacio;
    }

    public static int periodo_prueba_mes() {
        int vacio = 0;
        String sql = "select mes from dias order by id desc limit 1,1";
        String datos = null;
        try {
            PreparedStatement cn = con.prepareStatement(sql);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos = rs.getString("mes");
            }
        } catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
        vacio = Integer.parseInt(datos);
        return vacio;
    }

    public static int periodo_prueba_ano() {
        int vacio = 0;
        String sql = "select año from dias order by id desc limit 1,1";
        String datos = null;
        try {
            PreparedStatement cn = con.prepareStatement(sql);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos = rs.getString("año");
            }
        } catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
        vacio = Integer.parseInt(datos);
        return vacio;
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error en en Look and Feel", "Error", ERROR);
                }

                    new SplashScreen().setVisible(true);
//       //###################  periodo de prueba  #############################################            
//                Calendar c = Calendar.getInstance();
//                String fechaDia = Integer.toString(c.get(Calendar.DATE));
//                String fechaMes = Integer.toString(c.get(Calendar.MONTH));
//                String fechaAño = Integer.toString(c.get(Calendar.YEAR));
//                if (hay_dia() == false) {
//                    Guardar_dia_vacio(fechaDia, fechaMes, fechaAño);
//                    new SplashScreen().setVisible(true);
//                } else {
//                    if (periodo_prueba_id() <= 16) {
//
//                        if (periodo_prueba_id() == 1) {
//                            Guardar_dia_vacio(fechaDia, fechaMes, fechaAño);
//                            new SplashScreen().setVisible(true);
//                        } else {
//                            if (periodo_prueba_dia() - Integer.parseInt(fechaDia) == 0) {
//                                new SplashScreen().setVisible(true);
//                            } else {
//                                //codigo para el mismo mes
//                                if ((Integer.parseInt(fechaMes) == periodo_prueba_mes()) && (Integer.parseInt(fechaAño) == periodo_prueba_ano())) {
//
//                                    if (Integer.parseInt(fechaDia) > periodo_prueba_dia()) {
//                                        Guardar_dia_vacio(fechaDia, fechaMes, fechaAño);
//                                        new SplashScreen().setVisible(true);
//                                    } else {
//                                        Correr corre=new Correr();
//                                        JOptionPane.showMessageDialog(null, "La fecha de su computador no coincide con la \nsecuencia sucesiva de la última fecha en la que se utilizó el sistema. \nPor favor corrija la fecha de su ordenador. \n\nSu última interacción con el sistema ocurrió el día "+corre.periodo_prueba_dia()+"/"+corre.periodo_prueba_mes()+"/"+corre.periodo_prueba_ano(), "Error", JOptionPane.ERROR_MESSAGE);
//                                    }
//
//                                }
//                                if ((Integer.parseInt(fechaMes) > periodo_prueba_mes()) && (Integer.parseInt(fechaAño) == periodo_prueba_ano())) {
//                                    // codigo para cuando cambia de mes en el mismo año
//                                    if (Integer.parseInt(fechaDia) > periodo_prueba_dia()) {
//                                        Guardar_dia_vacio(fechaDia, fechaMes, fechaAño);
//                                        new SplashScreen().setVisible(true);
//                                    }
//
//                                    switch (Integer.parseInt(fechaDia)) {
//                                        case 0:
//                                            if ((Integer.parseInt(fechaDia) > periodo_prueba_dia()) && (Integer.parseInt(fechaMes) == periodo_prueba_mes()) && Integer.parseInt(fechaAño) == periodo_prueba_ano()) {
//                                                Guardar_dia_vacio(fechaDia, fechaMes, fechaAño);
//                                                new SplashScreen().setVisible(true);
//                                            }
//                                            break;
//                                        case 1:
//                                            if ((Integer.parseInt(fechaDia) < periodo_prueba_dia()) && (Integer.parseInt(fechaMes) > periodo_prueba_mes()) && Integer.parseInt(fechaAño) == periodo_prueba_ano()) {
//                                                Guardar_dia_vacio(fechaDia, fechaMes, fechaAño);
//                                                new SplashScreen().setVisible(true);
//                                            }
//                                            break;
//                                        case 2:
//                                            if (Integer.parseInt(fechaMes) == periodo_prueba_mes()) {
//                                                if ((Integer.parseInt(fechaDia) > periodo_prueba_dia()) && (Integer.parseInt(fechaMes) == periodo_prueba_mes()) && Integer.parseInt(fechaAño) == periodo_prueba_ano()) {
//                                                    Guardar_dia_vacio(fechaDia, fechaMes, fechaAño);
//                                                    new SplashScreen().setVisible(true);
//                                                }
//                                            } else {
//                                                if ((Integer.parseInt(fechaDia) < periodo_prueba_dia()) && (Integer.parseInt(fechaMes) > periodo_prueba_mes()) && Integer.parseInt(fechaAño) == periodo_prueba_ano()) {
//                                                    Guardar_dia_vacio(fechaDia, fechaMes, fechaAño);
//                                                    new SplashScreen().setVisible(true);
//                                                }
//                                            }
//                                            break;
//
//                                    }
//                                }
//                                if (Integer.parseInt(fechaAño) != periodo_prueba_ano()) {
//                                    // codigo para cuando cambia de mes y de año
//                                    if (periodo_prueba_ano() < Integer.parseInt(fechaAño)) {
//                                        Guardar_dia_vacio(fechaDia, fechaMes, fechaAño);
//                                        new SplashScreen().setVisible(true);
//                                    } else {
//                                        Correr corre=new Correr();
//                                        JOptionPane.showMessageDialog(null, "La fecha de su computador no coincide con la \nsecuencia sucesiva de la última fecha en la que se utilizó el sistema. \nPor favor corrija la fecha de su ordenador. \n\nSu última interacción con el sistema ocurrió el día "+corre.periodo_prueba_dia()+"/"+corre.periodo_prueba_mes()+"/"+corre.periodo_prueba_ano(), "Error", JOptionPane.ERROR_MESSAGE);
//                                    }
//                                }
//                            }
//                        }
//                    } else {
//                        JOptionPane.showMessageDialog(null, "No se puede acceder al sistema debido a que\nel período de prueba ha finalizado.\n\n"
//                                + "Contacte con el desarrollador:\nAlejandro Rodas Cueto\ncell: 5580-1933\nfijo:  4856-2730", "Error", JOptionPane.ERROR_MESSAGE);
//                    }
//                }
//                // ###################### fin periodo prueba  ##########################################      

            }
        });
    }
}
