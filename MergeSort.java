import java.util.Scanner;

public class MergeSort {
	
	public static void conquer(int[] ara, int si, int mid, int ei) {
		
		int[] merged = new int[ei - si+1];
		
		int indx1 = si;
		int indx2 = mid+1;
		int x = 0;
		
		while(indx1 <= mid && indx2 <= ei) {
			
			if(ara[indx1] <= ara[indx2]) {
				
				merged[x] = ara[indx1];
				x++;
				indx1++;
				
			} else {
				
				merged[x] = ara[indx2];
				x++;
				indx2++;
			}
		}
		
		while(indx1 <= mid) {
			
			merged[x] = ara[indx1];
			x++;
			indx1++;
		}
		
		while(indx2 <= ei) {
			
			merged[x] = ara[indx2];
			x++;
			indx2++;
		}
		
		for(int i = 0, j = si; i < merged.length; i++, j++) {
			
			ara[j] = merged[i];
		}
	}
	
	public static void divide(int[] ara, int si, int ei) {
		
		if(si >= ei) {
			
			return;
		}
		
		int mid = si + (ei-si) / 2;
		
		divide(ara, si, mid);
		divide(ara, mid+1, ei);
		
		conquer(ara, si, mid, ei);
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
        int[] ara = {3, 9, 7, 6};
		
		int n = ara.length;
		
		divide(ara, 0, n-1);
		
		for(int x : ara) {
			
			System.out.print(x +" ");
		}
	}
	
}