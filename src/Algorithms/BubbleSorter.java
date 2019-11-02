package Algorithms;
public class BubbleSorter {
    public static void sort(int[] list) {
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
    }
}
