package day3;

import java.util.ArrayList;
import java.util.Iterator;

public class Loops {

	/**
	 * Ex1
	 */
	public void printArray() {
		byte daySo[] = new byte[5];
		daySo[0] = 1;
		daySo[1] = 3;
		// 5,8,9
		daySo[2] = 5;
		daySo[3] = 8;
		daySo[4] = 9;
		for (int i = 0; i < daySo.length; i++) {
			System.out.print(daySo[i] + " ");
		}
	}

	/**
	 * Ex2
	 */
	public void sumAndAverage() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("The Sum is " + sum);
		float average = 0;
		average = (float) sum / 100;
		System.out.println("The average " + average);

	}

	public void printList() {
		ArrayList<String> danhSach = new ArrayList<String>();
		danhSach.add("Ha");
		danhSach.add("hoa");
		danhSach.add("Nguyen");
		// System.out.println(danhSach);
		// lay ra ten hoc vien chua chu a
		for (String hocVien : danhSach) {
			if (hocVien.contains("a")) {
				System.out.println(hocVien);
			}
		}
	}

	/**
	 * Ex3
	 */
	public void sumAndAverageEx2() {
		int sum = 0;
		int count = 0;
		for (int i = 111; i <= 8899; i++) {
			sum = sum + i;
			count++;
		}
		System.out.println("The sum is" + sum);
		double average = 0;
		average = (double) sum / (double) count;
		System.out.println("The average" + average);
	}

	/**
	 * EX4
	 */
	public void sumAndAverageEx3() {
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				sum += i;
				count++;
			}
		}
		System.out.println("The sum is " + sum);
		double average = 0;
		average = (double) sum / (double) count;
		System.out.println("The average " + average);
	}

	/**
	 * EX5
	 */
	public void sumAndAverageEx4() {
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				sum += i;
				count++;
			}
		}
		System.out.println("The sum is " + sum);
		double average = 0;
		average = (double) sum / (double) count;
		System.out.println("The average " + average);
	}

	/**
	 * EX6
	 */
	public void sumAndAverageEx5() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += (i * i);
		}
		System.out.println("The sum is " + sum);
	}

	/**
	 * EX7
	 */
	public void harmonicSum() {
		int n = 50000;
		double sumLeftToRight = 0;
		double sumRightToLeft = 0;
		for (int i = 1; i < n; i++) {
			sumLeftToRight += (double) 1 / i;
		}
		for (int i = n; i >= 1; i--) {
			sumRightToLeft += (double) 1 / i;
		}
		double difference = sumLeftToRight - sumRightToLeft;
		System.out.println("Sum Left To Right: " + sumLeftToRight);
		System.out.println("sum Right To Left: " + sumRightToLeft);
		System.out.println("Difference = " + Math.abs(difference));
	}

	/**
	 * EX8
	 */
	public void squareBoard() {
		int n = 5;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}

	/**
	 * Ex9
	 */
	public void checkerBoard() {
		int n = 7;
		for (int i = 1; i <= 7; i++) {
			if (i % 2 == 0) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 7; j++) {
				System.out.print("# ");
			}
			System.out.println();

		}
	}
	
	/**
	 * Ex10
	 */
	public void findKeyWord() {
		String key = "Hello World";
		char[] array = key.toCharArray();
		int i =0;
		while(i <array.length) {
			if(array[i] == 'r') {
				System.out.println(i);
				return;
			}
			i++;		
		}
		
        System.out.println("Không tìm thấy");
	}
}
