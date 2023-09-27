package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList,new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        Integer ai = Integer.valueOf(a);
        Integer bi = Integer.valueOf(b);
        if (ai*ai > bi*bi) {
            return 1;
        } else if (ai*ai < bi*bi){
            return -1;
        } else {
            if (ai > bi) {
                return 1;

            } else if (ai < bi) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
