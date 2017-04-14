package java.lang;

import java.io.Serializable;

public class StringBuilder implements Serializable, CharSequence, Appendable{

    private static final long serialVersionUID;

    int count;

    char[] value;

    private static final int DEFAULT_CAPACITY = 16;

    public StringBuilder(){
        this(DEFAULT_CAPACITY);
    }

    public StringBuilder(int capacity){
        value = new char[capacity];
    }

    public StringBuilder(String str){
        count = str.count;
        value = new char[count + DEFAULT_CAPACITY];
        str.getChars(0, count, value, 0);
    }

    public StringBuilder(CharSequence seq){
        int len = seq.length();
        count = len <=0 ? 0 : len;
        value = new char[DEFAULT_CAPACITY + count];
        for(int i = 0; i < len; i++) value[i] = seq.charAt(i);
    }

    public int length(){return count;}

    public int capacity(){return value.length;}

    public void ensureCapacity(int minCapacity){
        if(minCapacity > value.length){
            int max = value.length * 2 + 2;
            minCapacity = minCapacity < max ? max : minCapacity;
            char[] nb = new char[minCapacity];
            VMSystem.arraycopy(value, 0, nb, 0, count);
            value = nb;
        }
    }

    public char charAt(int index){
        if(index < 0 || index >= count) throw new StringIndexOutOfBoundsException(index);
        return value[index];
    }

    public void setChar(int index, char ch){
        if(index < 0 || index >= count) throw new StringIndexOutOfBoundsException(index);
        value[index] = ch;
    }

    public StringBuilder append(Object o){
        return append(o == null ? null : o.toString());
    }

    public StringBuilder append(String str){
        if(str == null) str = "null";
        int len = str.count;
        ensureCapacity(len + count);
        str.getChars(0, len, value, count);
        count = count + len;
        return this;
    }

    public StringBuilder delete(int start, int end){
        if(start < 0 || start > count || start > end) throw new StringIndexOutOfBoundsException(start);
        if(end > count) end = count;
        ensureCapacity(count);
        if(count - end != 0) VMSystem.arraycopy(value, end, value, start, count - end);
        count -= end - start;
        return this;
    }

    public String substring(int beginIndex, int endIndex){
        int len = endIndex - beginIndex;
        if (beginIndex < 0 || endIndex > count || endIndex < beginIndex) throw new StringIndexOutOfBoundsException();
        if(len == 0) return "";
        return new String(value, beginIndex, len);
    }

    public synchronized StringBuilder insert(int offset, CharSequence sequence, int start, int end){
        if(sequence == null) sequence = "null";
        if (start < 0 || end < 0 || start > end || end > sequence.length()) throw new StringIndexOutOfBoundsException();
        int len = end - start;
        ensureCapacity(count + len);
        VMSystem.arraycopy(value, offset, value, offset + len, count - offset);
        for(int i = start; i < end; i++) value[offset++] = sequence.charAt(i);
        count += len;
        return this;
    }

    public int indexOf(String str, int fromIndex){
        if(fromIndex < 0) fromIndex = 0;
        int limit = count - str.count;
        for(; fromIndex <= limit; fromIndex++){
            if(regionMatches(fromIndex, str)) return fromIndex;
        }
        return -1;
    }

    public int lastIndexOf(String str, int fromIndex){
        fromIndex = Math.min(fromIndex, count - str.count);
        for(; fromIndex >= 0; fromIndex--){
            if(regionMatches(fromIndex, str)) return fromIndex;
        }
        return -1;
    }

    public StringBuilder reverse(){
        ensureCapacity(count);
        for(int i = count >> 1, j = count - i; --i >= 0; ++j){
            char c = value[i];
            value[i] = value[j];
            value[j] = c;
        }
        return this;
    }
}