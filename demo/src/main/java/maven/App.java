package maven;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.*;  
public class App {  
public static void main(String[] args) throws SQLException {  

    //establish connection
    Connection connection = DatabaseConnection.getConnection();

    // Call the readTable function from TableReader class
    TableReader.readTable(connection, "customer");
    
    JFrame f=new JFrame();//creating instance of JFrame  
            
    JButton b=new JButton("click");//creating instance of JButton  
    b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
            
    f.add(b);//adding button in JFrame  
            
    f.setSize(600,500);//400 width and 500 height  
    f.setLayout(null);//using no layout managers  
    f.setVisible(true);//making the frame visible  
}  
}  