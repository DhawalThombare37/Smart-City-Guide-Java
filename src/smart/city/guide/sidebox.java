package smart.city.guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class sidebox extends JFrame implements ActionListener {
    
    JButton logoutButton;
    JComboBox comboid;

    public sidebox() {
        setBounds(1330, 50, 200, 400);
        JPanel panel = createPanel();
        add(panel);
        setVisible(true);
    }

    public JPanel createPanel() {
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(50, 5, 300, 30);
        p2.setBackground(Color.white);

        JLabel l1 = new JLabel("Customer helpline");
        l1.setBounds(0, 5, 300, 30);
        l1.setForeground(Color.red);
        l1.setFont(new Font("Tahoma", Font.BOLD, 20));
        p2.add(l1);

        JLabel l2 = new JLabel("70202xxxxx");
        l2.setBounds(30, 80, 300, 30);
        l2.setForeground(Color.red);
        l2.setFont(new Font("Tahoma", Font.BOLD, 20));
        p2.add(l2);

        JLabel l3 = new JLabel("Rate Us");
        l3.setBounds(40, 120, 300, 30);
        l3.setForeground(Color.red);
        l3.setFont(new Font("Tahoma", Font.BOLD, 20));
        p2.add(l3);
        
        comboid = new JComboBox(new String[]{"             **", "           ***", "             ****", "            *****"});
        comboid.setBounds(35, 150, 100, 25);
        comboid.setBackground(Color.white);
        add(comboid);

       

        logoutButton = new JButton("Logout");
        logoutButton.setForeground(Color.black);
        logoutButton.setBounds(45, 260, 100, 25);
        logoutButton.addActionListener(this);
        p2.add(logoutButton);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/tele1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 15, 200, 100);
        p2.add(image);
        
         ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/log1.jpg"));
        Image i5 = i4.getImage().getScaledInstance(200, 120, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image2 = new JLabel(i6);
        image2.setBounds(-10, 180, 200, 100);
        p2.add(image2);

        return p2;
    }

    public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == logoutButton) {
        JOptionPane.showMessageDialog(null, "Logout successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        dispose(); 
        new Login();
    }
}

    public static void main(String[] args) {
        new sidebox();
    }
}
