//another demo of static
//**to compile in jterm directory use this command:  java -cp . <mainClass>
public class StaticDemo {
	static int a = 42;
	static int b = 99;
	
	static void callme() {
		System.out.println("a = a" + a);
		
	}

	public static void main(String[] args) {
		StaticDemo.callme();
		System.out.println("b =- " + StaticDemo.b);

	}

}
