import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.Font;
import java.sql.Connection;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.SystemColor;



public class MainWindow {

	private JFrame frmQuinielero;
	private JComboBox comboBox;
	private JLabel lblPoolMode;
	private JButton btnCreate;
	private Connection dbcon = null;
	private JButton btnProfile;
	private JButton btnPools;
	private JButton btnHome;
	private PoolMode poolmode;
	private JLabel lblPoolSelected;
	private JLabel lblWarning;
	private JButton btnNewButton;
	//private JLabel lblInfo;
	private JTextArea lblInfo;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmQuinielero.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
		dbcon = sqliteConnection.dbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuinielero = new JFrame();
		frmQuinielero.setTitle("Quinielero");
		frmQuinielero.setBounds(100, 100, 657, 558);
		frmQuinielero.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmQuinielero.getContentPane().setLayout(null);
		
		btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				if (poolmode != null){
				 lblPoolMode.setVisible(false);
				 comboBox.setVisible(false);
				 btnCreate.setVisible(false);
				 lblPoolSelected.setText(poolmode.getDescription());
				 lblPoolSelected.setVisible(true);
				 
				 lblWarning.setText("Can't change your pool mode");
				 lblWarning.setVisible(true);
				 lblInfo.setVisible(false);
				 btnNewButton.setVisible(false);
				}
				 else {
					 lblPoolMode.setVisible(true);
					 comboBox.setVisible(true);
					 btnCreate.setVisible(true);
					 lblWarning.setVisible(true);
					 btnNewButton.setVisible(true);
				 }
					 
			}
		});
		btnHome.setBackground(Color.LIGHT_GRAY);
		btnHome.setBounds(65, 40, 140, 41);
		frmQuinielero.getContentPane().add(btnHome);
		
		btnPools = new JButton("POOLS");
		btnPools.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				 lblPoolMode.setVisible(false);
				 comboBox.setVisible(false);
				 btnCreate.setVisible(false);
				 lblPoolSelected.setVisible(false);
				 lblWarning.setVisible(false);
				 lblInfo.setVisible(false);
				 btnNewButton.setVisible(false);
			}
		});
		btnPools.setBackground(Color.LIGHT_GRAY);
		btnPools.setBounds(256, 40, 124, 41);
		frmQuinielero.getContentPane().add(btnPools);
		
		btnProfile = new JButton("PROFILE");
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 lblPoolMode.setVisible(false);
				 comboBox.setVisible(false);
				 btnCreate.setVisible(false);
				 lblPoolSelected.setVisible(false);
				 lblWarning.setVisible(false);
				 lblInfo.setVisible(false);
				 btnNewButton.setVisible(false);
				
			}
		});
		btnProfile.setBackground(Color.LIGHT_GRAY);
		btnProfile.setBounds(438, 40, 124, 41);
		frmQuinielero.getContentPane().add(btnProfile);

		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Regular", "Millionaire Goal", "Double", "Triple"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(97, 197, 160, 32);
		frmQuinielero.getContentPane().add(comboBox);

		lblPoolMode = new JLabel("Select your pool mode:");
		lblPoolMode.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPoolMode.setBounds(97, 162, 172, 24);
		frmQuinielero.getContentPane().add(lblPoolMode);
		
		btnCreate = new JButton("CREATE!");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				if (comboBox.getSelectedItem() != null)
					if ( comboBox.getSelectedItem().toString().equals("Double"))
						poolmode = new Double();

					else if ( comboBox.getSelectedItem().toString().equals("Millionaire Goal"))
						poolmode = new MillionaireGoal();

					else if ( comboBox.getSelectedItem().toString().equals("Triple"))
						poolmode = new Triple();

					else
						poolmode = new Regular();
				
				 System.out.println(poolmode.description);
				
				 lblPoolMode.setVisible(false);
				 comboBox.setVisible(false);
				 btnCreate.setVisible(false);
				 lblPoolSelected.setText(poolmode.getDescription());
				 lblPoolSelected.setVisible(true);
				 lblInfo.setVisible(false);
				 btnNewButton.setVisible(false);
				 
			}
		});
		
		btnCreate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCreate.setBounds(87, 425, 475, 54);
		frmQuinielero.getContentPane().add(btnCreate);
		
		lblPoolSelected = new JLabel("New label");
		lblPoolSelected.setIcon(new ImageIcon(MainWindow.class.getResource("/com/sun/javafx/scene/control/skin/modena/dialog-more-details@2x.png")));
		lblPoolSelected.setForeground(new Color(51, 102, 153));
		lblPoolSelected.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblPoolSelected.setBounds(166, 138, 337, 155);
		frmQuinielero.getContentPane().add(lblPoolSelected);
		
		lblWarning = new JLabel("New label");
		lblWarning.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWarning.setBounds(128, 402, 312, 54);
		frmQuinielero.getContentPane().add(lblWarning);
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (comboBox.getSelectedItem() != null)
					if ( comboBox.getSelectedItem().toString().equals("Double"))
						lblInfo.setText("Para aumentar tus posibilidades de ganar, puedes elegir 2 ó 3\n opciones de resultado en cada partido. \nPuedes elegir hasta 6 dobles y 3 triples.");

					else if ( comboBox.getSelectedItem().toString().equals("Millionaire Goal"))
						lblInfo.setText("Por $5 pesos más, participas en la modalidad \nde Gol Millonario, en la que tienes que atinarle al \nnúmero total de goles de los 12 partidos de la quiniela.");

					else if ( comboBox.getSelectedItem().toString().equals("Triple"))
						lblInfo.setText("Para aumentar tus posibilidades de ganar, \npuedes elegir 2 ó 3 opciones de resultado en cada partido. \nPuedes elegir hasta 6 dobles y 3 triples.");

					else if ( comboBox.getSelectedItem().toString().equals("Regular"))
						lblInfo.setText("Por sólo $15 pesos, \nrellena la casilla del equipo que crees que ganará en cada uno de \nlos 12 partidos de la quiniela o si será empate.");
				
				else 
					lblInfo.setText("Es la quiniela más fácil de ganar. \nPuedes participar en cuatro modalidades: Quiniela Regular, Doble, Triple y Millionaire Goal.");
				

				lblInfo.setVisible(true);
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(MainWindow.class.getResource("/javax/swing/plaf/metal/icons/Question.gif")));
		btnNewButton.setBounds(518, 308, 44, 41);
		frmQuinielero.getContentPane().add(btnNewButton);
	
		lblInfo = new JTextArea();
		lblInfo.setForeground(SystemColor.controlDkShadow);
		lblInfo.setFont(new Font("Monospaced", Font.ITALIC, 13));
		lblInfo.setBackground(SystemColor.control);
		lblInfo.setBounds(97, 275, 406, 110);
		frmQuinielero.getContentPane().add(lblInfo);
		lblInfo.setVisible(false);
		
		lblPoolSelected.setVisible(false);
		lblWarning.setVisible(false);
		
		

	}
}
