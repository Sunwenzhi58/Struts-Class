package example.struts2;

import java.util.Comparator;

public class SortComparator implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {
        return obj1.toString().compareTo(obj2.toString());
    }
}
