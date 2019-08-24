package com.grazi.data_structures;

public interface SinglyNode<T> {
    boolean isEmpty();
    SinglyNode getNextNode();
    setNextNode(SinglyNode node);
    T getValue();
}
