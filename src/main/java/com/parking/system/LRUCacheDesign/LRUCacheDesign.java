package com.parking.system.LRUCacheDesign;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class LRUCacheDesign {
    // n = 3
    // insert 1
    // insert 2
    // insert 3
    //read 2
    // insert
    static Deque<Integer> deque = new LinkedList<>();
    static int max_size = 3;

    public static void processRequest(String operation, int value){
        //to improve remove operation we need to put a hashmap here
        if(operation.equalsIgnoreCase("read")){
            //remove wherever it is
            deque.remove(value);
            //add to the front
            deque.addFirst(value);
        } else if(operation.equalsIgnoreCase("insert")){
            if(deque.size()==max_size){
                deque.removeLast();
            }
            deque.addFirst(value);
        }
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Operation type and Value ");
            String operation = scanner.next();
            if(operation.equals("exit")){
                break;
            }
            int value = Integer.parseInt(scanner.next());
            //exception handling due here
            System.out.println("Operation: "+operation+" Value: "+value);
            processRequest(operation, value);
            System.out.println("After processing Deque is: "+ deque.toString());
        }


    }



}
