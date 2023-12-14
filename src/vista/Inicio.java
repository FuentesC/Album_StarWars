package vista;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Inicio extends javax.swing.JFrame {
    
    //Medidas de pantalla 1280 width, 760 height;
    public Inicio() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        ImageIcon ima = new ImageIcon("src/Images/fondo.jpeg");
        Icon icono = new ImageIcon(ima.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), 
                java.awt.Image.SCALE_SMOOTH));
        fondo.setIcon(icono);
        btnEntrar.setVisible(true);
        btnEntrar2.setVisible(false);
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
        btnEntrar = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        btnEntrar2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEntrar.setBackground(new java.awt.Color(0, 0, 0));
        btnEntrar.setFont(new java.awt.Font("Impact", 1, 48)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("               STAR  WARS");
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEntrarMouseExited(evt);
            }
        });
        bg.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 470, 120));

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("           X");
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
        bg.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 0, 70, 40));

        btnEntrar2.setBackground(new java.awt.Color(0, 0, 0));
        btnEntrar2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEntrar2.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar2.setText("Volver a ingresar");
        btnEntrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntrar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEntrar2MouseExited(evt);
            }
        });
        bg.add(btnEntrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        fondo.setText("jLabel1");
        bg.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 760));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked
        Login log =  new Login();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        btnEntrar.setVisible(false);
        btnEntrar2.setVisible(true);
    }//GEN-LAST:event_btnEntrarMouseClicked

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setForeground(Color.red);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setForeground(Color.white);
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseEntered
        btnEntrar.setForeground(Color.yellow);
    }//GEN-LAST:event_btnEntrarMouseEntered

    private void btnEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseExited
        btnEntrar.setForeground(Color.white);
    }//GEN-LAST:event_btnEntrarMouseExited

    private void btnEntrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrar2MouseClicked
        btnEntrar.setVisible(true);
        btnEntrar2.setVisible(false);
    }//GEN-LAST:event_btnEntrar2MouseClicked

    private void btnEntrar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrar2MouseEntered
        btnEntrar2.setForeground(Color.yellow);
    }//GEN-LAST:event_btnEntrar2MouseEntered

    private void btnEntrar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrar2MouseExited
        btnEntrar2.setForeground(Color.white);
    }//GEN-LAST:event_btnEntrar2MouseExited

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    public javax.swing.JLabel btnEntrar;
    public javax.swing.JLabel btnEntrar2;
    public javax.swing.JLabel btnSalir;
    public javax.swing.JLabel fondo;
    // End of variables declaration//GEN-END:variables
}