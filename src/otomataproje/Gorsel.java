/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otomataproje;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JPanel;

/**
 *
 * @author MONSTER
 */
public class Gorsel extends JPanel{
    OtomataMain main = new OtomataMain();
    private BufferedImage image;

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        g.drawImage(image, 0, 0, image.getWidth()/10, image.getHeight()/10,this.main);
    }

    @Override
    public void repaint() {
        super.repaint(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Gorsel() {
        
        String cizdirilecek ="GraphvizCikti"+main.getTiklanma()+".png";
        
        try {
     
            image = ImageIO.read(new FileImageInputStream(new File(cizdirilecek)));
        } catch (IOException ex) {
            Logger.getLogger(Gorsel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    
    
    
}
