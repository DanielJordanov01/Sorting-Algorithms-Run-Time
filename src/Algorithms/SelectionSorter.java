package Algorithms;
public class SelectionSorter {
    public static void sort(int[] list) {
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
    }
}
