 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Lenovo
 */
public class DashBoard extends javax.swing.JFrame {
	JButton sub,reset;

    private JTextArea resadd;
    private JTextField tname;

    private JTextField tmno;

    private JRadioButton male;
    private JRadioButton female;

    private JTextArea tadd;
    
    JLabel res;

	
	/**
     * Creates new form NewJFrame
     */
    public DashBoard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
        	Job job1=new Job(15,"Java Expert","xyz required","Fixed",4500);
        	Job job2= new Job(15,"Java Expert","xyz required","Fixed",5000);
        	String[] jobs= {job1.toString(),job2.toString()};
            public int getSize() { return jobs.length; }
            public String getElementAt(int i) { return jobs[i]; }
        });
        jList1.setFixedCellHeight(150);
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jButton1.setText("Add Job");
        jButton1.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        jButton2.setText("Delete Job");

        jButton3.setText("Update Job");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Search Job");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(39, 39, 39))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jButton1)
                .addGap(82, 82, 82)
                .addComponent(jButton2)
                .addGap(82, 82, 82)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	
    	JFrame jf=new JFrame();
    	  jf.setTitle("Job Information");
    	  jf.setBounds(300, 90, 450, 600);
    	  jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	  jf.setResizable(false);
    	  jf.setVisible(true);
   
          jf.setLayout(null);
   
          JLabel title = new JLabel("Job Info:");
          title.setFont(new Font("Arial", Font.PLAIN, 30));
          title.setSize(300, 30);
          title.setLocation(140, 30);
          jf.add(title);
   
          JLabel name = new JLabel("Job Title");
          name.setFont(new Font("Arial", Font.PLAIN, 20));
          name.setSize(100, 20);
          name.setLocation(80, 100);
          jf.add(name);
   
          tname = new JTextField();
          tname.setFont(new Font("Arial", Font.PLAIN, 15));
          tname.setSize(190, 30);
          tname.setLocation(180, 100);
          jf.add(tname);
   
          JLabel mno = new JLabel("Budget");
          mno.setFont(new Font("Arial", Font.PLAIN, 20));
          mno.setSize(100, 30);
          mno.setLocation(80, 150);
          jf.add(mno);
   
          tmno = new JTextField();
          tmno.setFont(new Font("Arial", Font.PLAIN, 15));
          tmno.setSize(150, 30);
          tmno.setLocation(180, 150);
          jf.add(tmno);
   
          JLabel gender = new JLabel("Job Type");
          gender.setFont(new Font("Arial", Font.PLAIN, 20));
          gender.setSize(100, 20);
          gender.setLocation(80, 200);
          jf.add(gender);
   
          male = new JRadioButton("Hourly");
          male.setFont(new Font("Arial", Font.PLAIN, 15));
          male.setSelected(true);
          male.setSize(75, 30);
          male.setLocation(200, 200);
          jf.add(male);
   
          female = new JRadioButton("Fixed");
          female.setFont(new Font("Arial", Font.PLAIN, 15));
          female.setSelected(false);
          female.setSize(80, 30);
          female.setLocation(275, 200);
          jf.add(female);
   
          ButtonGroup gengp = new ButtonGroup();
          gengp.add(male);
          gengp.add(female);
     
          JLabel add = new JLabel("Description");
          add.setFont(new Font("Arial", Font.PLAIN, 20));
          add.setSize(100, 30);
          add.setLocation(80, 300);
          jf.add(add);
   
          JTextArea tadd = new JTextArea();
          tadd.setFont(new Font("Arial", Font.PLAIN, 15));
          tadd.setSize(200, 75);
          tadd.setLocation(180, 300);
          tadd.setLineWrap(true);
          jf.add(tadd);
   
          
           sub = new JButton("Submit");
          sub.setFont(new Font("Arial", Font.PLAIN, 15));
          sub.setSize(100, 30);
          sub.setLocation(80, 450);
          sub.addActionListener(new ActionListener() {

  			@Override
  			public void actionPerformed(ActionEvent e) {
//  				String data1="";
//                String data
//                    = "Title : "
//                      + tname.getText() + "\n"
//                      + "Budget : "
//                      + tmno.getText() + "\n";
//                if (male.isSelected())
//                    data1 = "Type : Hourly"
//                            + "\n";
//                else
//                    data1 = "Type : Fixed"
//                            + "\n";   
//                String data3 = "Description : " + tadd.getText();
  				JOptionPane.showMessageDialog(jf, "Job Added Successfully!!", "Success", JOptionPane.OK_OPTION);
  				jf.dispose();
  			}
            
            });
          jf.add(sub);
   
           reset = new JButton("Reset");
          reset.setFont(new Font("Arial", Font.PLAIN, 15));
          reset.setSize(100, 30);
          reset.setLocation(220, 450);
          reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String def = "";
	              tname.setText(def);
	              tadd.setText(def);
	              tmno.setText(def);
	              res.setText(def);
	              resadd.setText(def);
			}
          
          }
        		  );
          jf.add(reset);
   
          setVisible(true);
      }
   
      // method actionPerformed()
      // to get the action performed
      // by the user and act accordingly
      public void actionPerformed(ActionEvent e)
      {
          if (e.getSource() == sub) {
                  
          }
   
          else if (e.getSource() == reset) {
              
          }
      }
    	
    	
    	
    	
    	
    	
//    	// TODO add your handling code here:
//    	JTextField jobIdField = new JTextField(5);
//        JTextField jobTitleField = new JTextField(5);
//    	JTextField jobDescriptionField = new JTextField(5);
//        JTextField jobTypeField = new JTextField(5);
//    	JTextField budget = new JTextField(5);
//
////        JPanel myPanel = new JPanel();
//        jPanel2.add(new JLabel("Job Title:"));
//        jPanel2.add(jobTitleField);
//        jPanel2.add(Box.createHorizontalStrut(15)); // a spacer
//        jPanel2.add(new JLabel("Job Description:"));
//        jPanel2.add(jobDescriptionField);
//        
//        
//        int result = JOptionPane.showConfirmDialog(null, jPanel2, 
//                 "Please Enter Job Info: ", JOptionPane.OK_CANCEL_OPTION);
//        if (result == JOptionPane.OK_OPTION) {
//           System.out.println("Title:" + jobTitleField.getText());
//           System.out.println("Desc:" + jobDescriptionField.getText());
//         }
//        
//        jPanel2.add(new JLabel("Type:"));
//        jPanel2.add(jobTypeField);
//        jPanel2.add(Box.createHorizontalStrut(15)); // a spacer
//        jPanel2.add(new JLabel("Budget:"));
//        jPanel2.add(budget);
//        
//        result = JOptionPane.showConfirmDialog(null, jPanel2, 
//                "Please Enter Job Info: ", JOptionPane.OK_CANCEL_OPTION);
//       if (result == JOptionPane.OK_OPTION) {
//          System.out.println("Job Type:" + jobTypeField.getText());
//          System.out.println("Job Budget:" + budget.getText());
//      }
//    }

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
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}