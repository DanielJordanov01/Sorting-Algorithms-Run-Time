package Algorithms;
import Utils.Utils;

public class QuickSorter {
    public static void sort(int[] list) {

        final long startTime = System.nanoTime();

        sort(list, 0, list.length - 1);

        // calculate the running time
        final long duration = System.nanoTime() - startTime;
        // display the needed time for the program to run
        System.out.println( " " + Utils.toMiliseconds(duration)+ " miliseconds" + " for Quick Sort");
    }

    public static int partition(int[] list, int low, int high) {

        int i = low - 1;
        int pivot = list[high];
        int temp = 0;

        for (int j = low; j < high; j++) {
            if (list[j] <= pivot) {
                i++;
                temp = list[j];
                list[j] = list[i];
                list[i] = temp;
            }
        }

        temp = list[i + 1];
        list[i + 1] = list[high];
        list[high] = temp;

        return i + 1;
    }

    public static void sort(int[] list, int low, int high) {
        if(low < high) {
            int part = partition(list, low, high);

            sort(list, low, part - 1);
            sort(list, part + 1, high);
        }
    }
}
