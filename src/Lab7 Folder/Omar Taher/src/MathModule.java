
public class MathModule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(myMultiply(2000000000,6));
		try {
			int test = myMultiply(2000000000,6);
			System.out.println(test);
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}

	

		public static int myMultiply(int firstNum, int secondNum){
			long newAnswer = (long)firstNum*secondNum;
			if(newAnswer > Integer.MAX_VALUE) {
				try {
					throw new Exception("Number too big");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return firstNum*secondNum;
		}
}

