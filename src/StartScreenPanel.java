/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

import static java.lang.Integer.parseInt; 
import javax.swing.JFrame;
public class StartScreenPanel extends JFrame {

    int numberOfPlayers;
    /**
     * Creates new form NewJFrame
     */
    public StartScreenPanel() {
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

        choice1 = new java.awt.Choice();
        jPanel2 = new javax.swing.JPanel();
        DominionLabel = new javax.swing.JLabel();
        NumberPlayersTextField = new javax.swing.JTextField();
        NumberPlayersLabel = new javax.swing.JLabel();
        NumberPlayerButton = new javax.swing.JButton();
        PlayerNamesLabel = new javax.swing.JLabel();
        PlayerNameButton = new javax.swing.JButton();
        PlayerNamesTextField = new javax.swing.JTextField();
        StartGameButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));

        DominionLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        DominionLabel.setForeground(new java.awt.Color(255, 255, 0));
        DominionLabel.setText(" Dominion");
        DominionLabel.setAlignmentY(0.0F);

        NumberPlayersTextField.setText("Enter Number");

        NumberPlayersLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        NumberPlayersLabel.setText("Number of Players");

        NumberPlayerButton.setText("Enter");
        NumberPlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberPlayerButtonActionPerformed(evt);
            }
        });

        PlayerNamesLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        PlayerNamesLabel.setText("Players Names");

        PlayerNameButton.setText("Next");
        PlayerNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayerNameButtonActionPerformed(evt);
            }
        });

        PlayerNamesTextField.setText("Enter Number");

        StartGameButton.setText("Start Game");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(196, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PlayerNamesLabel)
                    .addComponent(NumberPlayersLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(NumberPlayersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NumberPlayerButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(PlayerNamesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PlayerNameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(179, 179, 179))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(DominionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(StartGameButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(DominionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumberPlayersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumberPlayersLabel)
                    .addComponent(NumberPlayerButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlayerNamesLabel)
                    .addComponent(PlayerNameButton)
                    .addComponent(PlayerNamesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(StartGameButton)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        NumberPlayersTextField.getAccessibleContext().setAccessibleParent(NumberPlayersTextField);
        NumberPlayerButton.getAccessibleContext().setAccessibleParent(NumberPlayersTextField);
        PlayerNamesTextField.getAccessibleContext().setAccessibleParent(PlayerNamesTextField);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NumberPlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberPlayerButtonActionPerformed
        String string = NumberPlayersTextField.toString();
        numberOfPlayers = parseInt(string);
        
    }//GEN-LAST:event_NumberPlayerButtonActionPerformed

    private void PlayerNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerNameButtonActionPerformed
        
    }//GEN-LAST:event_PlayerNameButtonActionPerformed

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
            java.util.logging.Logger.getLogger(StartScreenPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartScreenPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartScreenPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartScreenPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartScreenPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DominionLabel;
    private javax.swing.JButton NumberPlayerButton;
    private javax.swing.JLabel NumberPlayersLabel;
    private javax.swing.JTextField NumberPlayersTextField;
    private javax.swing.JButton PlayerNameButton;
    private javax.swing.JLabel PlayerNamesLabel;
    private javax.swing.JTextField PlayerNamesTextField;
    private javax.swing.JButton StartGameButton;
    private java.awt.Choice choice1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
