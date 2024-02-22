package maven;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

//uses connection and table name to get all data from table
public class TableReader {
    PreparedStatement pstat = null;
    private Connection connection;
    private String id;
    
    //uses connection and table name to get all data from table
    public static String[] readTable(Connection connection, String tableName) {
        String[] fullTable = new String[100];
        int index = 0;
        try {
            //connect
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tableName);

            //metadata reads in the column names, data types etc
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            //print out each column name and its value
            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    String columnName = metaData.getColumnName(i);
                    String columnValue = resultSet.getString(i);
                    System.out.println(columnName + ": " + columnValue);

                    fullTable[index] = columnName + ": " + columnValue;
                    index++;
                }
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return fullTable;
        
    }

    public String[] getRowByID(Connection connection, String id) {
        this.connection = connection;
        this.id = id;
        try {
            pstat = connection.prepareStatement("SELECT * FROM your_table_name WHERE id = " + id);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
        
    }






}
