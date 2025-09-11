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

