
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class LinkedList:
    def __init__(self):
        self.head = None

    def insert(self, data):
        new_node = Node(data)

        if self.head is None:
            self.head = new_node
            return

        temp = self.head
        while temp.next is not None:
            temp = temp.next

        temp.next = new_node

    def delete(self, k):
        if k <= 0 or self.head is None:
            return

        temp = self.head
        n = 0

        while temp is not None:
            n += 1
            temp = temp.next

        if k >= n:
            self.head = None
            return

        temp = self.head
        for i in range(n - k - 1):
            temp = temp.next

        temp.next = None

    def display(self):
        if self.head is None:
            print("List is empty")
            return

        temp = self.head
        while temp is not None:
            print(temp.data, end=" ")
            temp = temp.next


if __name__ == "__main__":
    l = LinkedList()

    n = int(input())
    arr = list(map(int, input().split()))

    for ele in arr:
        l.insert(ele)

    m = int(input())
    l.delete(m)
    l.display()
