package com.zipcodewilmington.singlylinkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    //Given
    private SinglyLinkedList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new SinglyLinkedList<>();
    }

    @Test
    void add() {
        //When
        list.add(1);
        list.add(2);
        list.add(3);

        Assertions.assertEquals(3, list.size());
    }

    @Test
    void remove() {
        //When
        list.add(16);
        list.add(29);
        list.add(34);
        list.add(568);
        list.add(103);
        list.remove(1);

        //Then

    }

    @Test
    void contains() {
        //Given
        Integer expected = 55;

        //When
        list.add(16);
        list.add(29);
        list.add(34);
        list.add(expected);
        list.add(103);
        list.insert(96, 3);

        //Then
        Assertions.assertTrue(list.contains(expected));


    }

    @Test
    void find() {
        //Given
        Integer expectedData = 96;
        Integer expectedIndex = 3;

        //When
        list.add(16);
        list.add(29);
        list.add(34);
        list.add(568);
        list.add(103);
        list.insert(expectedData, expectedIndex);

        //Then
        Assertions.assertEquals(expectedIndex, list.find(expectedData));
    }

    @Test
    void size() {
        //Given
        Integer expectedSize = 5;

        //When
        list.add(16);
        list.add(29);
        list.add(34);
        list.add(568);
        list.add(103);


        //Then
        Assertions.assertEquals(expectedSize, list.size());
    }

    @Test
    void get() {
        //Given
        Integer expectedData = 96;
        Integer expectedIndex = 3;

        //When
        list.add(16);
        list.add(29);
        list.add(34);
        list.add(568);
        list.add(103);
        list.insert(expectedData, expectedIndex);

        //Then
        Assertions.assertEquals(expectedData, list.get(expectedIndex));
    }

    @Test
    void copy() {
    }

    @Test
    void sort() {
    }

    @Test
    void reverse() {
    }

    @Test
    void slice() {
    }
}
