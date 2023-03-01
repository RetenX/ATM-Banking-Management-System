import javax.swing.*;
// import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.util.*;
import java.util.Date;
import java.sql.*;
import java.text.SimpleDateFormat;


public class Fastcash extends JFrame implements ActionListener{
    
    JLabel im1,tran;
    JButton amnt2h,amnt5h,amnt1k,amnt2k,amnt5k,amnt10k,amnt15k,ext;
    String pinnumber;
    Fastcash(String pinnumber){

        this.pinnumber=pinnumber;
        ImageIcon img = new ImageIcon("atm.jpg");
        setTitle("ATM Machine");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,50,720,770);

        im1 = new JLabel(img);
        add(im1);

        tran = new JLabel("Select your withdrawal amount");
        tran.setFont(new Font("System",Font.BOLD,12));
        tran.setForeground(Color.white);
        tran.setBounds(180,280,600,20);
        im1.add(tran);

        amnt2h = new JButton("Rs. 200");
        amnt2h.setFont(new Font("Raleway",Font.BOLD,12));
        amnt2h.setBackground(Color.WHITE);
        amnt2h.setForeground(Color.BLACK);
        amnt2h.setBounds(130,361,100,26);
        amnt2h.addActionListener(this);
        im1.add(amnt2h);

        amnt5h = new JButton("Rs. 500");
        amnt5h.setFont(new Font("Raleway",Font.BOLD,12));
        amnt5h.setBackground(Color.WHITE);
        amnt5h.setForeground(Color.BLACK);
        amnt5h.setBounds(300,361,100,26);
        amnt5h.addActionListener(this);
        im1.add(amnt5h);

        amnt1k = new JButton("Rs. 1000");
        amnt1k.setFont(new Font("Raleway",Font.BOLD,12));
        amnt1k.setBackground(Color.WHITE);
        amnt1k.setForeground(Color.BLACK);
        amnt1k.setBounds(130,392,100,26);
        amnt1k.addActionListener(this);
        im1.add(amnt1k);

        amnt2k = new JButton("Rs. 2000");
        amnt2k.setFont(new Font("Raleway",Font.BOLD,12));
        amnt2k.setBackground(Color.WHITE);
        amnt2k.setForeground(Color.BLACK);
        amnt2k.setBounds(300,392,100,26);
        amnt2k.addActionListener(this);
        im1.add(amnt2k);

        amnt5k = new JButton("Rs. 5000");
        amnt5k.setFont(new Font("Raleway",Font.BOLD,12));
        amnt5k.setBackground(Color.WHITE);
        amnt5k.setForeground(Color.BLACK);
        amnt5k.setBounds(130,424,100,26);
        amnt5k.addActionListener(this);
        im1.add(amnt5k);

        amnt10k = new JButton("Rs. 10000");
        amnt10k.setFont(new Font("Raleway",Font.BOLD,12));
        amnt10k.setBackground(Color.WHITE);
        amnt10k.setForeground(Color.BLACK);
        amnt10k.setBounds(300,424,100,26);
        amnt10k.addActionListener(this);
        im1.add(amnt10k);

        amnt15k = new JButton("Rs. 15000");
        amnt15k.setFont(new Font("Raleway",Font.BOLD,12));
        amnt15k.setBackground(Color.WHITE);
        amnt15k.setForeground(Color.BLACK);
        amnt15k.setBounds(130,456,100,26);
        amnt15k.addActionListener(this);
        im1.add(amnt15k);

        ext = new JButton("Exit");
        ext.setFont(new Font("Raleway",Font.BOLD,12));
        ext.setBackground(Color.WHITE);
        ext.setForeground(Color.BLACK);
        ext.setBounds(300,456,100,26);
        ext.addActionListener(this);
        im1.add(ext);
    }
  

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==ext){
        setVisible(false);
        new Transaction(pinnumber).setVisible(true);
       }
       else { 
        try{ 
            String samount=((JButton)ae.getSource()).getText().substring(4);
            conn cn = new conn();
            ResultSet rs = cn.s1.executeQuery("select * from bankdata where pin = '"+pinnumber+"'");
            int balance=0;
            while(rs.next()){
                if(rs.getString("type_of_trans").equals("Deposit")){
                    balance+=Integer.parseInt((rs.getString("amount").trim()));
                } else{
                    balance-=Integer.parseInt((rs.getString("amount").trim()));
                }
            }
            if(ae.getSource()!=ext&& balance < Integer.parseInt((samount).trim())){
                JOptionPane.showMessageDialog(null,"Insufficient Balance");
                return;
            }
            else{
                Date thisdate = new Date();
                SimpleDateFormat dateForm = new SimpleDateFormat("MM/dd/YY hh:mm a");
                String str = dateForm.format(thisdate);
                String query = "insert into bankdata values('"+pinnumber+"','"+str+"','Withdrawal','"+samount+"')";
                cn.s1.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Your amount Rs. "+samount+" has been debited successfully");
                setVisible(false);
                new Transaction(pinnumber).setVisible(true);
            }
        } catch (Exception e){
            System.out.println(e);
        }
       }
    }

    public static void main(String args[]){
        new Fastcash("").setVisible(true);
    }
}
