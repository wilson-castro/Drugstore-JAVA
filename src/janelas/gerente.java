/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class gerente extends javax.swing.JFrame {
    DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
    DateFormat hour = new SimpleDateFormat("HH:mm");
    
    public gerente() {
        initComponents();
        this.setLocationRelativeTo(null); 
        Thread relogioThread = new Thread(new gerente.HoraThread());
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

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jPanel_BoasVindas1 = new javax.swing.JPanel();
        jLabel_Home = new javax.swing.JLabel();
        Hora = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jPanel_rodapé = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        jPanel_Fundo.setBackground(new java.awt.Color(28, 48, 67));
        jPanel_Fundo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(28, 48, 67), 4, true));
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

        jPanel_BoasVindas1.setBackground(new java.awt.Color(47, 71, 94));

        jLabel_Home.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Home.setForeground(new java.awt.Color(182, 216, 240));
        jLabel_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-farmacêutico-24.png"))); // NOI18N
        jLabel_Home.setText(" Controle da Loja  ");
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

        javax.swing.GroupLayout jPanel_BoasVindas1Layout = new javax.swing.GroupLayout(jPanel_BoasVindas1);
        jPanel_BoasVindas1.setLayout(jPanel_BoasVindas1Layout);
        jPanel_BoasVindas1Layout.setHorizontalGroup(
            jPanel_BoasVindas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BoasVindas1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel_Home)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel_BoasVindas1Layout.setVerticalGroup(
            jPanel_BoasVindas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BoasVindas1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_BoasVindas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(date))
                .addContainerGap())
        );

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
                        .addComponent(jLabel_Minimizar)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_AprLayout.createSequentialGroup()
                        .addComponent(jLabel_Apresenta)
                        .addContainerGap())))
            .addComponent(jPanel_BoasVindas1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel_AprLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_Img1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(55, 55, 55)
                .addComponent(jPanel_BoasVindas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        jPanel1.setBackground(new java.awt.Color(2, 93, 163));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("  Cadastro de Produtos  ");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jLabel1.getAccessibleContext().setAccessibleName("jLabel_");

        jPanel2.setBackground(new java.awt.Color(2, 93, 163));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText(" Consulta de Produtos");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(2, 93, 163));
        jPanel3.setPreferredSize(new java.awt.Dimension(164, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("  Relatório de Compra");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(2, 93, 163));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("    Vender");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(2, 93, 163));
        jPanel6.setPreferredSize(new java.awt.Dimension(164, 25));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("         Repor Estoque   ");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(2, 93, 163));
        jPanel7.setPreferredSize(new java.awt.Dimension(164, 25));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText(" Relatório de Venda");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(2, 93, 163));
        jPanel8.setPreferredSize(new java.awt.Dimension(164, 25));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("           Status ");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel_FundoLayout = new javax.swing.GroupLayout(jPanel_Fundo);
        jPanel_Fundo.setLayout(jPanel_FundoLayout);
        jPanel_FundoLayout.setHorizontalGroup(
            jPanel_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Apr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_rodapé, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_FundoLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_FundoLayout.createSequentialGroup()
                        .addGroup(jPanel_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_FundoLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_FundoLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_FundoLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))))
        );
        jPanel_FundoLayout.setVerticalGroup(
            jPanel_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FundoLayout.createSequentialGroup()
                .addComponent(jPanel_Apr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SairMouseClicked

    }//GEN-LAST:event_jLabel_SairMouseClicked

    private void jLabel_SairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SairMousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel_SairMousePressed

    private void jLabel_MinimizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizarMousePressed
        this.setExtendedState(this.ICONIFIED);

    }//GEN-LAST:event_jLabel_MinimizarMousePressed

    private void jLabel_HomeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_HomeMouseDragged

    }//GEN-LAST:event_jLabel_HomeMouseDragged

    private void jLabel_HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_HomeMouseEntered
        jLabel_Home.setForeground(new java.awt.Color(34,154,238));
    }//GEN-LAST:event_jLabel_HomeMouseEntered

    private void jLabel_HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_HomeMouseExited
        jLabel_Home.setForeground(new java.awt.Color(182,216,240));
    }//GEN-LAST:event_jLabel_HomeMouseExited

    private void jLabel_HomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_HomeMousePressed
        this.dispose();
        new Home().setVisible(true);  
    }//GEN-LAST:event_jLabel_HomeMousePressed

    private void jLabel_HomeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_HomeMouseReleased

    }//GEN-LAST:event_jLabel_HomeMouseReleased

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        this.dispose();
        new cadastroP().setVisible(true);
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        this.dispose();
        new consultaP().setVisible(true);
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        this.dispose();
        new reporE().setVisible(true);     
    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        this.dispose();
        new relV().setVisible(true);
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        this.dispose();
        new Status().setVisible(true);
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        this.dispose();
        new relC().setVisible(true);
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        this.dispose();
        new vender().setVisible(true);
    }//GEN-LAST:event_jLabel4MousePressed

    private void jPanel_FundoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_FundoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x, y);
    }//GEN-LAST:event_jPanel_FundoMouseDragged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hora;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Apresenta;
    private javax.swing.JLabel jLabel_Home;
    private javax.swing.JLabel jLabel_Img1;
    private javax.swing.JLabel jLabel_Minimizar;
    private javax.swing.JLabel jLabel_Sair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel_Apr;
    private javax.swing.JPanel jPanel_BoasVindas1;
    private javax.swing.JPanel jPanel_Divzinha;
    private javax.swing.JPanel jPanel_Fundo;
    private javax.swing.JPanel jPanel_rodapé;
    // End of variables declaration//GEN-END:variables
}
