package com.niit.current;

class currentExample extends Thread{  
	 public void run(){  
	  System.out.println(Thread.currentThread().getName());  
	 }  
	 
	 public static void main(String args[]){  
		 currentExample t1=new currentExample();  
		 currentExample t2=new currentExample();  
	  
	  t1.start();  
	  t2.start();  
	 }  
	}  