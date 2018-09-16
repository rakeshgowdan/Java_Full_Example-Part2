package com.niit.thread;

class implementsExample implements Runnable{  
public void run(){  
System.out.println("thread is running...-runnable interface achieved");  
}  
  
public static void main(String args[]){  
	implementsExample m1=new implementsExample();  
Thread t1 =new Thread(m1);  
t1.start();  
 }  
}
/*If you are not extending the Thread class,
 * your class object would not be treated as a thread object
 * So you need to explicitely create Thread class object.
 * We are passing the object of your class that implements Runnable so that your class
 *  run() method may execute.
 */
