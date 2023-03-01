import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Signup2 extends JFrame implements ActionListener{

    JLabel accdetail,acctyp,card,pin,cardn,pinn,cardet,pindet,srvicer;
    JRadioButton r1,r2,r3,r4,r5,r6;
    JCheckBox c1,c2,c3,c4,c5,c6,dec;
    JButton sub,can;
    String formn;
    
    Signup2(String formn){
        this.formn=formn;
        setTitle("ACCOUNT FORM");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setBounds(400,100,700,720);
        setLayout(null);

        accdetail=new JLabel("STEP 3: Account Details");
        accdetail.setFont(new Font("Raleway",Font.BOLD,20));
        accdetail.setBounds(220,35,250,20);
        add(accdetail);

        acctyp=new JLabel("Account Type");
        acctyp.setFont(new Font("Raleway",Font.BOLD,20));
        acctyp.setBounds(80,110,250,25);
        add(acctyp);

        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.PLAIN,14));
        r1.setBounds(80,150,150,20);
        r1.setBackground(Color.WHITE);
        add(r1);

        r2=new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.PLAIN,14));
        r2.setBounds(320,150,200,20);
        r2.setBackground(Color.WHITE);
        add(r2);

        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.PLAIN,14));
        r3.setBounds(80,190,150,20);
        r3.setBackground(Color.WHITE);
        add(r3);

        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.PLAIN,14));
        r4.setBounds(320,190,200,20);
        r4.setBackground(Color.WHITE);
        add(r4);

        ButtonGroup rgrp = new ButtonGroup();
        rgrp.add(r1);
        rgrp.add(r2);
        rgrp.add(r3);
        rgrp.add(r4);

        card = new JLabel("Card Number: ");
        card.setFont(new Font("Raleway",Font.BOLD,20));
        card.setBounds(80,260,200,20);
        add(card);

        cardet = new JLabel("(Your 16 Digit Card Number)");
        cardet.setFont(new Font("Roboto",Font.BOLD,12));
        cardet.setBounds(82,285,200,15);
        add(cardet);

        cardn=new JLabel("XXXX-XXXX-XXXX-0154");
        cardn.setFont(new Font("Raleway",Font.BOLD,20));
        cardn.setBounds(280,260,400,20);
        add(cardn);

        pin = new JLabel("PIN: ");
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        pin.setBounds(80,320,200,20);
        add(pin);

        pindet = new JLabel("(Your 4 Digit Pin Code)");
        pindet.setFont(new Font("Roboto",Font.BOLD,12));
        pindet.setBounds(82,345,200,15);
        add(pindet);

        pinn=new JLabel("XXXX");
        pinn.setFont(new Font("Raleway",Font.BOLD,20));
        pinn.setBounds(280,320,80,20);
        add(pinn);

        srvicer= new JLabel("Services Required: ");
        srvicer.setFont(new Font("Raleway",Font.BOLD,20));
        srvicer.setBounds(80,400,200,26);
        add(srvicer);

        c1= new JCheckBox("ATM CARD");
        c1.setFont(new Font("Raleway",Font.BOLD,15));
        c1.setBackground(Color.WHITE);
        c1.setBounds(80,450,200,20);
        add(c1);

        c2= new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway",Font.BOLD,15));
        c2.setBackground(Color.WHITE);
        c2.setBounds(320,450,200,20);
        add(c2);

        c3= new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway",Font.BOLD,15));
        c3.setBackground(Color.WHITE);
        c3.setBounds(80,490,200,20);
        add(c3);

        c4= new JCheckBox("E-Mail & SMS Alert");
        c4.setFont(new Font("Raleway",Font.BOLD,15));
        c4.setBackground(Color.WHITE);
        c4.setBounds(320,490,200,20);
        add(c4);

        c5= new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway",Font.BOLD,15));
        c5.setBackground(Color.WHITE);
        c5.setBounds(80,530,200,20);
        add(c5);

        c6= new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway",Font.BOLD,15));
        c6.setBackground(Color.WHITE);
        c6.setBounds(320,530,200,20);
        add(c6);

        dec=new JCheckBox("I hereby declare that the details furnished above are true and correct to the best of my knowledge.");
        dec.setFont(new Font("Raleway",Font.BOLD,12));
        dec.setBackground(Color.WHITE);
        dec.setBounds(80,580,800,20);
        add(dec);

        sub=new JButton("SUBMIT");
        sub.setFont(new Font("Raleway",Font.BOLD,12));
        sub.setBackground(Color.BLACK);
        sub.setForeground(Color.CYAN);
        sub.setBounds(200,630,105,30);
        sub.addActionListener(this);
        add(sub);

        can=new JButton("CANCEL");
        can.setFont(new Font("Raleway",Font.BOLD,12));
        can.setBackground(Color.BLACK);
        can.setForeground(Color.CYAN);
        can.setBounds(330,630,105,30);
        can.addActionListener(this);
        add(can);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
       if(ae.getSource()==sub){
        String sacctyp = "";
        if(r1.isSelected()){
            sacctyp = "Savings Account";
        }
        else if(r2.isSelected()){
            sacctyp = "Fixed Deposit Account";
        }
        else if(r3.isSelected()){
            sacctyp="Current Account";
        }
        else if(r4.isSelected()){
            sacctyp="Recurring Deposit Account";
        }
       Random randm = new Random();
       String scardrndm = ""+Math.abs(randm.nextLong()%900000000L+5426820100000000L);
       String spinrndm = ""+ Math.abs(randm.nextLong()%9000L+1000L);
       String sfacility="";
    //    String decl =null;
       if(c1.isSelected()){
        sfacility=sfacility + "ATM CARD";
       }
       else if(c2.isSelected()){
        sfacility=sfacility + " Internet Banking";
       }
       else if(c3.isSelected()){
        sfacility=sfacility + " Mobile Banking";
       }
       else if(c4.isSelected()){
        sfacility=sfacility + " E-Mail & SMS Alerts";
       }
       else if(c5.isSelected()){
        sfacility=sfacility + " Cheque Book";
       }
       else if(c6.isSelected()){
        sfacility=sfacility + " E-Statement";
       }
    //    else if(dec.isSelected()){
    //     decl= "Confirmed";
    //    }
       try{
        if(sacctyp.equals("")){
            JOptionPane.showMessageDialog(null,"Account Type field is blank");
        }
        else if(sfacility.equals("")){
            JOptionPane.showMessageDialog(null,"Service Required field is blank");
        }
        // else if(decl.equals(null)){
        //     JOptionPane.showMessageDialog(null,"Confirm Declaration field is blank");
        // }
        else{
            conn cn = new conn();
            String Query = "insert into signup2 values('"+formn+"','"+sacctyp+"', '"+scardrndm+"', '"+spinrndm+"','"+sfacility+"')";
            String Query1 = "insert into login values('"+formn+"','"+scardrndm+"', '"+spinrndm+"')";
            cn.s1.executeUpdate(Query);
            cn.s1.executeUpdate(Query1);
            JOptionPane.showMessageDialog(null,"Card Number: "+scardrndm+"\n Pin Code: "+spinrndm+"\nNote: Do not share this information");

            setVisible(false);
            new Login().setVisible(true);
        }
       } catch (Exception e){
        System.out.println(e);
       }
    }
       else if(ae.getSource()==can){
        setVisible(false);
        new Login().setVisible(true);
       }    
    }

    public static void main(String args[]){
        new Signup2("").setVisible(true);
    }

}
