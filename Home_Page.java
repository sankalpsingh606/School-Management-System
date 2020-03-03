package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Home_Page extends JFrame {

	public Home_Page() {
		// TODO Auto-generated constructor stub
		setSize(1325, 700);
		setLocation(20, 20);
		setLayout(null);
		//setDefaultCloseOperation(operation);
		// jpanel1
		JPanel jp1 = new JPanel();
		jp1.setBackground(Color.WHITE);
		jp1.setLayout(null);
		jp1.setBounds(0, 1, 1325, 130);
		add(jp1);

		JLabel jl1 = new JLabel("SoftSchool");
		jl1.setBounds(300, 20, 250, 50);
		jl1.setFont(new Font("Arial", Font.PLAIN, 50));
		jp1.add(jl1);

		JLabel jl2 = new JLabel("School Management System");
		jl2.setBounds(210, 75, 400, 50);
		jl2.setFont(new Font("Arial", Font.PLAIN, 30));
		jp1.add(jl2);

		ImageIcon i = new ImageIcon("C:\\Users\\a\\eclipse-workspace\\GUI\\src\\project\\pic\\pic1.png");
		JLabel jl3 = new JLabel(i);
		jl3.setBounds(900, 0, 250, 130);
		jp1.add(jl3);
		// ...................................................

		// JPanel2
		JPanel jp2 = new JPanel();
		jp2.setBackground(new Color(135, 206, 250));
		jp2.setLayout(null);
		jp2.setBounds(0, 132, 1325, 570);
		add(jp2);

		// ...................................................

		// JPanel3
		JPanel jp3 = new JPanel();
		jp3.setBackground(new Color(135, 206, 250));
		jp3.setLayout(null);
		jp3.setBounds(10, 50, 148, 448);
		jp3.setBorder(new LineBorder(Color.blue, 3, true));
		jp2.add(jp3);

		ImageIcon i2 = new ImageIcon("C:\\Users\\a\\eclipse-workspace\\GUI\\src\\project\\pic\\pic2.jpeg");
		JButton add_user = new JButton(i2);
		add_user.setBounds(15, 15, 102, 90);
		jp3.add(add_user);

		ImageIcon i3 = new ImageIcon("D:\\pic\\pic3.png");
		JButton about = new JButton(i3);
		about.setBounds(15, 125, 102, 90);
		jp3.add(about);

		ImageIcon i4 = new ImageIcon("C:\\Users\\a\\eclipse-workspace\\GUI\\src\\project\\pic\\pic4.jpeg");
		JButton logout = new JButton(i4);
		logout.setBounds(15, 235, 102, 90);
		jp3.add(logout);

		 ImageIcon i5=new ImageIcon("C:\\Users\\a\\eclipse-workspace\\GUI\\src\\project\\pic\\pic5.png");
		JButton close = new JButton(i5);
		close.setBounds(15, 345, 102, 90);
		jp3.add(close);

		// ....................................................

		// JPanel4
		JPanel jp4 = new JPanel();
		jp4.setBackground(Color.WHITE);
		jp4.setLayout(null);
		jp4.setBounds(190, 50, 1100, 450);
		jp4.setBorder(new LineBorder(Color.blue, 3, true));
		jp2.add(jp4);

		ImageIcon i7 = new ImageIcon("C:\\Users\\a\\eclipse-workspace\\GUI\\src\\project\\pic\\pic6.jpg");
		JButton student = new JButton(i7);
		student.setBounds(15, 15, 200, 130);
		jp4.add(student);

		JLabel jl4 = new JLabel("Students");
		jl4.setBounds(225, 40, 100, 50);
		jl4.setFont(new Font("Arial", Font.PLAIN, 17));
		jp4.add(jl4);

		ImageIcon i8 = new ImageIcon("C:\\Users\\a\\eclipse-workspace\\GUI\\src\\project\\pic\\pic7.png");
		JButton student_A = new JButton(i8);
		student_A.setBounds(335, 15, 200, 130);
		jp4.add(student_A);

		JLabel jl5 = new JLabel("Students Attendance");
		jl5.setBounds(545, 40, 155, 50);
		jl5.setFont(new Font("Arial", Font.PLAIN, 17));
		jp4.add(jl5);

		ImageIcon i9 = new ImageIcon("C:\\Users\\a\\eclipse-workspace\\GUI\\src\\project\\pic\\pic8.jpeg");
		JButton student_F = new JButton(i9);
		student_F.setBounds(730, 15, 200, 130);
		jp4.add(student_F);

		JLabel jl6 = new JLabel("Students Finance");
		jl6.setBounds(940, 40, 150, 50);
		jl6.setFont(new Font("Arial", Font.PLAIN, 17));
		jp4.add(jl6);

		ImageIcon i10 = new ImageIcon("C:\\Users\\a\\eclipse-workspace\\GUI\\src\\project\\pic\\pic9.jpeg");
		JButton emp = new JButton(i10);
		emp.setBounds(15, 160, 200, 130);
		jp4.add(emp);

		JLabel jl7 = new JLabel("Employees");
		jl7.setBounds(225, 190, 150, 50);
		jl7.setFont(new Font("Arial", Font.PLAIN, 17));
		jp4.add(jl7);

		ImageIcon i11 = new ImageIcon("C:\\Users\\a\\eclipse-workspace\\GUI\\src\\project\\pic\\pic10.jpeg");
		JButton emp_A = new JButton(i11);
		emp_A.setBounds(335, 160, 200, 130);
		jp4.add(emp_A);

		JLabel jl8 = new JLabel("Employees Attendance");
		jl8.setBounds(545, 190, 175, 50);
		jl8.setFont(new Font("Arial", Font.PLAIN, 17));
		jp4.add(jl8);

		ImageIcon i12 = new ImageIcon("C:\\Users\\a\\eclipse-workspace\\GUI\\src\\project\\pic\\pic11.png");
		JButton emp_F = new JButton(i12);
		 emp_F.setBounds(730, 160, 200, 130);
		 jp4.add(emp_F);

		JLabel jl11 = new JLabel("Employees Finance");
		jl11.setBounds(940, 190, 150, 50);
		jl11.setFont(new Font("Arial", Font.PLAIN, 17));
		jp4.add(jl11);

		ImageIcon i13 = new ImageIcon("C:\\Users\\a\\eclipse-workspace\\GUI\\src\\project\\pic\\pic12.jpeg");
		JButton cls = new JButton(i13);
		cls.setBounds(15, 305, 200, 130);
		jp4.add(cls);

		JLabel jl10 = new JLabel("Classes");
		jl10.setBounds(225, 330, 150, 50);
		jl10.setFont(new Font("Arial", Font.PLAIN, 17));
		jp4.add(jl10);

		 ImageIcon i14 = new ImageIcon("C:\\Users\\a\\eclipse-workspace\\GUI\\src\\project\\pic\\pic13.png");
		JButton sub = new JButton(i14);
		sub.setBounds(335, 305, 200, 130);
		jp4.add(sub);

		JLabel jl9 = new JLabel("Subject");
		jl9.setBounds(545, 330, 155, 50);
		jl9.setFont(new Font("Arial", Font.PLAIN, 17));
		jp4.add(jl9);

		 ImageIcon i15 = new ImageIcon("C:\\Users\\a\\eclipse-workspace\\GUI\\src\\project\\pic\\pic14.png");
		JButton exam = new JButton(i15);
		exam.setBounds(730, 305, 200, 130);
		jp4.add(exam);

		JLabel jl12 = new JLabel("Examinations");
		jl12.setBounds(940, 330, 150, 50);
		jl12.setFont(new Font("Arial", Font.PLAIN, 17));
		jp4.add(jl12);

		// ....................................................
		
		
		 add_user.addActionListener(new ActionListener () {
			 public void actionPerformed( ActionEvent e) {
				 User_Page up=new User_Page();
				
						
			 }
		 });
		 
		 student.addActionListener(new ActionListener () {
			 public void actionPerformed( ActionEvent e) {
				 Student_Page up=new Student_Page();
						
			 }
		 });

		 student_A.addActionListener(new ActionListener () {
			 public void actionPerformed( ActionEvent e) {
				 Stu_A_Page up=new Stu_A_Page();
						
			 }
		 });
		 
		 student_F.addActionListener(new ActionListener () {
			 public void actionPerformed( ActionEvent e) {
				 Stu_F_Page up=new Stu_F_Page();
						
			 }
		 });
		 
		 emp.addActionListener(new ActionListener () {
			 public void actionPerformed( ActionEvent e) {
				 Emp_Page up=new Emp_Page();
						
			 }
		 });

		 emp_A.addActionListener(new ActionListener () {
			 public void actionPerformed( ActionEvent e) {
				 Emp_A_Page up=new Emp_A_Page();
						
			 }
		 });
		 
		 emp_F.addActionListener(new ActionListener () {
			 public void actionPerformed( ActionEvent e) {
				 Emp_F_Page up=new Emp_F_Page();
						
			 }
		 });

		 cls.addActionListener(new ActionListener () {
			 public void actionPerformed( ActionEvent e) {
				 Classes_Page up=new Classes_Page();
						
			 }
		 });

		 sub.addActionListener(new ActionListener () {
			 public void actionPerformed( ActionEvent e) {
				 Subject up=new Subject();
						
			 }
		 });

		 exam.addActionListener(new ActionListener () {
			 public void actionPerformed( ActionEvent e) {
				
				 Exam_Page up=new Exam_Page();
						
			 }
		 });





		setTitle("Home Page");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Home_Page();
	}

}
