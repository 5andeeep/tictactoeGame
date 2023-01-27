/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tic_tac_toe_jan;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
/**
 *
 * @author Sandeep
 */
public class TicTacToe extends javax.swing.JFrame {

    /**
     * Creates new form TicTacToe
     */
    private String turn;
    private int totalCount;
    private int xCount;
    private int oCount;
    
    public TicTacToe() {
        initComponents();
//        int a = JOptionPane.showConfirmDialog(this, "Confirm if you want start with X", "Turn", JOptionPane.YES_NO_OPTION);
//        if(a == 0){
//            turn = "X";
//        }
//        else{
//            turn = "O";
//        }
        turn = "O";
        totalCount = 0;
        xCount = 0;
        oCount = 0;
    }
    
    private void choosePlayer(){
        if(turn.equals("X")){
            turn = "O";
        }
        else{
            turn = "X";
        }
    }
    
    // game score function...
    private void gameScore(){
        xScore.setText(String.valueOf(xCount));
        oScore.setText(String.valueOf(oCount));
    }
    
    private void checkWinner(){
        String b1 = btn1.getText();
        String b2 = btn2.getText();
        String b3 = btn3.getText();
        String b4 = btn4.getText();
        String b5 = btn5.getText();
        String b6 = btn6.getText();
        String b7 = btn7.getText();
        String b8 = btn8.getText();
        String b9 = btn9.getText();
        
        // 1st possibility to win..
        if(b1.equals(b2) && b2.equals(b3) && !b1.equals("")){ // horizontal matching winner...
            
            if(turn.equals("O")){
                oCount++;
            }
            else{
                xCount++;
            }
            
            JOptionPane.showMessageDialog(this, "Player "+turn+" wins", "Winner", JOptionPane.INFORMATION_MESSAGE);
            btn1.setBackground(Color.green);
            btn2.setBackground(Color.green);
            btn3.setBackground(Color.green);
            
        }
        // 2nd possibility to win..
        else if(b4.equals(b5) && b5.equals(b6) && !b4.equals("")){ // horizontal matching winner..
            
            if(turn.equals("O")){
                oCount++;
            }
            else{
                xCount++;
            }
            
            JOptionPane.showMessageDialog(this, "Player "+turn+" wins", "Winner", JOptionPane.INFORMATION_MESSAGE);
            btn4.setBackground(Color.green);
            btn5.setBackground(Color.green);
            btn6.setBackground(Color.green);
            
        }
        
        // 3rd possibility to win..
        else if(b7.equals(b8) && b8.equals(b9) && !b7.equals("")){ // horizontal matching winner...
            
            if(turn.equals("O")){
                oCount++;
            }
            else{
                xCount++;
            }
            
            JOptionPane.showMessageDialog(this, "Player "+turn+" wins", "Winner", JOptionPane.INFORMATION_MESSAGE);
            btn7.setBackground(Color.green);
            btn8.setBackground(Color.green);
            btn9.setBackground(Color.green);
            
        }
        
        // 4th possibility to win..
        else if(b1.equals(b4) && b4.equals(b7) && !b1.equals("")){ // vertical matching winner..
            
            if(turn.equals("O")){
                oCount++;
            }
            else{
                xCount++;
            }
            
            JOptionPane.showMessageDialog(this, "Player "+turn+" wins", "Winner", JOptionPane.INFORMATION_MESSAGE);
            btn1.setBackground(Color.green);
            btn4.setBackground(Color.green);
            btn7.setBackground(Color.green);
            
        }
        
        // 5th possibility to win..
        else if(b2.equals(b5) && b5.equals(b8) && !b2.equals("")){ // vertical matching winner..
            
            if(turn.equals("O")){
                oCount++;
            }
            else{
                xCount++;
            }
            
            JOptionPane.showMessageDialog(this, "Player "+turn+" wins", "Winner", JOptionPane.INFORMATION_MESSAGE);
            btn2.setBackground(Color.green);
            btn5.setBackground(Color.green);
            btn8.setBackground(Color.green);
            
        }
        
        // 6th possibility to win..
        else if(b3.equals(b6) && b6.equals(b9) && !b3.equals("")){ // vertical matching winner..
            
            if(turn.equals("O")){
                oCount++;
            }
            else{
                xCount++;
            }
            
            JOptionPane.showMessageDialog(this, "Player "+turn+" wins", "Winner", JOptionPane.INFORMATION_MESSAGE);
            btn3.setBackground(Color.green);
            btn6.setBackground(Color.green);
            btn9.setBackground(Color.green);
            
        }
        
        // 7th possibility to win..
        else if(b1.equals(b5) && b5.equals(b9) && !b1.equals("")){ // cross matching winner..
            
            if(turn.equals("O")){
                oCount++;
            }
            else{
                xCount++;
            }
            
            JOptionPane.showMessageDialog(this, "Player "+turn+" wins", "Winner", JOptionPane.INFORMATION_MESSAGE);
            btn1.setBackground(Color.green);
            btn5.setBackground(Color.green);
            btn9.setBackground(Color.green);
            
        }
        
        // 8th possibility to win..
        else if(b3.equals(b5) && b5.equals(b7) && !b3.equals("")){ // cross matching winner...
            
            if(turn.equals("O")){
                oCount++;
            }
            else{
                xCount++;
            }
            
            JOptionPane.showMessageDialog(this, "Player "+turn+" wins", "Winner", JOptionPane.INFORMATION_MESSAGE);
            btn3.setBackground(Color.green);
            btn5.setBackground(Color.green);
            btn7.setBackground(Color.green);
            
        }
        
        // 9th possibility to draw..
        else if(totalCount==9){
           JOptionPane.showMessageDialog(this, "It's a Draw.", "Draw", JOptionPane.INFORMATION_MESSAGE);
           resetGame();
        }
        
        gameScore();
    }
    
