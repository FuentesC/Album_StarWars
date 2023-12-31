package vista;

import java.awt.Color;
import javax.swing.JOptionPane;


public class Postales extends javax.swing.JFrame {

    int xMouse, yMouse;

    public Postales() {
        initComponents();
        lblIdUsuario.setText(Principal.lblId.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnAbrirPostal1 = new javax.swing.JButton();
        btnAbrirPostal2 = new javax.swing.JButton();
        btnAbrirPostal3 = new javax.swing.JButton();
        lblPostal3 = new javax.swing.JLabel();
        lblPostal2 = new javax.swing.JLabel();
        lblPostal1 = new javax.swing.JLabel();
        head = new javax.swing.JPanel();
        lblIdUsuario = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        lblIdPostal1 = new javax.swing.JLabel();
        lblIdPostal2 = new javax.swing.JLabel();
        lblIdPostal3 = new javax.swing.JLabel();
        lblPath1 = new javax.swing.JLabel();
        lblPath2 = new javax.swing.JLabel();
        lblPath3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(0, 0, 0));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 51));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("OBTENER POSTALES");
        bg.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, 40));

        btnAbrirPostal1.setBackground(new java.awt.Color(0, 0, 0));
        btnAbrirPostal1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAbrirPostal1.setForeground(new java.awt.Color(255, 255, 0));
        btnAbrirPostal1.setText("ABRIR POSTAL");
        btnAbrirPostal1.setBorder(null);
        btnAbrirPostal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirPostal1ActionPerformed(evt);
            }
        });
        bg.add(btnAbrirPostal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 120, 30));

        btnAbrirPostal2.setBackground(new java.awt.Color(0, 0, 0));
        btnAbrirPostal2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAbrirPostal2.setForeground(new java.awt.Color(255, 255, 0));
        btnAbrirPostal2.setText("ABRIR POSTAL");
        btnAbrirPostal2.setBorder(null);
        btnAbrirPostal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirPostal2ActionPerformed(evt);
            }
        });
        bg.add(btnAbrirPostal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 120, 30));

        btnAbrirPostal3.setBackground(new java.awt.Color(0, 0, 0));
        btnAbrirPostal3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAbrirPostal3.setForeground(new java.awt.Color(255, 255, 0));
        btnAbrirPostal3.setText("ABRIR POSTAL");
        btnAbrirPostal3.setBorder(null);
        btnAbrirPostal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirPostal3ActionPerformed(evt);
            }
        });
        bg.add(btnAbrirPostal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 480, 120, 30));

        lblPostal3.setBackground(new java.awt.Color(0, 0, 0));
        lblPostal3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPostal3.setForeground(new java.awt.Color(255, 255, 0));
        lblPostal3.setText("                             POSTAL 3");
        lblPostal3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        bg.add(lblPostal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 290, 395));

        lblPostal2.setBackground(new java.awt.Color(0, 0, 0));
        lblPostal2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPostal2.setForeground(new java.awt.Color(255, 255, 0));
        lblPostal2.setText("                            POSTAL 2");
        lblPostal2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        bg.add(lblPostal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 290, 395));

        lblPostal1.setBackground(new java.awt.Color(0, 0, 0));
        lblPostal1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPostal1.setForeground(new java.awt.Color(255, 255, 0));
        lblPostal1.setText("                           POSTAL 1                 ");
        lblPostal1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        bg.add(lblPostal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 290, 395));

        head.setBackground(new java.awt.Color(0, 0, 0));
        head.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headMouseDragged(evt);
            }
        });
        head.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headMousePressed(evt);
            }
        });

        javax.swing.GroupLayout headLayout = new javax.swing.GroupLayout(head);
        head.setLayout(headLayout);
        headLayout.setHorizontalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        headLayout.setVerticalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        bg.add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 30));

        lblIdUsuario.setBackground(new java.awt.Color(0, 0, 0));
        lblIdUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIdUsuario.setText(".");
        bg.add(lblIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 40, -1));

        lblId.setBackground(new java.awt.Color(0, 0, 0));
        lblId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblId.setText("Mi id:");
        bg.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 0, 0));
        btnSalir.setText("   X");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        bg.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 34, 30));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 0));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(null);
        bg.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 570, 170, 40));

        lblIdPostal1.setBackground(new java.awt.Color(0, 0, 0));
        lblIdPostal1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIdPostal1.setForeground(new java.awt.Color(255, 255, 0));
        bg.add(lblIdPostal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 30, 30));

        lblIdPostal2.setBackground(new java.awt.Color(0, 0, 0));
        lblIdPostal2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIdPostal2.setForeground(new java.awt.Color(255, 255, 0));
        bg.add(lblIdPostal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, 30, 30));

        lblIdPostal3.setBackground(new java.awt.Color(0, 0, 0));
        lblIdPostal3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIdPostal3.setForeground(new java.awt.Color(255, 255, 0));
        bg.add(lblIdPostal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 470, 30, 30));

        lblPath1.setBackground(new java.awt.Color(0, 0, 0));
        lblPath1.setText(".");
        bg.add(lblPath1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 200, -1));

        lblPath2.setBackground(new java.awt.Color(0, 0, 0));
        lblPath2.setText(".");
        bg.add(lblPath2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, 220, -1));

        lblPath3.setBackground(new java.awt.Color(0, 0, 0));
        lblPath3.setText(".");
        bg.add(lblPath3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 540, 260, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 1032, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headMouseDragged

    private void headMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headMousePressed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.dispose();
        Principal p = new Principal(Integer.parseInt(lblIdUsuario.getText()));
        p.setVisible(true);
        p.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setForeground(Color.yellow);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setForeground(Color.red);
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnAbrirPostal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirPostal2ActionPerformed
        btnAbrirPostal2.setVisible(false);
    }//GEN-LAST:event_btnAbrirPostal2ActionPerformed

    private void btnAbrirPostal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirPostal1ActionPerformed
        btnAbrirPostal1.setVisible(false);
    }//GEN-LAST:event_btnAbrirPostal1ActionPerformed

    private void btnAbrirPostal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirPostal3ActionPerformed
        btnAbrirPostal3.setVisible(false);
    }//GEN-LAST:event_btnAbrirPostal3ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Postales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Postales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Postales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Postales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Postales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    public javax.swing.JButton btnAbrirPostal1;
    public javax.swing.JButton btnAbrirPostal2;
    public javax.swing.JButton btnAbrirPostal3;
    public javax.swing.JButton btnGuardar;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JPanel head;
    private javax.swing.JLabel lblId;
    public javax.swing.JLabel lblIdPostal1;
    public javax.swing.JLabel lblIdPostal2;
    public javax.swing.JLabel lblIdPostal3;
    public javax.swing.JLabel lblIdUsuario;
    public javax.swing.JLabel lblPath1;
    public javax.swing.JLabel lblPath2;
    public javax.swing.JLabel lblPath3;
    public javax.swing.JLabel lblPostal1;
    public javax.swing.JLabel lblPostal2;
    public javax.swing.JLabel lblPostal3;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
