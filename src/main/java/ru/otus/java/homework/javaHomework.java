package ru.otus.java.homework;

import ru.otus.java.homework.list.MyLinkedList;
import ru.otus.java.homework.list.MyQueue;
import ru.otus.java.homework.list.MyStack;

import java.util.List;

public class javaHomework {
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();
        System.out.println(myList.list);

        myList.addFirst(9999);
        myList.addLast(9999);
        myList.getFirst();
        myList.getLast();
        myList.add(2, 9999);
        myList.remove(2);
        myList.get(2);
        myList.getSize();
        System.out.println();

        MyQueue myQueueList = new MyQueue();
        myQueueList.offer(1);
        myQueueList.offer(5);
        myQueueList.offer(3);
        Integer a = myQueueList.poll();
        System.out.println("Взятый элемент: " + a);
        System.out.println();

        MyStack myStackList = new MyStack();
        myStackList.push(1);
        myStackList.push(5);
        myStackList.push(3);
        Integer b = myStackList.pop();
        System.out.println("Взятый элемент: " + b);
        System.out.println();

        sort(myList.list);

    }

    public static void sort(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    Integer x = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j + 1, x);
                }
            }
        }
        System.out.println("Итоговый лист после сортировки:");
        System.out.println(list);
    }
}
