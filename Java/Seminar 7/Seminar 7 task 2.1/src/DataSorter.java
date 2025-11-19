public class DataSorter {

    SortStrategy sort;

    public void selectOnArraySize(int [] array) {
        long startTime, endTime;

        if (array.length < 10) {
            sort = new BubbleSortStrategy();
            System.out.println("Using BubbleSortStrategy for small array (< 10 elements).");
        }
        else if (array.length <= 1000) {
            sort = new QuickSortStrategy();
            System.out.println("Using QuickSortStrategy for medium array (10-1000 elements).");
        }
        else {
            sort = new MergeSortStrategy();
            System.out.println("Using MergeSortStrategy for large array (> 1000 elements).");
        }

        startTime = System.nanoTime();
        sort.sort(array);
        endTime = System.nanoTime();

        long duration = endTime - startTime;
        System.out.println("Time taken by " + sort.getName() + ": " + duration + " nanoseconds.");
    }
}
