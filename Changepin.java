import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// import java.util.*;

public class Changepin extends JFrame implements ActionListener{
    JLabel im1,chngpin,epintxt,reepintxt;
    JPasswordField epin,repin;
    JButton pyes,pno;
    String pinnumber;

    Changepin(String pinnumber){
        this.pinnumber=pinnumber;
        ImageIcon imag = new ImageIcon("atm.jpg");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,40,720,770);
        im1=new JLabel(imag);
        add(im1);

        chngpin = new JLabel("CHANGE YOUR PIN");
        chngpin.setFont(new Font("System",Font.BOLD,13));
        chngpin.setForeground(Color.white);
        chngpin.setBounds(195,260,150,20);
        im1.add(chngpin);

        epintxt = new JLabel("ENTER NEW PIN:");
        epintxt.setFont(new Font("System",Font.BOLD,13));
        epintxt.setForeground(Color.white);
        epintxt.setBounds(203,295,150,20);
        im1.add(epintxt);

        epin = new JPasswordField();
        epin.setFont(new Font("Raleway",Font.BOLD,13));
        epin.setHorizontalAlignment(JPasswordField.CENTER);
        epin.setBounds(215,325,80,20);
        im1.add(epin);

        reepintxt = new JLabel("RE-ENTER NEW PIN:");
        reepintxt.setFont(new Font("System",Font.BOLD,13));
        reepintxt.setForeground(Color.white);
        reepintxt.setBounds(192,365,150,20);
        im1.add(reepintxt);

        repin = new JPasswordField(4);
        repin.setFont(new Font("Raleway",Font.BOLD,13));
        repin.setHorizontalAlignment(JPasswordField.CENTER);
        repin.setBounds(215,395,80,20);
        im1.add(repin);

        pyes = new JButton("YES");
        pyes.setFont(new Font("Raleway",Font.BOLD,12));
        pyes.setBackground(Color.WHITE);
        pyes.setForeground(Color.BLACK);
        pyes.setBounds(310,425,90,22);
        pyes.addActionListener(this);
        im1.add(pyes);

        pno = new JButton("NO");
        pno.setFont(new Font("Raleway",Font.BOLD,12));
        pno.setBackground(Color.WHITE);
        pno.setForeground(Color.BLACK);
        pno.setBounds(310,455,90,22);
        pno.addActionListener(this);
        im1.add(pno);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==pyes){
            String sepin=epin.getText();
            String sreepin=repin.getText();
            try{
                if(!sepin.equals(sreepin)){
                    JOptionPane.showMessageDialog(null,"Password does not match");
                    return;
                }
                if(sepin.equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter new pin");
                    return;
                }
                if(sreepin.equals("")){
                    JOptionPane.showMessageDialog(null,"Please re-enter new pin");
                    return;
                }
                conn cn = new conn();
                String query1 ="update bankdata set pin = '"+sreepin+"' where pin ='"+pinnumber+"'";
                String query2 ="update login set pin = '"+sreepin+"' where pin ='"+pinnumber+"'";
                String query3 ="update signup2 set pin = '"+sreepin+"' where pin ='"+pinnumber+"'";

                cn.s1.executeUpdate(query1);
                cn.s1.executeUpdate(query2);
                cn.s1.executeUpdate(query3);

                JOptionPane.showMessageDialog(null,"Pin has been changed successfully");
                setVisible(false);
                new Transaction(sreepin).setVisible(true);

            } catch(Exception e){
                System.out.println(e);
            }
        }
        else{
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }
    }
    public static void main(String args[]){
        new Changepin("").setVisible(true);
    }
}
