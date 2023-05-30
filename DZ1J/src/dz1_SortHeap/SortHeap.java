package dz1_SortHeap;

import java.util.concurrent.ThreadLocalRandom;

public class SortHeap {

    private void sortingHeap(int arr[]) {
	
	int N = arr.length;
	
	for (int root = N / 2 - 1; root >= 0; root--) {
	    topSearch(arr, N, root);
	    }
	
	for (int root = N - 1; root >= 0; root--) {
	    int tmp = arr[0];
	    arr[0] = arr[root];
	    arr[root] = tmp;
	    topSearch(arr, root, 0);
	    }
    }
    
    private void topSearch(int arr[], int N, int root) {
	
	int vertex = root;
	int left = 2 * root + 1;
	int right = 2 * root + 2;
	
	if (left < N && arr[left] > arr[vertex]) vertex = left;
	
	if (right < N && arr[right] > arr[vertex]) vertex = right;
	
	if (vertex != root) {
	    int tmp = arr[root];
	    arr[root] = arr[vertex];
	    arr[vertex] = tmp;
	    
	    topSearch(arr, N, vertex);
	}
    }
    
    public static void printArr(int arr[]) {
	
	int N = arr.length;
	
	for (int i = 0; i < N - 1; i++) {
	    System.out.print(arr[i] + " ");
	}
	System.out.println();
    }
    
    public static void main(String [] args) {
	
	int N = 32;
	int [] arr = new int[N];
	
	for (int i = 0; i < N; i++) {
	    arr[i] = ThreadLocalRandom.current().nextInt(1, 100);
	}
	
	System.out.println("Source array is: ");
	printArr(arr);
	
	SortHeap heap = new SortHeap();
	heap.sortingHeap(arr);
	
	System.out.println("Sorted array is: ");
	printArr(arr);
    }
}

