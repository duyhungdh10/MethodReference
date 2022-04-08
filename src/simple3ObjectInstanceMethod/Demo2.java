package simple3ObjectInstanceMethod;

public class Demo2 {
	public static void main(String[] args) {
        int a = 10;
        int b = 7;
        MathUtils obj = new MathUtils();
        
        // Using method reference Object::instanceMethod
        int sum1 = doAction(a, b, obj::sum);
        
        // Using anonymous class
        int sum2 = doAction(a, b, new ExecuteFunction() {
			@Override
			public int execute(int a, int b) {
				return obj.sum(a, b);
			}
		});
        
        // Using lambda expression
        int sum3 = doAction(a, b, (x, y) -> {
        	return obj.sum(x, y);
        });
        
        
        System.out.println(a + " + " + b + " = " + sum1); // 10 + 7 = 17
        System.out.println(a + " + " + b + " = " + sum2); // 10 + 7 = 17
        System.out.println(a + " + " + b + " = " + sum3); // 10 + 7 = 17
        
        int minus = doAction(a, b, obj::minus);
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
    public int sum(int a, int b) {
        return a + b;
    }
 
    public int minus(int a, int b) {
        return a - b;
    }
}
