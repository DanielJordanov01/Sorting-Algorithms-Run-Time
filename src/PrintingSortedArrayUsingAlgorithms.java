public class PrintingSortedArrayUsingAlgorithms {
    public static void printingSortedArrayUsingAlgorithms(int[] list, int[] listCopy) {
        System.out.println("Sorted array: ");

        // Copying List into ListCopy
        System.arraycopy(list, 0, listCopy, 0, 10000);

        // Sorting listCopy using Bubble Sort Algorithm and displaying the run time
        BubbleSort.bubbleSort(listCopy);

        // Copying List into ListCopy
        System.arraycopy(list, 0, listCopy, 0, 10000);

        // Sorting listCopy using Selection Sort Algorithm
        SelectionSort.selectionSort(listCopy);

        // Copying List into ListCopy
        System.arraycopy(list, 0, listCopy, 0, 10000);

        // Sorting listCopy using Insertion Sort Algorithm
        InsesrtionSort.insertionSort(listCopy);

        // Copying List into ListCopy
        System.arraycopy(list, 0, listCopy, 0, 10000);
        // Sorting listCopy using Merge Sort Algorithm
        MergeSort.MergeSorter(listCopy);

        // Copying List into ListCopy
        System.arraycopy(list, 0, listCopy, 0, 10000);
        // Sorting listCopy using QuickSort
        QuickSort.quickSorter(listCopy);
        }
}
