package min_and_max;

interface MinMax<T extends Comparable<T>> {
    T findMin(T[] array);
    T findMax(T[] array);
}