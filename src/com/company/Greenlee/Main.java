package com.company.Greenlee;

// Trenton Greenlee.
// 4/1/2020.
// Exercise 12.

public class Main {
    public static void main(String[] args) {
        Queue<String> strings = new Queue<>(2);
        try {
            strings.enqueue("World");
            strings.enqueue("Hello");
            System.out.println(strings.dequeue());
            System.out.println(strings.dequeue());
        } catch (QueueFullException | QueueEmptyException e) {
            e.printStackTrace();
        }
    }
}