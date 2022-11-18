/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.warehouse;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Operator extends javax.swing.JFrame {

    /**
     * Creates new form Operator
     */
    public Operator() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public Operator(String uname) {
        
        initComponents();
        
         //Jframe Center code
        Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2 -getWidth()/2, size.height/2-getHeight()/2);
        

        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        move = new javax.swing.JPanel();
        close = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        regbtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        closeStoragebtn = new javax.swing.JButton();
        calBttn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        move.setBackground(new java.awt.Color(255, 255, 255));
        move.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        move.setForeground(new java.awt.Color(0, 51, 51));
        move.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moveMouseDragged(evt);
            }
        });
        move.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                moveMousePressed(evt);
            }
        });

        close.setBackground(new java.awt.Color(255, 255, 255));
        close.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\bms\\close Jframe.png")); // NOI18N
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("WELCOME OPPERATOR");

        regbtn.setBackground(new java.awt.Color(255, 255, 255));
        regbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        regbtn.setText("Register User");
        regbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regbtnActionPerformed(evt);
            }
        });

        addbtn.setBackground(new java.awt.Color(255, 255, 255));
        addbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addbtn.setText("Add New Storage");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        closeStoragebtn.setBackground(new java.awt.Color(255, 255, 255));
        closeStoragebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        closeStoragebtn.setText("Close Exsit Storrage Job");
        closeStoragebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeStoragebtnActionPerformed(evt);
            }
        });

        calBttn.setBackground(new java.awt.Color(255, 255, 255));
        calBttn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        calBttn.setText("Calculate The Bill Storrge Job");
        calBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout moveLayout = new javax.swing.GroupLayout(move);
        move.setLayout(moveLayout);
        moveLayout.setHorizontalGroup(
            moveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(moveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(moveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, moveLayout.createSequentialGroup()
                        .addComponent(logout)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(moveLayout.createSequentialGroup()
                        .addGroup(moveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(moveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(closeStoragebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(calBttn))
                            .addGroup(moveLayout.createSequentialGroup()
                                .addComponent(regbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(54, 54, 54))
                    .addGroup(moveLayout.createSequentialGroup()
                        .addGap(0, 54, Short.MAX_VALUE)
                        .addGroup(moveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(moveLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28))
                            .addGroup(moveLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(46, 46, 46)
                                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        moveLayout.setVerticalGroup(
            moveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moveLayout.createSequentialGroup()
                .addGroup(moveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(close)
                    .addGroup(moveLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(moveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(moveLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(94, 94, 94))
                    .addGroup(moveLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(regbtn)
                        .addGap(50, 50, 50)
                        .addComponent(addbtn)
                        .addGap(52, 52, 52)
                        .addComponent(closeStoragebtn)
                        .addGap(56, 56, 56)
                        .addComponent(calBttn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(logout)
                        .addGap(46, 46, 46))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(move, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(move, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeStoragebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeStoragebtnActionPerformed
     CloseExitStorageJob CES=new CloseExitStorageJob();
     CES.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_closeStoragebtnActionPerformed

    private void calBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calBttnActionPerformed
       CalculateTheBill cal =new CalculateTheBill();
       cal.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_calBttnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        
       AddStorage add=new AddStorage();
       add.setVisible(true);
       this.setVisible(false);
        
    }//GEN-LAST:event_addbtnActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
       
          JFrame frame= new JFrame("EXIT"); 
          if(JOptionPane.showConfirmDialog(frame,"IF YOU WANT LOGOUT","LOGOUT",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
          {
              MainLogin logout=new MainLogin();
              logout.setVisible(true);
              this.setVisible(false);
          } 
      
    }//GEN-LAST:event_logoutActionPerformed

    private void regbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regbtnActionPerformed
        RegisterUser reg=new RegisterUser();
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regbtnActionPerformed
    private int xMouse,yMouse;
    private void moveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_moveMousePressed

    private void moveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveMouseDragged
        
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        setLocation(x-xMouse,y-yMouse);

    }//GEN-LAST:event_moveMouseDragged

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
            java.util.logging.Logger.getLogger(Operator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton calBttn;
    private javax.swing.JButton close;
    private javax.swing.JButton closeStoragebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton logout;
    private javax.swing.JPanel move;
    private javax.swing.JButton regbtn;
    // End of variables declaration//GEN-END:variables
}
