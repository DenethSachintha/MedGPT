package connector;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import org.jpl7.Query;
import org.jpl7.Term;

public class Sneezer extends javax.swing.JFrame {
     DefaultComboBoxModel<String> feverComboBoxModel = new DefaultComboBoxModel<>(new String[]{"Few Hours ago", "1", "2", "3", "More than 3 days"});
    DefaultComboBoxModel<String> coughComboBoxModel = new DefaultComboBoxModel<>(new String[]{"1", "2", "3", "4", "5", "More than 5 days"});
    int []fever={0,1,2,3,4};
     int []cough={1,2,3,4,5,6};
     
    public Sneezer() {
        initComponents();
        jComboBox1.setModel(feverComboBoxModel);
        jComboBox2.setModel(coughComboBoxModel);
      
        jLabel3.setEnabled(false);
          jComboBox1.setEnabled(false);
        jComboBox2.setEnabled(false);
        jLabel4.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Select symptoms you have:");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("Sneezing");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setText("Cough");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setText("Fever");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setText("fatigue");

        jCheckBox7.setText("Headache");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jCheckBox8.setText("Sore Throat");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jLabel3.setText("how long has it been since the fever?");

        jLabel4.setText("how long has it been since the cough?");

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(342, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox3)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox4)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox5)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox6)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox7)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox8)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        JCheckBox[] checkboxes = {jCheckBox3, jCheckBox4, jCheckBox5, jCheckBox6,jCheckBox7,jCheckBox8};
        String query1=null;
              List<String>SelectedItems=new ArrayList<>();
        String [] symptoms={"sneezing","cough","fever","fatigue", "headache","sorethroat"};
        for(int i=0;i<6;i++){
            if(checkboxes[i].isSelected()){
                SelectedItems.add(symptoms[i]);

            }
        }
        System.out.println(SelectedItems);
      
      Query.hasSolution("consult('assignment.pl')");
    
       String query = "disease([" + String.join(",", SelectedItems) + "],Result)";
 
   
        Query prologQuery = new Query(query);
        if (prologQuery.hasSolution()) {
          
            Term diseaseTerm = prologQuery.oneSolution().get("Result");
            String disease = diseaseTerm.toString(); 
               jLabel2.setText("Predicted Disease: " + disease);
              
        } else {
              jLabel2.setText("No solution found.");
         
        }
        System.out.println(jComboBox1.getSelectedIndex());
        System.out.println(jComboBox2.getSelectedIndex());
        if(jCheckBox4.isSelected() ||jCheckBox5.isSelected()){
        if(jCheckBox4.isSelected()&&jCheckBox5.isSelected()==false){
            
                    query1 = "alert([" + String.join(",", symptoms[1]) + "], ["+cough[jComboBox2.getSelectedIndex()]+"], Message)";
                   
        }
        else if(jCheckBox5.isSelected()&&jCheckBox4.isSelected()==false){
                  query1 = "alert([" + String.join(",", symptoms[2]) + "], ["+fever[jComboBox1.getSelectedIndex()]+"], Message)";
            
        }
        else if(jCheckBox5.isSelected()&&jCheckBox4.isSelected()){
           query1 = "alert([" + symptoms[1]+","+symptoms[2]+"],["+cough[jComboBox2.getSelectedIndex()]+","+fever[jComboBox1.getSelectedIndex()]+"], Message)";
 
        }
        }
        if(query1!=null){
        Query prologQuery1 = new Query(query1);
if (prologQuery1.hasSolution()) {
    Term messageTerm = prologQuery1.oneSolution().get("Message");
    if (messageTerm != null) {
        String message = messageTerm.toString(); 
        
         JOptionPane.showMessageDialog(null, message.replace("[", "").replace("]", "").replace(",", "").replace("\'", ""));
    } else {
           JOptionPane.showMessageDialog(null,"No message to display");
   
    }
} else {
      JOptionPane.showMessageDialog(null,"No solution found for alert query");
 
}
        }
    
    
    
        for(int i=0;i<6;i++){
             checkboxes[i].setSelected(false);
        }
         SelectedItems.clear();
        jComboBox1.setEnabled(false);
        jComboBox2.setEnabled(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
     if (jCheckBox5.isSelected()) {
        // Enable the JComboBox
        jComboBox1.setEnabled(true);
        jLabel3.setEnabled(true);       
        jComboBox1.setSelectedIndex(0); 
    } else {
       
        jComboBox1.setEnabled(false);
        jLabel3.setEnabled(false);
    }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
if (jCheckBox4.isSelected()) {
        // Enable the JComboBox
        jComboBox2.setEnabled(true);
        jLabel4.setEnabled(true);
        
       
        jComboBox2.setSelectedIndex(0); 
    } else {
       
        jComboBox2.setEnabled(false);
        jLabel4.setEnabled(false);
    }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

//    public static void main(String args[]) {
//    
//   
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Sneezer().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
