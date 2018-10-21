/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import api.google.translate.EnglishVietnamese;
import java.io.*;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Application extends javax.swing.JFrame {
    DictionaryCommandline diccm = new DictionaryCommandline();
    DictionaryManagement dicmana = new DictionaryManagement();
    DefaultListModel<String> dml = new DefaultListModel<>();
    EnglishVietnamese englishVietnamese = new EnglishVietnamese();
    public Application() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ftTucantra = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        llist = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        taKetqua = new javax.swing.JTextArea();
        btSearch = new javax.swing.JButton();
        btSpeak = new javax.swing.JButton();
        btAdd = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jText = new javax.swing.JTextArea();
        JBSearch = new javax.swing.JButton();
        JBspeak = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dictionary");
        setBackground(new java.awt.Color(255, 102, 102));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        ftTucantra.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        ftTucantra.setSelectionColor(new java.awt.Color(0, 0, 0));
        ftTucantra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftTucantraActionPerformed(evt);
            }
        });
        ftTucantra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftTucantraKeyTyped(evt);
            }
        });
        jPanel1.add(ftTucantra);
        ftTucantra.setBounds(20, 40, 181, 30);

        llist.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        llist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                llistMouseClicked(evt);
            }
        });
        llist.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                llistValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(llist);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 80, 180, 250);

        taKetqua.setEditable(false);
        taKetqua.setColumns(20);
        taKetqua.setRows(5);
        jScrollPane2.setViewportView(taKetqua);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(220, 80, 460, 150);

        btSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon/icons8-search-24.png"))); // NOI18N
        btSearch.setText("Search");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btSearch);
        btSearch.setBounds(220, 40, 110, 33);

        btSpeak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon/icons8-voice-24.png"))); // NOI18N
        btSpeak.setText("Phát âm");
        btSpeak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSpeakActionPerformed(evt);
            }
        });
        jPanel1.add(btSpeak);
        btSpeak.setBounds(330, 40, 110, 33);

        btAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon/icons8-positive-30.png"))); // NOI18N
        btAdd.setText("Thêm Từ");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });
        jPanel1.add(btAdd);
        btAdd.setBounds(220, 230, 110, 39);

        btEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon/icons8-support-30 (1).png"))); // NOI18N
        btEdit.setText("Sửa từ");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });
        jPanel1.add(btEdit);
        btEdit.setBounds(330, 230, 110, 39);

        btDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon/icons8-cancel-26.png"))); // NOI18N
        btDelete.setText("Xóa từ");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btDelete);
        btDelete.setBounds(220, 270, 110, 40);

        btExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon/icons8-arrow-24.png"))); // NOI18N
        btExit.setText("Thoát");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });
        jPanel1.add(btExit);
        btExit.setBounds(330, 270, 110, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DicImage1.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(450, 40, 225, 40);

        jLabel2.setFont(new java.awt.Font(".VnArabia", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dictionary Eng - Vie");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(400, 0, 290, 50);

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("U E T");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(450, 300, 130, 40);

        jText.setColumns(20);
        jText.setRows(5);
        jScrollPane3.setViewportView(jText);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(20, 330, 260, 100);

        JBSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon/icons8-search-property-30.png"))); // NOI18N
        JBSearch.setText("Search Text");
        JBSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSearchActionPerformed(evt);
            }
        });
        jPanel1.add(JBSearch);
        JBSearch.setBounds(280, 330, 130, 50);

        JBspeak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon/icons8-microphone-30.png"))); // NOI18N
        JBspeak.setText("Speak Text");
        JBspeak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBspeakActionPerformed(evt);
            }
        });
        jPanel1.add(JBspeak);
        JBspeak.setBounds(280, 380, 130, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon/icons8-about-filled-50.png"))); // NOI18N
        jLabel5.setText("Information");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(590, 250, 120, 50);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/2.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 0, 730, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        dicmana.insertFromFile();
        for(int i=0; i<Dictionary.listWord.size(); i++){
            dml.addElement(Dictionary.listWord.get(i).getWord_target());
        }
        llist.setModel(dml);
    }//GEN-LAST:event_formWindowOpened
    public void update(){
        dml.clear();
        for(int i=0; i<Dictionary.listWord.size(); i++){
            dml.addElement(Dictionary.listWord.get(i).getWord_target());
        }
        llist.setModel(dml);
    }
    private void ftTucantraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftTucantraKeyTyped
        String text = ftTucantra.getText().trim();
        text += evt.getKeyChar();
        for(int i=0; i<dml.size(); i++){
            String val = dml.getElementAt(i);
            if(val.startsWith(text)){
                llist.setSelectedIndex(i);
                JScrollBar sb = jScrollPane1.getVerticalScrollBar();
                sb.setValue(20*i);
                return;
            }
        }
        llist.clearSelection();
        //        String target = ftTucantra.getText();
