class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode()
        current = dummy
        carry = 0
        
        while l1 or l2 or carry:
        # Get the values of the current nodes, or 0 if the node is missing
            if l1:
                val1 = l1.val
                
            else:
                val1 = 0

            if l2:
                val2 = l2.val
            else:
                val2 = 0

            # Calculate the sum and carry
            total = val1 + val2 + carry
            carry = total // 10
            res_digit = total % 10

            # Add result digit to the result list
            current.next = ListNode(res_digit)
            current = current.next
             
            if l1: l1 = l1.next
            if l2: l2 = l2.next
            # Return the result list starting from dummy's next node
        return dummy.next
    l1 = [2,4,3], l2 = [5,6,4]
    print(addTwoNumbers(l1,l2))