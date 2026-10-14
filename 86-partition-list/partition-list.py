# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def partition(self, head: ListNode | None, x: int) -> ListNode | None:
        dummy = ListNode(0)
        dummy2 = ListNode(0)
        temp = head
        p1 = dummy
        p2 = dummy2
        while(temp is not None):
            next_node = temp.next
            if(temp.val<x):
                p1.next = temp
                p1 = p1.next
            elif(temp.val>=x):
                p2.next = temp
                p2 = p2.next
            temp = next_node
        p2.next = None
        p1.next = dummy2.next
        return dummy.next
            