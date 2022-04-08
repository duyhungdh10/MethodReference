package simple1;

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
		
		

	}
}

