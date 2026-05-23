package SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortingAlgos {
    public static void bubbleSort(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int nums[]) {
        int n = nums.length;
        for(int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < n; j++) {
                if(nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
    }
    public static void insertionSort(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            int curr = i, prev = i - 1;
            int currValue = nums[curr];
            while(prev >= 0 && currValue < nums[prev]) {
                nums[prev + 1] = nums[prev];
                prev--;
            }
            nums[prev + 1] = currValue;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // bubbleSort(nums);
        // selectionSort(nums);
        insertionSort(nums);

        System.out.println(Arrays.toString(nums));

        sc.close();
    }
}
