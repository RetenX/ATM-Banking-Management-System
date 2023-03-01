import java.sql.*;

public class conn {

    // static final String DB_URL = "jdbc:mysql://:localhost3306/bankmanagementsystem";
    // static final String USER = "root";
    // static final String PASS = "Devileye1234*";
    Connection c;
    Statement s1;
    public conn(){
        try{
            // Class.forName(com.mysql.cj.jdbc.Driver); 
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Devileye1234*");
            s1 = c.createStatement();
        } catch (SQLException e){
            System.out.println(e);
        }
    }
}

