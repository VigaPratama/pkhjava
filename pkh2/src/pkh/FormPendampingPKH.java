/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkh;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import static pkh.MainPage.a;
import static pkh.MainPage.b;
import static pkh.MainPage.c;




/**
 *
 * @author Me
 */
public class FormPendampingPKH extends javax.swing.JFrame {
    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;

    /**
     * Creates new form FormPendampingPKH
     */
    public FormPendampingPKH() {
        initComponents();
        ActionListener ac1=new ActionListener(){
           @Override public void actionPerformed(ActionEvent e){
             a=lb1MovingText.getText();
             b=a.substring(0, 1);
             c=a.substring(1, a.length());
             lb1MovingText.setText(c+b);
           }
        }; new javax.swing.Timer(400, ac1).start();
    }
    
    protected void aktif(){
        tid.setEnabled(true);
        tnama.setEnabled(true);
        tnohp.setEnabled(true);
        tkel.setEnabled(true);
        talamat.setEnabled(true);
        tid.requestFocus();
    }
    
    protected void kosong(){
        tid.setText("");
        tnama.setText("");
        rjk1.setSelected(false);
        rjk2.setSelected(false);
        tnohp.setText("");
        tkel.setText("");
        talamat.setText("");
    }
    
    protected void dataPendampingPKH(){
        Object[] Baris ={"No", "Nama", "Jenis Kelamin", "No.HP", "Kelurahan", "Alamat"};
        tabmode  = new DefaultTableModel(null, Baris);
        
        String sql = "select * from pendampingpkh";
        try{
           java.sql.Statement stat = conn.createStatement();
           ResultSet hasil = stat.executeQuery(sql);
           while(hasil.next()){
              String a = hasil.getString("Nama");
              String b = hasil.getString("Jenis_Kelamin");
              String c = hasil.getString("No_Hp");
              String d = hasil.getString("Kelurahan");
              String e = hasil.getString("Alamat");
           }
           
        }catch(Exception e){
           
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

        GenderGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tnama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tnohp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tkel = new javax.swing.JTextField();
        bsave = new javax.swing.JButton();
        bedit = new javax.swing.JButton();
        bdelete = new javax.swing.JButton();
        bhalaman = new javax.swing.JButton();
        rjk1 = new javax.swing.JRadioButton();
        rjk2 = new javax.swing.JRadioButton();
        tid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        talamat = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        lb1MovingText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        tnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnamaActionPerformed(evt);
            }
        });
        jPanel4.add(tnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 260, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jenis Kelamin");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No. Hp");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));
        jPanel4.add(tnohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 260, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kelurahan");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Alamat");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));
        jPanel4.add(tkel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 260, -1));

        bsave.setBackground(new java.awt.Color(0, 0, 204));
        bsave.setForeground(new java.awt.Color(255, 255, 255));
        bsave.setText("SAVE");
        bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsaveActionPerformed(evt);
            }
        });
        jPanel4.add(bsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 80, -1));

        bedit.setBackground(new java.awt.Color(255, 153, 0));
        bedit.setForeground(new java.awt.Color(255, 255, 255));
        bedit.setText("EDIT");
        bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditActionPerformed(evt);
            }
        });
        jPanel4.add(bedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 80, -1));

        bdelete.setBackground(new java.awt.Color(255, 0, 0));
        bdelete.setForeground(new java.awt.Color(255, 255, 255));
        bdelete.setText("DELETE");
        bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdeleteActionPerformed(evt);
            }
        });
        jPanel4.add(bdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 80, -1));

        bhalaman.setBackground(new java.awt.Color(0, 0, 0));
        bhalaman.setForeground(new java.awt.Color(255, 255, 255));
        bhalaman.setText("Kembali Ke Halaman Sebelumnya -->");
        bhalaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhalamanActionPerformed(evt);
            }
        });
        jPanel4.add(bhalaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, -1, 30));

        GenderGroup.add(rjk1);
        rjk1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rjk1.setForeground(new java.awt.Color(255, 255, 255));
        rjk1.setText("Laki-Laki");
        jPanel4.add(rjk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 80, -1));

        GenderGroup.add(rjk2);
        rjk2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rjk2.setForeground(new java.awt.Color(255, 255, 255));
        rjk2.setText("Perempuan");
        jPanel4.add(rjk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 100, -1));
        jPanel4.add(tid, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 260, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID Number");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jScrollPane1.setViewportView(talamat);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 260, 100));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Me\\Downloads\\background pendamping pkh2.jpg")); // NOI18N
        jLabel7.setText("xxsxksxsxs");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 470));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 470));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 900, 470));

        lb1MovingText.setFont(new java.awt.Font("BIZ UDMincho Medium", 1, 18)); // NOI18N
        lb1MovingText.setForeground(new java.awt.Color(255, 0, 0));
        lb1MovingText.setText("                                                                       Form Pendampimg PKH !!!");
        jPanel2.add(lb1MovingText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 880, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 900, 510));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Me\\Downloads\\program keluarga harapan4.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsaveActionPerformed
        // TODO add your handling code here:
       String sql = "insert into pendampingpkh value (?,?,?,?,?,?)";
        try {
           PreparedStatement stat = conn.prepareStatement(sql);
           stat.setString(1, tid.getText());
           stat.setString(2, tnama.getText());
           String jkel="";
           if(rjk1.isSelected()) jkel="laki-laki";
           else jkel="perempuan";
           stat.setString(3, jkel);
           stat.setString(4, tnohp.getText());
           stat.setString(5, tkel.getText());
           stat.setString(6, talamat.getText());
      
           stat.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
           kosong();
           tid.requestFocus();
           dataPendampingPKH();
           
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Data gagal Disimpan"+e);
        }

    }//GEN-LAST:event_bsaveActionPerformed

    private void bhalamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhalamanActionPerformed
        // TODO add your handling code here:
        DataPendampingPKH backpage = new DataPendampingPKH();
        backpage.show();
        dispose();
    }//GEN-LAST:event_bhalamanActionPerformed

    private void beditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditActionPerformed
        // TODO add your handling code here:
                try{
            String sql = "update pendampingpkh set Nama=?, Jenis_kelamin=?, No_HP=?, Kelurahan=?, Alamat=? where id=?";
            PreparedStatement stat = conn.prepareStatement (sql);
           String jkel="";
           stat.setString(1, tnama.getText());
           if(rjk1.isSelected()) jkel="laki-laki";
           else jkel="perempuan";
           stat.setString(2, jkel);
           stat.setString(3, tnohp.getText());
           stat.setString(4, tkel.getText());
           stat.setString(5, talamat.getText());
           stat.setString(6, tid.getText());
           stat.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
           kosong();
           tid.requestFocus();
           dataPendampingPKH();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal diubah"+e);
        }

    }//GEN-LAST:event_beditActionPerformed

    private void bdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdeleteActionPerformed
        // TODO add your handling code here:
                int ok = JOptionPane.showConfirmDialog(null, "hapus", "Konfirmasi Dialog", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0){
            String sql = "delete from pendampingpkh where id = '"+tid.getText()+"'";
            try{
               PreparedStatement stat = conn.prepareStatement(sql);
               stat.executeUpdate();
               JOptionPane.showMessageDialog(null, "data berhasil dihapus");
               kosong();
               tid.requestFocus();
               dataPendampingPKH();
            }catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Data gagal dihapus"+e);
            }
        }
        
    }//GEN-LAST:event_bdeleteActionPerformed

    private void tnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnamaActionPerformed

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
            java.util.logging.Logger.getLogger(FormPendampingPKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPendampingPKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPendampingPKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPendampingPKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPendampingPKH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GenderGroup;
    private javax.swing.JButton bdelete;
    private javax.swing.JButton bedit;
    private javax.swing.JButton bhalaman;
    private javax.swing.JButton bsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb1MovingText;
    private javax.swing.JRadioButton rjk1;
    private javax.swing.JRadioButton rjk2;
    private javax.swing.JTextPane talamat;
    private javax.swing.JTextField tid;
    private javax.swing.JTextField tkel;
    private javax.swing.JTextField tnama;
    private javax.swing.JTextField tnohp;
    // End of variables declaration//GEN-END:variables
}
