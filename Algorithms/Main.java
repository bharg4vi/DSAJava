import java.util.Arrays;

class Solution {
    public int[] BubbleSort(int[] arr)
    {
        int temp =0;
        for(int i =0; i < arr.length; i++)
        {
            for(int j =i+1; j < arr.length; j++)
            {
                if (arr[i]>arr[j])
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }
            }
        }
        return arr;
    }
}
public class Main
{
    public static void main(String[] args) {
        Solution m = new Solution();
        int[] arr = {2,3,4,1,5,6};
        System.out.println(Arrays.toString(m.BubbleSort(arr)));

    }
}
