package smart.city.guide;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener{
    About(){
        setBounds(600,200,500,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel l1 = new JLabel("About");
        l1.setBounds(220,10,100,40);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l1);
        
        String s = "                                   About Our City Tour Guide System      \n"+
                "  \n"+
                "Welcome to our City Tour Guide System! We're thrilled to introduce you to a comprehensive solution designed to enhance your exploration and enjoyment of our city's treasures.\n" +
                "\n" +
                "Our City Tour Guide System is more than just a digital map; it's your personalized companion for navigating the streets, discovering hidden gems, and immersing yourself in the rich culture and history of our vibrant city."+
                " \n"+"\n"+
                "Project By :- \n"+"\n"+
                "1.Dhawal Thombare 101320 \n"+"2.Manish Wadhwani 101301 \n"+"3.Rameshwar Kumbhar 101302\n"+"4.Kranti Raut 101313 \n";
              
        
        TextArea area = new TextArea(s,10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20,100,450,300);
        add(area);
        
        JButton back = new JButton("Back");
        back.setBounds(200,420,100,25);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    public static void main(String [] args){
        new About();
    }
}
