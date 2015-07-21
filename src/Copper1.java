
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
class Copper1 extends Card1 {
    
    private String name = "copper";
    private String type = "Money";
    private int cost = 0;
    private Action action = null; 
    private int value = 0;
    private int cashValue = 1;
    private boolean attack = false;
    private boolean reaction = false;
    private ImageIcon img;

    public Copper1() {
        try {
            BufferedImage pic = ImageIO.read(new File("cardArt/copper.jpg"));
            img = new ImageIcon(pic);
        } catch (IOException ex) {
            Logger.getLogger(Copper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        Copper copper = new Copper();
        panel.add(new JLabel(copper.getImage()));
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
