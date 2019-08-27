package com.grazi.data_structures;

import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.UnaryOperator;
import java.lang.IndexOutOfBoundsException;

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
    private SinglyNode head;
    private int size;
    public SinglyLinkedList() {
        head = new EmptyNode();
        
    }

    @Override
    public boolean add(T t) {
        if (head.isEmpty()) {
            SinglyNode nextNode = new EmptyNode();
            head = new FullNode(t, nextNode);
        } else {
            SinglyNode emptyNode = new EmptyNode();
            SinglyNode nextNode = new FullNode(t, emptyNode);

            SinglyNode lastNode = findLastNode();
            lastNode.setNextNode(nextNode);
        }
        ++this.size;
        return true;
    }

    private SinglyNode findLastNode() {
        SinglyNode currentNode = head;
        SinglyNode nextNode = currentNode.getNextNode();
        while (!nextNode.isEmpty()) {
            currentNode = nextNode;
            nextNode = currentNode.getNextNode();
        }
        return currentNode;
    }

    @Override
    public void add(int index, T t) {
        System.out.println("hi");
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return true;
    }

    @Override
    public void clear() {
        System.out.println("hi");
    }

    @Override
    public boolean contains(Object o) {
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public T get(int index) {
        SinglyNode<T> node = this.getNode(index);
        return node.getValue();
    }

    private SinglyNode getNode(int index) {
        SinglyNode retrievedNode = new EmptyNode();
        if (index < 0 || this.size() <= index) {
            StringBuilder message = new StringBuilder("Index (");
            message.append(index);
            message.append(") is less than 0");
            message.append("or greater than the size of this LinkedList (");
            message.append(this.size());
            message.append(")");
            throw new IndexOutOfBoundsException(message.toString());
        } else {
            int count = 0;
            SinglyNode currentNode = head;
            SinglyNode nextNode = currentNode.getNextNode();
            while (count < index) {
                currentNode = nextNode;
                nextNode = currentNode.getNextNode();
                ++count;
            }
            retrievedNode = currentNode;
        }
        return retrievedNode;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }


    @Override
    public Iterator<T> iterator() {
        Iterator<T> empty = null;
        return empty;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        ListIterator<T> empty = null;
        return empty;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        ListIterator<T> empty = null;
        return empty;
    }

    @Override
    public T remove(int index) {
        T empty = null;
        return empty;
    }

    @Override
    public boolean remove(Object o) {
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> o) {
        return true;
    }

    @Override
    public void replaceAll(UnaryOperator<T> o) {
        System.out.println("hi");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return true; 
    }

    @Override
    public T set(int index, T elemnt) {
        T empty = null;
        return empty;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void sort(Comparator c) {
        System.out.println("hi");
    }

    @Override
    public Spliterator<T> spliterator() {
        Spliterator<T> empty = null;
        return empty;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        List<T> empty = null;
        return empty;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return a;
    }

    //inner class for node/element used in SinglyLinkedList
    private class FullNode implements SinglyNode {
        private T value;
        private SinglyNode nextNode;

        public FullNode(T value, SinglyNode nextNode) {
            this.value = value;
            this.nextNode = nextNode;
        }

        public void setNextNode(SinglyNode node) {
            this.nextNode = node;
        }

        public SinglyNode getNextNode() {
            return this.nextNode;
        }
        
        public T getValue() {
            return this.value;
        }

        public boolean isEmpty() {
            return false;
        }

    }

    private class EmptyNode implements SinglyNode {

        public void setNextNode(SinglyNode node) {

        }

        public SinglyNode getNextNode() {
            return null;
        }
        
        public T getValue() {
            return null;
        }

        public boolean isEmpty() {
            return true;
        }

    }

}
