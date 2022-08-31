package ArmstrongNumber;

public class ArmstrongNumber {

	  static final int firstNumber = 100;
	  static final int lastNumber = 100;
	    
	    static boolean esArmstrong(int number) {
	       
	        final int b10 = 10;
	        int n = number;
	        int sum = 0;
	        int digit = 0;
	        
	        while (n > 0) {
	            
	            digit = n % b10;
	            sum += digit*digit*digit;
	            n /= b10;
	        }
	        
	        return sum == number;
	 
	    }
	    
	  
	 
	}
