package simple6ClassNew;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {
	 public static void main(String[] args) {  
		 
		MyInterface objImp1 = Hello::new;
		objImp1.display("Tham chieu den 1 contructor using Class::new.");
		
		MyInterface objImp2 = new MyInterface() {
			@Override
			public void display(String say) {
				new Hello(say);
			}
		};
		objImp2.display("Using anonymous class.");
		
		MyInterface objImp3 = (say) -> {
			new Hello(say);
		};
		objImp3.display("Using lambda expresion.");
	 }  
}

@FunctionalInterface
interface MyInterface {
    void display(String say);
}
 
class Hello {
    public Hello(String say) {
        System.out.println(say);
    }
}