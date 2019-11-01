package Algorithms;
import Utils.Utils;

public class BubbleSorter {
    public static void sort(int[] list) {
        // set starting time
        final long startTime = System.nanoTime();
        int n = list.length;
        int temp = 0;
        boolean swapped;


        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 1; j < (n - i); j++) {
                if(list[j - 1] > list[j]) {
                    temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                    swapped = true;
                }
            }

            if (swapped == false) {
                break;
            }
        }

        // calculate the running time
        final long duration = System.nanoTime() - startTime;
        // display the needed time for the program to run
        System.out.println( " " + Utils.toMiliseconds(duration)+ " miliseconds" + " for Bubble Sort");
    }
}
