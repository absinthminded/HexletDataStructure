package m04e0;

import java.util.*;

public class HashSet<T> implements Set<T> {

    private static final Boolean EXIST = true;

    private final Map<T, Boolean> elements = new HashMap<>();

    @Override
    public int size() {
        // BEGIN (write your solution here)
        return elements.size();
        // END
    }

    @Override
    public boolean isEmpty() {
        // BEGIN (write your solution here)
        return elements.isEmpty();
        // END
    }

    @Override
    public boolean contains(Object o) {
        // BEGIN (write your solution here)
        return elements.containsKey(o);

        // END
    }

    @Override
    public Iterator<T> iterator() {
        // BEGIN (write your solution here)
        return elements.keySet().iterator();
        // END
    }

    @Override
    public Object[] toArray() {
        // BEGIN (write your solution here)
        return elements.keySet().toArray();
        // END
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        // BEGIN (write your solution here)
        //return (T1[])toArray();
        return elements.keySet().toArray(a);
        // END
    }

    @Override
    public boolean add(T t) {
        // BEGIN (write your solution here)
        elements.put(t, EXIST) ;
        return true;
        // END
    }

    @Override
    public boolean remove(Object o) {
        // BEGIN (write your solution here)
        elements.remove(o);
        return true;
        // END
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // BEGIN (write your solution here)
        for (Object element : c)
            if (!contains(element)) return false;
        return true;
        // END
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        // BEGIN (write your solution here)
       /*c.forEach(this::add);
        return true;*/

        for (T o : c)
            add(o);
        return true;
        // END
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        // BEGIN (write your solution here)
        for (Object o : c)
            remove(o);
        return true;
        // END
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // BEGIN (write your solution here)
        for (Object o : this)
            if (!c.contains(o))
                remove(o);
        return true;
        // END
    }

    @Override
    public void clear() {
        // BEGIN (write your solution here)
        elements.clear();
        // END
    }
}
