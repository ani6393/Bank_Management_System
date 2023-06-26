package bank.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener
{
  String pin;
    JLabel label2;
    TextField textAm;
    JButton b1,b2;
    public BalanceEnquiry(String pin)
    {
        this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1=new JLabel("Your current balance is Rs. ");
        label1.setFont(new Font("System",Font.BOLD,23));
        label1.setForeground(Color.WHITE);
        label1.setBounds(430,250,600,35);
        l3.add(label1);

        label2=new JLabel(pin);
        label2.setFont(new Font("System",Font.BOLD,23));
        label2.setForeground(Color.WHITE);
        label2.setBounds(740,250,300,35);
        l3.add(label2);

//        textAm=new TextField();
//        textAm.setBackground(new Color(65,125,128));
//        textAm.setForeground(Color.WHITE);
//        textAm.setBounds(460,260,320,25);
//        textAm.setFont(new Font("Raleway",Font.BOLD,22));
//        l3.add(textAm);

        b2=new JButton("BACK");
        b2.setFont(new Font("Raleway",Font.BOLD,20));
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.setBounds(670,410,180,30);
        b2.addActionListener(this);
        l3.add(b2);

        int balance =0;

        try {
            Con con = new Con();
            ResultSet resultSet=con.statement.executeQuery("select * from bank where pin='"+pin+"'");
            while (resultSet.next())
            {
                if(resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else
                {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        } catch (Exception E)
        {
            E.printStackTrace();
        }

        label2.setText(""+balance);



        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        setVisible(false);
        new Main_Class(pin);
    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }

}
