import static org.junit.Assert.*;

import org.junit.Test;

/*
 * @author Usman Hasan
 * 
 * DOMAIN: Trip Calculator
 * Interface: Native GUI
 * Platform: Java
 * Language: Java
 * 
 * Description: Unit testing class using JUnit to test various functions within the TripCalculatorBrain class
 * 
 */

public class TripCalcTest {

	@Test
	public void test() {
		
		//creating an object of our calculator brain class
		TripCalculatorBrain tcb = new TripCalculatorBrain();
		
		//testing the function that gives you total user cost by adding their list of expenses stored in their ArrayList
		tcb.listOfExpensesForUserOne.add(40.0);
		tcb.listOfExpensesForUserOne.add(5.0);
		tcb.listOfExpensesForUserOne.add(6.5);
		Double testUserTotal = tcb.calcTotal(tcb.listOfExpensesForUserOne);
		
		//testing the function that checks for average cost per user
		tcb.amountOwedByEach(40.50, 52.53, 97.50);
		Double totalAverageCost = tcb.averageCostPerPerson;
		
		//testing the function that determines who paid the most and stores that in a hashmap
		tcb.userNameOne = "Usman";
		tcb.userNameTwo = "PersonWhoPaidTheMost";
		tcb.userNameThree = "Second Most Paid";
		tcb.moneyGoesTo(5.75, 70.0, 6.0);
		
		
		//////////////
		//ASSERTIONS//
		//////////////
				
		//assertions to validate output
		assertEquals("51.5", String.valueOf(testUserTotal));
		assertEquals("63.51", String.valueOf(totalAverageCost));
		
		//this test should fail because person two is not Usman
		assertNotEquals("Usman", tcb.determineWhoPays.get("Reciever"));
		
		//this test should succeed because person two is "PersonWhoPaidTheMost"
		assertEquals("PersonWhoPaidTheMost", tcb.determineWhoPays.get("Reciever"));
		
		
	}

}
