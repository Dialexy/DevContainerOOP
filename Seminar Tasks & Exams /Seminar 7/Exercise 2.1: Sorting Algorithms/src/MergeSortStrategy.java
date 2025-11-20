public class MergeSortStrategy implements SortStrategy {

    private final String name = "Merge Sort";

    @Override
    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            System.out.println("Finding the mid point of the array.");
            int mid = left + (right - left) / 2;

            System.out.println("Sorting the two ends recursively.");
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            System.out.println("Merging the two halves.");
            merge(array, left, mid, right);
        }
    }

    private void merge(int[] array, int left, int mid, int right) {
        System.out.println("Finding the size of the two sub arrays.");
        int n1 = mid - left + 1;
        int n2 = right - mid;

        System.out.println("Creating temporary arrays.");
        int[] L = new int[n1];
        int[] R = new int[n2];

        System.out.println("Copying values to temporary arrays.");
        for (int i = 0; i < n1; i++) {
            L[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = array[mid + 1 + j];
        }

        System.out.println("Merging the temporary arrays into the main array.");
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        System.out.println("Checking if any elements reamin in the left side array.");
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        System.out.println("CHecking if any elements are in the right side array.");
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
