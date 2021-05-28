package insertionsort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] ={12,8,16,2,5};
        System.out.println("unsorted --> "+ Arrays.toString(arr));
        InsertionSort obj = new InsertionSort();
        obj.insertionSort(arr);
        System.out.println("sorted -->" +Arrays.toString(arr));
    }
    public void insertionSort(int arr[]){
        int sortedIndex = 0;
        for (int unsortedIndex = 1; unsortedIndex < arr.length; unsortedIndex++) {
            //step 3
            int nextElement = arr[unsortedIndex];
            for (int j = unsortedIndex; j >0; j--) {
                //step5
                if(arr[j] < arr[j-1]){
                    System.out.println("swaping--> " + arr[j] + " with --> "+ arr[j-1]);
                    //step 6
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    System.out.println("Breaking because--> "+ arr[j]+ "is greater then or equal"+ arr[j-1]);
                    break;
                }

            }
        }

    }
}
