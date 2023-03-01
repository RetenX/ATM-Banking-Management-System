import javax.swing.*;
// import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class Withdrawal extends JFrame implements ActionListener{
    JLabel im1,entrdep,amnt;
    JTextArea amntrs;
    JButton wyes,wno;
    String pinnumber;

    Withdrawal(String pinnumber){
        this.pinnumber=pinnumber;
        ImageIcon imag = new ImageIcon("atm.jpg");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,40,720,770);
        im1=new JLabel(imag);
        add(im1);

        entrdep = new JLabel("Please enter withdrawal amount:");
        entrdep.setFont(new Font("System",Font.BOLD,13));
        entrdep.setForeground(Color.white);
        entrdep.setBounds(160,300,700,20);
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

        wyes = new JButton("YES");
        wyes.setFont(new Font("Raleway",Font.BOLD,12));
        wyes.setBackground(Color.WHITE);
        wyes.setForeground(Color.BLACK);
        wyes.setBounds(295,420,95,25);
        wyes.addActionListener(this);
        im1.add(wyes);

        wno = new JButton("NO");
        wno.setFont(new Font("Raleway",Font.BOLD,12));
        wno.setBackground(Color.WHITE);
        wno.setForeground(Color.BLACK);
        wno.setBounds(295,452,95,25);
        wno.addActionListener(this);
        im1.add(wno);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==wyes){
            String wnumbr= ""+amntrs.getText();
            Date thisdate = new Date();
            SimpleDateFormat dateForm = new SimpleDateFormat("MM/dd/YY hh:mm a");
            String str = dateForm.format(thisdate);
            try{
                if(wnumbr.equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter a valid amount");
                }
                else{
                    conn c1 = new conn();
                    String query = "insert into bankdata values('"+pinnumber+"','"+str+"','Withdrawal', '"+wnumbr+"')";
                    c1.s1.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Your amount Rs."+wnumbr+" has been debited successfully");
                    setVisible(false);
                    new Transaction(pinnumber).setVisible(true);
                }
            } catch (Exception e){
                System.out.println(e);
            }
        }
        else if(ae.getSource()==wno){
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }
        
    }

    public static void main(String args[]){
        new Withdrawal("").setVisible(true);
    }
}
