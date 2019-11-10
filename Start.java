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

import java.awt.event.ActionEvent;



public class Start extends JFrame {



	private JPanel contentPane;



	/**

	 * Launch the application.

	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					Start frame = new Start();

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

		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		contentPane.setLayout(null);

		

		// adding jLabel

		

		JLabel lblSkills = new JLabel("Skills:");

		lblSkills.setBounds(0, 15, 53, 37);

		contentPane.add(lblSkills);

		

		// adding JCombo 1

		

		JComboBox comboBox = new JComboBox();

		comboBox.setBounds(54, 18, 130, 30);

		contentPane.add(comboBox);

		comboBox.addItem("Begineer");

		comboBox.addItem("Intermediate");

		comboBox.addItem("Advanced");

		

		//adding second label as subject

		

		JLabel lblSubject = new JLabel("Subject:");

		lblSubject.setBounds(0, 92, 64, 33);

		contentPane.add(lblSubject);

		

		//adding another jcomboc

		

		JComboBox comboBox_1 = new JComboBox();

		comboBox_1.setBounds(54, 90, 211, 37);

		contentPane.add(comboBox_1);

		comboBox_1.addItem("Programming Fundementals");

		comboBox_1.addItem("Object Oriented Programming");

		comboBox_1.addItem("Data Structures and Algorithms ");
		
		comboBox_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});



		

		//add begain button with action listener

		

		JButton btnBegain = new JButton("Begain");

		btnBegain.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(comboBox_1.getSelectedItem() == "Programming Fundementals") {
					new progFund("Programming Fundamentals Study");
				} else if(comboBox_1.getSelectedItem() == "Object Oriented Programming") {
					new objOrient("Object-Oriented Study");
				} else {
					new dataStruct("Data Structures Study");
				}
			}

		});

		btnBegain.setBounds(95, 194, 89, 23);

		contentPane.add(btnBegain);

		

		// adding reset button  with action lstener

		JButton btnReset = new JButton("Reset");

		btnReset.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {

			}

		});

		btnReset.setBounds(225, 194, 89, 23);

		contentPane.add(btnReset);

	}

}