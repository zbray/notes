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

