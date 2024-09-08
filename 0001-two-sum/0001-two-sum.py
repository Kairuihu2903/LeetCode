class Solution(object):
    def twoSum(self, nums, target):
        mylist = []
        for index, value in enumerate(nums):
            for index2, value2 in enumerate(nums):
                if not mylist and index != index2 and value + value2 == target and index:
                    mylist.append(index)
                    mylist.append(index2)
        return mylist



        