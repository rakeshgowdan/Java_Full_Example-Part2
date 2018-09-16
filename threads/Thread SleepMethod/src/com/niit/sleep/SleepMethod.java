package com.niit.sleep;

class SleepMethod extends Thread{  
	 public void run(){  
	  for(int i=1;i<=10;i++){  
	    try{
	    	Thread.sleep(500);
	    	}
	    catch(InterruptedException e)
	    {
	    	System.out.println(e);
	    	}  
	    System.out.println(i);  
	  }  
	 }  
	 public static void main(String args[]){  
		 SleepMethod  t1=new SleepMethod ();  
		 SleepMethod  t2=new SleepMethod ();  
	   
	  t1.start();  
	  t2.start();  
	 }  
	}  
/*As you know well that at a time only one thread is executed.
 *  If you sleep a thread for the specified time,the thread shedular picks up another 
 *  thread and so on.
 */