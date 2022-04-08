public class NestedIfs {

	public static void main(String[] args) {
		
		int num = 0;
		
		if (num > 0) { 
			if (num % 2 == 0) { 
				System.out.print("Even and Positive");
			    
			}else {
				System.out.print("Odd and Positive");
			}
		}
		else if (num <0) { 
			if (num % 2 == 0) { 
				System.out.print("Even and negative");
			}else {
				System.out.print("Odd and negative");
			}
			
		}else {
			System.out.print("zero");
		}
		
	}
}