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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;

public class Exam_Page extends JFrame {
public Exam_Page() {
	setTitle("Exam Page");
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
	JLabel jl1 = new JLabel(" Exams | Mode: Adding ");
	jl1.setBounds(15, 5, 270, 20);
	jl1.setForeground(Color.blue);
	jl1.setFont(new Font("Arial", Font.BOLD, 15));
	jl1.setBorder(new LineBorder(Color.white));
	jp3.add(jl1);
	
	JPanel jp5 = new JPanel();
	jp5.setBackground(Color.WHITE);
	jp5.setBorder(new LineBorder(Color.black, 1));
	jp5.setLayout(null);
	jp5.setBounds(20, 40, 1030, 160);
	jp3.add(jp5);
	
	JLabel jl3 = new JLabel(" Select Student ");
	jl3.setFont(new Font("Arial", Font.PLAIN, 14));
	jl3.setBounds(20,10, 100, 20);
	jp5.add(jl3);
	JTextField tf2 = new JTextField();
	tf2.setBounds(20, 40, 180, 20);
	tf2.setFont(new Font("Arial", Font.PLAIN, 15));
	jp5.add(tf2);
	
	JLabel jl4 = new JLabel("Exam Date");
	jl4.setFont(new Font("Arial", Font.PLAIN, 14));
	jl4.setBounds(220,10, 100, 20);
	jp5.add(jl4);
	JDateChooser dateChooser = new JDateChooser();
	dateChooser.setBounds(220, 40, 180, 20);
	jp5.add(dateChooser);

	dateChooser.getCalendarButton().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	

	
	JLabel jl5 = new JLabel("Exam Name");
	jl5.setFont(new Font("Arial", Font.PLAIN, 14));
	jl5.setBounds(420,10, 150, 20);
	jp5.add(jl5);
	JTextField tf4 = new JTextField();
	tf4.setBounds(420, 40, 180, 20);
	tf4.setFont(new Font("Arial", Font.PLAIN, 15));
	jp5.add(tf4);

	JLabel jl6 = new JLabel("Exam Results");
	jl6.setFont(new Font("Arial", Font.PLAIN, 14));
	jl6.setBounds(640,10, 100, 20);
	jp5.add(jl6);
	JTextArea jta = new JTextArea();
	jta.setBounds(640, 40, 370, 110);
	jta.setBorder(new LineBorder(Color.black, 1));
	jta.setFont(new Font("Arial", Font.PLAIN, 15));
	jp5.add(jta);
	
	JLabel jl7 = new JLabel(" Class ");
	jl7.setFont(new Font("Arial", Font.PLAIN, 14));
	jl7.setBounds(20,70, 100, 20);
	jp5.add(jl7);
	JTextField tf6 = new JTextField();
	tf6.setBounds(20, 100, 180, 20);
	tf6.setFont(new Font("Arial", Font.PLAIN, 15));
	jp5.add(tf6);

	JLabel jl8 = new JLabel(" Date ");
	jl8.setFont(new Font("Arial", Font.PLAIN, 14));
	jl8.setBounds(220,70, 100, 20);
	jp5.add(jl8);
	JDateChooser dateChooser2 = new JDateChooser();
	dateChooser2.setBounds(220, 100, 180, 20);
	jp5.add(dateChooser2);

	dateChooser2.getCalendarButton().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	

	JLabel jl9 = new JLabel("Subject Name");
	jl9.setFont(new Font("Arial", Font.PLAIN, 14));
	jl9.setBounds(420,70, 100, 20);
	jp5.add(jl9);
	JTextField tf8 = new JTextField();
	tf8.setBounds(420, 100, 180, 20);
	tf8.setFont(new Font("Arial", Font.PLAIN, 15));
	jp5.add(tf8);

	
		
	// ...........................................

	// JPanel3
	JPanel jp4 = new JPanel();
	jp4.setBackground(Color.white);
	jp4.setBorder(new LineBorder(Color.blue, 2));
	jp4.setLayout(null);
	jp4.setBounds(25, 310, 1080, 230);
	jp1.add(jp4);

	JButton search = new JButton(" Search By Subject Name ");
	search.setBackground(Color.yellow);
	search.setBounds(200, 10, 200, 30);
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
	
	JTextField tSel = new JTextField();
	tSel.setBounds(605, 10, 150, 20);
	tSel.setFont(new Font("Arial", Font.PLAIN, 15));
	jp4.add(tSel);


	 JTable jt=new JTable();
	 jt.setBorder(new LineBorder(Color.blue,2));
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
			new Exam_Page();

		}


}
