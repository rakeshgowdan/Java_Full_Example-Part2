package com.niit.extend;

class ExtendsExample extends Thread{  
public void run(){  
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
	ExtendsExample  t1=new ExtendsExample ();  
  t1.start();  
 }  
}  