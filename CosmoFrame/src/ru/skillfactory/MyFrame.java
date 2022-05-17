package ru.skillfactory;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.AttributeSet.ColorAttribute;
import java.text.Format;
import java.text.NumberFormat;

public class MyFrame extends JFrame {
	
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JButton button1 = new JButton("Let's do this!");
	JButton button2 = new JButton("Exit");
	//JFormattedTextField numField;
	
	JTextField numField;
	String content;
	Integer c;
	
	//Format numberFormat;
	
	
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
		
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				content = (numField.getText());
				System.out.println("Button clicked. Examined content currently is '" + content + "'.");
				
			}	
			
		});
		
		
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Terminated.");
				System.exit(0);
				
			}
			
		});
		
		
		button2.setFocusable(false);
		button2.setFont(new Font("Monospaced", Font.ITALIC, 22));
		button2.setForeground(Color.red);
		button2.setBackground(Color.green);
		button2.setBorder(border2);
		button2.setPreferredSize(new Dimension( 150, 90));
		
		
		numField = new JTextField();
//		numField.addPropertyChangeListener("value", new PropertyChangeListener() {
//
//			@Override
//			public void propertyChange(PropertyChangeEvent evt) {
//				examinedNum = ((Number)numField.getValue()).intValue();
//				System.out.println("Property changed: the examined number is " + examinedNum);
//			}
//			
//		});
//		
//		numberFormat = NumberFormat.getInstance();

		numField.setPreferredSize(new Dimension(350, 60));
		numField.setFont(new Font("Consolas", Font.BOLD, 21));
		numField.setForeground(Color.black); // text color
		numField.setBackground(new Color(0x00ff00)); // background color
		numField.setCaretColor(Color.red); // caret color
		
		
		
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
		label1.setText("Hello, sir.");
		label1.setBackground(Color.pink);
		label1.setOpaque(true);
		label1.setForeground(Color.black);
		label1.setFont(new Font("Monospaced", Font.ITALIC, 18));
		label1.setBounds(0,0, 190,190);
		
		JLabel label3 = new JLabel();
		label3.setText("*Input field will be here*");
		label3.setBackground(Color.green);
		label3.setOpaque(true);
		label3.setForeground(Color.black);
		label3.setFont(new Font("Monospaced", Font.ITALIC, 32));
		label3.setBounds(0, 300, 190,190);

		
		JLabel label2 = new JLabel();
		label2.setText("The weather is good today!");
		label2.setBackground(Color.yellow);
		label2.setOpaque(true);
		label2.setForeground(Color.black);
		label2.setFont(new Font("Monospaced", Font.ITALIC, 32));
		label2.setBounds(0, 300, 190,190);
		
		panel.add(label1);
		panel.add(numField);
		panel.add(label2);
		
		panel2.add(button1);
		panel2.add(button2);
		
		add(panel, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
		
		
		setVisible(true);

		//ImageIcon image = new ImageIcon("flower.png");
		
	
	}

	
	
	
	

}
