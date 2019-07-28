/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package equasol;
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
public class Showpair extends JFrame {
     JButton jbd=new JButton("Back");
  public static double[] X11=new double[10000];
     public static double[] Y11=new double[10000];
      public static double[] X22=new double[10000];
       public static double[] Y22=new double[10000];
       public static double innx,inny;
     Font fm=new Font("Tahoma",Font.BOLD,30);
     public Showpair()
     {
           jbd.setFont(fm);
        jbd.setForeground(Color.green);
       // jbd.setBackground(Color.LIGHT_GRAY);
        
        JPanel ppp=new JPanel();
        ppp.setLayout(new BorderLayout());
        ppp.add(jbd,BorderLayout.CENTER);
        setLayout(new BorderLayout());
        add(ppp,BorderLayout.NORTH);
        
        
         add(new NewPanels());
         jbd.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 Text df=new Text();
                 df.showF();
             }
         });
    }
     public void senpData(double[]xa,double []ya,double []xb,double []yb,double xin,double yin)
     {
         X11=xa;
         X22=xb;
         Y11=ya;
         Y22=yb;
         innx=xin;
         inny=yin;
         NewPanels pp=new NewPanels();
         pp.sendat(X11,Y11,X22,Y22,innx,inny);
     }
     public static void showpis()
     {
            Showpair fram=new Showpair();
        fram.setTitle("USER'S GUIDELINE FRONT");
        fram.setSize(1000,650);
        fram.setLocationRelativeTo(null);
        fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fram.setVisible(true);
         
     }
     static class NewPanels extends JPanel{
     int kff;
    static double[] Xf=new double[1000];
    static double[] Yf=new double[1000];
    static double[] Xs=new double[1000];
    static double[] Ys=new double[1000];
    static double insx,insy;
    public void sendat(double []xaa,double []yaa,double []xbb,double []ybb,double ins,double iny){
    Xf=xaa;
    Yf=yaa;
    Xs=xbb;
    Ys=ybb;
    insx=ins;
    insy=iny;
    //

    }

        public NewPanels(){
     
              for(int i=0;i<=200;i++)
         {
            Xf[i]=Xf[i]+500;
            Xs[i]=Xs[i]+500;
            Yf[i]=300-Yf[i];
             Ys[i]=300-Ys[i];
             
         }
           //System.out.println(Xs[90]+"  "+Ys[90]);
        } 
     
     
     @Override
      public void paint (Graphics g) {
       // System.out.println(Xf[90]+" "+Yf[90]);
    Graphics2D g2 = (Graphics2D) g;
    g2.drawLine(500, 0, 500, 600);
    g2.drawLine(0, 300, 1000, 300);
    g2.drawString("(0,0)", 502, 310);
    String msd="intersecting point is(";
    msd=msd+insx;
    msd=msd+",";
    msd=msd+insy;
    msd=msd+")";
    g2.drawString(msd, 15, 15);
    
    g2.setColor(Color.red);
      //g2.draw( new Line2D.Double());
    GeneralPath polygon = 
        new GeneralPath(GeneralPath.WIND_EVEN_ODD,
                        200);
polygon.moveTo(Xf[0], Yf[0]);

for (int index = 1; index <=200; index++) {
        polygon.lineTo(Xf[index], Yf[index]);
};

//polygon.closePath();
g2.draw(polygon);
    GeneralPath polygoni = 
        new GeneralPath(GeneralPath.WIND_EVEN_ODD,
                        200);
polygoni.moveTo(Xs[0], Ys[0]);

for (int index = 1; index <=200; index++) {
        polygoni.lineTo(Xs[index], Ys[index]);
};

//polygon.closePath();
g2.draw(polygoni);
      }
}
}
