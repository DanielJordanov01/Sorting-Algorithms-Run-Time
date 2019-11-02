package Algorithms;
public class MergeSorter {
    public static void sort(int[] list) {

        split(list);
    }

    public static void split(int[] list) {
        int middle = list.length / 2;

        int[] leftList = new int[middle];
        int[] rightList = new int [list.length - middle];

        if (list.length == 1) {
            return;
        }

        // leftList
        System.arraycopy(list, 0, leftList, 0, middle);
        // rightList
        System.arraycopy(list, middle, rightList, 0, list.length - middle);

        // leftList
        split(leftList);
        // rightList
        split(rightList);

        sort(list, leftList, rightList);
    }

    public static void sort(int[] list, int[] leftList, int[] rightList) {

        int i = 0;
        int j = 0;
        int listIndex = 0;

        while (i < leftList.length && j < rightList.length) {
            if (leftList[i] < rightList[j]) {
                list[listIndex] = leftList[i];
                i++;
            } else {
                list[listIndex] = rightList[j];
                j++;
            }

            listIndex++;
        }

        while (i < leftList.length) {
            list[listIndex] = leftList[i];
            i++;
            listIndex++;
        }

        while (j < rightList.length) {
           list[listIndex] = rightList[j];
           j++;
           listIndex++;
        }
    }
}
