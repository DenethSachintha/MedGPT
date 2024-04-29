package connector;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import org.jpl7.Query;
import org.jpl7.Term;

public class SneezerCheckup extends javax.swing.JFrame {
    JRadioButton[] radiobuttons;
    String []diseasemain={"'COVID19'","'Nill'","'Allergic Rhinitis'","'Nill'","'Strep Throat'","'Nill'"};
    public SneezerCheckup() {
        initComponents();
    }
public SneezerCheckup(List<String> selectedItems, List<String> diseases) {
    initComponents();
    jLabel1.setEnabled(false);
    jLabel2.setEnabled(false);
    jLabel3.setEnabled(false);
    jRadioButton1.setEnabled(false);
    jRadioButton2.setEnabled(false);
    jRadioButton3.setEnabled(false);
    jRadioButton4.setEnabled(false);
    jRadioButton5.setEnabled(false);
    jRadioButton6.setEnabled(false);
    System.out.println("SneezerCheckup[" + "selectedItems:" + selectedItems + ", disease:" + diseases + "]");
 radiobuttons = new JRadioButton[]{ jRadioButton1,  jRadioButton2,  jRadioButton3,jRadioButton4,  jRadioButton5,  jRadioButton6 };

    // Create a DefaultComboBoxModel with the diseases list
    DefaultComboBoxModel<String> deseasesComboBoxModel = new DefaultComboBoxModel<>();
    deseasesComboBoxModel.addElement("Not Sure");
    for (String disease : diseases) {
        disease = disease.replace("'", "");
        if(null != disease)switch (disease) {
            case "COVID-19 (Coronavirus)" -> {jLabel1.setEnabled(true);jRadioButton1.setEnabled(true);jRadioButton2.setEnabled(true);}
            case "Seasonal Allergies (Allergic Rhinitis)" -> {jLabel2.setEnabled(true);jRadioButton3.setEnabled(true);jRadioButton4.setEnabled(true);}
            case "Strep Throat" -> {jLabel3.setEnabled(true);jRadioButton5.setEnabled(true);jRadioButton6.setEnabled(true);}
           
        }
        deseasesComboBoxModel.addElement(disease);
    }
    
    // Set the model to the deseasesjComboBox
    jComboBox1.setModel(deseasesComboBoxModel);
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Allergy = new javax.swing.ButtonGroup();
        Covid = new javax.swing.ButtonGroup();
        StrepThroat = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel_disease = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Covid-19 Test");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 67, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Allergy Test");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 106, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Strep Throat Test");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 143, -1, -1));

        Covid.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Possitive");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        Covid.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Negative");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));

        Allergy.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Possitive");
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        Allergy.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Negative");
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        StrepThroat.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setText("Possitive");
        getContentPane().add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        StrepThroat.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setText("Negative");
        getContentPane().add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 120, 40));

        jLabel_disease.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_disease.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_disease.setText("Have you resently been exposed any of these deseases?");
        getContentPane().add(jLabel_disease, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 186, 510, 60));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Do this test");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 16, 120, 40));

        backBtn.setBackground(new java.awt.Color(51, 255, 204));
        backBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 150, 52));

        jButton2.setBackground(new java.awt.Color(51, 255, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 150, 52));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cardio-heartbeat-medical-background-design-vector.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        setVisible(false);
        Sneezer SneezerFrame;
        SneezerFrame = new Sneezer();
        SneezerFrame.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    List<String> selectedItems = new ArrayList<>();
        for(int i=0;i<6;i++){
    if(radiobuttons[i].isSelected()){
        selectedItems.add(diseasemain[i]);
    }
        }
    // Assuming comboBox is your JComboBox instance
Object selectedObject =  jComboBox1.getSelectedItem();
 String selectedText="";
if (selectedObject != null) {
   selectedText = selectedObject.toString(); // Cast to String
} 
     Query.hasSolution("consult('assignment.pl')");
     String newtext="'"+selectedText+"'";
    String query1="finalresult("+selectedItems+","+newtext+",Messages)";
            System.out.println(query1);
        if(query1!=null){
        Query prologQuery1 = new Query(query1);
if (prologQuery1.hasSolution()) {
    Term messageTerm = prologQuery1.oneSolution().get("Messages");
    if (messageTerm != null) {
        String message = messageTerm.toString();
        System.out.println(message);
        
        Final fobj=new Final(message);
        fobj.setVisible(true);
        setVisible(false);
    
}
}
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Allergy;
    private javax.swing.ButtonGroup Covid;
    private javax.swing.ButtonGroup StrepThroat;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_disease;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    // End of variables declaration//GEN-END:variables
}
