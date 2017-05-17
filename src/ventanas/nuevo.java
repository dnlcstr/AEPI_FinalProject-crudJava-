package ventanas;

import datos.valores;
import datos.metodos;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;

public class nuevo extends javax.swing.JFrame {

    private int x;
    private int y;

    public nuevo() {
        initComponents();
        this.setLocationRelativeTo(null);
        metodos.conectar();

    }

    public valores setValor() {
        valores nuevo = null;
        String dnis = dniText.getText();
        String nombres = nombreText.getText();
        String apellidos = apeText.getText();
        String direccions = dirText.getText();
        String telefonos = telfText.getText();
        nuevo = new valores(dnis, nombres, apellidos, direccions, telefonos);
        return nuevo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dniText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombreText = new javax.swing.JTextField();
        apeText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dirText = new javax.swing.JTextField();
        telfText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        salir1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel8.setText("Nuevo usuario");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("      DNI:");
        jLabel2.setRequestFocusEnabled(false);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        dniText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        dniText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniTextActionPerformed(evt);
            }
        });
        getContentPane().add(dniText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 140, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        nombreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextActionPerformed(evt);
            }
        });
        getContentPane().add(nombreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 140, -1));

        apeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apeTextActionPerformed(evt);
            }
        });
        getContentPane().add(apeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 140, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Apellido:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Dirección:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        dirText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dirTextActionPerformed(evt);
            }
        });
        getContentPane().add(dirText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 140, -1));

        telfText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telfTextActionPerformed(evt);
            }
        });
        getContentPane().add(telfText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 140, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(" Teléfono:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

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

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492225808_black_2_audio_simple_repeat.png"))); // NOI18N
        jButton7.setToolTipText("Deshacer");
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
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 40, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492225765_checkmark-24.png"))); // NOI18N
        jButton6.setToolTipText("Aceptar");
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
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 40, -1));

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

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpeg"))); // NOI18N
        jLabel9.setText("jLabel2");
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

    private void dniTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniTextActionPerformed

    private void nombreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextActionPerformed

    private void apeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apeTextActionPerformed

    private void dirTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dirTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dirTextActionPerformed

    private void telfTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telfTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telfTextActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (principal == null) {
            principal = new Principal();
        }
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dniText.setText("");
        nombreText.setText("");
        apeText.setText("");
        dirText.setText("");
        telfText.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String dnis = dniText.getText();
        String nombres = nombreText.getText();
        String apellidos = apeText.getText();
        String direccions = dirText.getText();
        String telefonos = telfText.getText();
        if (dniText.getText().equals("") || nombreText.getText().equals("") || apeText.getText().equals("") || dirText.getText().equals("") || telfText.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Se deben rellenar todos los campos para crear un nuevo registro.", "Error", JOptionPane.WARNING_MESSAGE);

        } else {

            valores add = setValor();
            metodos.alta(add);
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked

    }//GEN-LAST:event_jButton7MouseClicked

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        x = evt.getX();
        y = evt.getY();    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel9MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);    }//GEN-LAST:event_jLabel9MouseDragged

    private void salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salir1ActionPerformed
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
            java.util.logging.Logger.getLogger(nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nuevo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apeText;
    private javax.swing.JTextField dirText;
    private javax.swing.JTextField dniText;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombreText;
    private javax.swing.JButton salir1;
    private javax.swing.JTextField telfText;
    // End of variables declaration//GEN-END:variables
    private Principal principal;
}
