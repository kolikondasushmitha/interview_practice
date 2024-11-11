def findMedianSortedArrays(nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        m = sorted(nums1 + nums2)
        
        # Calculate the length of the merged array
        length = len(m)
        
        # If the length is odd, return the middle element
        if length % 2 == 1:
            return float(m[length // 2])
        
        # If the length is even, return the average of the two middle elements
        else:
            mid1, mid2 = (length // 2) - 1, length // 2
            return (m[mid1] + m[mid2]) / 2.0
        
    
nums1=[1,3]
nums2=[2]
print(findMedianSortedArrays(nums1,nums2))