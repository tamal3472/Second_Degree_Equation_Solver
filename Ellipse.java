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

/**
 *
 * @author Tamal
 */
public class Ellipse extends  JFrame{
    JButton getImage=new JButton("get the image");
    JButton getmore=new JButton("Get more");
    Font fontm=new Font("Monospaced",Font.BOLD,50);
    public ImageIcon ellipse=new ImageIcon("C:\\Users\\Tamal\\Downloads\\EllipsoidMercator_1000.gif");
    public static double x1,y1,a,b,h,g,f,c,c1,A,B,H,r1,r2,ee,eee,Z1,lr,q1,q2,q,w,ta,ma,Z2;
    JLabel jlb=new JLabel("This is a equation of Ellipse");
    Font fst=new Font("Tahoma",Font.BOLD,20);
    public Ellipse(){
         JPanel hyper=new JPanel();
        getmore.setFont(fontm);
        getImage.setFont(fontm);
        setLayout(new BorderLayout(10,10));
        hyper.add(getImage,BorderLayout.EAST);
        hyper.add(getmore,BorderLayout.EAST);
       // JLabel jlb=new JLabel("This is a equation of Hyperbola");
        jlb.setFont(fst);
        jlb.setBorder(new TitledBorder("ANSWER IS:"));
        jlb.setForeground(Color.CYAN);
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
              
               x1=((h*f)-(b*g))/((a*b)-(h*h));
               y1=((h*g)-(a*f))/((a*b)-(h*h));
               
               c1=((g*x1)+(f*y1)+c);
               A=(a/(-1*c1));
               B=(b/(-1*c1));
               H=(h/(-1*c1));
               
               q1=((A+B)/(2*((A*B)-(H*H))));
            
               w=( ((A+B)*(A+B))- (4*((A*B)-(H*H))));
               
               q=Math.sqrt(w);
               
               q2=(q/(2*((A*B)-(H*H))));
              
               ta=(q1+q2);
            
               r1=Math.sqrt(ta);
             
               ma=(q1-q2) ;
         
               r2=Math.sqrt(ma);
           
          
               eee=1-((r2*r2)/(r1*r1));
               ee=Math.sqrt(eee);
          
               Z1=r1/ee;
               Z2=((-1)*Z1);
             
               lr=(2*r2*r2)/r1;
          
             Showsm dfss=new Showsm();
               dfss.sdata(x1, y1, r1, r2, a, h, b, g, f, c);
                dfss.showc();    
           }
           });
        
       getmore.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               
               
               x1=((h*f)-(b*g))/((a*b)-(h*h));
               y1=((h*g)-(a*f))/((a*b)-(h*h));
               
               c1=((g*x1)+(f*y1)+c);
               A=(a/(-1*c1));
               B=(b/(-1*c1));
               H=(h/(-1*c1));
               
               q1=((A+B)/(2*((A*B)-(H*H))));
            
               w=( ((A+B)*(A+B))- (4*((A*B)-(H*H))));
               
               q=Math.sqrt(w);
               
               q2=(q/(2*((A*B)-(H*H))));
              
               ta=(q1+q2);
            
               r1=Math.sqrt(ta);
             
               ma=(q1-q2) ;
         
               r2=Math.sqrt(ma);
           
          
               eee=1-((r2*r2)/(r1*r1));
               ee=Math.sqrt(eee);
          
               Z1=r1/ee;
               Z2=((-1)*Z1);
             
               lr=(2*r2*r2)/r1;
          
               String output="                         ADDITIONAL INFORMATION FOR THE EQUATION    \n\n\n"+"Centre (x,y)= "+"("+x1+","+y1+")\n\n"+"Length of semi-axes:\n"+"r1= "+r1+"\n"+"r2= "+r2+"\n\n"
                       
                       +"Eccentricity= "+ee+"\n\n"+"Feet of directrices: \n"+"Z1= "+Z1+"\n"+"Z1= "+Z2+"\n\n"+
                       "Length of latus rectum= "+lr;
               JScrollPane jsp=new JScrollPane(new JTextArea(output));
               jsp.setPreferredSize(new java.awt.Dimension (904,555));
               JOptionPane.showMessageDialog(null,jsp,"Name",JOptionPane.INFORMATION_MESSAGE,null);
               
               
      
           }
        
    
           
       });  
        
    }

   public void sentData(double m,double n,double o,double p,double q,double r){
        a=m;h=n;b=o;g=p;f=q;c=r;
       // System.out.println(""+a);
   
   }
        
      public static void  showEllipse(){
       Ellipse framddd=new Ellipse();
        framddd.setTitle("Ellipse");
        framddd.setSize(1000,650);
        framddd.setLocationRelativeTo(null);
        framddd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framddd.setVisible(true);
}
}
