import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.math.BigDecimal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class FBCategoryTest {
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	
	@BeforeEach
	public void setUp() {
	    System.setOut(new PrintStream(outputStreamCaptor));
	}
	
	
	
	
	@AfterEach
	public void tearDown() {
	    System.setOut(standardOut);
	}
	
	
	
	@Test 
	public void DefaultConstructorTest() {
		// Create an instance of the class being tested
		FBCategory category = new FBCategory();
		
		//check if budget and spend are set to 0
		assertEquals(new BigDecimal("0.00") , category.CategoryBudget());
		assertEquals(new BigDecimal("0.00") , category.CategorySpend());
		
		// check if category name not null
		assertNotEquals(category.CategoryName(), "");
		
		FBCategory category2 = new FBCategory();
		
		assertNotEquals(category2.CategoryName(), category.CategoryName());
		
	}
	// TEST Failed because category names should be created uniquely and both categories created had same name
	//Test made by OMAR TAHER.
	
	@Test 
	public void MainConstructorTest() {
		//create name for category
		String categoryName = "Hello , Test , 123";
		// Create an instance of the class being tested
		FBCategory category = new FBCategory(categoryName);
		
		//check if budget and spend are set to 0
		assertEquals(new BigDecimal("0.00") , category.CategoryBudget());
		assertEquals(new BigDecimal("0.00") , category.CategorySpend());
		
		
		// check if category name was set correctly
		assertEquals(category.CategoryName(), categoryName);
	}
	//Test Pass
	//Test made by OMAR TAHER.
	
	
	@Test
    public void setCategoryNameTest() throws NoSuchFieldException, IllegalAccessException {
		// Create an instance of the class being tested
        FBCategory category = new FBCategory();
        // Set the input value for testing
        String newName = "newest Cat name";
        // (TEST FUNCTION BEING CALLED)Call set Category to set name = to newName
        category.setCategoryName(newName);
        
        
        
        //get Budget directly without the use of the getter in class
        Field field = category.getClass().getDeclaredField("CategoryName");
        field.setAccessible(true);
        
        //setting category name to unknown
        category.setCategoryName("Unknown Category");
        
        
        //checking if it was allowed to set to 'Unknown' or actual categoryname
        assertEquals("category name wasn't set correctly", field.get(category), newName);
    
    }
    //Test Failed because it was allowed to set to unknown category
	//TEST MADE BY OMAR TAHER.
	


	@Test
	public void CategoryNameTest() throws NoSuchFieldException, IllegalAccessException {
		// Create an instance of the class being tested
		FBCategory category = new FBCategory();
        
        // Set the input value for testing
        String newName = "newest name for category";
        
        //set Name directly without the use of the setter in class
		Field field = category.getClass().getDeclaredField("CategoryName");
		field.setAccessible(true);
		field.set(category, newName);
		
		//(TEST FUNCTION BEING CALLED) get category name
		String result = category.CategoryName();
		
		//compare the testFunctions return with what it was set to be
		assertEquals("category name wasn't retrieved properly", result, newName);
		
	}
	//Test Pass
	//TEST MADE BY ABDULAZIZ SARKHOH.


	@Test
    public void setCategoryBudgetTest() throws NoSuchFieldException, IllegalAccessException {
		// Create an instance of the class being tested
        final FBCategory category = new FBCategory();
        // Set the input value for testing
        BigDecimal newBudget = new BigDecimal("100.00");
        // (TEST FUNCTION BEING CALLED)Call set Category to set budget = to expected value
        category.setCategoryBudget(newBudget);
        
        //get Budget directly without the use of the getter in class
        final Field field = category.getClass().getDeclaredField("CategoryBudget");
        field.setAccessible(true);
        
        assertEquals("Budget wasn't set correctly", field.get(category), newBudget);
    }
	//Test Pass
	//TEST MADE BY ABDULAZIZ SARKHOH.
	
	
	@Test
	public void CategoryBudgetTest() throws NoSuchFieldException, IllegalAccessException {
		// Create an instance of the class being tested
		FBCategory category = new FBCategory();
        
        // Set the input value for testing
        BigDecimal newBudget = new BigDecimal("100.00");
        
        //set Budget directly without the use of the setter in class
		Field field = category.getClass().getDeclaredField("CategoryBudget");
		field.setAccessible(true);
		field.set(category, newBudget);
		
		//(TEST FUNCTION BEING CALLED) get category budget
		BigDecimal result = category.CategoryBudget();
		
		//compare the testFunctions return with what it was set to be
		assertEquals("budget wasn't retrieved properly", result, newBudget);
	}
	
	//Test Pass
	//TEST MADE BY ABDULAZIZ SARKHOH.
	
	
	
	
	@Test
	public void CategorySpendTest() throws NoSuchFieldException, IllegalAccessException {
		// Create an instance of the class being tested
		FBCategory category = new FBCategory();
        
        // Set the input value for testing
        BigDecimal newSpend = new BigDecimal("100.00");
        
        //set Spend directly without the use of the setter in class
		Field field = category.getClass().getDeclaredField("CategorySpend");
		field.setAccessible(true);
		field.set(category, newSpend);
		
		//(TEST FUNCTION BEING CALLED) get category Spend
		BigDecimal result = category.CategorySpend();
		
		//compare the testFunctions return with what it was set to be
		assertEquals("Spend wasn't retrieved properly", result, newSpend);
	}
	//Test Pass
	//TEST MADE BY ABDULAZIZ SARKHOH.
	
	

	
	@Test
	public void addExpenseTest() {
		// Create an instance of the class being tested
		FBCategory category = new FBCategory();
		
		// Add an expense 
		category.addExpense(new BigDecimal("100.00"));
		
		
		// create variable = previous spend
		BigDecimal previousSpend = category.CategorySpend();
		
		// create variable of the expense you want to add
        BigDecimal addingValue = new BigDecimal("100.01");

        // calling method to test : add the expense
        category.addExpense(addingValue);
        
        // check that expenses were added correctly
        assertEquals( previousSpend.add(addingValue), category.CategorySpend());
          
    }
	//Test Pass
	//TEST MADE BY ABDULAZIZ SARKHOH.


	@Test
	public void removeExpenseTest() throws NoSuchFieldException, IllegalAccessException{
		// Create an instance of the class being tested
		FBCategory category = new FBCategory();
		
		// create variable which will be the value of previous spend
		BigDecimal previousSpend = new BigDecimal("100.04");
		
		//set Spend directly since there is no setter for spend
		Field field = category.getClass().getDeclaredField("CategorySpend");
		field.setAccessible(true);
		field.set(category, previousSpend );
		
		
		// create variable of the expense you want to remove
        BigDecimal removingValue = new BigDecimal("5.0");

        // Call the method to test : remove expense
        category.removeExpense(removingValue);
        
        // check that expenses were removed correctly
        assertEquals( previousSpend.subtract(removingValue), category.CategorySpend());    
        
    }
	//Test Pass
	//TEST MADE BY ABDULAZIZ SARKHOH.

	
	@Test
	public void resetBudgetSpendTest() throws NoSuchFieldException, IllegalAccessException{
		// Create an instance of the class being tested
		FBCategory category = new FBCategory();
		
		// create variable which will be reset later
		BigDecimal previousSpend = new BigDecimal("100.04");
		
		//set Spend directly since there is no setter for spend ( so we can reset )
		Field field = category.getClass().getDeclaredField("CategorySpend");
		field.setAccessible(true);
		field.set(category, previousSpend );
		
		category.resetBudgetSpend();
		
		assertEquals( new BigDecimal("0.00"), category.CategorySpend());
		
	}
	//Test Pass
	//TEST MADE BY ABDULAZIZ SARKHOH.

	
	@Test
	public void getRemainingBudgetTest() throws NoSuchFieldException, IllegalAccessException {
		// Create an instance of the class being tested
		FBCategory category = new FBCategory();
				
		// create variable which will test later
		BigDecimal spend = new BigDecimal("100.00");
		BigDecimal budget = new BigDecimal("152.03");
		
		//set Spend directly since there is no setter for spend ( so we can reset )
		Field field = category.getClass().getDeclaredField("CategorySpend");
		field.setAccessible(true);
		field.set(category, spend );
		
		//set budget 
		category.setCategoryBudget(budget);
		
		BigDecimal remaining = budget.subtract(spend);
		BigDecimal testRemain = category.getRemainingBudget();
		
		assertEquals( "remaining budget bit working",remaining, testRemain);
	}
	//Test Pass
	//TEST MADE BY ABDULAZIZ SARKHOH.

	
	@Test
	public void toStringTest() throws NoSuchFieldException, IllegalAccessException{
		
		// Create an instance of the class being tested
		FBCategory category = new FBCategory();
				
		// create variable which will test later
		BigDecimal spend = new BigDecimal("100.00");
		BigDecimal budget = new BigDecimal("152.03");
		BigDecimal remaining = budget.subtract(spend);
		String catName = "newer cat name";
		
		//set Spend directly since there is no setter for spend ( so we can reset )
		Field field = category.getClass().getDeclaredField("CategorySpend");
		field.setAccessible(true);
		field.set(category, spend );
		
		//set budget 
		category.setCategoryBudget(budget);
		
		//set budget 
		category.setCategoryName(catName);
		
		
		
		String shouldOut = catName + "(£"+budget.toPlainString()+") - Est. £"+spend.toPlainString()+" (£"+remaining.toPlainString()+" remaining)";
		 
		System.out.print(category);
		assertEquals(shouldOut, outputStreamCaptor.toString()
			      .trim());
	
	
	}
	//Test Pass
	//TEST MADE BY ABDULAZIZ SARKHOH.
	

	

}
