package Algorithms;
public class InsertionSorter {
    public static void sort(int list[]) {
        int n = list.length;

        for (int i = 1; i < n; i++) {
            int sorted = list[i];
            int j = i - 1;

            while (j >= 0 && sorted < list[j]) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = sorted;
        }
    }
}
