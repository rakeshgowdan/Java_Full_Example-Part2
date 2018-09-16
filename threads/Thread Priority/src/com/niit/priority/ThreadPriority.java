package com.niit.priority;

class ThreadPriority extends Thread{  
	 public void run(){  
	   System.out.println("running thread name is:"+Thread.currentThread().getName());  
	   System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
	  
	  }  
	 public static void main(String args[]){  
		 ThreadPriority t1=new ThreadPriority();  
		 ThreadPriority t2=new ThreadPriority();  
	  t1.setPriority(Thread.MIN_PRIORITY);  
	  t2.setPriority(Thread.MAX_PRIORITY);  
	  t1.start();  
	  t2.start();  
	   
	 }  
	}   