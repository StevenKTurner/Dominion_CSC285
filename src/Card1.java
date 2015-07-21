
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class Card1 {
    
    private String name;
    private String type;
    private int cost;
    private Action action;
    private int value;
    private int cashValue;
    private boolean attack;
    private boolean reaction;
    private ImageIcon img;

    public Card1() {
        try {
            BufferedImage pic = ImageIO.read(new File("cardArt/back.jpg"));
            img = new ImageIcon(pic);
        } catch (IOException ex) {
            Logger.getLogger(Copper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getCost() {
        return cost;
    }

    public Action getAction() {
        return action;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getValue() {
        return value;
    }

    public int getCashValue() {
        return cashValue;
    }
    
    public boolean isAttack(){
        return attack;
    }
    
    public boolean isReaction(){
        return reaction;
    }

    public ImageIcon getImage() {
        return img;
    }
    
}
