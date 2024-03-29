/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package penjualan;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cahyotriatmojo
 */
public class User extends javax.swing.JFrame {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/db_pbouas";
    static final String USER = "root";
    static final String PASS = "";
    
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    /**
     * Creates new form User
     */
    public User() {
        initComponents();
        aktif();
        tampil();
    }
    
     protected void aktif(){
        txtidUser.requestFocus();
    }
    
    protected void kosong(){
        txtidUser.setText("");
        txtNamaUser.setText("");
        buttonGroup1.clearSelection();
        txtJabatan.setText("");
        txtUmur.setText("");
        txtAlamat.setText("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNamaUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rlaki = new javax.swing.JRadioButton();
        rperem = new javax.swing.JRadioButton();
        txtidUser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtJabatan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelUser = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        txtUmur = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID User");

        jLabel2.setText("Nama User");

        txtNamaUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaUserActionPerformed(evt);
            }
        });

        jLabel3.setText("Jenis Kelamin");

        buttonGroup1.add(rlaki);
        rlaki.setText("Laki-Laki");

        buttonGroup1.add(rperem);
        rperem.setText("Perempuan");

        jLabel5.setText("Jabatan");

        jLabel6.setText("Alamat");

        jLabel7.setText("List Data User :");

        TabelUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id_pegawai", "nama", "jabatan", "alamat", "umur", "jenis_kelamin"
            }
        ));
        TabelUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelUser);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel8.setText("INPUT DATA PEGAWAI");

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane2.setViewportView(txtAlamat);

        jLabel9.setText("Umur");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 446, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUmur, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rlaki)
                                        .addGap(66, 66, 66)
                                        .addComponent(rperem))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtidUser, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNamaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtidUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNamaUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rperem, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rlaki, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel3)
                                .addGap(21, 21, 21)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtUmur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnClear))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addGap(137, 137, 137))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     
    private void txtNamaUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaUserActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        String jenis = null;
        if(rlaki.isSelected()){
            jenis = "Laki - laki";
        }else{
            jenis="Perempuan";
        }
        try {
            String sql = "INSERT INTO user  VALUES ('"+ txtidUser.getText() +"','"+ txtNamaUser.getText()+"','"+ txtJabatan.getText() +"','"+txtAlamat.getText()+"','"+ txtUmur.getText() +"','"+ jenis +"')";
            
            Class.forName(JDBC_DRIVER);
   
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
 
            stmt = conn.createStatement();
            PreparedStatement pms = conn.prepareStatement(sql);
    
            pms.execute();
            JOptionPane.showMessageDialog(null, "Simpan Berhasil");

        } catch (Exception e) {
            e.printStackTrace();
        }
        kosong();
        tampil();
                                     
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        dispose(); 
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "UPDATE user SET id_user = '"+ txtidUser.getText() 
                    +"', nama = '" + txtNamaUser.getText()
                    +"', jabatan = '" + txtJabatan.getText() 
                    +"',alamat = '" + txtAlamat.getText()
                    +"', umur = '"+ txtUmur.getText() 
                    +"' WHERE id_user = '"+ txtidUser.getText() + "'";
            
            Class.forName(JDBC_DRIVER);
   
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
 
            stmt = conn.createStatement();
            
            PreparedStatement pms = conn.prepareStatement(sql);
            
            pms.execute();
            JOptionPane.showMessageDialog(null, "Edit Data Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        kosong();
        tampil();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
         try {
            String sql = "DELETE FROM user WHERE id_user = '"+ txtidUser.getText() + "'";
            
            Class.forName(JDBC_DRIVER);
   
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
 
            stmt = conn.createStatement();
            PreparedStatement pms = conn.prepareStatement(sql);
    
            pms.execute();
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");

        } catch (Exception e) {
            e.printStackTrace();
        }
        kosong();
        tampil();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void TabelUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelUserMouseClicked
        // TODO add your handling code here:   //tabel pegawai
        int baris = TabelUser.rowAtPoint(evt.getPoint());
        
        String id_user = TabelUser.getValueAt(baris, 1).toString();
        txtidUser.setText(id_user);
        
        String nama = TabelUser.getValueAt(baris, 2).toString();
        txtNamaUser.setText(nama);
        
        String jabatan = TabelUser.getValueAt(baris, 3).toString();
        txtJabatan.setText(jabatan);
        
        String alamat = TabelUser.getValueAt(baris, 4).toString();
        txtAlamat.setText(alamat);
        
        String umur = TabelUser.getValueAt(baris, 5).toString();
        txtUmur.setText(umur);
        
        if ("Perempuan".equals(TabelUser.getValueAt(baris, 6).toString())){
            rperem.setSelected(true);  //boolean
        }else {
            rlaki.setSelected(true);
        }
    }//GEN-LAST:event_TabelUserMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here: 
        kosong();
    }//GEN-LAST:event_btnClearActionPerformed

    private void tampil(){
        try{
            Class.forName(JDBC_DRIVER);	   
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("No");
            model.addColumn("Kode Pegawai");
            model.addColumn("Nama");
            model.addColumn("Jabatan");
            model.addColumn("Alamat");
            model.addColumn("Umur");
            model.addColumn("Jenis Kelamin");
 
            stmt = conn.createStatement();
            String sql = "SELECT * FROM user";
            int i = 1;
            rs = stmt.executeQuery(sql);
            while(rs.next()) {
            	model.addRow(new Object[] {
                        i,
            		rs.getString("id_user"),
            		rs.getString("nama"),
            		rs.getString("jabatan"),
            		rs.getString("alamat"),
                        rs.getInt("umur"),
                        rs.getString("jenis_kelamin")
            	});
            	i++;
            }
            rs.close();
            conn.close();
            stmt.close();
            
            TabelUser.setModel(model);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelUser;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rlaki;
    private javax.swing.JRadioButton rperem;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtJabatan;
    private javax.swing.JTextField txtNamaUser;
    private javax.swing.JTextField txtUmur;
    private javax.swing.JTextField txtidUser;
    // End of variables declaration//GEN-END:variables
}
