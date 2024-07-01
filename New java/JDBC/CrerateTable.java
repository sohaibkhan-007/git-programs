import java.beans.Statement;
import java.sql.Connection;
import java.sql.*;

public class CrerateTable {
    public static void main(String[] args) {
        try {
            // load the driver class...
            Class.forName("com.mysql.cj.jdbc.Driver");

            // creating a connection...
            String url = "jdbc.mysql//localhost:3306/myDatabase";
            String username = "root";
            String password = "sohaibkhan@1234";

            Connection con = DriverManager.getConnection(url, username, password);
            // creating a query...
            String q = "create table tabble2(tId int(20) primary key auto_increment,tName varchar(200) not null,tCity(400))";

            // creating a statement....
            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("table created");
            // closing the connection...
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("table not created");
        }

    }
}