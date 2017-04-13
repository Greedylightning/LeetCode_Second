package java.util;

import java.io.Serializable;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import com.sun.xml.internal.bind.v2.model.runtime.RuntimeAttributePropertyInfo;

public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable{
    
    private static final long serialVeriosnUID;

    private static final int DEFAULT_CAPACITY = 10;

    private static final Object[] EMPTY_ELEMENTDATA = {};

    transient Object[] elementData;

    private int size;                                           //actual list size

    public ArrayList(){
        super();
        this.elementData = EMPTY_ELEMENTDATA;
    }

    public ArrayList(int initialCapacity){
        super();
        if(initialCapacity < 0) throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        this.elementData = new Object[initialCapacity];

    }

    public ArrayList(Collection<? extends E> c){
        elementData = c.toArray();
        size = elementData.length;
        if(elementData.getClass() != Object[].class) elementData = Arrays.copyOf(elementData, size, Object[].class);
    }

    public void trimToSize(){
        modCount++;
        int oldCapacity = elementData.length;
        if(size < oldCapacity) elementData = Arrays.copyOf(elementData, size);
    }

    public void ensureCapacity(int minCapacity){
        modCount++;
        int oldCapacity = elementData.length;
        if(minCapacity > oldCapacity){
            int newCapacity = (oldCapacity * 3) / 2 + 1;
            if(newCapacity < minCapacity) newCapacity = minCapacity;
            elementData = Arrays.copyOf(elementData, newCapacity);
        }
    }

    public boolean add(E e){
        ensureCapacity(size + 1);
        elementData[size++] = e;
    }

    public int size(){return size;}

    public boolean contains(Object o){
        return indexOf(o) >= 0;
    }

    public boolean isEmpty(){return size == 0;}

    public int indexOf(Object o){
        if(o == null){
            for(int i = 0; i < size; i++){
                if(elementData[i] == null) return i;
            }
        }
        else{
            for(int i = 0; i < size; i++){
                if(o.equals(elementData[i])) return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object o){
        if(o == null){
            for(int i = size - 1; i >= 0; i--){
                if(elementData[i] == null) return i;
            }
        }
        else{
            for(int i = size - 1; i >= 0; i--){
                if(o.equals(elementData[i])) return i;
            }
        }
        return -1;
    }

    public Object[] toArray(){
        return Arrays.copyOf(elementData, size);
    }

    public <T> T[] toArray(T[] a){
        if(a.length < size) return Arrays.copyOf(elementData, size, a.getClass());
        System.arraycopy(elementData, 0, a, 0, size);
        if(a.length > size) a[size] = null;
        return a;
    }

    public E get(int index){
        RangeCheck(index);
        return (E) elementData[index];
    }

    public E set(int index, E element){
        RangeCheck(index);
        E oldValue = (E) elementData[index];
        elementData[index] = element;
        return oldValue;
    }

    public boolean add(int index, E e){
        if(index > size || index < 0) throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        ensureCapacity(size + 1);
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = e;
        size++;
    }

    public E remove(int index){
        RangeCheck(index);
        modCount++;
        E oldValue = (E) elementData[index];
        int numMoved = size - index - 1;
        if(numMoved > 0) System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        elementData[--size] = null;
        return oldValue;
    }

    public boolean remove(Object o){
        if(o == null){
            for(int i = 0; i < size; i++){
                if(elementData[i] == null){
                    fastRemove(i);
                    return true;
                }
            }
        }
        else{
            for(int i = 0; i < size; i++){
                if(o.equals(elementData[i])){
                    fastRemove(i);
                    return true;
                }
            }
        }
        return false;
    }
    
    private void fastRemove(int index){
        modCount++;
        int numMoved = size - index - 1;
        if(numMoved > 0) System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        elementData[--size] = null;
    }

    public void clear(){
        modCount++;
        for(int i = 0; i < size; i++) elementData[i] = null;
        size = 0;
    }

    public boolean addAll(Collection<? extends E> c){
        Object[] a = c.toArray();
        int numNew = a.length;
        ensureCapacity(size + numNew);
        System.arraycopy(a, 0, elementData, size, numNew);
        size = size + numNew;
        return numNew != 0;
    }

    public boolean addAll(Collection<? extends E> c){
        if(index > size || index < 0) throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        Object[] a = c.toArray();
        int numNew = a.length;
        ensureCapacity(size + numNew);

        int numMoved = size - index;
        if(numMoved > 0) System.arraycopy(elementData, index, elementData, index + numNew, numMoved);
        System.arraycopy(a, 0, elementData, index, numNew);
        return numNew != 0;
    }
    
    protected void removeRange(int fromIndex, int toIndex){
        modCount++;
        int numMoved = size - toIndex;
        System.arraycopy(elementData, toIndex, elementData, fromIndex, numMoved);

        int newSize = size - (toIndex - fromIndex);
        while(size != newSize) elementData[--size] = null;
    }

    private void RangeCheck(int index){
        if(index >= size) throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    public Object clone(){
        try{
            ArrayList<E> v = (ArrayList<E>) super.clone();
            v.elementData = Arrays.copyOf(elementData, size);
            v.modCount = 0;
            return v;
        }catch(CloneNotSupportedException e){
            throw new InternalError();
        }
    }
}
