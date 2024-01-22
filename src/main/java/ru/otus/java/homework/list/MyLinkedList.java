package ru.otus.java.homework.list;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
    public List<Integer> list;

    public MyLinkedList() {
        list = new LinkedList<>();
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(2);
        list.add(1);
        list.add(8);
        list.add(7);
        list.add(1);
        list.add(9);
        list.add(2);
    }

    public void addFirst(int data) {
        list.add(0, data);
        System.out.println("Вставка элемента в начало: " + list);
        list.remove(0);
    }

    public void addLast(int data) {
        list.add(list.size(), data);
        System.out.println("Вставка элемента в конец: " + list);
        list.remove(list.size() - 1);
    }

    public void getFirst() {
        System.out.println("Первый элемент: " + list.get(0));
    }

    public void getLast() {
        System.out.println("Последний элемент: " + list.get(list.size() - 1));
    }

    public void add(int position, int data) {
        list.add(position, data);
        System.out.println("Вставка элемента на позицию " + position + ": " + list);
        list.remove(position);
    }

    public void remove(int position) {
        Integer a = list.get(position);
        list.remove(position);
        System.out.println("Удаление элемента на позиции " + position + ": " + list);
        list.add(position, a);
    }

    public void get(int position) {
        System.out.println("Элемент на позиции " + position + ": " + list.get(position));
    }

    public void getSize() {
        System.out.println("Количество элементов в списке: " + list.size());
    }
}
