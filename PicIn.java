/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equasol;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.util.Collections;
/**
 *
 * @author TAMAL
 */
public class PicIn extends JFrame {
   static int n;
   static int[] X=new int[100000];
   static int[] Y=new int[100000];
   static int checkratio,ratiohorizontal,ratiovertical;
   static double m11,m12,m13,m21,m22,m23,m31,m32,m33,mainres,resa0,resa1,resa2,d1,d2,d3,a,b,c;
   static long sumx,sumy,sumxx,sumxy,sumxxx,sumxxxx,sumxxy;
  static int xright=0,xmiddle,yup=0,ydown=10000,yright,ymiddle,flag=0,xleft=10000,xxfmiddle,xxlfmiddle,yyfup,yyfdown,yylup,yyldown;
    public PicIn()
    {
        
    }
    public void shPin(int[] Xi,int[] Yi,int nd)
    {
        n=nd;
        X=Xi;
        Y=Yi;
    }
    public static void shwf()
    {
       System.out.println(X[n-1]+" X "+ X[0]);
       System.out.println(Y[n-1]+" Y "+ Y[0]);
       
        if((X[n-1]-X[0])>=-20 && (X[n-1]-X[0])<=20 )
                { 
                if((Y[n-1]-Y[0])>=-20 && (Y[n-1]-Y[0])<=20)
                   {
                       flag=1;
//System.out.println(X[n-1]+" X "+ X[0]);
                    for(int f=1;f<n;f++)
                    {
                          if(Y[f]>yup)
                         {
                           yup=Y[f]; 
                         }
                          if(Y[f]<ydown)
                          {
                             ydown=Y[f];
                          }
                          if(X[f]>xright)
                          {
                              xright=X[f];
                          }
                          if(X[f]<xleft)
                          {
                              xleft=X[f];
                          }
                    
                    }
                }}
        if(flag==1){
        xmiddle=(int)(xright-xleft)/2;
        xmiddle=xmiddle+X[0];
       System.out.println("tam:"+yup);System.out.println("tam:"+ydown);
        System.out.println("tam:"+xright);
        
        System.out.println("tam:"+xleft);
        int max=0,min=10000;
        for(int f=0;f<n;f++)
        {
            if(xmiddle==X[f])
            {         
                if(min>Y[f])
                {
                    min=Y[f];
                }   
            }
        }
        for(int f=0;f<n;f++)
        {
            if(xmiddle==X[f])
            {         
                if(max<Y[f])
                {
                    max=Y[f];
                }   
            }
        }
        xmiddle=xright;
        ratiovertical=yup-ydown;
        ratiohorizontal=xright-xleft;
        int flagchecker=0,checkcir=0;
        if(((ratiovertical-ratiohorizontal)>=-10 && (ratiovertical-ratiohorizontal)<=10) && ydown!=10000 )
        {System.out.println("hocche1");
             String output="Your drawn shape is more like equation of a circle.\n\n "
                     + " Where radius is "+ratiovertical+".\n Area of your drawn shape is "+(3.1416*ratiovertical*ratiovertical)+
                     "(approx.)";
               JScrollPane jsp=new JScrollPane(new JTextArea(output));
               jsp.setPreferredSize(new java.awt.Dimension (904,555));
               JOptionPane.showMessageDialog(null,jsp,"Name",JOptionPane.INFORMATION_MESSAGE,null);
           flagchecker=1;
            checkcir=1;
           Text teew=new Text();
                teew.showF();
        }
        if(((ratiohorizontal-ratiovertical)>=-10 && (ratiohorizontal-ratiovertical)<=10)&& ydown!=10000 && checkcir!=1)
        {
            //System.out.println("hocche");
         String output="Your drawn shape is more like equation of a circle.\n\n "
                     + " Where radius is "+ratiovertical+".\n Area of your drawn shape is "+(3.1416*ratiovertical*ratiovertical)+
                     "(approx.)";
               JScrollPane jsp=new JScrollPane(new JTextArea(output));
               jsp.setPreferredSize(new java.awt.Dimension (904,555));
               JOptionPane.showMessageDialog(null,jsp,"Name",JOptionPane.INFORMATION_MESSAGE,null);
            flagchecker=1;
            Text teew=new Text();
              teew.showF();
        }
          if((ratiovertical>ratiohorizontal) && flagchecker!=1)
            {
                String output="Your drawn shape is more like equation of a ellipse.\n\n "
                     + "Where b>a,\n a is"+(ratiovertical/2)+",b is "+(ratiohorizontal/2)
                         + ".\n\n"+"Length of major axis is "+ratiovertical+". \nlength of minor axis is "+ratiohorizontal+". \n"
                         + "\n"
                         + "Area of your drawn shape is "+(3.1416*(ratiovertical/2)*(ratiohorizontal/2))+"(approx.)";
               JScrollPane jsp=new JScrollPane(new JTextArea(output));
               jsp.setPreferredSize(new java.awt.Dimension (904,555));
               JOptionPane.showMessageDialog(null,jsp,"Name",JOptionPane.INFORMATION_MESSAGE,null);
               
               // System.out.println("b>A");
            
            }
            if(ratiovertical<ratiohorizontal)
            { 
                 String output="Your drawn shape is more like equation of a ellipse.\n\n "
                     + "Where a>b,\n a is"+(ratiohorizontal/2)+",b is "+(ratiovertical/2)
                         + ".\n\n"+"Length of major axis is "+ratiohorizontal+". \nlength of minor axis is "+ratiovertical+". \n"
                         + "\n"
                         + "Area is "+(3.1416*(ratiovertical/2)*(ratiohorizontal/2))+"(approx.)";
               JScrollPane jsp=new JScrollPane(new JTextArea(output));
               jsp.setPreferredSize(new java.awt.Dimension (904,555));
               JOptionPane.showMessageDialog(null,jsp,"Name",JOptionPane.INFORMATION_MESSAGE,null);
               // System.out.println("a>b");
             
            }
            flag=0;
        }
        
        //System.out.println(min);
        //System.out.println(max);
        
    
        
        else{
              sumx=sumxx=sumy=sumxxx=sumxxxx=sumxy=sumxxy=0;
              int cou=0;
            for(int i=0;i<n;i=i+5)
            {cou++;
              long Xi,Yi;
              Xi=X[i]-470; 
            // System.out.println(Xi);
              Yi=300-Y[i];              
           //   System.out.println(Yi);

                sumx=sumx+Xi;
                         //    System.out.println(sumx);

                sumxx=sumxx+(Xi*Xi); 
                             // System.out.println(sumxx);

                sumxxx=sumxxx+(Xi*Xi*Xi);
               // System.out.println(sumxxx);
                sumxxxx=sumxxxx+(Xi*Xi*Xi*Xi);
                            //  System.out.println(sumxxxx);

                sumy=sumy+Yi;
                sumxy=sumxy+(Xi*Yi);
                sumxxy=sumxxy+((Xi*Xi)*Yi);
                              //System.out.println(sumxxy);

               
            
        }   
            m11=1.00;
            m12=(double)sumx/(double)cou;
            m13=(double)sumxx/(double)cou;
            d1=(double)sumy/(double)cou;
            
            m21=(double)sumx/(double)sumx;
            m22=(double)sumxx/(double)sumx;
            m23=(double)sumxxx/(double)sumx;
            d2=(double)sumxy/(double)sumx;
            
            m31=(double)sumxx/(double)sumxx;
            m32=(double)sumxxx/(double)sumxx;
            m33=(double)sumxxxx/(double)sumxx;
            d3=(double)sumxxy/(double)sumxx;
            
            mainres=((m11*((m22*m33)-(m32*m23))) - (m12*((m21*m33)-(m31*m23)))) + (m13*((m21*m32)-(m31*m22)));
            resa0=((d1*((m22*m33)-(m32*m23))) - (m12*((d2*m33)-(d3*m23)))) + (m13*((d2*m32)-(d3*m22)));
            resa1=((m11*((d2*m33)-(d3*m23))) - (d1*((m21*m33)-(m31*m23)))) + (m13*((m21*d3)-(m31*d2)));
            resa2=((m11*((m22*d3)-(m32*d2))) - (m12*((m21*d3)-(m31*d2)))) + (d1*((m21*m32)-(m31*m22)));
            System.out.println(resa2/mainres);
            a=resa2/mainres;
            b=resa1/mainres;
            c=resa0/mainres;
              String output="Your drawn curve can be fitted with the equation of a second degree polynomial(appoximately) .\n\n "
                     + " Y=a(X*X)+bX+c\n\n"
                      +"where a="+a+", b="+b+", c="+c;
               JScrollPane jsp=new JScrollPane(new JTextArea(output));
               jsp.setPreferredSize(new java.awt.Dimension (904,555));
               JOptionPane.showMessageDialog(null,jsp,"Name",JOptionPane.INFORMATION_MESSAGE,null);
            
        }
    }
}
