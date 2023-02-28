package controlstmt;
//This is new code
public class ConditionalStmt {

	public static void main(String[] args) {
		int limit=50000;
		if(limit<20000) {
			System.out.println("eligible for Rupay");
		}
			else if(limit>30000) {
				System.out.println("eligible for Platinum");
			}
		
		else {
			System.out.println("invalid!!");
		}

	}

}
