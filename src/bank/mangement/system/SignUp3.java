package bank.mangement.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp3 extends JFrame implements ActionListener
{
    JRadioButton r1,r2,r3,r4;
    JTextField card;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s,c;
    String formNo;

    SignUp3(String formNo)
    {
        this.formNo=formNo;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        JLabel l1=new JLabel(":- Page 3 :-");
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Raleway ",Font.BOLD,22));
        l1.setBounds(400,10,600,40);
        add(l1);

        JLabel l2=new JLabel("- Account Details -");
        l2.setFont(new Font("Raleway ",Font.BOLD,22));
        l2.setBounds(360,40,600,40);
        add(l2);

        JLabel l3=new JLabel("Account Types :-");
        l3.setFont(new Font("Raleway ",Font.BOLD,18));
        l3.setBounds(150,140,600,30);
        add(l3);

        r1=new JRadioButton("Saving Account");
        r1.setBackground(new Color(215,252,252));
        r1.setBounds(170,175,150,30);
        r1.setFont(new Font("Raleway",Font.BOLD,15));
        add(r1);

        r2=new JRadioButton("Fixed Deposit");
        r2.setBackground(new Color(215,252,252));
        r2.setBounds(170,205,135,30);
        r2.setFont(new Font("Raleway",Font.BOLD,15));
        add(r2);

        r3=new JRadioButton("Current Account");
        r3.setBackground(new Color(215,252,252));
        r3.setBounds(370,175,150,30);
        r3.setFont(new Font("Raleway",Font.BOLD,15));
        add(r3);

        r4=new JRadioButton("Recurring Deposit Account");
        r4.setBackground(new Color(215,252,252));
        r4.setBounds(370,205,300,30);
        r4.setFont(new Font("Raleway",Font.BOLD,15));
        add(r4);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4=new JLabel("Card Number. ");
        l4.setFont(new Font("Raleway ",Font.BOLD,18));
        l4.setBounds(150,250,200,30);
        add(l4);
        JLabel l5=new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Arial ",Font.BOLD,12));
        l5.setBounds(150,280,200,20);
        add(l5);

        JLabel l6=new JLabel("(XXXX-XXXX-XXXX-4841)");
        l6.setFont(new Font("Raleway ",Font.BOLD,18));
        l6.setBounds(380,250,250,30);
        add(l6);

        JLabel l7=new JLabel("(It would appear on ATM card/Cheque Book and Statements)");
        l7.setFont(new Font("Arial ",Font.BOLD,12));
        l7.setBounds(380,280,600,20);
        add(l7);

        JLabel l8=new JLabel("PIN ");
        l8.setFont(new Font("Raleway ",Font.BOLD,18));
        l8.setBounds(150,320,200,30);
        add(l8);
        JLabel l9=new JLabel("XXXX");
        l9.setFont(new Font("Raleway ",Font.BOLD,18));
        l9.setBounds(380,320,200,30);
        add(l9);
        JLabel l10=new JLabel("(4-digit Password)");
        l10.setFont(new Font("Raleway ",Font.BOLD,12));
        l10.setBounds(150,350,200,20);
        add(l10);

        JLabel l11=new JLabel("Services Required");
        l11.setFont(new Font("Raleway ",Font.BOLD,18));
        l11.setBounds(150,380,200,30);
        add(l11);

        c1=new JCheckBox("ATM CARD");
        c1.setBackground(new Color(215,252,252));
        c1.setFont(new Font("Raleway",Font.BOLD,15));
        c1.setBounds(170,410,135,30);
        add(c1);
        c2=new JCheckBox("EMAIL ALERTS");
        c2.setBackground(new Color(215,252,252));
        c2.setFont(new Font("Raleway",Font.BOLD,15));
        c2.setBounds(170,440,190,30);
        add(c2);

        c3=new JCheckBox("CHEQUE BOOK");
        c3.setBackground(new Color(215,252,252));
        c3.setFont(new Font("Raleway",Font.BOLD,15));
        c3.setBounds(170,470,190,30);
        add(c3);
        c4=new JCheckBox("INTERNET BANKING");
        c4.setBackground(new Color(215,252,252));
        c4.setFont(new Font("Raleway",Font.BOLD,15));
        c4.setBounds(370,410,240,30);
        add(c4);
        c5=new JCheckBox("E-STATEMENTS");
        c5.setBackground(new Color(215,252,252));
        c5.setFont(new Font("Raleway",Font.BOLD,15));
        c5.setBounds(370,440,240,30);
        add(c5);
        c6=new JCheckBox("MOBILE BANKING");
        c6.setBackground(new Color(215,252,252));
        c6.setFont(new Font("Raleway",Font.BOLD,15));
        c6.setBounds(370,470,200,30);
        add(c6);

        JCheckBox c7=new JCheckBox("I have declared that the above entered details correct to the best of my Knowledge. ",true);
        c7.setBackground(new Color(215,252,252));
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(150,530,500,20);
        add(c7);

        JLabel l12=new JLabel("Form No. ");
        l12.setFont(new Font("Raleway ",Font.BOLD,14));
        l12 .setBounds(750,10,200,30);
        add(l12);

        JLabel l13=new JLabel(formNo);
        l13.setFont(new Font("Raleway ",Font.BOLD,14));
        l13 .setBounds(820,10,200,30);
        add(l13);

        s=new JButton("Submit ");
        s.setFont(new Font("Raleway",Font.BOLD,18));
        s.setBounds(250,600,105,30);
        s.setForeground(Color.WHITE);
        s.setBackground(Color.BLACK);
        s.addActionListener(this);
        add(s);

        c=new JButton("Cancel ");
        c.setFont(new Font("Raleway",Font.BOLD,18));
        c.setBounds(450,600,105,30);
        c.setForeground(Color.WHITE);
        c.setBackground(Color.BLACK);
        c.addActionListener(this);
        add(c);

//---------------------------------------------------------------------

        setLayout(null );
        getContentPane().setBackground( new Color(215,252,252));
        setSize(1000,800);
        setLocation(400,20);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String atype="";

        if(r1.isSelected())
        {
            atype="Saving Account";
        } else if (r2.isSelected())
        {
        atype = "Fixed Deposit";
        }
        else if (r3.isSelected())
        {
         atype="Current Account";
        } else if (r4.isSelected())
        {
         atype="Recurring Deposit Account";
        }

        Random random = new Random();
        long firs7=(random.nextLong()% 90000000l)+1409963000000000l;
        String cardNo=""+Math.abs((firs7));

        long first3=(random.nextLong()% 9000L)+1000L;
        String pin=""+Math.abs(first3);

        String serv="";
        if (c1.isSelected()){
            serv=serv+"ATM";
        } else if (c2.isSelected())
        {
         serv=serv+"EMAIL ALERTS";
        } else if (c3.isSelected())
        {
         serv=serv+"CHEQUE BOOK";
        } else if (c4.isSelected())
        {
         serv=serv+"INTERNET BANKING";
        } else if (c5.isSelected())
        {
         serv=serv+"E-STATEMENTS";
        } else if (c6.isSelected())
        {
         serv =serv+"MOBILE BANKING";
        }
try {
if (e.getSource()==s)
{
    if (atype.equals("")){
        JOptionPane.showMessageDialog(null,"Fill the All fields");
    }
    else {
        Con c1=new Con();
        String q1="insert into signUp_three values('"+formNo+"','"+atype+"','"+cardNo+"','"+pin+"','"+serv+"')";
        String q2="insert into login values('"+formNo+"','"+cardNo+"','"+pin+"')";
        c1.statement.executeUpdate(q1);
        c1.statement.executeUpdate(q2);
        JOptionPane.showMessageDialog(null,"Card Number"+cardNo+ "\n Pin :"+pin);
       new Deposit(pin);

        setVisible(false);
    }
} else if (e.getSource()==c)
{
    System.exit(0);
}

}catch (Exception E){
    E.printStackTrace();
}

    }
    public static void main(String[] args) {
     new SignUp3("");
    }
}
