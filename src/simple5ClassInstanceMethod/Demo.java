package simple5ClassInstanceMethod;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {
	 public static void main(String[] args) {  
		String[] stringArray1 = { "Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon"};
		String[] stringArray2 = { "Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon"};
		String[] stringArray3 = { "Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon"};
		
		/* Method reference to an instance method of an arbitrary 
		* object of a particular type
		*/
		Arrays.sort(stringArray1, String::compareToIgnoreCase);
		
		// Using anonymous class
		Arrays.sort(stringArray2, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareToIgnoreCase(s2);
			}
		});
		
		// Using lambda
		Arrays.sort(stringArray3, (s1, s2) -> {
			return s1.compareToIgnoreCase(s2);
		});
		
		for(String str: stringArray1){
			System.out.print(str + ", ");
		}
		
		System.out.println();
		
		for(String str: stringArray2){
			System.out.print(str + ", ");
		}
		
		System.out.println();
		
		for(String str: stringArray3){
		    System.out.print(str + ", ");
		}

	    
	 }  
}
