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
public class Parabola extends JFrame{
    JButton get=new JButton("Get more");
    JButton getImage=new JButton("get the image");
    Font fontm=new Font("Monospaced",Font.BOLD,50);
    public ImageIcon parabol=new ImageIcon("C:\\Users\\Tamal\\Downloads\\index.gif");
    public static double x1,y1,a,b,h,g,f,c,c1,A,B,H,r1,r2,ee,eee,Z1,lr,q1,q2,q,w,ta,ma,Z2;
        JLabel jlb=new JLabel("This is a equation of Parabola");
        Font fst=new Font("Tahoma",Font.BOLD,20);
    public Parabola(){
   JPanel hyper=new JPanel();
        get.setFont(fontm);
        getImage.setFont(fontm);
        setLayout(new BorderLayout(10,10));
        hyper.add(getImage,BorderLayout.EAST);
        hyper.add(get,BorderLayout.EAST);
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
              Showsm tas=new Showsm();
              tas.showc();
               
           }
           });
        
       get.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               
               
               x1=((h*f)-(b*g))/((a*b)-(h*h));
               y1=((h*g)-(a*f))/((a*b)-(h*h));
               
               c1=((g*x1)+(f*y1)+c);
               A=(a/(-1*c1));
               B=(b/(-1*c1));
               H=(h/(-1*c1));
               
               q1=((A+B)/(2*((A*B)-(H*H))));
               //System.out.println(""+q1);
               w=( ((A+B)*(A+B))- (4*((A*B)-(H*H))));
               
               q=Math.sqrt(w);
               
               q2=(q/(2*((A*B)-(H*H))));
              
               ta=(q1+q2);
               //System.out.println(""+ta);
               r1=Math.sqrt(ta);
              // System.out.println(""+r1);
               ma=(q1-q2) ;
               //System.out.println(""+ma);
               r2=Math.sqrt(ma);
               //System.out.println(""+r2);
          
               eee=1-((r2*r2)/(r1*r1));
               ee=1;
               //System.out.println(""+ee);
               Z1=r1/ee;
               Z2=((-1)*Z1);
               //System.out.println(""+Z);
               lr=(2*r2*r2)/r1;
               //System.out.println(""+lr);
               String output="                         ADDITIONAL INFORMATION FOR THE EQUATION    \n\n\n"+"Centre (x,y)="+0+","
                       +0+"\n\n"
                       
                       +"Eccentricity= "+ee+"\n\n"+"Feet of directrices: \n"+"Z1= "+Z1+"\n"+"Z1= "+Z2+"\n\n"+
                       "Length of latus rectum= "+lr+"\n\n\n These data can be calculated by solving the parabolic equation manually\n\n";
               JScrollPane jsp=new JScrollPane(new JTextArea(output));
               jsp.setPreferredSize(new java.awt.Dimension (904,555));
               JOptionPane.showMessageDialog(null,jsp,"Name",JOptionPane.INFORMATION_MESSAGE,null);
               
               
      
           }
        
    
           
       });  
        
    }

   public void sentDataa(double m,double n,double o,double p,double q,double r){
        a=m;h=n;b=o;g=p;f=q;c=r;
       // System.out.println(""+a);
   
   }
        
      public static void  showParabola(){
       Parabola framdddd=new Parabola();
        framdddd.setTitle("Parabola");
        framdddd.setSize(1000,650);
        framdddd.setLocationRelativeTo(null);
        framdddd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framdddd.setVisible(true);
        
}
    
}
/**
 *
 * @author TAMAL
*/
