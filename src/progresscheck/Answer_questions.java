/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progresscheck;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Prerna
 */
public class Answer_questions extends javax.swing.JFrame {
    int count=15;
    int error[]={1,1,1,1,1,1,1,1,1,1,1,1};
    int limit=27;
    int score=0,index=0;
   // int progress[]={0,0,0,0};//basic,medium,advanaced,challenge
   // int weightage[]={3*4,4*4,3*4,1*4};
     String query,question1,answer1="a",option1="a",option2="b",option3="c",option4="d",level1,topic1,subject1,user;
    /**
     * Creates new form Answer_questions
     */
     void username_get(String user1)
     {
         //JOptionPane.showMessageDialog(null, "Are you ready?"+user1);
         user=user1;
         //System.out.println(user+"lol");
         username.setText("Welcome: "+user);
         
     }
    public Answer_questions() {
        initComponents();
        setLocationRelativeTo(null);
       
    }
    void calculate(int error[])
    {
        int i,basic1=0,medium1=0,advanced1=0,basic2=0,medium2=0,advanced2=0;
        for(i=0;i<2;i++)
            if(error[i]==0)
                basic1++;
        for(i=2;i<4;i++)
            if(error[i]==0)
                medium1++;
        for(i=4;i<6;i++)
            if(error[i]==0)
               advanced1++;
        for(i=6;i<8;i++)
            if(error[i]==0)
                basic2++;
        for(i=8;i<10;i++)
            if(error[i]==0)
                medium2++;
        for(i=10;i<12;i++)
            if(error[i]==0)
               advanced2++;
       // JOptionPane.showMessageDialog(null, "hello "+basic1+medium1+advanced1+basic2+medium2+advanced2);
         try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/exams","root","");
                 query="insert into `result_for_oop`(`username`,`basic1`,`medium1`,`advanced1`,`basic2`,`medium2`,`advanced2`,`total`) values(?,?,?,?,?,?,?,?)";
                java.sql.PreparedStatement insert=con.prepareStatement(query);
                insert.setString(1,user);
                insert.setInt(2,basic1);
                insert.setInt(3, medium1);
                insert.setInt(4,advanced1);
                insert.setInt(5,basic2);
                insert.setInt(6, medium2);
                insert.setInt(7,advanced2);
                insert.setInt(8,score);
                if ( insert.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Evaluation done");
                   this.setVisible(false);
                      //new MCQ_questions().setVisible(true);
                  }
                /*if ( insert.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "New Question Added");
                   this.setVisible(false);
                      new MCQ_questions().setVisible(true);
                  }*/
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
            }
          Report form=new Report();
          
          form.username_get1(user);
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        question = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setPreferredSize(new java.awt.Dimension(558, 460));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        question.setBackground(new java.awt.Color(0, 0, 0));
        question.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        question.setForeground(new java.awt.Color(204, 255, 0));
        question.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        question.setText("Answer is a");
        question.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 0)));
        jPanel2.add(question, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 490, 50));

        username.setBackground(new java.awt.Color(0, 0, 0));
        username.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        username.setForeground(new java.awt.Color(255, 0, 204));
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username.setText("hello");
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 204)));
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 540, 40));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButton4.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(204, 255, 0));
        jRadioButton4.setText("option4");
        jPanel3.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 380, -1));

        jRadioButton1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(204, 255, 0));
        jRadioButton1.setText("option1");
        jPanel3.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 340, -1));

        jRadioButton2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(204, 255, 0));
        jRadioButton2.setText("option2");
        jPanel3.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 330, -1));

        jRadioButton3.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(204, 255, 0));
        jRadioButton3.setText("option3");
        jPanel3.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 340, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 330, 170));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255))));
        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 530, 270));

        jButton2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 204, 255));
        jButton2.setText("SUBMIT");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 390, 560, -1));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 560, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents
     

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/exams","root","");
                Statement st=(Statement) con.createStatement();
                if(count==15){
                query="select * from `questions`";
                 ResultSet rs=st.executeQuery(query);
                count++;
                }
                else{
                    
                count++;
                 if(jRadioButton1.isSelected() && option1.equals(answer1))
                    {
                        error[index]=0;
                        score+=4;
                        
                        //JOptionPane.showMessageDialog(null, "+4 "+answer1+" index="+index);
                    }
                    else if(jRadioButton2.isSelected() && option2.equals(answer1))
                    {
                        error[index]=0;
                        score+=4;
                        // JOptionPane.showMessageDialog(null, "+4 "+answer1+" index="+index);
                    }
                    else if(jRadioButton3.isSelected() && option3.equals(answer1))
                    {
                        error[index]=0;
                        score+=4;
                       //  JOptionPane.showMessageDialog(null, "+4 "+answer1+" index="+index);
                    }
                    else if(jRadioButton4.isSelected() && option4.equals(answer1))
                    {
                        error[index]=0;
                        score+=4;
                       //  JOptionPane.showMessageDialog(null, "+4 "+answer1+" index="+index);
                    }
                    else 
                    {
                        error[index]=1;
                        score-=1;
                         //JOptionPane.showMessageDialog(null, "-1"+answer1+" index="+index);
                    }
                if(count>limit)
                {
                    JOptionPane.showMessageDialog(null, "Paper Submitted! ");
                Student_homepage form = new Student_homepage();
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
                // close the current form(login form)
                this.dispose();
                }
                 // JOptionPane.showMessageDialog(null, "hello "+count);
                //JOptionPane.showMessageDialog(null,"");
                index++;
                query="select * from `questions`";
               // JOptionPane.showMessageDialog(null,query);
                
                ResultSet rs=st.executeQuery(query);
               
                while(rs.next())
                {
                    
                    int id1=rs.getInt("id");
                    if(id1==count){
                    question1=rs.getString("question_name");
                   // JOptionPane.showMessageDialog(null,question1);
                    option1=rs.getString("option1");
                    option2=rs.getString("option2");
                    option3=rs.getString("option3");
                    option4=rs.getString("option4");
                    answer1=rs.getString("answer");
                    subject1=rs.getString("subject");
                    level1=rs.getString("level");
                    topic1=rs.getString("topic");
                   
                    question.setText("");
                    question.setText(question1);
                    jRadioButton1.setText(option1);
                    jRadioButton2.setText(option2);
                    jRadioButton3.setText(option3);
                    jRadioButton4.setText(option4);
                    
                    }
                    
                }
                }
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
            }
          if(index==12)
          { calculate(error);
         
                // close the current form(login form)
                //this.dispose(); 
          }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Answer_questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Answer_questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Answer_questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Answer_questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Answer_questions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JLabel question;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}