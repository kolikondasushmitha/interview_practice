def countValues(nums):
    pos=[]
    neg=[]
    for i in range(len(nums)):
        if nums[i] > 0:
            pos.append(nums[i])
        elif nums[i]<0:
            neg.append(nums[i])
    if len(pos)> len(neg):
        return len(pos)
    else:
        return len(neg)
nums=[-1,-3,-1,10,0,0,-4]
print(countValues(nums))
