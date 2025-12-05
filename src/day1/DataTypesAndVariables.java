package day1;

public class DataTypesAndVariables {
// Ex2 
	public static void printString() {
		System.out.println("++++++");
		System.out.println();
		System.out.println("@@@@@@");
		System.out.println();
		System.out.println("******");
		System.out.println();
		System.out.println("######");
	}

//EX3
	public static void printNumber() {
		byte a = 10;
		double b = 20.3;
		double c = 3.14785;
		System.out.print(a);
		System.out.println();
		System.out.print(b);
		System.out.println();
		System.out.print(c);
		System.out.println();

	}

//EX4
	public static void printBoolean() {
		boolean a = true;
		a = false;
		System.out.print(a);
		System.out.println();
	}
	
//EX6
	public static void convertFahrenheitTo() {
		double fahrenheit = 212;
		double celsius = (fahrenheit -32)/1.8000;
		System.out.println(fahrenheit + " degree Fahrenheit is equal to " +celsius+" in Celsius");
		System.out.println();
	}
	
//EX7
	public static void convertToMeters() {
		int a = 1000;
		double meters = a * 0.0254;
		System.out.println(a + "*" +meters +" meters");
		
		
	}
}
