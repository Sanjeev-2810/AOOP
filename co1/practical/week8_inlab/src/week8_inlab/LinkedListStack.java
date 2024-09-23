package week8_inlab;

class LinkedListStack<T> implements GenericStack<T> {
 private static class Node<T> {
     private T data;
     private Node<T> next;

     public Node(T data) {
         this.data = data;
         this.next = null;
     }
 }

 private Node<T> top;

 public LinkedListStack() {
     top = null;
 }

 @Override
 public void push(T element) {
     Node<T> newNode = new Node<>(element);
     newNode.next = top;
     top = newNode;
 }

 @Override
 public T pop() {
     if (isEmpty()) {
         throw new IllegalStateException("Stack is empty");
     }
     T data = top.data;
     top = top.next;
     return data;
 }

 @Override
 public T peek() {
     if (isEmpty()) {
         throw new IllegalStateException("Stack is empty");
     }
     return top.data;
 }

 @Override
 public boolean isEmpty() {
     return top == null;
 }
}
