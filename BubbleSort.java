public class BubbleSort {
    public static void bubbleSort(int[] ara) {
        int n = ara.length;
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-i-1; j++) {
                if(ara[j] > ara[j+1]) {
                    int temp = ara[j];
                    ara[j] = ara[j+1];
                    ara[j+1] = temp;
                }
                
            }
           
        }
    }
    public static void main(String[] args) {
         int[] ara = {34, 9, 23, 12, 8};
         bubbleSort(ara);
         for(int x : ara) {
            System.out.print(x +" ");
         }
    }
}