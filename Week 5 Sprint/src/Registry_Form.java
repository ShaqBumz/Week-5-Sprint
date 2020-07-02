import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registry_Form {

	private JFrame frame;
	private JTextField tfSname;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField tfSsurname;
	private JTextField tfSdob;
	private JTextField tfSgrade;
	private JTextField tfSgender;
	private JTextField tfPnce;
	private JTextField tfPaddress;
	private JTextField tfPcell;
	private JTextField tfPsurname;
	private JTextField tfPname;
	private JTextField tfID;
	private JLabel lblBackground;
	private JButton btnAdmin;
	private JButton btnDelete;
	private JButton btnSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registry_Form window = new Registry_Form();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registry_Form() {
		initialize();
	}

	/**
	 * Initialise the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 533, 497);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		tfSname = new JTextField();
		tfSname.setBounds(27, 178, 156, 20);
		frame.getContentPane().add(tfSname);
		tfSname.setColumns(10);

		lblNewLabel = new JLabel("Mzamomtsha Primary School");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(55, 11, 411, 29);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Registry Form");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(191, 51, 133, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		tfSsurname = new JTextField();
		tfSsurname.setBounds(27, 229, 156, 20);
		frame.getContentPane().add(tfSsurname);
		tfSsurname.setColumns(10);
		
		
		
		tfSdob = new JTextField();
		tfSdob.setBounds(27, 280, 156, 20);
		frame.getContentPane().add(tfSdob);
		tfSdob.setColumns(10);
		
		tfSgrade = new JTextField();
		tfSgrade.setBounds(27, 390, 156, 20);
		frame.getContentPane().add(tfSgrade);
		tfSgrade.setColumns(10);
		
		tfSgender = new JTextField();
		tfSgender.setBounds(27, 332, 156, 20);
		frame.getContentPane().add(tfSgender);
		tfSgender.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Student Grade");
		lblNewLabel_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(30, 363, 110, 21);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Student Gender");
		lblNewLabel_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(27, 311, 113, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Student DOB");
		lblNewLabel_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(27, 260, 113, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Student Surname");
		lblNewLabel_5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(27, 209, 126, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Student Name");
		lblNewLabel_6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(27, 158, 125, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		
		
		JButton btnNewButton = new JButton("SUBMIT.");
		
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		btnNewButton.setBounds(191, 383, 133, 29);
		frame.getContentPane().add(btnNewButton);
		
		tfPnce = new JTextField();
		tfPnce.setBounds(334, 390, 156, 20);
		frame.getContentPane().add(tfPnce);
		tfPnce.setColumns(10);
		
		tfPaddress = new JTextField();
		tfPaddress.setBounds(334, 332, 156, 20);
		frame.getContentPane().add(tfPaddress);
		tfPaddress.setColumns(10);
		
		tfPcell = new JTextField();
		tfPcell.setBounds(334, 280, 156, 20);
		frame.getContentPane().add(tfPcell);
		tfPcell.setColumns(10);
		
		tfPsurname = new JTextField();
		tfPsurname.setBounds(334, 229, 156, 20);
		frame.getContentPane().add(tfPsurname);
		tfPsurname.setColumns(10);
		
		tfPname = new JTextField();
		tfPname.setBounds(334, 178, 156, 20);
		frame.getContentPane().add(tfPname);
		tfPname.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Parent Cellphone");
		lblNewLabel_7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(334, 262, 126, 17);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Parent Surname");
		lblNewLabel_8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(334, 211, 132, 17);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Parent Name");
		lblNewLabel_9.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(334, 162, 132, 15);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Parent Address");
		lblNewLabel_10.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(334, 314, 132, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Number of Kids Enrolled");
		lblNewLabel_11.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblNewLabel_11.setBounds(334, 369, 173, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		tfID = new JTextField();
		tfID.setBounds(216, 112, 86, 20);
		frame.getContentPane().add(tfID);
		tfID.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("School ID");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblNewLabel_12.setBounds(216, 91, 86, 14);
		frame.getContentPane().add(lblNewLabel_12);
		
		
		btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			int Attempts = 0;
			public void actionPerformed(ActionEvent e) {
				
				
				int userAttempt = Integer.parseInt(JOptionPane.showInputDialog("Enter Our Favorite Number (1-10)"));
				
				if (userAttempt == 11) {
					
					btnDelete.setVisible(true);
				btnSearch.setVisible(true);
					
				}
				else {
					
					JOptionPane.showMessageDialog(null, "Incorrect Password!!");
					Attempts++;
					if (Attempts == 3) {
						
						btnAdmin.setVisible(false);
					}
					
	}
				
			}}
		);
		btnAdmin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdmin.setBounds(475, 16, 32, 29);
		frame.getContentPane().add(btnAdmin);
		
		btnDelete = new JButton("Delete Record");
		btnDelete.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnDelete.setBounds(27, 111, 140, 23);
		frame.getContentPane().add(btnDelete);
		btnDelete.setVisible(false);
		
		btnSearch = new JButton("Search Record");
		btnSearch.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnSearch.setBounds(350, 111, 140, 23);
		frame.getContentPane().add(btnSearch);
		btnSearch.setVisible(false);
		
		// Import ImageIcon
		lblBackground = new JLabel("");
		lblBackground.setBounds(0, 0, 517, 458);
		frame.getContentPane().add(lblBackground);
		ImageIcon iconBackground = new ImageIcon("Images/Background.jpg");
		lblBackground.setIcon(iconBackground);
		
		
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int option = Integer.parseInt(JOptionPane.showInputDialog("Would you like to remove a student or parent? [Type 1(Student) or 2(Parent)]"));
				int recordNum = Integer.parseInt(JOptionPane.showInputDialog("Please Enter School ID Of Record You Wish To Delete"));
				
				// Create a variable for the connection string.
				String connectionUrl = "jdbc:sqlserver://localhost:1433;"
						+ "databaseName= Mzamomtsha Primary School;integratedSecurity=true;";

				// Declare the JDBC Objects.
				Connection con = null;
				Statement stmt = null;

				if (option == 1) {
					
					try {
						// Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);
					

					
						
					
					// Create and execute an SQL statement that returns some data
					
					String SQLdelete = "DELETE FROM [dbo].[StudentDetail] WHERE SchoolID = '" + recordNum + "' ";
					

					stmt = con.createStatement();
					stmt.execute(SQLdelete);
					

					System.out.println("Record Was Successfully Deleted");

				}
					
				
				

			catch (Exception e1) {

				e1.printStackTrace();
			}
			}else {
				
				try {
					// Establish the connection.
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					con = DriverManager.getConnection(connectionUrl);
				

				
					
				
				// Create and execute an SQL statement that returns some data
				
				String SQLdelete = "DELETE FROM [dbo].[ParentDetails] WHERE SchoolID = '" + recordNum + "' ";
				

				stmt = con.createStatement();
				stmt.execute(SQLdelete);
				

				System.out.println("Record Was Successfully Deleted");

			}
				
			
			

		catch (Exception e1) {

			e1.printStackTrace();
		}
				
			}
				
			}}
		);
		
		
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int option = Integer.parseInt(JOptionPane.showInputDialog("Would you like to search for a student or parent? [Type 1(Student) or 2(Parent)]"));
				int search = Integer.parseInt(JOptionPane.showInputDialog("Please Enter SchoolID"));
				
				
				// Create a variable for the connection string.
				String connectionUrl = "jdbc:sqlserver://localhost:1433;"
						+ "databaseName= Mzamomtsha Primary School;integratedSecurity=true;";

				// Declare the JDBC Objects.
				Connection con = null;
				
				if (option==1) {
					
					try {
						// Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);
					
					
					
					// Create and execute an SQL statement that returns some data
					String SQLSearch = "SELECT * FROM [dbo].[StudentDetail] WHERE SchoolID = '" + search + "'";
					

					ResultSet rs = con.createStatement().executeQuery(SQLSearch);
			        while (rs.next()) {

			        	//insert Data into Text fields
			        	            String sName = rs.getString("stdName");
			        	            tfSname.setText(sName);

			        	            String sSurname = rs.getString("stdSurname");
			        	            tfSsurname.setText(sSurname);
			        	            
			        	            String sDOB = rs.getString("stdDOB");
			        	            tfSdob.setText(sDOB);
			        	            
			        	            String sGender = rs.getString("stdGender");
			        	            tfSgender.setText(sGender);
			        	            
			        	            String sGrade = rs.getString("stdGrade");
			        	            tfSgrade.setText(sGrade);
			        	            
			        	        }
			        	 
				}

				catch (Exception e1) {

					JOptionPane.showMessageDialog(null,"Record Was Not Found :{");
				}
					
				}else {
					
					try {
						// Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);
					
					
					
					// Create and execute an SQL statement that returns some data
					String SQLSearch = "SELECT * FROM [dbo].[ParentDetails] WHERE SchoolID = '" + search + "'";
					

					ResultSet rs = con.createStatement().executeQuery(SQLSearch);
			        while (rs.next()) {

			        	//insert Data into Text fields
			        	            String pName = rs.getString("prtName");
			        	            tfPname.setText(pName);

			        	            String pSurname = rs.getString("prtSurname");
			        	            tfPsurname.setText(pSurname);
			        	            
			        	            String pCell = rs.getString("prtCell");
			        	            tfPcell.setText(pCell);
			        	            
			        	            String pAddress = rs.getString("prtAddress");
			        	            tfPaddress.setText(pAddress);
			        	            
			        	            String pNCE = rs.getString("prtNCE");
			        	            tfPnce.setText(pNCE);
			        	            
			        	        }
			        	 
				}

				catch (Exception e1) {

					JOptionPane.showMessageDialog(null,"Record Was Not Found :{");
				}
					
				}
				

				
				
			}
		});
		
		
		

		

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// Create a variable for the connection string.
				String connectionUrl = "jdbc:sqlserver://localhost:1433;"
						+ "databaseName= Mzamomtsha Primary School;integratedSecurity=true;";

				// Declare the JDBC Objects.
				Connection con = null;
				Statement stmt = null;

				try {
					// Establish the connection.
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					con = DriverManager.getConnection(connectionUrl);
				
				String stdName = tfSname.getText();
				String stdSurname = tfSsurname.getText();
				String stdDob = tfSdob.getText();
				String stdGender = tfSgender.getText();
				String stdGrade = tfSgrade.getText();
				
				String prtName = tfPname.getText();
				String prtSurname = tfPsurname.getText();
				String prtCell = tfPcell.getText();
				String prtAddress = tfPaddress.getText();
				String prtNCE = tfPnce.getText();
				
				String SchoolID = tfID.getText();
				
				// Create and execute an SQL statement that returns some data
				String SQLstd = "INSERT INTO [dbo].[StudentDetail] ([stdName],[stdSurname],[stdDOB],[stdGender],[stdGrade],[SchoolID]) VALUES ('"
						+ stdName + "','" + stdSurname + "','" + stdDob + "'," + "'" + stdGender + "','" + stdGrade
						+ "','" + SchoolID + "')";
				String SQLprt = "INSERT INTO [dbo].[ParentDetails] ([prtName],[prtSurname],[prtCell],[prtAddress],[prtNCE], [SchoolID]) VALUES ('"
						+  prtName + "','" + prtSurname + "','" + prtCell + "','" + prtAddress + "'," + "'"
						+ prtNCE + "','" + SchoolID + "')";

				stmt = con.createStatement();
				stmt.execute(SQLstd);
				stmt.execute(SQLprt);

				System.out.println("Your Info Has Successfully Been Added");

			}

			catch (Exception e1) {

				e1.printStackTrace();
			}

		}
	});

		}
			
			}

