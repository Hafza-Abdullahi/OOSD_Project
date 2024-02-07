import java.beans.Statement;
import java . sql .Connection;
import java . sql .DriverManager;
import java . sql .PreparedStatement;
import java . sql .SQLException;

public class InsertAuthor {
    public static void main(String [] args) {
    // database URL
        final String DATABASE_URL = "jdbc:mysql://localhost:3306/";
        Connection connection = null ;
        PreparedStatement pstat = null;
        String user= "root";
        String pass= "oosdProject2024";
        int i=0;

        try(Connection conn = DriverManager.getConnection(DATABASE_URL, user, pass);
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Authors (firstname, lastname) VALUES (?,?)" );){
                String sql = "CREATE DATABASE VRD";
                stmt.executeUpdate(sql);
                System.out.println("SUCCESFUL CONNECTION");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
