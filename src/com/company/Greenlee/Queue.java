package com.company.Greenlee;

public class Queue<E> {
    private E[] elements;
    private int index = 0;
    private int size;

    Queue(int size) {
        elements = (E[]) new Object[size];
        this.size = size;
    }

    void enqueue(E element) throws QueueFullException {
        if (index >= size) {
            throw new QueueFullException();
        }

        elements[index] = element;
        index++;
    }

    E dequeue() throws QueueEmptyException {
        if (index == 0) {
            throw new QueueEmptyException();
        }

        E returnElement = elements[size - index];
        index--;
        return returnElement;
    }
}
