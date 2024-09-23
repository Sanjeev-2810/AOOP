package week8_inlab;

public interface GenericStack<T> {
 void push(T element);   
 T pop();                
 T peek();             
 boolean isEmpty();     
}
