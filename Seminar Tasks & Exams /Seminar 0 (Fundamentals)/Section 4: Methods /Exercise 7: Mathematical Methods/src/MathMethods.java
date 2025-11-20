public class MathMethods {

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static long factorial(int number) {
		if (number < 0) {
			throw new IllegalArgumentException("Number must be non-negative.");
		}
		long result = 1;
		for (int i = 2; i <= number; i++) {
			result *= i;
		}
		return result;
	}

	public static int gcd(int a, int b) {
		if (a == 0) {
			return Math.abs(b);
		}
		if (b == 0) {
			return Math.abs(a);
		}
		return gcd(b, a % b);
	}

	public static int fibonacci(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Index must be non-negative.");
		}
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		int a = 0, b = 1;
		for (int i = 2; i <= n; i++) {
			int temp = a + b;
			a = b;
			b = temp;
		}
		return b;
	}

	public static void main(String[] args) {
		System.out.println("isPrime(7): " + isPrime(7)); // true
		System.out.println("isPrime(10): " + isPrime(10)); // false

		System.out.println("factorial(5): " + factorial(5)); // 120
		System.out.println("factorial(0): " + factorial(0)); // 1

		System.out.println("gcd(54, 24): " + gcd(54, 24)); // 6
		System.out.println("gcd(101, 103): " + gcd(101, 103)); // 1

		System.out.println("fibonacci(7): " + fibonacci(7)); // 13
		System.out.println("fibonacci(0): " + fibonacci(0)); // 0
	}
}
