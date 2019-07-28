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
public class Pair_of_Straightline extends JFrame {
    JButton getImage=new JButton("get the image");
     JButton getmmm=new JButton("Get more");
    Font fontm=new Font("Monospaced",Font.BOLD,50);
     //  public static double x1,y1,a,b,h,g,f,c,c1,A,B,H,r1,r2,ee,eee,Z1,lr,q1,q2,q,w,ta,ma,Z2;
    public ImageIcon psl=new ImageIcon("C:\\Users\\Tamal\\Downloads\\straightline.jpg");
    public static double x1,y1,a,b,h,g,f,c,c1,A,B,H,r1,r2,ee,eee,Z1,lr,q1,q2,q,w,ta,ma,A1,B1,C1,A2,B2,C2,angle,inX,inY;
    public static double[] X1=new double[10000];
     public static double[] Y1=new double[10000];
      public static double[] X2=new double[10000];
       public static double[] Y2=new double[10000];
        JLabel jlb=new JLabel("This is a equation of Pair of StraightLine");
        Font fst=new Font("Tahoma",Font.BOLD,20);
    public Pair_of_Straightline(){
        
        JPanel ps=new JPanel();
        getmmm.setFont(fontm);
        getImage.setFont(fontm);
        setLayout(new BorderLayout(10,10));
        ps.add(getImage,BorderLayout.EAST);
        ps.add(getmmm,BorderLayout.EAST);
       // JLabel jlb=new JLabel("This is a equation of Hyperbola");
        jlb.setFont(fst);
        jlb.setBorder(new TitledBorder("ANSWER IS:"));
        jlb.setForeground(Color.CYAN);
        ps.add(jlb,BorderLayout.NORTH);
        
       
        JPanel np=new JPanel(); 
        np.setLayout(new GridLayout());
        np.add(ps);
        np.add(getImage);
        add(np);
       // add(new );
        
    
        getImage.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               if((a*b)!=(h*h)){
              for(int i=-100;i<=100;i++)
              {
                  Y1[i+100]=(((-2*a*i)-(2*g))/(2*h));
                  X1[i+100]=i;
              }
               for(int i=-100;i<=100;i++)
              {
                  Y2[i+100]=(((-2*h*i)-(2*f))/(2*b));
                  X2[i+100]=i;
              }
              inX=(((4*h*f)-(4*g*h))/((4*a*b)-(4*h*h)));
              inY=(((4*g*h)-(4*f*a))/((4*a*b)-(4*h*h)));
              Showpair pnew =new Showpair();
              pnew.senpData(X1,Y1,X2,Y2,inX,inY);
              pnew.showpis();
               }
           }
           });
         getmmm.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               
               String equf="First equation of line is  ";
              A1=a*2;
              B1=2*h;
              C1=2*g;
              equf=equf+A1;
              equf=equf+"x+";
              equf=equf+B1;
              equf=equf+"y+";
              equf=equf+C1;
              equf=equf+"=0";
              
              String equs="Second equation of line is ";
              A2=2*h;
              B2=2*b;
              C2=f*2;
              equs=equs+A2;
              equs=equs+"x+";
              equs=equs+B2;
              equs=equs+"y+";
              equs=equs+C2;
              equs=equs+"=0";
              angle=2*Math.sqrt((h*h)-(a*b));
              angle=angle/(a+b);
              angle=Math.atan(angle);
              if((a*b)==(h*h))
              {
                  angle=Math.tan(90);
              }
              
             
              
               //System.out.pri
               //System.out.println(""+lr);
               String output="                         ADDITIONAL INFORMATION FOR THE EQUATION    \n\n\n\n"+equf+".\n\n"+equs+"."
                       +"\n\n angle between two line is "+angle+" radian";
                       
                JScrollPane jsp=new JScrollPane(new JTextArea(output));       
               jsp.setPreferredSize(new java.awt.Dimension (904,555));
               JOptionPane.showMessageDialog(null,jsp,"Name",JOptionPane.INFORMATION_MESSAGE,null);
               
               
      
           }
        
    
           
       });  
        
        
    
}
    public void senData(double as,double hs,double bs,double gs,double fs,double cs)
    {
        a=as;
        h=hs;
        b=bs;
        g=gs;
        f=fs;
        c=cs;
        
    }
     
       // System.out.println(""+a);
   
   
         public static void  showPs(){
           Pair_of_Straightline faramddddd=new Pair_of_Straightline();
        faramddddd.setTitle("Circle");
        faramddddd.setSize(1000,650);
        faramddddd.setLocationRelativeTo(null);
        faramddddd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        faramddddd.setVisible(true);
}

    
}
