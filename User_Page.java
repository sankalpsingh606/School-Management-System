package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class User_Page extends JFrame {
	JTable jt;
	JScrollPane jsp;
	
	
	public User_Page() {
		// TODO Auto-generated constructor stub
		setTitle("User Page");
		setBounds(100, 90, 1150, 600);

		// Panel1
		JPanel jp1 = new JPanel();
		jp1.setBackground(new Color(135, 206, 250));
		jp1.setLayout(null);
		jp1.setBounds(0, 2, 1149, 600);
		add(jp1);

		// ...........................................

		// JPanel 2
		JPanel jp2 = new JPanel();
		jp2.setBackground(Color.WHITE);
		jp2.setBorder(new LineBorder(Color.blue, 2));
		jp2.setLayout(null);
		jp2.setBounds(25, 20, 1080, 230);
		jp1.add(jp2);

		JPanel jp4 = new JPanel();
		jp4.setBackground(Color.WHITE);
		jp4.setBorder(new LineBorder(Color.black, 1));
		jp4.setLayout(null);
		jp4.setBounds(10, 10, 1060, 210);
		jp2.add(jp4);

		// ............................................
		JLabel user_Id = new JLabel(" User Id ");
		user_Id.setBounds(25, 17, 100, 30);
		user_Id.setFont(new Font("Arial", Font.PLAIN, 15));
		user_Id.setBorder(new LineBorder(Color.black, 1));
		jp4.add(user_Id);

		JTextField tuser_Id = new JTextField();
		tuser_Id.setBounds(145, 20, 450, 20);
		tuser_Id.setFont(new Font("Arial", Font.PLAIN, 15));
		tuser_Id.setBorder(new LineBorder(Color.black, 2));
		jp4.add(tuser_Id);

		JLabel name = new JLabel(" Full Name ");
		name.setBounds(25, 67, 100, 30);
		name.setFont(new Font("Arial", Font.PLAIN, 15));
		name.setBorder(new LineBorder(Color.black, 1));
		jp4.add(name);

		JTextField tname = new JTextField();
		tname.setBounds(145, 70, 450, 20);
		tname.setFont(new Font("Arial", Font.PLAIN, 15));
		tname.setBorder(new LineBorder(Color.black, 2));
		jp4.add(tname);

		JLabel user_Name = new JLabel(" User Name ");
		user_Name.setBounds(25, 117, 100, 30);
		user_Name.setFont(new Font("Arial", Font.PLAIN, 15));
		user_Name.setBorder(new LineBorder(Color.black, 1));
		jp4.add(user_Name);

		JTextField tuser_Name = new JTextField();
		tuser_Name.setBounds(145, 120, 450, 20);
		tuser_Name.setFont(new Font("Arial", Font.PLAIN, 15));
		tuser_Name.setBorder(new LineBorder(Color.black, 2));
		jp4.add(tuser_Name);

		JLabel pass = new JLabel(" Password ");
		pass.setBounds(25, 167, 100, 30);
		pass.setFont(new Font("Arial", Font.PLAIN, 15));
		pass.setBorder(new LineBorder(Color.black, 1));
		jp4.add(pass);

		JTextField tpass = new JTextField();
		tpass.setBounds(145, 170, 450, 20);
		tpass.setFont(new Font("Arial", Font.PLAIN, 15));
		tpass.setBorder(new LineBorder(Color.black, 2));
		jp4.add(tpass);

		// ..............................................

		JPanel jp6 = new JPanel();
		jp6.setBackground(Color.white);
		jp6.setBorder(new LineBorder(Color.black, 1));
		jp6.setLayout(null);
		jp6.setBounds(660, 10, 180, 130);
		jp4.add(jp6);

		ImageIcon i = new ImageIcon("C:\\Users\\a\\eclipse-workspace\\GUI\\src\\project\\pic\\pic16.png");
		JButton add = new JButton(i);
		add.setBounds(10, 10, 160, 50);
		jp6.add(add);

		ImageIcon i1 = new ImageIcon("C:\\Users\\a\\eclipse-workspace\\GUI\\src\\project\\pic\\pic21.png");
		JButton save = new JButton(i1);
		save.setBounds(10, 70, 160, 50);
		jp6.add(save);
		// ........................................

		JPanel jp7 = new JPanel();
		jp7.setBackground(Color.white);
		jp7.setBorder(new LineBorder(Color.black, 1));
		jp7.setLayout(null);
		jp7.setBounds(860, 10, 180, 130);
		jp4.add(jp7);

		ImageIcon i2 = new ImageIcon("C:\\Users\\a\\eclipse-workspace\\GUI\\src\\project\\pic\\pic18.png");
		JButton edit = new JButton(i2);
		edit.setBounds(10, 10, 160, 50);
		jp7.add(edit);

		ImageIcon i3 = new ImageIcon("C:\\Users\\a\\eclipse-workspace\\GUI\\src\\project\\pic\\pic17.png");
		JButton update = new JButton(i3);
		update.setBounds(10, 70, 160, 50);
		jp7.add(update);
		// ...........................................

		ImageIcon i4 = new ImageIcon("C:\\Users\\a\\eclipse-workspace\\GUI\\src\\project\\pic\\pic19.png");
		JButton delete = new JButton(i4);
		delete.setBounds(660, 150, 180, 50);
		jp4.add(delete);

		ImageIcon i5 = new ImageIcon("C:\\Users\\a\\eclipse-workspace\\GUI\\src\\project\\pic\\pic20.png");
		JButton close = new JButton(i5);
		close.setBounds(860, 150, 180, 50);
		jp4.add(close);

		// ...........................................

		// JPanel3
		JPanel jp3 = new JPanel();
		jp3.setBackground(Color.white);
		jp3.setBorder(new LineBorder(Color.blue, 2));
		jp3.setLayout(null);
		jp3.setBounds(25, 310, 1080, 230);
		jp1.add(jp3);

		JPanel jp5 = new JPanel();
		jp5.setBackground(Color.WHITE);
		jp5.setBorder(new LineBorder(Color.black, 1));
		jp5.setLayout(null);
		jp5.setBounds(10, 10, 1060, 210);
		jp3.add(jp5);

		

		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				setVisible(false);

			}

		});
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

		
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String driverName = "oracle.jdbc.driver.OracleDriver";
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "userlogin";
				String pass = "password";

				String sql1 = "update admin set NAME=?,USERNAME =?,PASSWORD=? where ID=?";

				try {
					Class.forName(driverName);
					System.out.println("load driver");
					java.sql.Connection conn = DriverManager.getConnection(url, user, pass);
					System.out.println("Connected..");
					PreparedStatement pst = conn.prepareStatement(sql1);
					System.out.println("Statement object created");
					
				
					
					pst.setString(4, tuser_Id.getText());
					pst.setString(1, tname.getText());
					pst.setString(2, tuser_Name.getText());
					pst.setString(3, tpass.getText());
					
					
					int i = pst.executeUpdate();
					
					JOptionPane.showMessageDialog(null,i + "Recode Update in a table");
					conn.close();
					System.out.println("close connection");
					

				

				
				} catch (ClassNotFoundException e1) {
					System.out.println(e1);
				} catch (SQLException e1) {
					System.out.println(e1);
				}

			}

		});
		

		edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				tuser_Id.setText("");
				tname.setText("");
				tuser_Name.setText("");
				tpass.setText("");

			}

		});
		
		
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String driverName = "oracle.jdbc.driver.OracleDriver";
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "userlogin";
				String pass = "password";

				String sql1 = "delete from admin where id=?";


				int row = jt.getSelectedRow();
				DefaultTableModel model = (DefaultTableModel) jt.getModel();
				String selected = model.getValueAt(row, 0).toString();
				if (row >= 0) {
					model.removeRow(row);

					try {
						Class.forName(driverName);
						System.out.println("load driver");
						java.sql.Connection conn = DriverManager.getConnection(url, user, pass);
						System.out.println("Connected..");
						PreparedStatement pst = conn.prepareStatement(sql1);
						System.out.println("Statement object created");
			
						pst.setString(1, selected);
						int x = pst.executeUpdate();
						JOptionPane.showMessageDialog(null, x + "Record Deleted in the table");
					} catch (SQLException ee) {
						JOptionPane.showMessageDialog(null, ee);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});

		
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String driverName = "oracle.jdbc.driver.OracleDriver";
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "userlogin";
				String pass = "password";

				String sql1 = "insert into admin values(?,?,?,?)";

				try {
					Class.forName(driverName);
					System.out.println("load driver");
					java.sql.Connection conn = DriverManager.getConnection(url, user, pass);
					System.out.println("Connected..");
					PreparedStatement pst = conn.prepareStatement(sql1);
					System.out.println("Statement object created");
					
				
					
					pst.setString(1, tuser_Id.getText());
					pst.setString(2, tname.getText());
					pst.setString(3, tuser_Name.getText());
					pst.setString(4, tpass.getText());
					
					
					int i = pst.executeUpdate();
					
					JOptionPane.showMessageDialog(null, "Recode add in a table");
					conn.close();
					System.out.println("close connection");
					

				

				
				} catch (ClassNotFoundException e1) {
					System.out.println(e1);
				} catch (SQLException e1) {
					System.out.println(e1);
				}

			}

		});
		
		
		
		
		
		// Show JTabel

				DefaultTableModel model = new DefaultTableModel();
				jt = new JTable(model);
				String[] header = { "ID", "Full_Name", "User_Name", "Password" };
				model.setColumnIdentifiers(header);
				
				jsp=new JScrollPane(jt);
				jsp.setBounds(10, 10, 1040, 190);
				jp5.add(jsp);
			
