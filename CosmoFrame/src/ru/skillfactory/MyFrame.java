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
import java.util.Arrays;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	
	String content;

	public MyFrame() {
		setSize(1024, 578);
		setTitle("Planetary Calculator");
		setResizable(false);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(400, 200));
		panel.setBackground(Color.darkGray);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));

		JLabel label1 = new JLabel();
		label1.setText("Find out the planetary number of the nubmer:");
		label1.setBackground(Color.pink);
		label1.setOpaque(true);
		label1.setForeground(Color.black);
		label1.setFont(new Font("Consolas", Font.PLAIN, 23));
		label1.setBounds(0, 0, 100, 100);
		panel.add(label1);

		JTextField inputField = new JTextField(null);
		inputField.setPreferredSize(new Dimension(350, 60));
		inputField.setFont(new Font("Consolas", Font.BOLD, 21));
		inputField.setForeground(Color.black); // text color
		inputField.setBackground(Color.red); // background color
		inputField.setCaretColor(Color.red); // caret color
		panel.add(inputField);

		add(panel, BorderLayout.CENTER);

		JPanel panel2 = new JPanel();
		panel2.setPreferredSize(new Dimension(400, 300));
		panel2.setBackground(Color.darkGray);
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 78, 42));

		JButton button = new JButton();
		button.setFocusable(false);
		button.setFont(new Font("Monospaced", Font.ITALIC, 22));
		button.setForeground(Color.red);
		button.setBackground(Color.green);
		button.setPreferredSize(new Dimension(150, 90));
		button.setText("GO!");

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				content = inputField.getText();
				if (inputField.getText().length() < 1) {
					JOptionPane.showMessageDialog(null, "Please, enter the number", "Correction needed",
							JOptionPane.INFORMATION_MESSAGE);
				} else if (hasNumbers(content) == false) {
					inputField.setText(null);
					JOptionPane.showMessageDialog(null, "Please, enter some digits", "Correction needed",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					new ResultFrame(process(content));
				}
			}

		});
		panel2.add(button);

		JButton button2 = new JButton();
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
		button2.setPreferredSize(new Dimension(150, 90));
		button2.setText("Exit");
		panel2.add(button2);

		add(panel2, BorderLayout.SOUTH);

		setVisible(true);

	}

	public static boolean hasNumbers(String text) {
		char[] chars = text.toCharArray();
		boolean answer = false;
		for (char a : chars) {
			if (a == '0' || a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8'
					|| a == '9') {
				answer = true;
			} else {
				answer = false;
			}
		}
		return answer;

	}
	
	public static int process(String text) {
		char[] charArray = text.toCharArray();
		char[] numArray = new char[charArray.length];
		int counter = 0;
		for (char a: charArray) {
			if (a=='0' || a == '1' || a=='2' || a=='3' || a=='4' || a=='5' 
					|| a == '6' || a =='7' || a=='8' || a=='9') {
							numArray[counter] = a;
							counter++;
			} 
		}
		System.out.println(Arrays.toString(numArray));
		char[] numArrayFin = new char[counter];
		for (int i = 0; i < counter; i ++) {
			numArrayFin[i] = numArray[i];
		}
		System.out.println(Arrays.toString(numArrayFin));
		int number = Integer.parseInt(String.valueOf(numArrayFin));
		return number;
	}

}
