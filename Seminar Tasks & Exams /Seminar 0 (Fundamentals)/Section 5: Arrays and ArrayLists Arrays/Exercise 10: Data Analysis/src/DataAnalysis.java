public class DataAnalysis {
	public static void main(String[] args) {
		int[][] temperatures = {
			{20, 22, 19, 25, 27, 24, 21},
			{18, 16, 20, 22, 25, 23, 19}
		};

		for (int i = 0; i < temperatures.length; i++) {
			int[] month = temperatures[i];
			double average = calculateAverage(month);
			int hottestDay = findHottestDay(month);
			int coldestDay = findColdestDay(month);
			int aboveAverageDays = countAboveAverageDays(month, average);
			int belowAverageDays = countBelowAverageDays(month, average);
			int range = calculateRange(month);

			System.out.println("Month " + (i + 1) + ":");
			System.out.println("Average Temperature: " + average);
			System.out.println("Hottest Day Temperature: " + hottestDay);
			System.out.println("Coldest Day Temperature: " + coldestDay);
			System.out.println("Days Above Average: " + aboveAverageDays);
			System.out.println("Days Below Average: " + belowAverageDays);
			System.out.println("Temperature Range: " + range);
			displayChart(month);
			System.out.println();
		}
	}

	private static double calculateAverage(int[] temperatures) {
		int sum = 0;
		for (int temp : temperatures) {
			sum += temp;
		}
		return (double) sum / temperatures.length;
	}

	private static int findHottestDay(int[] temperatures) {
		int max = Integer.MIN_VALUE;
		for (int temp : temperatures) {
			if (temp > max) {
				max = temp;
			}
		}
		return max;
	}

	private static int findColdestDay(int[] temperatures) {
		int min = Integer.MAX_VALUE;
		for (int temp : temperatures) {
			if (temp < min) {
				min = temp;
			}
		}
		return min;
	}

	private static int countAboveAverageDays(int[] temperatures, double average) {
		int count = 0;
		for (int temp : temperatures) {
			if (temp > average) {
				count++;
			}
		}
		return count;
	}

	private static int countBelowAverageDays(int[] temperatures, double average) {
		int count = 0;
		for (int temp : temperatures) {
			if (temp < average) {
				count++;
			}
		}
		return count;
	}

	private static int calculateRange(int[] temperatures) {
		return findHottestDay(temperatures) - findColdestDay(temperatures);
	}

	private static void displayChart(int[] temperatures) {
		for (int temp : temperatures) {
			for (int i = 0; i < temp; i++) {
				System.out.print("*");
			}
			System.out.println(" " + temp);
		}
	}
}
