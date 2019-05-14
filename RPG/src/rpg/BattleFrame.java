/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author mikeross
 */
public class BattleFrame extends javax.swing.JFrame {

    /**
     * Creates new form BattleFrame
     */
   int Health=100;
   int Defeat=0;
   
    
    public BattleFrame() {
        
        
        initComponents();
        
        getContentPane().setBackground(Color.darkGray);
        
        RivalHealthBar RivalHealth= new RivalHealthBar();
        HeroHealthBar HeroHealth = new HeroHealthBar();
    }
 
    public  class HeroHealthBar{
    public HeroHealthBar(){
     JProgressBar HeroHealth = new JProgressBar();
      HeroHealth.setMaximum(Health);
      HeroHealth.setMinimum(0);
      
  }
    
    } 
    
    public  class RivalHealthBar{
    public RivalHealthBar(){
     JProgressBar RivalHealth = new JProgressBar();
      RivalHealth.setMaximum(Health);
      RivalHealth.setMinimum(0);
      
  }
    
    } 
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jCheckBox1 = new javax.swing.JCheckBox();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        Sword = new javax.swing.JButton();
        Gun = new javax.swing.JButton();
        Magic = new javax.swing.JButton();
        Punch = new javax.swing.JButton();
        HeroHealthBar = new javax.swing.JProgressBar();
        RivalHealthBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        setPreferredSize(new java.awt.Dimension(680, 470));

        Sword.setBackground(new java.awt.Color(204, 0, 0));
        Sword.setText("Sword");
        Sword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SwordActionPerformed(evt);
            }
        });

        Gun.setBackground(new java.awt.Color(153, 0, 153));
        Gun.setText("Gun");
        Gun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GunActionPerformed(evt);
            }
        });

        Magic.setBackground(new java.awt.Color(51, 255, 204));
        Magic.setText("Magic");
        Magic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MagicActionPerformed(evt);
            }
        });

        Punch.setBackground(new java.awt.Color(204, 204, 204));
        Punch.setText("Punch");
        Punch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PunchActionPerformed(evt);
            }
        });

        HeroHealthBar.setValue(100);

        RivalHealthBar.setBackground(new java.awt.Color(0, 153, 51));
        RivalHealthBar.setValue(100);
        RivalHealthBar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Defeat(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 153));
        jLabel1.setText("Rival");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 51));
        jLabel3.setText("Hero");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg/trowa1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setPreferredSize(new java.awt.Dimension(760, 760));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg/110364.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel4.setText("jLabel4");

        jLabel6.setBackground(new java.awt.Color(153, 153, 255));
        jLabel6.setFont(new java.awt.Font("Marion", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Select Attack");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 129, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1321, 1321, 1321))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(RivalHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Magic, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Gun, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Punch, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sword, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(HeroHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Magic, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sword, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Gun, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Punch, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RivalHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HeroHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(303, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SwordActionPerformed
        Health -= 20;
        if (Health < 0)
        {
            Health = 0;
            JOptionPane.showMessageDialog(this,"Hero Wins");
        }
        RivalHealthBar.setValue(Health);
            RivalHealthBar.updateUI();
            
            
            
            
    }//GEN-LAST:event_SwordActionPerformed

    private void MagicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MagicActionPerformed
             Health -= 20;
        if (Health < 0)
        {
            Health = 0;
       JOptionPane.showMessageDialog(this,"Hero Wins");
        }
        RivalHealthBar.setValue(Health);
            RivalHealthBar.updateUI();
    }//GEN-LAST:event_MagicActionPerformed

    private void GunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GunActionPerformed
            Health -= 20;
        if (Health < 0)
        {
            Health = 0;
            JOptionPane.showMessageDialog(this,"Hero Wins");
        }
        RivalHealthBar.setValue(Health);
            RivalHealthBar.updateUI();
    }//GEN-LAST:event_GunActionPerformed

    private void PunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PunchActionPerformed
             Health -= 20;
        if (Health <= 0)
        {
            Health = 0;
            JOptionPane.showMessageDialog(this,"Hero Wins");
        }
        RivalHealthBar.setValue(Health);
            RivalHealthBar.updateUI();
    }//GEN-LAST:event_PunchActionPerformed

    private void Defeat(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Defeat
        
        
       if( evt.getPropertyName().equals("value") && evt.getNewValue().equals(0))
       { 
           Health=0;
           JOptionPane.showMessageDialog(this,"Hero Wins");
            
       }
    }//GEN-LAST:event_Defeat

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
            java.util.logging.Logger.getLogger(BattleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BattleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BattleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BattleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BattleFrame().setVisible(true);
            
            
            }
            
            
            
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Gun;
    private javax.swing.JProgressBar HeroHealthBar;
    private javax.swing.JButton Magic;
    private javax.swing.JButton Punch;
    private javax.swing.JProgressBar RivalHealthBar;
    private javax.swing.JButton Sword;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
