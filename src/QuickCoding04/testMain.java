package QuickCoding04;

import java.util.Scanner;

public class testMain {
	public static BankAccount account = new BankAccount();
	static int testCase = 10;
	
	public static boolean available = true;
	public  static void main(String[] args) {
		
		
		Thread depositMan = new Thread(){
			public void run(){
				while(true){
					if(available){
						available = false;
						account.deposit(10);
						testCase--;
						available = true;

						}
					
					if(testCase < 0)
						break;
					
				}
				
			}
		};
		
		Thread withdrawMan = new Thread(){
			public void run(){
			while(true){
					if(available){
						available = false;
						account.withDraw(10);
						available = true;
						testCase--;
						}
					
					if(testCase < 0)
						break;
					
				}
				
			}
		};
		// TODO Auto-generated method stub
		
		
		depositMan.start();
		withdrawMan.start();	

	}
}
