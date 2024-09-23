package week8_postlab;
import java.util.Arrays;
import java.util.Comparator;

public class PriorityQueue<T> {
    private T[] heap;
    private int size;
    private Comparator<T> comparator;
    private static final int DEFAULT_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public PriorityQueue(Comparator<T> comparator) {
        this.comparator = comparator;
        this.heap = (T[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

   
    public void enqueue(T element) {
        if (size == heap.length) {
            heap = Arrays.copyOf(heap, heap.length * 2); // Resize the heap array
        }
        heap[size] = element;
        size++;
        heapifyUp(size - 1);
    }

  
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority queue is empty");
        }
        T result = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return result;
    }

   
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority queue is empty");
        }
        return heap[0];
    }


    public boolean isEmpty() {
        return size == 0;
    }

 
    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (comparator.compare(heap[index], heap[parentIndex]) < 0) {
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

  
    private void heapifyDown(int index) {
        while (index < size) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            int smallest = index;

            if (leftChildIndex < size && comparator.compare(heap[leftChildIndex], heap[smallest]) < 0) {
                smallest = leftChildIndex;
            }
            if (rightChildIndex < size && comparator.compare(heap[rightChildIndex], heap[smallest]) < 0) {
                smallest = rightChildIndex;
            }
            if (smallest != index) {
                swap(index, smallest);
                index = smallest;
            } else {
                break;
            }
        }
    }

 
    private void swap(int index1, int index2) {
        T temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }
}
