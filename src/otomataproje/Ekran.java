/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otomataproje;

import java.awt.HeadlessException;
import javax.swing.JFrame;


public class Ekran extends JFrame{

    public Ekran(String title) throws HeadlessException {
        super(title);
    }
    
    public static void main(String[] args) {
        
        Ekran ekran = new Ekran("Çıktı");
        Gorsel gorsel = new Gorsel();
        
        ekran.setVisible(true);
        ekran.setResizable(true);
        ekran.setSize(10000,5000);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        ekran.add(gorsel);
        
    }
    
}
