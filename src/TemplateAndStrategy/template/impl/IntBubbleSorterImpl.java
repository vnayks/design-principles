package TemplateAndStrategy.template.impl;

import TemplateAndStrategy.template.BubbleSorter;

public class IntBubbleSorterImpl extends BubbleSorter {

    //<editor-fold desc="properties">
    private int[] nums;

    public int[] getNums() {
        return nums;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }
    //</editor-fold>

    public int[] sort(){
        this.lengthOfArray = nums.length;
        this.doSort();
        return nums;
    }

    @Override
    protected void outOfOrder(int index) {
        if(nums[index]>nums[index+1]){
            swap(index);
        }
    }

    @Override
    protected void swap(int index) {
        int temp = nums[index];
        nums[index] = nums[index+1];
        nums[index+1] = temp;
    }
}
