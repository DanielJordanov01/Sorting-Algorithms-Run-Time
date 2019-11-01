package Algorithms;
import Utils.Utils;

public class SelectionSorter {
    public static void sort(int[] list) {
        // set starting time
        final long startTime = System.nanoTime();
        int n = list.length;
        int temp = 0;


        for (int i = 0; i < (n -1); i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if(list[minIndex] > list[j]) {
                    minIndex = j;
                }
            }

            temp = list[minIndex];
            list[minIndex] = list[i];
            list[i] = temp;
        }

        // calculate the running time
        final long duration = System.nanoTime() - startTime;
        // display the needed time for the program to run
        System.out.println( " " + Utils.toMiliseconds(duration)+ " miliseconds" + " for Selection Sort");

    }
}