/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import code.status;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Wilson 2c
 */
public class Cadastro extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
    DateFormat hour = new SimpleDateFormat("HH:mm");
    
    public Cadastro() {
        initComponents();
        this.setLocationRelativeTo(null); 
        Thread relogioThread = new Thread(new Cadastro.HoraThread());
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

 
       public String Status() throws IOException{
        BufferedReader ler = new BufferedReader(new FileReader(new File("database/status.txt")));
        String cod = ler.readLine();
        return cod;
    }
     public void Limpar(){
    jFT_DT.setText("");
    jFT_Tele.setText("");
    jT_Bairro.setText("");
    jT_Comp.setText("");
    jT_id.setText("");
    jT_Nome.setText("");
    jT_NC.setText("");
    jT_end.setText("");
    jP_senha.setText(""); 
    }
    public void cad() throws IOException{
        String inf[] = new status().chamar();
        PrintStream print = new PrintStream(new File("database/user/"+inf[0]+".txt"));
        String user = jT_Nome.getText(), senha = new String (jP_senha.getPassword()), end = jT_end.getText(), numc = jT_NC.getText(),
        comp = jT_Comp.getText(), bairro = jT_Bairro.getText(), numt = jFT_Tele.getText(), dt = jFT_DT.getText(),idade = jT_id.getText();
        print.println(user);
        print.println(senha);
        print.println(end);
        print.println(numc);
        print.println(comp);
        print.println(bairro);
        print.println(numt);
        print.println(dt);
        print.println(idade);
        JOptionPane.showMessageDialog(this, "Cadastro Realizado com Sucesso");
        Limpar();
        jFT_DT.setBackground(Color.WHITE);
        jFT_Tele.setBackground(Color.WHITE);
        jT_Bairro.setBackground(Color.WHITE);
        jT_Comp.setBackground(Color.WHITE);
        jT_id.setBackground(Color.WHITE);
        jT_Nome.setBackground(Color.WHITE);
        jT_NC.setBackground(Color.WHITE);
        jT_end.setBackground(Color.WHITE);
        jP_senha.setBackground(Color.WHITE); 
        print = new PrintStream(new File("database/status.txt"));
        inf[0] = Integer.toString(Integer.parseInt(inf[0])+1);
        new status().escrever(inf);
        print.close();
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
        jLabel_minimizar = new javax.swing.JLabel();
        jPanel_BoasVindas = new javax.swing.JPanel();
        jLabel_Home = new javax.swing.JLabel();
        Hora = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jPanel_FundoCadastro = new javax.swing.JPanel();
        jLabel_img_usuario = new javax.swing.JLabel();
        jPanel_nm = new javax.swing.JPanel();
        jLabel_nomeUser = new javax.swing.JLabel();
        jT_Nome = new javax.swing.JTextField();
        jPanel_FundoSenha = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jP_senha = new javax.swing.JPasswordField();
        jPanel_Fundo_ende = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jT_end = new javax.swing.JTextField();
        jPanel_Fundo_num = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jT_NC = new javax.swing.JTextField();
        jPanel_Fundo_Bairro = new javax.swing.JPanel();
        jLabel_Bairro = new javax.swing.JLabel();
        jT_Bairro = new javax.swing.JTextField();
        jPanel_Fundo_complemento = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jT_Comp = new javax.swing.JTextField();
        jPanel_Fundo_Tel = new javax.swing.JPanel();
        jLabel_Telefone = new javax.swing.JLabel();
        jFT_Tele = new javax.swing.JFormattedTextField();
        jPanel_Fundo_Nasc = new javax.swing.JPanel();
        jLabel_DT_Nasc = new javax.swing.JLabel();
        jFT_DT = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel_Idade = new javax.swing.JLabel();
        jT_id = new javax.swing.JTextField();
        JPanel_FundoCadastr = new javax.swing.JPanel();
        jLabel_Cadastr = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_Limpar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel_Fundo.setBackground(new java.awt.Color(240, 242, 247));
        jPanel_Fundo.setForeground(java.awt.Color.white);
        jPanel_Fundo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel_FundoMouseDragged(evt);
            }
        });
        jPanel_Fundo.setLayout(null);

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
                .addGap(25, 25, 25)
                .addComponent(jLabel_Img1)
                .addGap(10, 10, 10)
                .addComponent(jPanel_Divzinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_AprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_AprLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel_minimizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_AprLayout.createSequentialGroup()
                        .addComponent(jLabel_Apresenta)
                        .addGap(63, 371, Short.MAX_VALUE))))
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
                .addGap(0, 27, Short.MAX_VALUE))
        );

        jPanel_Fundo.add(jPanel_Apr);
        jPanel_Apr.setBounds(0, 0, 770, 130);

        jPanel_BoasVindas.setBackground(new java.awt.Color(47, 71, 94));
        jPanel_BoasVindas.setLayout(null);

        jLabel_Home.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Home.setForeground(new java.awt.Color(182, 216, 240));
        jLabel_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-left-24.png"))); // NOI18N
        jLabel_Home.setText("Home");
        jLabel_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_HomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_HomeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_HomeMousePressed(evt);
            }
        });
        jPanel_BoasVindas.add(jLabel_Home);
        jLabel_Home.setBounds(34, 20, 90, 30);

        Hora.setForeground(new java.awt.Color(182, 216, 240));
        Hora.setText("jLabel1");
        jPanel_BoasVindas.add(Hora);
        Hora.setBounds(20, 320, 120, 60);

        date.setForeground(new java.awt.Color(182, 216, 240));
        date.setText("jLabel1");
        jPanel_BoasVindas.add(date);
        date.setBounds(20, 300, 110, 14);

        jPanel_Fundo.add(jPanel_BoasVindas);
        jPanel_BoasVindas.setBounds(0, 116, 160, 470);

        jPanel_FundoCadastro.setBackground(java.awt.Color.white);
        jPanel_FundoCadastro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(2, 93, 163), 1, true));
        jPanel_FundoCadastro.setLayout(null);

        jLabel_img_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-user-48.png"))); // NOI18N
        jPanel_FundoCadastro.add(jLabel_img_usuario);
        jLabel_img_usuario.setBounds(200, 10, 50, 50);

        jPanel_nm.setBackground(new java.awt.Color(2, 93, 163));

        jLabel_nomeUser.setBackground(java.awt.Color.white);
        jLabel_nomeUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nomeUser.setForeground(java.awt.Color.white);
        jLabel_nomeUser.setText(" Nome de Usuário  : ");

        javax.swing.GroupLayout jPanel_nmLayout = new javax.swing.GroupLayout(jPanel_nm);
        jPanel_nm.setLayout(jPanel_nmLayout);
        jPanel_nmLayout.setHorizontalGroup(
            jPanel_nmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_nomeUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_nmLayout.setVerticalGroup(
            jPanel_nmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_nmLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_nomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel_FundoCadastro.add(jPanel_nm);
        jPanel_nm.setBounds(40, 80, 122, 24);
        jPanel_FundoCadastro.add(jT_Nome);
        jT_Nome.setBounds(170, 80, 150, 24);

        jPanel_FundoSenha.setBackground(new java.awt.Color(2, 93, 163));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText(" Senha :");

        javax.swing.GroupLayout jPanel_FundoSenhaLayout = new javax.swing.GroupLayout(jPanel_FundoSenha);
        jPanel_FundoSenha.setLayout(jPanel_FundoSenhaLayout);
        jPanel_FundoSenhaLayout.setHorizontalGroup(
            jPanel_FundoSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        jPanel_FundoSenhaLayout.setVerticalGroup(
            jPanel_FundoSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        jPanel_FundoCadastro.add(jPanel_FundoSenha);
        jPanel_FundoSenha.setBounds(40, 120, 70, 24);
        jPanel_FundoCadastro.add(jP_senha);
        jP_senha.setBounds(130, 120, 90, 24);

        jPanel_Fundo_ende.setBackground(new java.awt.Color(2, 93, 163));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText(" Endereço  :");

        javax.swing.GroupLayout jPanel_Fundo_endeLayout = new javax.swing.GroupLayout(jPanel_Fundo_ende);
        jPanel_Fundo_ende.setLayout(jPanel_Fundo_endeLayout);
        jPanel_Fundo_endeLayout.setHorizontalGroup(
            jPanel_Fundo_endeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Fundo_endeLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel_Fundo_endeLayout.setVerticalGroup(
            jPanel_Fundo_endeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Fundo_endeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel_FundoCadastro.add(jPanel_Fundo_ende);
        jPanel_Fundo_ende.setBounds(40, 170, 82, 24);

        jT_end.setPreferredSize(new java.awt.Dimension(59, 24));
        jT_end.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_endActionPerformed(evt);
            }
        });
        jPanel_FundoCadastro.add(jT_end);
        jT_end.setBounds(130, 170, 80, 24);

        jPanel_Fundo_num.setBackground(new java.awt.Color(2, 93, 163));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText(" Número : ");

        javax.swing.GroupLayout jPanel_Fundo_numLayout = new javax.swing.GroupLayout(jPanel_Fundo_num);
        jPanel_Fundo_num.setLayout(jPanel_Fundo_numLayout);
        jPanel_Fundo_numLayout.setHorizontalGroup(
            jPanel_Fundo_numLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Fundo_numLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 7, Short.MAX_VALUE))
        );
        jPanel_Fundo_numLayout.setVerticalGroup(
            jPanel_Fundo_numLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        jPanel_FundoCadastro.add(jPanel_Fundo_num);
        jPanel_Fundo_num.setBounds(230, 170, 70, 24);
        jPanel_FundoCadastro.add(jT_NC);
        jT_NC.setBounds(320, 170, 80, 24);

        jPanel_Fundo_Bairro.setBackground(new java.awt.Color(2, 93, 163));

        jLabel_Bairro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Bairro.setForeground(java.awt.Color.white);
        jLabel_Bairro.setText(" Bairro :");

        javax.swing.GroupLayout jPanel_Fundo_BairroLayout = new javax.swing.GroupLayout(jPanel_Fundo_Bairro);
        jPanel_Fundo_Bairro.setLayout(jPanel_Fundo_BairroLayout);
        jPanel_Fundo_BairroLayout.setHorizontalGroup(
            jPanel_Fundo_BairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Fundo_BairroLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel_Bairro))
        );
        jPanel_Fundo_BairroLayout.setVerticalGroup(
            jPanel_Fundo_BairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Fundo_BairroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel_FundoCadastro.add(jPanel_Fundo_Bairro);
        jPanel_Fundo_Bairro.setBounds(40, 210, 50, 24);
        jPanel_FundoCadastro.add(jT_Bairro);
        jT_Bairro.setBounds(100, 210, 90, 24);

        jPanel_Fundo_complemento.setBackground(new java.awt.Color(2, 93, 163));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText(" Complemento :");

        javax.swing.GroupLayout jPanel_Fundo_complementoLayout = new javax.swing.GroupLayout(jPanel_Fundo_complemento);
        jPanel_Fundo_complemento.setLayout(jPanel_Fundo_complementoLayout);
        jPanel_Fundo_complementoLayout.setHorizontalGroup(
            jPanel_Fundo_complementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Fundo_complementoLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        jPanel_Fundo_complementoLayout.setVerticalGroup(
            jPanel_Fundo_complementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Fundo_complementoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel_FundoCadastro.add(jPanel_Fundo_complemento);
        jPanel_Fundo_complemento.setBounds(200, 210, 100, 24);
        jPanel_FundoCadastro.add(jT_Comp);
        jT_Comp.setBounds(310, 210, 90, 24);

        jPanel_Fundo_Tel.setBackground(new java.awt.Color(2, 93, 163));

        jLabel_Telefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Telefone.setForeground(java.awt.Color.white);
        jLabel_Telefone.setText(" Telefone : ");

        javax.swing.GroupLayout jPanel_Fundo_TelLayout = new javax.swing.GroupLayout(jPanel_Fundo_Tel);
        jPanel_Fundo_Tel.setLayout(jPanel_Fundo_TelLayout);
        jPanel_Fundo_TelLayout.setHorizontalGroup(
            jPanel_Fundo_TelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Fundo_TelLayout.createSequentialGroup()
                .addComponent(jLabel_Telefone)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel_Fundo_TelLayout.setVerticalGroup(
            jPanel_Fundo_TelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Fundo_TelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel_FundoCadastro.add(jPanel_Fundo_Tel);
        jPanel_Fundo_Tel.setBounds(40, 300, 70, 24);

        try {
            jFT_Tele.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(85) 9 ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel_FundoCadastro.add(jFT_Tele);
        jFT_Tele.setBounds(130, 300, 110, 24);

        jPanel_Fundo_Nasc.setBackground(new java.awt.Color(2, 93, 163));

        jLabel_DT_Nasc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_DT_Nasc.setForeground(java.awt.Color.white);
        jLabel_DT_Nasc.setText(" Data de Nascimento : ");

        javax.swing.GroupLayout jPanel_Fundo_NascLayout = new javax.swing.GroupLayout(jPanel_Fundo_Nasc);
        jPanel_Fundo_Nasc.setLayout(jPanel_Fundo_NascLayout);
        jPanel_Fundo_NascLayout.setHorizontalGroup(
            jPanel_Fundo_NascLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Fundo_NascLayout.createSequentialGroup()
                .addComponent(jLabel_DT_Nasc)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel_Fundo_NascLayout.setVerticalGroup(
            jPanel_Fundo_NascLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Fundo_NascLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_DT_Nasc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel_FundoCadastro.add(jPanel_Fundo_Nasc);
        jPanel_Fundo_Nasc.setBounds(40, 260, 140, 24);

        try {
            jFT_DT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFT_DT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFT_DTActionPerformed(evt);
            }
        });
        jPanel_FundoCadastro.add(jFT_DT);
        jFT_DT.setBounds(200, 260, 70, 24);

        jPanel1.setBackground(new java.awt.Color(2, 93, 163));

        jLabel_Idade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Idade.setForeground(java.awt.Color.white);
        jLabel_Idade.setText(" Idade : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_Idade)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel_FundoCadastro.add(jPanel1);
        jPanel1.setBounds(280, 260, 60, 24);
        jPanel_FundoCadastro.add(jT_id);
        jT_id.setBounds(350, 260, 50, 24);

        JPanel_FundoCadastr.setBackground(new java.awt.Color(2, 93, 163));
        JPanel_FundoCadastr.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));

        jLabel_Cadastr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Cadastr.setForeground(java.awt.Color.white);
        jLabel_Cadastr.setText(" Cadastrar");
        jLabel_Cadastr.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jLabel_Cadastr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_CadastrMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CadastrMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JPanel_FundoCadastrLayout = new javax.swing.GroupLayout(JPanel_FundoCadastr);
        JPanel_FundoCadastr.setLayout(JPanel_FundoCadastrLayout);
        JPanel_FundoCadastrLayout.setHorizontalGroup(
            JPanel_FundoCadastrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Cadastr, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        JPanel_FundoCadastrLayout.setVerticalGroup(
            JPanel_FundoCadastrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Cadastr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel_FundoCadastro.add(JPanel_FundoCadastr);
        JPanel_FundoCadastr.setBounds(120, 340, 70, 30);

        jPanel2.setBackground(new java.awt.Color(2, 93, 163));

        jLabel_Limpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Limpar.setForeground(java.awt.Color.white);
        jLabel_Limpar.setText("  Refazer");
        jLabel_Limpar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jLabel_Limpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_LimparMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_LimparMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Limpar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Limpar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel_FundoCadastro.add(jPanel2);
        jPanel2.setBounds(240, 340, 60, 30);
        jPanel_FundoCadastro.add(jSeparator1);
        jSeparator1.setBounds(190, 350, 50, 10);
        jPanel_FundoCadastro.add(jSeparator2);
        jSeparator2.setBounds(190, 360, 50, 10);

        jPanel_Fundo.add(jPanel_FundoCadastro);
        jPanel_FundoCadastro.setBounds(270, 140, 450, 390);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Fundo, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Fundo, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SairMouseClicked
        
    }//GEN-LAST:event_jLabel_SairMouseClicked

    private void jLabel_SairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SairMouseEntered
        jLabel_Sair.setForeground(new java.awt.Color(182,216,240));
    }//GEN-LAST:event_jLabel_SairMouseEntered

    private void jLabel_HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_HomeMouseEntered
        jLabel_Home.setForeground(new java.awt.Color(34,154,238));
    }//GEN-LAST:event_jLabel_HomeMouseEntered

    private void jLabel_HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_HomeMouseExited
        jLabel_Home.setForeground(new java.awt.Color(182,216,240));
    }//GEN-LAST:event_jLabel_HomeMouseExited

    private void jFT_DTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFT_DTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFT_DTActionPerformed

    private void jLabel_LimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_LimparMouseClicked

    
    }//GEN-LAST:event_jLabel_LimparMouseClicked

    private void jLabel_CadastrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CadastrMouseClicked
               
    }//GEN-LAST:event_jLabel_CadastrMouseClicked

    private void jLabel_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_HomeMouseClicked
       
    }//GEN-LAST:event_jLabel_HomeMouseClicked

    private void jLabel_HomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_HomeMousePressed
        Home home = new Home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel_HomeMousePressed

    private void jLabel_SairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SairMousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel_SairMousePressed

    private void jLabel_minimizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizarMousePressed
        this.setExtendedState(this.ICONIFIED);
        
    }//GEN-LAST:event_jLabel_minimizarMousePressed

    private void jT_endActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_endActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_endActionPerformed

    private void jLabel_CadastrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CadastrMousePressed
        boolean certo = true;
        String Usuario = jT_Nome.getText(),Senha = new String(jP_senha.getPassword()),
        ende = jT_end.getText(),Tele = jFT_Tele.getText(),Bairro = jT_Bairro.getText(),
        DatN= jFT_DT.getText();
        

            if (Usuario.equals("")) {
                certo = false;
            jT_Nome.setBackground(new java.awt.Color(255,51,51));
        }
            if(Senha.equals("")){
                certo = false;
            jP_senha.setBackground(new java.awt.Color(255,51,51));    
        }
            if (Bairro.equals("")) {
                certo = false;
            jT_Bairro.setBackground(new java.awt.Color(255,51,51)); 
        }
            if (ende.equals("")) {
                certo = false;
            jT_end.setBackground(new java.awt.Color(255,51,51));
        }
            if (Tele.equals("")) {
                certo = false;
            jFT_Tele.setBackground(new java.awt.Color(255,51,51));
        }
            if (DatN.equals("")) {
                certo = false;
            jFT_DT.setBackground(new java.awt.Color(255,51,51));
        }
            try{
           int numc = Integer.parseInt(jT_NC.getText()); 
        }
        catch(NumberFormatException e){
            jT_NC.setBackground(new java.awt.Color(255,51,51));
            certo = false;
        }
            try{
           int idade = Integer.parseInt(jT_id.getText()); 
        }
        catch(NumberFormatException e){
            jT_id.setBackground(new java.awt.Color(255,51,51));
            certo = false;
        }
            if(certo){
            try {
                cad();
            } catch (IOException ex) {}
        }
        else{
            JOptionPane.showMessageDialog(this, "Existem erros na sua ficha.");
        }
            
    }//GEN-LAST:event_jLabel_CadastrMousePressed

    private void jLabel_LimparMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_LimparMousePressed
