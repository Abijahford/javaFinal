package PrototypeManager;

/**
 *@Description 
 *@Parameters
 *@PreCondition
 *@PostCondition
 *@THrows
 */

/**
 *@Description 
 *@Parameters
 *@PreCondition
 *@PostCondition
 *@THrows
 */
import java.awt.BorderLayout;

import java.awt.EventQueue;



import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;

import javax.swing.JComboBox;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;



public class Start extends JFrame {
	private static Start frame;
	/**

	 * Launch the application.

	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					frame = new Start();

					frame.setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

		});

	}



	/**

	 * Create the frame.

	 */

	public Start() {		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 450, 300);

		JPanel contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		contentPane.setLayout(null);

		

		// adding jLabel

		

		JLabel lblSkills = new JLabel("Skills:");

		lblSkills.setBounds(70, 15, 53, 37);

		contentPane.add(lblSkills);

		

		// adding JCombo 1

		

		JComboBox comboBox = new JComboBox();

		comboBox.setBounds(125, 18, 211, 37);

		contentPane.add(comboBox);

		comboBox.addItem("Beginner");

		comboBox.addItem("Intermediate");

		comboBox.addItem("Advanced");

		

		//adding second label as subject

		

		JLabel lblSubject = new JLabel("Subject:");

		lblSubject.setBounds(66, 92, 64, 33);

		contentPane.add(lblSubject);

		

		//adding another jcomboc

		

		JComboBox comboBox_1 = new JComboBox();

		comboBox_1.setBounds(125, 90, 211, 37);

		contentPane.add(comboBox_1);

		comboBox_1.addItem("Programming Fundamentals");

		comboBox_1.addItem("Object Oriented Programming");

		comboBox_1.addItem("Data Structures and Algorithms");
		
		comboBox_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});



		

		//add Begin button with action listener

		

		JButton btnBegin = new JButton("Begin");

		btnBegin.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				SwitchLevel.newGame(comboBox_1.getSelectedItem().toString(), comboBox.getSelectedItem().toString());
				btnBegin.setEnabled(false);
			}

		});

		btnBegin.setBounds(165, 194, 89, 23);

		contentPane.add(btnBegin);
	}
	
	public static void closeFrame() { // close previous frame and reset interface
		frame.setVisible(false);
		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					frame = new Start();

					frame.setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

		});
	}

}