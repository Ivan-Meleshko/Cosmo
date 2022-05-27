package ru.skillfactory;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class ResultFrame extends JFrame {

	MyFrame myFrame;
	int value;
	
	public ResultFrame(int i)  {
		//this.frameOne = frameOne;
		setSize(1024,332);
		setTitle("SimpleQ");
		setResizable(false);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.value = i;
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(234,160));
		panel.setBackground(Color.yellow);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 60));
		
		JLabel label1 = new JLabel();
		Random rand = new Random();
		label1.setText("Number " + i + ": tribe is " + calculateTribe(i) + ", ascension is " + calculateAscensionTribe(i));
		
		label1.setBackground(new Color(162, 0, 255));
		label1.setOpaque(true);
		label1.setForeground(Color.black);
		label1.setFont(new Font("Consolas", Font.PLAIN, 28));
		label1.setBounds(0,0, 224, 156);
		panel.add(label1);
		add(panel, BorderLayout.CENTER);
		
		JPanel panel2 = new JPanel();
		panel2.setPreferredSize(new Dimension(322,188));
		panel2.setBackground(Color.yellow);
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 60));
		
		
		JButton exitbutton = new JButton();
		exitbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Terminated.");
				System.exit(0);
			}
			
		});
		exitbutton.setFocusable(false);
		exitbutton.setFont(new Font("Consolas", Font.ITALIC, 22));
		exitbutton.setForeground(Color.red);
		exitbutton.setBackground(Color.green);
		exitbutton.setPreferredSize(new Dimension(138, 84));
		exitbutton.setText("Exit");
		panel2.add(exitbutton);
		
		add(panel2, BorderLayout.SOUTH);
		
		setVisible(true);
	
		
	}
	
	
	public static String calculateTribe(int i) {
		int j = i % 7; // tribe
		switch (j) { 
			case 0: return "Sunday";
			
			case 1: return "Monday";
			
			case (2) : return "Tuesday";
			
			case (3) : return "Wednesday";
			
			case (4) : return "Thursday";
			
			case (5) : return "Friday";
			
			case (6) : return "Saturday";
			
			default: return "invalid data";
			
		}
	}
					
		
	public static String calculateAscensionTribe(int i) {
		int rankNumber = i / 7;
		int rankNumberSupport = i % 7;
		int ascension = rankNumber + 1;
		if (rankNumberSupport == 0) {
			ascension = rankNumber;
		}
		int ascensiontribe = ascension % 7;
		
		switch (ascensiontribe) {
		case (0) : return "Sunday";
		
		case (1) : return "Monday";
		
		case (2) : return "Tuesday";
		
		case (3) : return "Wednesday";
		
		case (4) : return "Thursday";
		
		case (5) : return "Friday";
		
		case (6) : return "Saturday";
		
		default: return "invalid data";
		
	}
		
	}
	
	
	
}