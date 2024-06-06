package org.example;

import java.util.ArrayList;
import java.util.List;

public class WorkintechList<T> {
    private final List<T> list;

    public WorkintechList() {
        this.list = new ArrayList<>();
    }


    public void add(T element) {
        if (!list.contains(element)) {
            list.add(element);
        }
    }


    public void sort() {
        list.sort((a, b) -> {
            if (a instanceof String && b instanceof String) {
                return ((String) a).compareToIgnoreCase((String) b);
            }

            return 0;
        });
    }

    public void remove(T element) {
        boolean removed = list.remove(element);
        if (removed) {
            sort();
        }
    }


    @Override
    public String toString() {
        return list.toString();
    }
}