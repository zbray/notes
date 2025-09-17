# Data Structures and Algorithms Notes

## Basic Data Structures

A data structure is a named location that can be used to store and organize data

Example: a family tree is a hierarchy of family relationships

An array is a collection of elements stored at contiguous memory locations

An algorithm is a collection of steps to solve a problem

example: linear search is a one by one examination of an array to find a value


## Stack data structure

Stack is a LIFO data structure - last-in, first-out
push() to add to the top
pop() to remove from the top
The LIFO structure means that if we need to access the first object at the "bottom" of the stack, we need to pop() out all the objects above it - we cannot pull what's at the bottom of the stack out from under the rest of the objects in the stack

Stacks can be implemented in java, c++, python, etc

stack.pop(); will always remove the top most object, you don't need to declare anything

stack.peek(); will return the value of the top most object in your stack

stack.search(); when you pass in an object in the stack as an argument it will return the position in the stack of that object from the top - note: first object is "1" not zero - note: passing an object not in the stack will return "-1"

## Queues
Queues are a FIFO data structure - first in, first out - whichever object is added first, is the first object to leave. A collection designed for holding objects prior to processing

concepts for queues involve enqueuing (add) and dequeueing(remove)

insert explanation for why you can't call an object queue in Java

offer() will enqueue (add) an object to the tail of our queue
poll() will remove the head object
peek() will examine and return the head object

Since we're using Queue class there are some additional methods we can use methods inherited by the Collection class

isEmpty(); will check if the queue is empty
size(); will return size of queue
contains(); will search for an return t/f if an object is in the queue - note: will not return position

uses for queues:
1. keyboard buffers - letters should appear in the order they were pressed, helpful with fast typing
2. printer queue - print jobs should be completed in order
3. LinkedLists, Priority Queues

## Priority Queues

FIFO data structure that serves elements with highest priorities first before elements with lower priority

Queues are interfaces and we can't implement them directly, so we need to use a class that utilizes the Queue interface.

Let's say we queue.offer a bunch of gpas that are not in any particular order. As a LinkedList, queue.poll will provide us the list that they were inserted in. PriorityQueue will provide them in an ordered list.

## ArrayLists
ArrayLists store elements in a contiguous memory location
Arrays are great to searching but not great at inserting elements into positions already filled. in order to insert an element into position 3 of an array with 9 elements you'd need to shift the elements one by one to make room for the blank spot you need to create to insert the new element. Same issue with deleting, you'd need to delete the element, then shift all subsequent elements one position back to fill in the blank spaces left.

## LinkedLists (singly, singly links to each node)

A LinkedList is made up of a long chain of nodes, each node contains two parts:
- some data we need to store
- an address to the next node in line (aka a "pointer")

LinkedLists do not have an index but each node contains an address to where the next node is located, each node knows where the next node resides. Think of this as a scavenger hunt or series of clues, with each entry leading to the next. You'll know you're at the tail when the address of the current node shows "null"

To insert an element into a LinkedList you'll need to make sure the new node's address points to the next node, and replace the node immediately before the new node and have that address point to the new node  you're inserting.

Similarly, to erase a node, just have the previous node point to the node after the node you want to erase.

LinkedLists are bad at searching because there are no indexes.

Searching through a LinkedList is 0(n) (linear time) because you have to search through each node until you reach the one you need. Searching through an array is constant (time to complete is the same regardless of size, searching for position 1 or searching for position 999 both take one operation)

Another variation of this is a "doubly Linkedlist"

## LinkedList (doubly)

A doubly LinkedList requires even more memory to store two addresses for each node - one for the next node and one for the previous node. The benefit here is that we can traverse the list backwards and forwards.

