import java.util.*;

public class Q2_1_4 {
	public static void print(char[] arr) {
    for (char ele:arr) System.out.print(ele+" ");
		System.out.println();
    } 
    public static void insertionSort(char[] arr) {
        for (int i=0;i<arr.length;i++) {
			for (int j=i;j>=1;j--) {
				if (arr[j-1]>arr[j]) {
					char temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
            print(arr);
        }
    }
    public static void main(String[] args) {
        char[] arr={'E','A','S','Y','Q','U','E','S','T','I','O','N'};
		print(arr);
        insertionSort(arr);
    }
}