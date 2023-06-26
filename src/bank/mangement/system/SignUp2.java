package bank.mangement.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp2 extends JFrame implements ActionListener
{
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textFieldP,textAdh;
    JRadioButton r1,r2,a1,a2;
    JButton button1,button2;
    String formNo;
    SignUp2(String formNo)
    {
        super("APPLICATION FORM");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);
        this.formNo=formNo;

        JLabel l1=new JLabel(":- Page 2 :-");
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Raleway ",Font.BOLD,22));
        l1.setBounds(400,10,600,40);
        add(l1);

        JLabel l2=new JLabel("- Additional Details -");
        l2.setFont(new Font("Raleway ",Font.BOLD,22));
        l2.setBounds(350,60,600,40);
        add(l2);

        JLabel l3=new JLabel("Religion :-");
        l3.setFont(new Font("Raleway ",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);
        String religion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        comboBox=new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway ",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);


        JLabel l4=new JLabel("Category :-");
        l4.setFont(new Font("Raleway ",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);
        String category[]={"General","OBC","SC","ST","Other"};
        comboBox2=new JComboBox(category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleway ",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5=new JLabel("Income :-");
        l5.setFont(new Font("Raleway ",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);
        String income[]={"Null","<1,00,000","<5,00,000","<8,00,000","up to 10,00,000","above 12,00,000"};
        comboBox3=new JComboBox(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway ",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6=new JLabel("Education :-");
        l6.setFont(new Font("Raleway ",Font.BOLD,18));
        l6.setBounds(100,270,130,30);
        add(l6);
        String education[]={"Non-Educate","High School","InterMediate","Graduation","Post Graduation","PHD","Other"};
        comboBox4=new JComboBox(education);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Raleway ",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);


        JLabel l7=new JLabel("Profession :-");
        l7.setFont(new Font("Raleway ",Font.BOLD,18));
        l7.setBounds(100,320,130,30);
        add(l7);
        String profession[]={"Salaried","Self-Employees","Business","Student","Retired","Other"};
        comboBox5=new JComboBox(profession);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Raleway ",Font.BOLD,14));
        comboBox5.setBounds(350,320,320,30);
        add(comboBox5);

        JLabel l8=new JLabel("Pan Number :-");
        l8.setFont(new Font("Raleway ",Font.BOLD,18));
        l8.setBounds(100,360,250,30);
        add(l8);
        textFieldP=new JTextField();
        textFieldP.setBounds(350,360,320,20);
        textFieldP.setFont(new Font("Raleway",Font.BOLD,14));
        add(textFieldP);

        JLabel l9=new JLabel("Aadhaar Number :-");
        l9.setFont(new Font("Raleway ",Font.BOLD,18));
        l9.setBounds(100,390,250,30);
        add(l9);
        textAdh=new JTextField();
        textAdh.setBounds(350,390,320,20);
        textAdh.setFont(new Font("Raleway",Font.BOLD,14));
        add(textAdh);

        JLabel l10=new JLabel("Senior Citizen :-");
        l10.setFont(new Font("Raleway ",Font.BOLD,18));
        l10.setBounds(100,420,250,30);
        add(l10);

        r1=new JRadioButton("Yes");
        r1.setFont(new Font("Raleway ",Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,420,100,30);
        add(r1);

        r2=new JRadioButton("NO");
        r2.setFont(new Font("Raleway ",Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(500,420,100,30);
        add(r2);
        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel l11=new JLabel("Existing Account :-");
        l11.setFont(new Font("Raleway ",Font.BOLD,18));
        l11.setBounds(100,450,250,30);
        add(l11);

        a1=new JRadioButton("Yes");
        a1.setFont(new Font("Raleway ",Font.BOLD,14));
        a1.setBackground(new Color(252,208,76));
        a1.setBounds(350,450,100,30);
        add(a1);

        a2=new JRadioButton("NO");
        a2.setFont(new Font("Raleway ",Font.BOLD,14));
        a2.setBackground(new Color(252,208,76));
        a2.setBounds(500,450,100,30);
        add(a2);
        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(a1);
        buttonGroup1.add(a2);

        JLabel l12=new JLabel("Form No : ");
        l12.setFont(new Font("Raleway ",Font.BOLD,14));
        l12.setBounds(630,10,90,30);
        add(l12);

        JLabel l13=new JLabel(formNo);
        l13.setFont(new Font("Raleway ",Font.BOLD,14));
        l13.setBounds(700,10,60,30);
        add(l13);

        button1=new JButton("Next");
        button1.setFont(new Font("Raleway",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(425,500,100,30);
        button1.addActionListener(this);
        add(button1);

        button2=new JButton("Back");
        button2.setFont(new Font("Raleway",Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(390,500,100,30);
        button2.addActionListener(this);
        add(button2);
//-----------------------------------------------------------------------------
        setLayout(null );
        getContentPane().setBackground( new Color(252,208,76));
        setSize(850,750);
        setLocation(450,80);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

        String rel=(String) comboBox.getSelectedItem();
        String cate=(String) comboBox2.getSelectedItem();
        String inc=(String) comboBox3.getSelectedItem();
        String edu=(String) comboBox4.getSelectedItem();
        String prof=(String) comboBox5.getSelectedItem();

        String pan=textFieldP.getText();
        String adh=textAdh.getText();

        String sCitizen="";
        if (r1.isSelected())
        {
            sCitizen="Yes";
        } else if (r2.isSelected())
        {
 sCitizen="No";
        }

        String sAccount="";
        if (a1.isSelected())
        {
            sAccount="Yes";
        } else if (a2.isSelected())
        {
            sAccount="No";
        }

        try{

            if (e.getSource()==button2){
                new SignUp();
                setVisible(false);
            } else if (textFieldP.getText().equals("")|| textAdh.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                Con c1=new Con();
                String q="insert into signUp_two values('"+formNo+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+prof+"','"+pan+"','"+adh+"','"+sCitizen+"','"+sAccount+"')";
           c1.statement.executeUpdate(q);
           new SignUp3(formNo);
           setVisible(false);
            }


        }catch (Exception E)
        {
           E.printStackTrace();
        }

    }
    public static void main(String[] args)
    {
new SignUp2("");
    }


}
