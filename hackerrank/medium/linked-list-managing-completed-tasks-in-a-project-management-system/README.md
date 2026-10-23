# Linked List - Managing Completed Tasks in a Project Management System

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are developing a project management application for a team of software developers. In this application, tasks are represented by unique IDs, and team members can add tasks to their project. As tasks are completed, they need to be removed from the task list to maintain an organized view of ongoing tasks. The team wants to delete the completed tasks from the end of the list, ensuring they focus only on active work.

Write a program to manage the deletion of completed tasks from the end of the task list. After all deletions, print the updated list of remaining task IDs to show which tasks are still pending. If the list is empty, Print the message as “List is empty”.

 **Input Format** 

- The first line contains an integer N, the number of task IDs to be initially added to the task list.
- The second line contains N space-separated integers representing the task IDs.
- The third line contains an integer M, the number of completed tasks to be deleted from the end of the list.

 **Constraints** 

NA

 **Output Format** 

After completing all deletions, print the current task list with elements separated by a space.

 **Sample Input 0** 

```
6
201 202 203 204 205 206
4

```

 **Sample Output 0** 

```
201 202

```

 **Explanation 0** 

The initial task list contains 6 task IDs: 201 202 203 204 205 206. After the first deletion, the task ID 206 (the last task) is removed. After the second deletion, the task ID 205 is removed. After the third deletion, the task ID 204 is removed. After the fourth deletion, the task ID 203 is removed. Finally, the remaining task list contains 201 202, indicating these are the active tasks left to complete.

 **Sample Input 1** 

```
5
101 102 103 104 105
5

```

 **Sample Output 1** 

```
List is empty

```

 **Explanation 1** 

The initial task list contains 5 task IDs: 101, 102, 103, 104, 105.After the first deletion, the task ID 105 (the last task) is removed from the list.After the second deletion, the task ID 104 is removed.After the third deletion, the task ID 103 is removed.After the fourth deletion, the task ID 102 is removed.After the fifth deletion, the task ID 101 is removed, which is the only task left in the list.Finally, after all deletions, the list becomes empty, indicating that all tasks have been completed and there are no active tasks left to work on. Thus, the output will be "List is empty."

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T02:14:00.287Z  

```py

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

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/linked-list-managing-completed-tasks-in-a-project-management-system/problem)