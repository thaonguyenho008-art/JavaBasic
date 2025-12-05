import day2.DecisionMaking;
import day2.Switch;

public class Main {

	public static void main(String[] args) {
		// Variavle
//		String a = "Hello, World"; //Declaration +initial
//		String b = "Hello,Nguyên";
//		String c = "Hello,Duyệt";
//		
//		System.out.print(a);
//		System.out.print(b);
//		System.out.print(c);
//      System.out.print(tinhTong());

		// Method usage - dùng method từ class khác
		// 1. khai báo class sẽ dùng DataTypesAndVariables
		// DataTypesAndVariables dataTypesAndVariables = new DataTypesAndVariables();
		// 2. Lời gọi hàm- method call
//		dataTypesAndVariables.printString();
//		dataTypesAndVariables.printNumber();
//		dataTypesAndVariables.printBoolean();
//		dataTypesAndVariables.convertFahrenheitTo();
//		dataTypesAndVariables.convertToMeters();

		// Operators
		// Operators operators = new Operators();
		// operators.calculate();
		// operators.calculateNumber();
		// operators.printDigits(1234556789);

// day 2 Decision Making
		DecisionMaking decisionMaking = new DecisionMaking();
		// EX1
//		decisionMaking.checkNumber(12);
//		if (decisionMaking.checkNumber1(12)) {
//			System.out.println("n là số chẵn");
//		}

		// EX2
//		decisionMaking.checkNumber2(22);

		// EX3
//		int n =565;
//		System.out.println("Input an integer between 0 and 1000:" +n);
//		System.out.println("The sum of all digits in "+n+ " is " + decisionMaking.tinhTong(n));

		// EX4
//		int n = 3456789;
//		System.out.println("Input the number of minutes: " + n);
//		decisionMaking.convert(n);

// day 2 Switch
		Switch switch1 = new Switch();
		int n =10;
		switch1.printDay(n);
		
	}

	public static int tinhTong() {
		int tong = 0;
		int a = 5;
		int b = 10;
		tong = a + b;
		return tong;
	}

}
