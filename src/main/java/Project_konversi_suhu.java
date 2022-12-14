
import java.awt.Toolkit;
import java.awt.Dimension;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fadlan Ramadhan
 */
public class Project_konversi_suhu extends javax.swing.JFrame {
    
    public Double input;
    public Double celcius;
    public Double reamur;
    public Double fahrenheit;
    public Double kelvin;
    public String hasilcelcius;
    public String hasilreamur;
    public String hasilfahrenheit;
    public String hasilkelvin;
    
    public Project_konversi_suhu() {
        initComponents();
        
    }
    
    private void celcius(){
        input= Double.parseDouble(txtAwal.getText());
        
        celcius=input;
        fahrenheit=celcius*1.8+32;
        reamur=celcius*0.8;
        kelvin=celcius+273.15;
        
        hasilcelcius= Double.toString(celcius);
        txt_celcius.setText(hasilcelcius);
        
        hasilfahrenheit= Double.toString(fahrenheit);
        txt_fahrenheit.setText(hasilfahrenheit);
        
        hasilreamur= Double.toString(reamur);
        txt_reamur.setText(hasilreamur);
        
        hasilkelvin= Double.toString(kelvin);
        txt_kelvin.setText(hasilkelvin);
    }
    
    private void fahrenheit(){
        input= Double.parseDouble(txtAwal.getText());
        
        fahrenheit = input;
        celcius = (fahrenheit-32)/1.8;
        reamur = (fahrenheit-32)/2.25;
        kelvin = (fahrenheit+459.67)/1.8;
        
        hasilcelcius = Double.toString(celcius);
        txt_celcius.setText(hasilcelcius);
        
        hasilfahrenheit = Double.toString(fahrenheit);
        txt_fahrenheit.setText(hasilfahrenheit);
        
        hasilreamur = Double.toString(reamur);
        txt_reamur.setText(hasilreamur);
            
        hasilkelvin = Double.toString(kelvin);
        txt_kelvin.setText(hasilkelvin);
    }
    
    private void reamur(){
        input= Double.parseDouble(txtAwal.getText());
        
        reamur = input;
        celcius = reamur/0.8;
        fahrenheit = (reamur*2.25)+32;
        kelvin = reamur/0.8+237.15;
        
        hasilcelcius = Double.toString(celcius);
        txt_celcius.setText(hasilcelcius);
        
        hasilfahrenheit = Double.toString(fahrenheit);
        txt_fahrenheit.setText(hasilfahrenheit);
        
        hasilreamur = Double.toString(reamur);
        txt_reamur.setText(hasilreamur);
        
        hasilkelvin = Double.toString(kelvin);
        txt_kelvin.setText(hasilkelvin);
    }
    
    private void kelvin(){
        input= Double.parseDouble(txtAwal.getText());
        
        kelvin = input;
        celcius = kelvin-273.15;
        fahrenheit = kelvin*1.8-459.67;
        reamur = (kelvin-237.15)*0.8;
        
        hasilcelcius = Double.toString(celcius);
        txt_celcius.setText(hasilcelcius);
        
        hasilfahrenheit = Double.toString(fahrenheit);
        txt_fahrenheit.setText(hasilfahrenheit);
        
        hasilreamur = Double.toString(reamur);
        txt_reamur.setText(hasilreamur);
        
        hasilkelvin = Double.toString(kelvin);
        txt_kelvin.setText(hasilkelvin); 
    }
    
