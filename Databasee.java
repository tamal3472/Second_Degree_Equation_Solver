/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equasol;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author TAMAL
 */
public class Databasee extends JFrame implements ActionListener,KeyListener{
    JButton equ=new JButton("Euation");
    JButton sh=new JButton("Shape");
    JMenuBar menubar;
    JMenuItem sirOpen,sirSave,sirType,sirDiv;
    JMenuItem vtcopen,vtcSave,vtcType,vtcDiv;
    JLabel jbld=new JLabel();
    
    
    public Databasee()
    {
         equ.setFont(new Font("Serif",Font.BOLD,25));
        equ.setBackground(Color.GREEN);
        equ.setForeground(Color.BLUE);
         sh.setFont(new Font("Serif",Font.BOLD,25));
        sh.setBackground(Color.GREEN);
        sh.setForeground(Color.BLUE);
        
        setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
        add(equ);
        add(sh);
        equ.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              WorkIn wta=new WorkIn();
              wta.showw();
              
          }
        });
        sh.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Drawsh sdf=new Drawsh();
                sdf.showsh();
            }
        });
        
    }
     public static void  showd() {  
    Databasee fram=new Databasee();
       fram.pack();
        fram.setTitle("USER'S GUIDELINE FRONT");
        fram.setSize(1000,650);
        fram.setLocationRelativeTo(null);
        fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fram.setVisible(true);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
