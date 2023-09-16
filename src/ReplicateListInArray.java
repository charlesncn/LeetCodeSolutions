import java.util.Arrays;

public class ReplicateListInArray {
//define an interface with operations of a list
    public interface List<E> {
        int size();

        boolean isEmpty();

        boolean contains(E element);

        void add(E element);

        void remove(E element);

        E get(int index);

        void set(int index, E element);

        void clear();

    }

    public static class ArrayList<E> implements List<E> {
        private static final int INIT_CAPACITY = 10;
        private Object[] array;
        private int size;

        public ArrayList() {
            array = new Object[INIT_CAPACITY];
            size = 0;
        }

        private void ensureCapacity() {
            if (size == array.length) {
                int newCapacity = array.length * 2;
                array = Arrays.copyOf(array, newCapacity);
            }

        }

        @Override
        public int size() {
            return size;
        }

        @Override
        public boolean isEmpty() {
            return size == 0;
        }

        @Override
        public boolean contains(E element) {
            for (int i = 0; i < size; i++)
                if (array[i].equals(element))
                    return true;
            return false;
        }

        @Override
        public void add(E element) {
            ensureCapacity();
            array[size] = element;
            size++;
        }

        @Override
        public void remove(E element) {
            for (int i = 0; i < size; i++) {
                if (array[i].equals(element)) {
                    for (int j = i; j < size; j++) {
                        array[j] = array[j + 1];
                    }
                    array[size - 1] = null; // remove the last element
                    size--;
                    return;
                }
            }

        }

        @Override
        public E get(int index) {
            if (index < 0 || index > size)
                throw new IndexOutOfBoundsException("Index out of bounds");
            return (E) array[index];
        }

        @Override
        public void set(int index, E element) {
            if (index < 0 || index > size)
                throw new IndexOutOfBoundsException("Index out pf bounds");
            array[index] = element;
        }

        @Override
        public void clear() {
            Arrays.fill(array, 0, size, null);
            size = 0;
        }
    }
}
