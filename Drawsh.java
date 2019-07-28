/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equasol;
import javax.swing.AbstractAction.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
/**
 *
 * @author TAMAL
 */
public class Drawsh extends JFrame {
    JButton enter=new JButton("Refresh");
    JButton bac=new JButton("Back");
    JButton done=new JButton("Done");
    
       Font fonten=new Font("Serif",Font.BOLD,25);
    public Drawsh()
    {
         setTitle("DrawPolygon");
        PolygonsPanel p =new PolygonsPanel();
        enter.setFont(fonten);
        enter.setBackground(Color.BLUE);
        enter.setForeground(Color.green);
        enter.setToolTipText("Click here to enter the Application");
        bac.setFont(fonten);
        bac.setBackground(Color.BLUE);
        bac.setForeground(Color.green);
        bac.setToolTipText("Click here to enter the Application");
        done.setFont(fonten);
        done.setBackground(Color.BLUE);
        done.setForeground(Color.green);
        done.setToolTipText("Click here to enter the Application");
        JPanel pp=new JPanel();
        pp.setLayout(new FlowLayout());
        pp.add(enter);
        pp.add(bac);
        pp.add(done);
        p.add(pp);
        
        //p.add(enter);
        add(p);
         enter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Mdraw nm=new Mdraw();
               nm.shownew();
            }
            });
         bac.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 Text tee=new Text();
                 tee.showF();
             }
         });
          done.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 PicIn dsa=new PicIn();
                 dsa.shwf();
             }
         });
         
    }
    public static void showsh()
    {
        Drawsh  frame=new Drawsh();
       frame.setTitle("MoveMessageDemo");
       frame.setSize(1000, 650);
       frame.setLocationRelativeTo(null);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
    }
    static class PolygonsPanel extends JPanel{
    private String message="hi there";
    private int x=20;
    private int y=20;
    private int j[]=new int[10000000];
   private int h[]=new int[10000000];
    private int k=0;
int xright,xmiddle,yup,ydown,yright;

private PolygonsPanel()
        {//message=s;  
            
            
        addMouseMotionListener(new MouseMotionAdapter(){
            public void mouseDragged(MouseEvent e)
            {x=e.getX();
             y=e.getY();
             System.out.println(x+" "+y);
             j[k]=x;h[k]=y;
             k++;
            repaint();
             System.out.println(j[k-1]+" "+h[k-1]);
           PicIn teee=new PicIn();  teee.shPin(j,h,k);
            }
            }); 
        }


protected void paintComponent(Graphics g){
super.paintComponent(g);
// System.out.println(j);
g.drawLine(0,300,1000,300);
g.drawLine(470,0,470,600);
g.drawString("(0,0)", 475,310);
g.drawPolyline(j,h,k-1);
g.dispose();




}
}
}
