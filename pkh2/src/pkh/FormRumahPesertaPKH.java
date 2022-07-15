/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkh;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
/**
 *
 * @author Me
 */
public class FormRumahPesertaPKH extends javax.swing.JFrame {
private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    /**
     * Creates new form FromRumahPesertaPKH
     */
    public FormRumahPesertaPKH() {
        initComponents();
    }
protected void aktif(){
        npendamping.setEnabled(true);
        ntelp.setEnabled(true);
        idpkh.setEnabled(true);
        npeserta.setEnabled(true);
        textalamat.setEnabled(true);
        srumah.setEnabled(true);
        tkelurahan.setEnabled(true);
        tkecamatan.setEnabled(true);
        idpkh.requestFocus();
    }
    
    protected void kosong(){
        npendamping.setText("");
        ntelp.setText("");
        idpkh.setText("");
        npeserta.setText("");
        textalamat.setText("");
        srumah.setText("");
        tkelurahan.setText("");
        tkecamatan.setText("");
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
        bsave = new javax.swing.JButton();
        bedit = new javax.swing.JButton();
        bdelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        npendamping = new javax.swing.JTextField();
        ntelp = new javax.swing.JTextField();
        idpkh = new javax.swing.JTextField();
        npeserta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tkelurahan = new javax.swing.JTextField();
        tkecamatan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textalamat = new javax.swing.JTextArea();
        srumah = new javax.swing.JTextField();
        bback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setInheritsPopupMenu(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bsave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bsave.setText("SAVE");
        bsave.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsaveActionPerformed(evt);
            }
        });
        jPanel1.add(bsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 90, 30));

        bedit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bedit.setText("EDIT");
        bedit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditActionPerformed(evt);
            }
        });
        jPanel1.add(bedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 90, 30));

        bdelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bdelete.setText("DELETE");
        bdelete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdeleteActionPerformed(evt);
            }
        });
        jPanel1.add(bdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 90, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("ID Peserta PKH");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Form Rumah Peserta PKH");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 280, 39));

        npendamping.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                npendampingActionPerformed(evt);
            }
        });
        jPanel1.add(npendamping, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 300, -1));
        jPanel1.add(ntelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 300, -1));

        idpkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpkhActionPerformed(evt);
            }
        });
        jPanel1.add(idpkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, 300, -1));
        jPanel1.add(npeserta, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 160, 300, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Nama Peserta");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Nama Pendamping");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("No. Telepon");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(415, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 570, 170));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Alamat Rumah");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 110, 30));

        jLabel12.setText("Status Rumah");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 100, -1));

        jLabel13.setText("Kelurahan");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel14.setText("Kecamatan");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));
        jPanel3.add(tkelurahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 300, -1));
        jPanel3.add(tkecamatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 300, -1));

        textalamat.setColumns(20);
        textalamat.setRows(5);
        jScrollPane1.setViewportView(textalamat);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 300, 110));

        srumah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srumahActionPerformed(evt);
            }
        });
        jPanel3.add(srumah, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 300, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 570, 430));

        bback.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bback.setText("Back");
        bback.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbackActionPerformed(evt);
            }
        });
        jPanel1.add(bback, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbackActionPerformed
        // TODO add your handling code here:
        DataRumahPesertaPKH back = new DataRumahPesertaPKH();
        back.show();
        dispose();
    }//GEN-LAST:event_bbackActionPerformed

    private void bsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsaveActionPerformed
        // TODO add your handling code here:
        String sql = "insert into rumahpesertapkh value (?,?,?,?,?,?,?,?)";
        try {
           PreparedStatement stat = conn.prepareStatement(sql);
           stat.setString(1, npendamping.getText());
           stat.setString(2, ntelp.getText());
           stat.setString(3, idpkh.getText());
           stat.setString(4, npeserta.getText());
           stat.setString(5, textalamat.getText());
           stat.setString(6, srumah.getText());
           stat.setString(7, tkelurahan.getText());
           stat.setString(8, tkecamatan.getText());
           stat.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
           kosong();
           idpkh.requestFocus();
           
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Data gagal Disimpan"+e);
        }
    }//GEN-LAST:event_bsaveActionPerformed

    private void beditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "update rumahpesertapkh set Nama_Pendamping=?, No_Telepon=?,Nama_Peserta=?, Alamat_Rumah=?, Status_Rumah=?, Kelurahan=?, Kecamatan=? where ID_Peserta_PKH=?";
            PreparedStatement stat = conn.prepareStatement (sql);
            stat.setString(1, npendamping.getText());
           stat.setString(2, ntelp.getText());
           stat.setString(3, npeserta.getText());
           stat.setString(4, textalamat.getText());
           stat.setString(5, srumah.getText());
           stat.setString(6, tkelurahan.getText());
           stat.setString(7, tkecamatan.getText());
           stat.setString(8, idpkh.getText());
           stat.executeUpdate();
       
           JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
           kosong();
           idpkh.requestFocus();
           
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal diubah"+e);
        }

    }//GEN-LAST:event_beditActionPerformed

    private void bdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdeleteActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog(null, "hapus", "Konfirmasi Dialog", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0){
            String sql = "delete from rumahpesertapkh where ID_Peserta_PKH = '"+idpkh.getText()+"'";
            try{
               PreparedStatement stat = conn.prepareStatement(sql);
               stat.executeUpdate();
               JOptionPane.showMessageDialog(null, "data berhasil dihapus");
               kosong();
               idpkh.requestFocus();
            }catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Data gagal dihapus"+e);
            }
        }
    }//GEN-LAST:event_bdeleteActionPerformed

    private void npendampingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_npendampingActionPerformed
        // TODO add your handling code here:
        try {

            String sql = "SELECT * FROM pendampingpkh where nama='" + npendamping.getText() + "'";
            
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {
                ntelp.setText(res.getString("No_HP"));

            }

        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());

        }
    }//GEN-LAST:event_npendampingActionPerformed

    private void idpkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpkhActionPerformed
        // TODO add your handling code here:
        try {

            String sql = "SELECT * FROM pesertapkh where id='"
                    + idpkh.getText() + "'";
            
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {
                npeserta.setText(res.getString("Nama"));
                textalamat.setText(res.getString("Alamat"));
                tkelurahan.setText(res.getString("Kelurahan"));
                tkecamatan.setText(res.getString("Kecamatan"));
                
            }

        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());

        }
    }//GEN-LAST:event_idpkhActionPerformed

    private void srumahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srumahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_srumahActionPerformed

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
            java.util.logging.Logger.getLogger(FormRumahPesertaPKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRumahPesertaPKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRumahPesertaPKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRumahPesertaPKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRumahPesertaPKH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bback;
    private javax.swing.JButton bdelete;
    private javax.swing.JButton bedit;
    private javax.swing.JButton bsave;
    private javax.swing.JTextField idpkh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField npendamping;
    private javax.swing.JTextField npeserta;
    private javax.swing.JTextField ntelp;
    private javax.swing.JTextField srumah;
    private javax.swing.JTextArea textalamat;
    private javax.swing.JTextField tkecamatan;
    private javax.swing.JTextField tkelurahan;
    // End of variables declaration//GEN-END:variables
}
