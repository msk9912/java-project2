package week5.algorithm;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};

        for (int j = 0; j < arr.length - 1; j++) {
            int targetValue = arr[0];
            int targetIdx = 0;
            for (int i = j + 1; i < arr.length; i++) {
                if(targetValue > arr[i]){
                    targetValue = arr[i];
                    targetIdx = i;
                }
            }
            int temp = arr[0];
            arr[0] = arr[targetIdx];
            arr[targetIdx] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

}
