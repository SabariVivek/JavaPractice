package collection_framework;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetConcept {

    public static void main(String[] args) {

        Set set = new LinkedHashSet();

        // Adding an element to a set...
        set.add("Sabari");
        set.add(12);
        set.add(156.87);
        set.add(true);
        set.add('t');
        System.out.println(set);
    }
}