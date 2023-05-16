package Classes;
import java.math.BigDecimal;
import java.util.Date;

public class FBTransaction {
	String transactionName;
	private BigDecimal transactionValue;
	private int transactionCategory;
	private Date transactionTime;


	public FBTransaction() {
		transactionName = null;
		transactionValue = null;
		transactionCategory = 0;
		transactionTime = null;
	}

	public FBTransaction(String tName, BigDecimal tValue, int tCat) {
		transactionName = tName;
		transactionValue = tValue;
		transactionCategory = tCat;
		transactionTime = new Date();
	}



	public String transactionName() {
		return transactionName;
	}

	public BigDecimal transactionValue() {
		return transactionValue;
	}
	
	public int transactionCategory() {
		return transactionCategory;
	}

	public Date transactionTime() {
		return transactionTime;
	}

	public void setTransactionName(String tName) {
		if (tName != null && tName.length() < 25)
		{
			transactionName = tName;
		}
		else
		{
			System.err.println("Name must be less than 25 symbols!");
		}
	}

	public void setTransactionValue(BigDecimal tValue) {

		if (tValue.compareTo(new BigDecimal("0.00")) == 1) {
			//1 means bigger, -1 means smaller, 0 means same
			transactionValue = tValue;
		}
	}

	public void setTransactionCategory(int tCat) {
		if (tCat > 0) {
			transactionCategory = tCat;
		}
	}

	public void setTransactionTime(Date tTime) {
		if (tTime != null) {
			transactionTime = tTime;
		}
	}

	public int isComplete()
	{
		if(transactionName == null && transactionValue == null)
			return 1;
		else if(transactionValue == null)
			return 2;
		else if(transactionName == null)
			return 3;
		else
			return 4;
	}

	@Override
	public String toString() {
		return transactionName + " - £" + transactionValue.toString();
	}

}
