package java.util;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.NoSuchElementException;

public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, java.io.Serializable{
    
    private transient Entry<E> header = new Entry<E>(null, null, null);
    private transient int size = 0;


    private static class Entry<E>{
        E element;
        Entry<E> next;
        Entry<E> previous;

        Entry(E element, Entry<E> next, Entry<E> previous){
            this.element = element;
            this.next = next;
            this.previous = previous;
        }
    }
    public LinkedList(){
        header.next = header.previous = header;
    }

    public LinkedList(Collection<? extends E> c){
        this();
        addAll(c);
    }

    public E getFirst(){
        if(size == 0) throw new NoSuchElementException();
        return header.next.element;
    }

    public E getLast(){
        if(size == 0) throw new NoSuchElementException();
        return header.previous.element;
    }

    public E removeLast(){
        return remove(header.previous);
    }

    public E removeFirst(){
        return remove(header.next);
    }

    public void addFirst(E e){
        addBefore(e, header.next);
    }

    public void addLast(E e){
        addBefore(e, header);
    }

    public boolean addAll(Collection<? extends E> c){
        return addAll(size, c);
    }

    public boolean addAll(int index, Collection<? extends E> c){
        if(index < 0 || index > size) throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        Object[] a = c.toArray();
        int numNew = a.length;

        if(numNew == 0) return false;
        modCount++;
        Entry<E> successor = (index == size ? header : entry(index));
        Entry<E> predecessor = successor.previous;
        for(int i = 0; i < numNew; i++){
            Entry<E> e = new Entry<E>((E)a[i], successor, predecessor);
            predecessor.next = e;
            predecessor = e;
        }
        successor.previous = predecessor;
        size = size + numNew;
        return true;
    }

    public boolean add(E e){
        addBefore(e, header);
        return true;
    }

    private Entry<E> addBefore(E e, Entry<E> entry){
        Entry<E> newEntry = new Entry<E>(e, entry, entry.previous);
        newEntry.previous.next = newEntry;
        newEntry.next.previous = newEntry;
        size++;
        modCount++;
        return newEntry;
    }

    public void clear(){
        Entry<E> e = header.next;
        while(e != header){
            Entry<E> next = e.next;
            e.next = e.previous = null;
            e.element = null;
            e = next;
        }
        header.next = header.previous = header;
        size = 0;
        modCount++;
    }

    public boolean contains(Object o){
        return indexOf(o) != -1;
    }

    public int indexOf(Object o){
        int index = 0;
        if(o == null){
            for(Entry e = header.next; e != header; e = e.next){
                if(e.element == null) return index;
                index++;
            }
        }
        else{
            for(Entry e = header.next; e != header; e = e.next){
                if(o.equals(e.element)) return index;
                index++;
            }
        }
        return -1;
    }

    public E get(int index) {
        return entry(index).element;
    }

    public E set(int index, E element){
        Entry<E> e = entry(index);
        E oldValue = e.element;
        e.element = element;
        return oldValue;
    }

    private Entry<E> entry(int index){
        if(index < 0 || index > size) throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        Entry<E> e = header;

        if(index < (size >> 1)){
            for(int i = 0; i <= index; i++) e = e.next;
        }
        else{
            for(int i = size; i > index; i --) e = e.previous;
        }
        return e;
    }
}