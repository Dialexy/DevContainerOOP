public class QuickSortStrategy implements SortStrategy {

    private final String name = "Quick Sort";

    @Override
    public void sort(int[] array) {
        System.out.println("Starting QuickSort on the array.");
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int low, int high) {
        System.out.println("Sorting a sub-array within the specified range.");
        if (low < high) {
            System.out.println("Partitioning the sub-array and determining the pivot index.");
            int pivotIndex = partition(array, low, high);
            System.out.println("Recursively sorting the left portion of the sub-array.");
            quickSort(array, low, pivotIndex - 1);
            System.out.println("Recursively sorting the right portion of the sub-array.");
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        System.out.println("Partitioning the sub-array around a chosen pivot.");
        int pivot = array[high];
        System.out.println("Pivot element selected.");
        int i = low - 1;
        for (int j = low; j < high; j++) {
            System.out.println("Comparing current element with the pivot.");
            if (array[j] <= pivot) {
                i++;
                System.out.println("Swapping elements to rearrange around the pivot.");
                swap(array, i, j);
            }
        }
        System.out.println("Placing the pivot element in its correct position.");
        swap(array, i + 1, high);
        return i + 1;
    }

    private void swap(int[] array, int i, int j) {
        System.out.println("Swapping two elements in the array.");
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    @Override
    public String getName() {
        return name;
    }
}
