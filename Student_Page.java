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

public class Student_Page extends JFrame {
	public Student_Page() {
		// TODO Auto-generated constructor stub
		setTitle("Student Page");
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

		JLabel jl1 = new JLabel(" Student | Mode: Adding ");
		jl1.setBounds(15, 5, 180, 20);
		jl1.setForeground(Color.blue);
		jl1.setFont(new Font("Arial", Font.BOLD, 15));
		jl1.setBorder(new LineBorder(Color.white));
		jp3.add(jl1);

		JLabel c_name = new JLabel(" Student Class Name ");
		c_name.setBounds(15, 35, 140, 20);
		c_name.setFont(new Font("Arial", Font.PLAIN, 14));
		jp3.add(c_name);
		JTextField tc_name = new JTextField();
		tc_name.setBounds(15, 60, 140, 20);
		tc_name.setFont(new Font("Arial", Font.PLAIN, 15));
		jp3.add(tc_name);

		JLabel stu_id = new JLabel(" Student Id ");
		stu_id.setFont(new Font("Arial", Font.PLAIN, 14));
		stu_id.setBounds(180, 35, 100, 20);
		jp3.add(stu_id);
		JTextField t_id = new JTextField();
		t_id.setBounds(180, 60, 100, 20);
		t_id.setFont(new Font("Arial", Font.PLAIN, 15));
		jp3.add(t_id);

		JLabel stu_name = new JLabel(" Student Name ");
		stu_name.setFont(new Font("Arial", Font.PLAIN, 14));
		stu_name.setBounds(305, 35, 120, 20);
		jp3.add(stu_name);
		JTextField t_name = new JTextField();
		t_name.setBounds(305, 60, 530, 20);
		t_name.setFont(new Font("Arial", Font.PLAIN, 15));
		jp3.add(t_name);

		JLabel contact = new JLabel(" Contact No ");
		contact.setFont(new Font("Arial", Font.PLAIN, 14));
		contact.setBounds(890, 35, 180, 20);
		jp3.add(contact);
		JTextField tcon = new JTextField();
		tcon.setBounds(890, 60, 140, 20);
		tcon.setFont(new Font("Arial", Font.PLAIN, 15));
		jp3.add(tcon);

		JLabel jl2 = new JLabel(" Age ");
		jl2.setFont(new Font("Arial", Font.PLAIN, 14));
		jl2.setBounds(15, 90, 40, 20);
		jp3.add(jl2);
		JTextField tf1 = new JTextField();
		tf1.setBounds(15, 115, 30, 20);
		tf1.setFont(new Font("Arial", Font.PLAIN, 15));
		jp3.add(tf1);

		JLabel jl3 = new JLabel(" Date of Birth ");
		jl3.setFont(new Font("Arial", Font.PLAIN, 14));
		jl3.setBounds(65, 90, 170, 20);
		jp3.add(jl3);
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(65, 115, 140, 20);
		jp3.add(dateChooser);

		dateChooser.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JLabel jl4 = new JLabel(" Registered Date ");
		jl4.setFont(new Font("Arial", Font.PLAIN, 14));
		jl4.setBounds(235, 90, 170, 20);
		jp3.add(jl4);
		JDateChooser dateChooser2 = new JDateChooser();
		dateChooser2.setBounds(235, 115, 140, 20);
		jp3.add(dateChooser2);

		dateChooser2.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JLabel jl5 = new JLabel(" Address ");
		jl5.setFont(new Font("Arial", Font.PLAIN, 14));
		jl5.setBounds(415, 90, 180, 20);
		jp3.add(jl5);
		JTextField tf4 = new JTextField();
		tf4.setBounds(415, 115, 615, 40);
		tf4.setFont(new Font("Arial", Font.PLAIN, 15));
		jp3.add(tf4);

		JLabel jl6 = new JLabel(" Father's/Mother's Name ");
		jl6.setFont(new Font("Arial", Font.PLAIN, 14));
		jl6.setBounds(15, 160, 170, 20);
		jp3.add(jl6);
		JTextField tf5 = new JTextField();
		tf5.setBounds(15, 185, 370, 20);
		tf5.setFont(new Font("Arial", Font.PLAIN, 15));
		jp3.add(tf5);

		JLabel jl7 = new JLabel(" Contact ");
		jl7.setFont(new Font("Arial", Font.PLAIN, 14));
		jl7.setBounds(420, 160, 110, 20);
		jp3.add(jl7);
		JTextField tf6 = new JTextField();
		tf6.setBounds(420, 185, 150, 20);
		tf6.setFont(new Font("Arial", Font.PLAIN, 15));
		jp3.add(tf6);

		JLabel jl8 = new JLabel(" Remarks ");
		jl8.setFont(new Font("Arial", Font.PLAIN, 14));
		jl8.setBounds(595, 160, 170, 20);
		jp3.add(jl8);
		JTextField tf7 = new JTextField();
		tf7.setBounds(595, 185, 350, 20);
		tf7.setFont(new Font("Arial", Font.PLAIN, 15));
		jp3.add(tf7);

		JCheckBox jcb = new JCheckBox(" Active");
		jcb.setBounds(965, 185, 70, 20);
		jcb.setFont(new Font("Arial", Font.PLAIN, 15));
		jcb.setBackground(Color.white);
		jp3.add(jcb);
		// ...........................................

		// JPanel3
		JPanel jp4 = new JPanel();
		jp4.setBackground(Color.white);
		jp4.setBorder(new LineBorder(Color.blue, 2));
		jp4.setLayout(null);
		jp4.setBounds(25, 310, 1080, 230);
		jp1.add(jp4);

		JButton search = new JButton(" Search ");
		search.setBackground(Color.yellow);
		search.setBounds(310, 10, 90, 20);
		jp4.add(search);

		JRadioButton jrb1 = new JRadioButton("View all");
		jrb1.setBackground(Color.white);
		jrb1.setBounds(410, 10, 80, 20);
		jp4.add(jrb1);

		JRadioButton jrb2 = new JRadioButton("By Class");
		jrb2.setBackground(Color.white);
		jrb2.setBounds(510, 10, 80, 20);
		jp4.add(jrb2);

		ButtonGroup gengp = new ButtonGroup();
		gengp.add(jrb1);
		gengp.add(jrb2);

		JLabel selectC = new JLabel(" Select Class ");
		selectC.setBounds(605, 2, 180, 20);
		selectC.setFont(new Font("Arial", Font.PLAIN, 14));
		jp4.add(selectC);

		JTextField tSel = new JTextField();
		tSel.setBounds(605, 25, 150, 20);
		tSel.setFont(new Font("Arial", Font.PLAIN, 15));
		jp4.add(tSel);

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
		new Student_Page();

	}

}
