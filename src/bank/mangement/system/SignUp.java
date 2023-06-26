package bank.mangement.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener
{

    JTextField textName,textFName,textEName,textMs,textAdd,textCity,textPc,textState;
    JButton button1,button2;
    JRadioButton r1,r2,m1,m2,m3;
    JDateChooser dateChooser;
    Random random=new Random();
    long first4= (random.nextLong() % 9000L) +1000L;
    String first= " "+Math.abs(first4);
    SignUp(){

        super("APPLICATION FORM");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(500,10,100,100);
        add(image);

        JLabel label1=new JLabel("APPLICATION FORM NO." +first);
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("Raleway ",Font.BOLD,38));
        label1.setBounds(650,40,650,40);
        add(label1);

        JLabel label2=new JLabel("Page 1");
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("Raleway ",Font.BOLD,22));
        label2.setBounds(820,90,700,40);
        add(label2);

        JLabel label3=new JLabel("Personal Details");
        label3.setForeground(Color.BLACK);
        label3.setFont(new Font("Raleway ",Font.BOLD,22));
        label3.setBounds(780,115,700,40);
        add(label3);

        JLabel labelName=new JLabel("Name :-");
        labelName.setForeground(Color.BLACK);
        labelName.setFont(new Font("Raleway ",Font.BOLD,15));
        labelName.setBounds(630,215,300,40);
        add(labelName);

        textName =new JTextField();
        textName.setBounds(750,225,350,20);
        textName.setFont(new Font("Arial",Font.BOLD,14));
        add(textName);

        JLabel labelFName=new JLabel("Father Name :-");
        labelFName.setForeground(Color.BLACK);
        labelFName.setFont(new Font("Raleway ",Font.BOLD,15));
        labelFName.setBounds(630,245,300,40);
        add(labelFName);

        textFName =new JTextField();
        textFName.setBounds(750,258,350,20);
        textFName.setFont(new Font("Arial",Font.BOLD,14));
        add(textFName);

        JLabel DOB=new JLabel("Date of birth :-");
        DOB.setForeground(Color.BLACK);
        DOB.setFont(new Font("Raleway ",Font.BOLD,15));
        DOB.setBounds(630,280,300,40);
        add(DOB);


        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(750,295,350,20);
        add(dateChooser);

        JLabel labelG=new JLabel("Gender :-");
        labelG.setForeground(Color.BLACK);
        labelG.setFont(new Font("Raleway ",Font.BOLD,15));
        labelG.setBounds(630,320,300,40);
        add(labelG);

        r1 =new JRadioButton("Male");
        r1.setFont(new Font("Raleway ",Font.BOLD,14));
        r1.setBackground( Color.pink);
        r1.setBounds(750,330,60,25);
        add(r1);

        r2 =new JRadioButton("Female");
        r2.setFont(new Font("Raleway ",Font.BOLD,14));
        r2.setBackground(Color.pink);
        r2.setBounds(885,330,100,25);
        add(r2);
        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelE=new JLabel("Email :-");
        labelE.setForeground(Color.BLACK);
        labelE.setFont(new Font("Raleway ",Font.BOLD,15));
        labelE.setBounds(630,355,300,40);
        add(labelE);

        textEName =new JTextField();
        textEName.setBounds(750,370,350,20);
        textEName.setFont(new Font("Arial",Font.BOLD,14));
        add(textEName);

        JLabel labelMs=new JLabel("Marital Status :-");
        labelMs.setForeground(Color.BLACK);
        labelMs.setFont(new Font("Raleway ",Font.BOLD,15));
        labelMs.setBounds(630,400,300,40);
        add(labelMs);

        m1 =new JRadioButton("Married");
        m1.setFont(new Font("Raleway ",Font.BOLD,14));
        m1.setBackground( Color.pink);
        m1.setBounds(750,405,85,25);
        add(m1);

        m2 =new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway ",Font.BOLD,14));
        m2.setBackground(Color.pink);
        m2.setBounds(885,405,100,25);
        add(m2);

        m3 =new JRadioButton("Other");
        m3.setFont(new Font("Raleway ",Font.BOLD,14));
        m3.setBackground(Color.pink);
        m3.setBounds(1029,405,70,25);
        add(m3);
        ButtonGroup buttonGroup2=new ButtonGroup();
        buttonGroup2.add(m1);
        buttonGroup2.add(m2);
        buttonGroup2.add(m3);

        JLabel labelAdd=new JLabel("Address :-");
        labelAdd.setForeground(Color.BLACK);
        labelAdd.setFont(new Font("Raleway ",Font.BOLD,15));
        labelAdd.setBounds(630,430,300,40);
        add(labelAdd);

        textAdd =new JTextField();
        textAdd.setBounds(750,440,350,20);
        textAdd.setFont(new Font("Arial",Font.BOLD,14));
        add(textAdd);

        JLabel labelCity=new JLabel("City :-");
        labelCity.setForeground(Color.BLACK);
        labelCity.setFont(new Font("Raleway ",Font.BOLD,15));
        labelCity.setBounds(630,455,300,40);
        add(labelCity);

        textCity =new JTextField();
        textCity.setBounds(750,470,350,20);
        textCity.setFont(new Font("Arial",Font.BOLD,14));
        add(textCity);

        JLabel labelPinCode=new JLabel("PinCode :-");
        labelPinCode.setForeground(Color.BLACK);
        labelPinCode.setFont(new Font("Raleway ",Font.BOLD,15));
        labelPinCode.setBounds(630,490,300,40);
        add(labelPinCode);

        textPc =new JTextField();
        textPc.setBounds(750,500,350,20);
        textPc.setFont(new Font("Arial",Font.BOLD,14));
        add(textPc);

        JLabel labelState=new JLabel("State :-");
        labelState.setForeground(Color.BLACK);
        labelState.setFont(new Font("Raleway ",Font.BOLD,15));
        labelState.setBounds(630,520,300,40);
        add(labelState);

        textState =new JTextField();
        textState.setBounds(750,530,350,20);
        textState.setFont(new Font("Arial",Font.BOLD,14));
        add(textState);

        button1=new JButton("Next");
        button1.setFont(new Font("Raleway",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(1000,590,100,30);
        button1.addActionListener(this);
        add(button1);

        button2=new JButton("Back");
        button2.setFont(new Font("Raleway",Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(750,590,100,30);
        button2.addActionListener(this);
        add(button2);





//     this is for background code....Start

//        ImageIcon k1=new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
//        Image k2=k1.getImage().getScaledInstance(1500,1000,Image.SCALE_DEFAULT);
//        ImageIcon k3=new ImageIcon(k2);
//        JLabel iimg=new JLabel(k3);
//        iimg.setBounds(0,0,1500,1000);
//        add(iimg);

//         and end........
           setLayout(null );
          getContentPane().setBackground( Color.pink);
           setSize(1500,1000);
           setLocation(0,0);
           setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
String formNo=first;
String name=textName.getText();
String fname=textFName.getText();
String DOB = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
String gender=null;
if (r1.isSelected()){
    gender="Male";
} else if (r2.isSelected())
{
 gender="Female";
}
        String email=textEName.getText();

        String marital=null;
        if (m1.isSelected()){
            marital="married";
        } else if (m2.isSelected())
        {
            marital="unmarried";
        } else if (m3.isSelected())
        {
        marital="Other";
        }

String Address=textAdd.getText();
String City=textCity.getText();
String PinCode=textPc.getText();
String State=textState.getText();

try {
    if (e.getSource()==button2){
        new Login("");
        setVisible(false);
    } else if (textName.getText().equals("")) {
    JOptionPane.showMessageDialog(null,"pls fill the full form");
}
else{
    Con con1=new Con();
    String q="insert into signUp values('"+formNo+"','"+name+"','"+fname+"','"+DOB+"','"+gender+"','"+email+"','"+marital+"','"+Address+"','"+City+"','"+PinCode+"','"+State+"')";
     con1.statement.executeUpdate(q);
     new SignUp2(formNo);
     setVisible(false);
}
}catch

(Exception E)
{
    E.printStackTrace();
}
    }
    public static void main(String[] args)
    {
           new SignUp();
    }


}
