/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equasol;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author TAMAL
 */
public class Text extends JFrame {
  private String[] imgt={"Shape","Equation"};
  private ImageIcon[] imageI={new ImageIcon("C:\\Users\\Tamal\\Downloads\\shape.png"),new ImageIcon("C:\\Users\\Tamal\\Downloads\\equation.jpg")
                               };
  private String[] imagedes=new String[2];
  private DescriptionPanel description=new DescriptionPanel();
  private JComboBox jcombo=new JComboBox(imgt);
  public int fd;
    public Text()
    {
       imagedes[1]="This is for equation of second degree(conic section)."
               + "\nYou can have the solve of the eqations of pair of starightline,circle,ellipse,parabola & hyperbola."
               + "This application can give you both solution of different elements of an equation & shape(except parabola & hyperbola)."
               + ""
               + "\n\n click the Next button given below";
       imagedes[0]="This is for shape of second degree equations( curve & conic section)."
               + "\n You can draw any shape of second degree equation & you can solve out your drawn shape with the solution of different"
               + "elements of your drawn shape.\n\n"
               + "Attention:To have the accurate answer after drawing one or two shape please do restart the application."
               + "\n\n click the Next button given below";
       setDisplay(0);
       add(jcombo,BorderLayout.NORTH);
       add(description,BorderLayout.CENTER);
       jcombo.addItemListener(new ItemListener(){
           public void itemStateChanged(ItemEvent e){
               
               fd=jcombo.getSelectedIndex();
               setDisplay(jcombo.getSelectedIndex());
               
           }
       });
        
       // setLayout(new BorderLayout());
       
        
    }
    public static void  showF() {
       Text fram=new Text();
       fram.pack();
        fram.setTitle("USER'S GUIDELINE FRONT");
        fram.setSize(1000,650);
        fram.setLocationRelativeTo(null);
        fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fram.setVisible(true);
        
    }  

 public void setDisplay(int index)
 {
     description.getd(fd);
     description.setTitle(imgt[index]);
     description.setImageIcon(imageI[index]);
     description.setDescription(imagedes[index]);
 }
    
}
