import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ArrayListImpl<E> {

    private final int DEFAULT_CAPACITY = 10;

    private final Object[] EMPTY_ELEMENTDATA = {};

    private final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    private final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    Object[] elementData;

    private int size;

    public ArrayListImpl(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity :" + initialCapacity);
        }
    }

    public ArrayListImpl() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    private Object[] grow(int minCapacity) {
        return elementData = Arrays.copyOf(elementData, newCapacity(minCapacity));
    }

    private Object[] grow() {
        return grow(size + 1);
    }

    private int newCapacity(int minCapacity) {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1); // newCapacity = 기존 용량에서 + 기존 용량 * 1.5
        if (newCapacity - minCapacity <= 0) {
            if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
                return Math.max(DEFAULT_CAPACITY, minCapacity);
            }
            if (minCapacity < 0) {
                throw new OutOfMemoryError();
            }
            return minCapacity;
        }
        return (newCapacity - MAX_ARRAY_SIZE <= 0)
            ? newCapacity
            : hugeCapacity(minCapacity);
    }

    private int hugeCapacity(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        return (minCapacity > MAX_ARRAY_SIZE)
            ? Integer.MAX_VALUE
            : MAX_ARRAY_SIZE;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    E elementData(int index) {
        return (E) elementData[index];
    }

    public E get(int index) {
        Objects.checkIndex(index, size);
        return elementData(index);
    }

    public E set(int index, E element) {
        Objects.checkIndex(index, size);
        E oldValue = elementData(index);
        elementData[index] = element;
        return oldValue;
    }

    private void add(E e, Object[] elementData, int s) {
        if (s == elementData.length) {
            elementData = grow();
        }
        elementData[s] = e;
        size = s + 1;
    }

    public boolean add(E e) {
//        modCount++; 몇번 바뀌었는지 AbstractList에 구현
        add(e, elementData, size);
        return true;
    }

    public E remove(int index) {
        Objects.checkIndex(index, size);
        final Object[] es = elementData;

        E oldValue = (E) es[index];
        fastRemove(es, index);

        return oldValue;
    }

    private void fastRemove(Object[] es, int i) {
        final int newSize;
        if ((newSize = size - 1) > i) {
            System.arraycopy(es, i + 1, es, i, newSize - i);
        }
        es[size = newSize] = null;
    }

    public void clear() {
        final Object[] es = elementData;
        for (int to = size, i = size = 0; i < to; i++) {
            es[i] = null;
        }
    }

    @Override
    public String toString() {
        return "ArrayListImpl{" +
            "DEFAULT_CAPACITY=" + DEFAULT_CAPACITY +
            ", EMPTY_ELEMENTDATA=" + Arrays.toString(EMPTY_ELEMENTDATA) +
            ", DEFAULTCAPACITY_EMPTY_ELEMENTDATA=" + Arrays
            .toString(DEFAULTCAPACITY_EMPTY_ELEMENTDATA) +
            ", MAX_ARRAY_SIZE=" + MAX_ARRAY_SIZE +
            ", elementData=" + Arrays.toString(elementData) +
            ", size=" + size +
            '}';
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        ArrayListImpl<Integer> arrayList = new ArrayListImpl<>();
        arrayList.add(1);
        arrayList.add(2);
        System.out.println(arrayList);

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println("arrayList.size() = " + arrayList.size());

    }

}
