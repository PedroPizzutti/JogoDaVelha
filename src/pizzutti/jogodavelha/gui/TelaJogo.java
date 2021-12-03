/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzutti.jogodavelha.gui;

import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class TelaJogo extends javax.swing.JFrame {
    
    int qtdRodadas;
    int resultado;
    int player = 1;
    int maquina = -1;
    int jogador;
    int coordenadaX;
    int coordenadaY;
    boolean isVencedor;
    boolean acabou;
    int [][] tabuleiro = new int[3][3];
    JButton [] botao = new JButton[9];

    /**
     * Creates new form TelaJogo
     */
    public TelaJogo() {
        initComponents();
        iniciarJogo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt3 = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btMenuNovoJogo = new javax.swing.JMenuItem();
        btMenuSairJogo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");
        setBackground(new java.awt.Color(0, 255, 51));

        bt3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        bt3.setFocusable(false);
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        bt1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        bt1.setFocusable(false);
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        bt2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        bt2.setFocusable(false);
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        bt6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        bt6.setFocusable(false);
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });

        bt4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        bt4.setFocusable(false);
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });

        bt5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        bt5.setFocusable(false);
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });

        bt9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        bt9.setFocusable(false);
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });

        bt7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        bt7.setFocusable(false);
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });

        bt8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        bt8.setFocusable(false);
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });

        lblResultado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado.setText("Player (X) VS Computador (O)");
        lblResultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Jogo da Velha");

        jMenu1.setText("Jogo");

        btMenuNovoJogo.setText("Novo Jogo");
        btMenuNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuNovoJogoActionPerformed(evt);
            }
        });
        jMenu1.add(btMenuNovoJogo);

        btMenuSairJogo.setText("Sair Jogo");
        btMenuSairJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuSairJogoActionPerformed(evt);
            }
        });
        jMenu1.add(btMenuSairJogo);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblResultado)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        coordenadaX = 0;
        coordenadaY = 0;
        processarJogo(bt1, coordenadaX, coordenadaY);
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        coordenadaX = 0;
        coordenadaY = 1;
        processarJogo(bt2, coordenadaX, coordenadaY);
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        coordenadaX = 0;
        coordenadaY = 2;
        processarJogo(bt3, coordenadaX, coordenadaY);
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        coordenadaX = 1;
        coordenadaY = 0;
        processarJogo(bt4, coordenadaX, coordenadaY);
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        coordenadaX = 1;
        coordenadaY = 1;
        processarJogo(bt5, coordenadaX, coordenadaY);
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        coordenadaX = 1;
        coordenadaY = 2;
        processarJogo(bt6, coordenadaX, coordenadaY);
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        coordenadaX = 2;
        coordenadaY = 0;
        processarJogo(bt7, coordenadaX, coordenadaY);
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        coordenadaX = 2;
        coordenadaY = 1;
        processarJogo(bt8, coordenadaX, coordenadaY);
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        coordenadaX = 2;
        coordenadaY = 2;
        processarJogo(bt9, coordenadaX, coordenadaY);
    }//GEN-LAST:event_bt9ActionPerformed

    private void btMenuNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuNovoJogoActionPerformed
        limparIniciarJogo();
    }//GEN-LAST:event_btMenuNovoJogoActionPerformed

    private void btMenuSairJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuSairJogoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btMenuSairJogoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JMenuItem btMenuNovoJogo;
    private javax.swing.JMenuItem btMenuSairJogo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblResultado;
    // End of variables declaration//GEN-END:variables

    public void iniciarJogo(){
        qtdRodadas = 0;
        jogador = player;
        botao[0] = bt1;
        botao[1] = bt2;
        botao[2] = bt3;
        botao[3] = bt4;
        botao[4] = bt5;
        botao[5] = bt6;
        botao[6] = bt7;
        botao[7] = bt8;
        botao[8] = bt9;
    }
    
    public void processarJogo(JButton bt, int x, int y){
        
        if(jogador == player){
            tabuleiro[x][y] = player;
            bt.setEnabled(false);
            bt.setText("X");
            isVencedor = checarVitoria(player);
            if(isVencedor){
                acabou = encerrarJogo();
                lblResultado.setText("Parabéns, você venceu!");
            }
            qtdRodadas++;
            if(!acabou){
                escolherMaquina();
                isVencedor = checarVitoria(maquina);
                if(isVencedor){
                    lblResultado.setText("Que pena, você perdeu...");
                    encerrarJogo();
                    jogador = player;
                    qtdRodadas++;
                }
            }        
        }
        if(qtdRodadas == 9){
            lblResultado.setText("Ora ora, temos um empate!");
        }
    }
    
    public boolean checarVitoria(int jogador){
        
        for(int i = 0; i < tabuleiro.length; i++){
            if(tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador){
                return true;
            }
            
            if(tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador){
                return true;
            }   
        }
        if(tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador){
            return true;
        }
        
        if(tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador){
            return true;
        }
        return false;
    }
    
    public boolean encerrarJogo(){
        for(int i = 0; i < 9; i++){
            botao[i].setEnabled(false);
        }
        return true;
    }
    
    public void limparIniciarJogo(){
        for(int i = 0; i < 9; i++){
            botao[i].setEnabled(true);
            botao[i].setText(" ");
            iniciarJogo();
        }
    }
    
    public void escolherMaquina(){
        Random random = new Random();
        int escolhaMaquina = random.nextInt(8);
        if(botao[escolhaMaquina+1].isEnabled()){
            botao[escolhaMaquina+1].setEnabled(false);
            botao[escolhaMaquina+1].setText("O");
            switch(escolhaMaquina + 1){
                case 1:
                    tabuleiro[0][0] = maquina;
                    break;
                case 2:
                    tabuleiro[0][1] = maquina;
                    break;
                case 3:
                    tabuleiro[0][2] = maquina;
                    break;
                case 4:
                    tabuleiro[1][0] = maquina;
                    break;
                case 5:
                    tabuleiro[1][1] = maquina;
                    break;
                case 6:
                    tabuleiro[1][2] = maquina;
                    break;
                case 7:
                    tabuleiro[2][0] = maquina;
                    break;
                case 8:
                    tabuleiro[2][1] = maquina;
                    break;
                case 9:
                    tabuleiro[2][2] = maquina;
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Algo de errado com o programa.");
            }
        } else {
            escolherMaquina();
        }
        
        
        
        
    }
}
