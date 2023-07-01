package RecursionPractice;


import java.util.ArrayList;

public class practice {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 9, 12};
        int[] arr1 = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(sorted(arr, 0));
        System.out.println(linearSearch(arr, 0, 2));
        linearSearch1(arr, 0, 2);
        System.out.println(list);
        System.out.println(rotatedBinary(arr1 , 12, 0, arr.length - 1));
    }
//    checking arr sorted or not using recursion
    static boolean sorted(int[] arr , int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }
// linear Search using recursion
    static int linearSearch(int[] arr, int index, int target){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        return linearSearch(arr, index + 1, target);
    }
//    adding all target indexes using recursion in arraylist
    static ArrayList<Integer> list = new ArrayList<>();
    static void linearSearch1(int[] arr, int index, int target){
        if (index == arr.length){
            return;
        }
        if (arr[index] == target){
            list.add(index);
        }
        linearSearch1(arr, index + 1, target);
    }
// IMPORTANT searching in rotated array using binary seerch in recursion
    static int rotatedBinary(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }


        if (arr[s] <= arr[mid]) {
            if (target >= arr[s] && target <= arr[mid]) {
                return rotatedBinary(arr, target, s, mid - 1);
            } else {
                return rotatedBinary(arr, target, mid + 1, e);
            }
        }

        if (target >= arr[mid] && target <= arr[e]){
            return rotatedBinary(arr, target, mid + 1 , e);
        }

        return rotatedBinary(arr, target, s, mid - 1);
    }
}
