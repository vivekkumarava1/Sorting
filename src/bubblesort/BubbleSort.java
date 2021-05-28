package bubblesort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12, 8, 16, 5, 2};
        BubbleSort obj = new BubbleSort();
        obj.bubbleSort(arr);
        System.out.println("sorted --> " + Arrays.toString(arr));


    }

    public void bubbleSort(int[] arr) {
        //step 1
        for (int i = 0; i < arr.length; i++) {
            //step 2
            for (int j = 0; j < arr.length - 1-i; j++) {
                //step 3
                if (arr[j] > arr[j + 1]) {
                    System.out.println("swapping --> "+arr[j]+ "with--> "+arr[j+1]);
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
                else {
                    System.out.println("no swap");
                }
                System.out.println(Arrays.toString(arr));
            }
            System.out.println("after "+ (i+1) + " iterate");
            System.out.println(Arrays.toString(arr));

        }
    }
}
