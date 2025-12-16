import java.util.ArrayList;
import java.util.Iterator;

import day2.DecisionMaking;
import day2.Switch;
import day3.Loops;
import day4.GiaoVien;
import day4.GiaoVienTiengAnh;
import day4.GiaoVienTiengAnhNew;
import day4.GiaoVienToan;
import day4.GiaoVienToanNew;

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
//		DecisionMaking decisionMaking = new DecisionMaking();
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
//		Switch switch1 = new Switch();
//		int n =10;
//		switch1.printDay(n);

// day3 Loops
//		Loops loops = new Loops();
//		loops.printArray();
//		loops.sumAndAverage();
//		loops.printList();
//		loops.sumAndAverageEx2();
//		loops.sumAndAverageEx3();
//		loops.sumAndAverageEx4();
//		loops.sumAndAverageEx5();
//		loops.harmonicSum();
//		loops.squareBoard();
//		loops.checkerBoard();
//		loops.findKeyWord();
//	}
//	
//
//	public static int tinhTong() {
//		int tong = 0;
//		int a = 5;
//		int b = 10;
//		tong = a + b;
//		return tong;
run2();
	}

	public static void run1() {
		GiaoVienToan giaoVienToan1 = new GiaoVienToan();
		giaoVienToan1.maGv = "1";
		giaoVienToan1.hoTen = "Hoa";
		giaoVienToan1.ngaySinh = "12/12/2001";
		giaoVienToan1.gioiTinh = "nu";
		giaoVienToan1.monDay = "Toan1";

		GiaoVienToan giaoVienToan2 = new GiaoVienToan();
		giaoVienToan2.maGv = "2";
		giaoVienToan2.hoTen = "Hoang";
		giaoVienToan2.ngaySinh = "19/12/2001";
		giaoVienToan2.gioiTinh = "nam";
		giaoVienToan2.monDay = "Toan2";

		GiaoVienToan giaoVienToan3 = new GiaoVienToan();
		giaoVienToan3.maGv = "3";
		giaoVienToan3.hoTen = "HUNG";
		giaoVienToan3.ngaySinh = "19/12/2001";
		giaoVienToan3.gioiTinh = "nam";
		giaoVienToan3.monDay = "Toan3";

		GiaoVienTiengAnh giaoVienTiengAnh1 = new GiaoVienTiengAnh();
		giaoVienTiengAnh1.maGv = "01";
		giaoVienTiengAnh1.hoTen = "Huyen1";
		giaoVienTiengAnh1.ngaySinh = "12/12/2001";
		giaoVienTiengAnh1.gioiTinh = "nu";
		giaoVienTiengAnh1.monDay = "Anh1";
		GiaoVienTiengAnh giaoVienTiengAnh2 = new GiaoVienTiengAnh();
		giaoVienTiengAnh2.maGv = "02";
		giaoVienTiengAnh2.hoTen = "Huyen2";
		giaoVienTiengAnh2.ngaySinh = "12/12/2001";
		giaoVienTiengAnh2.gioiTinh = "nu";
		giaoVienTiengAnh2.monDay = "Anh2";
		GiaoVienTiengAnh giaoVienTiengAnh3 = new GiaoVienTiengAnh();
		giaoVienTiengAnh3.maGv = "03";
		giaoVienTiengAnh3.hoTen = "Huyen3";
		giaoVienTiengAnh3.ngaySinh = "12/12/2001";
		giaoVienTiengAnh3.gioiTinh = "nu";
		giaoVienTiengAnh3.monDay = "Anh3";
		GiaoVienTiengAnh giaoVienTiengAnh4 = new GiaoVienTiengAnh();
		giaoVienTiengAnh4.maGv = "04";
		giaoVienTiengAnh4.hoTen = "Huyen4";
		giaoVienTiengAnh4.ngaySinh = "12/12/2001";
		giaoVienTiengAnh4.gioiTinh = "nu";
		giaoVienTiengAnh4.monDay = "Anh4";
		GiaoVienTiengAnh giaoVienTiengAnh5 = new GiaoVienTiengAnh();
		giaoVienTiengAnh5.maGv = "05";
		giaoVienTiengAnh5.hoTen = "Huyen5";
		giaoVienTiengAnh5.ngaySinh = "12/12/2001";
		giaoVienTiengAnh5.gioiTinh = "nu";
		giaoVienTiengAnh5.monDay = "Anh5";

		ArrayList<GiaoVienToan> giaoVienToans = new ArrayList<GiaoVienToan>();
		giaoVienToans.add(giaoVienToan1);
		giaoVienToans.add(giaoVienToan2);
		giaoVienToans.add(giaoVienToan3);
		ArrayList<GiaoVienTiengAnh> giaoVienTiengAnhs = new ArrayList<GiaoVienTiengAnh>();
		giaoVienTiengAnhs.add(giaoVienTiengAnh1);
		giaoVienTiengAnhs.add(giaoVienTiengAnh2);
		giaoVienTiengAnhs.add(giaoVienTiengAnh3);
		giaoVienTiengAnhs.add(giaoVienTiengAnh4);
		giaoVienTiengAnhs.add(giaoVienTiengAnh5);
		for (GiaoVienToan gv : giaoVienToans) {
			gv.inThongTin();
		}
		for(GiaoVienTiengAnh giaoVienTiengAnh : giaoVienTiengAnhs) {
			giaoVienTiengAnh.inThongTin();
		}

	}
	public static void run2() {
		GiaoVien giaoVienToan1 = new GiaoVienToanNew();
		giaoVienToan1.maGv = "1";
		giaoVienToan1.hoTen = "Hoa";
		giaoVienToan1.ngaySinh = "12/12/2001";
		giaoVienToan1.gioiTinh = "nu";
		giaoVienToan1.monDay = "Toan1";
		
		GiaoVien giaoVienTiengAnh1 = new GiaoVienTiengAnhNew();
		giaoVienTiengAnh1.maGv = "01";
		giaoVienTiengAnh1.hoTen = "Huyen1";
		giaoVienTiengAnh1.ngaySinh = "12/12/2001";
		giaoVienTiengAnh1.gioiTinh = "nu";
		giaoVienTiengAnh1.monDay = "Anh1";
		
		ArrayList<GiaoVien> listGv = new ArrayList<GiaoVien>();
		listGv.add(giaoVienToan1);
		listGv.add(giaoVienTiengAnh1);
		for(GiaoVien giaoVien : listGv) {
			giaoVien.inThongTin();
		}
		
	}

}
