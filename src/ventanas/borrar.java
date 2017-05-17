package ventanas;

import datos.valores;
import datos.metodos;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class borrar extends javax.swing.JFrame {

    private int x;
    private int y;

    public borrar() {
        initComponents();
        this.setLocationRelativeTo(null);
        metodos.conectar();

    }

    public valores setValor() {
        valores ret = null;
        String nombres = nombre.getText();
        String apellidos = apellido.getText();
        ret = new valores(nombres, apellidos);
        return ret;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        salir1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492225765_checkmark-24.png"))); // NOI18N
        jButton6.setToolTipText("Alta");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton6.setDefaultCapable(false);
        jButton6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492225765_checkmark-24greengray.png"))); // NOI18N
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492225765_checkmark-24green.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492225808_black_2_audio_simple_repeat.png"))); // NOI18N
        jButton7.setToolTipText("Alta");
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton7.setDefaultCapable(false);
        jButton7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492225808_black_2_audio_simple_repeatbluegray.png"))); // NOI18N
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492225808_black_2_audio_simple_repeatblue.png"))); // NOI18N
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel8.setText("Borrar registro");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });
        apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoKeyTyped(evt);
            }
        });
        getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 140, -1));

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreKeyPressed(evt);
            }
        });
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 130, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Apellidos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 410, 90));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Apellido:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492225765_checkmark-24.png"))); // NOI18N
        jButton9.setToolTipText("Aceptar");
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton9.setDefaultCapable(false);
        jButton9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492225765_checkmark-24greengray.png"))); // NOI18N
        jButton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492225765_checkmark-24green.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 40, -1));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492225808_black_2_audio_simple_repeat.png"))); // NOI18N
        jButton10.setToolTipText("Deshacer");
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton10.setDefaultCapable(false);
        jButton10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492225808_black_2_audio_simple_repeatbluegray.png"))); // NOI18N
        jButton10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492225808_black_2_audio_simple_repeatblue.png"))); // NOI18N
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 40, -1));

        salir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492224529_exit-to-app.png"))); // NOI18N
        salir1.setToolTipText("Salir");
        salir1.setActionCommand("Salir");
        salir1.setBorderPainted(false);
        salir1.setContentAreaFilled(false);
        salir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492224529_exit-to-appredgray.png"))); // NOI18N
        salir1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492224529_exit-to-appred.png"))); // NOI18N
        salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir1ActionPerformed(evt);
            }
        });
        getContentPane().add(salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 30, 30));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492225885_home.png"))); // NOI18N
        jButton8.setToolTipText("Volver");
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton8.setDefaultCapable(false);
        jButton8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492225885_homebgray.png"))); // NOI18N
        jButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492225885_homeblue.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 30, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpeg"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel9.setRequestFocusEnabled(false);
        jLabel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel9MouseDragged(evt);
            }
        });
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 302));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed

    }//GEN-LAST:event_nombreActionPerformed

    private void nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyPressed

    }//GEN-LAST:event_nombreKeyPressed

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped

        String busqueda = "SELECT DNI,Nombre,Apellido FROM datos WHERE nombre LIKE '%" + nombre.getText() + "%'";
        try {

            Class.forName("org.sqlite.JDBC");
            Connection conexion = DriverManager.getConnection("jdbc:sqlite:database.sqlite");
            Statement query = conexion.createStatement();
            ResultSet resul = query.executeQuery(busqueda);
            ResultSetMetaData resulM = resul.getMetaData();
            int columnas = resulM.getColumnCount();
            DefaultTableModel tabMo = new DefaultTableModel();
            this.tabla.setModel(tabMo);
            for (int i = 1; i <= columnas; i++) {
                tabMo.addColumn(resulM.getColumnLabel(i));
            }
            while (resul.next()) {
                Object[] filas = new Object[columnas];

                for (int j = 0; j < columnas; j++) {
                    filas[j] = resul.getObject(j + 1);
                }
                tabMo.addRow(filas);
            }
        } catch (ClassNotFoundException ex) {
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, sqlex);
        }
    }//GEN-LAST:event_nombreKeyTyped

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        valores add = setValor();
        metodos.alta(add);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked

    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed


    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String Nombre = nombre.getText();
        String Apellido = apellido.getText();

        Scanner sc = new Scanner(System.in);
        int numero;
        String letra;
        String letraNumero;
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E", "T"};

        JOptionPane.showMessageDialog(null, "Para borrar un registro debe identificarse");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de tu DNI:"));
        letra = JOptionPane.showInputDialog("Introduce la letra de tu DNI:");
        if (numero < 0 | numero > 99999999) {
            JOptionPane.showMessageDialog(null, "El número del DNI no son correctos", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            letraNumero = letras[numero % 23];
            if (!letraNumero.equalsIgnoreCase(letra)) {
                JOptionPane.showMessageDialog(null, "El DNI introducido no son correctos", "Error", JOptionPane.WARNING_MESSAGE);

            } else {
                if (nombre.getText().equals("") || apellido.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Escriba nombre y apellido completo con la primera letra en mayúscula, del registro a elininar", "Error", JOptionPane.WARNING_MESSAGE);

                } else {
                    int respuesta = JOptionPane.showConfirmDialog(null, "¿Seguro desea eliminar a " + Nombre + " " + Apellido + "?");
                    if (respuesta == JOptionPane.YES_OPTION) {

                        metodos.eliminar(Nombre, Apellido);
                    }

                }
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        nombre.setText("");
        apellido.setText("");
        tabla.setModel(new DefaultTableModel());
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        x = evt.getX();
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel9MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
    }//GEN-LAST:event_jLabel9MouseDragged

    private void salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salir1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (principal == null) {
            principal = new Principal();
        }
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoKeyTyped
        String busqueda = "SELECT DNI,Nombre,Apellido FROM datos WHERE apellido LIKE '%" + apellido.getText() + "%'";
        try {

            Class.forName("org.sqlite.JDBC");
            Connection conexion = DriverManager.getConnection("jdbc:sqlite:database.sqlite");
            Statement sta = conexion.createStatement();
            ResultSet res = sta.executeQuery(busqueda);
            ResultSetMetaData resmeta = res.getMetaData();
            int columnas = resmeta.getColumnCount();
            DefaultTableModel tamo = new DefaultTableModel();
            this.tabla.setModel(tamo);
            for (int i = 1; i <= columnas; i++) {
                tamo.addColumn(resmeta.getColumnLabel(i));
            }
            while (res.next()) {
                Object[] filas = new Object[columnas];

                for (int j = 0; j < columnas; j++) {
                    filas[j] = res.getObject(j + 1);
                }

                tamo.addRow(filas);
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException sq) {
            JOptionPane.showMessageDialog(null, sq);
        }
    }//GEN-LAST:event_apellidoKeyTyped

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("icon.png"));

        return retValue;
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
            java.util.logging.Logger.getLogger(borrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(borrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(borrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(borrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new borrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton salir1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
    private Principal principal;
}
