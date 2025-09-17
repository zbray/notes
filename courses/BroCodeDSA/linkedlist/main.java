// LinkedListTutorial.java
// A simple tutorial demonstrating Java's LinkedList

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<String>();
      //   linkedList.push("A");
      //   linkedList.push("B");
      //   linkedList.push("C");
      //   linkedList.push("D");
      //   linkedList.push("F");
      //   linkedList.pop();
                           
        linkedList.push("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
      //   linkedList.poll();
      //   linkedList.pop();
      linkedList.add(4, "E");
      System.out.print(linkedList);
              
      linkedList.remove("E");
      System.out.print(linkedList);
      
      System.out.println(linkedList.indexOf("F"));

      System.out.println(linkedList.peekFirst());
      System.out.println(linkedList.peekLast());
      linkedList.addFirst("0");
      linkedList.addLast("G");
      
      String first = linkedList.removeFirst();
      String last = linkedList.removeLast();


      System.out.print(linkedList);
      }
}