Limpar();    }//GEN-LAST:event_jLabel_LimparMousePressed

    private void jPanel_FundoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_FundoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x, y);
    }//GEN-LAST:event_jPanel_FundoMouseDragged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hora;
    private javax.swing.JPanel JPanel_FundoCadastr;
    private javax.swing.JLabel date;
    private javax.swing.JFormattedTextField jFT_DT;
    private javax.swing.JFormattedTextField jFT_Tele;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_Apresenta;
    private javax.swing.JLabel jLabel_Bairro;
    private javax.swing.JLabel jLabel_Cadastr;
    private javax.swing.JLabel jLabel_DT_Nasc;
    private javax.swing.JLabel jLabel_Home;
    private javax.swing.JLabel jLabel_Idade;
    private javax.swing.JLabel jLabel_Img1;
    private javax.swing.JLabel jLabel_Limpar;
    private javax.swing.JLabel jLabel_Sair;
    private javax.swing.JLabel jLabel_Telefone;
    private javax.swing.JLabel jLabel_img_usuario;
    private javax.swing.JLabel jLabel_minimizar;
    private javax.swing.JLabel jLabel_nomeUser;
    private javax.swing.JPasswordField jP_senha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Apr;
    private javax.swing.JPanel jPanel_BoasVindas;
    private javax.swing.JPanel jPanel_Divzinha;
    private javax.swing.JPanel jPanel_Fundo;
    private javax.swing.JPanel jPanel_FundoCadastro;
    private javax.swing.JPanel jPanel_FundoSenha;
    private javax.swing.JPanel jPanel_Fundo_Bairro;
    private javax.swing.JPanel jPanel_Fundo_Nasc;
    private javax.swing.JPanel jPanel_Fundo_Tel;
    private javax.swing.JPanel jPanel_Fundo_complemento;
    private javax.swing.JPanel jPanel_Fundo_ende;
    private javax.swing.JPanel jPanel_Fundo_num;
    private javax.swing.JPanel jPanel_nm;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jT_Bairro;
    private javax.swing.JTextField jT_Comp;
    private javax.swing.JTextField jT_NC;
    private javax.swing.JTextField jT_Nome;
    private javax.swing.JTextField jT_end;
    private javax.swing.JTextField jT_id;
    // End of variables declaration//GEN-END:variables
}