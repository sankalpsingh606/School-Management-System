package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
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

public class Demo2 extends JFrame implements ActionListener {

	JLabel lblTableName;
	JTextField txtTableName;
	JButton btnShow;
	JTable jt;
	JScrollPane jsp;
	Connection conn;
	PreparedStatement pst;
	String sql;
	ResultSet rs;
	ResultSetMetaData rsmd;

	public Demo2() throws Exception {
		// TODO Auto-generated constructor stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "oracle");

		setLocation(100, 100);
		setSize(400, 400); 
		setLayout(null);
		lblTableName=new JLabel("Enter table name");
		txtTableName=new JTextField("emp");
		btnShow =new JButton("Show Details");
		
		lblTableName.setBounds(50,20, 120, 20);
		txtTableName.setBounds(190,20,150,20);
		btnShow.setBounds(150, 50, 120, 20);
		
		add(lblTableName);
		add(txtTableName);
		add(btnShow);
		
		

		setTitle("User Page");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		btnShow.addActionListener(this);
	}
		
	public void actionPerformed(ActionEvent e)
	{
		int rowCount=0;
		try
		{
			sql="select * from " +txtTableName.getText();
			//sql="select * from ";
			pst=conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs=pst.executeQuery();
			rsmd=rs.getMetaData();
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
			jsp.setBounds(50, 80, 300, 250);
			add(jsp);
		}

		catch(Exception e1)
		{
			System.out.println(e1);
		}

		
	}
		
		/*btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			int rowCount=0;
			try
			{
				sql="select * from" +txtTableName.getText();
				//sql="select * from ";
				pst=conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				rs=pst.executeQuery();
				rsmd=rs.getMetaData();
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
				jsp.setBounds(50, 80, 300, 250);
				add(jsp);
			}

			catch(Exception e1)
			{
				System.out.println(e1);
			}
			}

		});*/

		
	

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		new Demo2();

	}

}
