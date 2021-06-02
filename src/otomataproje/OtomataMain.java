/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otomataproje;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author MONSTER
 */
public class OtomataMain extends javax.swing.JFrame {

    /**
     * Creates new form OtomataMain
     */
    
    String dosyaKonumu = "C:\\Users\\MONSTER\\Documents\\NetBeansProjects\\OtomataProje";
    
    private BufferedImage image;    //Gerek kalmadı.
    public OtomataMain() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        yazi_alani = new javax.swing.JTextArea();
        nfa_olustur_buton = new javax.swing.JButton();
        detay_buton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        detaygoster_alani = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        dot_bilgiLabel = new javax.swing.JLabel();
        dosyakonum_ekle = new javax.swing.JButton();
        dfa_olustur_buton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Mdosya_buton = new javax.swing.JMenu();
        dosyaAc_buton = new javax.swing.JMenuItem();
        dosyaKaydet_buton = new javax.swing.JMenuItem();
        cikis_buton = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        ornekBir_buton = new javax.swing.JMenuItem();
        ornekiki_buton = new javax.swing.JMenuItem();
        ornekUc_buton = new javax.swing.JMenuItem();
        ornekdort_buton = new javax.swing.JMenuItem();
        ornekbes_buton = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        yardim_buton = new javax.swing.JMenuItem();
        hakkimizda_buton = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        timesnewroman_buton = new javax.swing.JMenuItem();
        calibri_buton = new javax.swing.JMenuItem();
        arial_buton = new javax.swing.JMenuItem();
        couriernew_buton = new javax.swing.JMenuItem();
        yaziRengi_buton = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Otomata Projesi");

        yazi_alani.setColumns(20);
        yazi_alani.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        yazi_alani.setRows(5);
        jScrollPane1.setViewportView(yazi_alani);

