class Solution:
    def rotateRight(self, head: ListNode | None, k: int) -> ListNode | None:
        if head is None:
            return head
        temp = head
        n = 0
        while(temp is not None):
            n+=1
            temp = temp.next
        k = k%n
        if(k==0):
            return head
        curr = head
        for i in range(n-k-1):
            curr = curr.next
        new_head = curr.next
        temp = new_head
        curr.next = None
        while(temp.next is not None):
            temp = temp.next
        temp.next = head
        return new_head


