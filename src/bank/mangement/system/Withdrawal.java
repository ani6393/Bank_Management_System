package bank.mangement.system;

import javax.naming.spi.ResolveResult;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawal extends JFrame implements ActionListener
{
    String pin;
    TextField textAm;
    JButton b1,b2;
    public Withdrawal(String pin)
    {
        this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1=new JLabel("MAXIMUM WITHDRAWAL IS RS.10,000");
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setForeground(Color.WHITE);
        label1.setBounds(455,180,600,35);
        l3.add(label1);

        JLabel label2=new JLabel("PLEASE ENTER YOUR AMOUNT.");
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setForeground(Color.WHITE);
        label2.setBounds(470,220,400,35);
        l3.add(label2);

        textAm=new TextField();
        textAm.setBackground(new Color(65,125,128));
        textAm.setForeground(Color.WHITE);
        textAm.setBounds(460,260,320,25);
        textAm.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(textAm);

        b1=new JButton("WITHDRAWAL");
        b1.setFont(new Font("Raleway",Font.BOLD,20));
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.setBounds(670,368,180,30);
       b1.addActionListener(this);
        l3.add(b1);

        b2=new JButton("BACK");
        b2.setFont(new Font("Raleway",Font.BOLD,20));
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.setBounds(670,410,180,30);
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

        if (e.getSource()==b1) {
            try {
                String amount = textAm.getText();
                Date date = new Date();
                if (e.getSource().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount you want to withdrawal");
                } else {
                    Con con = new Con();
                    ResultSet resultSet = con.statement.executeQuery("Select * from bank where pin ='"+pin+"'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "This amount not Sufficient for Your Account");
                        return;
                    }
                    con.statement.executeUpdate("insert into bank values ('" +pin+ "','" + date + "','Withdrawal','"+ amount +"')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                    setVisible(false);
                    new Main_Class(pin);
                }
            } catch (Exception E) {
                E.printStackTrace();
            }
        } else if (e.getSource()==b2)
        {
         setVisible(false);
         new Main_Class(pin);
        }
    }

    public static void main(String[] args) {
        new Withdrawal("");
    }

}
