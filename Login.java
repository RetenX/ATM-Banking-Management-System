import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JLabel label,text,cardno,pin;
    JTextField t1;
    JPasswordField t2;
    JButton login,clear,signup;


    Login(){
        // JFrame fr = new JFrame();

        ImageIcon img = new ImageIcon("bank2.png");
        Image i1=img.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon img1 = new ImageIcon(i1);
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("ATM Bank Management System");
        setBounds(400,100,800,600);

        label = new JLabel(img1);
        label.setBounds(60,20,img1.getIconWidth(),img1.getIconHeight());
        add(label);

        text = new JLabel("Welcome to ATM Bank");
        text.setBounds(190,40,400,80);
        text.setFont(new Font("Comin Sans Ms",Font.BOLD,32));
        add(text);

        cardno = new JLabel("Card Number: ");
        cardno.setBounds(170,160,200,80);
        cardno.setFont(new Font("Osward",Font.BOLD,26));
        add(cardno);
        t1=new JTextField();
        t1.setBounds(380,189,250,26);
        t1.setFont(new Font("Arial",Font.BOLD,15));
        add(t1);

        pin = new JLabel("Enter PIN: ");
        pin.setBounds(170,240,200,80);
        pin.setFont(new Font("Osward",Font.BOLD,26));
        add(pin);
        t2=new JPasswordField();
        t2.setBounds(380,266,250,26);
        t2.setFont(new Font("Arial",Font.BOLD,16));
        add(t2);
        
        //Buttons--------------------------------------------------------------------
        login=new JButton("SIGN IN");
        login.setBounds(280,350,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.CYAN);
        login.addActionListener(this);
        add(login);

        clear=new JButton("CLEAR");
        clear.setBounds(410,350,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.CYAN);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds(284,400,220,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.CYAN);
        signup.addActionListener(this);
        add(signup);
    }
    public static void main(String args[]){
        new Login().setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()==clear){
            t1.setText("");
            t2.setText("");
        }
        else if(ae.getSource()==login){
            conn cn= new conn();
            String cardnumber = t1.getText();
            String pinnumber = t2.getText();
            String query = "select * from login where cardnumber ='"+cardnumber+"' and pin = '"+pinnumber+"'";

            try{
                ResultSet rs = cn.s1.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transaction(pinnumber).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Incorrect Card number or Pin");
                }

            } catch (Exception e){
                System.out.println(e);
            }
        }
        else if(ae.getSource()==signup){
            setVisible(false);
            new Signup().setVisible(true);
        }
        
    }
}