//				JScrollPane pane = new JScrollPane(jt);
//				pane.setBounds(2, 227, 573, 170);
//				add(pane);

				jt.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						DefaultTableModel dt = (DefaultTableModel) jt.getModel();
						tuser_Id.setText((String) jt.getValueAt(jt.getSelectedRow(),0));
						tname.setText((String) jt.getValueAt(jt.getSelectedRow(), 1));
						tuser_Name.setText((String) jt.getValueAt(jt.getSelectedRow(), 2));
						tpass.setText((String) jt.getValueAt(jt.getSelectedRow(), 3));
					//	System.out.println(tbl.getValueAt(tbl.getSelectedRow(), 0));
					}
				});

				save.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						String driverName = "oracle.jdbc.driver.OracleDriver";
						String url = "jdbc:oracle:thin:@localhost:1521:xe";
						String user = "userlogin";
						String pass = "password";

						String sql1 = "select * from Admin";

						try {
							Class.forName(driverName);
							System.out.println("load driver");
							java.sql.Connection conn = DriverManager.getConnection(url, user, pass);
							System.out.println("Connected..");
							PreparedStatement pst = conn.prepareStatement(sql1,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
							System.out.println("Statement object created");
							ResultSet rs = pst.executeQuery();
							ResultSetMetaData rsmd=rs.getMetaData();
							

							
							DefaultTableModel model = (DefaultTableModel)jt.getModel();
							for(int i=model.getRowCount()-1;i>=0;i-- )
							{
								model.removeRow(i);
							}
							while (rs.next()) {
								
								model.addRow(new Object[] { rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4)});
							}
						} catch (SQLException ee) {
							JOptionPane.showMessageDialog(null, ee);
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});



		/*save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String driverName = "oracle.jdbc.driver.OracleDriver";
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "userlogin";
				String pass = "password";

				String sql1 = "select * from Admin";

				try {
					Class.forName(driverName);
					System.out.println("load driver");
					java.sql.Connection conn = DriverManager.getConnection(url, user, pass);
					System.out.println("Connected..");
					PreparedStatement pst = conn.prepareStatement(sql1,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
					System.out.println("Statement object created");
					ResultSet rs = pst.executeQuery();
					ResultSetMetaData rsmd=rs.getMetaData();
					
					int rowCount=0;
					int count=rsmd.getColumnCount();
					String col[]=new String[count];
					
					for(int i=1;i<=count;i++)
					{
						col[i-1]=rsmd.getColumnName(i);
					}
					while(rs.next())
					{
						rowCount++;
					}
					Object row[][]=new Object[rowCount][count];
					rs.beforeFirst();
					for(int i=0;i<rowCount;i++)
					{
						rs.next();
						for(int j=1;j<=rsmd.getColumnCount();j++)
						{
							row[i][j-1]=rs.getString(j);
						}
					}


					jt=new JTable(row,col);
					jsp=new JScrollPane(jt);
					jsp.setBounds(10, 10, 1040, 190);
					jp5.add(jsp);
				
					System.out.println("close connection");
				} catch (ClassNotFoundException e1) {
					System.out.println(e1);
				} catch (SQLException e1) {
					System.out.println(e1);
				}

			}

		});
*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new User_Page();

	}

}
