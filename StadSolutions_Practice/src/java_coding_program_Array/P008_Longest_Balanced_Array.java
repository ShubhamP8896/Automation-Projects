package java_coding_program_Array;

import java.util.HashSet;
import java.util.Set;

public class P008_Longest_Balanced_Array
{
/**
 * You are given an integer array nums.

A subarray is called balanced if the number of distinct even numbers in the subarray is equal to the number of distinct odd numbers.

Return the length of the longest balanced subarray.
Example 1:

Input: nums = [2,5,4,3]

Output: 4

Explanation:

The longest balanced subarray is [2, 5, 4, 3].
It has 2 distinct even numbers [2, 4] and 2 distinct odd numbers [5, 3]. Thus, the answer is 4.
Example 2:

Input: nums = [3,2,2,5,4]

Output: 5

Explanation:

The longest balanced subarray is [3, 2, 2, 5, 4].
It has 2 distinct even numbers [2, 4] and 2 distinct odd numbers [3, 5]. Thus, the answer is 5.
Example 3:

Input: nums = [1,2,3,2]

Output: 3

Explanation:

The longest balanced subarray is [2, 3, 2].
It has 1 distinct even number [2] and 1 distinct odd number [3]. Thus, the answer is 3.
 */
	
	public int longestBalanced(int[] nums)
    {    
       int n = nums.length;
       int ans = 0;

        for(int i = 0; i < n; i++)
        {
            Set<Integer> evenSet = new HashSet<Integer>();
            Set<Integer> oddSet = new HashSet<Integer>();
            for(int j = i; j < n; j++)
            {
                if(nums[j]%2 == 0)
                {
                    evenSet.add(nums[j]);
                }
                else
                {
                    oddSet.add(nums[j]);
                }

                if(evenSet.size() == oddSet.size())
                {
                    ans = Math.max(ans, j - i + 1);
                }

            }
        }
        return ans;
    }

    public static void main(String [] args)
    {
    	P008_Longest_Balanced_Array sl = new P008_Longest_Balanced_Array();
        int arr [] = {1,2,3,2,4};
        
        System.out.println(sl.longestBalanced(arr));
    }

}
