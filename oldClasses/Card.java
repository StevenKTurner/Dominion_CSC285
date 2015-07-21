
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
public interface Card {
    
    public String getName();    
    public String getType();
    public int getCost();
    public Action getAction();
    public int getValue();
    public int getCashValue();
    public boolean isAttack();
    public boolean isReaction();
    public ImageIcon getImage();
    
    
}
