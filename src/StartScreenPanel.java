/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */


import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class StartScreenPanel extends JFrame { 
JButton jbutton = new JButton("Start Game"); 

public StartScreenPanel() { 
setLayout(null); 
jbutton.setBounds(300, 300, 100, 20); 
jbutton.setFocusable(true); 
add(jbutton); 
JFrame main = new JFrame("Dominion");
JPanel backGround = new JPanel();
backGround.setPreferredSize(new Dimension(700, 700));
backGround.setBackground(new Color (128, 0, 128));

main.getContentPane().add(backGround);
main.setSize(700, 700);
main.setBackground(Color.blue);

JLabel label1 = new JLabel("Neal Traweek");
      main.add(label1);


jbutton.addActionListener(new ActionListener() { 
public void actionPerformed(ActionEvent e) { 
//JFrame start = new JFrame("Game Started"); 
//start.setSize(700, 700);
//JPanel primary = new JPanel();
//primary.setBackground(Color.blue);
//primary.setSize(700, 700);
//start.getContentPane().add(primary);
//start.setVisible(true); 
    
//    public void getActionPanel(){
//       
//        
//    }



        } 
}); 
} 

public static void main(String[] args) { 
    
JPanel primary = new JPanel();

//JFrame frame = new JFrame("Three Panels");
StartScreenPanel s1 = new StartScreenPanel(); 
s1.setSize(700, 700); 
s1.setBackground(Color.yellow);
s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
s1.setVisible(true);

//s1.add(backGround);

    JPanel subPanel1 = new JPanel();
      subPanel1.setPreferredSize(new Dimension(250, 125));
      subPanel1.setBackground(Color.ORANGE);
      JLabel label1 = new JLabel("Neal Traweek");
      subPanel1.add(label1);
      
      
      //frame.getContentPane().add(s1);
      //frame.pack();
      //frame.setVisible(true);      
      


 StartScreenPanel backGround = new StartScreenPanel();
backGround.setPreferredSize(new Dimension(700, 700));
backGround.setBackground(new Color (128, 0, 128));

s1.add(backGround);


PlayerPanel playerPanel = new ActionPanel(new View());
        JFrame frame = new JFrame();
        frame.getContentPane().add(s1);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
}}
