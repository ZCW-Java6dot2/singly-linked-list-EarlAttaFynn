package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {

    private Node<T> head;
    private static int size = 0;

    //Constructor
    public <T> SinglyLinkedList() {
    }

    //Methods
    public void add(T data) {
        //Create new node with passed data
        Node<T> newNode = new Node (data);

         //If list is empty it's set as Head.
        if (head == null) {
            head = newNode;
        }
        else {
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

    public boolean remove(T data) {

        return true;
    }

    public boolean contains(T data) {
        Node<T> current = head;

        for (int i = 0; i < size(); i++) {
            if(current.data.equals(data)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int find(T data) {
        Node<T> current = head;

        for (int i = 0; i < size(); i++) {
            if(current.data.equals(data)){
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    public int size() {
        return size;
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
        Node<T> newNode = new Node (data);
        Node<T> current = head;

        //Iterate to index location or last
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        //Insert new node by giving it the current nodes next reference
        //and setting the current nodes next reference to the newNode.
        newNode.next = current.next;
        current.next = newNode;

        //Increment listCount
        incrementListCount();
    }

    public SinglyLinkedList<T> copy(SinglyLinkedList<T> list) {
        return (SinglyLinkedList<T>) null;
    }

    public SinglyLinkedList<T> sort(SinglyLinkedList<T> list) {
        return (SinglyLinkedList<T>) null;
    }

    public SinglyLinkedList<T> reverse(SinglyLinkedList<T> list) {
        return (SinglyLinkedList<T>) null;
    }

    public SinglyLinkedList<T> slice(SinglyLinkedList<T> list, int start, int stop) {
        return (SinglyLinkedList<T>) null;
    }

    //Getters and Setters
    public Node<T> getHead() {
        return head;
    }

    public static int getSize() {
        return size;
    }

    public void setHead(Node<T> data) {
        this.head = data;
    }

    public void incrementListCount() {
        size++;
    }

    public void decrementListCount() {
        size--;
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


