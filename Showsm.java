/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equasol;

/**
 *
 * @author TAMAL
 */
//import static equasol.Showsm.hx;
import java.awt.geom.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author TAMAL
 */
public class Showsm extends JFrame{
    JButton jbd=new JButton("Back");
    static double [] hx=new double[10000];
    static double [] hy=new double[10000];
    public double a,b,c,h,g,f,res,st,fin,r1,r2; 
    int kf=0;
    Font fm=new Font("Tahoma",Font.BOLD,30);
    public Showsm()
    {
        jbd.setFont(fm);
        jbd.setForeground(Color.green);
       // jbd.setBackground(Color.LIGHT_GRAY);
        
        JPanel ppp=new JPanel();
        ppp.setLayout(new BorderLayout());
        ppp.add(jbd,BorderLayout.CENTER);
        setLayout(new BorderLayout());
        add(ppp,BorderLayout.NORTH);
        
        
         add(new NewPanel());
         jbd.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 Text df=new Text();
                 df.showF();
             }
         });
    }
    public void sdata( double cx,double cy,double r1r1,double r2r2,double aa,double hh,double bb,double gg,double ff,double cc)
    {
        st=cx;
        fin=cy;
        a=aa;
        h=hh;
        b=bb;
        g=gg;
        f=ff;
        c=cc;
        r1=r1r1;
        r2=r2r2;
        
        System.out.println(r2);
        double dx=st-(r1/2);
        double fx=st+(r1/2);
        double dy=fin-(r2/2);
        double fy=fin+(r2/2);
        double radiu=Math.sqrt(((st*st)+(fin*fin)-c));
       
        
        NewPanel sds=new NewPanel();
        sds.sd(r1,r2,st,fin,radiu);
    }
   public static void showc(){
        Showsm fram=new Showsm();
        fram.setTitle("USER'S GUIDELINE FRONT");
        fram.setSize(1000,650);
        fram.setLocationRelativeTo(null);
        fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fram.setVisible(true);
        
   }

    

 static class NewPanel extends JPanel{
     int kff;
    static double[] hhx=new double[1000];
    static double[] hhy=new double[1000];
   static public double rr1,rr2,xc,yc,calkux1,calkuy1,calkux2,calkuy2,rad;
     public void sd(double r1a,double r2a,double cas,double cay,double ra)
     {
       
         rr1=r1a;
         rr2=r2a;
         xc=cas;
         yc=cay;
         rad=(float)ra;
            System.out.println(rr2);
         // System.out.println(hhy[25]);
     }
     public NewPanel()
     {
calkux1=((500+xc)-((rr1*80)/2));         
calkux2=(500+xc)+(rr1*80/2);
calkuy1=(300+yc)-(rr2*80/2);
calkuy2=(300+yc)+(rr2*80/2);
   System.out.println(calkux2);
     }
     
 @Override
    public void paint (Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    g2.drawLine(500, 0, 500, 600);
    g2.drawLine(0, 300, 1000, 300);
    g2.drawString("(0,0)", 502, 310);
    g2.setColor(Color.red);
  
   String msg="center(";
   msg=msg+xc;
   msg=msg+",";
   msg=msg+yc;
   msg=msg+")";
   double cenx,ceny;
   cenx=500+xc;
   ceny=300-yc;
if(rr1==rr2){
    g2.draw(new Ellipse2D.Double((500-rr1),300-(yc+(rr2*10)),rr1*10,rr2*10));
    g2.setColor(Color.MAGENTA);
String msgg="Radius=";
msgg=msgg+rad;

g2.setFont(new Font("Tahoma",Font.BOLD,10));
g2.drawString(msg,850,15);
g2.drawString("1px is 10px for X & Y axes", 30, 15);
g2.drawString(msgg, 850, 25);

}
// g2.draw(new Ellipse2D.Double(500,250,300,100));
   if(rr1!=rr2){
g2.draw(new Ellipse2D.Double(calkux1,300-(yc+((rr2*80)/2)),rr1*80,rr2*80));
   g2.setColor(Color.MAGENTA);

g2.drawString(msg,(int)cenx,(int)ceny);
g2.setFont(new Font("Tahoma",Font.BOLD,15));
g2.drawString("1px is 80px for X & Y axes", 15, 18);
   }
    }

        
    }
}