import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signup1 extends JFrame implements ActionListener{

    JLabel formno,additionald,religion,catagory,income,edu,occupation,panno,adharno,accno,exsist,seniorc,ifsc;
    JTextField pan,adhr,khatano,ifscod;
    JRadioButton r1,r2,r3;
    JComboBox dhrm,ctgry,amdani,pesha,shiksha,scitizn,exacc;
    JButton nxt1;
    // long rndm;
    String formn;

    Signup1(String formn){
        this.formn=formn;

        setTitle("APPLICATION FORM");
        setBounds(400,100,600,650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        formno = new JLabel("APPLICATION FORM NO. "+ formn);
        formno.setFont(new Font("Raleway",Font.BOLD,25));
        formno.setBounds(110,10,400,40);
        add(formno);

        additionald = new JLabel("STEP 2: Additional Details");
        additionald.setFont(new Font("Raleway",Font.BOLD,18));
        additionald.setBounds(160,45,400,40);
        add(additionald);

        religion = new JLabel("Religion: ");
        religion.setFont(new Font("Raleway",Font.BOLD,18));
        religion.setBounds(50,110,100,20);
        add(religion);
        String sr[]={"----Select----","Hindu(Including Jain,Buddh,Sikh)","Muslim","Christian","Others"};
        dhrm= new JComboBox(sr);
        dhrm.setFont(new Font("Raleway",Font.BOLD,12));
        dhrm.setBackground(Color.white);
        dhrm.setBounds(230,112,270,22);
        add(dhrm);

        catagory = new JLabel("Catagory: ");
        catagory.setFont(new Font("Raleway",Font.BOLD,18));
        catagory.setBounds(50,150,200,20);
        add(catagory);
        String str[]={"--Select--","GENERAL","OBC","SC/ST"};
        ctgry=new JComboBox(str);    
        ctgry.setBounds(230,152,200,20);
        ctgry.setBackground(Color.white);
        ctgry.setFont(new Font("Raleway",Font.BOLD,12));
        // cb.setEditable(true);
        add(ctgry);

        income = new JLabel("Annual Income: ");
        income.setFont(new Font("Raleway",Font.BOLD,18));
        income.setBounds(50,190,150,20);
        add(income);
        String sr1[]={"--Select--","0 to 1,500,00","1,500,00 to 3,00,000","3,00,000 to 5,00,000","5,00,000 to 10,00,000","Above 10,00,000"};
        amdani = new JComboBox(sr1);
        amdani.setBounds(230,192,200,20);
        amdani.setBackground(Color.white);
        amdani.setFont(new Font("Raleway",Font.BOLD,12));
        add(amdani);

        edu = new JLabel("Education: ");
        edu.setFont(new Font("Raleway",Font.BOLD,18));
        edu.setBounds(50,230,150,20);
        add(edu);
        String sr2[]={"--Select--","Matric", "School","College/University","Uneducated"};
        shiksha=new JComboBox(sr2);
        shiksha.setFont(new Font("Raleway",Font.BOLD,12));  
        shiksha.setBackground(Color.white);
        shiksha.setBounds(230,232,200,20);
        add(shiksha);
        
        
        // ButtonGroup gendergr=new ButtonGroup();
        // gendergr.add(r1);
        // gendergr.add(r2);
        // gendergr.add(r3);

        occupation = new JLabel("Occupation: ");
        occupation.setFont(new Font("Raleway",Font.BOLD,18));
        occupation.setBounds(50,270,200,20);
        add(occupation);
        String sr3[]= {"--Select--","Salaried","Self-Employed","Businessman","Graduate","Student","Others"};
        pesha= new JComboBox(sr3);
        pesha.setFont(new Font("Raleway",Font.BOLD,12));
        pesha.setBackground(Color.WHITE);
        pesha.setBounds(230,272,200,20);
        add(pesha);

        panno = new JLabel("Pan Number: ");
        panno.setFont(new Font("Raleway",Font.BOLD,18));
        panno.setBounds(50,310,200,20);
        add(panno);
        pan=new JTextField(10);
        pan.setFont(new Font("Raleway",Font.PLAIN,14));
        pan.setBounds(230,312,270,22);
        add(pan);

        adharno = new JLabel("Adhaar Number: ");
        adharno.setFont(new Font("Raleway",Font.BOLD,18));
        adharno.setBounds(50,350,200,20);
        add(adharno);
        adhr= new JTextField();
        adhr.setFont(new Font("Arial",Font.PLAIN,14));
        adhr.setBounds(230,352,270,22);
        add(adhr);

        seniorc = new JLabel("Senior Citizen: ");
        seniorc.setFont(new Font("Raleway",Font.BOLD,18));
        seniorc.setBounds(50,400,200,20);
        add(seniorc);
        String sr4[] = {"--Select--","YES","NO"};
        scitizn= new JComboBox(sr4);
        scitizn.setFont(new Font("Raleway",Font.BOLD,12));
        scitizn.setBackground(Color.white);
        scitizn.setBounds(230,402,100,20);
        add(scitizn);

        exsist = new JLabel("If,Existing Account: ");
        exsist.setFont(new Font("Raleway",Font.BOLD,18));
        exsist.setBounds(50,440,200,20);
        add(exsist);
        String sr5[]={"--Select--","YES","NO"};
        exacc= new JComboBox(sr5);
        exacc.setFont(new Font("Arial",Font.BOLD,12));
        exacc.setBackground(Color.white);
        exacc.setBounds(230,442,100,20);
        add(exacc);

        accno = new JLabel("Account Number: ");
        accno.setFont(new Font("Raleway",Font.BOLD,18));
        accno.setBounds(50,480,200,20);
        // accno.setVisible(false);
        add(accno);
        khatano= new JTextField();
        khatano.setFont(new Font("Arial",Font.PLAIN,14));
        khatano.setBounds(230,482,270,22);
        // khatano.setVisible(false);
        add(khatano);
       
        ifsc=new JLabel("IFSC Code: ");
        ifsc.setFont(new Font("Raleway",Font.BOLD,18));
        ifsc.setBounds(50,520,200,20);
        // ifsc.setVisible(false);
        add(ifsc);
        ifscod= new JTextField();
        ifscod.setFont(new Font("Arial",Font.PLAIN,14));
        ifscod.setBounds(230,522,270,22);
        // ifscod.setVisible(false);
        add(ifscod);

        nxt1=new JButton("Next");
        nxt1.setBounds(370,560,100,30);
        nxt1.setBackground(Color.BLACK);
        nxt1.setForeground(Color.CYAN);
        nxt1.addActionListener(this);
        add(nxt1);
    }

    public void actionPerformed(ActionEvent ae){
        String sdhrm = (String)dhrm.getSelectedItem();
        String sctgry = (String)ctgry.getSelectedItem();
        String samdani = (String)amdani.getSelectedItem();    
        String sshiksha = (String)shiksha.getSelectedItem();
        String spesha= (String)pesha.getSelectedItem();
        String span = pan.getText();
        String sadhr = ""+adhr.getText();
        String sscitizn= (String)scitizn.getSelectedItem();
        String sexacc = (String)exacc.getSelectedItem();
        String skhatano = null;
        String sifscod = null;
        if(exacc.getSelectedItem().equals("YES")){
            String temp;
            temp = khatano.getText();
            skhatano=""+temp;
            sifscod=ifscod.getText();
        }
        try{
            if(sdhrm.equals("----Select----")){
                JOptionPane.showMessageDialog(null,"Religion field is blank");
                return;
            }
            else if(sctgry.equals("--Select--")){
                JOptionPane.showMessageDialog(null,"Catagory field is blank");
            }
            else if(samdani.equals("--Select--")){
                JOptionPane.showMessageDialog(null,"Annual Income field is blank");
            }
            else if(sshiksha.equals("--Select--")){
                JOptionPane.showMessageDialog(null,"Education field is blank");
            }
            else if(spesha.equals("--Select--")){
                JOptionPane.showMessageDialog(null,"Occupation field is blank");
            }
            else if(span.equals("")){
                JOptionPane.showMessageDialog(null," Pan Number field is blank");
            }
            else if(sadhr.equals("")){
                JOptionPane.showMessageDialog(null,"Adhaar Number field is blank");
            }
            else if(sscitizn.equals("--Select--")){
                JOptionPane.showMessageDialog(null,"Senior Citizen field is blank");
            }
            else if(sexacc.equals("--Select--")){
                JOptionPane.showMessageDialog(null,"Existing Account field is blank");
            }
            else{
                conn c1 = new conn();
                String Query = "insert into signup1 values('"+formn+"', '"+sdhrm+"', '"+sctgry+"','"+samdani+"','"+sshiksha+"','"+spesha+"','"+span+"','"+sadhr+"','"+sscitizn+"','"+sexacc+"','"+skhatano+"','"+sifscod+"')";
                c1.s1.executeUpdate(Query);

                setVisible(false);
                new Signup2(formn).setVisible(true);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String args[]){
        new Signup1("").setVisible(true);
    }
}
