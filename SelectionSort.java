public class SelectionSort {
    public static void selectionSort(int[] ara) {
        for(int i = 0; i < ara.length; i++) {
            for(int j = i+1; j < ara.length; j++) {
                if(ara[j] < ara[i]) {
                    int temp = ara[j];
                    ara[j] = ara[i];
                    ara[i] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] ara = {34, 22, 9, 90};
        selectionSort(ara);
        for(int i = 0; i < ara.length; i++) {
            System.out.print(ara[i] +" ");
        }
    }
}