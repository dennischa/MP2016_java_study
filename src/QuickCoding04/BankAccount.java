package QuickCoding04;

public class BankAccount extends Thread{
	private int balance = 100;
	
	public int getBalance(){
		return balance;
	}
	
	public void deposit(int money){
		balance += money;
		System.out.println("촙합: " + balance +" "+ money + "만큼 입금");
	}
	public void withDraw(int money){
		balance -= money;
		System.out.println("촙합: " + balance +" "+ money + "만큼 출금");
	}
	
	
	public void run(){
		
	}

}