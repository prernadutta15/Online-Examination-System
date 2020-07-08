/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progresscheck;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Prerna
 */
public class Report extends javax.swing.JFrame {
    String query,username,str;
    String user;
    int basic1,medium1,advanced1,basic2,medium2,advanced2,total1;
    /**
     * Creates new form Report
     */
    String evaluate2(int b1,int m1,int a1)
    {
        String s="";
        if(b1==0 && m1>0 && a1>0){
            s="<html>YOU need a re-evaluation in this topic. You are not clear with basics but have scored well in the relatively difficult ones! Seems strange!</html> ";
             ImageIcon icon=new ImageIcon(getClass().getResource("/res/topic1_022.png"));
      jLabel5.setIcon(icon);
      ImageIcon icon1=new ImageIcon(getClass().getResource("/res/topic2_022.png"));
      jLabel2.setIcon(icon1);
        } else if(b1==1){
            s="<html>YOU might need to brush up the topic once again as you might need more depth of knowledge.</html>";
             ImageIcon icon=new ImageIcon(getClass().getResource("/res/topic1_110.png"));
      jLabel5.setIcon(icon);
      ImageIcon icon1=new ImageIcon(getClass().getResource("/res/topic2_110.png"));
      jLabel2.setIcon(icon1);
        }else if(b1==2 && m1<2){
            s="<html>Your basics are clear but you need more depth on harder problems.</html>";
              ImageIcon icon=new ImageIcon(getClass().getResource("/res/topic1_211.png"));
      jLabel5.setIcon(icon);
      ImageIcon icon1=new ImageIcon(getClass().getResource("/res/topic2_211.png"));
      jLabel2.setIcon(icon1);
        }
        else if(b1==2 && m1==2 && a1<2){
            s="<html>Well done! Your knowledge is sound but you might need to work up on the difficult problems.</html>";
              ImageIcon icon=new ImageIcon(getClass().getResource("/res/topic1_221.png"));
      jLabel5.setIcon(icon);
      ImageIcon icon1=new ImageIcon(getClass().getResource("/res/topic2_221.png"));
      jLabel2.setIcon(icon1);
        }else if(b1==2 && m1==2 && a1==2){
            s="<html>Excellent Work! You can proceed to the next chapter!!</html>";
              ImageIcon icon=new ImageIcon(getClass().getResource("/res/topic1_222.png"));
      jLabel5.setIcon(icon);
      ImageIcon icon1=new ImageIcon(getClass().getResource("/res/topic2_222.png"));
      jLabel2.setIcon(icon1);
        }else if(b1<2 && m1<2 && a1<2){
            s="<html>You need to give more time to this topic and understand the concepts again!</html>";
              ImageIcon icon=new ImageIcon(getClass().getResource("/res/topic1_110.png"));
      jLabel5.setIcon(icon);
      ImageIcon icon1=new ImageIcon(getClass().getResource("/res/topic2_110.png"));
      jLabel2.setIcon(icon1);
        }else{
            s="You need more practice!";
              ImageIcon icon=new ImageIcon(getClass().getResource("/res/topic1_110.png"));
      jLabel5.setIcon(icon);
      ImageIcon icon1=new ImageIcon(getClass().getResource("/res/topic2_110.png"));
      jLabel2.setIcon(icon1);
        }
         s=s+"\n\nBasic: "+b1+"/2\nMedium: "+m1+"/2\nAdvanced: "+a1+"/2"; 
      
      ImageIcon icon3=new ImageIcon(getClass().getResource("/res/ledger.png"));
      jLabel6.setIcon(icon3);
        return s;
    }
    String evaluate1(int b1,int m1,int a1)
    {
        String s="";
        if(b1==0 && m1>0 && a1>0)
            s="<html>YOU need a re-evaluation in this topic. You are not clear with basics but have scored well in the relatively difficult ones! Seems strange!</html>";
        else if(b1==1)
            s="<html>YOU might need to brush up the topic once again as you might need more depth of knowledge.</html>";
        else if(b1==2 && m1<2)
            s="<html>Your basics are clear but you need more depth on harder problems.</html>";
        else if(b1==2 && m1==2 && a1<2)
            s="<html>Well done! Your knowledge is sound but you might need to work up on the difficult problems.</html>";
        else if(b1==2 && m1==2 && a1==2)
            s="<html>Excellent Work! You can proceed to the next chapter!!</html>";
        else if(b1<2 && m1<2 && a1<2)
            s="<html>You need to give more time to this topic and understand the concepts again!</html>";
         else
            s="You need more practice!";
        
         //s=s+"<html><br>Basic: </html>"+b1+"<html>/2\tMedium: </html>"+m1+"<html>/2\tAdvanced: </html>"+a1+"<html>/2</html>";     
         
        return s;
    }
    String score_wrt_others()
    {
        String s;
        int count=0,k=0;
        int others[]=new int[100];
        try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/exams","root","");
                Statement st=(Statement) con.createStatement();
                query="select * from `result_for_oop`";
                 ResultSet rs=st.executeQuery(query);
                while(rs.next())
                {
                    count++;
                    username=rs.getString("username");
                   // JOptionPane.showMessageDialog(null,username+""+user);
                    if(username.equals(user))
                    {

                        total1=rs.getInt("total");
                        
                    }
                    else
                        others[k++]=rs.getInt("total");
                }  
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
            }
        int better=1;
        for(int i=0;i<k;i++)
        {
            if(others[i]>total1)
                better++;
        }
        JOptionPane.showMessageDialog(null, "People better than you"+better+"out of "+count);
        better=count-better;
        float val=((float)better/count) *100;
        s="You are better than "+val+"% of the examinees in this subject!";
        
        
        
        
        