    private void resetGame(){
        // to reset as empty button..
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        
        // to reset button color as white..
        btn1.setBackground(Color.white);
        btn2.setBackground(Color.white);
        btn3.setBackground(Color.white);
        btn4.setBackground(Color.white);
        btn5.setBackground(Color.white);
        btn6.setBackground(Color.white);
        btn7.setBackground(Color.white);
        btn8.setBackground(Color.white);
        btn9.setBackground(Color.white);
        
        totalCount = 0;
        
    }
    
    private void btnTriggered(JButton btn){
        String btnText = btn.getText();
        if(!btnText.equals("")){
            return;
        }
        
        btn.setText(turn);
        if(turn.equals("X")){
            btn.setForeground(Color.red);
            btn.setBackground(Color.cyan);
        }
        else{
            btn.setForeground(Color.blue);
            btn.setBackground(Color.pink);
        }
        
        totalCount++;
        checkWinner();
        choosePlayer();
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
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        playerX = new javax.swing.JLabel();
        playerO = new javax.swing.JLabel();
        xScore = new javax.swing.JLabel();
        oScore = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe Game");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE GAME");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 13, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, -1));

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, 100));

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 130, 100, 100));

        btn3.setBackground(new java.awt.Color(255, 255, 255));
        btn3.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 130, 100, 100));

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 248, 100, 100));

        btn5.setBackground(new java.awt.Color(255, 255, 255));
        btn5.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 248, 100, 100));

        btn6.setBackground(new java.awt.Color(255, 255, 255));
        btn6.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 248, 100, 100));

        btn9.setBackground(new java.awt.Color(255, 255, 255));
        btn9.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 375, 100, 100));

        btn7.setBackground(new java.awt.Color(255, 255, 255));
        btn7.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 375, 100, 100));

        btn8.setBackground(new java.awt.Color(255, 255, 255));
        btn8.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 375, 100, 100));

        exitButton.setBackground(new java.awt.Color(255, 0, 0));
        exitButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exitButton.setText("EXIT");
        exitButton.setToolTipText("");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 385, 130, 80));

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SCORE CARD");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 274, 50));

        playerX.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playerX.setText("PLAYER  X");
        jPanel2.add(playerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 97, -1, -1));

        playerO.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playerO.setText("PLAYER  O");
        jPanel2.add(playerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 155, -1, -1));

        xScore.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        xScore.setText("0");
        jPanel2.add(xScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 97, -1, -1));

        oScore.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        oScore.setText("0");
        jPanel2.add(oScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 155, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 130, 278, 218));

        resetButton.setBackground(new java.awt.Color(0, 51, 255));
        resetButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        resetButton.setText("RESET");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 385, 130, 80));

        setSize(new java.awt.Dimension(676, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // performing action to exit the game..
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to exit ?", "Exit", JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_exitButtonActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        btnTriggered(btn1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        btnTriggered(btn2);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        btnTriggered(btn3);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        btnTriggered(btn4);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        btnTriggered(btn5);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        btnTriggered(btn6);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        btnTriggered(btn7);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        btnTriggered(btn8);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        btnTriggered(btn9);
    }//GEN-LAST:event_btn9ActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
//        new TicTacToe().setVisible(true);
        resetGame();

    }//GEN-LAST:event_resetButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel oScore;
    private javax.swing.JLabel playerO;
    private javax.swing.JLabel playerX;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel xScore;
    // End of variables declaration//GEN-END:variables
}
