/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import code.status;
import java.io.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
public class vender extends javax.swing.JFrame {
    public void limpar(){
        jT_E.setText("");
        jT_N.setText("");
        jT_P.setText("");
        jT_T.setText("");
        jL_P.setSelectedIndex(-1);
        jS_R.setValue(0);   
    }
    /**
     * Creates new form vender
     */
    public vender() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jT_T = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jL_P = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jT_N = new javax.swing.JTextField();
        jT_P = new javax.swing.JTextField();
        jT_E = new javax.swing.JTextField();
        jS_R = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel_Fundo.setBackground(new java.awt.Color(28, 48, 67));
        jPanel_Fundo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(28, 48, 67), 4, true));
        jPanel_Fundo.setForeground(new java.awt.Color(51, 51, 51));
        jPanel_Fundo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel_FundoMouseDragged(evt);
            }
        });

        jT_T.setEditable(false);
        jT_T.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(2, 93, 163));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(java.awt.Color.white);
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jL_P.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jL_PValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jL_P);

        jButton2.setBackground(new java.awt.Color(2, 93, 163));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(java.awt.Color.white);
        jButton2.setText("Vender");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jT_N.setEditable(false);
        jT_N.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jT_P.setEditable(false);
        jT_P.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jT_E.setEditable(false);
        jT_E.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jS_R.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jS_R.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jS_R.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jS_RAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jS_R.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jS_RFocusGained(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(2, 93, 163));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText(" Quantidade de venda : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(2, 93, 163));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText(" Estoque total : ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(2, 93, 163));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText(" Tipo :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(2, 93, 163));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText(" Preço(R$) :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(2, 93, 163));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("  Nome :");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel_FundoLayout = new javax.swing.GroupLayout(jPanel_Fundo);
        jPanel_Fundo.setLayout(jPanel_FundoLayout);
        jPanel_FundoLayout.setHorizontalGroup(
            jPanel_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_FundoLayout.createSequentialGroup()
                        .addGroup(jPanel_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jS_R)
                            .addComponent(jT_T, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jT_P, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jT_N, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jT_E, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_FundoLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jButton2)
                        .addGap(11, 11, 11)
                        .addComponent(jButton1)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel_FundoLayout.setVerticalGroup(
            jPanel_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FundoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_FundoLayout.createSequentialGroup()
                        .addGroup(jPanel_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jT_N)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jT_P)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jT_T)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jT_E)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jS_R, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGap(27, 27, 27)
                .addGroup(jPanel_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel_FundoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jS_R, jT_E, jT_N, jT_P, jT_T});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new gerente().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jL_PValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jL_PValueChanged
        String cod = jL_P.getSelectedValue();
        try{
                String inf[] = new status().chamar();
                for(int i = 0; i < Integer.parseInt(inf[1]); i++) {
                    BufferedReader ler = new BufferedReader(new FileReader(new File("database/produtos/"+i+".txt")));
                    String nome = ler.readLine();
                    if(cod.equals(nome)){
                        jT_N.setText(nome);
                        ler.readLine();
                        jT_P.setText(ler.readLine().replace(".",","));
                        jT_T.setText(ler.readLine());
                        jT_E.setText(ler.readLine());
                        ler.close();
                    }
                }
        } catch (IOException ex) {}
    }//GEN-LAST:event_jL_PValueChanged

    private void jS_RAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jS_RAncestorAdded

    }//GEN-LAST:event_jS_RAncestorAdded

    private void jS_RFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jS_RFocusGained

    }//GEN-LAST:event_jS_RFocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String cod = jL_P.getSelectedValue();  
            try{
                String inf[] = new status().chamar();
                for(int i = 0; i < Integer.parseInt(inf[1]); i++) {
                    BufferedReader ler = new BufferedReader(new FileReader(new File("database/produtos/"+i+".txt")));
                    String nome = ler.readLine();
                    if(cod.equals(nome)){
                        float precoF = Float.parseFloat(ler.readLine()), preco = Float.parseFloat(ler.readLine());
                        String tipo = ler.readLine();
                        int est = Integer.parseInt(ler.readLine());
                        int vender = (int) jS_R.getValue();
                        ler.close();
                        if(vender <= 0){
                            JOptionPane.showMessageDialog(this, "Valor escolhido inválido.");
                            limpar();
                        }
                        else if(vender > est){
                            JOptionPane.showMessageDialog(this,"Não tem estoque suficiente.");
                            limpar();
                        }
                        else{
                            JOptionPane.showMessageDialog(this,"Preço final: R$"+(preco * vender));
                            float money = Float.parseFloat(JOptionPane.showInputDialog(this,"Dinheiro dado pelo cliente: R$"));
                            int venda = 0;
                            while(money < (preco*vender) && venda == 0){
                                JOptionPane.showMessageDialog(this,"Dinheiro não foi suficiente.");
                                JOptionPane.showMessageDialog(this,"Ainda faltam: "+((preco * vender)- money));
                                venda = JOptionPane.showConfirmDialog(this, "Cliente ainda vai querer realizar a compra?");
                                if(venda == 0){
                                    money = Float.parseFloat(JOptionPane.showInputDialog(this,"Novo pagamento feito pelo cliente: R$"));
                                }
                            }
                            if(venda == 0){
                                JOptionPane.showMessageDialog(this,"Troco: R$"+(money-(preco*vender)));
                                File file = new File("database/produtos/"+i+".txt");
                                PrintStream print = new PrintStream(file);
                                print.println(nome);
                                print.println(precoF);
                                print.println(preco);
                                print.println(tipo);
                                print.println((est-vender));
                                print.close();
                                file = new File("database/relV/"+inf[2]+".txt");
                                file.createNewFile();
                                print = new PrintStream(file);
                                print.println(nome);
                                print.println(est);
                                print.println(vender);
                                print.println(vender*preco);
                                print.close();
                                inf[2] = Integer.toString(Integer.parseInt(inf[2])+1);
                                inf[4] = Double.toString(Double.parseDouble(inf[5])+(vender*preco));
                                inf[6]= Double.toString(Double.parseDouble(inf[6])+(preco*vender));
                                new status().escrever(inf);
                                JOptionPane.showMessageDialog(this,"Venda realizada com sucesso.");
                                jS_R.setValue(0);
                                ler = new BufferedReader(new FileReader(new File("database/produtos/"+i+".txt")));
                                jT_N.setText(ler.readLine());
                                ler.readLine();
                                jT_P.setText(ler.readLine().replace(".",","));
                                jT_T.setText(ler.readLine());
                                jT_E.setText(ler.readLine());
                                ler.close();
                            }
                            else{
                                JOptionPane.showMessageDialog(this,"Compra desfeita com sucesso.");
                            }
                        }
                    }
                }        
            } catch (IOException ex) {}    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try{
            String inf[] = new status().chamar();
            DefaultListModel listModel = new DefaultListModel();
            for(int i = 0; i < Integer.parseInt(inf[1]); i++) {
                BufferedReader ler = new BufferedReader(new FileReader(new File("database/produtos/"+i+".txt")));
                listModel.addElement(ler.readLine());
        }
        jL_P.setModel(listModel);
        } catch(Exception e){}
    }//GEN-LAST:event_formWindowActivated

    private void jPanel_FundoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_FundoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x, y);
    }//GEN-LAST:event_jPanel_FundoMouseDragged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JList<String> jL_P;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel_Fundo;
    private javax.swing.JSpinner jS_R;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jT_E;
    private javax.swing.JTextField jT_N;
    private javax.swing.JTextField jT_P;
    private javax.swing.JTextField jT_T;
    // End of variables declaration//GEN-END:variables
}
