/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author alejandroserranol
 */
public class Array1_Exercises {
    //Exercises from: https://codingbat.com/java
    
    public boolean firstLast6(int[] nums) {
        //Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
        return nums[0]==6 || nums[nums.length-1]==6;
    }
    
    public boolean sameFirstLast(int[] nums) {
        //Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
        return nums.length>0 ? nums[0] == nums[nums.length-1] : false;
    }
    
    public int[] makePi() {
        //Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
        return new int[] {3, 1, 4};
    }
    
    public boolean commonEnd(int[] a, int[] b) {
        //Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
        return (a[0] == b[0]) || (a[a.length-1] == b[b.length-1]);
    }
    
    public int sum3(int[] nums) {
        //Given an array of ints length 3, return the sum of all the elements.
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        return sum;
    }
    
    public int[] rotateLeft3(int[] nums) {
        //Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
        int num = nums[0];
        for (int i=0; i<nums.length; i++) {
            if(i<nums.length-1){
                nums[i] = nums[i+1];
            } else {
                nums[i] = num;
            }
        }
        return nums;
    }
    
    public int[] reverse3(int[] nums) {
        //Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
        int num = nums[0];
        for (int i=0; i<nums.length; i++) {
            if(i<nums.length-1){
                nums[i] = nums[nums.length-1-i];
            } else {
                nums[i] = num;
            }
        }
        return nums;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
