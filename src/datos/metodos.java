package datos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class metodos {

    static Statement sqlsta;
    static Connection conectar = null;
    static ResultSet resultado;

    public static void conectar() {
        String bbdd = "jdbc:sqlite:database.sqlite";
        try {
            Class.forName("org.sqlite.JDBC");
            conectar = DriverManager.getConnection(bbdd);
            sqlsta = conectar.createStatement();

            try {
                FileWriter fw = new FileWriter("log.txt");

            } catch (Exception ex) {
            }

        } catch (Exception e) {
            System.out.println("NO");
        }
    }

    public static void alta(valores add) {
        String queryAlta = "INSERT INTO datos VALUES('" + add.getDNI() + "','" + add.getNombre() + "','" + add.getApellido()
                + "','" + add.getDireccion() + "','" + add.getTelefono() + "');";
        ejecutar(queryAlta);
        logEscribir((fecha() + " >> Creado un nuevo registro en la base de datos.\n"));

    }

    public static void eliminar(String Nombre, String Apellido) {
        String queryBaja = "DELETE FROM datos WHERE Nombre='" + Nombre + "' AND Apellido = '" + Apellido + "'";
        ejecutar(queryBaja);
        logEscribir((fecha() + " >> Eliminado un  registro de la base de datos.\n"));
    }

    public static void editar(String Direccion, String Telefono, String DNI) {
        String queryEditar = "UPDATE datos SET Direccion='" + Direccion + "'," + "Telefono='" + Telefono + "' " + "WHERE DNI='" + DNI + "'";
        ejecutar(queryEditar);
        logEscribir((fecha() + " >> Editado un registro de la base de datos.\n"));
    }

    public static void ejecutar(String datos) {
        try {
            sqlsta.executeUpdate(datos);
            JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al realizar la operación", "Error", JOptionPane.WARNING_MESSAGE);

        }
    }

    public static boolean logEscribir(String escribe) {
        BufferedWriter fichero = null;
        try {
            fichero = new BufferedWriter(new FileWriter("log.txt", true));
            fichero.write(escribe);
            fichero.newLine();
            fichero.close();
            return true;
        } catch (IOException ex) {
            System.out.println("Error al guardar");
        } finally {
            try {
                fichero.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar");
            }
        }
        return false;
    }

    public static String fecha() {

        Calendar fecha = new GregorianCalendar();
        int anyo = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        int segundo = fecha.get(Calendar.SECOND);

        String fechaT = dia + "/" + (mes + 1) + "/" + anyo + " - " + hora + ":" + minuto + ":" + segundo + ".\n";
        return fechaT;
    }

}
