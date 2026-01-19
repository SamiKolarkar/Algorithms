import java.util.*;

public class Q2_1_1 {
	public static void print(char[] arr) {
    for (char ele:arr) System.out.print(ele+" ");
		System.out.println();
    } 
    public static void selectionSort(char[] arr) {
        for (int i=0;i<arr.length-1;i++) {
            char min=(char)91;
            int minIdx=-1;
            for (int j=i+1;j<arr.length;j++) {
                if (arr[j]<min) {
                    min=arr[j];
                    minIdx=j;
                }
            }
            arr[minIdx]=arr[i];
            arr[i]=min;
            print(arr);
        }
    }
    public static void main(String[] args) {
        char[] arr={'E','A','S','Y','Q','U','E','S','T','I','O','N'};
		print(arr);
        selectionSort(arr);
    }
}
