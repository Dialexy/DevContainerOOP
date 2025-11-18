public class BubbleSortStrategy implements SortStrategy {

    private final String name = "Bubble Sort";

    @Override
    public void sort(int[] array) {
        int n = array.length;
        System.out.println("Using Bubble Sort on array of size: " + n);

        for (int i = 0; i < n - 1; i++) {
            System.out.println("Itteration " + (i + 1) + " begins here.");

            for (int j = 0; j < n - i - 1; j++) {
                System.out.println("Comparing array[" + j + "] = " + array[j] + " and array[" + (j + 1) + "] = " + array[j + 1]);

                if (array[j] > array[j + 1]) {
                    System.out.println("Swapping " + array[j] + " and " + array[j + 1]);

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    System.out.println("Array after they get swaped: " + java.util.Arrays.toString(array));
                }
            }
        }

        System.out.println("Final sorted array: " + java.util.Arrays.toString(array));
    }

    @Override
    public String getName() {
        return name;
    }
}
