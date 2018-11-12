package TemplateAndStrategy.template;


/**
 * Raw implementation of bubblesort algorithm:
 * This  algorithm is very simple and ineffecient. Cost of this algorithm is n*2.
 * Algorithm works by simply pushing largest element in  a subset of array to the end till it exhausts the list of elements;
 */
public class BubbleSortRaw {

    private static int[] sort(int[] nums) {

        for (int nextToLast = nums.length - 2; nextToLast >= 0; nextToLast--) {
            for (int i = 0; i <= nextToLast; i++) {
                compareAndSwap(nums, i);
            }
        }

        return nums;
    }

    private static void swap(int[] nums, int index) {

        int temp = nums[index];
        nums[index] = nums[index+1];
        nums[index+1] = temp;
    }

    private static void compareAndSwap(int[] nums, int index) {
        if (nums[index] > nums[index + 1]) {
            swap(nums, index);
        }

    }

    public static void main(String[] args){
        int[] arr = new int[]{12,3,41,2,4};
        int[] sortedArr = sort(arr);

        for(int i =0; i<sortedArr.length;i++){
            System.out.print(sortedArr[i] + " ,");
        }

    }
}
