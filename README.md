######### Note: this was a take home code-project as part of an interview for a Software Engineer position

# TripCalculator
A trip calculator for determining expense distribution for 3 people

# Prerequisites
The only prerequisite is installing a Java IDE.
This application was built using Eclipse IDE for Java.

# Setup

1. Simply download the AppGUI.java and TripCalculatorBrain.java files to your local drive

2. Place them within the same project on your preferred IDE

3. Run "AppGUI.java" as a Java Application and the application will compile, followed by the GUI appearing in the center of your screen.

# Testing

### Rules to keep in mind
1. Two users pay much less than any given third user. (these were the instructions given to me)

### Instructions

1. Once the application has booted up, you'll notice right below the title "Trip Cost Calculator", is an example row showing you the expected input.

2. Start by entering any names you would like in the 3 name fields. One at a time or all together, either way works, however the field for expenses will be disabled until a valid name is entered.

3. You'll notice that the field for expenses that was previously disabled will now be enabled when you click on it because you've entered in a value for name, so feel free to start by entering an expense.

4. Once you've entered an expense hit the "+" button to add it to that user's list of expenses. If you've added an expense in error, simply press the "undo" button and the most recently added expense will be removed followed by a message on screen confirming its removal.

5. Add as many expenses as you'd like for each user and once you're done hit the "Calculate" button to finalize your input. 

The application's design is fairly intuitive, however if you find yourself confused, hover any element and read its detailed tool-tip for clarification on what its been programmed to do.

### Example Test Case

#### Name      Expense


Louis       53.54

Carter      50.23

David       113.41

#### Expected Output:

Louis pays $18.85 to David

Carter pays $22.16 to David


## Unit Testing

Please see attached "TripCalcTest.java" file for unit testing done using JUnit. Simply add the file to the project where "AppGUI.java" and "TripCalculatorBrain.java" are located and then run it.

