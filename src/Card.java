
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
public class Card {
    
    private String name;
    private String type;
    private int cost;
    private Action action;
    private int value;
    private int cashValue;
    private boolean attack;
    private boolean reaction;
    private ImageIcon img;

    public Card() {
        setImage("cardArt/back.jpg");
    }

    public int getCost() {
        return cost;
    }
    
    public void setCost(int cost){
        this.cost = cost;
    }

    public Action getAction() {
        return action;
    }
    
    public void setAction(Action action){
        this.action = action;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getType() {
        return type;
    }
    
    public void setType(String type){
        this.type = type;
    }

    public int getValue() {
        return value;
    }
    
    public void setValue(int value){
        this.value = value;
    }

    public int getCashValue() {
        return cashValue;
    }
    
    public void setCashValue(int cashValue) {
        this.cashValue = cashValue;
    }
    
    public boolean isAttack(){
        return attack;
    }
    
    public void setAttack(boolean tf){
        attack = tf;
    }
    
    public boolean isReaction(){
        return reaction;
    }
    
    public void setReaction(boolean tf){
        reaction = tf;
    }

    public ImageIcon getImage() {
        return img;
    }
    
    void setImage(String location){
        try {
            BufferedImage pic = ImageIO.read(new File(location));
            img = new ImageIcon(pic);
        } catch (IOException ex) {
            Logger.getLogger(Copper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
