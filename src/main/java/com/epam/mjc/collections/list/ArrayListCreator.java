package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> response = new ArrayList<>();
        for (int i = 2; i < sourceList.size(); i = i+3) {
            response.add(sourceList.get(i));
            response.add(sourceList.get(i));
        }
        return response;
    }
}
