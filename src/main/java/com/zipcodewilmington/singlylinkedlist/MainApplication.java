package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        //Given
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        Integer expectedData = 96;
        Integer expectedIndex = 3;

        //When
        list.add(16);
        list.add(29);
        list.add(34);
        list.add(568);
        list.add(103);
        list.insert(expectedData, expectedIndex);

        list.print();
    }
}
