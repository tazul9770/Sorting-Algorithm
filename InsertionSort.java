public class InsertionSort {
    public static void insertionSort(int[] ara) {
        for(int i = 1; i < ara.length; i++) {
            int item = ara[i];
            int j = i-1;
            while(j >= 0 && ara[j] > item) {
                ara[j+1] = ara[j];
                j = j - 1;
            }
            ara[j+1] = item;
        }
    }
    public static void main(String[] args) {
        int[] ara = {8, 90, 5, 34, 675};
        insertionSort(ara);
        for(int i = 0; i < ara.length; i++) {
            System.out.print(ara[i] +" ");
        }
    }
}