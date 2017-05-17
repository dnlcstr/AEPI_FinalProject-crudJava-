package ventanas;

import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import datos.metodos;

public class editar extends javax.swing.JFrame {

    private int x;
    private int y;

    public editar() {
        initComponents();
        this.setLocationRelativeTo(null);
        metodos.conectar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        telfEdit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dirEdit = new javax.swing.JTextField();
        salir1 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        DNI = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backback.jpg"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logologologo.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backback.jpg"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logologologo.png"))); // NOI18N

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492225765_checkmark-24.png"))); // NOI18N
        jButton6.setToolTipText("Alta");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton6.setDefaultCapable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492225808_black_2_audio_simple_repeat.png"))); // NOI18N
        jButton7.setToolTipText("Alta");
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton7.setDefaultCapable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492225765_checkmark-24.png"))); // NOI18N
        jButton8.setToolTipText("Aceptar");
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton8.setDefaultCapable(false);
        jButton8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492225765_checkmark-24greengray.png"))); // NOI18N
        jButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492225765_checkmark-24green.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 40, -1));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492225808_black_2_audio_simple_repeat.png"))); // NOI18N
        jButton9.setToolTipText("Deshacer");
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton9.setDefaultCapable(false);
        jButton9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492225808_black_2_audio_simple_repeatbluegray.png"))); // NOI18N
        jButton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492225808_black_2_audio_simple_repeatblue.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 40, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setText("Datos a modificar:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Dirección:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        telfEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telfEditActionPerformed(evt);
            }
        });
        getContentPane().add(telfEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 120, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(" Teléfono:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        dirEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        dirEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dirEditActionPerformed(evt);
            }
        });
        getContentPane().add(dirEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 120, -1));

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

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492225885_home.png"))); // NOI18N
        jButton11.setToolTipText("Volver");
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton11.setDefaultCapable(false);
        jButton11.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492225885_homebgray.png"))); // NOI18N
        jButton11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492225885_homeblue.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 30, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 410, 50));

        DNI.setToolTipText("Introduzca el DNI completo");
        DNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNIActionPerformed(evt);
            }
        });
        DNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DNIKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DNIKeyTyped(evt);
            }
        });
        getContentPane().add(DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 140, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DNI:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Editar registro");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpeg"))); // NOI18N
        jLabel11.setText("jLabel2");
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel11.setRequestFocusEnabled(false);
        jLabel11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel11MouseDragged(evt);
            }
        });
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 302));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        String Direccion = dirEdit.getText();
        String Telefono = telfEdit.getText();
        if (dirEdit.getText().equals("") || telfEdit.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Se deben rellenar todos los campos.", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            metodos.editar(Direccion, Telefono, DNI.getText());
        }
     }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        dirEdit.setText("");
        telfEdit.setText("");
        DNI.setText("");
        tabla.setModel(new DefaultTableModel());

    }//GEN-LAST:event_jButton9ActionPerformed

    private void telfEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telfEditActionPerformed

    }//GEN-LAST:event_telfEditActionPerformed

    private void jLabel11MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);    }//GEN-LAST:event_jLabel11MouseDragged

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        x = evt.getX();
        y = evt.getY();    }//GEN-LAST:event_jLabel11MousePressed

    private void salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salir1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if (principal == null) {
            principal = new Principal();
        }
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void dirEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dirEditActionPerformed
    }//GEN-LAST:event_dirEditActionPerformed

    private void DNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNIActionPerformed

    }//GEN-LAST:event_DNIActionPerformed

    private void DNIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DNIKeyPressed

    }//GEN-LAST:event_DNIKeyPressed

    private void DNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DNIKeyTyped

        String busqueda = "SELECT *FROM datos WHERE DNI = '" + DNI.getText() + "'";
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
    }//GEN-LAST:event_DNIKeyTyped

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
            java.util.logging.Logger.getLogger(editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DNI;
    private javax.swing.JTextField dirEdit;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton salir1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField telfEdit;
    // End of variables declaration//GEN-END:variables
    private Principal principal;
}
