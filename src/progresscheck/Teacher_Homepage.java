/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progresscheck;

/**
 *
 * @author Prerna
 */
public class Teacher_Homepage extends javax.swing.JFrame {

    /**
     * Creates new form Teacher_Homepage
     */
    public Teacher_Homepage() {
        initComponents();
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
        jPanel3 = new javax.swing.JPanel();
        scores = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        home = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        set_assignment = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        written_assignment = new javax.swing.JButton();
        mcq = new javax.swing.JButton();
        project = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        scores.setBackground(new java.awt.Color(0, 102, 102));
        scores.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        scores.setForeground(new java.awt.Color(255, 255, 255));
        scores.setText("SCORES");
        scores.setBorderPainted(false);
        scores.setContentAreaFilled(false);
        scores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(scores, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(scores, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 240, 170));

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));

        home.setBackground(new java.awt.Color(0, 51, 51));
        home.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("HOME");
        home.setBorderPainted(false);
        home.setContentAreaFilled(false);
        home.setOpaque(false);
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 170));

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));

        set_assignment.setBackground(new java.awt.Color(0, 51, 51));
        set_assignment.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        set_assignment.setForeground(new java.awt.Color(255, 255, 255));
        set_assignment.setText("SET ASSIGNMENT");
        set_assignment.setBorderPainted(false);
        set_assignment.setContentAreaFilled(false);
        set_assignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set_assignmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(set_assignment, javax.swing.GroupLayout.PREFERRED_SIZE, 240, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(set_assignment, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 240, 170));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 510));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Choose assignment type");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 280, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SET ASSIGNMENT...");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 280, 50));

        written_assignment.setBackground(new java.awt.Color(0, 153, 153));
        written_assignment.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        written_assignment.setForeground(new java.awt.Color(255, 255, 255));
        written_assignment.setText("3) Written assignment");
        written_assignment.setBorderPainted(false);
        written_assignment.setContentAreaFilled(false);
        jPanel1.add(written_assignment, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        mcq.setBackground(new java.awt.Color(0, 153, 153));
        mcq.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mcq.setForeground(new java.awt.Color(255, 255, 255));
        mcq.setText("1) MCQ");
        mcq.setBorderPainted(false);
        mcq.setContentAreaFilled(false);
        mcq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcqActionPerformed(evt);
            }
        });
        jPanel1.add(mcq, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        project.setBackground(new java.awt.Color(0, 153, 153));
        project.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        project.setForeground(new java.awt.Color(255, 255, 255));
        project.setText("2) Project");
        project.setBorderPainted(false);
        project.setContentAreaFilled(false);
        jPanel1.add(project, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scoresActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeActionPerformed

    private void set_assignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set_assignmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_set_assignmentActionPerformed

    private void mcqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcqActionPerformed
        // TODO add your handling code here:
        
        
        MCQ_questions form = new MCQ_questions();
               
                form.setVisible(true);
                form.setLocationRelativeTo(null);
                this.setVisible(false);
    }//GEN-LAST:event_mcqActionPerformed

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
            java.util.logging.Logger.getLogger(Teacher_Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacher_Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacher_Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacher_Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacher_Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton mcq;
    private javax.swing.JButton project;
    private javax.swing.JButton scores;
    private javax.swing.JButton set_assignment;
    private javax.swing.JButton written_assignment;
    // End of variables declaration//GEN-END:variables
}