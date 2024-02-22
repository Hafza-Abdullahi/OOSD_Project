package maven;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.*;  
public class App {  
public static void main(String[] args) throws SQLException {  

    //establish connection
    Connection connection = DatabaseConnection.getConnection();

    // Call the readTable function from TableReader class
    String[] text = TableReader.readTable(connection, "customer");
    System.out.println(text[1]);
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println(text[3]);
    
     
    JFrame f=new JFrame();//creating instance of JFrame 
 
    /*        
    JButton b=new JButton("click");//creating instance of JButton  
    b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
            
    f.add(b);//adding button in JFrame  
            
    
    */
    //text  
    JTextArea area=new JTextArea(text[3]);  
    area.setBounds(10,30, 1000,600);  
    f.add(area);  
    f.setSize(1280,720);  
    f.setLayout(null);  
    f.setVisible(true);
}
}  