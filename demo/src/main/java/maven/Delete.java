package maven;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


//uses connection and table name to get data from table
public class Delete {
    public static void main(String[] args) throws SQLException {  
        //establish connection
        Connection connection = DatabaseConnection.getConnection();

        if(connection != null ){
            System.out.println("database connected");
        }
        
        String name = "Mark PowerTOBEDELTED";
        PreparedStatement pstat = null;
        int i = 0;

        try{
            // create Prepared Statement for updating data in the table
            pstat = connection.prepareStatement("Delete From customer Where customer_name=?");
            pstat.setString (1, name);

            //Update data in the table
            i = pstat.executeUpdate();
            System.out. println ( i + " record successfully deleted in the table");
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