class Solution {
    public int search(int[] nums, int target) {
        int left = 0 , right = nums.length-1;
        int mid = (left+right)/2;
        while(left<=right)
        {
            mid = (left+right)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[left]<=nums[mid])
            {
               if(target>nums[mid] || target < nums[left])
                   left = mid+1;
                else
                    right = mid-1;
            }
            else
            {
                if(target<nums[mid] || target > nums[right])
                    right = mid-1;
                else
                    left= mid+1;
                    
            }
                
           
        }
        
        return -1;
    }
}