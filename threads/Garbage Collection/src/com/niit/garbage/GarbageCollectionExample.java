package com.niit.garbage;

public class GarbageCollectionExample{  
	 public void finalize(){
		 System.out.println("object is garbage collected");
		 }  
	 public static void main(String args[]){  
	  GarbageCollectionExample s1=new GarbageCollectionExample();  
	  GarbageCollectionExample s2=new GarbageCollectionExample();  
	  s1=null;  
	  s2=null;  
	  System.gc();  
	 }  
	}  