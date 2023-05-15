import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;



public class FBCategoryTest {

	@Test
	public void setCategoryBudgetTest() {
		// Create an instance of the class being tested
		FBCategory category = new FBCategory();

        // Set the input value for testing
        BigDecimal expectedValue = new BigDecimal("100.01");

        // Call the method under test
        category.setCategoryBudget(expectedValue);

        // Verify the expected result
        assertEquals(expectedValue , category.CategoryBudget());
        
        
    }
    //test passed.
    //test made by abdulaziz.
	
	@Test
	public void addExpenseTest() {
		// Create an instance of the class being tested
		FBCategory category = new FBCategory();
		
		category.addExpense(new BigDecimal("100.00"));
		
		BigDecimal previousSpend = category.CategorySpend();
		
        BigDecimal addingValue = new BigDecimal("100.01");

        // Call the method under test
        category.addExpense(addingValue);
        
        // Verify the expected result
        assertEquals( previousSpend.add(addingValue), category.CategorySpend());
        
        
    }
	//test passed
    //test made by abdulaziz
	
	@Test
	public void removeExpenseTest() {
		// Create an instance of the class being tested
		FBCategory category = new FBCategory();
		
		category.addExpense(new BigDecimal("100.00"));
		
		BigDecimal previousSpend = category.CategorySpend();
		
        BigDecimal removingValue = new BigDecimal("5");

        // Call the method under test
        category.removeExpense(removingValue);
        
        // Verify the expected result
        assertEquals( previousSpend.subtract(removingValue), category.CategorySpend());    
        
    }
	//test passed   
    //test made by abdulaziz
		
	
}