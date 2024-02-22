package maven;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


//uses connection and table name to get data from table
public class Insert {
    public static void main(String[] args) throws SQLException {  

        PreparedStatement pstat = null;
        //establish connection
        Connection connection = DatabaseConnection.getConnection();

        if(connection != null ){
            System.out.println("database connected");
        }

        String firstname = "Mark PowerTOBEDELTED";
        String contNum = "987-623-3210";
        String email = "MarkPow672@gmail.com";
        String address = "147 0'connel St, Dublin, Ireland";
        int i = 0;

        try{
            //create a prepared statement for inserting data into a table
            pstat = connection.prepareStatement("Insert INTO customer (customer_name, contact_number, email,address) VALUES (?,?,?,?)");
            pstat.setString(1, firstname);
            pstat.setString(2, contNum);
            pstat.setString(3, email);
            pstat.setString(4, address);

            //insert data into table
            i = pstat .executeUpdate();
            System.out.println(i + " record succesfully added to the table");

        }
        catch(SQLException sqlE) {
            sqlE.printStackTrace();
        }

        //close connection and error catching
        finally{
            try{
                pstat.close();
                connection.close();
            }
        
        
            catch(Exception e) {
                e.printStackTrace();
            }

        }

    }
}