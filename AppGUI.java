import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
/*
 * @author Usman Hasan
 * 
 * DOMAIN: Trip Calculator
 * Interface: Native GUI
 * Platform: Java
 * Language: Java
 * 
 * DESCRIPTION: This class creates the graphical user interface for the
 * Trip Calculator Application. It extends the class "TripCalculatorBrain"
 * for the purpose of all calling methods for computations and algorithm implementation.
 * The framework for this class was built primarily using "WindowBuilder"
 * with unique personal code being added as needed.
 *  
 */
public class AppGUI extends TripCalculatorBrain {
    
	protected JFrame frame;
	private JPanel panelBorder;
	
	//Example user items
	private JTextField personNameExample;
	private JTextField expensesExample;
	
	//"J"Items for the first user
	private JTextField personNameOne;
	private JTextField expensesOne;
	private JButton addExpensesOne;
	private JButton undoOne;
	
	//"J"Items for the second user
	private JTextField personNameTwo;
	private JTextField expensesTwo;
	private JButton addExpensesTwo;
	private JButton undoTwo;
	
	//"J"Items for the third user
	private JTextField personNameThree;
	private JTextField expensesThree;
	private JButton addExpensesThree;
	private JButton undoThree;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppGUI window = new AppGUI();
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
	public AppGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	protected void initialize() {
		
		//Initializes the frame
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 12));
		frame.getContentPane().setBackground(new Color(176, 196, 222));
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setBounds(100, 100, 600, 400);
		frame.setTitle("Trip Cost Calculator");
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Initializes the name example text-field
		personNameExample = new JTextField();
		personNameExample.setBounds(101, 42, 106, 21);
		personNameExample.setEditable(false);
		personNameExample.setForeground(new Color(192, 192, 192));
		personNameExample.setFont(personNameExample.getFont().deriveFont(personNameExample.getFont().getStyle() | Font.ITALIC));
		personNameExample.setText("Example Name");
		personNameExample.setColumns(10);
		frame.getContentPane().add(personNameExample);
		
		//Initializes the expenses example text-field
		expensesExample = new JTextField();
		expensesExample.setForeground(new Color(192, 192, 192));
		expensesExample.setBounds(225, 42, 106, 21);
		expensesExample.setEditable(false);
		expensesExample.setText("64.99");
		expensesExample.setFont(expensesExample.getFont().deriveFont(expensesExample.getFont().getStyle() | Font.ITALIC));
		expensesExample.setColumns(10);
		frame.getContentPane().add(expensesExample);
		
		//Initializes the first username text-field
		personNameOne = new JTextField();
		personNameOne.setBounds(101, 76, 106, 21);
		personNameOne.setFont(new Font("Tahoma", Font.PLAIN, 12));
		personNameOne.setColumns(10);
		frame.getContentPane().add(personNameOne);
		
		//Initializes the first user's expenses text-field
		expensesOne = new JTextField();
		expensesOne.setToolTipText("<html>\r\nEnter an expense in decimal format and omit the currency symbol<br>\r\n\r\ni.e. \"100.23\" not \"$100.23\"\r\n<html>");
		expensesOne.setEditable(false);
		expensesOne.setBounds(225, 76, 106, 21);
		expensesOne.setFont(new Font("Tahoma", Font.PLAIN, 12));
		expensesOne.setColumns(10);
		frame.getContentPane().add(expensesOne);
		
		//Initializes the first user's add expense button indicated as a "+" in the GUI
		addExpensesOne = new JButton("+");
		addExpensesOne.setToolTipText("Adds an expense for the appropriate person");
		addExpensesOne.setFont(new Font("Tahoma", Font.PLAIN, 12));
		addExpensesOne.setBounds(341, 76, 44, 21);
		frame.getContentPane().add(addExpensesOne);
		
		//Initializes the first user's undo button, removing the last expense added
		undoOne = new JButton("Undo");
		undoOne.setToolTipText("Removes the most recent expense added");
		undoOne.setFont(new Font("Tahoma", Font.PLAIN, 12));
		undoOne.setBounds(395, 76, 81, 21);
		frame.getContentPane().add(undoOne);
		
		//Initializes the second username text-field
		personNameTwo = new JTextField();
		personNameTwo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		personNameTwo.setColumns(10);
		personNameTwo.setBounds(101, 108, 106, 21);
		frame.getContentPane().add(personNameTwo);
		
		//Initializes the second user's expenses text-field
		expensesTwo = new JTextField();
		expensesTwo.setToolTipText("<html>\r\nEnter an expense in decimal format and omit the currency symbol<br>\r\n\r\ni.e. \"100.23\" not \"$100.23\"\r\n<html>");
		expensesTwo.setEditable(false);
		expensesTwo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		expensesTwo.setColumns(10);
		expensesTwo.setBounds(225, 108, 106, 21);
		frame.getContentPane().add(expensesTwo);
		
		//Initializes the second user's add expense button indicated as a "+" in the GUI
		addExpensesTwo = new JButton("+");
		addExpensesTwo.setToolTipText("Adds an expense for the appropriate person");
		addExpensesTwo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		addExpensesTwo.setBounds(341, 108, 44, 21);
		frame.getContentPane().add(addExpensesTwo);
		
		//Initializes the second user's undo button, removing the last expense added
		undoTwo = new JButton("Undo");
		undoTwo.setToolTipText("Removes the most recent expense added");
		undoTwo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		undoTwo.setBounds(395, 108, 81, 21);
		frame.getContentPane().add(undoTwo);
		
		//Initializes the third username text-field
		personNameThree = new JTextField();
		personNameThree.setFont(new Font("Tahoma", Font.PLAIN, 12));
		personNameThree.setColumns(10);
		personNameThree.setBounds(101, 139, 106, 21);
		frame.getContentPane().add(personNameThree);
		
		//Initializes the third user's expenses text-field
		expensesThree = new JTextField();
		expensesThree.setToolTipText("<html>\r\nEnter an expense in decimal format and omit the currency symbol<br>\r\n\r\ni.e. \"100.23\" not \"$100.23\"\r\n<html>");
		expensesThree.setEditable(false);
		expensesThree.setFont(new Font("Tahoma", Font.PLAIN, 12));
		expensesThree.setColumns(10);
		expensesThree.setBounds(225, 139, 106, 21);
		frame.getContentPane().add(expensesThree);
		
		//Initializes the third user's add expense button indicated as a "+" in the GUI
		addExpensesThree = new JButton("+");
		addExpensesThree.setToolTipText("Adds an expense for the appropriate person");
		addExpensesThree.setFont(new Font("Tahoma", Font.PLAIN, 12));
		addExpensesThree.setBounds(341, 139, 44, 21);
		frame.getContentPane().add(addExpensesThree);
		
		//Initializes the third user's undo button, removing the last expense added
		undoThree = new JButton("Undo");
		undoThree.setToolTipText("Removes the most recent expense added");
		undoThree.setFont(new Font("Tahoma", Font.PLAIN, 12));
		undoThree.setBounds(395, 139, 81, 21);
		frame.getContentPane().add(undoThree);
		
		//Initializes final calculation button/submission button
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(235, 171, 96, 23);
		btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frame.getContentPane().add(btnCalculate);
		
		//Border around the output dialog box to indicate that it is an output box
		panelBorder = new JPanel();
		panelBorder.setBackground(new Color(176, 196, 222));
		panelBorder.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Output", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(245, 245, 245)));
		panelBorder.setBounds(4, 198, 586, 162);
		frame.getContentPane().add(panelBorder);
		panelBorder.setLayout(null);
		
		//Initializes Text Pane within the GUI where application output is written
		JTextPane output = new JTextPane();
		output.setBounds(6, 16, 574, 155);
		panelBorder.add(output);
		output.setEditable(false);
		output.setBackground(new Color(255, 250, 250));
		
		//Places a label at the top of the GUI to increase clarity
		JLabel lblTripCostCalculator = new JLabel("Trip Cost Calculator");
		lblTripCostCalculator.setForeground(new Color(245, 245, 245));
		lblTripCostCalculator.setHorizontalAlignment(SwingConstants.CENTER);
		lblTripCostCalculator.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTripCostCalculator.setBounds(180, 11, 224, 14);
		frame.getContentPane().add(lblTripCostCalculator);
		
	////////////////////////////////////////	
	//Action Listeners for adding expenses//
	////////////////////////////////////////	
		
		//MouseListener for the first user's add expenses button
		addExpensesOne.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
				listOfExpensesForUserOne.add(Double.parseDouble(expensesOne.getText()));
				output.setText("");
				}
				
				catch(NumberFormatException x) {
					output.setText("Please enter a valid number");
				}
				
				expensesOne.setText("");
			}
		});
		
		//MouseListener for the second user's add expenses button
		addExpensesTwo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
				listOfExpensesForUserTwo.add(Double.parseDouble(expensesTwo.getText()));
				output.setText("");
				}
				
				catch(NumberFormatException x) {
					output.setText("Please enter a valid number");
				}
				
				expensesTwo.setText("");
			}
		});
		
		//MouseListener for the third user's add expenses button
		addExpensesThree.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
				listOfExpensesForUserThree.add(Double.parseDouble(expensesThree.getText()));
				output.setText("");
				}
				
				catch(NumberFormatException x) {
					output.setText("Please enter a valid number");
				}
				
				expensesThree.setText("");
			}
		});
		
	/////////////////////////////////////
	//Action Listeners for undo buttons//
	/////////////////////////////////////
		
		//MouseListener for undoing the most recent expense that was added for the first user
		undoOne.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {					
				try {
				output.setText("Removed the expense of " +nf.format(listOfExpensesForUserOne.get(listOfExpensesForUserOne.size()-1))+ " for " +personNameOne.getText());
				listOfExpensesForUserOne.remove(listOfExpensesForUserOne.size() -1);
			
				}
				catch(ArrayIndexOutOfBoundsException x) {
					output.setText("There is nothing to undo for user 1");
				}
			}
		});
		
		//MouseListener for undoing the most recent expense that was added for the second user
		undoTwo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
				output.setText("Removed the expense of " +nf.format(listOfExpensesForUserTwo.get(listOfExpensesForUserTwo.size()-1))+ " for " +personNameTwo.getText());
				listOfExpensesForUserTwo.remove(listOfExpensesForUserTwo.size()-1);
				}
				catch (ArrayIndexOutOfBoundsException x){
					output.setText("There is nothing to undo for user 2");
				}
			}
		});
		
		//MouseListener for undoing the most recent expense that was added for the third user
		undoThree.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
				output.setText("Removed the expense of " +nf.format(listOfExpensesForUserThree.get(listOfExpensesForUserThree.size()-1))+ " for " +personNameThree.getText());
				listOfExpensesForUserThree.remove(listOfExpensesForUserThree.size()-1);
				}
				catch (ArrayIndexOutOfBoundsException x) {
					output.setText("There is nothing to undo for user 3");
				}
			}
		});
		
	//////////////////////////////////////////////
	//Action Listeners for validating name input//
	//////////////////////////////////////////////	
		
		//Listener for validating name input before making the expenses field accessible for user 1
		expensesOne.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (personNameOne.getText().equals("")) {
					expensesOne.setEditable(false);
					output.setText("Enter a name for user 1 before entering expenses and try again");
				}
				else {
					expensesOne.setEditable(true);
				}
			}
		});
		
		//Listener for validating name input before making the expenses field accessible for user 2
		expensesTwo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (personNameTwo.getText().equals("")) {
					expensesTwo.setEditable(false);
					output.setText("Enter a name for user 2 before entering expenses and try again");
				}
				else {
					expensesTwo.setEditable(true);
				}
			}
		});
		
		//Listener for validating name input before making the expenses field accessible for user 3
		expensesThree.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (personNameThree.getText().equals("")) {
					expensesThree.setEditable(false);
					output.setText("Enter a name for user 3 before entering expenses and try again");
				}
				else {
					expensesThree.setEditable(true);
				}
			}
		});
		
	/////////////////////////////////////////
	//Action Listener for final calculation//
	/////////////////////////////////////////
		
		//MouseListener for running all method calls and calculations once user input is complete.
		btnCalculate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				//stores user names in parent class variable
				userNameOne = personNameOne.getText();
				userNameTwo = personNameTwo.getText();
				userNameThree = personNameThree.getText();
				
				//runs calculations for user's total expenses
				totalExpenseUserOne = calcTotal(listOfExpensesForUserOne);
				totalExpenseUserTwo = calcTotal(listOfExpensesForUserTwo);
				totalExpenseUserThree = calcTotal(listOfExpensesForUserThree);
				amountOwedByEach(totalExpenseUserOne, totalExpenseUserTwo, totalExpenseUserThree);
				moneyGoesTo(totalExpenseUserOne, totalExpenseUserTwo, totalExpenseUserThree);
				amountPaid(userNameOne, totalExpenseUserOne);
				amountPaid(userNameTwo, totalExpenseUserTwo);
				amountPaid(userNameThree, totalExpenseUserThree);
				
				try {
				output.setText(calculate());
				}
				
				catch(IllegalArgumentException e) {
					output.setText("You have not entered any data");
				}
			}
		});

		
	}
}
