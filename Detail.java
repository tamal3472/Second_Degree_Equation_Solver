/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equasol;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author TAMAL
 */
public class Detail extends JFrame {       
    public JLabel imgtitle=new JLabel();
    public JTextArea txta=new JTextArea();
    JButton next=new JButton("NEXT");
    public Detail()
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
                //Working wrk=new Working();
              //  wrk.Workingd();
            }
        });
        
    }
      public void ImageTitle(String title){
        imgtitle.setText(title);
    }
    public void ImageIcon(ImageIcon icon){
        imgtitle.setIcon(icon);
    }
    public void Description(String text){
        txta.setText(text);
    }
    
}
