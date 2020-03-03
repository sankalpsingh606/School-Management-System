package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;

public class Emp_F_Page extends JFrame {
	public Emp_F_Page() {
		setTitle("Employee Finance Page");
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
		JLabel jl1 = new JLabel(" Employee Finance | Mode: Adding ");
		jl1.setBounds(15, 5, 270, 20);
		jl1.setForeground(Color.blue);
		jl1.setFont(new Font("Arial", Font.BOLD, 15));
		jl1.setBorder(new LineBorder(Color.white));
		jp3.add(jl1);

		JPanel jp6 = new JPanel();
		jp6.setBackground(Color.WHITE);
		jp6.setBorder(new LineBorder(Color.black, 1));
		jp6.setLayout(null);
		jp6.setBounds(20, 50, 150, 70);
		jp3.add(jp6);

		JLabel jl2 = new JLabel(" Select Student ");
		jl2.setFont(new Font("Arial", Font.PLAIN, 14));
		jl2.setBounds(20, 5, 100, 20);
		jp6.add(jl2);
		JTextField tf1 = new JTextField();
		tf1.setBounds(15, 35, 120, 20);
		tf1.setFont(new Font("Arial", Font.PLAIN, 15));
		jp6.add(tf1);

		JPanel jp5 = new JPanel();
		jp5.setBackground(Color.WHITE);
		jp5.setBorder(new LineBorder(Color.black, 1));
		jp5.setLayout(null);
		jp5.setBounds(200, 50, 850, 150);
		jp3.add(jp5);

		JLabel emp_id = new JLabel(" Employee Id ");
		emp_id.setFont(new Font("Arial", Font.PLAIN, 14));
		emp_id.setBounds(10, 20, 100, 20);
		jp5.add(emp_id);
		JTextField t_id = new JTextField();
		t_id.setBounds(10, 50, 200, 20);
		t_id.setFont(new Font("Arial", Font.PLAIN, 15));
		jp5.add(t_id);

		JLabel jl3 = new JLabel(" Employee Name ");
		jl3.setFont(new Font("Arial", Font.PLAIN, 14));
		jl3.setBounds(230, 20, 180, 20);
		jp5.add(jl3);
		JTextField tf2 = new JTextField();
		tf2.setBounds(230, 50, 260, 20);
		tf2.setFont(new Font("Arial", Font.PLAIN, 15));
		jp5.add(tf2);

		JLabel jl4 = new JLabel(" Employee Name ");
		jl4.setFont(new Font("Arial", Font.PLAIN, 14));
		jl4.setBounds(510, 20, 100, 20);
		jp5.add(jl4);
		JTextField tf3 = new JTextField();
		tf3.setBounds(510, 50, 320, 20);
		tf3.setFont(new Font("Arial", Font.PLAIN, 15));
		jp5.add(tf3);

		JButton emp = new JButton(" Employee List ");
		emp.setBackground(Color.BLUE);
		emp.setBounds(700, 20, 130, 28);
		jp5.add(emp);

		JLabel jl5 = new JLabel(" Dates ");
		jl5.setFont(new Font("Arial", Font.PLAIN, 14));
		jl5.setBounds(10, 80, 160, 20);
		jp5.add(jl5);
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(10, 110, 160, 30);
		jp5.add(dateChooser);

		dateChooser.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JLabel jl6 = new JLabel(" Amount Paid ");
		jl6.setFont(new Font("Arial", Font.PLAIN, 14));
		jl6.setBounds(190, 80, 100, 20);
		jp5.add(jl6);
		JTextField tf5 = new JTextField();
		tf5.setBounds(190, 110, 240, 20);
		tf5.setFont(new Font("Arial", Font.PLAIN, 15));
		jp5.add(tf5);

		JLabel jl7 = new JLabel(" Description ");
		jl7.setFont(new Font("Arial", Font.PLAIN, 14));
		jl7.setBounds(450, 80, 100, 20);
		jp5.add(jl7);
		JTextField tf6 = new JTextField();
		tf6.setBounds(450, 110, 380, 20);
		tf6.setFont(new Font("Arial", Font.PLAIN, 15));
		jp5.add(tf6);

		/*
		 * JLabel jl8 = new JLabel("Addmision Fee."); jl8.setFont(new Font("Arial",
		 * Font.PLAIN, 14)); jl8.setBounds(5, 30, 160, 20); jp5.add(jl8); JTextField tf7
		 * = new JTextField(); tf7.setBounds(5, 55, 160, 20); tf7.setFont(new
		 * Font("Arial", Font.PLAIN, 15)); jp5.add(tf7);
		 * 
		 * JLabel jl9 = new JLabel("Monthly Fee."); jl9.setFont(new Font("Arial",
		 * Font.PLAIN, 14)); jl9.setBounds(175,30, 160, 20); jp5.add(jl9); JTextField
		 * tf8 = new JTextField(); tf8.setBounds(175, 55, 160, 20); tf8.setFont(new
		 * Font("Arial", Font.PLAIN, 15)); jp5.add(tf8);
		 * 
		 * JLabel jl10 = new JLabel("Libiary Fee."); jl10.setFont(new Font("Arial",
		 * Font.PLAIN, 14)); jl10.setBounds(345, 30, 160, 20); jp5.add(jl10); JTextField
		 * tf9 = new JTextField(); tf9.setBounds(345, 55, 160, 20); tf9.setFont(new
		 * Font("Arial", Font.PLAIN, 15)); jp5.add(tf9);
		 * 
		 * JLabel jl11 = new JLabel("Exam Fee."); jl11.setFont(new Font("Arial",
		 * Font.PLAIN, 14)); jl11.setBounds(515, 30, 160, 20); jp5.add(jl11); JTextField
		 * tf10 = new JTextField(); tf10.setBounds(515, 55, 160, 20); tf10.setFont(new
		 * Font("Arial", Font.PLAIN, 15)); jp5.add(tf10);
		 * 
		 * JLabel jl12 = new JLabel("Other Fee."); jl12.setFont(new Font("Arial",
		 * Font.PLAIN, 14)); jl12.setBounds(685, 30, 160, 20); jp5.add(jl12); JTextField
		 * tf11 = new JTextField(); tf11.setBounds(685, 55, 160, 20); tf11.setFont(new
		 * Font("Arial", Font.PLAIN, 15)); jp5.add(tf11);
		 * 
		 * JLabel jl13 = new JLabel("Fee Structure"); jl13.setFont(new Font("Arial",
		 * Font.BOLD, 14)); jl13.setBounds(10, 5, 160, 15); jp5.add(jl13);
		 * 
		 */

		// ...........................................

		// JPanel3
		JPanel jp4 = new JPanel();
		jp4.setBackground(Color.white);
		jp4.setBorder(new LineBorder(Color.blue, 2));
		jp4.setLayout(null);
		jp4.setBounds(25, 310, 1080, 230);
		jp1.add(jp4);

		JButton search = new JButton(" Search By Name ");
		search.setBackground(Color.yellow);
		search.setBounds(310, 10, 90, 30);
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
		new Emp_F_Page();

	}

}
