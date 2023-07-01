package RecursionPractice;

import java.util.Arrays;

public class merge_quickSort {
    public static void main(String[] args) {

    }

    static int[] mergeSort(int[] arr){
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0 , mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left , right);
    }
    private static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length){
            if (first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
//    merge Sort using inPlace

    public int[] mergeInPlace(int[] arr, int s, int e){
        if (arr.length == 1){
            return arr;
        }

        int mid = (s + e) / 2;

        mergeInPlace(arr, s, mid);
        mergeInPlace(arr, mid, e);

        mergeInPlace1(arr, s, mid, e);
        return arr;
    }
    private static void mergeInPlace1(int[] arr, int s, int mid, int e){
        int[] mix = new int[e - s];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < mid && j < e){
            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else {
                mix[k] = arr[j];
            }
            k++;
        }

        while (i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < arr.length ; l++) {
            arr[s + l] = mix[l];

        }
    }
}
