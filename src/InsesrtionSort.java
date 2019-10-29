public class InsesrtionSort {
    public static void insertionSort(int list[]) {
        // set starting time
        final long startTime = System.nanoTime();
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

        // calculate the running time
        final long duration = System.nanoTime() - startTime;
        // display the needed time for the program to run
        System.out.println( " " + NanoSecondToMiliSecondConvertor.convertNanoSecondToSecond(duration)+ " miliseconds" + " for Insertion Sort");
    }
}
