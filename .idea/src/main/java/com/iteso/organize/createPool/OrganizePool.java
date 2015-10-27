package com.iteso.organize.createPool;

import com.iteso.organize.datePicker.*;
import javax.swing.*;
import java.awt.*;
//import java.util.*;
import java.awt.event.*;
import java.util.Date;
import java.util.Locale;
import java.awt.EventQueue;

public class OrganizePool {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtMxn;
	private JTable table;
	
	
	
	JPanel home_page             = new JPanel();
	JPanel pools_menu            = new JPanel();
	JPanel league_and_matches    = new JPanel();
	JPanel participants_and_date = new JPanel();
	JPanel inviteUsers           = new JPanel();
	JPanel saveChanges           = new JPanel();
	JPanel changesSaved          = new JPanel();
	
	JButton btnHome      = new JButton("Home");
	JButton btnPools     = new JButton("Pools");
	JButton btnProfile   = new JButton("Profile");
	JLabel lblQuinielero = new JLabel("Quinielero");
	
	

	// Launch the application	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrganizePool window = new OrganizePool();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Create the application
	public OrganizePool() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 915, 693);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		initialize(1);
	}

	//Initialize the contents of the frame.
	private void initialize(int nextStep) {		
		
		
		home_page.removeAll(); 
		home_page.updateUI();
		
		home_page.setVisible(false);
		pools_menu.setVisible(false);
		league_and_matches.setVisible(false);
		participants_and_date.setVisible(false);		
		inviteUsers.setVisible(false);
		saveChanges.setVisible(false);
		changesSaved.setVisible(false);
		
		
		//////////////// INITIAL SETTINGS		
		btnHome.setBackground(Color.white);
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnHome.setBounds(76, 140, 137, 55);
		btnHome.setVisible(false);
		
		btnPools.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPools.setBackground(Color.white);
		btnPools.setBounds(393, 140, 137, 55);
		btnPools.setVisible(false);
		
		
		btnProfile.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnProfile.setBackground(Color.white);
		btnProfile.setBounds(671, 140, 137, 55);
		btnProfile.setVisible(false);
		
		
		lblQuinielero.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblQuinielero.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuinielero.setBounds(76, 28, 732, 70);
		lblQuinielero.setVisible(false);
		
		if(nextStep == 1) firstStep();
		if(nextStep == 2) secondStep();
		if(nextStep == 3) thirdStep();
		if(nextStep == 4) fourthStep();
		if(nextStep == 5) fifthStep();
		if(nextStep == 6) sixthStep();
		if(nextStep == 7) seventhStep();
	}
	
	private void firstStep(){	
		
		
		////// FIRST PANE
		frame.getContentPane().add(home_page, "name_933432195426976");		
		home_page.setLayout(null);
		
		home_page.setVisible(true);		
		btnHome.setVisible(true);				
		btnHome.setVisible(true);
		btnPools.setVisible(true);
		btnProfile.setVisible(true);
		lblQuinielero.setVisible(true);
		
		home_page.add(btnPools);
		home_page.add(btnHome);		
		home_page.add(btnProfile);		
		home_page.add(lblQuinielero);	
		
		btnPools.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				initialize(2);
			}
		});
		
	}
	
	private void secondStep(){		


		frame.getContentPane().add(home_page, "name_933432195426976");		
		home_page.setLayout(null);
		
		home_page.setVisible(true);		
		btnHome.setVisible(true);				
		btnHome.setVisible(true);
		btnPools.setVisible(true);
		btnProfile.setVisible(true);
		lblQuinielero.setVisible(true);
		
		home_page.add(btnPools);
		home_page.add(btnHome);		
		home_page.add(btnProfile);		
		home_page.add(lblQuinielero);	
		
		JButton btnViewPools = new JButton("View Pools");
		btnViewPools.setBackground(Color.LIGHT_GRAY);
		btnViewPools.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnViewPools.setBounds(355, 239, 207, 55);
		home_page.add(btnViewPools);
		
		JButton btnViewStats = new JButton("View Stats");
		btnViewStats.setBackground(Color.LIGHT_GRAY);
		btnViewStats.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnViewStats.setBounds(355, 305, 207, 55);
		home_page.add(btnViewStats);
		
		JButton btnOrganize = new JButton("Organize Pool");
		btnOrganize.setBackground(Color.LIGHT_GRAY);
		btnOrganize.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnOrganize.setBounds(355, 371, 207, 55);
		home_page.add(btnOrganize);
		
		JButton btnEditPool = new JButton("Edit Pool");
		btnEditPool.setBackground(Color.LIGHT_GRAY);
		btnEditPool.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEditPool.setBounds(355, 437, 207, 55);
		home_page.add(btnEditPool);
		
		JButton btnFaq = new JButton("FAQ");
		btnFaq.setBackground(Color.LIGHT_GRAY);
		btnFaq.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnFaq.setBounds(355, 503, 207, 55);
		home_page.add(btnFaq);
		
		btnOrganize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				initialize(3);
			}
		});		
	}	
	
	private void thirdStep(){			
		
		frame.getContentPane().add(home_page, "name_933432195426976");		
		home_page.setLayout(null);
		
		home_page.setVisible(true);		
		btnHome.setVisible(true);				
		btnHome.setVisible(true);
		btnPools.setVisible(true);
		btnProfile.setVisible(true);
		lblQuinielero.setVisible(true);
		
		home_page.add(btnPools);
		home_page.add(btnHome);		
		home_page.add(btnProfile);		
		home_page.add(lblQuinielero);	
		
		JRadioButton rdbtnUEFA = new JRadioButton("UEFA");
		rdbtnUEFA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnUEFA.setBounds(393, 297, 137, 49);
		
		JRadioButton rdbtnBundesLiga = new JRadioButton("Bundes Liga");
		rdbtnBundesLiga.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnBundesLiga.setBounds(393, 349, 137, 49);
		
		JRadioButton rdbtnMls = new JRadioButton("MLS");
		rdbtnMls.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnMls.setBounds(393, 401, 137, 49);
		
		JRadioButton rdbtnMundial = new JRadioButton("Mundial");
		rdbtnMundial.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnMundial.setBounds(393, 453, 137, 49);
		
		JRadioButton rdbtnPrimeraDivisinMexicana = new JRadioButton("Primera Divisi\u00F3n Mexicana");
		rdbtnPrimeraDivisinMexicana.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnPrimeraDivisinMexicana.setBounds(393, 505, 298, 49);
		
		JLabel lblNewLabel = new JLabel("League and Matches Options");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(363, 264, 254, 26);
		home_page.add(lblNewLabel);
		
		ButtonGroup leagueButtons = new ButtonGroup();
		leagueButtons.add(rdbtnUEFA);
		leagueButtons.add(rdbtnBundesLiga);
		leagueButtons.add(rdbtnMls);
		leagueButtons.add(rdbtnMundial);
		leagueButtons.add(rdbtnPrimeraDivisinMexicana);
		
		
		home_page.add(rdbtnUEFA);
		home_page.add(rdbtnBundesLiga);
		home_page.add(rdbtnMls);
		home_page.add(rdbtnMundial);
		home_page.add(rdbtnPrimeraDivisinMexicana);
		
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.setBackground(Color.LIGHT_GRAY);
		btnContinue.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnContinue.setBounds(370, 560, 150, 35);
		home_page.add(btnContinue);
		
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				if(leagueButtons.getSelection().equals(rdbtnUEFA.getModel())) {
					//////////// ADD SELECTION TO DATABASE 
					initialize(4);
					
					}
				if(leagueButtons.getSelection().equals(rdbtnBundesLiga.getModel())) {
					//////////// ADD SELECTION TO DATABASE 
					initialize(4);
					
					}
				if(leagueButtons.getSelection().equals(rdbtnMls.getModel())) {
					//////////// ADD SELECTION TO DATABASE 
					initialize(4);
					
					}
				if(leagueButtons.getSelection().equals(rdbtnMundial.getModel())) {
					//////////// ADD SELECTION TO DATABASE 
					initialize(4);
					
					}
				if(leagueButtons.getSelection().equals(rdbtnPrimeraDivisinMexicana.getModel())) {
					//////////// ADD SELECTION TO DATABASE 
					initialize(4);					
					}	
				}
		});	
	}
	
	private void fourthStep(){		
		
		//////// FOURTH PANE
		frame.getContentPane().add(home_page, "name_933432195426976");		
		home_page.setLayout(null);
		
		home_page.setVisible(true);		
		btnHome.setVisible(true);				
		btnHome.setVisible(true);
		btnPools.setVisible(true);
		btnProfile.setVisible(true);
		lblQuinielero.setVisible(true);
		
		home_page.add(btnPools);
		home_page.add(btnHome);		
		home_page.add(btnProfile);		
		home_page.add(lblQuinielero);	
		
		JLabel lblMinimumNumberOf = new JLabel("Minimum number of participants");
		lblMinimumNumberOf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMinimumNumberOf.setBounds(101, 274, 249, 29);
		home_page.add(lblMinimumNumberOf);
		
		JLabel lblMaximumNumberOf = new JLabel("Maximum number of participants");
		lblMaximumNumberOf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMaximumNumberOf.setBounds(101, 348, 249, 29);
		home_page.add(lblMaximumNumberOf);
		
		JLabel lblPoolsPrice = new JLabel("Pool's price");
		lblPoolsPrice.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPoolsPrice.setBounds(101, 418, 249, 29);
		home_page.add(lblPoolsPrice);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setText("10");
		textField.setBounds(378, 280, 86, 20);
		home_page.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setText("50");
		textField_1.setColumns(10);
		textField_1.setBounds(378, 354, 86, 20);
		home_page.add(textField_1);
		
		txtMxn = new JTextField();
		txtMxn.setText("150 Mxn");
		txtMxn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtMxn.setColumns(10);
		txtMxn.setBounds(378, 424, 86, 20);
		home_page.add(txtMxn);
		
		JLabel lblStartDate = new JLabel("Start Date");
		lblStartDate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStartDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblStartDate.setBounds(671, 274, 137, 29);
		home_page.add(lblStartDate);
		
		JButton btnCalendar = new JButton("Select Date");
		btnCalendar.setBackground(Color.LIGHT_GRAY);
		btnCalendar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCalendar.setBounds(671, 350, 150, 35);
		home_page.add(btnCalendar);



		ObservingTextField textField = new ObservingTextField();
		textField.setBounds(671, 300, 150, 35);
		
		
		btnCalendar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String lang = null;
				final Locale locale = getLocale(lang);
				DatePicker dp = new DatePicker(textField, locale);
				Date selectedDate = dp.parseDate(textField.getText());
				dp.setSelectedDate(selectedDate);
				dp.start(textField);
			}
		});
		
		home_page.add(textField);
		
				
		JButton btnContinue = new JButton("Continue");
		btnContinue.setBackground(Color.LIGHT_GRAY);
		btnContinue.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnContinue.setBounds(370, 560, 150, 35);
		home_page.add(btnContinue);
		
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				initialize(5);
			}
		});		
	}
	
	private Locale getLocale(String loc){
		if(loc != null && loc.length()>0) return new Locale(loc);
		else return Locale.US;
		
	}
	
	
	private void fifthStep(){		
		
		///////////FIFTH PANE
		frame.getContentPane().add(home_page, "name_933432195426976");		
		home_page.setLayout(null);
		
		home_page.setVisible(true);		
		btnHome.setVisible(true);				
		btnHome.setVisible(true);
		btnPools.setVisible(true);
		btnProfile.setVisible(true);
		lblQuinielero.setVisible(true);
		
		home_page.add(btnPools);
		home_page.add(btnHome);		
		home_page.add(btnProfile);		
		home_page.add(lblQuinielero);
		
		JButton btnNo = new JButton("No");
		btnNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNo.setBounds(298, 347, 125, 45);
		home_page.add(btnNo);
		
		JButton btnYes = new JButton("Yes");
		btnYes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnYes.setBounds(459, 347, 125, 45);
		home_page.add(btnYes);
		
		JTextArea txtrWouldYouLike = new JTextArea();
		txtrWouldYouLike.setText("Would you like to invite people to the pool right now?");
		txtrWouldYouLike.setBounds(229, 294, 451, 32);
		home_page.add(txtrWouldYouLike);
		
		
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				initialize(6);
			}
		});
		
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				initialize(6);
			}
		});
	}	
	
	private void sixthStep(){		
		
		////////// SIXTH PANE
		frame.getContentPane().add(home_page, "name_933432195426976");		
		home_page.setLayout(null);
		
		home_page.setVisible(true);		
		btnHome.setVisible(true);				
		btnHome.setVisible(true);
		btnPools.setVisible(true);
		btnProfile.setVisible(true);
		lblQuinielero.setVisible(true);
		
		home_page.add(btnPools);
		home_page.add(btnHome);		
		home_page.add(btnProfile);		
		home_page.add(lblQuinielero);
		
		JButton btnNo = new JButton("No");
		btnNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNo.setBounds(298, 347, 125, 45);
		home_page.add(btnNo);
		
		JButton btnYes = new JButton("Yes");
		btnYes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnYes.setBounds(459, 347, 125, 45);
		home_page.add(btnYes);
		
		JTextArea txtrWouldYouLike_1 = new JTextArea();
		txtrWouldYouLike_1.setText("Would you like to save the pool's configuration?");
		txtrWouldYouLike_1.setBounds(241, 294, 400, 32);
		home_page.add(txtrWouldYouLike_1);
		
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				initialize(7);
			}
		});
		
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				initialize(7);
			}
		});
	
	}
	
	private void seventhStep(){
		
		/////////////////// SEVENTH PANE
		frame.getContentPane().add(home_page, "name_933432195426976");		
		home_page.setLayout(null);
		
		home_page.setVisible(true);		
		btnHome.setVisible(true);				
		btnHome.setVisible(true);
		btnPools.setVisible(true);
		btnProfile.setVisible(true);
		lblQuinielero.setVisible(true);
		
		home_page.add(btnPools);
		home_page.add(btnHome);		
		home_page.add(btnProfile);		
		home_page.add(lblQuinielero);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnOk.setBounds(393, 351, 125, 45);
		home_page.add(btnOk);
		
		JTextArea txtrThePoolsConfiguration = new JTextArea();
		txtrThePoolsConfiguration.setText("The pool's configuration had been saved");
		txtrThePoolsConfiguration.setBounds(281, 304, 327, 32);
		home_page.add(txtrThePoolsConfiguration);
		
		
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				initialize(1);
			}
		});
		
	}
	
	
}
