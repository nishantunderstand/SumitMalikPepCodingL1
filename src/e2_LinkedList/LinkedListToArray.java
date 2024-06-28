package e2_LinkedList;

import java.util.*;

public class LinkedListToArray {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(99);
        linkedList.add(20);
        linkedList.add(50);

        // Convert LinkedList to Array
        Integer[] array = new Integer[linkedList.size()];
        int index = 0;
        for (Integer item : linkedList) {
            array[index++] = item;
        }

        // Print the Array elements
        System.out.println("Array elements:");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
