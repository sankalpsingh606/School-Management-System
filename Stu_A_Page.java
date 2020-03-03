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

public class Stu_A_Page extends JFrame {
public Stu_A_Page() {
	// TODO Auto-generated constructor stub
	setTitle("Student Attendence Page");
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

	JLabel jl1 = new JLabel(" Student Attendance | Mode: Adding ");
	jl1.setBounds(15, 5, 270, 20);
	jl1.setForeground(Color.blue);
	jl1.setFont(new Font("Arial", Font.BOLD, 15));
	jl1.setBorder(new LineBorder(Color.white));
	jp3.add(jl1);
	
	JPanel jp5 = new JPanel();
	jp5.setBackground(Color.WHITE);
	jp5.setBorder(new LineBorder(Color.black, 1));
	jp5.setLayout(null);
	jp5.setBounds(20, 30, 780, 175);
	jp3.add(jp5);
	
	JPanel jp6 = new JPanel();
	jp6.setBackground(Color.WHITE);
	jp6.setBorder(new LineBorder(Color.black, 1));
	jp6.setLayout(null);
	jp6.setBounds(20, 10, 150, 80);
	jp5.add(jp6);
	
	JLabel jl2 = new JLabel(" Select Student ");
	jl2.setFont(new Font("Arial", Font.PLAIN, 14));
	jl2.setBounds(20, 5, 100, 20);
	jp6.add(jl2);
	JTextField tf1 = new JTextField();
	tf1.setBounds(15, 35, 120, 20);
	tf1.setFont(new Font("Arial", Font.PLAIN, 15));
	jp6.add(tf1);

	JLabel jl3 = new JLabel(" Remarks ");
	jl3.setFont(new Font("Arial", Font.PLAIN, 14));
	jl3.setBounds(20,120, 100, 20);
	jp5.add(jl3);
	JTextField tf2 = new JTextField();
	tf2.setBounds(15, 150, 725, 20);
	tf2.setFont(new Font("Arial", Font.PLAIN, 15));
	jp5.add(tf2);
	
	JLabel jl4 = new JLabel(" Class ");
	jl4.setFont(new Font("Arial", Font.PLAIN, 14));
	jl4.setBounds(180,20, 100, 20);
	jp5.add(jl4);
	JTextField tf3 = new JTextField();
	tf3.setBounds(180, 50, 120, 20);
	tf3.setFont(new Font("Arial", Font.PLAIN, 15));
	jp5.add(tf3);

	JLabel jl5 = new JLabel(" Student Id ");
	jl5.setFont(new Font("Arial", Font.PLAIN, 14));
	jl5.setBounds(310,20, 100, 20);
	jp5.add(jl5);
	JTextField tf4 = new JTextField();
	tf4.setBounds(310, 50, 120, 20);
	tf4.setFont(new Font("Arial", Font.PLAIN, 15));
	jp5.add(tf4);

	JLabel jl6 = new JLabel(" Student Name ");
	jl6.setFont(new Font("Arial", Font.PLAIN, 14));
	jl6.setBounds(440,20, 100, 20);
	jp5.add(jl6);
	JTextField tf5 = new JTextField();
	tf5.setBounds(440, 50, 300, 20);
	tf5.setFont(new Font("Arial", Font.PLAIN, 15));
	jp5.add(tf5);

	JLabel jl7 = new JLabel(" Status ");
	jl7.setFont(new Font("Arial", Font.PLAIN, 14));
	jl7.setBounds(180,90, 100, 20);
	jp5.add(jl7);
	JTextField tf6 = new JTextField();
	tf6.setBounds(180, 120, 120, 20);
	tf6.setFont(new Font("Arial", Font.PLAIN, 15));
	jp5.add(tf6);

	JLabel jl8 = new JLabel(" Date ");
	jl8.setFont(new Font("Arial", Font.PLAIN, 14));
	jl8.setBounds(310,90, 100, 20);
	jp5.add(jl8);
	JDateChooser dateChooser = new JDateChooser();
	dateChooser.setBounds(310, 120, 120, 20);
	jp5.add(dateChooser);
	
	dateChooser.getCalendarButton().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});

	
	

	JLabel jl9 = new JLabel(" Time ");
	jl9.setFont(new Font("Arial", Font.PLAIN, 14));
	jl9.setBounds(440,90, 100, 20);
	jp5.add(jl9);
	JTextField tf8 = new JTextField();
	tf8.setBounds(440, 120, 100, 20);
	tf8.setFont(new Font("Arial", Font.PLAIN, 15));
	jp5.add(tf8);
	
	JRadioButton jrb1 = new JRadioButton("By Class");
	jrb1.setBackground(Color.white);
	jrb1.setBounds(830, 60, 80, 20);
	jp3.add(jrb1);
	JTextField tf9 = new JTextField();
	tf9.setBounds(830, 90, 100, 20);
	tf9.setBackground(Color.white);
	tf9.setFont(new Font("Arial", Font.PLAIN, 15));
	jp3.add(tf9);
	

	JRadioButton jrb2 = new JRadioButton("By Date");
	jrb2.setBackground(Color.white);
	jrb2.setBounds(960, 60, 80, 20);
	jp3.add(jrb2);
	JTextField tf10 = new JTextField();
	tf10.setBounds(960, 90, 100, 20);
	tf10.setFont(new Font("Arial", Font.PLAIN, 15));
	jp3.add(tf10);
	
	
	JRadioButton jrb3 = new JRadioButton("View All");
	jrb3.setBackground(Color.white);
	jrb3.setBounds(910, 180, 80, 20);
	jp3.add(jrb3);

	
	ButtonGroup gengp = new ButtonGroup();
	gengp.add(jrb1);
	gengp.add(jrb2);
	gengp.add(jrb3);
	
	JButton search = new JButton(" Search By Name ");
	search.setBackground(Color.yellow);
	search.setBounds(830, 130, 230, 40);
	jp3.add(search);

	

  	// JPanel3
	JPanel jp4 = new JPanel();
	jp4.setBackground(Color.white);
	jp4.setBorder(new LineBorder(Color.blue, 2));
	jp4.setLayout(null);
	jp4.setBounds(25, 310, 1080, 230);
	jp1.add(jp4);

		 JTable jt=new JTable();
	 jt.setBorder(new LineBorder(Color.blue,2));
	 jt.setBounds(17, 15, 1040, 200);
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
new Stu_A_Page();
	}

}
