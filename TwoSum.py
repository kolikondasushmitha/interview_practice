def twoSum(nums, target):
        li=[]

        for i in range(len(nums)):
                # print(nums[i])
                for j in range(i+1,len(nums)):
                    # print(nums[j])
                    if nums[i]+nums[j]==target:

                        li.append(i)
                        li.append(j)

        return li

nums=[3,2,4]  #target=6
nums=[2,7,11,15]   #target=9
nums=[3,3]        #target=6
print(twoSum(nums,6))