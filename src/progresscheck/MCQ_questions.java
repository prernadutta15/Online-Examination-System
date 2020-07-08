/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progresscheck;

import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JComboBox;

/**
 *
 * @author Prerna
 */
public class MCQ_questions extends javax.swing.JFrame {

    /**
     * Creates new form MCQ_questions
     */
    public MCQ_questions() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        level = new javax.swing.JComboBox<String>();
        number_of_questions = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        passing_marks = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        submission_date = new com.toedter.calendar.JCalendar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(230, 210, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Full marks:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 200, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 204));
        jLabel2.setText("Set Questions for MCQ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 320, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 204));
        jLabel3.setText("Answer the following");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 320, -1));

        level.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        level.setForeground(new java.awt.Color(0, 153, 204));
        level.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(level, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 210, -1));

        number_of_questions.setColumns(20);
        number_of_questions.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        number_of_questions.setForeground(new java.awt.Color(0, 153, 204));
        jPanel1.add(number_of_questions, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 210, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Passing marks:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 200, -1));

        passing_marks.setColumns(20);
        passing_marks.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        passing_marks.setForeground(new java.awt.Color(0, 153, 204));
        jPanel1.add(passing_marks, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 210, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Submission Date:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 200, -1));

        jButton1.setBackground(new java.awt.Color(230, 210, 250));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 255));
        jButton1.setText("Set Questions");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 204)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 690, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Level of questions");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 200, -1));
        jPanel1.add(submission_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           String date=submission_date.getCalendar().getTime().toString();
        String[] level_setup = new String[] {"Easy","Medium","Hard","Expert"};
 
		JComboBox<String> levelList = new JComboBox<>(level_setup);
 
// add to the parent container (e.g. a JFrame):
add(levelList);
 
// get the selected item:
String selectedLevel = (String) levelList.getSelectedItem();
         String number_of_questions1 = number_of_questions.getText();
        String level1 = selectedLevel;
        String passing_marks1 =passing_marks.getText();
        String submission_date1 = date;
        

        if (number_of_questions1.equals("")) {
            JOptionPane.showMessageDialog(null, "Field cannot be empty");
        } else if (level1.equals("")) {
            JOptionPane.showMessageDialog(null, "Field cannot be empty");
        }
        else if (passing_marks1.equals("")) {
            JOptionPane.showMessageDialog(null, "Field cannot be empty");
        }
        else if (submission_date1.equals("")) {
            JOptionPane.showMessageDialog(null, "Field cannot be empty");
        }
        else {

            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/exams","root","");
                String query="insert into `mcq`(`no_of_questions`,`level_of_questions`,`passing_marks`,`submission_date`) values(?,?,?,?)";
                PreparedStatement insert=con.prepareStatement(query);
                insert.setString(1,number_of_questions1);
               // ResultSet rs=insert.executeQuery();
                 insert.setString(2,level1);
                insert.setString(3,passing_marks1);
                insert.setString(4, submission_date1);
               
                if ( insert.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Assignment details added!");
                    new question().setVisible(true);
                    this.setVisible(false);
                }
            }
            catch(HeadlessException | ClassNotFoundException | SQLException e){
                    JOptionPane.showMessageDialog(null, e);
            }
           
        }
        new question().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MCQ_questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MCQ_questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MCQ_questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MCQ_questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MCQ_questions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> level;
    private javax.swing.JTextField number_of_questions;
    private javax.swing.JTextField passing_marks;
    private com.toedter.calendar.JCalendar submission_date;
    // End of variables declaration//GEN-END:variables
}
