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

public class Classes_Page extends JFrame {
	public Classes_Page() {
		// TODO Auto-generated constructor stub
		setTitle("Class Page");
		setBounds(200, 150, 750, 550);

		// Panel1
		JPanel jp1 = new JPanel();
		jp1.setBackground(new Color(135, 206, 250));
		jp1.setLayout(null);
		jp1.setBounds(0, 2, 750, 548);
		add(jp1);

		JPanel jp2 = new JPanel();
		jp2.setBackground(Color.WHITE);
		jp2.setLayout(null);
		jp2.setBounds(0, 1, 750, 40);
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
		jp3.setBounds(25, 60, 680, 160);
		jp1.add(jp3);

		JLabel jl1 = new JLabel(" Class | Mode: Adding ");
		jl1.setBounds(15, 5, 270, 20);
		jl1.setForeground(Color.blue);
		jl1.setFont(new Font("Arial", Font.BOLD, 15));
		jl1.setBorder(new LineBorder(Color.white));
		jp3.add(jl1);
		
		JPanel jp5 = new JPanel();
		jp5.setBackground(Color.WHITE);
		jp5.setBorder(new LineBorder(Color.black, 1));
		jp5.setLayout(null);
		jp5.setBounds(40, 40, 600, 100);
		jp3.add(jp5);
		
		JLabel jl2 = new JLabel(" Class Name ");
		jl2.setFont(new Font("Arial", Font.BOLD, 20));
		jl2.setBounds(30,30, 150, 20);
		jp5.add(jl2);
		JTextField tf1 = new JTextField();
		tf1.setBounds(170, 30, 400, 30);
		tf1.setFont(new Font("Arial", Font.PLAIN, 15));
		jp5.add(tf1);

		

	  	// JPanel3
		JPanel jp4 = new JPanel();
		jp4.setBackground(Color.white);
		jp4.setBorder(new LineBorder(Color.blue, 2));
		jp4.setLayout(null);
		jp4.setBounds(25, 250, 680, 250);
		jp1.add(jp4);

			 JTable jt=new JTable();
		 jt.setBorder(new LineBorder(Color.blue,2));
		 jt.setBounds(17, 15, 645, 220);
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
		new Classes_Page();

	}


}