        nfa_olustur_buton.setText("NFA OLUŞTUR");
        nfa_olustur_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nfa_olustur_butonActionPerformed(evt);
            }
        });

        detay_buton.setText("DETAY GÖSTER");
        detay_buton.setMaximumSize(new java.awt.Dimension(106, 25));
        detay_buton.setMinimumSize(new java.awt.Dimension(106, 25));
        detay_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detay_butonActionPerformed(evt);
            }
        });

        detaygoster_alani.setEditable(false);
        detaygoster_alani.setColumns(20);
        detaygoster_alani.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        detaygoster_alani.setRows(5);
        jScrollPane2.setViewportView(detaygoster_alani);

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel1.setText("Lütfen aşağıdaki metin alanı bir regex ifadesi giriniz:");

        dot_bilgiLabel.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        dot_bilgiLabel.setForeground(new java.awt.Color(0, 153, 0));

        dosyakonum_ekle.setText("DOSYA KONUMU EKLE");
        dosyakonum_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosyakonum_ekleActionPerformed(evt);
            }
        });

        dfa_olustur_buton.setText("DFA OLUŞTUR");
        dfa_olustur_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dfa_olustur_butonActionPerformed(evt);
            }
        });

        Mdosya_buton.setText("Dosya");

        dosyaAc_buton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        dosyaAc_buton.setText("Dosya Aç");
        dosyaAc_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosyaAc_butonActionPerformed(evt);
            }
        });
        Mdosya_buton.add(dosyaAc_buton);

        dosyaKaydet_buton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        dosyaKaydet_buton.setText("Dosya Kaydet");
        dosyaKaydet_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosyaKaydet_butonActionPerformed(evt);
            }
        });
        Mdosya_buton.add(dosyaKaydet_buton);

        cikis_buton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        cikis_buton.setText("Çıkış");
        cikis_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikis_butonActionPerformed(evt);
            }
        });
        Mdosya_buton.add(cikis_buton);

        jMenuBar1.add(Mdosya_buton);

        jMenu5.setText("Örnekler");

        ornekBir_buton.setText("Örnek 1");
        ornekBir_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ornekBir_butonActionPerformed(evt);
            }
        });
        jMenu5.add(ornekBir_buton);

        ornekiki_buton.setText("Örnek 2");
        ornekiki_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ornekiki_butonActionPerformed(evt);
            }
        });
        jMenu5.add(ornekiki_buton);

        ornekUc_buton.setText("Örnek 3");
        ornekUc_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ornekUc_butonActionPerformed(evt);
            }
        });
        jMenu5.add(ornekUc_buton);

        ornekdort_buton.setText("Örnek 4");
        ornekdort_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ornekdort_butonActionPerformed(evt);
            }
        });
        jMenu5.add(ornekdort_buton);

        ornekbes_buton.setText("Örnek 5");
        ornekbes_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ornekbes_butonActionPerformed(evt);
            }
        });
        jMenu5.add(ornekbes_buton);

        jMenuBar1.add(jMenu5);

        jMenu4.setText("Yardım");

        yardim_buton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        yardim_buton.setText("Yardım");
        yardim_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yardim_butonActionPerformed(evt);
            }
        });
        jMenu4.add(yardim_buton);

        hakkimizda_buton.setText("Hakkımızda");
        hakkimizda_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hakkimizda_butonActionPerformed(evt);
            }
        });
        jMenu4.add(hakkimizda_buton);

        jMenuBar1.add(jMenu4);

        jMenu1.setText("Ayarlar");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenu2.setText("Yazı Tipi");

        timesnewroman_buton.setText("Times New Roman");
        timesnewroman_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timesnewroman_butonActionPerformed(evt);
            }
        });
        jMenu2.add(timesnewroman_buton);

        calibri_buton.setText("Calibri");
        calibri_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calibri_butonActionPerformed(evt);
            }
        });
        jMenu2.add(calibri_buton);

        arial_buton.setText("Arial");
        arial_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arial_butonActionPerformed(evt);
            }
        });
        jMenu2.add(arial_buton);

        couriernew_buton.setText("Courier New");
        couriernew_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                couriernew_butonActionPerformed(evt);
            }
        });
        jMenu2.add(couriernew_buton);

        jMenu1.add(jMenu2);

        yaziRengi_buton.setText("Yazı Rengi");
        yaziRengi_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yaziRengi_butonActionPerformed(evt);
            }
        });
        jMenu1.add(yaziRengi_buton);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nfa_olustur_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dfa_olustur_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(detay_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                        .addComponent(dosyakonum_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dot_bilgiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dosyakonum_ekle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nfa_olustur_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(detay_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfa_olustur_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dot_bilgiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dosyaAc_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosyaAc_butonActionPerformed
        JFileChooser fc = new JFileChooser();
        int i = fc.showOpenDialog(this);     
        if(i == JFileChooser.APPROVE_OPTION){           
            File file = fc.getSelectedFile();
            String icerik = "";
            
            try(Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))){
                
                while(scanner.hasNextLine()){
                    
                    icerik += scanner.nextLine() + "\n";
                    
                }
                yazi_alani.setText(icerik);
                
            } catch (FileNotFoundException ex) {    //Dosya Bulunamadı Hatası!
                Logger.getLogger(OtomataMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_dosyaAc_butonActionPerformed

    private void dosyaKaydet_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosyaKaydet_butonActionPerformed
        JFileChooser fc = new JFileChooser();
        int cevap = fc.showSaveDialog(this);
        
        if(cevap == JFileChooser.APPROVE_OPTION){
            
            String dosya_yolu = fc.getSelectedFile().getPath(); //Seçilen dosyanın "dosya yolunu alma" işlemi yapılmakta. getPath() = dosya yolu
        
            try(FileWriter writer = new FileWriter(dosya_yolu)){
                
                writer.write(yazi_alani.getText());
                
                
            } catch (IOException ex) {
                Logger.getLogger(OtomataMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }//GEN-LAST:event_dosyaKaydet_butonActionPerformed

    private void cikis_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikis_butonActionPerformed
        System.exit(0);            
    }//GEN-LAST:event_cikis_butonActionPerformed

    private void yardim_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yardim_butonActionPerformed
        JOptionPane.showMessageDialog(this, "Örnekler menüsüne tıklayarak örnekler girebilirsiniz."
                + "\nGirilen Regex ifadesinde yalnızca '|' , '*' sembolleri kullanılabilir."
                + "\nProgram Concat işlemini kendi algılamaktadır. '&' sembolünü girmenize gerek yoktur."
                + "\nRegex ifadesini girdikten sonra 'Detay Göster' butonuna tıklarsanız Parse (ayrıştırma) işlemini görebilirsiniz."
                + "\nRegex ifadesini girdikten sonra 'NFA OLUŞTUR' butonuna tıklarsanız JAR dosyasının olduğu konuma Graph'ı çizdirecektir.");            
    }//GEN-LAST:event_yardim_butonActionPerformed

    private void hakkimizda_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hakkimizda_butonActionPerformed
        Hakkimizda hakkimizda = new Hakkimizda();
        hakkimizda.setVisible(true);
    }//GEN-LAST:event_hakkimizda_butonActionPerformed

    private void ornekBir_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ornekBir_butonActionPerformed
        String ornekbir = "ab|b";
        
        yazi_alani.setText(ornekbir);
    }//GEN-LAST:event_ornekBir_butonActionPerformed

    private void ornekiki_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ornekiki_butonActionPerformed
        String ornekiki = "a(a|b)*b";
        
        yazi_alani.setText(ornekiki);
    }//GEN-LAST:event_ornekiki_butonActionPerformed

    private void ornekUc_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ornekUc_butonActionPerformed
        String ornekuc = "ab(a|ba*)*";
        
        yazi_alani.setText(ornekuc);
    }//GEN-LAST:event_ornekUc_butonActionPerformed

    private void yaziRengi_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yaziRengi_butonActionPerformed
        Color color = JColorChooser.showDialog(this, "Bir renk seçiniz.", Color.BLACK);
        yazi_alani.setForeground(color);
    }//GEN-LAST:event_yaziRengi_butonActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void couriernew_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_couriernew_butonActionPerformed
        Font font = new Font("Courier New", Font.BOLD, 20);          
        yazi_alani.setFont(font);
    }//GEN-LAST:event_couriernew_butonActionPerformed

    private void arial_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arial_butonActionPerformed
        Font font = new Font("Arial", Font.BOLD, 20);          
        yazi_alani.setFont(font);
    }//GEN-LAST:event_arial_butonActionPerformed

    private void calibri_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calibri_butonActionPerformed
        Font font = new Font("Calibri", Font.BOLD, 20);          
        yazi_alani.setFont(font);
    }//GEN-LAST:event_calibri_butonActionPerformed

    private void timesnewroman_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timesnewroman_butonActionPerformed
        Font font = new Font("Times New Roman", Font.BOLD, 20);          
        yazi_alani.setFont(font);
    }//GEN-LAST:event_timesnewroman_butonActionPerformed

    private void detay_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detay_butonActionPerformed
        
        String regextString = yazi_alani.getText();
        Regex regex1 = new Regex(regextString);
        String ilksonuc = "Regex'in Parse Edilmiş Hali:\t\t"+ regex1.getAyristilan();
        detaygoster_alani.setText(ilksonuc);
        regex1.reset();       
        detaygoster_alani.setText(ilksonuc + "\n\n" + "NFA çıktısı şu şekilde olacaktır:\n\n" + regex1.transformNFA());
        regex1.reset();
        
        String dot_kod = String.valueOf(regex1.transformNFA());     //valueof ile obje dönüşümü sağladık. "Graph cannot converted to String" hatasını engelledik.
        
    
    try(FileWriter dotKoduOlustur=new FileWriter("Graphviz.dot")){  //Graphın resmini çıkartan kodu dışarı aktarır.
        dotKoduOlustur.write("");
        dotKoduOlustur.write(dot_kod);
        } catch (IOException ex) {
            System.out.println("dosya oluşturulurken hata oluştu");
        }          
    

       
    
    
    }//GEN-LAST:event_detay_butonActionPerformed

    
    
    
    private void ornekdort_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ornekdort_butonActionPerformed
        String ornekdort = "a(a|b)*b(a|a*)";
        yazi_alani.setText(ornekdort);
    }//GEN-LAST:event_ornekdort_butonActionPerformed

   
    
    
    private void nfa_olustur_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nfa_olustur_butonActionPerformed
        
        try
        {           
            dot_bilgiLabel.setText("Girdiğiniz NFA'nin grafı başarılı bir şekilde oluşturulmuştur. Lütfen dosyaların bulunduğu konumu kontrol ediniz.");       
            try
            {
                Runtime.getRuntime().exec("cmd.exe /c cd "+dosyaKonumu+" & start cmd.exe /k \"dot -Tpng Graphviz.dot -o GraphvizCikti.png\"");  //cmdde jar'ın bulunduğu konuma giriş yapar ve graphı .png olarak çıktı alır.
                Thread.sleep(2000); //2 saniye bekle
                Runtime.getRuntime().exec("taskkill /f /im cmd.exe");   //cmd'yi kapatır.
            }
            catch (Exception e) //Hata yakalama
            {
                System.out.println("Bilinmeyen bir hata oluştu.");
                e.printStackTrace();
            }
            Thread.sleep(2500); //2.5 saniye bekkle          
            File f = new File(dosyaKonumu+"\\GraphvizCikti.png");   
            Desktop d = Desktop.getDesktop();
            d.open(f);  //Graphın çıktısını (resmini) aç
            
        } catch (InterruptedException ex) {
            Logger.getLogger(OtomataMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(OtomataMain.class.getName()).log(Level.SEVERE, null, ex);
        }

      
    }//GEN-LAST:event_nfa_olustur_butonActionPerformed

    private void ornekbes_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ornekbes_butonActionPerformed
        String ornekbes = "(a|b)*abb(a|b)*(abb*|ba)a*";
        yazi_alani.setText(ornekbes);
    }//GEN-LAST:event_ornekbes_butonActionPerformed

    private void dosyakonum_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosyakonum_ekleActionPerformed
        DosyaKonumu konum = new DosyaKonumu();
        konum.setVisible(true);
        dosyaKonumu = konum.getKonum();
    }//GEN-LAST:event_dosyakonum_ekleActionPerformed

    private void dfa_olustur_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dfa_olustur_butonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dfa_olustur_butonActionPerformed




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
            java.util.logging.Logger.getLogger(OtomataMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OtomataMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OtomataMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OtomataMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OtomataMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Mdosya_buton;
    private javax.swing.JMenuItem arial_buton;
    private javax.swing.JMenuItem calibri_buton;
    private javax.swing.JMenuItem cikis_buton;
    private javax.swing.JMenuItem couriernew_buton;
    private javax.swing.JButton detay_buton;
    private javax.swing.JTextArea detaygoster_alani;
    private javax.swing.JButton dfa_olustur_buton;
    private javax.swing.JMenuItem dosyaAc_buton;
    private javax.swing.JMenuItem dosyaKaydet_buton;
    private javax.swing.JButton dosyakonum_ekle;
    private javax.swing.JLabel dot_bilgiLabel;
    private javax.swing.JMenuItem hakkimizda_buton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton nfa_olustur_buton;
    private javax.swing.JMenuItem ornekBir_buton;
    private javax.swing.JMenuItem ornekUc_buton;
    private javax.swing.JMenuItem ornekbes_buton;
    private javax.swing.JMenuItem ornekdort_buton;
    private javax.swing.JMenuItem ornekiki_buton;
    private javax.swing.JMenuItem timesnewroman_buton;
    private javax.swing.JMenuItem yardim_buton;
    private javax.swing.JMenuItem yaziRengi_buton;
    public javax.swing.JTextArea yazi_alani;
    // End of variables declaration//GEN-END:variables
}