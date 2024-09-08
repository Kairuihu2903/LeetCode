class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """

        
        left = 0 
        right = len(height)-1
        largest = 0

        while left < right:
            w = right - left
            h = min(height[left], height[right])
            area = h * w;
            largest = max(largest , area)
            if height[left] < height[right]:
                left += 1
                
            elif height[left] > height[right]:
                right -= 1

            else:
                left += 1
                right -= 1
        return largest