package week8_inlab;
public class StackTest {
    public static void main(String[] args) {
        GenericStack<Integer> intArrayStack = new ArrayStack<>();
        System.out.println("Testing ArrayStack with Integer:");
        intArrayStack.push(10);
        intArrayStack.push(20);
        intArrayStack.push(30);
        System.out.println("Peek: " + intArrayStack.peek()); 
        System.out.println("Pop: " + intArrayStack.pop());   
        System.out.println("IsEmpty: " + intArrayStack.isEmpty()); 

        GenericStack<Integer> intLinkedListStack = new LinkedListStack<>();
        System.out.println("\nTesting LinkedListStack with Integer:");
        intLinkedListStack.push(10);
        intLinkedListStack.push(20);
        intLinkedListStack.push(30);
        System.out.println("Peek: " + intLinkedListStack.peek()); 
        System.out.println("Pop: " + intLinkedListStack.pop());  
        System.out.println("IsEmpty: " + intLinkedListStack.isEmpty()); 

        GenericStack<String> stringArrayStack = new ArrayStack<>();
        System.out.println("\nTesting ArrayStack with String:");
        stringArrayStack.push("apple");
        stringArrayStack.push("banana");
        stringArrayStack.push("cherry");
        System.out.println("Peek: " + stringArrayStack.peek()); 
        System.out.println("Pop: " + stringArrayStack.pop());  
        System.out.println("IsEmpty: " + stringArrayStack.isEmpty()); 

        GenericStack<String> stringLinkedListStack = new LinkedListStack<>();
        System.out.println("\nTesting LinkedListStack with String:");
        stringLinkedListStack.push("alpha");
        stringLinkedListStack.push("beta");
        stringLinkedListStack.push("gamma");
        System.out.println("Peek: " + stringLinkedListStack.peek()); 
        System.out.println("Pop: " + stringLinkedListStack.pop());  
        System.out.println("IsEmpty: " + stringLinkedListStack.isEmpty()); 
    }
}
