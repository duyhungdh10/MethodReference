package simple3ObjectInstanceMethod;

public class Demo {
	public static void main(String[] args) {
		Car car = new Car(12);
		
		// Method reference using the object of the class
		// tham chieu den 1 instance method cua object
		// Object::instanceMethod
		GreetingInterface greet1 = car::run;
		
		// using lambda
		GreetingInterface greet2 = (name) -> {
			car.run(name);
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
	
	public void run(String str) {
		System.out.println("Hi "+ str +", Im a car. Im running... with id = " + id);
	}
}

