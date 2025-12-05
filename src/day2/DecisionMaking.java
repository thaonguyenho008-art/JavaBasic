package day2;

public class DecisionMaking {
	/**
	 * EX1
	 * 
	 * @param n
	 */
	public void checkNumber(int n) {
		if (n % 2 == 0) {
			System.out.println("n là số chẵn");
		}
	}

	/**
	 * 
	 * @param n
	 * @return
	 */

	public boolean checkNumber1(int n) {
		boolean result = false;
		if (n % 2 == 0) {
			result = true;
		}
		return result;
	}

	/**
	 * EX2
	 * 
	 * @param n
	 */
	public void checkNumber2(int n) {
		if (n % 2 == 0) {
			if (2 <= n && n <= 5) {
				System.out.println("Not Weird");
			} else if (6 <= n && n <= 20) {
				System.out.println("print Weird");
			} else {
				System.out.println("Not Weird");
			}

		} else {
			System.out.println("Weird\r\n");
		}

	}
	
	/**
	 * EX3
	 * @param n
	 * @return
	 */

	public int tinhTong(int n) {
		int tong = 0;
		if (n > 0 && n < 1000) {
			if (n < 10) {
				tong = n;
			}
			if (n >= 10 && n < 100) {
				tong = (n / 10) + (n % 10);
			}
			if (n >= 100 && n < 1000) {
				tong = (n / 100) + ((n % 100) / 10) + (n % 10);
			}
		}
		return tong;
	}
	
	/**
	 * EX4
	 * @param n
	 */
	public void convert(int n) {
		int year = n /(60*24*365);
		int minutes = n % (60*24*365);
		int days = minutes / (60*24);
		System.out.println(n + " minutes is approximately " + year + " years and " + days + " days");
	}
}
