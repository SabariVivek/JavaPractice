package collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListConcept {

    public static void main(String[] args) {

        List list = new ArrayList();

        // Adding an element to a list...
        list.add("Sabari");
        list.add(12);
        list.add(156.87);
        list.add(true);
        list.add('t');
        System.out.println(list);

        List newList = new ArrayList();
        newList.add("Pavithra");
        newList.add("Tharani Priya");

        // Adding the whole list to the exisiting list...
        list.addAll(newList);
        list.addAll(newList);
        System.out.println(list);

        // Removing an element...
        list.remove("Sabari");
        list.remove(2);
        list.removeAll(newList);
        System.out.println(list);

        // Size of an list...
        System.out.println(list.size());

        // Checking whether the element is available or not...
        System.out.println(list.contains('t'));
        System.out.println(list.contains('r'));
        System.out.println(list.containsAll(newList));

        // Deleting all the element from the list...
        newList.clear();
        System.out.println(newList);

        // To check whether the list is empty or not...
        System.out.println(list.isEmpty());
        System.out.println(newList.isEmpty());

        // Converting a list to array...
        Object[] arr = list.toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }

        // Adding an element with the index...
        list.add(1, "Vivek");
        System.out.println(list);

        // Getting an element from the list using index...
        System.out.println(list.get(2));

        // Setting an element in the list using index...
        list.set(1, "Pavithra");
        System.out.println(list);

        // Iterating the value...
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Object obj : list) {
            System.out.println(obj);
        }

        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}