    private void form_Tengah(){
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension framesize = this.getSize();
        if(framesize.height < screensize.height){
            framesize.height = screensize.height;
        }
        if(framesize.width > screensize.width){
            framesize.width = screensize.width;
        }
        this.setLocation((screensize.width - framesize.width)/2,
        (screensize.height - framesize.height)/2);
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        txtAwal = new javax.swing.JTextField();
        nilai1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rb_celcius = new javax.swing.JRadioButton();
        rb_reamur = new javax.swing.JRadioButton();
        rb_fahrenheit = new javax.swing.JRadioButton();
        rb_kelvin = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_celcius = new javax.swing.JButton();
        txt_reamur = new javax.swing.JButton();
        txt_fahrenheit = new javax.swing.JButton();
        txt_kelvin = new javax.swing.JButton();
        lbl_celcius = new javax.swing.JLabel();
        lbl_reamur = new javax.swing.JLabel();
        lbl_fahrenheit = new javax.swing.JLabel();
        lbl_kelvin = new javax.swing.JLabel();
        btn_close = new java.awt.Button();
        btn_konvert = new java.awt.Button();
        btn_reset = new java.awt.Button();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nilai1.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        nilai1.setText("Besarnya Suhu");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Konversi Suhu Didunia");

        buttonGroup1.add(rb_celcius);
        rb_celcius.setText("Celcius");

        buttonGroup1.add(rb_reamur);
        rb_reamur.setText("Reamur");

        buttonGroup1.add(rb_fahrenheit);
        rb_fahrenheit.setText("Fahrenheit");

        buttonGroup1.add(rb_kelvin);
        rb_kelvin.setText("Kelvin");
        rb_kelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_kelvinActionPerformed(evt);
            }
        });

        jLabel3.setText("Suhu Yang Dikonversikan :");

        jLabel5.setText("Suhu Hasil Konversi :");

        txt_celcius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_celciusActionPerformed(evt);
            }
        });

        lbl_celcius.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        lbl_celcius.setText("Celcius");

        lbl_reamur.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        lbl_reamur.setText("Reamur");

        lbl_fahrenheit.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        lbl_fahrenheit.setText("Fahrenheit");

        lbl_kelvin.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        lbl_kelvin.setText("Kelvin");

        btn_close.setBackground(new java.awt.Color(0, 0, 0));
        btn_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_close.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btn_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_close.setLabel("CLOSE");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        btn_konvert.setBackground(new java.awt.Color(0, 204, 51));
        btn_konvert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_konvert.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_konvert.setLabel("KONVERT");
        btn_konvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_konvertActionPerformed(evt);
            }
        });

        btn_reset.setBackground(new java.awt.Color(255, 0, 0));
        btn_reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_reset.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_reset.setLabel("RESET\n");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rb_celcius)
                                .addGap(18, 18, 18)
                                .addComponent(rb_reamur)
                                .addGap(18, 18, 18)
                                .addComponent(rb_fahrenheit)
                                .addGap(18, 18, 18)
                                .addComponent(rb_kelvin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nilai1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_celcius, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_celcius, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_reamur, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_fahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_kelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_kelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_fahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_reamur, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_konvert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(51, 51, 51)
                        .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nilai1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_celcius)
                            .addComponent(rb_reamur)
                            .addComponent(rb_fahrenheit)
                            .addComponent(rb_kelvin))
                        .addGap(54, 54, 54)
                        .addComponent(jLabel4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_celcius)
                            .addComponent(txt_celcius, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_reamur)
                            .addComponent(txt_reamur, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_fahrenheit)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_kelvin))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_fahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(txt_kelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(btn_konvert, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_close, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(btn_reset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb_kelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_kelvinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_kelvinActionPerformed

    private void btn_konvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_konvertActionPerformed
        if(rb_celcius.isSelected()){
            celcius();
        }
        else if(rb_fahrenheit.isSelected()){
            fahrenheit();
        }
        else if(rb_reamur.isSelected()){
            reamur();
        }
        else if(rb_kelvin.isSelected()){
            kelvin();
        }
    }//GEN-LAST:event_btn_konvertActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_closeActionPerformed

    private void txt_celciusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_celciusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_celciusActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        txtAwal.setText("");
        txt_celcius.setText("");
        txt_reamur.setText("");
        txt_fahrenheit.setText("");
        txt_kelvin.setText("");
    }//GEN-LAST:event_btn_resetActionPerformed

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
            java.util.logging.Logger.getLogger(Project_konversi_suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Project_konversi_suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Project_konversi_suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Project_konversi_suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Project_konversi_suhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btn_close;
    private java.awt.Button btn_konvert;
    private java.awt.Button btn_reset;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lbl_celcius;
    private javax.swing.JLabel lbl_fahrenheit;
    private javax.swing.JLabel lbl_kelvin;
    private javax.swing.JLabel lbl_reamur;
    private javax.swing.JLabel nilai1;
    private javax.swing.JRadioButton rb_celcius;
    private javax.swing.JRadioButton rb_fahrenheit;
    private javax.swing.JRadioButton rb_kelvin;
    private javax.swing.JRadioButton rb_reamur;
    private javax.swing.JTextField txtAwal;
    private javax.swing.JButton txt_celcius;
    private javax.swing.JButton txt_fahrenheit;
    private javax.swing.JButton txt_kelvin;
    private javax.swing.JButton txt_reamur;
    // End of variables declaration//GEN-END:variables
}
