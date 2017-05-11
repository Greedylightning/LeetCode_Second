import java.util.NoSuchElementException;

class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, java.io.serializable{


    private static class Entry<E>{
        E element;
        Entry<E> next;
        Entry<E> previous;
    }
    
    private transient Entry<E> header = new Entry<E>(null, null, null);
    private transient int size = 0;

    public LinkedList(){
        header.next = header.previous = header;
    }

    public E getFirst(){
        if(size == 0) throw new NoSuchElementException();
        return header.next.element;
    }

    public E getLast(){
        if(size == 0) throw new NoSuchElementException();
        return header.previous.element;
    }

    public E removeFirst(){return remove(header.next);}

    public E removeLast(){return remove(header.previous);}

    public void addFirst(E e){addBefore(e, header.next);}

    public void addLast(E e){addBefore(e, header);}

    public boolean contains(Object o){return indexOf(o) != -1;}

    public boolean remove(Object o){
        if(o == null){
            for(Entry<E> e = header.next; e != header; e = e.next){
                if(e.element == null){
                    remove(e);
                    return true;
                }
            }
        }
        else{
            for(Entry<E> e = header.next; e != header; e = e.next){
                if(o.equals(e.element)){
                    remove(e);
                    return true;
                }
            }
        }
        return false;
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

    private Entry<E> addBefore(E e, Entry<E> entry){
        Entry<E> newEntry = new Entry<E>(e, entry, entry.previous);
        newEntry.previous.next = newEntry;
        newEntry.next.previous = newEntry;
        size++;
        modCount++;
        return newEntry;
    }

    private E remove(Entry<E> e){
        if(e == header) throw new NoSuchElementException();

        E result = e.element;
        e.previous.next = e.next;
        e.next.previous = e.previous;
        e.next = e.previous = null;
        e.element = null;
        size--;
        modCount++;
        return result;
    }
}