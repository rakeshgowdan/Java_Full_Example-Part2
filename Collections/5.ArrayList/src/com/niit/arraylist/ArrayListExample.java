package com.niit.arraylist;

import java.util.ArrayList;
import java.util.List;

class Book {  
int id;  
String name,author,publisher;  
int quantity;  
public Book(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}  
public class ArrayListExample {  
public static void main(String[] args) {  
    //Creating list of Books  
    List<Book> list=new ArrayList<Book>();  
    //Creating Books  
    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
    //Adding Books to list  
    list.add(b1);  
    list.add(b2);  
    list.add(b3);  
    //Traversing list  
    for(Book b:list){  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  
}  
/*Here we can see example for basic ArrayList operations like creating object for ArrayList, 
 * adding objects into ArrayList, accessing objects based on index, 
 * searching an object in ArrayList whether it is listed under this instance or not, 
 * adding elements at specific index, checking whether the ArrayList is empty or not, 
 * getting object index, and finally size of the ArrayList.
 */