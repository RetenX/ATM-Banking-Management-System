import javax.swing.*;
// import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Transaction extends JFrame implements ActionListener{
    
    JLabel im1,tran;
    JButton depost,withdrwl,fastcsh,ministat,pinchng,balacenq,ext;
    String pinnumber;
    Transaction(String pinnumber){

        this.pinnumber=pinnumber;
        ImageIcon img = new ImageIcon("atm.jpg");
        // Image img1 = img.getImage().getScaledInstance(750,850, Image.SCALE_DEFAULT);
        // ImageIcon img2 = new ImageIcon(img1);
        setTitle("ATM Machine");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,50,720,770);
        // setUndecorated(true);
        // getContentPane().setBackground(Color.white);

        im1 = new JLabel(img);
        add(im1);

        tran = new JLabel("Plese select your Transaction");
        tran.setFont(new Font("System",Font.BOLD,14));
        tran.setForeground(Color.white);
        tran.setBounds(160,260,600,20);
        im1.add(tran);

        depost = new JButton("Deposit");
        depost.setFont(new Font("Raleway",Font.BOLD,12));
        depost.setBackground(Color.WHITE);
        depost.setForeground(Color.BLACK);
        depost.setBounds(130,363,128,26);
        depost.addActionListener(this);
        im1.add(depost);

        withdrwl = new JButton("Withdrawal");
        withdrwl.setFont(new Font("Raleway",Font.BOLD,12));
        withdrwl.setBackground(Color.WHITE);
        withdrwl.setForeground(Color.BLACK);
        withdrwl.setBounds(272,363,128,26);
        withdrwl.addActionListener(this);
        im1.add(withdrwl);

        fastcsh = new JButton("Fast Cash");
        fastcsh.setFont(new Font("Raleway",Font.BOLD,12));
        fastcsh.setBackground(Color.WHITE);
        fastcsh.setForeground(Color.BLACK);
        fastcsh.setBounds(130,394,128,26);
        fastcsh.addActionListener(this);
        im1.add(fastcsh);

        ministat = new JButton("Mini Statement");
        ministat.setFont(new Font("Raleway",Font.BOLD,12));
        ministat.setBackground(Color.WHITE);
        ministat.setForeground(Color.BLACK);
        ministat.setBounds(272,394,128,26);
        ministat.addActionListener(this);
        im1.add(ministat);

        pinchng = new JButton("Pin Change");
        pinchng.setFont(new Font("Raleway",Font.BOLD,12));
        pinchng.setBackground(Color.WHITE);
        pinchng.setForeground(Color.BLACK);
        pinchng.setBounds(130,426,128,26);
        pinchng.addActionListener(this);
        im1.add(pinchng);

        balacenq = new JButton("Balance Enquiry");
        balacenq.setFont(new Font("Raleway",Font.BOLD,12));
        balacenq.setBackground(Color.WHITE);
        balacenq.setForeground(Color.BLACK);
        balacenq.setBounds(272,426,128,26);
        balacenq.addActionListener(this);
        im1.add(balacenq);

        ext = new JButton("Exit");
        ext.setFont(new Font("Raleway",Font.BOLD,12));
        ext.setBackground(Color.WHITE);
        ext.setForeground(Color.BLACK);
        ext.setBounds(272,456,128,26);
        ext.addActionListener(this);
        im1.add(ext);
    }
  

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==ext){
        System.exit(0);
       }
       else if(ae.getSource()==depost){
        setVisible(false);
        new Deposit(pinnumber).setVisible(true);
       }
       else if(ae.getSource()==withdrwl){
        setVisible(false);
        new Withdrawal(pinnumber).setVisible(true);
       }
       else if(ae.getSource()==fastcsh){
        setVisible(false);
        new Fastcash(pinnumber).setVisible(true);
       }
       else if(ae.getSource()==pinchng){
        setVisible(false);
        new Changepin(pinnumber).setVisible(true);
       }
       else if(ae.getSource()==balacenq){
        setVisible(false);
        new Balancenq(pinnumber).setVisible(true);
       }else if(ae.getSource()==ministat){
        setVisible(false);
        new Ministatement(pinnumber).setVisible(true);
       }

    }

    public static void main(String args[]){
        new Transaction("").setVisible(true);
    }
}
