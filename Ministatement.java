import javax.swing.*;
import java.awt.*;
// import java.awt.event.*;
import java.sql.*;
// import java.util.*;
// import java.util.Date;


public class Ministatement extends JFrame{

    JLabel text,minitxt,card,mini,im,tble,currb,line;
    String pinnumber;
    Ministatement(String pinnumber){
        this.pinnumber=pinnumber;
        ImageIcon img = new ImageIcon("Indian_bank.png");
        // Image i1=img.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        // ImageIcon img1 = new ImageIcon(i1);
        
        im = new JLabel(img);
        im.setBounds(8,40,img.getIconWidth(),img.getIconHeight());
        add(im);

        setLayout(null);
        setTitle("Mini Statement");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        // setUndecorated(true);
        setBounds(300,70,450,700);

        text=new JLabel("Indian Natioanl Bank Ltd.");
        text.setFont(new Font("Raleway",Font.BOLD,20));
        text.setForeground(Color.BLUE);
        text.setBounds(100,70,300,20);
        add(text);

        line=new JLabel("-------------------------------------------------------");
        line.setFont(new Font("Raleway",Font.PLAIN,20));
        line.setForeground(Color.BLACK);
        line.setBounds(40,120,400,20);
        add(line);

        minitxt=new JLabel("----Mini Statement----");
        minitxt.setFont(new Font("Raleway",Font.PLAIN,14));
        minitxt.setForeground(Color.BLACK);
        minitxt.setBounds(140,140,400,20);
        add(minitxt);

        card=new JLabel();
        card.setFont(new Font("Raleway",Font.PLAIN,15));
        // card.setForeground(Color.BLACK);
        card.setBounds(52,170,300,20);
        add(card);

        tble=new JLabel("           Time                "+"    Transanctions amount");
        tble.setFont(new Font("Raleway",Font.PLAIN,14));
        tble.setForeground(Color.BLUE);
        tble.setBounds(52,200,400,20);
        add(tble);

        mini=new JLabel();
        mini.setFont(new Font("Raleway",Font.PLAIN,14));
        mini.setBounds(52,250,400,300);
        add(mini);

        currb=new JLabel();
        currb.setFont(new Font("Raleway",Font.PLAIN,15));
        currb.setBounds(52,550,250,20);
        add(currb);

        try{
            conn cn = new conn();
            ResultSet rs = cn.s1.executeQuery("select * from login where pin = '"+pinnumber+"'");
            while(rs.next()){
                card.setText("Card Number: XXXXXXXXXXXX"+ rs.getString("cardnumber").substring(12,16));
            }
        }catch (Exception e){
            System.out.println(e);
        }
        try{
            conn cn1 = new conn();
            int balance=0;
            ResultSet rs1 = cn1.s1.executeQuery("select * from bankdata where pin = '"+pinnumber+"'");
            while(rs1.next()){
                mini.setText(mini.getText() + "<html>"+ rs1.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs1.getString("type_of_trans")+"&nbsp; : &nbsp;"+rs1.getString("amount")+"<br>");
                if(rs1.getString("type_of_trans").equals("Deposit")){
                    balance +=Integer.parseInt((rs1.getString("amount").trim()));
                } else{
                    balance -=Integer.parseInt((rs1.getString("amount").trim()));
                }
                currb.setText("Current Availalbe Bal. Rs."+balance);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        
    }
    
    public static void main(String args[]){
        new Ministatement("").setVisible(true);
    }
}
