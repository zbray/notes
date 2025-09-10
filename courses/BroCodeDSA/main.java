import java.util.Stack;
public class main{
  public static void main(String[] args) {

    Stack<String> stack = new Stack<String>();

    stack.push("Minecraft");
    stack.push("Skyrim");
    stack.push("DOOM");
    stack.push("Borderlands");
    stack.push("FFVII");
    // String myFavGame = stack.pop();
    // System.out.println(stack.peek());
    // System.out.println(stack);
    // System.out.println(myFavGame);
    // System.out.println(stack.search("Fallout"));
  
    for (int i = 0; i < 1000000000; i++) {
      stack.push("Skyrim");
    }
    System.out.println(stack);
  }
}

