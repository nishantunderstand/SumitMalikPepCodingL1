package a5b_Array;

import java.util.Arrays;
/**
 * Unsorted - Convert to Sorted
 * Sorted - I can solve
 * 2 Pointer we can, Fast and Slow pointer
 */


/** 
We need to think, Is Next Element Duplicate of Current Element, If then remove it.
How these Code is Different From LeetCode.
LeetCode is telling to bring those number in Front.
*/
public class RemoveDuplicateInArray_InPlace{
	public static void main(String[] args) throws Exception{
		int nums[] = { 10,10,10,10, 20,20, 30, 30,40,50,60,60,60 };
		System.out.println(Arrays.toString(nums));
		if (nums.length <= 0) {
            throw new Exception("Invalid Array");
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
		System.out.println("Array After Removing Duplicate:");
		for(int k=0;k<=i;k++){
			System.out.print(nums[k]+" ");
			//System.out.print(nums[k]);
		}
	}
}


