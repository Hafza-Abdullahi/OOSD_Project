package maven;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


//uses connection and table name to get data from table
public class Update {
    public static void main(String[] args) throws SQLException {  
        //establish connection
        Connection connection = DatabaseConnection.getConnection();

        if(connection != null ){
            System.out.println("database connected");
        }
        
        String name = "Mark Power";
        String conNum = "987-623-3210";
        PreparedStatement pstat = null;
        int i = 0;

        try{
            // create Prepared Statement for updating data in the table
            pstat = connection.prepareStatement("Update customer SET customer_name=? Where contact_number=?");
            pstat . setString (1, name);
            pstat . setString (2, conNum );
            //Update data in the table
            i = pstat.executeUpdate();
            System.out. println ( i + " record successfully updated in the table");
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