package  bank.mangement.system;

import javax.accessibility.AccessibleRelation;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener
{
    JLabel label1,label2,label3;
    JTextField textField2,textField3;
    String pin;
    JButton button1,button2,button3;
    Login(String pin)
    {
        super("Bank Management System");
        this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(750,10,100,100);
        add(image);

        ImageIcon j1=new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image j2=j1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon j3=new ImageIcon(j2);
        JLabel img=new JLabel(j3);
        img.setBounds(850,650,100,110);
        add(img);

        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGrade",Font.BOLD,38));
        label1.setHorizontalTextPosition(SwingConstants.CENTER);
        label1.setBounds(650,125,450,40);
        add(label1);

        label2 =new JLabel("Card No:");
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(650,300,375,30);
        add(label2);

        textField2=new JTextField(15);
        textField2.setBounds(800,300,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);


        label3 =new JLabel("PIN:");
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(650,350,375,30);
        add(label3);

        textField3= new JPasswordField(15);
        textField3.setBounds(800,350,230,30);
        textField3.setFont(new Font("Arial",Font.BOLD,14));
        add(textField3);

        button1=new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(800,400,100,30);
        button1.addActionListener(this);
        add(button1);

        button2=new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.white);
        button2.setBackground(Color.BLACK);
        button2.setBounds(930,400,100,30);
        button2.addActionListener(this);
        add(button2);

        button3=new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.white);
        button3.setBackground(Color.BLACK);
        button3.setBounds(800,450,230,50);
        button3.addActionListener(this);
        add(button3);

        ImageIcon k1=new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image k2=k1.getImage().getScaledInstance(1500,1000,Image.SCALE_DEFAULT);
        ImageIcon k3=new ImageIcon(k2);
        JLabel iimg=new JLabel(k3);
        iimg.setBounds(0,0,1500,1000);
        add(iimg);

        setLayout(null);
        setSize(1500,1000);
        setLocation(0,0);
        setUndecorated(true);
        setVisible(true );
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
try {
if(e.getSource()==button1)
{
Con con = new Con();
String cardno=textField2.getText();
String pin=textField3.getText();
String q="select * from login where card_number='"+cardno+"'and pin='"+pin+"'";
    ResultSet resultSet=con.statement.executeQuery(q);
    if (resultSet.next()){
        setVisible(false);
        new Main_Class(pin);
    }
    else {
        JOptionPane.showMessageDialog(null,"INCORRECT CARD NUMBER OR PIN");
    }
} else if (e.getSource()==button2)
{
    textField2.setText("");
    textField3.setText("");
    
} else if (e.getSource()==button3)
{
new SignUp();
setVisible(false);
}
}
catch (Exception E){
    E.printStackTrace();
}
    }

    public static void main(String[] args)
    {
        new Login("");
    }
}
