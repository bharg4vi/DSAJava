import java.util.Arrays;

class Solution {
    public void InsertionSort(int[] array) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }
}
public class InsertionSort
{
    public static void main(String[] args) {
        Solution m = new Solution();
        int[] arr = {2,3,4,1,5,6};
        m.InsertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
