package QuickCoding03;

import java.util.Scanner;


public class QuickCoding {

	public static void main(String[] args) throws MyException, ArithmeticException {
		// TODO Auto-generated method stub
		 String message;
	        Scanner scan = new Scanner(System.in); 
	        
	         int a, b;	        	       
	        
	        try{
	        	message = scan.nextLine();  
	        	a = Integer.parseInt(message);
	 	        message = scan.nextLine();
	 	        b = Integer.parseInt(message);
	 	        
	 	        int result= a/b;  // (num / 0)일때 ArithmeticException 예외발생
				System.out.println(result);
				
				if(a > 999 || b > 999)
					throw new ArithmeticException();
				else
					throw new MyException();
			     }
	        catch(ArithmeticException  ae){
	        	ae.getMessage();
	        	System.out.println("can't divide by zero(0)");
			}
	        catch(NumberFormatException nfe){
	        	System.out.println("That you entered is not a number");
	        }
	        catch(MyException e){
	        	//System.out.println("Exceed three digits");
                System.out.println(e.getMessage());
	        }
	        finally{
	        	System.out.println("Program ends");
	        	
	        }
	        
	}

}
