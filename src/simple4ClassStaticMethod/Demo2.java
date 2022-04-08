package simple4ClassStaticMethod;

public class Demo2 {
	public static void main(String[] args) {
        int a = 10;
        int b = 7;
        
        // Using method reference Class::staticMethod
        int sum1 = doAction(a, b, MathUtils::sum);
        
        // Using anonymous class
        int sum2 = doAction(a, b, new ExecuteFunction() {
			@Override
			public int execute(int a, int b) {
				return MathUtils.sum(a, b);
			}
		});
        
        // Using lambda expression
        int sum3 = doAction(a, b, (x, y) -> {
        	return MathUtils.sum(x, y);
        });
        
        
        System.out.println(a + " + " + b + " = " + sum1); // 10 + 7 = 17
        System.out.println(a + " + " + b + " = " + sum2); // 10 + 7 = 17
        System.out.println(a + " + " + b + " = " + sum3); // 10 + 7 = 17
        
        int minus = doAction(a, b, MathUtils::minus);
        System.out.println(a + " - " + b + " = " + minus); // 10 - 7 = 3
    }
 
    public static int doAction(int a, int b, ExecuteFunction func) {
        return func.execute(a, b);
    }
}

@FunctionalInterface
interface ExecuteFunction {
    public int execute(int a, int b);
}
 
class MathUtils {
	// static method
    public static int sum(int a, int b) {
        return a + b;
    }
 
    // static method
    public static int minus(int a, int b) {
        return a - b;
    }
}