        return s;
    }
    void username_get1(String user1)
     {
        // JOptionPane.showMessageDialog(null, "Are you ready?"+user1);
         user=user1;
         //System.out.println(user+"lol");
         jLabel1.setText("Welcome: "+user);
         jLabel1.setVisible(true);
           try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/exams","root","");
                Statement st=(Statement) con.createStatement();
                
                 // JOptionPane.showMessageDialog(null, "hello "+count);
                //JOptionPane.showMessageDialog(null,"");
         
                query="select * from `result_for_oop`";
               // JOptionPane.showMessageDialog(null,query);
                
                ResultSet rs=st.executeQuery(query);
                while(rs.next())
                {
                    username=rs.getString("username");
                    //JOptionPane.showMessageDialog(null,username+""+user);
                    if(username.equals(user))
                    {
                        basic1=rs.getInt("basic1");
                        medium1=rs.getInt("medium1");
                        advanced1=rs.getInt("advanced1");
                         basic2=rs.getInt("basic2");
                        medium2=rs.getInt("medium2");
                        advanced2=rs.getInt("advanced2");
                        total1=rs.getInt("total");
                        String final_res=evaluate1(basic1,medium1,advanced1);
                        String final_res2=evaluate2(basic2,medium2,advanced2);
                        JOptionPane.showMessageDialog(null, final_res);
                        result1.setText(final_res);
                        score1.setText("Your Net Score is:"+total1);
                        String wrt=score_wrt_others();
                        score_wrt.setText(wrt);
                        String fin_res="Topic 1:\nBasic: "+basic1+"/2\nMedium: "+medium1+"/2\nAdvanced: "+advanced1+"/2";
                        result5.setText(fin_res);
                        fin_res="Topic 2:\nBasic: "+basic2+"/2\nMedium: "+medium2+"/2\nAdvanced: "+advanced2+"/2";
                        result2.setText(final_res2);
                        result3.setText(fin_res);
                        //JOptionPane.showMessageDialog(null,"score:"+basic1+medium1+advanced1+basic2+medium2+advanced2);
                    }
                }
                
                    
                
                
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
            }
     }
    
    public Report() {
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
        score_wrt = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        total = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        result1 = new javax.swing.JLabel();
        result2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        result3 = new javax.swing.JLabel();
        result5 = new javax.swing.JLabel();
        score1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 51, 255));

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 255));
        jLabel1.setText("WELCOME: ");

        score_wrt.setBackground(new java.awt.Color(153, 153, 255));
        score_wrt.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        score_wrt.setForeground(new java.awt.Color(0, 102, 102));
        score_wrt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        score_wrt.setText("Your Score:");
        score_wrt.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(score_wrt, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(score_wrt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 0));
        jLabel7.setText("PROGRAMMING");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 0));
        jLabel10.setText("OBJECT");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 0));
        jLabel11.setText("ORIENTED");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(55, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(76, 76, 76)))))
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );

        jPanel5.setBackground(new java.awt.Color(204, 255, 51));

        total.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        total.setForeground(new java.awt.Color(102, 0, 0));
        total.setText("Overall Score:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Topic 1:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("Topic 2:");

        result1.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        result1.setForeground(new java.awt.Color(0, 102, 102));
        result1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        result1.setText("Analysis");
        result1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        result2.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        result2.setForeground(new java.awt.Color(0, 102, 102));
        result2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        result2.setText("Analysis");
        result2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(total)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(result1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(result2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        jPanel6.setBackground(new java.awt.Color(204, 153, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        result3.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        result3.setForeground(new java.awt.Color(0, 102, 102));
        result3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        result3.setText("Analysis");
        result3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel6.add(result3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 370, -1));

        result5.setBackground(new java.awt.Color(153, 153, 255));
        result5.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        result5.setForeground(new java.awt.Color(0, 102, 102));
        result5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        result5.setText("Analysis");
        result5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel6.add(result5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 20));

        score1.setBackground(new java.awt.Color(153, 153, 255));
        score1.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        score1.setForeground(new java.awt.Color(0, 102, 102));
        score1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        score1.setText("Your Score:");
        score1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel6.add(score1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 360, 20));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 255));
        jButton1.setText("Back to Assignments");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 470, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 294, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Student_homepage form=new Student_homepage();
        form.setVisible(true);
                form.setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel result1;
    private javax.swing.JLabel result2;
    private javax.swing.JLabel result3;
    private javax.swing.JLabel result5;
    private javax.swing.JLabel score1;
    private javax.swing.JLabel score_wrt;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
