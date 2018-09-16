package com.niit.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
	public static void main(String a[]){
        
        List<String> myList = new ArrayList<String>();
        myList.add("Java");
        myList.add("Unix");
        myList.add("Oracle");
        myList.add("C++");
        myList.add("Perl");
        Iterator<String> itr = myList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
/*Description:
You can iterate through any collection object by using Iterator object. 
It provides two methods to iterate.
 The hasNext() method returns true if the iteration has more elements.
  The next() method returns the next element in the iteration. 
Below example shows how to iterate through an ArrayList.*/