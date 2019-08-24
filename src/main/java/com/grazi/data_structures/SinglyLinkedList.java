package com.grazi.data_structures;

import java.util.List;
import java.util.ListIterator;

/**
 * A linked list is a linear data structure 
 * (one has to traverse the data structure linearly) where each element
 * is a separte object.
 * Each element contains the elements value as well as a reference to the
 * next element.
 * The last element has a reference to null.
 * The entry point into a linked list is called the head (a reference to the first
 * element in the linked list.
 * If the element is empty, the the head is a null reference.
 * 
 * The number of elements in a list is not constant and can grow and shrink 
 * on demand, which makes it a dynamic data structure.
 *
 * A disadvantage of a linked list is that it does not allow direct access to  
 * the individual elements in the list. If you want access tot a particular
 * item, you have to start at the head and follow the references until 
 * you get to that item.
 *
 * Another disadvantage of a linked list is that it uses more memory 
 * when compared with an array (need more bytes to store a reference to 
 * the next element.
 * 
 * This implementation follows a singly-linkedlist. 
 * 
 */
public class SinglyLinkedList<T> implements List<T> {
    public SinglyLinkedList() {
        System.out.println("hi");
    }

    @Override
    public boolean add(T t) {
        return true;
    }


    @Override
    public List subList(int indexInclude, int indexExclude) {
        return new SinglyLinkedList();
    }

    @Override
    public ListIterator listIterator() {
    }

    
}
