package TemplateAndStrategy.template.impl;

import TemplateAndStrategy.template.BubbleSorter;

public class DoubleBubbleSorterImpl extends BubbleSorter {

    //<editor-fold desc="properties">
    private double[] nums;

    public double[] getNums() {
        return nums;
    }

    public void setNums(double[] nums) {
        this.nums = nums;
    }
    //</editor-fold>

    public double[] sort() {
        this.lengthOfArray = nums.length;
        this.doSort();
        return nums;
    }

    @Override
    protected void outOfOrder(int index) {
        if (nums[index] > nums[index + 1]) {
            swap(index);
        }

    }

    @Override
    protected void swap(int index) {
        double temp = nums[index];
        nums[index] = nums[index + 1];
        nums[index + 1] = temp;
    }
}
