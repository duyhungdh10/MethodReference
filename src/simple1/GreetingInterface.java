package simple1;
@FunctionalInterface
public interface GreetingInterface {
	void greeting(String name);
	
	default String hello(String name) {
		return "Hello: " + name;
	}
}
