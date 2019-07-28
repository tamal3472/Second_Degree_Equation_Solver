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
public class EquaSol extends JFrame {
       JButton enter=new JButton("ENTER");
    JButton about=new JButton("About");
    Font fonten=new Font("Serif",Font.BOLD,25);
    Font fontmsg=new Font("Monospaced",Font.BOLD,50);
    public EquaSol()
    {
          enter.setFont(fonten);
        enter.setBackground(Color.BLUE);
        enter.setForeground(Color.green);
        enter.setToolTipText("Click here to enter the Application");
        about.setFont(fonten);
        about.setBackground(Color.yellow);
        about.setForeground(Color.blue);
        about.setToolTipText("Click here to know about this Application");
        JPanel panel=new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(about);
        panel.add(enter);
       /// add(panel);
        
        MovingMessagePanel mmp=new MovingMessagePanel("Welcome To EquaSol");
        mmp.setFont(fontmsg);
        mmp.setBackground(Color.cyan);
        mmp.setForeground(Color.GRAY);
        setLayout(new BorderLayout(10,10));
        add(mmp,BorderLayout.CENTER);
        add(panel,BorderLayout.SOUTH);
        enter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Text ta=new Text();
                ta.showF();
                
            }
            
        });
        about.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"If you are seeking working method of this application,you should click ENTER button"
                        + " & check out user manual\n\n\n"
                        + "Manufactured by Tamal Chakroborty","About Front",JOptionPane.INFORMATION_MESSAGE);
                
            }
            
        });
        
        //add(enter);
    }
   
        
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EquaSol frame=new EquaSol();
        frame.setTitle("WELCOME FRONT");
        frame.setSize(1000,650);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        // TODO code application logic here
    }
     static class MovingMessagePanel extends JPanel{
        private String message;//="WELCOME TO MY APP";
        private int x=0;
        private int y=250;
        public MovingMessagePanel(String s){
            message=s;
            Timer timer=new Timer(50,new TimerListener());
            timer.start();
            
                    
        }
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            if(x>getWidth()){
                x=-20;
            }
            x+=4;
            g.drawString(message, x, y);
        }
        class TimerListener implements ActionListener{
            public void actionPerformed(ActionEvent e){
                repaint();
            }
        }   
    }
}
