package janelas;

/**
 *
 * @author Wilson 2c
 */

import code.status;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
    DateFormat hour = new SimpleDateFormat("HH:mm");
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null); 
        Thread relogioThread = new Thread(new Login.HoraThread());
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
        jLabel_minimizar = new javax.swing.JLabel();
        jPanel_BoasVindas = new javax.swing.JPanel();
        jLabel_Home = new javax.swing.JLabel();
        Hora = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_img = new javax.swing.JLabel();
        jPanel_F_Nome = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTF_Nome = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel_senha = new javax.swing.JLabel();
        jPanel_F_Cast = new javax.swing.JPanel();
        jLabel_Cadastrar = new javax.swing.JLabel();
        jPanel_Limpar = new javax.swing.JPanel();
        jLabel_Limpar = new javax.swing.JLabel();
        jP_senha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel_Fundo.setBackground(new java.awt.Color(28, 48, 72));
        jPanel_Fundo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 48, 67)));
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
        jLabel_Sair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel_Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_SairMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_SairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_SairMouseEntered(evt);
            }
        });

        jLabel_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-minimizar-janela-filled-32.png"))); // NOI18N
        jLabel_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_minimizarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_AprLayout = new javax.swing.GroupLayout(jPanel_Apr);
        jPanel_Apr.setLayout(jPanel_AprLayout);
        jPanel_AprLayout.setHorizontalGroup(
            jPanel_AprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AprLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel_Img1)
                .addGap(10, 10, 10)
                .addComponent(jPanel_Divzinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Apresenta)
                .addGap(93, 93, 93)
                .addComponent(jLabel_minimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel_AprLayout.setVerticalGroup(
            jPanel_AprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AprLayout.createSequentialGroup()
                .addGroup(jPanel_AprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_AprLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel_AprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel_Divzinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Apresenta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Img1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_AprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel_Sair, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(jLabel_minimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel_BoasVindas.setBackground(new java.awt.Color(47, 71, 94));

        jLabel_Home.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Home.setForeground(new java.awt.Color(182, 216, 240));
        jLabel_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-left-24.png"))); // NOI18N
        jLabel_Home.setText("HOME");
        jLabel_Home.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel_HomeMouseDragged(evt);
            }
        });
        jLabel_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_HomeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_HomeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel_HomeMouseReleased(evt);
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
                .addComponent(jLabel_Home)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(jPanel_BoasVindasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_BoasVindasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(date)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel_BoasVindasLayout.setVerticalGroup(
            jPanel_BoasVindasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BoasVindasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_BoasVindasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel_BoasVindasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_BoasVindasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(date)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });

        jLabel_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-administrador-masculino-48.png"))); // NOI18N

        jPanel_F_Nome.setBackground(new java.awt.Color(2, 93, 163));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText(" Nome : ");

        javax.swing.GroupLayout jPanel_F_NomeLayout = new javax.swing.GroupLayout(jPanel_F_Nome);
        jPanel_F_Nome.setLayout(jPanel_F_NomeLayout);
        jPanel_F_NomeLayout.setHorizontalGroup(
            jPanel_F_NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        jPanel_F_NomeLayout.setVerticalGroup(
            jPanel_F_NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTF_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_NomeActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(2, 93, 163));

        jLabel_senha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_senha.setForeground(java.awt.Color.white);
        jLabel_senha.setText(" Senha : ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_senha)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel_F_Cast.setBackground(new java.awt.Color(2, 93, 163));

        jLabel_Cadastrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Cadastrar.setForeground(java.awt.Color.white);
        jLabel_Cadastrar.setText("    Entrar");
        jLabel_Cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_CadastrarMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CadastrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_F_CastLayout = new javax.swing.GroupLayout(jPanel_F_Cast);
        jPanel_F_Cast.setLayout(jPanel_F_CastLayout);
        jPanel_F_CastLayout.setHorizontalGroup(
            jPanel_F_CastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_F_CastLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel_F_CastLayout.setVerticalGroup(
            jPanel_F_CastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel_Limpar.setBackground(new java.awt.Color(2, 93, 163));

        jLabel_Limpar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Limpar.setForeground(java.awt.Color.white);
        jLabel_Limpar.setText("   Limpar ");
        jLabel_Limpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_LimparMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_LimparMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_LimparLayout = new javax.swing.GroupLayout(jPanel_Limpar);
        jPanel_Limpar.setLayout(jPanel_LimparLayout);
        jPanel_LimparLayout.setHorizontalGroup(
            jPanel_LimparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Limpar, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );
        jPanel_LimparLayout.setVerticalGroup(
            jPanel_LimparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel_F_Cast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel_F_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTF_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jP_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel_img)))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jP_senha, jTF_Nome});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_img)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel_F_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jP_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel_Limpar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_F_Cast, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jP_senha, jTF_Nome});

        javax.swing.GroupLayout jPanel_FundoLayout = new javax.swing.GroupLayout(jPanel_Fundo);
        jPanel_Fundo.setLayout(jPanel_FundoLayout);
        jPanel_FundoLayout.setHorizontalGroup(
            jPanel_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_BoasVindas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_FundoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel_Apr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_FundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_FundoLayout.setVerticalGroup(
            jPanel_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FundoLayout.createSequentialGroup()
                .addComponent(jPanel_Apr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_BoasVindas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_HomeMouseEntered
        jLabel_Home.setForeground(new java.awt.Color(34,154,238));
    }//GEN-LAST:event_jLabel_HomeMouseEntered

    private void jLabel_HomeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_HomeMouseReleased
        
    }//GEN-LAST:event_jLabel_HomeMouseReleased

    private void jLabel_HomeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_HomeMouseDragged
    }//GEN-LAST:event_jLabel_HomeMouseDragged

    private void jLabel_HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_HomeMouseExited
        jLabel_Home.setForeground(new java.awt.Color(182,216,240));
    }//GEN-LAST:event_jLabel_HomeMouseExited

    private void jLabel_SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SairMouseClicked
        dispose();
    }//GEN-LAST:event_jLabel_SairMouseClicked

    private void jLabel_SairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SairMouseEntered
        jLabel_Sair.setForeground(new java.awt.Color(34,154,238));
    }//GEN-LAST:event_jLabel_SairMouseEntered

    private void jLabel_HomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_HomeMousePressed
        this.dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_jLabel_HomeMousePressed

    private void jTF_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_NomeActionPerformed

    private void jLabel_LimparMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_LimparMouseEntered

    }//GEN-LAST:event_jLabel_LimparMouseEntered

    private void jLabel_LimparMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_LimparMousePressed
        jTF_Nome.setText(""); 
        jP_senha.setText("");
        }//GEN-LAST:event_jLabel_LimparMousePressed

    private void jLabel_CadastrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CadastrarMousePressed
        String login = jTF_Nome.getText(), senha = new String(jP_senha.getPassword());
        if(login.equals("") || senha.equals(""))
            JOptionPane.showMessageDialog(this,"Algum dos campos não está preenchido.");   
        else if(login.equals("gerente") && senha.equals(".-."))
        {
            JOptionPane.showMessageDialog(this,"Login efetuado com sucesso!!");
            JOptionPane.showMessageDialog(this,"Seja Bem-Vindo Gerente!");
            this.dispose();
            new gerente().setVisible(true);
        }
        else if(!login.equals("gerente") && !senha.equals(".-."))
        {
            try
            {
                String inf[] = new status().chamar();
                for (int i = 0; i < Integer.parseInt(inf[0]); i++) 
                {
                    BufferedReader ler = new BufferedReader(new FileReader(new File("database/user/"+i+".txt")));
                    String loginA = ler.readLine(), senhaA = ler.readLine();
                    if(login.equals(loginA) && senha.equals(senhaA)){
                        JOptionPane.showMessageDialog(this,"Login efetuado com sucesso!!");
                        JOptionPane.showMessageDialog(this,"Seja Bem-Vindo "+login);
                        this.dispose();
                        new gerente().setVisible(true);
                        break;
                    }
                    else if(login.equals(loginA) || senha.equals(senhaA)){
                        JOptionPane.showMessageDialog(this, "Login ou Senha está errado.");
                        break;
                    }    
                }
            }
            catch(IOException e){}
        }
        else
            JOptionPane.showMessageDialog(this, "Usuário não cadastrado.");
    }//GEN-LAST:event_jLabel_CadastrarMousePressed

    private void jLabel_minimizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizarMousePressed
        this.setExtendedState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel_minimizarMousePressed

    private void jLabel_CadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CadastrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_CadastrarMouseClicked

    private void jLabel_SairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SairMousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel_SairMousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged

    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel_FundoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_FundoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x, y);
    }//GEN-LAST:event_jPanel_FundoMouseDragged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hora;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Apresenta;
    private javax.swing.JLabel jLabel_Cadastrar;
    private javax.swing.JLabel jLabel_Home;
    private javax.swing.JLabel jLabel_Img1;
    private javax.swing.JLabel jLabel_Limpar;
    private javax.swing.JLabel jLabel_Sair;
    private javax.swing.JLabel jLabel_img;
    private javax.swing.JLabel jLabel_minimizar;
    private javax.swing.JLabel jLabel_senha;
    private javax.swing.JPasswordField jP_senha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Apr;
    private javax.swing.JPanel jPanel_BoasVindas;
    private javax.swing.JPanel jPanel_Divzinha;
    private javax.swing.JPanel jPanel_F_Cast;
    private javax.swing.JPanel jPanel_F_Nome;
    private javax.swing.JPanel jPanel_Fundo;
    private javax.swing.JPanel jPanel_Limpar;
    private javax.swing.JTextField jTF_Nome;
    // End of variables declaration//GEN-END:variables
}
