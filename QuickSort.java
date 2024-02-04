public class QuickSort {
    public static int partition(int[] ara, int low, int high) {
        int pivotIndx = ara[high];
        int i = (low-1);
        for(int j = low; j < high; j++) {
            if(ara[j] <= pivotIndx) {
                i++;
                int temp = ara[i];
                ara[i] = ara[j];
                ara[j] = temp;
            }
        }
        i++;
        int temp = ara[i];
        ara[i] = ara[high];
        ara[high] = temp;

        return i;
    }
    public static void sort(int[] ara, int low, int high) {
        if(low < high) {
            int pivot = partition(ara, low, high);
            sort(ara, low, pivot-1);
            sort(ara, pivot+1, high);
        }
    }
    public static void main(String[] args) {
        int[] ara = {10, 3, 4, 1, 7, 5, 6};
        int n = ara.length;
        sort(ara, 0, n-1);
        for(int i = 0; i < n; i++) {
            System.out.print(ara[i] +" ");
        }
    }
}