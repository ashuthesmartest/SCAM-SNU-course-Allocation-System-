/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Ashutosh
 */
public class f9 extends javax.swing.JFrame {

    /**
     * Creates new form f9
     */
    public f9() 
    {
        initComponents();
        this.setSize(470, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
        jLabel6.setText(GRID.pk);
        int x = Integer.parseInt(GRID.pk) ;
        Font font = new Font("Tahoma", Font.PLAIN,18);
        int a = 15 - x ;
        jLabel7.setText(Integer.toString(a));
        jLabel6.setFont(font);
        jLabel7.setFont(font);
        jLabel8.setText(GRID.str + " %");
        jLabel8.setFont(font);
        int p = Integer.parseInt(GRID.str) ;
        UIManager um = new UIManager();
        if(p<75)
        {
            jLabel8.setForeground(Color.red);
            um.put("OptionPane.messageForeground", Color.red);
            JOptionPane.showMessageDialog(null, "You are short on attendance. You need to attend classes.");
        }
        else if((p>75)&&(p<80))
        {
            jLabel8.setForeground(Color.yellow);
            um.put("OptionPane.messageForeground", Color.yellow);
            JOptionPane.showMessageDialog(null, "You are just on the brink of falling below 75%. Time to Buck UP !");
        }    
        else
        {
            jLabel8.setForeground(Color.green);
            um.put("OptionPane.messageForeground", Color.green);
            JOptionPane.showMessageDialog(null, "You are safe as of now. Your teacher must be so proud !");
        }    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Total No. of Working Days");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(61, 127, 224, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Number of Days Present");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(61, 175, 224, 31);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Number of Days Absent");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(61, 224, 224, 32);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Attendance Percentage");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(61, 274, 224, 32);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("15");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(356, 127, 190, 30);

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(356, 175, 190, 31);

        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(356, 224, 190, 32);

        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(356, 274, 190, 32);

        jLabel9.setFont(new java.awt.Font("Elephant", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("Attendance Prediction");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(70, 40, 310, 38);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se/bg_1.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 570, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(f9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(f9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(f9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(f9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new f9().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
