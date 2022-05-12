package ru.skillfactory;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.AttributeSet.ColorAttribute;


public class MyFrame extends JFrame {
	
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JButton button1 = new JButton("Check number!");
	JButton button2 = new JButton("Exit");
	
	
	public MyFrame() {
		
		setSize(699, 437);
		setTitle("Planetary Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(new BorderLayout());
		
		Border border = BorderFactory.createLineBorder(Color.orange, 3);
		Border border2 = BorderFactory.createRaisedBevelBorder();
		
		button1.setFocusable(false);
		button1.setFont(new Font("Monospaced", Font.ITALIC, 22));
		button1.setForeground(Color.red);
		button1.setBackground(Color.green);
		button1.setBorder(border2);
		button1.setPreferredSize(new Dimension( 150, 90));
		
		button2.setFocusable(false);
		button2.setFont(new Font("Monospaced", Font.ITALIC, 22));
		button2.setForeground(Color.red);
		button2.setBackground(Color.green);
		button2.setBorder(border2);
		button2.setPreferredSize(new Dimension( 150, 90));
		
		panel.setPreferredSize(new Dimension(400,400));
		panel.setBackground(Color.darkGray);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));
		panel.setBorder(border);
		
		panel2.setPreferredSize(new Dimension(123,123));
		panel2.setBackground(Color.yellow);
		//panel2.setLayout(new FlowLayout(FlowLayout.LEADING, 7, 11));
		panel2.setLayout(new GridLayout(2,1,7,11));
		panel2.setBorder(border);
		
		JLabel label1 = new JLabel();
		label1.setText("Greeting. Enter the text.");
		label1.setBackground(Color.pink);
		label1.setOpaque(true);
		label1.setForeground(Color.black);
		label1.setFont(new Font("Monospaced", Font.ITALIC, 32));
		label1.setBounds(0,0, 190,190);
		
		JLabel label3 = new JLabel();
		label3.setText("*Input field will be here*");
		label3.setBackground(Color.green);
		label3.setOpaque(true);
		label3.setForeground(Color.black);
		label3.setFont(new Font("Monospaced", Font.ITALIC, 32));
		label3.setBounds(0, 300, 190,190);

		
		JLabel label2 = new JLabel();
		label2.setText("Result will be here");
		label2.setBackground(Color.yellow);
		label2.setOpaque(true);
		label2.setForeground(Color.black);
		label2.setFont(new Font("Monospaced", Font.ITALIC, 32));
		label2.setBounds(0, 300, 190,190);
		
		panel.add(label1);
		panel.add(label3);
		panel.add(label2);
		
		panel2.add(button1);
		panel2.add(button2);
		
		add(panel, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
		
		
		setVisible(true);

		//ImageIcon image = new ImageIcon("flower.png");
		
		
		
		
		
		
//	JLabel Top = new JLabel("Find out the number tribe. Enter the number.");
//	//Top.setText("Find out the number tribe. Enter the number.");
//	JTextField jtf = new JTextField("           ");
//	JPanel Panel = new JPanel();
//	
//	Panel.add(Top);
//	Panel.add(jtf);
//	add(Panel);
	
	}

	
	
	
	

}
