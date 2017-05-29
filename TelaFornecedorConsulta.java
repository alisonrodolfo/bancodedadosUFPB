/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobd.Fornecedores;

import Class.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import projetobd.Main;

/**
 *
 * @author aliso
 */
public class TelaFornecedorConsulta extends javax.swing.JInternalFrame {


    
    /**
     * Creates new form TelaPedido
     */
    public TelaFornecedorConsulta() {
        initComponents();
        
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
            
            DefaultTableModel dataModelo = new DefaultTableModel();
            
            jTable1.setModel(dataModelo);
            
            dataModelo.addColumn("ID");
            dataModelo.addColumn("NOME");
            dataModelo.addColumn("CGC");
            dataModelo.addColumn("ENDEREÇO");
            dataModelo.addColumn("TELEFONE");
            dataModelo.addColumn("CONTATO");
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);   //Tamanho da Coluna 1
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(80);    //Tamnaho da Coluna 2
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);   //Tamanho da Coluna 3
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(150);    //Tamnaho da Coluna 2
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);   //Tamanho da Coluna 3
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(50);   //Tamanho da Coluna 3
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBorder(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/money.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel8.setText("Fornecedores");

        jButton1.setText("Consultar Todos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 404, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE))
        );

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
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            this.Fornecedor("");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaFornecedorConsulta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaFornecedorConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    
    public  synchronized void Fornecedor(String cpf) throws ClassNotFoundException, SQLException{
             System.out.println("Tentando conectar ao MySQL via Atualiza MYSQL...");
            DefaultTableModel dataModelo = new DefaultTableModel();
            
            
            dataModelo.addColumn("ID");
            dataModelo.addColumn("NOME");
            dataModelo.addColumn("CGC");
            dataModelo.addColumn("ENDEREÇO");
            dataModelo.addColumn("TELEFONE");
            dataModelo.addColumn("CONTATO");
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);   //Tamanho da Coluna 1
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(80);    //Tamnaho da Coluna 2
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);   //Tamanho da Coluna 3
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(150);    //Tamnaho da Coluna 2
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);   //Tamanho da Coluna 3
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(50);   //Tamanho da Coluna 3
           Class.forName("com.mysql.jdbc.Driver");
            String urlMysql = "jdbc:mysql://localhost:3306/bancodedados1";
            String usuarioMysql = "root";
            String senhaMysql = "admin12345"; // SNHA DO MYSQL
            Connection con = DriverManager.getConnection(urlMysql, usuarioMysql, senhaMysql);
            Statement stmt = con.createStatement(); //objeto Statement
            ResultSet rs; //objeto ResultSet
            PreparedStatement preparedStatement;
            try{ /* Verifica se já existe um usuario com cpf ou registro inserido */     
                                preparedStatement = con.prepareStatement("SELECT * FROM fornecedores"); 
                                rs = (ResultSet) preparedStatement.executeQuery();  
                                while(rs.next()){
                                    dataModelo.addRow(new String[]{rs.getString("id"),rs.getString("nome"),rs.getString("cgc"),rs.getString("endereco"),
                                        rs.getString("telefone"),rs.getString("contato")});
                                }//end while
                                jTable1.setModel(dataModelo);
                                 
                        } catch(NumberFormatException e){ }

    }
   
    
    

    private Usuario dados;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
