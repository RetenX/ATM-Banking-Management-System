// import javax.swing.JFrame;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
// import java.sql.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener{

    JLabel formno,personald,name,fname,dob,gender,email,marital,add1,city,state,country,pcode;
    JTextField naam,fnaam,mail,pata,shehr,rajy,desh,guptn;
    JDateChooser DChoose;
    JRadioButton r1,r2,r3;
    JComboBox cb;
    JButton nxt;
    long rndm;
    // private JDateChooser dateChooser;
    

    Signup(){
        setTitle("APPLICATION FORM");
        setBounds(400,100,600,650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        Random rand = new Random();
        rndm = (Math.abs(rand.nextLong()%9000L)+1000L);
        formno = new JLabel("APPLICATION FORM NO. "+rndm);
        formno.setFont(new Font("Raleway",Font.BOLD,25));
        formno.setBounds(110,10,400,40);
        add(formno);

        personald = new JLabel("STEP 1: Personal Details");
        personald.setFont(new Font("Raleway",Font.BOLD,18));
        personald.setBounds(160,45,400,40);
        add(personald);

        name = new JLabel("Name: ");
        name.setFont(new Font("Raleway",Font.BOLD,18));
        name.setBounds(50,110,100,20);
        add(name);
        naam= new JTextField();
        naam.setFont(new Font("Arial",Font.PLAIN,14));
        naam.setBounds(200,112,270,22);
        add(naam);

        fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway",Font.BOLD,18));
        fname.setBounds(50,150,200,20);
        add(fname);
        fnaam= new JTextField();
        fnaam.setFont(new Font("Arial",Font.PLAIN,14));
        fnaam.setBounds(200,152,270,22);
        add(fnaam);

        dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway",Font.BOLD,18));
        dob.setBounds(50,190,200,20);
        add(dob);
        DChoose=new JDateChooser();
        DChoose.setBounds(200,192,150,22);
        add(DChoose);

        gender = new JLabel("Gender: ");
        gender.setFont(new Font("Raleway",Font.BOLD,18));
        gender.setBounds(50,230,100,20);
        add(gender);
        r1=new JRadioButton("Male");
        r1.setBounds(200,230,60,20);
        r1.setBackground(Color.WHITE);
        add(r1);
        r2=new JRadioButton("Female");
        r2.setBounds(270,230,80,20);
        r2.setBackground(Color.WHITE);
        add(r2);
        r3=new JRadioButton("Prefer not to say");
        r3.setBounds(350,230,140,20);
        r3.setBackground(Color.WHITE);
        add(r3);
        
        ButtonGroup gendergr=new ButtonGroup();
        gendergr.add(r1);
        gendergr.add(r2);
        gendergr.add(r3);

        email = new JLabel("Email Id: ");
        email.setFont(new Font("Raleway",Font.BOLD,18));
        email.setBounds(50,270,200,20);
        add(email);
        mail= new JTextField();
        mail.setFont(new Font("Arial",Font.PLAIN,14));
        mail.setBounds(200,272,270,22);
        add(mail);

        marital = new JLabel("Marital Status: ");
        marital.setFont(new Font("Raleway",Font.BOLD,18));
        marital.setBounds(50,310,200,20);
        add(marital);
        String str[]={"Married","Unmarried","Student","Single","Others"};
        cb=new JComboBox(str);    
        cb.setBounds(200,312,150,20);
        cb.setFont(new Font("Raleway",Font.BOLD,14));
        cb.setBackground(Color.WHITE);
        // cb.setEditable(true);
        add(cb);

        add1 = new JLabel("Address: ");
        add1.setFont(new Font("Raleway",Font.BOLD,18));
        add1.setBounds(50,350,200,20);
        add(add1);
        pata= new JTextField();
        pata.setFont(new Font("Arial",Font.PLAIN,14));
        pata.setBounds(200,352,270,42);
        add(pata);

        country = new JLabel("Country: ");
        country.setFont(new Font("Raleway",Font.BOLD,18));
        country.setBounds(50,400,200,20);
        add(country);
        desh= new JTextField();
        desh.setFont(new Font("Arial",Font.PLAIN,14));
        desh.setBounds(200,402,270,22);
        add(desh);

        state = new JLabel("State: ");
        state.setFont(new Font("Raleway",Font.BOLD,18));
        state.setBounds(50,440,200,20);
        add(state);
        rajy= new JTextField();
        rajy.setFont(new Font("Arial",Font.PLAIN,14));
        rajy.setBounds(200,442,270,22);
        add(rajy);

        city = new JLabel("City: ");
        city.setFont(new Font("Raleway",Font.BOLD,18));
        city.setBounds(50,480,200,20);
        add(city);
        shehr= new JTextField();
        shehr.setFont(new Font("Arial",Font.PLAIN,14));
        shehr.setBounds(200,482,270,22);
        add(shehr);

        pcode=new JLabel("Pin Code: ");
        pcode.setFont(new Font("Raleway",Font.BOLD,18));
        pcode.setBounds(50,520,200,20);
        add(pcode);
        guptn= new JTextField();
        guptn.setFont(new Font("Arial",Font.PLAIN,14));
        guptn.setBounds(200,522,270,22);
        add(guptn);

        nxt=new JButton("Next");
        nxt.setBounds(370,560,100,30);
        nxt.setBackground(Color.BLACK);
        nxt.setForeground(Color.CYAN);
        nxt.addActionListener(this);
        add(nxt);
    }

    public void actionPerformed(ActionEvent ae){
        String formn=""+ rndm;
        String name = naam.getText();
        String fname = fnaam.getText();
        String dob= ((JTextField) DChoose.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(r1.isSelected()){
            gender = "Male";
        }
        else if(r2.isSelected()){
            gender="Female";
        }
        else{
            gender="Others";
        }
        String email = mail.getText();
        String marital=(String) cb.getSelectedItem();
        String address=add1.getText();
        String cntry=desh.getText();
        String state=rajy.getText();
        String city=shehr.getText();
        String pcode=""+ guptn.getText(); 

        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Name is required");
                return;
            }
            else if(fname.equals("")){
                JOptionPane.showMessageDialog(null,"Father's name is required");
            }
            else if(dob.equals("")){
                JOptionPane.showMessageDialog(null,"Date of Birth is required");
            }
            else if(gender.equals("")){
                JOptionPane.showMessageDialog(null,"Gender is required");
            }
            else if(email.equals("")){
                JOptionPane.showMessageDialog(null,"email is required");
            }
            else if(marital.equals("")){
                JOptionPane.showMessageDialog(null,"marital is required");
            }
            else if(address.equals("")){
                JOptionPane.showMessageDialog(null,"address is required");
            }
            else if(cntry.equals("")){
                JOptionPane.showMessageDialog(null,"cntry is required");
            }
            else if(state.equals("")){
                JOptionPane.showMessageDialog(null,"state is required");
            }
            else if(city.equals("")){
                JOptionPane.showMessageDialog(null,"city is required");
            }
            else if(pcode.equals("")){
                JOptionPane.showMessageDialog(null,"Pin Code is required");
            }
            else{
                conn c1 = new conn();
                String Query = "insert into signup values('"+formn+"', '"+name+"', '"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+cntry+"','"+state+"','"+city+"','"+pcode+"')";
                c1.s1.executeUpdate(Query);
                
                setVisible(false);
                new Signup1(formn).setVisible(true);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String args[]){
        new Signup().setVisible(true);
    }
}
