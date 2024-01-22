package ru.otus.java.homework.list;

import java.util.LinkedList;
import java.util.List;

public class MyQueue {
    public List<Integer> list;

    public MyQueue() {
        list = new LinkedList<>();
    }

    public void offer(int data) {
        list.add(0, data);
        System.out.println("Элемент добавлен в очередь: " + list);
    }

    public Integer poll() {
        Integer a = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        System.out.println("Взяли элемент из очереди. Очередь на текущий момент: " + list);
        return a;
    }


}
