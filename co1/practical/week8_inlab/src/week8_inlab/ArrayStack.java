package week8_inlab;
import java.util.Arrays;

class ArrayStack<T> implements GenericStack<T> {
 private T[] array;
 private int top;
 private static final int DEFAULT_CAPACITY = 10;

 @SuppressWarnings("unchecked")
 public ArrayStack() {
     array = (T[]) new Object[DEFAULT_CAPACITY];
     top = -1;
 }

 @Override
 public void push(T element) {
     if (top == array.length - 1) {
         array = Arrays.copyOf(array, array.length * 2); 
     }
     array[++top] = element;
 }

 @Override
 public T pop() {
     if (isEmpty()) {
         throw new IllegalStateException("Stack is empty");
     }
     return array[top--];
 }

 @Override
 public T peek() {
     if (isEmpty()) {
         throw new IllegalStateException("Stack is empty");
     }
     return array[top];
 }

 @Override
 public boolean isEmpty() {
     return top == -1;
 }
}

