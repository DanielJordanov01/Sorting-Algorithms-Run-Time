package Utils;

import Algorithms.*;

public class Utils {
    public static void print(int[] list, int[] listCopy) {
        System.out.println("Sorted array: ");

        // Copying List into ListCopy
        System.arraycopy(list, 0, listCopy, 0, 10000);

        long startTime = System.nanoTime();
        // Sorting listCopy using Bubble Sort Algorithm and displaying the run time
        BubbleSorter.sort(listCopy);
        displayExecutionTime(startTime, "Bubble Sort");

        // Copying List into ListCopy
        System.arraycopy(list, 0, listCopy, 0, 10000);

        startTime = System.nanoTime();
        // Sorting listCopy using Selection Sort Algorithm
        SelectionSorter.sort(listCopy);
        displayExecutionTime(startTime, "Selection Sort");

        // Copying List into ListCopy
        System.arraycopy(list, 0, listCopy, 0, 10000);

        startTime = System.nanoTime();
        // Sorting listCopy using Insertion Sort Algorithm
        InsertionSorter.sort(listCopy);
        displayExecutionTime(startTime, "Insertion Sort");

        // Copying List into ListCopy
        System.arraycopy(list, 0, listCopy, 0, 10000);

        startTime = System.nanoTime();
        // Sorting listCopy using Algorithms.QuickSorter
        QuickSorter.sort(listCopy);
        displayExecutionTime(startTime, "Quick Sort");

        // Copying List into ListCopy
        System.arraycopy(list, 0, listCopy, 0, 10000);

        startTime = System.nanoTime();
        // Sorting listCopy using Merge Sort Algorithm
        MergeSorter.sort(listCopy);
        displayExecutionTime(startTime, "Merge Sort");
    }

    public static double toMilliseconds(double nanosecond) {
        double converted = nanosecond * Math.pow(10, -6);
        return converted;
    }

    public static void displayExecutionTime(long startTime, String algorithm) {
        final long duration = System.nanoTime() - startTime;
        // display the needed time for the program to run
        System.out.println( " " + Utils.toMilliseconds(duration)+ " milliseconds" + " for " + algorithm);
    }
}
