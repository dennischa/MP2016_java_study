package QuickCoding04;

public class BankAccount extends Thread{
	private int balance = 100;
	
	public int getBalance(){
		return balance;
	}
	
	public void deposit(int money){
		balance += money;
		System.out.println("����: " + balance +" "+ money + "��ŭ �Ա�");
	}
	public void withDraw(int money){
		balance -= money;
		System.out.println("����: " + balance +" "+ money + "��ŭ ���");
	}
	
	
	public void run(){
		
	}

}