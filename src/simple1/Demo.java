package simple1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Demo {
	public static void main(String[] args) {
		GreetingInterface obj1 = (String name) -> {
			System.out.println("Hi, greating " + name);
		};
		
		obj1.greeting("Hoang");
		
		
		GreetingInterface obj2 = (name) -> {
			System.out.println(name);
		};
		obj2.greeting("Kien");
		
		GreetingInterface obj3 = System.out::println;
		obj3.greeting("Kien");
		
		
		List<String> items = Arrays.asList("one", "two", "three", "four", "five" );
		items.forEach(System.out::println);
//		items.forEach(e -> System.out.println(e));
		
//		// Ben trong forEach no nhu the nay
//		items.forEach(new Consumer<String>() {
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//			}
//		});

	}
}

