package iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StationList<T>{
    protected List<T> list= new ArrayList<>();
    protected int index;

    public void add(Collection<T> collection){
        list.addAll(collection);
    }

    public boolean hasNext(){
        return index < list.size() - 1;
    }

    public T current() {
        return list.get(index);
    }

    public T next(){
        if (index < list.size()) {
            T el = list.get(index+1);
            index++;
            return el;
        } else {
            return null;
        }
    }
}