//        target += evt.getKeyChar();
//        if(target.length()>0){
//        for(int i=0; i<Dictionary.listWord.size(); i++){
//            String s =Dictionary.listWord.get(i).getWord_target();
//            if(!s.startsWith(target)){
//                if(dml.contains(s)){
//                    dml.removeElement(s);
//                } 
//            }else{
//                if(!dml.contains(s)){
//                    dml.addElement(s);
//                } 
//            }
//        }
//        }
        
    }//GEN-LAST:event_ftTucantraKeyTyped
    
    private void llistValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_llistValueChanged
       if(!llist.isSelectionEmpty()){
           int pos = llist.getSelectedIndex();
           taKetqua.setText(Dictionary.listWord.get(pos).getWord_explain());
       }
       else taKetqua.setText("");
    }//GEN-LAST:event_llistValueChanged

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        if(!ftTucantra.getText().equals("")){
            int pos = dicmana.binarySearchWord(ftTucantra.getText().trim());
            if(pos>=0){
            taKetqua.setText(Dictionary.listWord.get(pos).getWord_explain());
            }else{
                JOptionPane.showMessageDialog(rootPane, "Từ này không có trong từ điển");
            }
        }
    }//GEN-LAST:event_btSearchActionPerformed

    private void llistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_llistMouseClicked
        int pos = dicmana.binarySearchWord(llist.getSelectedValue());
        ftTucantra.setText(llist.getSelectedValue());
        taKetqua.setText(Dictionary.listWord.get(pos).getWord_explain());
    }//GEN-LAST:event_llistMouseClicked

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        AddDialog add = new AddDialog(this, true);
        add.setVisible(true);
        update();
    }//GEN-LAST:event_btAddActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btExitActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        if(llist.isSelectionEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Click vào từ để xóa");
        }
        else{
        String text = llist.getSelectedValue();
        int x = llist.getSelectedIndex();
        int confirm = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn xóa từ "+text+" khỏi từ điển ?");
        if(confirm == JOptionPane.YES_OPTION){
            dicmana.deleteWord(text);
            dml.removeElementAt(x);
            JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
            ftTucantra.setText("");
            taKetqua.setText("");
        }
        else if(confirm == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(rootPane, "Hủy xóa");
        }
        }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        EditDialog edit = new EditDialog(this, true);
        edit.setVisible(true);
        update();
    }//GEN-LAST:event_btEditActionPerformed

    private void ftTucantraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftTucantraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftTucantraActionPerformed
    private static final String VOICENAME = "kevin16";
    private void btSpeakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSpeakActionPerformed
        Voice voice;
        VoiceManager vm = VoiceManager.getInstance();
       
        voice = vm.getVoice(VOICENAME);
        
        voice.allocate();
        voice.speak(ftTucantra.getText());
    }//GEN-LAST:event_btSpeakActionPerformed

    private void JBSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSearchActionPerformed
        if (jText.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Text doesn't exist. Please press in Text.");
        } else {
                try {
                        taKetqua.setText(englishVietnamese.translate(jText.getText()));
                    } catch (IOException | ParseException | org.json.simple.parser.ParseException ex) {
                        Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
                    }
        }
    }//GEN-LAST:event_JBSearchActionPerformed

    private void JBspeakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBspeakActionPerformed
       Voice voice;
        VoiceManager vm = VoiceManager.getInstance();
       
        voice = vm.getVoice(VOICENAME);
        
        voice.allocate();
        voice.speak(jText.getText());
    }//GEN-LAST:event_JBspeakActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       Information infor = new Information(this, true);
       infor.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Application().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBSearch;
    private javax.swing.JButton JBspeak;
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btSearch;
    private javax.swing.JButton btSpeak;
    private javax.swing.JFormattedTextField ftTucantra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jText;
    private javax.swing.JList<String> llist;
    private javax.swing.JTextArea taKetqua;
    // End of variables declaration//GEN-END:variables
}
