class Solution(object):
    def rob(self, nums):
        robbing, norobbing = 0, 0
        #init rob and norob
        for num in nums:
        # iterate though nums
            newRobbing = norobbing + num
            #
            newNoRobbing = max(norobbing, robbing)
            robbing, norobbing = newRobbing, newNoRobbing
        return max(robbing, norobbing)
        