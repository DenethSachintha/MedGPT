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
        jCheckBox8 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select symptoms you have");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 36, 260, 52));

        jButton1.setBackground(new java.awt.Color(51, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 413, 150, 52));

        jCheckBox3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("Sneezing");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 94, 122, -1));

        jCheckBox4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("Cough");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 141, 85, -1));

        jCheckBox5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setText("Fever");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 181, 85, -1));

        jCheckBox6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setText("fatigue");
        getContentPane().add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 94, 85, -1));

        jCheckBox7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox7.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setText("Headache");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 181, 114, -1));

        jCheckBox8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox8.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setText("Sore Throat");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 141, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("how long has it been since the fever?");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 264, 321, 44));

        jComboBox1.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 264, 137, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("how long has it been since the cough?");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 332, 321, 44));

        jComboBox2.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 332, 137, 50));

        jButton2.setBackground(new java.awt.Color(51, 255, 204));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 413, 150, 52));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cardio-heartbeat-medical-background-design-vector.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private List<String> getSelectedItems() {
        JCheckBox[] checkboxes = {jCheckBox3, jCheckBox4, jCheckBox5, jCheckBox6, jCheckBox7, jCheckBox8};
        List<String> selectedItems = new ArrayList<>();
        String[] symptoms = {"sneezing", "cough", "fever", "fatigue", "headache", "sorethroat"};
        for (int i = 0; i < 6; i++) {
            if (checkboxes[i].isSelected()) {
                selectedItems.add(symptoms[i]);
            }
        }
        return selectedItems;
    }
    private String getQuery1(){
        System.out.println(jComboBox1.getSelectedIndex());
        System.out.println(jComboBox2.getSelectedIndex());
        String query1=null;
        String[] symptoms = {"sneezing", "cough", "fever", "fatigue", "headache", "sorethroat"};   
       
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
           
            
           
//            else{
//              query1="alert(selected"
//            }
            }
        else{
              query1="alert("+getSelectedItems()+",8,Message)";
                System.out.println(query1);
        }
        return query1;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        List<String> SelectedItems = new ArrayList<>(getSelectedItems());

        System.out.println("jButton1ActionPerformed"+SelectedItems);
      
        Query.hasSolution("consult('assignment.pl')");

    String query1=getQuery1(); 
        if(query1!=null){
        Query prologQuery1 = new Query(query1);
if (prologQuery1.hasSolution()) {
    Term messageTerm = prologQuery1.oneSolution().get("Message");
    if (messageTerm != null) {
        String message = messageTerm.toString(); 
         JOptionPane.showMessageDialog(null, "Follow This Guide:"+message.replace("[", "").replace("]", "").replace(",", "").replace("\'", ""));
    } else {
           JOptionPane.showMessageDialog(null,"No message to display");
    }
    } else {
      JOptionPane.showMessageDialog(null,"No solution found for alert query"); 
    }
        }
    
    
    

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
 if (jCheckBox5.isSelected()) {
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
        jComboBox2.setEnabled(true);
        jLabel4.setEnabled(true);
        jComboBox2.setSelectedIndex(0); 
    } else {
        jComboBox2.setEnabled(false);
        jLabel4.setEnabled(false);
    } 
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    List<String> SelectedItems = new ArrayList<>(getSelectedItems());
    Query.hasSolution("consult('assignment.pl')");

           String query = "get_similar_diseases([" + String.join(",", SelectedItems) + "],SimilarDiseases)";


            Query prologQuery = new Query(query);
            if (prologQuery.hasSolution()) {

                Term diseaseTerm = prologQuery.oneSolution().get("SimilarDiseases"); 
                List<String> diseases = new ArrayList<>();
                for (Term term : diseaseTerm.toTermArray()) {
                diseases.add(term.toString());
                     }
                //disease = disease.replace("'", ""); 
                System.out.println("jButton2ActionPerformed"+diseases);
                setVisible(false);
                // Show the SneezerCheckup frame
                SneezerCheckup checkupFrame;
                checkupFrame = new SneezerCheckup(SelectedItems,diseases);
                checkupFrame.setVisible(true);
            }    
    }//GEN-LAST:event_jButton2ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
