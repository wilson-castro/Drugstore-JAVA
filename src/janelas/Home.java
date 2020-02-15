/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Wilson 2c
 */
public class Home extends javax.swing.JFrame {
    DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
    DateFormat hour = new SimpleDateFormat("HH:mm");
    
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null); 
        Thread relogioThread = new Thread(new Home.HoraThread());
        relogioThread.start();    
    }
    
    public class HoraThread implements Runnable{
    
    @Override
    public void run(){
        
        while(true){
            date.setText(data.format(new Date()));
            Hora.setText("Horário : "+(hour.format(new Date())));
            
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ex){
                System.out.println("Thread not completed"+ex);
            }
        }
    }
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Fundo = new javax.swing.JPanel();
        jPanel_Apr = new javax.swing.JPanel();
        jLabel_Img1 = new javax.swing.JLabel();
        jLabel_Apresenta = new javax.swing.JLabel();
        jPanel_Divzinha = new javax.swing.JPanel();
        jLabel_Sair = new javax.swing.JLabel();
        jLabel_Minimizar = new javax.swing.JLabel();
        jPanel_BoasVindas = new javax.swing.JPanel();
        jLabel_aprovei = new javax.swing.JLabel();
        Hora = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jPanel_Fund_cadastre_se = new javax.swing.JPanel();
        jLabel_cadastre_se = new javax.swing.JLabel();
        jPanel_Login = new javax.swing.JPanel();
        jLabel_login = new javax.swing.JLabel();
        jPanel_rodapé = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel_Fundo.setBackground(new java.awt.Color(28, 48, 72));
        jPanel_Fundo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(32, 52, 71)));
        jPanel_Fundo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel_FundoMouseDragged(evt);
            }
        });

        jPanel_Apr.setBackground(new java.awt.Color(28, 48, 67));
        jPanel_Apr.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));

        jLabel_Img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-pills-128.png"))); // NOI18N
        jLabel_Img1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel_Img1.setAlignmentY(0.0F);

        jLabel_Apresenta.setFont(new java.awt.Font("Lucida Handwriting", 3, 24)); // NOI18N
        jLabel_Apresenta.setForeground(java.awt.Color.white);
        jLabel_Apresenta.setText("Emrakul Store ");

        jPanel_Divzinha.setBackground(new java.awt.Color(2, 93, 163));
        jPanel_Divzinha.setPreferredSize(new java.awt.Dimension(3, 60));
        jPanel_Divzinha.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel_DivzinhaLayout = new javax.swing.GroupLayout(jPanel_Divzinha);
        jPanel_Divzinha.setLayout(jPanel_DivzinhaLayout);
        jPanel_DivzinhaLayout.setHorizontalGroup(
            jPanel_DivzinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel_DivzinhaLayout.setVerticalGroup(
            jPanel_DivzinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jLabel_Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-exit-32(3).png"))); // NOI18N
        jLabel_Sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_SairMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_SairMouseClicked(evt);
            }
        });

        jLabel_Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-minimizar-janela-filled-32.png"))); // NOI18N
        jLabel_Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_MinimizarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_AprLayout = new javax.swing.GroupLayout(jPanel_Apr);
        jPanel_Apr.setLayout(jPanel_AprLayout);
        jPanel_AprLayout.setHorizontalGroup(
            jPanel_AprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AprLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel_Img1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_Divzinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_AprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_AprLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel_Minimizar))
                    .addGroup(jPanel_AprLayout.createSequentialGroup()
                        .addComponent(jLabel_Apresenta)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(4, 4, 4)
                .addComponent(jLabel_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel_AprLayout.setVerticalGroup(
            jPanel_AprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AprLayout.createSequentialGroup()
                .addGroup(jPanel_AprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_AprLayout.createSequentialGroup()
                        .addGroup(jPanel_AprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_AprLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel_AprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel_Divzinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_Apresenta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel_AprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel_Sair, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                                .addComponent(jLabel_Minimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(jPanel_AprLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_Img1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel_BoasVindas.setBackground(new java.awt.Color(47, 71, 94));

        jLabel_aprovei.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel_aprovei.setForeground(new java.awt.Color(182, 216, 240));
        jLabel_aprovei.setText("Então esse é o fim...");
        jLabel_aprovei.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel_aproveiMouseDragged(evt);
            }
        });
        jLabel_aprovei.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_aproveiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_aproveiMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel_aproveiMouseReleased(evt);
            }
        });

        Hora.setForeground(new java.awt.Color(182, 216, 240));
        Hora.setText("jLabel1");

        date.setForeground(new java.awt.Color(182, 216, 240));
        date.setText("jLabel1");

        javax.swing.GroupLayout jPanel_BoasVindasLayout = new javax.swing.GroupLayout(jPanel_BoasVindas);
        jPanel_BoasVindas.setLayout(jPanel_BoasVindasLayout);
        jPanel_BoasVindasLayout.setHorizontalGroup(
            jPanel_BoasVindasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BoasVindasLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel_aprovei)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel_BoasVindasLayout.setVerticalGroup(
            jPanel_BoasVindasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BoasVindasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_BoasVindasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_aprovei, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                    .addComponent(Hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(date))
                .addContainerGap())
        );

        jPanel_Fund_cadastre_se.setBackground(new java.awt.Color(32, 52, 71));

        jLabel_cadastre_se.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-adicionar-128.png"))); // NOI18N
        jLabel_cadastre_se.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_cadastre_se.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_cadastre_seMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_Fund_cadastre_seLayout = new javax.swing.GroupLayout(jPanel_Fund_cadastre_se);
        jPanel_Fund_cadastre_se.setLayout(jPanel_Fund_cadastre_seLayout);
        jPanel_Fund_cadastre_seLayout.setHorizontalGroup(
            jPanel_Fund_cadastre_seLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_cadastre_se, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_Fund_cadastre_seLayout.setVerticalGroup(
            jPanel_Fund_cadastre_seLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_cadastre_se, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel_Login.setBackground(new java.awt.Color(32, 52, 71));

        jLabel_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-administrador-masculino-128.png"))); // NOI18N
        jLabel_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_loginMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_LoginLayout = new javax.swing.GroupLayout(jPanel_Login);
        jPanel_Login.setLayout(jPanel_LoginLayout);
        jPanel_LoginLayout.setHorizontalGroup(
            jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_LoginLayout.setVerticalGroup(
            jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel_rodapé.setBackground(new java.awt.Color(28, 48, 67));

        javax.swing.GroupLayout jPanel_rodapéLayout = new javax.swing.GroupLayout(jPanel_rodapé);
        jPanel_rodapé.setLayout(jPanel_rodapéLayout);
        jPanel_rodapéLayout.setHorizontalGroup(
            jPanel_rodapéLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_rodapéLayout.setVerticalGroup(
            jPanel_rodapéLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel_FundoLayout = new javax.swing.GroupLayout(jPanel_Fundo);
        jPanel_Fundo.setLayout(jPanel_FundoLayout);
        jPanel_FundoLayout.setHorizontalGroup(
            jPanel_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_BoasVindas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_FundoLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jPanel_Fund_cadastre_se, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jPanel_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addComponent(jPanel_rodapé, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_Apr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_FundoLayout.setVerticalGroup(
            jPanel_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FundoLayout.createSequentialGroup()
                .addComponent(jPanel_Apr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_BoasVindas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_Fund_cadastre_se, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jPanel_rodapé, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_aproveiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_aproveiMouseEntered
        jLabel_aprovei.setForeground(new java.awt.Color(34,154,238));
    }//GEN-LAST:event_jLabel_aproveiMouseEntered

    private void jLabel_aproveiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_aproveiMouseReleased
    }//GEN-LAST:event_jLabel_aproveiMouseReleased

    private void jLabel_aproveiMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_aproveiMouseDragged
    }//GEN-LAST:event_jLabel_aproveiMouseDragged

    private void jLabel_aproveiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_aproveiMouseExited
        jLabel_aprovei.setForeground(new java.awt.Color(182,216,240));
    }//GEN-LAST:event_jLabel_aproveiMouseExited

    private void jLabel_SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SairMouseClicked
    }//GEN-LAST:event_jLabel_SairMouseClicked

    private void jLabel_cadastre_seMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_cadastre_seMousePressed
        this.dispose();
        new Cadastro().setVisible(true);
    }//GEN-LAST:event_jLabel_cadastre_seMousePressed

    private void jLabel_loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_loginMousePressed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jLabel_loginMousePressed

    private void jLabel_MinimizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizarMousePressed
        this.setExtendedState(this.ICONIFIED); 
    }//GEN-LAST:event_jLabel_MinimizarMousePressed

    private void jLabel_SairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SairMousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel_SairMousePressed

    private void jPanel_FundoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_FundoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x, y);
    }//GEN-LAST:event_jPanel_FundoMouseDragged
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hora;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel_Apresenta;
    private javax.swing.JLabel jLabel_Img1;
    private javax.swing.JLabel jLabel_Minimizar;
    private javax.swing.JLabel jLabel_Sair;
    private javax.swing.JLabel jLabel_aprovei;
    private javax.swing.JLabel jLabel_cadastre_se;
    private javax.swing.JLabel jLabel_login;
    private javax.swing.JPanel jPanel_Apr;
    private javax.swing.JPanel jPanel_BoasVindas;
    private javax.swing.JPanel jPanel_Divzinha;
    private javax.swing.JPanel jPanel_Fund_cadastre_se;
    private javax.swing.JPanel jPanel_Fundo;
    private javax.swing.JPanel jPanel_Login;
    private javax.swing.JPanel jPanel_rodapé;
    // End of variables declaration//GEN-END:variables
}
