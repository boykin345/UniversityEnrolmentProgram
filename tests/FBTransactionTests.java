package Classes;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.After;
import org.junit.Test;

public class FBTransactionTests {

	@After
	public void tearDownAfterClass() throws Exception {
	}

	@Test
	public void transactionNameTest() {
		FBTransaction obj = new FBTransaction();
		
		obj.setTransactionName("Bill#");
		assertEquals("Bill#", obj.transactionName());
		// test passed
		// Made by Mikhail Kolyakin
		
	}

	@Test
	public void transactionName25SymbolsTest() {
		FBTransaction obj = new FBTransaction();
		
		obj.setTransactionName("LLLLLLLLLLLLLLLLLLLLLLLLLLLLL");
		assertEquals("LLLLLLLLLLLLLLLLLLLLLLLLLLLLL", obj.transactionName());
		// test failed successfully
		// Made by Mikhail Kolyakin
		
	}

	@Test
	public void transactionCategoryTest() {
		FBTransaction obj = new FBTransaction();
		obj.setTransactionCategory(-1);
		assertEquals(-1, obj.transactionCategory());
		// Test failed as needed
		// Made by Mikhail Kolyakin
	}

	@Test
	public void transactionValueTest() {
		FBTransaction obj = new FBTransaction();
		obj.setTransactionValue(new BigDecimal("0.001"));
		assertEquals(new BigDecimal("0.001"), obj.transactionValue());
		// test passed, but it must be failed
		// Made by Mikhail Kolyakin
	}

	@Test
	public void transactionTimeTest() {
		FBTransaction obj = new FBTransaction();
		obj.setTransactionTime(new Date(12, 1, 29));
		assertEquals(new Date(12, 1, 29), obj.transactionTime());
		// test passed
		// Made by Mikhail Kolyakin
	}

	@Test
	public void transactiontoString() {
		FBTransaction obj = new FBTransaction();
		obj.setTransactionName("Bill");
		obj.setTransactionValue(new BigDecimal("0.01"));
		obj.toString();
		assertEquals("Bill - £0.01", obj.toString());
		// test passed
		// Made by Mikhail Kolyakin
	}

	public void transactionConstructor() {
		FBTransaction obj = new FBTransaction("Bill", new BigDecimal("0.01"),2);
		// Probably, it's just impossible to enter only two attributes
		// Made by Mikhail Kolyakin
	}
}
