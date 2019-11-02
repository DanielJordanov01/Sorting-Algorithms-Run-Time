package Algorithms;
public class QuickSorter {
    public static void sort(int[] list) {

        sort(list, 0, list.length - 1);
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
