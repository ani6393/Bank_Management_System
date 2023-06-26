package bank.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener
{
    String pin;
    TextField textAm;
    JButton b1,b2;
    Deposit(String pin)
    {
        this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
       add(l3);

        JLabel label1=new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT.");
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setForeground(Color.WHITE);
        label1.setBounds(460,180,400,35);
        l3.add(label1);

        textAm=new TextField();
        textAm.setBackground(new Color(65,125,128));
        textAm.setForeground(Color.WHITE);
        textAm.setBounds(460,230,320,25);
        textAm.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(textAm);

        b1=new JButton("DEPOSIT");
        b1.setFont(new Font("Raleway",Font.BOLD,20));
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.setBounds(700,362,135,30);
        b1.addActionListener(this);
        l3.add(b1);

        b2=new JButton("BACK");
        b2.setFont(new Font("Raleway",Font.BOLD,20));
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.setBounds(700,406,135,30);
        b2.addActionListener(this);
        l3.add(b2);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
try {
    String amount=textAm.getText();
    Date date=new Date();
    if(e.getSource()==b1)
    {
        if (textAm.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter the Amount you want to Deposit");
        }
        else {
            Con c1=new Con();
            c1.statement.executeUpdate("insert into bank values ('"+pin+"','"+date+"','Deposit','"+amount+"')");
            JOptionPane.showMessageDialog(null,"Rs."+amount+"Deposited Successfully");
            setVisible(false);
            new Main_Class(pin);
        }
    } else if (e.getSource()==b2)
    {
     setVisible(false);
     new Main_Class(pin);
    }
}
catch (Exception E)
{
    E.printStackTrace();
}
    }
    public static void main(String[] args) {
        new Deposit("");

    }
}
