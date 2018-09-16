package com.niit.method;
//example of java generic method to print array elements. We are using here E to denote the element.
public class GenericMethod {
	 public static < E > void printArray(E[] elements) {  
	        for ( E element : elements){          
	            System.out.println(element );  
	         }  
	         System.out.println();  
	    }  
	    public static void main( String args[] ) {  
	        Integer[] intArray = { 10, 20, 30, 40, 50 };  
	        Character[] charArray = { 'N', 'I', 'I', 'T', 'J','Y','N' };  
	  
	        System.out.println( "Printing Integer Array" );  
	        printArray( intArray  );   
	  
	       System.out.println( "Printing Character Array" );  
	        printArray( charArray );   
	    }   
	}  