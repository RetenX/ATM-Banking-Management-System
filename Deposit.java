import javax.swing.*;
// import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Deposit extends JFrame implements ActionListener{
    
    JLabel im1,entrdep,amnt;
    JTextArea amntrs;
    JButton dyes,dno;
    String pinnumber;
    Deposit(String pinnumber){
        this.pinnumber=pinnumber;
        ImageIcon imag = new ImageIcon("atm.jpg");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,40,720,770);
        im1=new JLabel(imag);
        add(im1);

        entrdep = new JLabel("Enter the amount you want to deposit:");
        entrdep.setFont(new Font("System",Font.BOLD,13));
        entrdep.setForeground(Color.white);
        entrdep.setBounds(150,300,700,20);
        im1.add(entrdep);

        amnt = new JLabel("Rs. ");
        amnt.setFont(new Font("System",Font.BOLD,16));
        amnt.setForeground(Color.white);
        amnt.setBounds(190,340,30,20);
        im1.add(amnt);

        amntrs = new JTextArea();
        amntrs.setFont(new Font("System",Font.BOLD,16));
        amntrs.setBackground(Color.black);
        amntrs.setForeground(Color.white);
        amntrs.setBounds(220,340,70,20);
        im1.add(amntrs);

        dyes = new JButton("YES");
        dyes.setFont(new Font("Raleway",Font.BOLD,12));
        dyes.setBackground(Color.WHITE);
        dyes.setForeground(Color.BLACK);
        dyes.setBounds(295,420,100,25);
        dyes.addActionListener(this);
        im1.add(dyes);

        dno = new JButton("NO");
        dno.setFont(new Font("Raleway",Font.BOLD,12));
        dno.setBackground(Color.WHITE);
        dno.setForeground(Color.BLACK);
        dno.setBounds(295,452,100,25);
        dno.addActionListener(this);
        im1.add(dno);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==dyes){
            String dnumbr= ""+amntrs.getText();
            Date thisdate = new Date();
            SimpleDateFormat dateForm = new SimpleDateFormat("MM/dd/YY hh:mm a");
            String str = dateForm.format(thisdate);
            try{
                if(dnumbr.equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter a valid amount");
                }
                else{
                    conn c1 = new conn();
                    String query = "insert into bankdata values('"+pinnumber+"','"+str+"','Deposit', '"+dnumbr+"')";
                    c1.s1.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Your amount Rs."+dnumbr+" has been successfully deposited");
                    setVisible(false);
                    new Transaction(pinnumber).setVisible(true);
                }
            } catch (Exception e){
                System.out.println(e);
            }
        }
        else if(ae.getSource()==dno){
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }
        
    }

    public static void main(String args[]){
        new Deposit("").setVisible(true);
    
    }
}
