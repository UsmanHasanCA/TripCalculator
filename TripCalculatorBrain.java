import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
/*
 * @author Usman Hasan
 * 
 * DOMAIN: Trip Calculator
 * Interface: Native GUI
 * Platform: Java
 * Language: Java
 * 
 * DESCRIPTION: This class holds the methods for the Trip Calculator application
 * It contains the data structures and algorithms for making the application work.
 *  
 */
public class TripCalculatorBrain {

	//ArrayList that holds expenses for each user
	protected ArrayList<Double> listOfExpensesForUserOne = new ArrayList<Double>();
	protected ArrayList<Double> listOfExpensesForUserTwo = new ArrayList<Double>();
	protected ArrayList<Double> listOfExpensesForUserThree = new ArrayList<Double>();
	
	//Map that holds information in regards to who is receiving/paying
	private HashMap<String, String> determineWhoPays = new HashMap<String, String>();
	
	//Map that holds information regarding the amount each user pays to equalize everyone's total expense
	private HashMap<String, Double> amountPaidByUser = new HashMap<String, Double>();
	
	//Number Format to round all decimals to the nearest hundredth to be accurate with currency
	protected NumberFormat nf = NumberFormat.getCurrencyInstance();
	
	//the average cost of the trip, how much each person pays
	protected Double averageCostPerPerson;
	private String finalOutput;
	
	//stores the total expenses for each user
	protected Double totalExpenseUserOne;
	protected Double totalExpenseUserTwo;									
	protected Double totalExpenseUserThree;		
	
	//stores the user's names
	protected String userNameOne;
	protected String userNameTwo;
	protected String userNameThree;
	
	
	//calculates the total for each user by finding the sum of their individual expenses
	public Double calcTotal(ArrayList<Double> list) {
		Double totalUser = 0.0;
		//iterates the array-list generated via user input and calculates the user's total expense
		for(int i = 0; i<list.size(); i++) {
			totalUser = totalUser + list.get(i);
		}
		return totalUser;
	}
	
	//find the average cost per person
	public void amountOwedByEach(Double a, Double b, Double c) {
		Double amountOwed = (a + b + c)/3;
		averageCostPerPerson = amountOwed;
	}
	
	//determines who will be getting money from others via comparisons
	public void moneyGoesTo(Double a, Double b, Double c) {
		
		//Compares double values(total cost for each user) and then stores them in an integer indicating the result of the comparison
		int retValA = Double.compare(a, b);
		int retValB = Double.compare(a, c);
		int retValC = Double.compare(b, c);
		
		//Using the assignment's given constraints, these comparisons check to see which of the 3 users paid more than the others
		if(retValA > 0 && retValB > 0) {
			determineWhoPays.put("Reciever", userNameOne);
			determineWhoPays.put("PayOne", userNameTwo);
			determineWhoPays.put("PayTwo", userNameThree);
		}
		else if(retValA < 0 && retValC > 0) {
			determineWhoPays.put("Reciever", userNameTwo);
			determineWhoPays.put("PayOne", userNameOne);
			determineWhoPays.put("PayTwo", userNameThree);
		}
		else if(retValB < 0 && retValC < 0) {
			determineWhoPays.put("Reciever", userNameThree);
			determineWhoPays.put("PayOne", userNameOne);
			determineWhoPays.put("PayTwo", userNameTwo);
		}
		else {
			determineWhoPays.put("Reciever", "equal");
		}
	}
	
	//determines the amount each user needs to pay to meet the average cost of the trip
	public void amountPaid(String s, Double a) {
		Double amount;
		if (averageCostPerPerson - a > 0) {
			amount = averageCostPerPerson - a;
		}
		else {
			amount = 0.0;
		}
		amountPaidByUser.put(s, amount);
	}
	
	//prints the final output showing how much money needs to be paid
	public String calculate() {
		
		if (determineWhoPays.get("Reciever").equals("equal")) {
			finalOutput = "Everyone paid equally, no one owes any money";
		}
		else {
			finalOutput = determineWhoPays.get("PayOne")+" pays " +nf.format(amountPaidByUser.get(determineWhoPays.get("PayOne"))) +" to "+ determineWhoPays.get("Reciever") +"\n"+ determineWhoPays.get("PayTwo")+" pays " +nf.format(amountPaidByUser.get(determineWhoPays.get("PayTwo")))+ " to "+determineWhoPays.get("Reciever");
		}
		return finalOutput;
	}
	
	
}
