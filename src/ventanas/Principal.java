package ventanas;

import java.awt.Desktop;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Principal extends javax.swing.JFrame {

 
    private int x;
    private int y;

    public Principal() {
        initComponents();
       this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nuevoRegistro = new javax.swing.JButton();
        borrarRegistro = new javax.swing.JButton();
        editarRegistro = new javax.swing.JButton();
        buscarRegistro = new javax.swing.JButton();
        verLog = new javax.swing.JButton();
        salir1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("menu");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nuevoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492222516_group_full_add.png"))); // NOI18N
        nuevoRegistro.setToolTipText("Alta");
        nuevoRegistro.setBorderPainted(false);
        nuevoRegistro.setContentAreaFilled(false);
        nuevoRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevoRegistro.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        nuevoRegistro.setDefaultCapable(false);
        nuevoRegistro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492222516_group_full_addbluegray.png"))); // NOI18N
        nuevoRegistro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492222516_group_full_addblue.png"))); // NOI18N
        nuevoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(nuevoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 50, -1));

        borrarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492222583_group_full_remove.png"))); // NOI18N
        borrarRegistro.setToolTipText("Baja");
        borrarRegistro.setBorderPainted(false);
        borrarRegistro.setContentAreaFilled(false);
        borrarRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrarRegistro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492222583_group_full_removebluegray.png"))); // NOI18N
        borrarRegistro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492222583_group_full_removeblue.png"))); // NOI18N
        borrarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(borrarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 50, -1));

        editarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492222577_group_full_edit.png"))); // NOI18N
        editarRegistro.setToolTipText("Editar");
        editarRegistro.setBorderPainted(false);
        editarRegistro.setContentAreaFilled(false);
        editarRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarRegistro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492222577_group_full_editgray.png"))); // NOI18N
        editarRegistro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492222577_group_full_editblue.png"))); // NOI18N
        editarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(editarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 50, -1));

        buscarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492222624_BT_search.png"))); // NOI18N
        buscarRegistro.setToolTipText("Buscar");
        buscarRegistro.setBorderPainted(false);
        buscarRegistro.setContentAreaFilled(false);
        buscarRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarRegistro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492222624_BT_searchbluegray.png"))); // NOI18N
        buscarRegistro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492222624_BT_searchblue.png"))); // NOI18N
        buscarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(buscarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 50, 50));

        verLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492223157_list.png"))); // NOI18N
        verLog.setToolTipText("Mostrar Log");
        verLog.setBorderPainted(false);
        verLog.setContentAreaFilled(false);
        verLog.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verLog.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492223157_listyell.png"))); // NOI18N
        verLog.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1492223157_listyell.png"))); // NOI18N
        verLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verLogActionPerformed(evt);
            }
        });
        getContentPane().add(verLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 30, 30));

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

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel8.setText("Base de datos");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 302));

        getAccessibleContext().setAccessibleName("Piscina");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarRegistroActionPerformed
        if (buscar == null) {
            buscar = new buscar();
        }
        buscar.setVisible(true);
        this.dispose();

        buscar.setVisible(true);    }//GEN-LAST:event_buscarRegistroActionPerformed

    private void verLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verLogActionPerformed
        if (log == null) {
            log = new log();
        }
        log.setVisible(true);
        this.dispose();    }//GEN-LAST:event_verLogActionPerformed

    private void borrarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarRegistroActionPerformed
        if (borrar == null) {
            borrar = new borrar();
        }
        borrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_borrarRegistroActionPerformed

    private void nuevoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoRegistroActionPerformed
        if (nuevo == null) {
            nuevo = new nuevo();
        }
        nuevo.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_nuevoRegistroActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged

        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
     }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x = evt.getX();
        y = evt.getY();    }//GEN-LAST:event_formMousePressed

    private void salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salir1ActionPerformed

    private void editarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarRegistroActionPerformed
        if (editar == null) {
            editar = new editar();
        }
        editar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editarRegistroActionPerformed

    /**
     * @param args the command line arguments
     */
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrarRegistro;
    private javax.swing.JButton buscarRegistro;
    private javax.swing.JButton editarRegistro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton nuevoRegistro;
    private javax.swing.JButton salir1;
    private javax.swing.JButton verLog;
    // End of variables declaration//GEN-END:variables
    private nuevo nuevo;
    private borrar borrar;
    private editar editar;
    private buscar buscar;
    private log log;
    private Principal principal;



}
