/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andriawan.kasir.view;

import andriawan.kasir.controller.UserController;
import andriawan.kasir.controller.UserLoginController;
import andriawan.kasir.dao.impl.UserDaoImpl;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import utilities.Formater;

/**
 *
 * @author andriawan
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form Log
     */
    public LoginForm(){
        
        initComponents();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        labelPengguna = new javax.swing.JLabel();
        txtFieldPengguna = new javax.swing.JTextField();
        labelPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        toolBarLogin = new javax.swing.JToolBar();
        hint = new javax.swing.JLabel();
        jabatan = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new utilities.MyGradientPanel();
        headerLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(300, 300, 0, 0));
        setName("LoginFrame"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));

        labelPengguna.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelPengguna.setText("Pengguna");

        txtFieldPengguna.setMargin(new java.awt.Insets(0, 5, 0, 5));
        txtFieldPengguna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldPenggunaActionPerformed(evt);
            }
        });

        labelPass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelPass.setText("Kata Sandi");

        txtPass.setMargin(new java.awt.Insets(0, 5, 0, 5));
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(51, 153, 255));
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Masuk");
        loginButton.setBorder(null);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        loginButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginButtonKeyPressed(evt);
            }
        });

        toolBarLogin.setBackground(new java.awt.Color(255, 255, 255));
        toolBarLogin.setRollover(true);
        toolBarLogin.setToolTipText("");
        toolBarLogin.setName("toolbarLogin"); // NOI18N

        hint.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        hint.setText("Kilik ( ALT + F4 ) untuk keluar");
        toolBarLogin.add(hint);

        jabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "kasir" }));

        jLabel1.setText("Jabatan");

        jPanel1.setBackground(new java.awt.Color(85, 225, 248));

        headerLogin.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        headerLogin.setForeground(new java.awt.Color(255, 255, 255));
        headerLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLogin.setText("Windy Collections");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBarLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelPengguna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPass)
                            .addComponent(labelPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFieldPengguna, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jabatan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(25, 25, 25))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelPengguna)
                .addGap(18, 18, 18)
                .addComponent(txtFieldPengguna, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelPass)
                .addGap(18, 18, 18)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(toolBarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ImageIcon icon = new ImageIcon(new ImageIcon("resources/check.png").getImage().
            getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));
        loginButton.setIcon(icon);
        toolBarLogin.getAccessibleContext().setAccessibleName("toolbarLogin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setTxtFieldPengguna(String txtFieldPengguna) {
        this.txtFieldPengguna.setText(txtFieldPengguna);
    }

    public void setTxtPass(String txtPass) {
        this.txtPass.setText(txtPass);
    }

    private void txtFieldPenggunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldPenggunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldPenggunaActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        UserLoginController userController;
        userController = new UserLoginController(new UserDaoImpl(), this);
        try {
            switch(jabatan.getSelectedIndex()){
                
            case 0:
                if (userController
                    .isValidAdminUser(
                            txtFieldPengguna.getText(), 
                            new String(txtPass.getPassword()))) {
                    UserLoginController.getMainFormInstance().setVisible(true);
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Password atau Username salah");
                }
                break;
            case 1:
                if(userController.
                    isValidKasirUser(
                            txtFieldPengguna.getText(), 
                            new String(txtPass.getPassword()))) {
                    UserController uc = new UserController();
                    ArrayList<String> as = uc.getUserLevel(txtFieldPengguna.getText(),
                            jabatan.getSelectedItem().toString());
                    KasirForm kf = UserLoginController.getKasirFormInstance();
                    kf.setVisible(true);
                    String kasir = txtFieldPengguna.getText();
                    kf.setLabelIdKasir(as.get(1));
                    kf.setTxtPetugasKasir(kasir);
                    
                    kf.setTxtWaktuLogin(Formater.setNiceIndonesianDate(System.currentTimeMillis()));
                    
                    setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(this, 
                            "Password atau Username salah",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Anda Penyusup");
            break;
            
            }
            
        } catch (NullPointerException h) {
            JOptionPane.showMessageDialog(this, 
                    "Error: Periksa opsi jabatan apakah sudah benar",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(this, 
                    "Error: Terjadi Kesalahan Koneksi Database",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_loginButtonActionPerformed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                ActionEvent et = null;
                loginButtonActionPerformed(et);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_txtPassKeyPressed

    private void loginButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginButtonKeyPressed
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                ActionEvent et = null;
                loginButtonActionPerformed(et);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_loginButtonKeyPressed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel headerLogin;
    private javax.swing.JLabel hint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jabatan;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelPengguna;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JToolBar toolBarLogin;
    private javax.swing.JTextField txtFieldPengguna;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
