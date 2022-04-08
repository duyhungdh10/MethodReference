package simple4ClassStaticMethod;

public class Demo {
	public static void main(String[] args) {
		
		// Method reference using the static method of the Class
		// tham chieu den 1 static method cua Class
		// Class::staticMethod
		GreetingInterface greet1 = Car::run;
		
		// using lambda
		GreetingInterface greet2 = (name) -> {
			Car.run(name);
		};
		
		greet1.greeting("greet1");
		greet2.greeting("greet2");
		
		// greet1 va greet2 tuong duong voi nhau

	}
}

class Car {
	int id;
	public Car() {
		
	}
	
	public Car(int id) {
		this.id = id;
	}
	
	// static method
	public static void run(String str) {
		System.out.println("Hi "+ str +", Im a car. Im running..." );
	}
}

