package project;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Login_Page extends JFrame{
	public Login_Page() {
		
		// TODO Auto-generated constructor stub

			JLabel lbl,lbl1,lbl2;
			JTextField txt1;
			JButton btn1,btn2;
			JPasswordField txt2;
			
				
				setSize(550,260);
				setLayout(null);
				getContentPane().setBackground(Color.WHITE);
				 ImageIcon i=new ImageIcon("C:\\Users\\a\\eclipse-workspace\\GUI\\src\\project\\pic\\pic15.png");
				 lbl=new JLabel(i);
				 lbl.setBounds(30,40,130,130);
				 add(lbl);
				lbl1=new JLabel(" User Name ");
				lbl2=new JLabel(" Password ");
				lbl1.setBorder(new LineBorder(Color.black, 1));
				lbl2.setBorder(new LineBorder(Color.black, 1));
				lbl1.setBounds(210,70,100,30);
				lbl2.setBounds(210,105,100,30);
				add(lbl1);
				add(lbl2);
				txt1=new JTextField();
				txt2=new JPasswordField();
				txt1.setBounds(330,70,180,30);
				txt2.setBounds(330,105,180,30);
				add(txt1);
				add(txt2);
				btn1=new JButton("Login");
				btn2=new JButton("Cancel");
				btn1.setBounds(230,160,120,40);
				btn2.setBounds(370,160,120,40);
				add(btn1);
				add(btn2);
				
				
				setLocation(300,200);
				setVisible(true);                               
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
				
				
				btn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						String driverName = "oracle.jdbc.driver.OracleDriver";
						String url = "jdbc:oracle:thin:@localhost:1521:xe";
						String user = "userlogin";
						String pass = "password";

						String sql1 = "SELECT * FROM ADMIN WHERE USERNAME = ? AND PASSWORD = ?";

						try {
							Class.forName(driverName);
							System.out.println("load driver");
							java.sql.Connection conn = DriverManager.getConnection(url, user, pass);
							System.out.println("Connected..");
							PreparedStatement pst = conn.prepareStatement(sql1);
							System.out.println("Statement object created");
				
						pst.setString(1, txt1.getText());
						pst.setString(2, txt2.getText());
						ResultSet rs = pst.executeQuery();
						if (rs.next())
						{
							JOptionPane.showMessageDialog(null, "Login Successfully");
							Home_Page hp=new Home_Page();
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Invalid User Name and Password");
						}
							System.out.println("close connection");
						} catch (ClassNotFoundException e1) {
							System.out.println(e1);
						} catch (SQLException e1) {
							System.out.println(e1);
						}

					}

				});


				btn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						txt1.setText("");
						txt2.setText("");

						
					}
				});

				
			
				
					
			
	    	
	        setVisible(true);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     }

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Login_Page(); 
	}

}
