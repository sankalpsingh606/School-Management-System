package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;

public class Emp_Page extends JFrame {
	public Emp_Page() {
		// TODO Auto-generated constructor stub
		setTitle("Employee Page");
		setBounds(100, 90, 1150, 600);

		// Panel1
		JPanel jp1 = new JPanel();
		jp1.setBackground(new Color(135, 206, 250));
		jp1.setLayout(null);
		jp1.setBounds(0, 2, 1149, 600);
		add(jp1);

		JPanel jp2 = new JPanel();
		jp2.setBackground(Color.WHITE);
		jp2.setLayout(null);
		jp2.setBounds(0, 1, 1149, 40);
		jp1.add(jp2);

		JButton add = new JButton("Add");
		add.setBackground(Color.WHITE);
		add.setBounds(0, 0, 100, 40);
		jp2.add(add);

		JButton ref = new JButton("Refresh");
		ref.setBackground(Color.WHITE);
		ref.setBounds(100, 0, 100, 40);
		jp2.add(ref);

		JButton cancel = new JButton("Cancel");
		cancel.setBackground(Color.WHITE);
		cancel.setBounds(200, 0, 100, 40);
		jp2.add(cancel);

		JButton close = new JButton("Close");
		close.setBackground(Color.WHITE);
		close.setBounds(300, 0, 100, 40);
		jp2.add(close);

		// ...........................................

		// JPanel 2
		JPanel jp3 = new JPanel();
		jp3.setBackground(Color.WHITE);
		jp3.setBorder(new LineBorder(Color.blue, 2));
		jp3.setLayout(null);
		jp3.setBounds(25, 60, 1080, 220);
		jp1.add(jp3);

		JLabel jl1 = new JLabel(" Employees | Mode: Adding ");
		jl1.setBounds(15, 5, 220, 20);
		jl1.setForeground(Color.blue);
		jl1.setFont(new Font("Arial", Font.BOLD, 15));
		jl1.setBorder(new LineBorder(Color.white));
		jp3.add(jl1);

		JLabel jl3 = new JLabel(" Remarks ");
		jl3.setFont(new Font("Arial", Font.PLAIN, 14));
		jl3.setBounds(20, 168, 100, 20);
		jp3.add(jl3);
		JTextField tf2 = new JTextField();
		tf2.setBounds(15, 190, 640, 20);
		tf2.setFont(new Font("Arial", Font.PLAIN, 15));
		jp3.add(tf2);

		JLabel jl4 = new JLabel(" Address ");
		jl4.setFont(new Font("Arial", Font.PLAIN, 14));
		jl4.setBounds(675, 15, 100, 20);
		jp3.add(jl4);
		JTextField tf3 = new JTextField();
		tf3.setBounds(675, 40, 390, 65);
		tf3.setFont(new Font("Arial", Font.PLAIN, 15));
		jp3.add(tf3);

		JLabel jl5 = new JLabel(" Qualification ");
		jl5.setFont(new Font("Arial", Font.PLAIN, 14));
		jl5.setBounds(675, 115, 100, 20);
		jp3.add(jl5);
		JTextField tf4 = new JTextField();
		tf4.setBounds(675, 145, 390, 65);
		tf4.setFont(new Font("Arial", Font.PLAIN, 15));
		jp3.add(tf4);

		JLabel emp_id = new JLabel(" Employee Id ");
		emp_id.setFont(new Font("Arial", Font.PLAIN, 14));
		emp_id.setBounds(10, 25, 100, 20);
		jp3.add(emp_id);
		JTextField t_id = new JTextField();
		t_id.setBounds(10, 50, 200, 20);
		t_id.setFont(new Font("Arial", Font.PLAIN, 15));
		jp3.add(t_id);

		JLabel emp_name = new JLabel(" Employee Name ");
		emp_name.setFont(new Font("Arial", Font.PLAIN, 14));
		emp_name.setBounds(240, 25, 120, 20);
		jp3.add(emp_name);
		JTextField t_name = new JTextField();
		t_name.setBounds(240, 50, 415, 20);
		t_name.setFont(new Font("Arial", Font.PLAIN, 15));
		jp3.add(t_name);

		JLabel jl6 = new JLabel(" N.I.C NO ");
		jl6.setFont(new Font("Arial", Font.PLAIN, 14));
		jl6.setBounds(10, 75, 100, 20);
		jp3.add(jl6);
		JTextField tf5 = new JTextField();
		tf5.setBounds(10, 100, 200, 20);
		tf5.setFont(new Font("Arial", Font.PLAIN, 15));
		jp3.add(tf5);

		JLabel jl7 = new JLabel(" Hire Date ");
		jl7.setFont(new Font("Arial", Font.PLAIN, 14));
		jl7.setBounds(10, 125, 100, 20);
		jp3.add(jl7);
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(10, 150, 200, 20);
		jp3.add(dateChooser);

		dateChooser.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JLabel jl8 = new JLabel(" Age ");
		jl8.setFont(new Font("Arial", Font.PLAIN, 14));
		jl8.setBounds(240, 75, 40, 20);
		jp3.add(jl8);
		JTextField tf7 = new JTextField();
		tf7.setBounds(240, 100, 60, 20);
		tf7.setFont(new Font("Arial", Font.PLAIN, 15));
		jp3.add(tf7);

		JLabel jl9 = new JLabel(" Gender ");
		jl9.setFont(new Font("Arial", Font.PLAIN, 14));
		jl9.setBounds(330, 75, 80, 20);
		jp3.add(jl9);
		JTextField tf8 = new JTextField();
		tf8.setBounds(330, 100, 100, 20);
		tf8.setFont(new Font("Arial", Font.PLAIN, 15));
		jp3.add(tf8);

		JLabel contact = new JLabel(" Contact No ");
		contact.setFont(new Font("Arial", Font.PLAIN, 14));
		contact.setBounds(450, 75, 80, 20);
		jp3.add(contact);
		JTextField tcon = new JTextField();
		tcon.setBounds(450, 100, 205, 20);
		tcon.setFont(new Font("Arial", Font.PLAIN, 15));
		jp3.add(tcon);

		JCheckBox jcb1 = new JCheckBox(" Active");
		jcb1.setBounds(240, 130, 70, 20);
		jcb1.setFont(new Font("Arial", Font.PLAIN, 15));
		jcb1.setBackground(Color.white);
		jp3.add(jcb1);

		JCheckBox jcb2 = new JCheckBox(" Is Teacher");
		jcb2.setBounds(240, 160, 100, 20);
		jcb2.setFont(new Font("Arial", Font.PLAIN, 15));
		jcb2.setBackground(Color.white);
		jp3.add(jcb2);

		JLabel jl10 = new JLabel(" Subject Post ");
		jl10.setFont(new Font("Arial", Font.PLAIN, 14));
		jl10.setBounds(350, 125, 120, 20);
		jp3.add(jl10);
		JTextField tf9 = new JTextField();
		tf9.setBounds(350, 150, 140, 20);
		tf9.setFont(new Font("Arial", Font.PLAIN, 15));
		jp3.add(tf9);

		JLabel jl11 = new JLabel(" Salary ");
		jl11.setFont(new Font("Arial", Font.PLAIN, 14));
		jl11.setBounds(510, 125, 80, 20);
		jp3.add(jl11);
		JTextField tf10 = new JTextField();
		tf10.setBounds(510, 150, 145, 20);
		tf10.setFont(new Font("Arial", Font.PLAIN, 15));
		jp3.add(tf10);

		// ...........................................

		// JPanel3
		JPanel jp4 = new JPanel();
		jp4.setBackground(Color.white);
		jp4.setBorder(new LineBorder(Color.blue, 2));
		jp4.setLayout(null);
		jp4.setBounds(25, 310, 1080, 230);
		jp1.add(jp4);

		JButton search = new JButton(" Search By ID/Name ");
		search.setBackground(Color.yellow);
		search.setBounds(300, 10, 170, 30);
		jp4.add(search);

		JRadioButton jrb1 = new JRadioButton("By Id");
		jrb1.setBackground(Color.white);
		jrb1.setBounds(500, 10, 80, 20);
		jp4.add(jrb1);

		JRadioButton jrb2 = new JRadioButton("By Name");
		jrb2.setBackground(Color.white);
		jrb2.setBounds(600, 10, 80, 20);
		jp4.add(jrb2);

		ButtonGroup gengp = new ButtonGroup();
		gengp.add(jrb1);
		gengp.add(jrb2);

		JTable jt = new JTable();
		jt.setBorder(new LineBorder(Color.blue, 2));
		jt.setBounds(17, 50, 1040, 170);
		jp4.add(jt);

		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				setVisible(false);

			}

		});

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Emp_Page();

	}

}
