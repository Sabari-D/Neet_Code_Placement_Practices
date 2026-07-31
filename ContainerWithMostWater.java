https://neetcode.io/problems/max-water-container/history?submissionIndex=0


class Solution {
    public int maxArea(int[] heights) {
        
        int maximumArea = 0;
        int left = 0, right = heights.length-1;

        while(left < right){
            int currentHeight = Math.min(heights[left], heights[right]);
            int width = right-left;
            int area = width * currentHeight;

            maximumArea = Math.max(area, maximumArea);

            if(heights[left] < heights[right])left++;
            else right--;
        }

        return maximumArea;
    }
}
