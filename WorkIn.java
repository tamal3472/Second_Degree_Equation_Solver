/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equasol;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author TAMAL
 */
public class WorkIn extends JFrame {
    JButton done=new JButton("Get result");
   private JTextField ax=new JTextField(10);
   private JTextField hx=new JTextField(10);
   private JTextField bx=new JTextField(10);
   private JTextField gx=new JTextField(10);
   private JTextField fx=new JTextField(10);
   private JTextField cx=new JTextField(10);
   public double a,b,c,g,h,f,area,che;
    public WorkIn()
    {
        JPanel pan=new JPanel();
        pan.setLayout(new GridLayout(6,2,0,10));
        pan.add(new JLabel("Enter a of the following equation a(x*x)+2hxy+b(y*y)+2gx+2fy+c :"));
        pan.add(ax);
        pan.add(new JLabel("Enter h of the following equation a(x*x)+2hxy+b(y*y)+2gx+2fy+c :"));
        pan.add(hx);
        pan.add(new JLabel("Enter b of the following equation a(x*x)+2hxy+b(y*y)+2gx+2fy+c :"));
        pan.add(bx);
        pan.add(new JLabel("Enter g of the following equation a(x*x)+2hxy+b(y*y)+2gx+2fy+c :"));
        pan.add(gx);
        pan.add(new JLabel("Enter f of the following equation a(x*x)+2hxy+b(y*y)+2gx+2fy+c :"));
        pan.add(fx);
        pan.add(new JLabel("Enter c of the following equation a(x*x)+2hxy+b(y*y)+2gx+2fy+c :"));
        pan.add(cx);
        add(pan,BorderLayout.CENTER);
        done.setFont(new Font("Serif",Font.BOLD,25));
        done.setBackground(Color.gray);
        done.setToolTipText("Click here to get result");
        done.setForeground(Color.cyan);
        add(done,BorderLayout.SOUTH);
        done.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                area=(a*b*c)+(2*f*g*h)-(a*f*f)-(b*g*g)-(c*h*h);
                che=(a*b)-(h*h);
                //System.out.println(""+area);
                if(area!=0 && che>0 && h!=0){
                    Ellipse nn=new Ellipse();
                    nn.showEllipse();
                    nn.sentData(a,h,b,g,f,c);
                  
                }
                 if(h==0 && a==b && a!=0 && b!=0){
                    Circle nnn=new Circle();
                    nnn.showCircle();
                    nnn.sentDataaa(a,h,b,g,f,c);
                    
                }
                if(area!=0 && che<0){
                    Hyperbola na=new Hyperbola();
                    na.showHyperbola();
                    na.sentDat(a,h,b,g,f,c);
                    
                }
                if(area!=0 && che==0 ){
                    Parabola nnew=new Parabola();
                    nnew.showParabola();
                    nnew.sentDataa(a,h,b,g,f,c);
                    
                }
                int cgg=0;
               if(a==0 && b==0 && h==0)
               {
                   cgg=1;
                   JOptionPane.showMessageDialog(null,"your equation out of scope of this version","Front",JOptionPane.INFORMATION_MESSAGE);
                   Text dsf= new Text();
                   dsf.showF();
               }
               if(area==0 && cgg!=1){
                    Pair_of_Straightline nnnnp=new Pair_of_Straightline();
                    nnnnp .senData(a,h,b,g,f,c);
                    nnnnp.showPs();
                }
              
               
                
                
            }
        });
   
   ax.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
          String fff=ax.getText();
             int l=fff.length()-1;           
           setmsga(fff);
       }
   });
   hx.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
           setmsgh(hx.getText());
       }
   });
   bx.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
           setmsgb(bx.getText());
       }
   });
   gx.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
           setmsgg(gx.getText());
       }
   });
   fx.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
           setmsgf(fx.getText());
       }
   });
   cx.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
           setmsgc(cx.getText());
       }
   }); 
    }
    public static void showw()
    {
         WorkIn fra=new WorkIn();
        fra.setTitle("Input Front");
        fra.setSize(1000,650);
        fra.setLocationRelativeTo(null);
        fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fra.setVisible(true);     
    }
     public void setmsga(String m){
        a=Double.parseDouble(m);
      // System.out.println(a);
    }
    public void setmsgh(String n){
        h=Double.parseDouble(n);
        h=h/2;
       // System.out.println(h);
    }
    public void setmsgb(String o){
        b=Double.parseDouble(o);
       // System.out.println(b);
    }
    public void setmsgg(String p){
        g=Double.parseDouble(p);
        g=g/2;
      //  System.out.println(g);
    }
    public void setmsgf(String q){
        f=Double.parseDouble(q);
        f=f/2;
        //System.out.println(f);
    }
    public void setmsgc(String r){
        c=Double.parseDouble(r);
        //System.out.print(c);
    }    
}
