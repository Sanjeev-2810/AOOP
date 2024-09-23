package week8_postlab;
public class PriorityQueueTest {
    public static void main(String[] args) {
       
        PriorityQueue<Integer> intPQ = new PriorityQueue<>(Integer::compareTo);
        System.out.println("Testing PriorityQueue with Integer:");
        intPQ.enqueue(10);
        intPQ.enqueue(5);
        intPQ.enqueue(20);
        System.out.println("Peek: " + intPQ.peek());
        System.out.println("Dequeue: " + intPQ.dequeue()); 
        System.out.println("Peek: " + intPQ.peek()); 

      
        PriorityQueue<Double> doublePQ = new PriorityQueue<>(Double::compareTo);
        System.out.println("\nTesting PriorityQueue with Double:");
        doublePQ.enqueue(10.5);
        doublePQ.enqueue(5.1);
        doublePQ.enqueue(20.9);
        System.out.println("Peek: " + doublePQ.peek()); 
        System.out.println("Dequeue: " + doublePQ.dequeue());
        System.out.println("Peek: " + doublePQ.peek()); 

       
        PriorityQueue<String> stringPQ = new PriorityQueue<>(String::compareTo);
        System.out.println("\nTesting PriorityQueue with String:");
        stringPQ.enqueue("banana");
        stringPQ.enqueue("apple");
        stringPQ.enqueue("cherry");
        System.out.println("Peek: " + stringPQ.peek()); 
        System.out.println("Dequeue: " + stringPQ.dequeue());
        System.out.println("Peek: " + stringPQ.peek()); 
    }
}
