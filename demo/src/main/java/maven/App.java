package maven;
import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.*;  
public class App {  
public static void main(String[] args) throws SQLException {  

    //establish connection
    Connection connection = DatabaseConnection.getConnection();

    JFrame frame =new JFrame();//creating instance of JFrame 
    frame.setSize(1280,720); 
    frame.getContentPane().setBackground(new Color(246, 255, 248)); // gen pane and Set background color 
    frame.setLayout(null);  
    

    //button
    JButton regButton = new JButton("Register");
    regButton.setBackground(new Color(204, 227, 222)); //grey
    int regCenter_X = (frame.getWidth()- 95) /2;
    regButton.setBounds(regCenter_X, 150, 95, 30);
    frame.add(regButton);   //add our button
    frame.setVisible(true);

    //register
    JButton logButton = new JButton("Login");
    logButton.setBackground(new Color(204, 227, 222)); //grey
    int logCenter_X = (frame.getWidth()- 95) /2;
    logButton.setBounds(logCenter_X, 210, 95, 30);
    frame.add(logButton);   //add our button
    frame.setVisible(true);

    JButton guestButton = new JButton("Guest");
    guestButton.setBounds(50,100,95,30);
    guestButton.setBackground(new Color(204, 227, 222)); //grey
    int guestCenter_X = (frame.getWidth()- 95) /2;
    guestButton.setBounds(guestCenter_X, 270, 95, 30);
    frame.add(guestButton);   //add our button
    frame.setVisible(true);


    //exit program when app is closed
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
}
}  