package project;

import java.awt.EventQueue;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Demo extends AbstractFormatter {
 
    private String datePattern = "yyyy-MM-dd";
    private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);
     
    @Override
    public Object stringToValue(String text) throws ParseException {
        return dateFormatter.parseObject(text);
    }
 
    @Override
    public String valueToString(Object value) throws ParseException {
        if (value != null) {
            Calendar cal = (Calendar) value;
            return dateFormatter.format(cal.getTime());
        }
         
        return "";
    }
 


	
	
	
	
	
	
	
	
	
	public static void main(String[] args)  {
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Scanner s = new Scanner(System.in);
		String driverName = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "userlogin";
		String pass = "password";
	
		String sql1 = "insert into admin values(?,?,?,?)";
		
		Class.forName(driverName);
		System.out.println("load driver");
		java.sql.Connection conn = DriverManager.getConnection(url, user, pass);
        System.out.println("Connected..");
		System.out.println("Enter the id");
		String id = s.nextLine();
		System.out.println("Enter the Name");
		String fs = s.nextLine();
		System.out.println("Enter the user");
		String us = s.nextLine();
		System.out.println("Enter the pass");
		String pas = s.nextLine();

		PreparedStatement pst = conn.prepareStatement(sql1);
		System.out.println("Statement object created");
		
		pst.setString(1, id);
		pst.setString(2, fs);
		pst.setString(3, us);
		pst.setString(4, pas);
		int i = pst.executeUpdate();

		System.out.println(i+ "Recode add in a table");
		conn.close();
		System.out.println("close connection");

	}
*/
}}