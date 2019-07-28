/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equasol;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.*;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Tamal
 */
public class Hyperbola extends JFrame{
     JButton getm=new JButton("Get more");
     JButton getImage=new JButton("get the image");
    Font fontm=new Font("Monospaced",Font.BOLD,50);
    Font fst=new Font("Tahoma",Font.BOLD,20);
    
    JLabel jlb=new JLabel("This is a equation of Hyperbola");
    public ImageIcon hyperbola=new ImageIcon("C:\\Users\\Tamal\\Downloads\\HyperboloidOfTwoSheets.png");
     public static double x1,y1,a,b,h,g,f,c,c1,A,B,H,r1,r2,r22,ee,eee,Z1,lr,q1,q2,q,w,ta,ma,Z2;
     public Hyperbola(){
        JPanel hyper=new JPanel();
        getm.setFont(fontm);
        getImage.setFont(fontm);
        setLayout(new BorderLayout(10,10));
        hyper.add(getImage,BorderLayout.EAST);
        hyper.add(getm,BorderLayout.EAST);
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
         
             // tas.showc();
               r22=0;
               
               
               x1=((h*f)-(b*g));
                       if(x1!=0)
                       {x1=((h*f)-(b*g))/((a*b)-(h*h));}
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
               if(ta<0){
                   r22=ta;
                   ma=(q1-q2) ;
                   r1=Math.sqrt(ma);                               
               }
               else{
               r1=Math.sqrt(ta);
               }
               if(r22==0){
               if(ma<0){
                   r22=ma;
               }
               else{
               r2=Math.sqrt(ma);}    
               }
               
               
               if(r22<0){
                   
                   
                   eee=1-(r22/(r1*r1));
               ee=Math.sqrt(eee);
               Z1=r1/ee;
               Z2=((-1)*Z1);

               lr=(2*r22)/r1;lr=lr*(-1);
    
               
               //r22=Math.sqrt(r22);
               Showsm dfs=new Showsm();
               dfs.sdata(x1, y1, r1, r22, a, h, b, g, f, c);
                dfs.showc();
               }
               
               
               
               else{
               eee=1+((r2*r2)/(r1*r1));
               ee=Math.sqrt(eee);
 
               Z1=r1/ee;
               Z2=((-1)*Z1);
               lr=(2*r2*r2)/r1;
                Showsm dfs=new Showsm();
              // dfs.sdata(x1, y1, r1, r2, a, h, b, g, f, c);
                dfs.showc();
               }
           }
           });
        
        getm.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               r22=0;
               
               
               x1=((h*f)-(b*g));
                       if(x1!=0)
                       {x1=((h*f)-(b*g))/((a*b)-(h*h));}
               y1=((h*g)-(a*f))/((a*b)-(h*h));
               
               c1=((g*x1)+(f*y1)+c);
               A=(a/(-1*c1));
               B=(b/(-1*c1));
               H=(h/(-1*c1));
               
               q1=((A+B)/(2*((A*B)-(H*H))));
               
               w=( ((A+B)*(A+B))- (4*((A*B)-(H*H))));
               //System.out.println(""+w);
    
               
               q=Math.sqrt(w);
                       //System.out.println("q"+q);
    
               
               
               q2=(q/(2*((A*B)-(H*H))));
              
               ta=(q1+q2);
               if(ta<0){
                   r22=ta;
                   ma=(q1-q2) ;
                   r1=Math.sqrt(ma);
                   
                   
               }
               else{
               r1=Math.sqrt(ta);
               }
              // System.out.println(""+r1);
               //ma=(q1-q2) ;
               if(r22==0){
               if(ma<0){
                   r22=ma;
               }
               else{
               //System.out.println(""+ma);
               r2=Math.sqrt(ma);}
               
               }
               
               
               //System.out.println(""+r2);
               if(r22<0){
                   
                   
                   eee=1-(r22/(r1*r1));
               ee=Math.sqrt(eee);
               //System.out.println("r1="+r1+" r2="+r2);
               Z1=r1/ee;
               Z2=((-1)*Z1);
               //System.out.println(""+Z);
               lr=(2*r22)/r1;
               lr=lr*(-1);
               //System.out.println(""+lr);
            //   r22=r22*(-1);
               //r22=Math.sqrt(r22);
               String output="                         ADDITIONAL INFORTION FOR THE EQUATION    \n\n\n"+"Center (x,y)= "+"("+x1+","+y1+")\n\n"+"Length of semi-axes:\n"+"r1= "+r1+"\n"+"r2*r2= "+r22+"\n\n"
                       
                       +"Eccentricity= "+ee+"\n\n"+"Feet of directrices: \n"+"Z1= "+Z1+"\n"+"Z1= "+Z2+"\n\n"+
                       "Length of latus rectum= "+lr;
               JScrollPane jsp=new JScrollPane(new JTextArea(output));
               jsp.setPreferredSize(new java.awt.Dimension (904,555));
               JOptionPane.showMessageDialog(null,jsp,"Name",JOptionPane.INFORMATION_MESSAGE,null);
                   
               }
               else{
               eee=1+((r2*r2)/(r1*r1));
               ee=Math.sqrt(eee);
               //System.out.println(""+ee);
               Z1=r1/ee;
               Z2=((-1)*Z1);
               //System.out.println(""+Z);
               lr=(2*r2*r2)/r1;
               
               //System.out.println(""+lr);
               String output="                         ADDITIONAL INFORMATION FOR THE EQUATION    \n\n\n"+"Center (x,y)= "+
                       "("+x1+","+y1+")\n\n"+"Length of semi-axes:\n"+"r1= "+r1+"\n"+"r2= "+r2+"\n\n"
                       
                       +"Eccentricity= "+ee+"\n\n"+"Feet of directrices: \n"+"Z1= "+Z1+"\n"+"Z1= "+Z2+"\n\n"+
                       "Length of latus rectum= "+lr;
               JScrollPane jsp=new JScrollPane(new JTextArea(output));
               jsp.setPreferredSize(new java.awt.Dimension (904,555));
               JOptionPane.showMessageDialog(null,jsp,"Name",JOptionPane.INFORMATION_MESSAGE,null);
               }
               
      
           }
        
    
           
       });  
        
     }
      public void sentDat(double m,double n,double o,double p,double q,double r){
        a=m;h=n;b=o;g=p;f=q;c=r;
       //System.out.println(""+a);
   
   }
        
      public static void  showHyperbola(){
       Hyperbola framdddd=new Hyperbola();
        framdddd.setTitle("Hyperbola");
        framdddd.setSize(1000,650);
        framdddd.setLocationRelativeTo(null);
        framdddd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framdddd.setVisible(true);
}

}
class dhyperbola 
{
    public void paint (Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    g2.draw(new Ellipse2D.Double(50, 50,
                             200,
                             100));
    }
}
