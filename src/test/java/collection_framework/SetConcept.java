package collection_framework;

import java.util.*;

public class SetConcept {

    public static void main(String[] args) {

        Set set = new HashSet();

        // Adding an element to a set...
        set.add("Sabari");
        set.add(12);
        set.add(156.87);
        set.add(true);
        set.add('t');
        System.out.println(set);

        Set newset = new HashSet();
        newset.add("Pavithra");
        newset.add("Tharani Priya");

        // Adding the whole set to the exisiting set...
        set.addAll(newset);
        System.out.println(set);

        // Removing an element...
        set.remove("Sabari");
        set.remove(2);
        set.removeAll(newset);
        System.out.println(set);

        // Size of an set...
        System.out.println(set.size());

        // Checking whether the element is available or not...
        System.out.println(set.contains('t'));
        System.out.println(set.contains('r'));
        System.out.println(set.containsAll(newset));

        // Deleting all the element from the set...
        newset.clear();
        System.out.println(newset);

        // To check whether the set is empty or not...
        System.out.println(set.isEmpty());
        System.out.println(newset.isEmpty());

        // Converting a set to array...
        Object[] arr = set.toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }

        // Iterating the value...
        for (Object obj : set) {
            System.out.println(obj);
        }

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}