/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equasol;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author TAMAL
 */
public class Mdraw extends JFrame {
         JButton enter=new JButton("Get result");
       Font fonten=new Font("Serif",Font.BOLD,25);
    public Mdraw()
    {
        setTitle("DrawPolygon");
        PolygonsPanel p =new PolygonsPanel();
        enter.setFont(fonten);
        enter.setBackground(Color.BLUE);
        enter.setForeground(Color.green);
        enter.setToolTipText("Click here to enter the Application");
        p.add(enter);
        add(p);
         enter.addActionListener((ActionEvent e) ->{
             Mdraw nm=new Mdraw();
             nm.shownew();
        });
        
    }
     public static void shownew() {
       Drawsh  framed=new Drawsh();
       framed.setTitle("MoveMessageDemo");
       framed.setSize(1000, 650);
       framed.setLocationRelativeTo(null);
       framed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       framed.setVisible(true);
        
        // TODO code application logic here
    
    
}
     static class PolygonsPanel extends JPanel{
    private final String message="hi there";
    private int x=20;
    private int y=20;
    int j[]=new int [1000];
    int h[]=new int[1000];
     int k=0;
  
public PolygonsPanel()
        {//message=s;
        addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseDragged(MouseEvent e)
            {x=e.getX();
             y=e.getY();
             System.out.println(x+" "+y);
             j[k]=x;h[k]=y;
             k++;
            repaint();
            
             System.out.println(j[k-1]+" "+h[k-1]);
            }
            }); 
        
      
        
        
        }


    @Override
    protected void paintComponent(Graphics g){
super.paintComponent(g);
// System.out.println(j);

g.drawPolyline(j,h,k-1);
g.dispose();

//g.drawLine(j-10,k-10,x,y);


}
    
}
}