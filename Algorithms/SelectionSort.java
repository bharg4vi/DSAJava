import java.util.Arrays;

class Solution {
    public int[] SelectionSort(int[] arr)
    {
        int temp;
        int minIndex;
        for(int i =0; i < arr.length; i++)
        {
            minIndex =i;
            for(int j =i+1; j < arr.length-1; j++)
            {

               if(arr[j]<arr[i])
               {
                   minIndex = j;
               }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
        return arr;
    }
}
public class InsertionSort
{
    public static void main(String[] args) {
        Solution m = new Solution();
        int[] arr = {2,3,4,1,5,6};
        System.out.println(Arrays.toString(m.SelectionSort(arr)));

    }
}
