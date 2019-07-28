/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equasol;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author TAMAL
 */
public class DescriptionPanel extends JPanel {
    private JLabel imgtitle=new JLabel();
    private JTextArea txta=new JTextArea();
    JButton next=new JButton("NEXT");
    public int erf;
    public DescriptionPanel()
    {
        imgtitle.setHorizontalAlignment(JLabel.CENTER);
        imgtitle.setHorizontalAlignment(JLabel.CENTER);
        imgtitle.setVerticalTextPosition(JLabel.BOTTOM);
        imgtitle.setFont(new Font("Sanserif",Font.ITALIC,30));
        txta.setFont(new Font("Serif",Font.PLAIN,14));
        
        txta.setLineWrap(true);
        txta.setWrapStyleWord(true);
        txta.setEditable(false);
        
        next.setFont(new Font("Serif",Font.BOLD,25));
        next.setBackground(Color.GREEN);
        next.setForeground(Color.BLUE);
        
        JScrollPane scrollpane=new JScrollPane(txta);
        
        setLayout(new BorderLayout(5,5));
        add(scrollpane,BorderLayout.CENTER);
        add(imgtitle,BorderLayout.WEST);
        add(next,BorderLayout.SOUTH);
        next.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(erf==0){
                  Drawsh df=new Drawsh();
                  df.showsh();
                }
                if(erf==1)
                {
                      WorkIn ter=new WorkIn();
                    ter.showw();
                }
              
            }
        });
        
    }
    public void getd(int sd){
        erf=sd;
    }
     public void setTitle(String title){
        imgtitle.setText(title);
    }
    public void setImageIcon(ImageIcon icon){
        imgtitle.setIcon(icon);
    }
    public void setDescription(String text){
        txta.setText(text);
    }
    
}
