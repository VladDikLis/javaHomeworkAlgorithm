package ru.otus.java.homework.list;

import java.util.LinkedList;
import java.util.List;

public class MyStack {
    public List<Integer> list;

    public MyStack() {
        list = new LinkedList<>();
    }

    public void push(int data) {
        list.add(0, data);
        System.out.println("Элемент добавлен в стек: " + list);
    }

    public Integer pop() {
        Integer a = list.get(0);
        list.remove(0);
        System.out.println("Взяли элемент из стека. Стек на текущий момент: " + list);
        return a;
    }


}
