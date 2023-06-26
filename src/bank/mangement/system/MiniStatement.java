package bank.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class MiniStatement extends JFrame implements ActionListener
{
    String pin;
    JButton b1;
    MiniStatement(String pin)
    {
        this.pin=pin;
     getContentPane().setBackground(new Color(255,204,204));
     setLayout(null);
     setSize(400,600);
     setLocation(20,20);

     JLabel label1=new JLabel();
     label1.setBounds(20,140,400,250);
     add(label1);

     JLabel label2=new JLabel("Ani Coder");
     label2.setFont(new Font("System",Font.BOLD,15));
     label2.setBounds(150,20,200,20);
     add(label2);

     JLabel label3=new JLabel();
     label3.setBounds(20,80,300,20);
     add(label3);

     JLabel label4=new JLabel();
     label4.setBounds(20,400,300,20);
     add(label4);

     try {
         Con con=new Con();
         ResultSet resultSet = con.statement.executeQuery("select * from login where pin ='"+pin+"'");
         while (resultSet.next()){
             label3.setText("Card Number: "+resultSet.getString("card_number").substring(0,4)+"********"+resultSet.getString("card_number").substring(12));
         }
     }catch (Exception e){
         e.printStackTrace();
     }
     try {
         int balance=0;
         Con con=new Con();
         ResultSet resultSet=con.statement.executeQuery("select * from bank where pin ='"+pin+"'");
         while (resultSet.next())
         {
             label1.setText(label1.getText()+"<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+"<br><br><html>");
             if (resultSet.getString("type").equals("Deposit")){
                 balance += Integer.parseInt(resultSet.getString("amount"));
             }
             else
             {
                 balance-= Integer.parseInt(resultSet.getString("amount"));
             }
         }
         label4.setText("Your Total Balance is Rs:"+balance);

     }catch (Exception e){
         e.printStackTrace();
     }
     b1=new JButton("Exit");
     b1.setBounds(20,500,100,25);
     b1.addActionListener(this);
     b1.setBackground(Color.BLACK);
     b1.setForeground(Color.WHITE);
     add(b1);



     setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

        setVisible(false);
//        try {
//
//        }catch (Exception E)
//        {
//            E.printStackTrace();
//        }
    }

    public static void main(String[] args) {
        new MiniStatement("");

    }
}
