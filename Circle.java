/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equasol;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
//import java

/**
 *
 * @author Tamal
 */
public class Circle extends JFrame{
    JButton getmm=new JButton("Get more");
    JButton getImage=new JButton("get the image");
    Font fontm=new Font("Monospaced",Font.BOLD,50);
    public ImageIcon circles=new ImageIcon("C:\\Users\\Tamal\\Downloads\\indexc.jpg");
    public static double x1,y1,a,b,h,g,f,c,c1,A,B,H,r1,r2,ee,eee,Z1,lr,q1,q2,q,w,ta,ma,Z2;
      JLabel jlb=new JLabel("This is a equation of Circle");
      Font fst=new Font("Tahoma",Font.BOLD,20);
    public Circle(){
       JPanel hyper=new JPanel();
        getmm.setFont(fontm);
        getImage.setFont(fontm);
        setLayout(new BorderLayout(10,10));
        hyper.add(getImage,BorderLayout.EAST);
        hyper.add(getmm,BorderLayout.EAST);
       // JLabel jlb=new JLabel("This is a equation of Hyperbola");
        jlb.setFont(fst);
        jlb.setBorder(new TitledBorder("ANSWER IS:"));
        jlb.setForeground(Color.orange);
        hyper.add(jlb,BorderLayout.NORTH);
        //add(ellip,BorderLayout.CENTER);
        JPanel np=new JPanel();
        
        
        np.setLayout(new GridLayout());
        np.add(hyper);
        //np.add(getm);
        np.add(getImage);
        add(np);
       // add(new );
        
        getImage.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
                
               x1=(-1)*g;
               y1=(-1)*f;
               r1=(((g*g)+(f*f))-c);
               r2=Math.sqrt(r1);
               
              Showsm tas=new Showsm();
               tas.sdata(x1, y1, r2, r2, a, h, b, g, f, c);
              tas.showc();
         
               
           }
           });
        
         getmm.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               
               
               x1=(-1)*g;
               y1=(-1)*f;
               r1=(((g*g)+(f*f))-c);
               r2=Math.sqrt(r1);
               
               //System.out.pri
               //System.out.println(""+lr);
               String output="                         ADDITIONAL INFORMATION FOR THE EQUATION    \n\n\n"+"Centre (x,y)= "+"("+x1+","+y1+") \n\n"+
                       "Radius= "+r2;
                       
                  JScrollPane jsp=new JScrollPane(new JTextArea(output));     
               jsp.setPreferredSize(new java.awt.Dimension (904,555));
               JOptionPane.showMessageDialog(null,jsp,"Name",JOptionPane.INFORMATION_MESSAGE,null);
               
               
      
           }
        
    
           
       });  
        
        
    
}
     public void sentDataaa(double m,double n,double o,double p,double q,double r){
        a=m;h=n;b=o;g=p;f=q;c=r;
       // System.out.println(""+a);
   
   }
         public static void  showCircle(){
       Circle framddddd=new Circle();
        framddddd.setTitle("Circle");
        framddddd.setSize(1000,650);
        framddddd.setLocationRelativeTo(null);
        framddddd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framddddd.setVisible(true);
}
}