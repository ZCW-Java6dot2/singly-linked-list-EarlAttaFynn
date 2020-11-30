package com.zipcodewilmington.singlylinkedlist;

import java.util.ArrayList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {

    private Node<T> head;
    private int size;

    //Constructor
    public <T> SinglyLinkedList() {
        this.size = 0;
    }

    //Methods
    public void add(T data) {
        //Create new node with passed data
        Node<T> newNode = new Node<>(data);

        //If list is empty it's set as Head.
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;

            //Iterate to end of list
            while (current.next != null) {
                current = current.next;

            }

            //Set last node's next reference to new node
            current.next = newNode;
        }
        //Increment listCount
        incrementListCount();
    }

    public void print() {
        Node<T> current = head;

        //Iterate to end of list
        for (int i = 0; i < size(); i++) {
            System.out.println(current.getData() + ", " + i);
            current = current.next;
        }
    }

    public boolean remove(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node<T> current = head;
            Node<T> currentPlus1 = null;
            //Iterate to index before given location or last
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            currentPlus1 = current.next;
            current.next = currentPlus1.next;
            currentPlus1 = null;
        }

        decrementListCount();
        return true;
    }

    public boolean contains(T data) {
        Node<T> current = head;

        for (int i = 0; i < size(); i++) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int find(T data) {
        Node<T> current = head;

        for (int i = 0; i < size(); i++) {
            if (current.data.equals(data)) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    public int size() {
        return this.size;
    }

    public T get(int index) {
        Node<T> current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    //Optional methods

    //Insert method taking index
    public void insert(T data, int index) {
        //Create new node with passed data
        Node<T> newNode = new Node<>(data);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> current = head;
            //Iterate to index before given location or last
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            //Insert new node by giving it the current nodes next reference
            //and setting the current nodes next reference to the newNode.
            newNode.next = current.next;
            current.next = newNode;
        }
        //Increment listCount
        incrementListCount();
    }

    public SinglyLinkedList<T> copy() {
        SinglyLinkedList<T> copy = new SinglyLinkedList<>();

        for (int i = 0; i < this.size(); i++) {
            copy.add(this.get(i));
        }
        return copy;
    }

    public SinglyLinkedList<T> sort(SinglyLinkedList<T> list) {
        return (SinglyLinkedList<T>) null;
    }

    //Not finished
    public void reverse() {
//        ArrayList<T> reversed = new ArrayList<>();
//        SinglyLinkedList<T> newList = new SinglyLinkedList<>();
        Node<T> current = this.head;
        Node<T> prev = null;
        Node<T> next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        prev = this.head;

//        for (int i = 0; i < this.size(); i++) {
//            reversed.add(this.get(i));
//        }
//
//        for (int i = 0; i < reversed.size(); i++) {
//            newList.add(reversed.get(i));
//        }
//
//        return newList;

    }

    public SinglyLinkedList<T> slice(int start, int stop) {
        SinglyLinkedList<T> copy = new SinglyLinkedList<>();

        for (int i = start; i <= stop; i++) {
            copy.add(this.get(i));
        }
        return copy;
    }

    public void incrementListCount() {
        this.size++;
    }

    public void decrementListCount() {
        this.size--;
    }

    //Node inner class
    public static class Node<T> {

        private T data;
        private Node<T> next;

        //Constructors
        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public Node() {
            this.data = null;
            this.next = null;
        }

        //Getters and Setters
        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> nextNode) {
            this.next = nextNode;
        }

    }

}


