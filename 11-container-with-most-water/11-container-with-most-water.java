class Solution {
    public int maxArea(int[] height) {
        int max = 0, left =0 , right=height.length-1;
        while(left<right){
            max=Math.max(Math.min(height[left],height[right])*(right-left),max);
            if(height[left]<=height[right])
                left++;
            else
                right--;
        }
        return max;
        
    }
}