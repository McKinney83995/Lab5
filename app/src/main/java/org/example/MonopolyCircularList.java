package org.example;

import java.util.Random;

public class MonopolyCircularList<E> {

    private Node<E> tail; // tail var private
    private int size = 0; // number of nodes in list

    // constructor? -- use values from list -- everyone starts at go?
    MonopolyCircularList() {
        this.append((E)"Go");
        this.append((E)"Mediterranean Avenue");
        this.append((E)"Community Chest");
        this.append((E)"Baltic Avenue");
        this.append((E)"Income Tax");
        this.append((E)"Reading Railroad");
        this.append((E)"Oriental Avenue");
        this.append((E)"Chance");
        this.append((E)"Vermont Avenue");
        this.append((E)"Connecticut Avenue");
        this.append((E)"Jail (Just Visiting)");
        this.append((E)"St. Charles Place");
        this.append((E)"Electric Company");
        this.append((E)"States Avenue");
        this.append((E)"Virginia Avenue");
        this.append((E)"Pennsylvania Railroad");
        this.append((E)"St. James Place");
        this.append((E)"Community Chest");
        this.append((E)"Tennessee Avenue");
        this.append((E)"New York Avenue");
        this.append((E)"Free Parking");
        this.append((E)"Kentucky Avenue");
        this.append((E)"Chance");
        this.append((E)"Indiana Avenue");
        this.append((E)"Illinois Avenue");
        this.append((E)"B&O Railroad");
        this.append((E)"Atlantic Avenue");
        this.append((E)"Ventnor Avenue");
        this.append((E)"Water Works");
        this.append((E)"Marvin Gardens");
        this.append((E)"Go to Jail");
        this.append((E)"Pacific Avenue");
        this.append((E)"North Carolina Avenue");
        this.append((E)"Community Chest");
        this.append((E)"Pennsylvania Avenue");
        this.append((E)"Short Line Railroad");
        this.append((E)"Chance");
        this.append((E)"Park Place");
        this.append((E)"Luxury Tax");
        this.append((E)"Boardwalk");
        return;

    }

    ///////////// nested node class/////////////////////
    private static class Node<E> {
        private E element; // private value of element -- space name
        private Node<E> next;

        public Node(E e, Node<E> n) { // constructor intializes with elt value and next
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }; // function to get element

        public Node<E> getNext() {
            return next;
        }; // function to get next

        public void setNext(Node<E> n) {
            next = n;
        }; // function to set next
    }
    ///////////////////////////////////////////

    public void append(E newElement) {
        Node<E> newNode = new Node<>(newElement, null);

        if (size == 0) {
            tail = newNode;
            newNode.setNext(newNode);
            size++;
            return;
        } else {
            newNode.setNext(tail.getNext());
            tail.setNext(newNode);
            tail = newNode;
        }

        size++;
    }

    public void step() {
        if (tail != null) {
            tail = tail.getNext();
        }
    }

    public E currentNode() {
        return tail.getNext().getElement();
    }// MIA DO I NEED TO ADD A CHECK TO MAKE SURE FOR NOT NULL

    public int getSize() {
        return size;
    }

    public void takeATurn() {
        Random roll = new Random();
        int dice1, dice2;

        dice1 = roll.nextInt(6) + 1;
        dice2 = roll.nextInt(6) + 1;
        System.out.println("You rolled a " + dice1 + " and a " + dice2);

        for (int i = dice1 + dice2; i > 0; i--) { // MIA GREATER THAN OR EQUAL TO?????
            step();
        }

        System.out.println("\nYou are on " + tail.next.getElement()+"\n");

        return;
    }

}