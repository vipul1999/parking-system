package com.parking.system.LRUCacheDesign;

import java.util.*;

public class LRUCacheDesignByDoublyLinkedList {
    //LRU Cache implementation by doubly linked list
    private class Node{
        int key;
        int value;
        Node prev;
        Node next;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    };
    private final int capacity;
    private final Map<Integer,Node> map;
    private final Node head;
    private final Node tail;

    private LRUCacheDesignByDoublyLinkedList(int capacity){
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head = new Node(0,0);
        this.tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }
    public void removeNode(Node node){
        //remove from linked list
        Node prevNode = node.prev;
        Node nextNode = node.next;
        //at both end special node is there
        //so prevNode and nextNode won't be null
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        map.remove(node);
    }
    public void addNode(Node node){
        map.put(node.key,node);
        Node nextNode = head.next;
        nextNode.prev = node;
        node.next = nextNode;
        node.prev = head;
        head.next = node;
    }
    public void insert(int key, int value){
        if(map.size()==capacity){
            removeNode(tail.prev);
        }
        else if(map.containsKey(key)){
            removeNode(map.get(key));
        }
        Node node = new Node(key,value);
        addNode(node);
    }

    public int   readByKey(int key){
        //if it does not exist do nothing
        if(!map.containsKey(key)){
            return -1;
        }
        else {
            //remove from its existing position
            //add at the head position
            Node node = map.get(key);
            removeNode(node);
            addNode(node);
            return node.value;
        }
    }


    public void processRequest(String operation,int key, int value){

        if(operation.equalsIgnoreCase("read")){
            //remove wherever it is
            System.out.println(readByKey(key));
        } else if(operation.equalsIgnoreCase("insert")){
            insert(key,value);
        } else {
            System.out.println("Operation not supported");
        }
        printLL();
    }
    public void printLL(){
        Node temp = head;
        List<List<Integer>> list = new ArrayList<>();

        while(temp!=null){
            List<Integer> tempList = new ArrayList<>();
            tempList.add(temp.key);
            tempList.add(temp.value);
            list.add(tempList);
            temp = temp.next;
        }
        System.out.println(map.size());
        System.out.println(list.toString());
    }

    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        LRUCacheDesignByDoublyLinkedList lruCacheDesignByDoublyLinkedList = new LRUCacheDesignByDoublyLinkedList(5);
        while(true){
            System.out.print("Operation type: ");
            String operation = scanner.next();
            if(operation.equals("exit")){
                break;
            }
            else if(operation.equalsIgnoreCase("read")){
                System.out.print("key: ");
                int key = Integer.parseInt(scanner.next());
                System.out.println(lruCacheDesignByDoublyLinkedList.readByKey(key));
            }
            else if(operation.equalsIgnoreCase("insert")){
                System.out.print("key: ");
                int key = Integer.parseInt(scanner.next());
                System.out.print("value: ");
                int value = Integer.parseInt(scanner.next());
                lruCacheDesignByDoublyLinkedList.insert(key,value);
            } else {
                System.out.println("Operation not supported");
            }
            lruCacheDesignByDoublyLinkedList.printLL();

        }
    }



}
