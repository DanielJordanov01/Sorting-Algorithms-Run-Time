import Utils.Utils;

public class Main {
    public static void main(String args[]) {
        // Initial list
        int[] list = new int[10000];
        int[] listCopy = new int[10000];


        // generates random numbers in range 1 to 100 and puts them in the list
        for(int i = 0; i < list.length; i++) {
            list[i] = (int)(Math.random()*100 + 1);
        }

        Utils.print(list, listCopy);
    }
}

