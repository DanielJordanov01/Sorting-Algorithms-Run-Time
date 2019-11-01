public class Utils {
    public static void print(int[] list, int[] listCopy) {
        System.out.println("Sorted array: ");

        // Copying List into ListCopy
        System.arraycopy(list, 0, listCopy, 0, 10000);

        // Sorting listCopy using Bubble Sort Algorithm and displaying the run time
        BubbleSorter.sort(listCopy);

        // Copying List into ListCopy
        System.arraycopy(list, 0, listCopy, 0, 10000);

        // Sorting listCopy using Selection Sort Algorithm
        SelectionSorter.sort(listCopy);

        // Copying List into ListCopy
        System.arraycopy(list, 0, listCopy, 0, 10000);

        // Sorting listCopy using Insertion Sort Algorithm
        InsesrtionSorter.sort(listCopy);

        // Copying List into ListCopy
        System.arraycopy(list, 0, listCopy, 0, 10000);
        // Sorting listCopy using Merge Sort Algorithm
        MergeSorter.sort(listCopy);

        // Copying List into ListCopy
        System.arraycopy(list, 0, listCopy, 0, 10000);
        // Sorting listCopy using QuickSorter
        QuickSorter.sort(listCopy);
    }

    public static double toMiliseconds(double nanosecond) {
        double converted = nanosecond * Math.pow(10, -6);
        return converted;
    }
}
