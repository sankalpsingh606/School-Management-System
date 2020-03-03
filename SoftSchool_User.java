package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SoftSchool_User extends JFrame {

	JLabel lbl1, lbl2, lbl3, Uid, Ufullname, Uname, Upassword;
	JTextField txtid, txtfulltname, txtusername;
	JPasswordField txtpassword;
	JButton btn1, btn2, btn3, btn4, btn5, btn6;
	JPanel pn, pn1, pn2, pn3;
	JTable tbl;
	String driverName = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userName = "system";
	String userPassword = "akanksha123";
	Connection conn;
	String sql;
	PreparedStatement pst;
	ResultSet rs;
	ResultSetMetaData rsmd;
	DefaultTableModel model;
	JList lstDetail;

	SoftSchool_User() throws ClassNotFoundException, SQLException {
		//super("Soft School");

		//Class.forName(driverName);
		//conn = DriverManager.getConnection(url, userName, userPassword);

		setSize(595, 460);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);

		// create JLabel
		ImageIcon i = new ImageIcon("user.png");
		lbl1 = new JLabel(i);
		lbl1.setBounds(0, 0, 585, 63);
		add(lbl1);
		ImageIcon j = new ImageIcon("user1.png");
		lbl2 = new JLabel(j);
		lbl2.setBounds(0, 196, 585, 30);
		add(lbl2);
		ImageIcon k = new ImageIcon("user2.png");
		lbl3 = new JLabel(k);
		lbl3.setBounds(0, 400, 585, 45);
		add(lbl3);

		Uid = new JLabel("Use ID");
		Ufullname = new JLabel("Full Name");
		Uname = new JLabel("User Name");
		Upassword = new JLabel("Password");
		Uid.setBounds(10, 70, 100, 25);
		Ufullname.setBounds(10, 100, 100, 25);
		Uname.setBounds(10, 130, 100, 25);
		Upassword.setBounds(10, 160, 100, 25);
		add(Uid);
		add(Ufullname);
		add(Uname);
		add(Upassword);
		Uid.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
		Ufullname.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
		Uname.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
		Upassword.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));

		// Create JTextField
		txtid = new JTextField();
		txtfulltname = new JTextField();
		txtusername = new JTextField();
		txtpassword = new JPasswordField();
		txtid.setBounds(120, 70, 170, 25);
		txtfulltname.setBounds(120, 100, 170, 25);
		txtusername.setBounds(120, 130, 170, 25);
		txtpassword.setBounds(120, 160, 170, 25);
		add(txtid);
		add(txtfulltname);
		add(txtusername);
		add(txtpassword);

		// Create JButton
		ImageIcon b1 = new ImageIcon("add.png");
		ImageIcon b2 = new ImageIcon("save2.png");
		ImageIcon b3 = new ImageIcon("dt.png");
		ImageIcon b4 = new ImageIcon("update.png");
		ImageIcon b5 = new ImageIcon("find.png");
		ImageIcon b6 = new ImageIcon("cancel.png");
		btn1 = new JButton(b1);
		btn2 = new JButton(b2);
		btn3 = new JButton(b3);
		btn4 = new JButton(b4);
		btn5 = new JButton(b5);
		btn6 = new JButton(b6);
		btn1.setBounds(320, 75, 110, 30);
		btn2.setBounds(320, 110, 110, 30);
		btn3.setBounds(310, 150, 125, 40);
		btn4.setBounds(450, 75, 110, 30);
		btn5.setBounds(450, 110, 110, 30);
		btn6.setBounds(442, 150, 125, 40);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);

		// Add New Record
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtid.setText("");
				txtfulltname.setText("");
				txtusername.setText("");
				txtpassword.setText("");
				txtid.requestFocus();

			}
		});

		// Save Record
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					sql = "insert into STLogin values(?,?,?,?)";
					pst = conn.prepareStatement(sql);

					pst.setObject(1, txtid.getText());
					pst.setObject(2, txtfulltname.getText());
					pst.setObject(3, txtusername.getText());
					pst.setObject(4, txtpassword.getText());

					int x = pst.executeUpdate();
					JOptionPane.showMessageDialog(null, x + "Record added in the table");
				} catch (SQLException ee) {
					JOptionPane.showMessageDialog(null, ee);
				}
			}
		});

		// Delete Record
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int row = tbl.getSelectedRow();
				model = (DefaultTableModel) tbl.getModel();
				String selected = model.getValueAt(row, 0).toString();
				if (row >= 0) {
					model.removeRow(row);

					try {
						sql = "delete from STLogin where id=?";
						pst = conn.prepareStatement(sql);
						pst.setString(1, selected);
						int x = pst.executeUpdate();
						JOptionPane.showMessageDialog(null, x + "Record Deleted in the table");
					} catch (SQLException ee) {
						JOptionPane.showMessageDialog(null, ee);
					}
				}
			}
		});
		// Update Record
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					sql = "update STLogin set full_name=?,user_name=?,password=? where id=?";
					pst = conn.prepareStatement(sql);

					pst.setObject(4, txtid.getText());
					pst.setObject(1, txtfulltname.getText());
					pst.setObject(2, txtusername.getText());
					pst.setObject(3, txtpassword.getText());

					int x = pst.executeUpdate();
					JOptionPane.showMessageDialog(null, x + "Record Updated in a table");
				} catch (SQLException ee) {
					JOptionPane.showMessageDialog(null, ee);
				}
			}
		});

		// Show JTabel

		DefaultTableModel model = new DefaultTableModel();
		tbl = new JTable(model);
		String[] header = { "ID", "Full_Name", "User_Name", "Password" };
		model.setColumnIdentifiers(header);
		JScrollPane pane = new JScrollPane(tbl);
		pane.setBounds(2, 227, 573, 170);
		add(pane);

		tbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel dt = (DefaultTableModel) tbl.getModel();
				txtid.setText((String) tbl.getValueAt(tbl.getSelectedRow(),0));
				txtfulltname.setText((String) tbl.getValueAt(tbl.getSelectedRow(), 1));
				txtusername.setText((String) tbl.getValueAt(tbl.getSelectedRow(), 2));
				txtpassword.setText((String) tbl.getValueAt(tbl.getSelectedRow(), 3));
			//	System.out.println(tbl.getValueAt(tbl.getSelectedRow(), 0));
			}
		});

		try {
			sql = "select * from STLogin";
			pst = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = pst.executeQuery();
			rsmd = rs.getMetaData();
			while (rs.next()) {
			
				model.addRow(new Object[] { rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4)});
			}
		} catch (SQLException ee) {
			JOptionPane.showMessageDialog(null, ee);
		}

		// Find Record
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					sql = "select * from STLogin";
					pst = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
					rs = pst.executeQuery();
					rsmd = rs.getMetaData();
					
					DefaultTableModel model = (DefaultTableModel)tbl.getModel();
					for(int i=model.getRowCount()-1;i>=0;i-- )
					{
						model.removeRow(i);
					}
					while (rs.next()) {
						
						model.addRow(new Object[] { rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4)});
					}
				} catch (SQLException ee) {
					JOptionPane.showMessageDialog(null, ee);
				}
			}
		});

		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});

		// Create JPanel for border line
		pn1 = new JPanel();
		pn1.setBounds(2, 65, 573, 128);
		add(pn1);
		pn1.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2));

		setLocation(250, 100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new SoftSchool_User();
	}

}
