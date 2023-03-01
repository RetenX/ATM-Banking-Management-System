import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class Balancenq extends JFrame implements ActionListener{
    JLabel im1,benq;
    JButton back;
    String pinnumber;

    Balancenq(String pinnumber){
        this.pinnumber=pinnumber;
        ImageIcon imag = new ImageIcon("atm.jpg");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,40,720,770);
        im1=new JLabel(imag);
        add(im1);

        back = new JButton("Back");
        back.setFont(new Font("Raleway",Font.BOLD,14));
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setBounds(302,452,95,25);
        back.addActionListener(this);
        im1.add(back);
        
        int balance=0;
        try{
            conn cn = new conn();
            ResultSet rs = cn.s1.executeQuery("select * from bankdata where pin = '"+pinnumber+"'");
            // balance =0;
            while(rs.next()){
                if(rs.getString("type_of_trans").equals("Deposit")){
                    balance +=Integer.parseInt((rs.getString("amount").trim()));
                } else{
                    balance -=Integer.parseInt((rs.getString("amount").trim()));
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
        benq=new JLabel("Available Balance: Rs. "+balance);
        benq.setFont(new Font("Raleway",Font.BOLD,16));
        // benq.setBackground(Color.WHITE);
        benq.setForeground(Color.white);
        benq.setBounds(150,280,250,50);
        im1.add(benq);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Transaction(pinnumber).setVisible(true);
        
    }

    public static void main(String args[]){
        new Balancenq("").setVisible(true);
    }
}
