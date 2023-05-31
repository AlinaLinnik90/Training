package demo;


import java.util.Arrays;

public class MyLinkedList {
    public static final int DEFAULT_INITIAL_CAPACITY = 10;
    int index;
    Node[] nodes;

    /* Конструктор без аргументів */
    public MyLinkedList() {

        nodes = new Node[DEFAULT_INITIAL_CAPACITY];

    }

    /* Додати елемент в кінець списку */

    public void add(Integer data) {
        //check nodes size
        if (index == nodes.length) {
            nodes = Arrays.copyOf(nodes, (int) (nodes.length * 1.5));

        }

        //current node
        Node node = new Node();

        //set current node data
        node.setData(data);
        nodes[index] = node;

        if (index > 0) {
            //set link

            nodes[index - 1].setNext(nodes[index]);
        }
        nodes[index].setNext(null);


        //save current Node in Array


        //increment pointer
        index++;
    }

    /* Отримати елемент по індексу, повертає null якщо такий елемент недоступний */
    public Integer get(int index) {
        if (index < size() & index > 0) {
            return nodes[index].getData();
        } else {
            return null;
        }
    }

    /* Вилучення елементу за індексом, повертає true у разі успіху або false в іншому випадку */
    public boolean delete(int index) {
        if (index > 0 & index < size()) {
            nodes[index - 1].setNext(nodes[index + 1]);
            nodes[index].setData(null);
            nodes[index].setNext(null);
        } else {
            return false;
        }
        ;
        if (nodes[index].getData() == null) {
            return true;
        }
        return false;
    }

    /*Поверта розмір списку: якщо елементів в списку нема то повертає 0 (нуль)*/
    public int size() {
        if (this.index < 0) {

            return Integer.parseInt(null);
        } else {
            return this.index;
        }
    }
}

