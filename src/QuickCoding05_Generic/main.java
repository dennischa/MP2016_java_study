package QuickCoding05_Generic;
import java.util.*;

public class main {
	
	
	static ArrayList<Integer> a;
	static ArrayList<String> b;
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		a = new ArrayList<Integer> ();
		b = new ArrayList<String> ();
		
		
		
		for(int i =0; i <5 ; i++){
		Scanner scan = new Scanner(System.in);  
		String str = scan.nextLine(); 
		
		if(isStringDouble(str))
		{
			a.add(Integer.parseInt(str));
			
		}
		else
			b.add(str);
		}
		
		
		
		for(String s: b)
		{
			System.out.println(s);
		}
		for(int s: a)
		{
			System.out.println(s);
		}
		
		 	
	}
	public static boolean isStringDouble(String s) {
	    try {
	        Double.parseDouble(s);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	  }

}
