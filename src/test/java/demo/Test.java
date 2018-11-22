package demo;

import java.util.Arrays;

public class Test {
    int num[] = {3,9,5,4,1,8,2,6};
    @org.junit.Test
    public void bubbleSort(){
        for (int i = 0;i<num.length-1;i++){
            for (int j = 0;j<num.length-1-i;j++){
                int tmp = 0;
                if (num[j]<num[j+1]){
                    tmp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = tmp;
                }
            }
            System.out.println(num[num.length-1-i]);
        }
    }

    @org.junit.Test
    public void quickSort(){
        quickSort1(num,0,num.length-1);
        System.out.println(Arrays.toString(num));
    }

    public void quickSort1(int[] arr,int start,int end){
        if (start!=end){
            int stand = arr[start];
            int low = start;
            int high = end;
            while (low<high){
                while (low<high&&stand<arr[high]){
                    high--;
                }
                arr[low] = arr[high];
                while (low<high&&stand>arr[low]){
                    low++;
                }
                arr[high] = arr[low];
            }
            arr[low] = stand;
            quickSort1(arr,start,low);
            quickSort1(arr,low+1,end);
        }
    }

}
