import java.sql.*;
public class Connections {

    Connection c;
    Statement s;
    Connections(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem","root","Anuraggb");
            s=c.createStatement();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

    }
}
